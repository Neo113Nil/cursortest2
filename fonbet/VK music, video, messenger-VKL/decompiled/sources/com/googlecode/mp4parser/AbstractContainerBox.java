package com.googlecode.mp4parser;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import xsna.ga8;
import xsna.pa8;
import xsna.xuk;
import xsna.yej;

/* loaded from: classes13.dex */
public class AbstractContainerBox extends BasicContainer implements ga8 {
    protected boolean largeBox;
    private long offset;
    yej parent;
    protected String type;

    public AbstractContainerBox(String str) {
        this.type = str;
    }

    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        writeContainer(writableByteChannel);
    }

    public ByteBuffer getHeader() {
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
            wrap.putLong(getSize());
        } else {
            wrap = ByteBuffer.wrap(new byte[]{0, 0, 0, 0, this.type.getBytes()[0], this.type.getBytes()[1], this.type.getBytes()[2], this.type.getBytes()[3]});
            wrap.putInt((int) getSize());
        }
        wrap.rewind();
        return wrap;
    }

    public long getOffset() {
        return this.offset;
    }

    @Override // xsna.ga8
    public yej getParent() {
        return this.parent;
    }

    public long getSize() {
        long containerSize = getContainerSize();
        return containerSize + ((this.largeBox || 8 + containerSize >= 4294967296L) ? 16 : 8);
    }

    @Override // xsna.ga8
    public String getType() {
        return this.type;
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public void initContainer(xuk xukVar, long j, pa8 pa8Var) throws IOException {
        this.dataSource = xukVar;
        long position = xukVar.position();
        this.parsePosition = position;
        this.startPosition = position - ((this.largeBox || 8 + j >= 4294967296L) ? 16 : 8);
        xukVar.position(xukVar.position() + j);
        this.endPosition = xukVar.position();
        this.boxParser = pa8Var;
    }

    public void parse(xuk xukVar, ByteBuffer byteBuffer, long j, pa8 pa8Var) throws IOException {
        this.offset = xukVar.position() - byteBuffer.remaining();
        this.largeBox = byteBuffer.remaining() == 16;
        initContainer(xukVar, j, pa8Var);
    }

    @Override // xsna.ga8
    public void setParent(yej yejVar) {
        this.parent = yejVar;
    }
}
