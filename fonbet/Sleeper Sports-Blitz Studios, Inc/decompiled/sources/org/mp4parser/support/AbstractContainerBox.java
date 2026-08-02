package org.mp4parser.support;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import org.mp4parser.BasicContainer;
import org.mp4parser.BoxParser;
import org.mp4parser.Container;
import org.mp4parser.ParsableBox;
import org.mp4parser.tools.IsoTypeWriter;

/* loaded from: classes10.dex */
public class AbstractContainerBox extends BasicContainer implements ParsableBox {
    protected boolean largeBox;
    Container parent;
    protected String type;

    public AbstractContainerBox(String str) {
        this.type = str;
    }

    public void setParent(Container container) {
        this.parent = container;
    }

    public long getSize() {
        long containerSize = getContainerSize();
        return containerSize + ((this.largeBox || 8 + containerSize >= 4294967296L) ? 16 : 8);
    }

    @Override // org.mp4parser.Box
    public String getType() {
        return this.type;
    }

    protected ByteBuffer getHeader() {
        ByteBuffer wrap;
        if (this.largeBox || getSize() >= 4294967296L) {
            byte[] bArr = new byte[16];
            bArr[3] = 1;
            bArr[4] = this.type.getBytes()[0];
            bArr[5] = this.type.getBytes()[1];
            bArr[6] = this.type.getBytes()[2];
            bArr[7] = this.type.getBytes()[3];
            wrap = ByteBuffer.wrap(bArr);
            wrap.position(8);
            IsoTypeWriter.writeUInt64(wrap, getSize());
        } else {
            wrap = ByteBuffer.wrap(new byte[]{0, 0, 0, 0, this.type.getBytes()[0], this.type.getBytes()[1], this.type.getBytes()[2], this.type.getBytes()[3]});
            IsoTypeWriter.writeUInt32(wrap, getSize());
        }
        wrap.rewind();
        return wrap;
    }

    public void parse(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer, long j, BoxParser boxParser) throws IOException {
        this.largeBox = byteBuffer.remaining() == 16;
        initContainer(readableByteChannel, j, boxParser);
    }

    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        writeContainer(writableByteChannel);
    }
}
