package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractContainerBox;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import xsna.aqw;
import xsna.crx0;
import xsna.pa8;
import xsna.u220;
import xsna.up2;
import xsna.xuk;

/* loaded from: classes12.dex */
public class MetaBox extends AbstractContainerBox {
    public static final String TYPE = "meta";
    private int flags;
    private boolean isFullBox;
    private int version;

    public MetaBox() {
        super(TYPE);
        this.isFullBox = true;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, xsna.ga8, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        if (this.isFullBox) {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            writeVersionAndFlags(allocate);
            writableByteChannel.write((ByteBuffer) allocate.rewind());
        }
        writeContainer(writableByteChannel);
    }

    public int getFlags() {
        return this.flags;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, xsna.ga8, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        long containerSize = getContainerSize() + (this.isFullBox ? 4L : 0L);
        return containerSize + ((this.largeBox || containerSize >= 4294967296L) ? 16 : 8);
    }

    public int getVersion() {
        return this.version;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, xsna.ga8, com.coremedia.iso.boxes.FullBox
    public void parse(xuk xukVar, ByteBuffer byteBuffer, long j, pa8 pa8Var) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(up2.p(j));
        xukVar.read(allocate);
        allocate.position(4);
        if (HandlerBox.TYPE.equals(crx0.n(allocate))) {
            this.isFullBox = false;
            initContainer(new u220((ByteBuffer) allocate.rewind()), j, pa8Var);
        } else {
            this.isFullBox = true;
            parseVersionAndFlags((ByteBuffer) allocate.rewind());
            initContainer(new u220(allocate), j - 4, pa8Var);
        }
    }

    public final long parseVersionAndFlags(ByteBuffer byteBuffer) {
        this.version = crx0.y(byteBuffer);
        this.flags = crx0.v(byteBuffer);
        return 4L;
    }

    public void setFlags(int i) {
        this.flags = i;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public final void writeVersionAndFlags(ByteBuffer byteBuffer) {
        aqw.w(this.version, byteBuffer);
        aqw.v(this.flags, byteBuffer);
    }
}
