package com.mp4parser.iso14496.part15;

import com.googlecode.mp4parser.AbstractBox;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;
import xsna.aqw;
import xsna.crx0;
import xsna.n0y;
import xsna.o0y;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes14.dex */
public class TierInfoBox extends AbstractBox {
    public static final String TYPE = "tiri";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_10 = null;
    private static final /* synthetic */ n0y ajc$tjp_11 = null;
    private static final /* synthetic */ n0y ajc$tjp_12 = null;
    private static final /* synthetic */ n0y ajc$tjp_13 = null;
    private static final /* synthetic */ n0y ajc$tjp_14 = null;
    private static final /* synthetic */ n0y ajc$tjp_15 = null;
    private static final /* synthetic */ n0y ajc$tjp_16 = null;
    private static final /* synthetic */ n0y ajc$tjp_17 = null;
    private static final /* synthetic */ n0y ajc$tjp_18 = null;
    private static final /* synthetic */ n0y ajc$tjp_19 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_20 = null;
    private static final /* synthetic */ n0y ajc$tjp_21 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    private static final /* synthetic */ n0y ajc$tjp_6 = null;
    private static final /* synthetic */ n0y ajc$tjp_7 = null;
    private static final /* synthetic */ n0y ajc$tjp_8 = null;
    private static final /* synthetic */ n0y ajc$tjp_9 = null;
    int constantFrameRate;
    int discardable;
    int frameRate;
    int levelIndication;
    int profileIndication;
    int profile_compatibility;
    int reserved1;
    int reserved2;
    int tierID;
    int visualHeight;
    int visualWidth;

    static {
        ajc$preClinit();
    }

