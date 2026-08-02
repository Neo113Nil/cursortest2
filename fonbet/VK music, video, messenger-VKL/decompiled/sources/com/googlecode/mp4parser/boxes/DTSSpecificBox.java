package com.googlecode.mp4parser.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSink;
import java.nio.ByteBuffer;
import xsna.crx0;
import xsna.lb7;
import xsna.mb7;
import xsna.n0y;
import xsna.o0y;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes13.dex */
public class DTSSpecificBox extends AbstractBox {
    public static final String TYPE = "ddts";
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
    private static final /* synthetic */ n0y ajc$tjp_22 = null;
    private static final /* synthetic */ n0y ajc$tjp_23 = null;
    private static final /* synthetic */ n0y ajc$tjp_24 = null;
    private static final /* synthetic */ n0y ajc$tjp_25 = null;
    private static final /* synthetic */ n0y ajc$tjp_26 = null;
    private static final /* synthetic */ n0y ajc$tjp_27 = null;
    private static final /* synthetic */ n0y ajc$tjp_28 = null;
    private static final /* synthetic */ n0y ajc$tjp_29 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_30 = null;
    private static final /* synthetic */ n0y ajc$tjp_31 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    private static final /* synthetic */ n0y ajc$tjp_6 = null;
    private static final /* synthetic */ n0y ajc$tjp_7 = null;
    private static final /* synthetic */ n0y ajc$tjp_8 = null;
    private static final /* synthetic */ n0y ajc$tjp_9 = null;
    long DTSSamplingFrequency;
    int LBRDurationMod;
    long avgBitRate;
    int channelLayout;
    int coreLFEPresent;
    int coreLayout;
    int coreSize;
    int frameDuration;
    long maxBitRate;
    int multiAssetFlag;
    int pcmSampleDepth;
    int representationType;
    int reserved;
    int reservedBoxPresent;
    int stereoDownmix;
    int streamConstruction;

    static {
        ajc$preClinit();
    }

