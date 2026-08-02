package com.mp4parser.iso14496.part15;

import com.googlecode.mp4parser.AbstractBox;
import java.nio.ByteBuffer;
import xsna.crx0;
import xsna.n0y;
import xsna.o0y;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes14.dex */
public class TierBitRateBox extends AbstractBox {
    public static final String TYPE = "tibr";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_10 = null;
    private static final /* synthetic */ n0y ajc$tjp_11 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    private static final /* synthetic */ n0y ajc$tjp_6 = null;
    private static final /* synthetic */ n0y ajc$tjp_7 = null;
    private static final /* synthetic */ n0y ajc$tjp_8 = null;
    private static final /* synthetic */ n0y ajc$tjp_9 = null;
    long avgBitRate;
    long baseBitRate;
    long maxBitRate;
    long tierAvgBitRate;
    long tierBaseBitRate;
    long tierMaxBitRate;

    static {
        ajc$preClinit();
    }

    public TierBitRateBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("TierBitRateBox.java", TierBitRateBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getBaseBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", "long"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setBaseBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "long", "baseBitRate", "", "void"));
        ajc$tjp_10 = whqVar.f(whqVar.e("getTierAvgBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", "long"));
        ajc$tjp_11 = whqVar.f(whqVar.e("setTierAvgBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "long", "tierAvgBitRate", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("getMaxBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", "long"));
        ajc$tjp_3 = whqVar.f(whqVar.e("setMaxBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "long", "maxBitRate", "", "void"));
        ajc$tjp_4 = whqVar.f(whqVar.e("getAvgBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", "long"));
        ajc$tjp_5 = whqVar.f(whqVar.e("setAvgBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "long", "avgBitRate", "", "void"));
        ajc$tjp_6 = whqVar.f(whqVar.e("getTierBaseBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", "long"));
        ajc$tjp_7 = whqVar.f(whqVar.e("setTierBaseBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "long", "tierBaseBitRate", "", "void"));
        ajc$tjp_8 = whqVar.f(whqVar.e("getTierMaxBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", "long"));
        ajc$tjp_9 = whqVar.f(whqVar.e("setTierMaxBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "long", "tierMaxBitRate", "", "void"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.baseBitRate = crx0.w(byteBuffer);
        this.maxBitRate = crx0.w(byteBuffer);
        this.avgBitRate = crx0.w(byteBuffer);
        this.tierBaseBitRate = crx0.w(byteBuffer);
        this.tierMaxBitRate = crx0.w(byteBuffer);
        this.tierAvgBitRate = crx0.w(byteBuffer);
    }

    public long getAvgBitRate() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.avgBitRate;
    }

    public long getBaseBitRate() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.baseBitRate;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        byteBuffer.putInt((int) this.baseBitRate);
        byteBuffer.putInt((int) this.maxBitRate);
        byteBuffer.putInt((int) this.avgBitRate);
        byteBuffer.putInt((int) this.tierBaseBitRate);
        byteBuffer.putInt((int) this.tierMaxBitRate);
        byteBuffer.putInt((int) this.tierAvgBitRate);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 24L;
    }

    public long getMaxBitRate() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.maxBitRate;
    }

    public long getTierAvgBitRate() {
        o0y c = whq.c(ajc$tjp_10, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.tierAvgBitRate;
    }

    public long getTierBaseBitRate() {
        o0y c = whq.c(ajc$tjp_6, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.tierBaseBitRate;
    }

    public long getTierMaxBitRate() {
        o0y c = whq.c(ajc$tjp_8, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.tierMaxBitRate;
    }

    public void setAvgBitRate(long j) {
        o0y d = whq.d(ajc$tjp_5, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.avgBitRate = j;
    }

    public void setBaseBitRate(long j) {
        o0y d = whq.d(ajc$tjp_1, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.baseBitRate = j;
    }

    public void setMaxBitRate(long j) {
        o0y d = whq.d(ajc$tjp_3, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.maxBitRate = j;
    }

    public void setTierAvgBitRate(long j) {
        o0y d = whq.d(ajc$tjp_11, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.tierAvgBitRate = j;
    }

    public void setTierBaseBitRate(long j) {
        o0y d = whq.d(ajc$tjp_7, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.tierBaseBitRate = j;
    }

    public void setTierMaxBitRate(long j) {
        o0y d = whq.d(ajc$tjp_9, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.tierMaxBitRate = j;
    }
}