    public TierInfoBox() {
        super(TYPE);
        this.reserved1 = 0;
        this.reserved2 = 0;
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("TierInfoBox.java", TierInfoBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getTierID", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setTierID", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "tierID", "", "void"));
        ajc$tjp_10 = whqVar.f(whqVar.e("getVisualWidth", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"));
        ajc$tjp_11 = whqVar.f(whqVar.e("setVisualWidth", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "visualWidth", "", "void"));
        ajc$tjp_12 = whqVar.f(whqVar.e("getVisualHeight", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"));
        ajc$tjp_13 = whqVar.f(whqVar.e("setVisualHeight", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "visualHeight", "", "void"));
        ajc$tjp_14 = whqVar.f(whqVar.e("getDiscardable", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"));
        ajc$tjp_15 = whqVar.f(whqVar.e("setDiscardable", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "discardable", "", "void"));
        ajc$tjp_16 = whqVar.f(whqVar.e("getConstantFrameRate", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"));
        ajc$tjp_17 = whqVar.f(whqVar.e("setConstantFrameRate", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "constantFrameRate", "", "void"));
        ajc$tjp_18 = whqVar.f(whqVar.e("getReserved2", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"));
        ajc$tjp_19 = whqVar.f(whqVar.e("setReserved2", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "reserved2", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("getProfileIndication", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"));
        ajc$tjp_20 = whqVar.f(whqVar.e("getFrameRate", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"));
        ajc$tjp_21 = whqVar.f(whqVar.e("setFrameRate", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "frameRate", "", "void"));
        ajc$tjp_3 = whqVar.f(whqVar.e("setProfileIndication", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "profileIndication", "", "void"));
        ajc$tjp_4 = whqVar.f(whqVar.e("getProfile_compatibility", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"));
        ajc$tjp_5 = whqVar.f(whqVar.e("setProfile_compatibility", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "profile_compatibility", "", "void"));
        ajc$tjp_6 = whqVar.f(whqVar.e("getLevelIndication", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"));
        ajc$tjp_7 = whqVar.f(whqVar.e("setLevelIndication", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "levelIndication", "", "void"));
        ajc$tjp_8 = whqVar.f(whqVar.e("getReserved1", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"));
        ajc$tjp_9 = whqVar.f(whqVar.e("setReserved1", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "reserved1", "", "void"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.tierID = crx0.u(byteBuffer);
        this.profileIndication = crx0.e(byteBuffer.get());
        this.profile_compatibility = crx0.e(byteBuffer.get());
        this.levelIndication = crx0.e(byteBuffer.get());
        this.reserved1 = crx0.e(byteBuffer.get());
        this.visualWidth = crx0.u(byteBuffer);
        this.visualHeight = crx0.u(byteBuffer);
        int e = crx0.e(byteBuffer.get());
        this.discardable = (e & PsExtractor.AUDIO_STREAM) >> 6;
        this.constantFrameRate = (e & 48) >> 4;
        this.reserved2 = e & 15;
        this.frameRate = crx0.u(byteBuffer);
    }

    public int getConstantFrameRate() {
        o0y c = whq.c(ajc$tjp_16, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.constantFrameRate;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        aqw.u(this.tierID, byteBuffer);
        byteBuffer.put((byte) (this.profileIndication & 255));
        byteBuffer.put((byte) (this.profile_compatibility & 255));
        byteBuffer.put((byte) (this.levelIndication & 255));
        byteBuffer.put((byte) (this.reserved1 & 255));
        aqw.u(this.visualWidth, byteBuffer);
        aqw.u(this.visualHeight, byteBuffer);
        byteBuffer.put((byte) (((this.discardable << 6) + (this.constantFrameRate << 4) + this.reserved2) & 255));
        aqw.u(this.frameRate, byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 13L;
    }

    public int getDiscardable() {
        o0y c = whq.c(ajc$tjp_14, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.discardable;
    }

    public int getFrameRate() {
        o0y c = whq.c(ajc$tjp_20, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.frameRate;
    }

    public int getLevelIndication() {
        o0y c = whq.c(ajc$tjp_6, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.levelIndication;
    }

    public int getProfileIndication() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.profileIndication;
    }

    public int getProfile_compatibility() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.profile_compatibility;
    }

    public int getReserved1() {
        o0y c = whq.c(ajc$tjp_8, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.reserved1;
    }

    public int getReserved2() {
        o0y c = whq.c(ajc$tjp_18, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.reserved2;
    }

    public int getTierID() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.tierID;
    }

    public int getVisualHeight() {
        o0y c = whq.c(ajc$tjp_12, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.visualHeight;
    }

    public int getVisualWidth() {
        o0y c = whq.c(ajc$tjp_10, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.visualWidth;
    }

    public void setConstantFrameRate(int i) {
        o0y d = whq.d(ajc$tjp_17, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.constantFrameRate = i;
    }

    public void setDiscardable(int i) {
        o0y d = whq.d(ajc$tjp_15, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.discardable = i;
    }

    public void setFrameRate(int i) {
        o0y d = whq.d(ajc$tjp_21, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.frameRate = i;
    }

    public void setLevelIndication(int i) {
        o0y d = whq.d(ajc$tjp_7, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.levelIndication = i;
    }

    public void setProfileIndication(int i) {
        o0y d = whq.d(ajc$tjp_3, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.profileIndication = i;
    }

    public void setProfile_compatibility(int i) {
        o0y d = whq.d(ajc$tjp_5, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.profile_compatibility = i;
    }

    public void setReserved1(int i) {
        o0y d = whq.d(ajc$tjp_9, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.reserved1 = i;
    }

    public void setReserved2(int i) {
        o0y d = whq.d(ajc$tjp_19, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.reserved2 = i;
    }

    public void setTierID(int i) {
        o0y d = whq.d(ajc$tjp_1, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.tierID = i;
    }

    public void setVisualHeight(int i) {
        o0y d = whq.d(ajc$tjp_13, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.visualHeight = i;
    }

    public void setVisualWidth(int i) {
        o0y d = whq.d(ajc$tjp_11, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.visualWidth = i;
    }
}
