package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import xsna.crx0;
import xsna.n0y;
import xsna.o0y;
import xsna.up2;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes12.dex */
public class ChunkOffset64BitBox extends ChunkOffsetBox {
    public static final String TYPE = "co64";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private long[] chunkOffsets;

    static {
        ajc$preClinit();
    }

    public ChunkOffset64BitBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("ChunkOffset64BitBox.java", ChunkOffset64BitBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getChunkOffsets", "com.coremedia.iso.boxes.ChunkOffset64BitBox", "", "", "", "[J"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setChunkOffsets", "com.coremedia.iso.boxes.ChunkOffset64BitBox", "[J", "chunkOffsets", "", "void"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int p = up2.p(crx0.w(byteBuffer));
        this.chunkOffsets = new long[p];
        for (int i = 0; i < p; i++) {
            this.chunkOffsets[i] = crx0.x(byteBuffer);
        }
    }

    @Override // com.coremedia.iso.boxes.ChunkOffsetBox
    public long[] getChunkOffsets() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.chunkOffsets;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt(this.chunkOffsets.length);
        for (long j : this.chunkOffsets) {
            byteBuffer.putLong(j);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (this.chunkOffsets.length * 8) + 8;
    }

    @Override // com.coremedia.iso.boxes.ChunkOffsetBox
    public void setChunkOffsets(long[] jArr) {
        o0y d = whq.d(ajc$tjp_1, this, this, jArr);
        w8g0.a();
        w8g0.b(d);
        this.chunkOffsets = jArr;
    }
}
