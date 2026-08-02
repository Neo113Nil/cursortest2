package com.mp4parser.iso14496.part12;

import com.googlecode.mp4parser.AbstractBox;
import java.nio.ByteBuffer;
import xsna.crx0;
import xsna.n0y;
import xsna.o0y;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes14.dex */
public final class BitRateBox extends AbstractBox {
    public static final String TYPE = "btrt";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    private long avgBitrate;
    private long bufferSizeDb;
    private long maxBitrate;

    static {
        ajc$preClinit();
    }

    public BitRateBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("BitRateBox.java", BitRateBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getBufferSizeDb", "com.mp4parser.iso14496.part12.BitRateBox", "", "", "", "long"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setBufferSizeDb", "com.mp4parser.iso14496.part12.BitRateBox", "long", "bufferSizeDb", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("getMaxBitrate", "com.mp4parser.iso14496.part12.BitRateBox", "", "", "", "long"));
        ajc$tjp_3 = whqVar.f(whqVar.e("setMaxBitrate", "com.mp4parser.iso14496.part12.BitRateBox", "long", "maxBitrate", "", "void"));
        ajc$tjp_4 = whqVar.f(whqVar.e("getAvgBitrate", "com.mp4parser.iso14496.part12.BitRateBox", "", "", "", "long"));
        ajc$tjp_5 = whqVar.f(whqVar.e("setAvgBitrate", "com.mp4parser.iso14496.part12.BitRateBox", "long", "avgBitrate", "", "void"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.bufferSizeDb = crx0.w(byteBuffer);
        this.maxBitrate = crx0.w(byteBuffer);
        this.avgBitrate = crx0.w(byteBuffer);
    }

    public long getAvgBitrate() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.avgBitrate;
    }

    public long getBufferSizeDb() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.bufferSizeDb;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        byteBuffer.putInt((int) this.bufferSizeDb);
        byteBuffer.putInt((int) this.maxBitrate);
        byteBuffer.putInt((int) this.avgBitrate);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 12L;
    }

    public long getMaxBitrate() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.maxBitrate;
    }

    public void setAvgBitrate(long j) {
        o0y d = whq.d(ajc$tjp_5, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.avgBitrate = j;
    }

    public void setBufferSizeDb(long j) {
        o0y d = whq.d(ajc$tjp_1, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.bufferSizeDb = j;
    }

    public void setMaxBitrate(long j) {
        o0y d = whq.d(ajc$tjp_3, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.maxBitrate = j;
    }
}
