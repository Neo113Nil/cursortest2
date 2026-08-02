package org.mp4parser;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes10.dex */
public class SkipBox implements ParsableBox {
    private long size;
    private long sourcePosition = -1;
    private String type;

    public SkipBox(String str, byte[] bArr, String str2) {
        this.type = str;
    }

    @Override // org.mp4parser.Box
    public String getType() {
        return this.type;
    }

    @Override // org.mp4parser.Box
    public long getSize() {
        return this.size;
    }

    public long getContentSize() {
        return this.size - 8;
    }

    public long getSourcePosition() {
        return this.sourcePosition;
    }

    @Override // org.mp4parser.Box
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        throw new RuntimeException("Cannot retrieve a skipped box - type " + this.type);
    }

    @Override // org.mp4parser.ParsableBox
    public void parse(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer, long j, BoxParser boxParser) throws IOException {
        this.size = 8 + j;
        if (readableByteChannel instanceof FileChannel) {
            FileChannel fileChannel = (FileChannel) readableByteChannel;
            long position = fileChannel.position();
            this.sourcePosition = position;
            fileChannel.position(position + j);
            return;
        }
        throw new RuntimeException("Cannot skip box " + this.type + " if data source is not seekable");
    }
}
