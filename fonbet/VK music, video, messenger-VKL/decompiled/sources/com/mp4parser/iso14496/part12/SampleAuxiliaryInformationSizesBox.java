package com.mp4parser.iso14496.part12;

import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import xsna.aqw;
import xsna.crx0;
import xsna.etx;
import xsna.i5s;
import xsna.n0y;
import xsna.o0y;
import xsna.up2;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes14.dex */
public class SampleAuxiliaryInformationSizesBox extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = "saiz";
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
    private String auxInfoType;
    private String auxInfoTypeParameter;
    private short defaultSampleInfoSize;
    private int sampleCount;
    private short[] sampleInfoSizes;

    static {
        ajc$preClinit();
    }

    public SampleAuxiliaryInformationSizesBox() {
        super(TYPE);
        this.sampleInfoSizes = new short[0];
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("SampleAuxiliaryInformationSizesBox.java", SampleAuxiliaryInformationSizesBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getSize", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "int", "index", "", "short"));
        ajc$tjp_1 = whqVar.f(whqVar.e("getAuxInfoType", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"));
        ajc$tjp_10 = whqVar.f(whqVar.e("setSampleCount", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "int", "sampleCount", "", "void"));
        ajc$tjp_11 = whqVar.f(whqVar.e("toString", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"));
        ajc$tjp_2 = whqVar.f(whqVar.e("setAuxInfoType", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "java.lang.String", "auxInfoType", "", "void"));
        ajc$tjp_3 = whqVar.f(whqVar.e("getAuxInfoTypeParameter", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"));
        ajc$tjp_4 = whqVar.f(whqVar.e("setAuxInfoTypeParameter", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "java.lang.String", "auxInfoTypeParameter", "", "void"));
        ajc$tjp_5 = whqVar.f(whqVar.e("getDefaultSampleInfoSize", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "int"));
        ajc$tjp_6 = whqVar.f(whqVar.e("setDefaultSampleInfoSize", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "int", "defaultSampleInfoSize", "", "void"));
        ajc$tjp_7 = whqVar.f(whqVar.e("getSampleInfoSizes", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "[S"));
        ajc$tjp_8 = whqVar.f(whqVar.e("setSampleInfoSizes", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "[S", "sampleInfoSizes", "", "void"));
        ajc$tjp_9 = whqVar.f(whqVar.e("getSampleCount", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "int"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.auxInfoType = crx0.n(byteBuffer);
            this.auxInfoTypeParameter = crx0.n(byteBuffer);
        }
        this.defaultSampleInfoSize = (short) crx0.y(byteBuffer);
        int p = up2.p(crx0.w(byteBuffer));
        this.sampleCount = p;
        if (this.defaultSampleInfoSize == 0) {
            this.sampleInfoSizes = new short[p];
            for (int i = 0; i < this.sampleCount; i++) {
                this.sampleInfoSizes[i] = (short) crx0.e(byteBuffer.get());
            }
        }
    }

    public String getAuxInfoType() {
        o0y c = whq.c(ajc$tjp_1, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.auxInfoType;
    }

    public String getAuxInfoTypeParameter() {
        o0y c = whq.c(ajc$tjp_3, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.auxInfoTypeParameter;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if ((getFlags() & 1) == 1) {
            byteBuffer.put(etx.c(this.auxInfoType));
            byteBuffer.put(etx.c(this.auxInfoTypeParameter));
        }
        aqw.w(this.defaultSampleInfoSize, byteBuffer);
        if (this.defaultSampleInfoSize != 0) {
            byteBuffer.putInt(this.sampleCount);
            return;
        }
        byteBuffer.putInt(this.sampleInfoSizes.length);
        for (short s : this.sampleInfoSizes) {
            byteBuffer.put((byte) (s & 255));
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return ((getFlags() & 1) == 1 ? 12 : 4) + 5 + (this.defaultSampleInfoSize == 0 ? this.sampleInfoSizes.length : 0);
    }

    public int getDefaultSampleInfoSize() {
        o0y c = whq.c(ajc$tjp_5, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.defaultSampleInfoSize;
    }

    public int getSampleCount() {
        o0y c = whq.c(ajc$tjp_9, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.sampleCount;
    }

    public short[] getSampleInfoSizes() {
        o0y c = whq.c(ajc$tjp_7, this, this);
        w8g0.a();
        w8g0.b(c);
        short[] sArr = this.sampleInfoSizes;
        short[] sArr2 = new short[sArr.length];
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
        return sArr2;
    }

    public short getSize(int i) {
        o0y d = whq.d(ajc$tjp_0, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        return getDefaultSampleInfoSize() == 0 ? this.sampleInfoSizes[i] : this.defaultSampleInfoSize;
    }

    public void setAuxInfoType(String str) {
        o0y d = whq.d(ajc$tjp_2, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.auxInfoType = str;
    }

    public void setAuxInfoTypeParameter(String str) {
        o0y d = whq.d(ajc$tjp_4, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.auxInfoTypeParameter = str;
    }

    public void setDefaultSampleInfoSize(int i) {
        o0y d = whq.d(ajc$tjp_6, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.defaultSampleInfoSize = (short) i;
    }

    public void setSampleCount(int i) {
        o0y d = whq.d(ajc$tjp_10, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.sampleCount = i;
    }

    public void setSampleInfoSizes(short[] sArr) {
        o0y d = whq.d(ajc$tjp_8, this, this, sArr);
        w8g0.a();
        w8g0.b(d);
        short[] sArr2 = new short[sArr.length];
        this.sampleInfoSizes = sArr2;
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_11, this, this);
        w8g0.a();
        w8g0.b(c);
        StringBuilder sb = new StringBuilder("SampleAuxiliaryInformationSizesBox{defaultSampleInfoSize=");
        sb.append((int) this.defaultSampleInfoSize);
        sb.append(", sampleCount=");
        sb.append(this.sampleCount);
        sb.append(", auxInfoType='");
        sb.append(this.auxInfoType);
        sb.append("', auxInfoTypeParameter='");
        return i5s.a(sb, this.auxInfoTypeParameter, "'}");
    }
}
