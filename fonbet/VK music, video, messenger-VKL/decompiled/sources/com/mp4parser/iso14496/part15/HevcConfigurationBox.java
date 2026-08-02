package com.mp4parser.iso14496.part15;

import com.googlecode.mp4parser.AbstractBox;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mp4parser.iso14496.part15.a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.aqw;
import xsna.crx0;
import xsna.n0y;
import xsna.o0y;
import xsna.r11;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes14.dex */
public class HevcConfigurationBox extends AbstractBox {
    public static final String TYPE = "hvcC";
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
    private a hevcDecoderConfigurationRecord;

    static {
        ajc$preClinit();
    }

    public HevcConfigurationBox() {
        super(TYPE);
        this.hevcDecoderConfigurationRecord = new a();
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("HevcConfigurationBox.java", HevcConfigurationBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getHevcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setHevcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord", "hevcDecoderConfigurationRecord", "", "void"));
        ajc$tjp_10 = whqVar.f(whqVar.e("getGeneral_level_idc", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"));
        ajc$tjp_11 = whqVar.f(whqVar.e("getMin_spatial_segmentation_idc", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"));
        ajc$tjp_12 = whqVar.f(whqVar.e("getParallelismType", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"));
        ajc$tjp_13 = whqVar.f(whqVar.e("getChromaFormat", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"));
        ajc$tjp_14 = whqVar.f(whqVar.e("getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"));
        ajc$tjp_15 = whqVar.f(whqVar.e("getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"));
        ajc$tjp_16 = whqVar.f(whqVar.e("getAvgFrameRate", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"));
        ajc$tjp_17 = whqVar.f(whqVar.e("getNumTemporalLayers", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"));
        ajc$tjp_18 = whqVar.f(whqVar.e("getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"));
        ajc$tjp_19 = whqVar.f(whqVar.e("isTemporalIdNested", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "boolean"));
        ajc$tjp_2 = whqVar.f(whqVar.e("equals", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "java.lang.Object", "o", "", "boolean"));
        ajc$tjp_20 = whqVar.f(whqVar.e("getConstantFrameRate", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"));
        ajc$tjp_21 = whqVar.f(whqVar.e("getArrays", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "java.util.List"));
        ajc$tjp_3 = whqVar.f(whqVar.e("hashCode", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"));
        ajc$tjp_4 = whqVar.f(whqVar.e("getConfigurationVersion", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"));
        ajc$tjp_5 = whqVar.f(whqVar.e("getGeneral_profile_space", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"));
        ajc$tjp_6 = whqVar.f(whqVar.e("isGeneral_tier_flag", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "boolean"));
        ajc$tjp_7 = whqVar.f(whqVar.e("getGeneral_profile_idc", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"));
        ajc$tjp_8 = whqVar.f(whqVar.e("getGeneral_profile_compatibility_flags", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "long"));
        ajc$tjp_9 = whqVar.f(whqVar.e("getGeneral_constraint_indicator_flags", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "long"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        a aVar = this.hevcDecoderConfigurationRecord;
        aVar.getClass();
        aVar.a = crx0.y(byteBuffer);
        int e = crx0.e(byteBuffer.get());
        aVar.b = (e & PsExtractor.AUDIO_STREAM) >> 6;
        aVar.c = (e & 32) > 0;
        aVar.d = e & 31;
        aVar.e = crx0.w(byteBuffer);
        long u = crx0.u(byteBuffer) << 32;
        if (u < 0) {
            throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
        }
        long w = crx0.w(byteBuffer) + u;
        aVar.f = w;
        long j = w >> 44;
        aVar.x = (8 & j) > 0;
        aVar.y = (4 & j) > 0;
        aVar.z = (2 & j) > 0;
        aVar.A = (j & 1) > 0;
        aVar.f = 140737488355327L & w;
        aVar.g = crx0.e(byteBuffer.get());
        int u2 = crx0.u(byteBuffer);
        aVar.h = (61440 & u2) >> 12;
        aVar.i = u2 & 4095;
        int e2 = crx0.e(byteBuffer.get());
        aVar.j = (e2 & 252) >> 2;
        aVar.k = e2 & 3;
        int e3 = crx0.e(byteBuffer.get());
        aVar.l = (e3 & 252) >> 2;
        aVar.m = e3 & 3;
        int e4 = crx0.e(byteBuffer.get());
        aVar.n = (e4 & 248) >> 3;
        aVar.o = e4 & 7;
        int e5 = crx0.e(byteBuffer.get());
        aVar.p = (e5 & 248) >> 3;
        aVar.q = e5 & 7;
        aVar.r = crx0.u(byteBuffer);
        int e6 = crx0.e(byteBuffer.get());
        aVar.s = (e6 & PsExtractor.AUDIO_STREAM) >> 6;
        aVar.t = (e6 & 56) >> 3;
        aVar.u = (e6 & 4) > 0;
        aVar.v = e6 & 3;
        int e7 = crx0.e(byteBuffer.get());
        aVar.w = new ArrayList();
        for (int i = 0; i < e7; i++) {
            a.C0361a c0361a = new a.C0361a();
            int e8 = crx0.e(byteBuffer.get());
            c0361a.a = (e8 & 128) > 0;
            c0361a.b = (e8 & 64) > 0;
            c0361a.c = e8 & 63;
            int u3 = crx0.u(byteBuffer);
            c0361a.d = new ArrayList();
            for (int i2 = 0; i2 < u3; i2++) {
                byte[] bArr = new byte[crx0.u(byteBuffer)];
                byteBuffer.get(bArr);
                c0361a.d.add(bArr);
            }
            aVar.w.add(c0361a);
        }
    }

    public boolean equals(Object obj) {
        o0y d = whq.d(ajc$tjp_2, this, this, obj);
        w8g0.a();
        w8g0.b(d);
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = this.hevcDecoderConfigurationRecord;
        a aVar2 = ((HevcConfigurationBox) obj).hevcDecoderConfigurationRecord;
        return aVar != null ? aVar.equals(aVar2) : aVar2 == null;
    }

    public List<a.C0361a> getArrays() {
        r11.d(ajc$tjp_21, this, this);
        return this.hevcDecoderConfigurationRecord.w;
    }

    public int getAvgFrameRate() {
        r11.d(ajc$tjp_16, this, this);
        return this.hevcDecoderConfigurationRecord.r;
    }

    public int getBitDepthChromaMinus8() {
        r11.d(ajc$tjp_15, this, this);
        return this.hevcDecoderConfigurationRecord.q;
    }

    public int getBitDepthLumaMinus8() {
        r11.d(ajc$tjp_14, this, this);
        return this.hevcDecoderConfigurationRecord.o;
    }

    public int getChromaFormat() {
        r11.d(ajc$tjp_13, this, this);
        return this.hevcDecoderConfigurationRecord.m;
    }

    public int getConfigurationVersion() {
        r11.d(ajc$tjp_4, this, this);
        return this.hevcDecoderConfigurationRecord.a;
    }

    public int getConstantFrameRate() {
        r11.d(ajc$tjp_20, this, this);
        return this.hevcDecoderConfigurationRecord.s;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        a aVar = this.hevcDecoderConfigurationRecord;
        aqw.w(aVar.a, byteBuffer);
        byteBuffer.put((byte) (((aVar.b << 6) + (aVar.c ? 32 : 0) + aVar.d) & 255));
        byteBuffer.putInt((int) aVar.e);
        long j = aVar.f;
        if (aVar.x) {
            j |= 140737488355328L;
        }
        if (aVar.y) {
            j |= 70368744177664L;
        }
        if (aVar.z) {
            j |= 35184372088832L;
        }
        if (aVar.A) {
            j |= 17592186044416L;
        }
        aqw.u((int) ((281474976710655L & j) >> 32), byteBuffer);
        byteBuffer.putInt((int) (j & 4294967295L));
        byteBuffer.put((byte) (aVar.g & 255));
        aqw.u((aVar.h << 12) + aVar.i, byteBuffer);
        byteBuffer.put((byte) (((aVar.j << 2) + aVar.k) & 255));
        byteBuffer.put((byte) (((aVar.l << 2) + aVar.m) & 255));
        byteBuffer.put((byte) (((aVar.n << 3) + aVar.o) & 255));
        byteBuffer.put((byte) (((aVar.p << 3) + aVar.q) & 255));
        aqw.u(aVar.r, byteBuffer);
        byteBuffer.put((byte) (((aVar.s << 6) + (aVar.t << 3) + (aVar.u ? 4 : 0) + aVar.v) & 255));
        byteBuffer.put((byte) (aVar.w.size() & 255));
        Iterator it = aVar.w.iterator();
        while (it.hasNext()) {
            a.C0361a c0361a = (a.C0361a) it.next();
            byteBuffer.put((byte) (((c0361a.a ? 128 : 0) + (c0361a.b ? 64 : 0) + c0361a.c) & 255));
            aqw.u(c0361a.d.size(), byteBuffer);
            Iterator it2 = c0361a.d.iterator();
            while (it2.hasNext()) {
                byte[] bArr = (byte[]) it2.next();
                aqw.u(bArr.length, byteBuffer);
                byteBuffer.put(bArr);
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        Iterator it = this.hevcDecoderConfigurationRecord.w.iterator();
        int i = 23;
        while (it.hasNext()) {
            i += 3;
            Iterator it2 = ((a.C0361a) it.next()).d.iterator();
            while (it2.hasNext()) {
                i = i + 2 + ((byte[]) it2.next()).length;
            }
        }
        return i;
    }

    public long getGeneral_constraint_indicator_flags() {
        r11.d(ajc$tjp_9, this, this);
        return this.hevcDecoderConfigurationRecord.f;
    }

    public int getGeneral_level_idc() {
        r11.d(ajc$tjp_10, this, this);
        return this.hevcDecoderConfigurationRecord.g;
    }

    public long getGeneral_profile_compatibility_flags() {
        r11.d(ajc$tjp_8, this, this);
        return this.hevcDecoderConfigurationRecord.e;
    }

    public int getGeneral_profile_idc() {
        r11.d(ajc$tjp_7, this, this);
        return this.hevcDecoderConfigurationRecord.d;
    }

    public int getGeneral_profile_space() {
        r11.d(ajc$tjp_5, this, this);
        return this.hevcDecoderConfigurationRecord.b;
    }

    public a getHevcDecoderConfigurationRecord() {
        r11.d(ajc$tjp_0, this, this);
        return this.hevcDecoderConfigurationRecord;
    }

    public int getLengthSizeMinusOne() {
        r11.d(ajc$tjp_18, this, this);
        return this.hevcDecoderConfigurationRecord.v;
    }

    public int getMin_spatial_segmentation_idc() {
        r11.d(ajc$tjp_11, this, this);
        return this.hevcDecoderConfigurationRecord.i;
    }

    public int getNumTemporalLayers() {
        r11.d(ajc$tjp_17, this, this);
        return this.hevcDecoderConfigurationRecord.t;
    }

    public int getParallelismType() {
        r11.d(ajc$tjp_12, this, this);
        return this.hevcDecoderConfigurationRecord.k;
    }

    public int hashCode() {
        r11.d(ajc$tjp_3, this, this);
        a aVar = this.hevcDecoderConfigurationRecord;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public boolean isGeneral_tier_flag() {
        r11.d(ajc$tjp_6, this, this);
        return this.hevcDecoderConfigurationRecord.c;
    }

    public boolean isTemporalIdNested() {
        r11.d(ajc$tjp_19, this, this);
        return this.hevcDecoderConfigurationRecord.u;
    }

    public void setHevcDecoderConfigurationRecord(a aVar) {
        o0y d = whq.d(ajc$tjp_1, this, this, aVar);
        w8g0.a();
        w8g0.b(d);
        this.hevcDecoderConfigurationRecord = aVar;
    }
}
