package com.coremedia.iso.boxes.apple;

import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.aqw;
import xsna.crx0;
import xsna.n0y;
import xsna.o0y;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes12.dex */
public final class AppleLosslessSpecificBox extends AbstractFullBox {
    public static final String TYPE = "alac";
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
    private long bitRate;
    private int channels;
    private int historyMult;
    private int initialHistory;
    private int kModifier;
    private long maxCodedFrameSize;
    private long maxSamplePerFrame;
    private long sampleRate;
    private int sampleSize;
    private int unknown1;
    private int unknown2;

    static {
        ajc$preClinit();
    }

    public AppleLosslessSpecificBox() {
        super("alac");
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("AppleLosslessSpecificBox.java", AppleLosslessSpecificBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getMaxSamplePerFrame", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setMaxSamplePerFrame", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "maxSamplePerFrame", "", "void"));
        ajc$tjp_10 = whqVar.f(whqVar.e("getKModifier", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"));
        ajc$tjp_11 = whqVar.f(whqVar.e("setKModifier", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "kModifier", "", "void"));
        ajc$tjp_12 = whqVar.f(whqVar.e("getChannels", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"));
        ajc$tjp_13 = whqVar.f(whqVar.e("setChannels", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", RTCStatsConstants.KEY_CHANNELS, "", "void"));
        ajc$tjp_14 = whqVar.f(whqVar.e("getUnknown2", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"));
        ajc$tjp_15 = whqVar.f(whqVar.e("setUnknown2", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "unknown2", "", "void"));
        ajc$tjp_16 = whqVar.f(whqVar.e("getMaxCodedFrameSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"));
        ajc$tjp_17 = whqVar.f(whqVar.e("setMaxCodedFrameSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "maxCodedFrameSize", "", "void"));
        ajc$tjp_18 = whqVar.f(whqVar.e("getBitRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"));
        ajc$tjp_19 = whqVar.f(whqVar.e("setBitRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "bitRate", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("getUnknown1", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"));
        ajc$tjp_20 = whqVar.f(whqVar.e("getSampleRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"));
        ajc$tjp_21 = whqVar.f(whqVar.e("setSampleRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "sampleRate", "", "void"));
        ajc$tjp_3 = whqVar.f(whqVar.e("setUnknown1", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "unknown1", "", "void"));
        ajc$tjp_4 = whqVar.f(whqVar.e("getSampleSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"));
        ajc$tjp_5 = whqVar.f(whqVar.e("setSampleSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "sampleSize", "", "void"));
        ajc$tjp_6 = whqVar.f(whqVar.e("getHistoryMult", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"));
        ajc$tjp_7 = whqVar.f(whqVar.e("setHistoryMult", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "historyMult", "", "void"));
        ajc$tjp_8 = whqVar.f(whqVar.e("getInitialHistory", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"));
        ajc$tjp_9 = whqVar.f(whqVar.e("setInitialHistory", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "initialHistory", "", "void"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.maxSamplePerFrame = crx0.w(byteBuffer);
        this.unknown1 = crx0.e(byteBuffer.get());
        this.sampleSize = crx0.e(byteBuffer.get());
        this.historyMult = crx0.e(byteBuffer.get());
        this.initialHistory = crx0.e(byteBuffer.get());
        this.kModifier = crx0.e(byteBuffer.get());
        this.channels = crx0.e(byteBuffer.get());
        this.unknown2 = crx0.u(byteBuffer);
        this.maxCodedFrameSize = crx0.w(byteBuffer);
        this.bitRate = crx0.w(byteBuffer);
        this.sampleRate = crx0.w(byteBuffer);
    }

    public long getBitRate() {
        o0y c = whq.c(ajc$tjp_18, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.bitRate;
    }

    public int getChannels() {
        o0y c = whq.c(ajc$tjp_12, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.channels;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt((int) this.maxSamplePerFrame);
        byteBuffer.put((byte) (this.unknown1 & 255));
        byteBuffer.put((byte) (this.sampleSize & 255));
        byteBuffer.put((byte) (this.historyMult & 255));
        byteBuffer.put((byte) (this.initialHistory & 255));
        byteBuffer.put((byte) (this.kModifier & 255));
        byteBuffer.put((byte) (this.channels & 255));
        aqw.u(this.unknown2, byteBuffer);
        byteBuffer.putInt((int) this.maxCodedFrameSize);
        byteBuffer.putInt((int) this.bitRate);
        byteBuffer.putInt((int) this.sampleRate);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 28L;
    }

    public int getHistoryMult() {
        o0y c = whq.c(ajc$tjp_6, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.historyMult;
    }

    public int getInitialHistory() {
        o0y c = whq.c(ajc$tjp_8, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.initialHistory;
    }

    public int getKModifier() {
        o0y c = whq.c(ajc$tjp_10, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.kModifier;
    }

    public long getMaxCodedFrameSize() {
        o0y c = whq.c(ajc$tjp_16, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.maxCodedFrameSize;
    }

    public long getMaxSamplePerFrame() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.maxSamplePerFrame;
    }

    public long getSampleRate() {
        o0y c = whq.c(ajc$tjp_20, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.sampleRate;
    }

    public int getSampleSize() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.sampleSize;
    }

    public int getUnknown1() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.unknown1;
    }

    public int getUnknown2() {
        o0y c = whq.c(ajc$tjp_14, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.unknown2;
    }

    public void setBitRate(int i) {
        o0y d = whq.d(ajc$tjp_19, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.bitRate = i;
    }

    public void setChannels(int i) {
        o0y d = whq.d(ajc$tjp_13, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.channels = i;
    }

    public void setHistoryMult(int i) {
        o0y d = whq.d(ajc$tjp_7, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.historyMult = i;
    }

    public void setInitialHistory(int i) {
        o0y d = whq.d(ajc$tjp_9, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.initialHistory = i;
    }

    public void setKModifier(int i) {
        o0y d = whq.d(ajc$tjp_11, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.kModifier = i;
    }

    public void setMaxCodedFrameSize(int i) {
        o0y d = whq.d(ajc$tjp_17, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.maxCodedFrameSize = i;
    }

    public void setMaxSamplePerFrame(int i) {
        o0y d = whq.d(ajc$tjp_1, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.maxSamplePerFrame = i;
    }

    public void setSampleRate(int i) {
        o0y d = whq.d(ajc$tjp_21, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.sampleRate = i;
    }

    public void setSampleSize(int i) {
        o0y d = whq.d(ajc$tjp_5, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.sampleSize = i;
    }

    public void setUnknown1(int i) {
        o0y d = whq.d(ajc$tjp_3, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.unknown1 = i;
    }

    public void setUnknown2(int i) {
        o0y d = whq.d(ajc$tjp_15, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.unknown2 = i;
    }
}
