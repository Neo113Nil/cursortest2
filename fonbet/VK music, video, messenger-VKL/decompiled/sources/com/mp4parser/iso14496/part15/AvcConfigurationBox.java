package com.mp4parser.iso14496.part15;

import com.googlecode.mp4parser.AbstractBox;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.ct5;
import xsna.n0y;
import xsna.o0y;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes14.dex */
public final class AvcConfigurationBox extends AbstractBox {
    public static final String TYPE = "avcC";
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
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    private static final /* synthetic */ n0y ajc$tjp_6 = null;
    private static final /* synthetic */ n0y ajc$tjp_7 = null;
    private static final /* synthetic */ n0y ajc$tjp_8 = null;
    private static final /* synthetic */ n0y ajc$tjp_9 = null;
    public ct5 avcDecoderConfigurationRecord;

    static {
        ajc$preClinit();
    }

    public AvcConfigurationBox() {
        super(TYPE);
        ct5 ct5Var = new ct5();
        ct5Var.f = new ArrayList();
        ct5Var.g = new ArrayList();
        ct5Var.h = true;
        ct5Var.i = 1;
        ct5Var.j = 0;
        ct5Var.k = 0;
        ct5Var.l = new ArrayList();
        ct5Var.m = 63;
        ct5Var.n = 7;
        ct5Var.o = 31;
        ct5Var.p = 31;
        ct5Var.q = 31;
        this.avcDecoderConfigurationRecord = ct5Var;
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("AvcConfigurationBox.java", AvcConfigurationBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"));
        ajc$tjp_1 = whqVar.f(whqVar.e("getAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"));
        ajc$tjp_10 = whqVar.f(whqVar.e("setAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "", "void"));
        ajc$tjp_11 = whqVar.f(whqVar.e("setLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "", "void"));
        ajc$tjp_12 = whqVar.f(whqVar.e("setSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "", "void"));
        ajc$tjp_13 = whqVar.f(whqVar.e("setPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "", "void"));
        ajc$tjp_14 = whqVar.f(whqVar.e("getChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"));
        ajc$tjp_15 = whqVar.f(whqVar.e("setChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "", "void"));
        ajc$tjp_16 = whqVar.f(whqVar.e("getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"));
        ajc$tjp_17 = whqVar.f(whqVar.e("setBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "", "void"));
        ajc$tjp_18 = whqVar.f(whqVar.e("getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"));
        ajc$tjp_19 = whqVar.f(whqVar.e("setBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("getProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"));
        ajc$tjp_20 = whqVar.f(whqVar.e("getSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"));
        ajc$tjp_21 = whqVar.f(whqVar.e("setSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "", "void"));
        ajc$tjp_22 = whqVar.f(whqVar.e("hasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "boolean"));
        ajc$tjp_23 = whqVar.f(whqVar.e("setHasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "boolean", "hasExts", "", "void"));
        ajc$tjp_24 = whqVar.f(whqVar.e("getContentSize", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "long"));
        ajc$tjp_25 = whqVar.f(whqVar.e("getContent", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"));
        ajc$tjp_26 = whqVar.f(whqVar.e("getSPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "[Ljava.lang.String;"));
        ajc$tjp_27 = whqVar.f(whqVar.e("getPPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "[Ljava.lang.String;"));
        ajc$tjp_28 = whqVar.f(whqVar.e("getavcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"));
        ajc$tjp_29 = whqVar.f(whqVar.e("toString", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.lang.String"));
        ajc$tjp_3 = whqVar.f(whqVar.e("getAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"));
        ajc$tjp_4 = whqVar.f(whqVar.e("getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"));
        ajc$tjp_5 = whqVar.f(whqVar.e("getSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"));
        ajc$tjp_6 = whqVar.f(whqVar.e("getPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"));
        ajc$tjp_7 = whqVar.f(whqVar.e("setConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "", "void"));
        ajc$tjp_8 = whqVar.f(whqVar.e("setAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "", "void"));
        ajc$tjp_9 = whqVar.f(whqVar.e("setProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "", "void"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.avcDecoderConfigurationRecord = new ct5(byteBuffer);
    }

    public int getAvcLevelIndication() {
        o0y c = whq.c(ajc$tjp_3, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.avcDecoderConfigurationRecord.d;
    }

    public int getAvcProfileIndication() {
        o0y c = whq.c(ajc$tjp_1, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.avcDecoderConfigurationRecord.b;
    }

    public int getBitDepthChromaMinus8() {
        o0y c = whq.c(ajc$tjp_18, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.avcDecoderConfigurationRecord.k;
    }

    public int getBitDepthLumaMinus8() {
        o0y c = whq.c(ajc$tjp_16, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.avcDecoderConfigurationRecord.j;
    }

    public int getChromaFormat() {
        o0y c = whq.c(ajc$tjp_14, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.avcDecoderConfigurationRecord.i;
    }

    public int getConfigurationVersion() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.avcDecoderConfigurationRecord.a;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        o0y d = whq.d(ajc$tjp_25, this, this, byteBuffer);
        w8g0.a();
        w8g0.b(d);
        this.avcDecoderConfigurationRecord.a(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        o0y c = whq.c(ajc$tjp_24, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.avcDecoderConfigurationRecord.b();
    }

    public int getLengthSizeMinusOne() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.avcDecoderConfigurationRecord.e;
    }

    public String[] getPPS() {
        o0y c = whq.c(ajc$tjp_27, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.avcDecoderConfigurationRecord.c();
    }

    public List<byte[]> getPictureParameterSets() {
        o0y c = whq.c(ajc$tjp_6, this, this);
        w8g0.a();
        w8g0.b(c);
        return Collections.unmodifiableList(this.avcDecoderConfigurationRecord.g);
    }

    public int getProfileCompatibility() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.avcDecoderConfigurationRecord.c;
    }

    public String[] getSPS() {
        o0y c = whq.c(ajc$tjp_26, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.avcDecoderConfigurationRecord.e();
    }

    public List<byte[]> getSequenceParameterSetExts() {
        o0y c = whq.c(ajc$tjp_20, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.avcDecoderConfigurationRecord.l;
    }

    public List<byte[]> getSequenceParameterSets() {
        o0y c = whq.c(ajc$tjp_5, this, this);
        w8g0.a();
        w8g0.b(c);
        return Collections.unmodifiableList(this.avcDecoderConfigurationRecord.f);
    }

    public ct5 getavcDecoderConfigurationRecord() {
        o0y c = whq.c(ajc$tjp_28, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.avcDecoderConfigurationRecord;
    }

    public boolean hasExts() {
        o0y c = whq.c(ajc$tjp_22, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.avcDecoderConfigurationRecord.h;
    }

    public void setAvcLevelIndication(int i) {
        o0y d = whq.d(ajc$tjp_10, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.avcDecoderConfigurationRecord.d = i;
    }

    public void setAvcProfileIndication(int i) {
        o0y d = whq.d(ajc$tjp_8, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.avcDecoderConfigurationRecord.b = i;
    }

    public void setBitDepthChromaMinus8(int i) {
        o0y d = whq.d(ajc$tjp_19, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.avcDecoderConfigurationRecord.k = i;
    }

    public void setBitDepthLumaMinus8(int i) {
        o0y d = whq.d(ajc$tjp_17, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.avcDecoderConfigurationRecord.j = i;
    }

    public void setChromaFormat(int i) {
        o0y d = whq.d(ajc$tjp_15, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.avcDecoderConfigurationRecord.i = i;
    }

    public void setConfigurationVersion(int i) {
        o0y d = whq.d(ajc$tjp_7, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.avcDecoderConfigurationRecord.a = i;
    }

    public void setHasExts(boolean z) {
        o0y d = whq.d(ajc$tjp_23, this, this, new Boolean(z));
        w8g0.a();
        w8g0.b(d);
        this.avcDecoderConfigurationRecord.h = z;
    }

    public void setLengthSizeMinusOne(int i) {
        o0y d = whq.d(ajc$tjp_11, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.avcDecoderConfigurationRecord.e = i;
    }

    public void setPictureParameterSets(List<byte[]> list) {
        o0y d = whq.d(ajc$tjp_13, this, this, list);
        w8g0.a();
        w8g0.b(d);
        this.avcDecoderConfigurationRecord.g = list;
    }

    public void setProfileCompatibility(int i) {
        o0y d = whq.d(ajc$tjp_9, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.avcDecoderConfigurationRecord.c = i;
    }

    public void setSequenceParameterSetExts(List<byte[]> list) {
        o0y d = whq.d(ajc$tjp_21, this, this, list);
        w8g0.a();
        w8g0.b(d);
        this.avcDecoderConfigurationRecord.l = list;
    }

    public void setSequenceParameterSets(List<byte[]> list) {
        o0y d = whq.d(ajc$tjp_12, this, this, list);
        w8g0.a();
        w8g0.b(d);
        this.avcDecoderConfigurationRecord.f = list;
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_29, this, this);
        w8g0.a();
        w8g0.b(c);
        return "AvcConfigurationBox{avcDecoderConfigurationRecord=" + this.avcDecoderConfigurationRecord + '}';
    }
}
