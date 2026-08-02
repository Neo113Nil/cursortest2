package org.mp4parser;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.Arrays;
import java.util.List;
import org.mp4parser.tools.IsoTypeReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes10.dex */
public abstract class AbstractBoxParser implements BoxParser {
    private static Logger LOG = LoggerFactory.getLogger(AbstractBoxParser.class.getName());
    ThreadLocal<ByteBuffer> header = new ThreadLocal<ByteBuffer>() { // from class: org.mp4parser.AbstractBoxParser.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public ByteBuffer initialValue() {
            return ByteBuffer.allocate(32);
        }
    };
    private List<String> skippedTypes;

    public abstract ParsableBox createBox(String str, byte[] bArr, String str2);

    @Override // org.mp4parser.BoxParser
    public ParsableBox parseBox(ReadableByteChannel readableByteChannel, String str) throws IOException {
        long j;
        ParsableBox createBox;
        AbstractBoxParser abstractBoxParser = this;
        ReadableByteChannel readableByteChannel2 = readableByteChannel;
        abstractBoxParser.header.get().rewind().limit(8);
        int i = 0;
        while (true) {
            int read = readableByteChannel2.read(abstractBoxParser.header.get());
            i += read;
            if (i >= 8) {
                abstractBoxParser.header.get().rewind();
                long readUInt32 = IsoTypeReader.readUInt32(abstractBoxParser.header.get());
                byte[] bArr = null;
                if (readUInt32 < 8 && readUInt32 > 1) {
                    LOG.error("Plausibility check failed: size < 8 (size = {}). Stop parsing!", Long.valueOf(readUInt32));
                    return null;
                }
                String read4cc = IsoTypeReader.read4cc(abstractBoxParser.header.get());
                if (readUInt32 == 1) {
                    readableByteChannel2.read(abstractBoxParser.header.get());
                    j = IsoTypeReader.readUInt64(abstractBoxParser.header.get()) - 16;
                } else {
                    if (readUInt32 == 0) {
                        throw new RuntimeException("box size of zero means 'till end of file. That is not yet supported");
                    }
                    j = readUInt32 - 8;
                }
                if ("uuid".equals(read4cc)) {
                    readableByteChannel2.read(abstractBoxParser.header.get());
                    byte[] bArr2 = new byte[16];
                    for (int position = abstractBoxParser.header.get().position() - 16; position < abstractBoxParser.header.get().position(); position++) {
                        bArr2[position - (abstractBoxParser.header.get().position() - 16)] = abstractBoxParser.header.get().get(position);
                    }
                    j -= 16;
                    bArr = bArr2;
                }
                List<String> list = abstractBoxParser.skippedTypes;
                if (list != null && list.contains(read4cc)) {
                    LOG.trace("Skipping box {} {} {}", read4cc, bArr, str);
                    createBox = new SkipBox(read4cc, bArr, str);
                } else {
                    LOG.trace("Creating box {} {} {}", read4cc, bArr, str);
                    createBox = abstractBoxParser.createBox(read4cc, bArr, str);
                }
                ParsableBox parsableBox = createBox;
                abstractBoxParser.header.get().rewind();
                parsableBox.parse(readableByteChannel2, abstractBoxParser.header.get(), j, abstractBoxParser);
                return parsableBox;
            }
            if (read < 0) {
                throw new EOFException();
            }
            abstractBoxParser = this;
            readableByteChannel2 = readableByteChannel;
        }
    }

    public AbstractBoxParser skippingBoxes(String... strArr) {
        this.skippedTypes = Arrays.asList(strArr);
        return this;
    }
}
