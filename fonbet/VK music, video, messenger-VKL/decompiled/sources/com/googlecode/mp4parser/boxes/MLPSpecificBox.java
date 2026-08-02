package com.googlecode.mp4parser.boxes;

import com.googlecode.mp4parser.AbstractBox;
import java.nio.ByteBuffer;
import xsna.lb7;
import xsna.mb7;
import xsna.n0y;
import xsna.o0y;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes13.dex */
public class MLPSpecificBox extends AbstractBox {
    public static final String TYPE = "dmlp";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    private static final /* synthetic */ n0y ajc$tjp_6 = null;
    private static final /* synthetic */ n0y ajc$tjp_7 = null;
    int format_info;
    int peak_data_rate;
    int reserved;
    int reserved2;

    static {
        ajc$preClinit();
    }

    public MLPSpecificBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("MLPSpecificBox.java", MLPSpecificBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getFormat_info", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", "int"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setFormat_info", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "int", "format_info", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("getPeak_data_rate", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", "int"));
        ajc$tjp_3 = whqVar.f(whqVar.e("setPeak_data_rate", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "int", "peak_data_rate", "", "void"));
        ajc$tjp_4 = whqVar.f(whqVar.e("getReserved", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", "int"));
        ajc$tjp_5 = whqVar.f(whqVar.e("setReserved", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "int", "reserved", "", "void"));
        ajc$tjp_6 = whqVar.f(whqVar.e("getReserved2", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", "int"));
        ajc$tjp_7 = whqVar.f(whqVar.e("setReserved2", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "int", "reserved2", "", "void"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        lb7 lb7Var = new lb7(byteBuffer);
        this.format_info = lb7Var.a(32);
        this.peak_data_rate = lb7Var.a(15);
        this.reserved = lb7Var.a(1);
        this.reserved2 = lb7Var.a(32);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        mb7 mb7Var = new mb7(byteBuffer);
        mb7Var.a(this.format_info, 32);
        mb7Var.a(this.peak_data_rate, 15);
        mb7Var.a(this.reserved, 1);
        mb7Var.a(this.reserved2, 32);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 10L;
    }

    public int getFormat_info() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.format_info;
    }

    public int getPeak_data_rate() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.peak_data_rate;
    }

    public int getReserved() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.reserved;
    }

    public int getReserved2() {
        o0y c = whq.c(ajc$tjp_6, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.reserved2;
    }

    public void setFormat_info(int i) {
        o0y d = whq.d(ajc$tjp_1, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.format_info = i;
    }

    public void setPeak_data_rate(int i) {
        o0y d = whq.d(ajc$tjp_3, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.peak_data_rate = i;
    }

    public void setReserved(int i) {
        o0y d = whq.d(ajc$tjp_5, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.reserved = i;
    }

    public void setReserved2(int i) {
        o0y d = whq.d(ajc$tjp_7, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.reserved2 = i;
    }
}
