package com.coremedia.iso.boxes.mdat;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import xsna.ga8;
import xsna.pa8;
import xsna.vu5;
import xsna.xuk;
import xsna.yej;

/* loaded from: classes12.dex */
public final class MediaDataBox implements ga8 {
    public static final String TYPE = "mdat";
    private xuk dataSource;
    private long offset;
    yej parent;
    private long size;

    private static void transfer(xuk xukVar, long j, long j2, WritableByteChannel writableByteChannel) throws IOException {
        long j3 = 0;
        while (j3 < j2) {
            j3 += xukVar.b1(j + j3, Math.min(67076096L, j2 - j3), writableByteChannel);
        }
    }

    @Override // xsna.ga8, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        transfer(this.dataSource, this.offset, this.size, writableByteChannel);
    }

    public long getOffset() {
        return this.offset;
    }

    @Override // xsna.ga8
    public yej getParent() {
        return this.parent;
    }

    @Override // xsna.ga8, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        return this.size;
    }

    @Override // xsna.ga8
    public String getType() {
        return TYPE;
    }

    @Override // xsna.ga8, com.coremedia.iso.boxes.FullBox
    public void parse(xuk xukVar, ByteBuffer byteBuffer, long j, pa8 pa8Var) throws IOException {
        this.offset = xukVar.position() - byteBuffer.remaining();
        this.dataSource = xukVar;
        this.size = byteBuffer.remaining() + j;
        xukVar.position(xukVar.position() + j);
    }

    @Override // xsna.ga8
    public void setParent(yej yejVar) {
        this.parent = yejVar;
    }

    public String toString() {
        return vu5.a('}', this.size, new StringBuilder("MediaDataBox{size="));
    }
}