    public DTSSpecificBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("DTSSpecificBox.java", DTSSpecificBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getAvgBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "long"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setAvgBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "long", "avgBitRate", "", "void"));
        ajc$tjp_10 = whqVar.f(whqVar.e("getStreamConstruction", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"));
        ajc$tjp_11 = whqVar.f(whqVar.e("setStreamConstruction", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "streamConstruction", "", "void"));
        ajc$tjp_12 = whqVar.f(whqVar.e("getCoreLFEPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"));
        ajc$tjp_13 = whqVar.f(whqVar.e("setCoreLFEPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "coreLFEPresent", "", "void"));
        ajc$tjp_14 = whqVar.f(whqVar.e("getCoreLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"));
        ajc$tjp_15 = whqVar.f(whqVar.e("setCoreLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "coreLayout", "", "void"));
        ajc$tjp_16 = whqVar.f(whqVar.e("getCoreSize", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"));
        ajc$tjp_17 = whqVar.f(whqVar.e("setCoreSize", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "coreSize", "", "void"));
        ajc$tjp_18 = whqVar.f(whqVar.e("getStereoDownmix", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"));
        ajc$tjp_19 = whqVar.f(whqVar.e("setStereoDownmix", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "stereoDownmix", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("getDTSSamplingFrequency", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "long"));
        ajc$tjp_20 = whqVar.f(whqVar.e("getRepresentationType", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"));
        ajc$tjp_21 = whqVar.f(whqVar.e("setRepresentationType", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "representationType", "", "void"));
        ajc$tjp_22 = whqVar.f(whqVar.e("getChannelLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"));
        ajc$tjp_23 = whqVar.f(whqVar.e("setChannelLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "channelLayout", "", "void"));
        ajc$tjp_24 = whqVar.f(whqVar.e("getMultiAssetFlag", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"));
        ajc$tjp_25 = whqVar.f(whqVar.e("setMultiAssetFlag", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "multiAssetFlag", "", "void"));
        ajc$tjp_26 = whqVar.f(whqVar.e("getLBRDurationMod", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"));
        ajc$tjp_27 = whqVar.f(whqVar.e("setLBRDurationMod", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "LBRDurationMod", "", "void"));
        ajc$tjp_28 = whqVar.f(whqVar.e("getReserved", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"));
        ajc$tjp_29 = whqVar.f(whqVar.e("setReserved", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "reserved", "", "void"));
        ajc$tjp_3 = whqVar.f(whqVar.e("setDTSSamplingFrequency", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "long", "DTSSamplingFrequency", "", "void"));
        ajc$tjp_30 = whqVar.f(whqVar.e("getReservedBoxPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"));
        ajc$tjp_31 = whqVar.f(whqVar.e("setReservedBoxPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "reservedBoxPresent", "", "void"));
        ajc$tjp_4 = whqVar.f(whqVar.e("getMaxBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "long"));
        ajc$tjp_5 = whqVar.f(whqVar.e("setMaxBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "long", "maxBitRate", "", "void"));
        ajc$tjp_6 = whqVar.f(whqVar.e("getPcmSampleDepth", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"));
        ajc$tjp_7 = whqVar.f(whqVar.e("setPcmSampleDepth", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "pcmSampleDepth", "", "void"));
        ajc$tjp_8 = whqVar.f(whqVar.e("getFrameDuration", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"));
        ajc$tjp_9 = whqVar.f(whqVar.e("setFrameDuration", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "frameDuration", "", "void"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.DTSSamplingFrequency = crx0.w(byteBuffer);
        this.maxBitRate = crx0.w(byteBuffer);
        this.avgBitRate = crx0.w(byteBuffer);
        this.pcmSampleDepth = crx0.e(byteBuffer.get());
        lb7 lb7Var = new lb7(byteBuffer);
        this.frameDuration = lb7Var.a(2);
        this.streamConstruction = lb7Var.a(5);
        this.coreLFEPresent = lb7Var.a(1);
        this.coreLayout = lb7Var.a(6);
        this.coreSize = lb7Var.a(14);
        this.stereoDownmix = lb7Var.a(1);
        this.representationType = lb7Var.a(3);
        this.channelLayout = lb7Var.a(16);
        this.multiAssetFlag = lb7Var.a(1);
        this.LBRDurationMod = lb7Var.a(1);
        this.reservedBoxPresent = lb7Var.a(1);
        this.reserved = lb7Var.a(5);
    }

    public long getAvgBitRate() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.avgBitRate;
    }

    public int getChannelLayout() {
        o0y c = whq.c(ajc$tjp_22, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.channelLayout;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        byteBuffer.putInt((int) this.DTSSamplingFrequency);
        byteBuffer.putInt((int) this.maxBitRate);
        byteBuffer.putInt((int) this.avgBitRate);
        byteBuffer.put((byte) (this.pcmSampleDepth & 255));
        mb7 mb7Var = new mb7(byteBuffer);
        mb7Var.a(this.frameDuration, 2);
        mb7Var.a(this.streamConstruction, 5);
        mb7Var.a(this.coreLFEPresent, 1);
        mb7Var.a(this.coreLayout, 6);
        mb7Var.a(this.coreSize, 14);
        mb7Var.a(this.stereoDownmix, 1);
        mb7Var.a(this.representationType, 3);
        mb7Var.a(this.channelLayout, 16);
        mb7Var.a(this.multiAssetFlag, 1);
        mb7Var.a(this.LBRDurationMod, 1);
        mb7Var.a(this.reservedBoxPresent, 1);
        mb7Var.a(this.reserved, 5);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 20L;
    }

    public int getCoreLFEPresent() {
        o0y c = whq.c(ajc$tjp_12, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.coreLFEPresent;
    }

    public int getCoreLayout() {
        o0y c = whq.c(ajc$tjp_14, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.coreLayout;
    }

    public int getCoreSize() {
        o0y c = whq.c(ajc$tjp_16, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.coreSize;
    }

    public long getDTSSamplingFrequency() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.DTSSamplingFrequency;
    }

    public int[] getDashAudioChannelConfiguration() {
        int i;
        int channelLayout = getChannelLayout();
        int i2 = 1;
        if ((channelLayout & 1) == 1) {
            i = 4;
        } else {
            i2 = 0;
            i = 0;
        }
        if ((channelLayout & 2) == 2) {
            i2 += 2;
            i |= 3;
        }
        if ((channelLayout & 4) == 4) {
            i2 += 2;
            i |= 48;
        }
        if ((channelLayout & 8) == 8) {
            i2++;
            i |= 8;
        }
        if ((channelLayout & 16) == 16) {
            i2++;
            i |= 256;
        }
        if ((channelLayout & 32) == 32) {
            i2 += 2;
            i |= CacheDataSink.DEFAULT_BUFFER_SIZE;
        }
        if ((channelLayout & 64) == 64) {
            i2 += 2;
            i |= 48;
        }
        if ((channelLayout & 128) == 128) {
            i2++;
            i |= 8192;
        }
        if ((channelLayout & 256) == 256) {
            i2++;
            i |= 2048;
        }
        if ((channelLayout & 512) == 512) {
            i2 += 2;
            i |= PsExtractor.AUDIO_STREAM;
        }
        if ((channelLayout & 1024) == 1024) {
            i2 += 2;
            i |= 1536;
        }
        if ((channelLayout & 2048) == 2048) {
            i2 += 2;
            i |= 48;
        }
        if ((channelLayout & 4096) == 4096) {
            i2++;
            i |= 8;
        }
        if ((channelLayout & 8192) == 8192) {
            i2 += 2;
            i |= 48;
        }
        if ((channelLayout & 16384) == 16384) {
            i2++;
            i |= 65536;
        }
        if ((channelLayout & 32768) == 32768) {
            i2 += 2;
            i |= 163840;
        }
        if ((channelLayout & 65536) == 65536) {
            i2++;
        }
        if ((channelLayout & 131072) == 131072) {
            i2 += 2;
        }
        return new int[]{i2, i};
    }

    public int getFrameDuration() {
        o0y c = whq.c(ajc$tjp_8, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.frameDuration;
    }

    public int getLBRDurationMod() {
        o0y c = whq.c(ajc$tjp_26, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.LBRDurationMod;
    }

    public long getMaxBitRate() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.maxBitRate;
    }

    public int getMultiAssetFlag() {
        o0y c = whq.c(ajc$tjp_24, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.multiAssetFlag;
    }

    public int getPcmSampleDepth() {
        o0y c = whq.c(ajc$tjp_6, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.pcmSampleDepth;
    }

    public int getRepresentationType() {
        o0y c = whq.c(ajc$tjp_20, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.representationType;
    }

    public int getReserved() {
        o0y c = whq.c(ajc$tjp_28, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.reserved;
    }

    public int getReservedBoxPresent() {
        o0y c = whq.c(ajc$tjp_30, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.reservedBoxPresent;
    }

    public int getStereoDownmix() {
        o0y c = whq.c(ajc$tjp_18, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.stereoDownmix;
    }

    public int getStreamConstruction() {
        o0y c = whq.c(ajc$tjp_10, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.streamConstruction;
    }

    public void setAvgBitRate(long j) {
        o0y d = whq.d(ajc$tjp_1, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.avgBitRate = j;
    }

    public void setChannelLayout(int i) {
        o0y d = whq.d(ajc$tjp_23, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.channelLayout = i;
    }

    public void setCoreLFEPresent(int i) {
        o0y d = whq.d(ajc$tjp_13, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.coreLFEPresent = i;
    }

    public void setCoreLayout(int i) {
        o0y d = whq.d(ajc$tjp_15, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.coreLayout = i;
    }

    public void setCoreSize(int i) {
        o0y d = whq.d(ajc$tjp_17, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.coreSize = i;
    }

    public void setDTSSamplingFrequency(long j) {
        o0y d = whq.d(ajc$tjp_3, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.DTSSamplingFrequency = j;
    }

    public void setFrameDuration(int i) {
        o0y d = whq.d(ajc$tjp_9, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.frameDuration = i;
    }

    public void setLBRDurationMod(int i) {
        o0y d = whq.d(ajc$tjp_27, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.LBRDurationMod = i;
    }

    public void setMaxBitRate(long j) {
        o0y d = whq.d(ajc$tjp_5, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.maxBitRate = j;
    }

    public void setMultiAssetFlag(int i) {
        o0y d = whq.d(ajc$tjp_25, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.multiAssetFlag = i;
    }

    public void setPcmSampleDepth(int i) {
        o0y d = whq.d(ajc$tjp_7, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.pcmSampleDepth = i;
    }

    public void setRepresentationType(int i) {
        o0y d = whq.d(ajc$tjp_21, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.representationType = i;
    }

    public void setReserved(int i) {
        o0y d = whq.d(ajc$tjp_29, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.reserved = i;
    }

    public void setReservedBoxPresent(int i) {
        o0y d = whq.d(ajc$tjp_31, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.reservedBoxPresent = i;
    }

    public void setStereoDownmix(int i) {
        o0y d = whq.d(ajc$tjp_19, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.stereoDownmix = i;
    }

    public void setStreamConstruction(int i) {
        o0y d = whq.d(ajc$tjp_11, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.streamConstruction = i;
    }
}
