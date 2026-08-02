package com.googlecode.mp4parser.boxes;

import com.googlecode.mp4parser.AbstractBox;
import java.nio.ByteBuffer;
import xsna.lb7;
import xsna.mb7;
import xsna.n0y;
import xsna.o0y;
import xsna.vu5;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes13.dex */
public class AC3SpecificBox extends AbstractBox {
    public static final String TYPE = "dac3";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_10 = null;
    private static final /* synthetic */ n0y ajc$tjp_11 = null;
    private static final /* synthetic */ n0y ajc$tjp_12 = null;
    private static final /* synthetic */ n0y ajc$tjp_13 = null;
    private static final /* synthetic */ n0y ajc$tjp_14 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    private static final /* synthetic */ n0y ajc$tjp_6 = null;
    private static final /* synthetic */ n0y ajc$tjp_7 = null;
    private static final /* synthetic */ n0y ajc$tjp_8 = null;
    private static final /* synthetic */ n0y ajc$tjp_9 = null;
    int acmod;
    int bitRateCode;
    int bsid;
    int bsmod;
    int fscod;
    int lfeon;
    int reserved;

    static {
        ajc$preClinit();
    }

    public AC3SpecificBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("AC3SpecificBox.java", AC3SpecificBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getFscod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setFscod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "fscod", "", "void"));
        ajc$tjp_10 = whqVar.f(whqVar.e("getBitRateCode", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"));
        ajc$tjp_11 = whqVar.f(whqVar.e("setBitRateCode", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "bitRateCode", "", "void"));
        ajc$tjp_12 = whqVar.f(whqVar.e("getReserved", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"));
        ajc$tjp_13 = whqVar.f(whqVar.e("setReserved", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "reserved", "", "void"));
        ajc$tjp_14 = whqVar.f(whqVar.e("toString", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "java.lang.String"));
        ajc$tjp_2 = whqVar.f(whqVar.e("getBsid", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"));
        ajc$tjp_3 = whqVar.f(whqVar.e("setBsid", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "bsid", "", "void"));
        ajc$tjp_4 = whqVar.f(whqVar.e("getBsmod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"));
        ajc$tjp_5 = whqVar.f(whqVar.e("setBsmod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "bsmod", "", "void"));
        ajc$tjp_6 = whqVar.f(whqVar.e("getAcmod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"));
        ajc$tjp_7 = whqVar.f(whqVar.e("setAcmod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "acmod", "", "void"));
        ajc$tjp_8 = whqVar.f(whqVar.e("getLfeon", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"));
        ajc$tjp_9 = whqVar.f(whqVar.e("setLfeon", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "lfeon", "", "void"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        lb7 lb7Var = new lb7(byteBuffer);
        this.fscod = lb7Var.a(2);
        this.bsid = lb7Var.a(5);
        this.bsmod = lb7Var.a(3);
        this.acmod = lb7Var.a(3);
        this.lfeon = lb7Var.a(1);
        this.bitRateCode = lb7Var.a(5);
        this.reserved = lb7Var.a(5);
    }

    public int getAcmod() {
        o0y c = whq.c(ajc$tjp_6, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.acmod;
    }

    public int getBitRateCode() {
        o0y c = whq.c(ajc$tjp_10, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.bitRateCode;
    }

    public int getBsid() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.bsid;
    }

    public int getBsmod() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.bsmod;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        mb7 mb7Var = new mb7(byteBuffer);
        mb7Var.a(this.fscod, 2);
        mb7Var.a(this.bsid, 5);
        mb7Var.a(this.bsmod, 3);
        mb7Var.a(this.acmod, 3);
        mb7Var.a(this.lfeon, 1);
        mb7Var.a(this.bitRateCode, 5);
        mb7Var.a(this.reserved, 5);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 3L;
    }

    public int getFscod() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.fscod;
    }

    public int getLfeon() {
        o0y c = whq.c(ajc$tjp_8, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.lfeon;
    }

    public int getReserved() {
        o0y c = whq.c(ajc$tjp_12, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.reserved;
    }

    public void setAcmod(int i) {
        o0y d = whq.d(ajc$tjp_7, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.acmod = i;
    }

    public void setBitRateCode(int i) {
        o0y d = whq.d(ajc$tjp_11, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.bitRateCode = i;
    }

    public void setBsid(int i) {
        o0y d = whq.d(ajc$tjp_3, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.bsid = i;
    }

    public void setBsmod(int i) {
        o0y d = whq.d(ajc$tjp_5, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.bsmod = i;
    }

    public void setFscod(int i) {
        o0y d = whq.d(ajc$tjp_1, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.fscod = i;
    }

    public void setLfeon(int i) {
        o0y d = whq.d(ajc$tjp_9, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.lfeon = i;
    }

    public void setReserved(int i) {
        o0y d = whq.d(ajc$tjp_13, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.reserved = i;
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_14, this, this);
        w8g0.a();
        w8g0.b(c);
        StringBuilder sb = new StringBuilder("AC3SpecificBox{fscod=");
        sb.append(this.fscod);
        sb.append(", bsid=");
        sb.append(this.bsid);
        sb.append(", bsmod=");
        sb.append(this.bsmod);
        sb.append(", acmod=");
        sb.append(this.acmod);
        sb.append(", lfeon=");
        sb.append(this.lfeon);
        sb.append(", bitRateCode=");
        sb.append(this.bitRateCode);
        sb.append(", reserved=");
        return vu5.b(sb, this.reserved, '}');
    }
}
