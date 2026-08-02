package com.mp4parser.streaming;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import xsna.ga8;
import xsna.pa8;
import xsna.xuk;
import xsna.yej;

/* loaded from: classes14.dex */
public abstract class WriteOnlyBox implements ga8 {
    private yej parent;
    private final String type;

    public WriteOnlyBox(String str) {
        this.type = str;
    }

    @Override // xsna.ga8, com.coremedia.iso.boxes.FullBox
    public abstract /* synthetic */ void getBox(WritableByteChannel writableByteChannel) throws IOException;

    public long getOffset() {
        throw new RuntimeException("It's a´write only box");
    }

    @Override // xsna.ga8
    public yej getParent() {
        return this.parent;
    }

    @Override // xsna.ga8, com.coremedia.iso.boxes.FullBox
    public abstract /* synthetic */ long getSize();

    @Override // xsna.ga8
    public String getType() {
        return this.type;
    }

    @Override // xsna.ga8, com.coremedia.iso.boxes.FullBox
    public void parse(xuk xukVar, ByteBuffer byteBuffer, long j, pa8 pa8Var) throws IOException {
        throw new RuntimeException("It's a´write only box");
    }

    @Override // xsna.ga8
    public void setParent(yej yejVar) {
        this.parent = yejVar;
    }
}
