package com.moloco.sdk;

import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class w extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int BRAND_FIELD_NUMBER = 23;
    public static final int CARRIER_FIELD_NUMBER = 6;
    public static final int DBT_FIELD_NUMBER = 15;
    private static final w DEFAULT_INSTANCE;
    public static final int DEVICETYPE_FIELD_NUMBER = 7;
    public static final int GEO_FIELD_NUMBER = 9;
    public static final int HARDWARE_FIELD_NUMBER = 22;
    public static final int HAS_GY_FIELD_NUMBER = 17;
    public static final int HWV_FIELD_NUMBER = 5;
    public static final int H_FIELD_NUMBER = 11;
    public static final int JS_FIELD_NUMBER = 8;
    public static final int KB_LOC_FIELD_NUMBER = 18;
    public static final int LANGUAGE_FIELD_NUMBER = 1;
    public static final int LOCALE_FIELD_NUMBER = 19;
    public static final int MAKE_FIELD_NUMBER = 3;
    public static final int MODEL_FIELD_NUMBER = 4;
    public static final int ORTN_FIELD_NUMBER = 16;
    public static final int OSV_FIELD_NUMBER = 2;
    public static final int OS_FIELD_NUMBER = 14;
    private static volatile Parser<w> PARSER = null;
    public static final int PPI_FIELD_NUMBER = 12;
    public static final int PXRATIO_FIELD_NUMBER = 13;
    public static final int W_FIELD_NUMBER = 10;
    public static final int XDPI_FIELD_NUMBER = 20;
    public static final int YDPI_FIELD_NUMBER = 21;
    private int bitField0_;
    private long dbt_;
    private int devicetype_;
    private a0 geo_;
    private int h_;
    private boolean hasGy_;
    private int js_;
    private int ortn_;
    private int ppi_;
    private double pxratio_;
    private int w_;
    private float xdpi_;
    private float ydpi_;
    private String language_ = "";
    private String osv_ = "";
    private String make_ = "";
    private String model_ = "";
    private String hwv_ = "";
    private String carrier_ = "";
    private String os_ = "";
    private String kbLoc_ = "";
    private String locale_ = "";
    private String hardware_ = "";
    private String brand_ = "";

    static {
        w wVar = new w();
        DEFAULT_INSTANCE = wVar;
        GeneratedMessageLite.registerDefaultInstance(w.class, wVar);
    }

    public static u h() {
        return (u) DEFAULT_INSTANCE.createBuilder();
    }

    public final void A(float f) {
        this.bitField0_ |= 524288;
        this.xdpi_ = f;
    }

    public final void B(float f) {
        this.bitField0_ |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        this.ydpi_ = f;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new w();
            case 2:
                return new u(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0017\u0000\u0001\u0001\u0017\u0017\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ဋ\u0006\bဋ\u0007\tဉ\b\nဋ\t\u000bဋ\n\fဋ\u000b\rက\f\u000eለ\r\u000fဃ\u000e\u0010ဌ\u000f\u0011ဇ\u0010\u0012ለ\u0011\u0013ለ\u0012\u0014ခ\u0013\u0015ခ\u0014\u0016ለ\u0015\u0017ለ\u0016", new Object[]{"bitField0_", "language_", "osv_", "make_", "model_", "hwv_", "carrier_", "devicetype_", "js_", "geo_", "w_", "h_", "ppi_", "pxratio_", "os_", "dbt_", "ortn_", "hasGy_", "kbLoc_", "locale_", "xdpi_", "ydpi_", "hardware_", "brand_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<w> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (w.class) {
                    try {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            default:
                a70.i();
            case 7:
                return null;
        }
    }

    public final void i(String str) {
        this.bitField0_ |= 4194304;
        this.brand_ = str;
    }

    public final void j(String str) {
        this.bitField0_ |= 32;
        this.carrier_ = str;
    }

    public final void k(long j) {
        this.bitField0_ |= 16384;
        this.dbt_ = j;
    }

    public final void l(int i) {
        this.bitField0_ |= 64;
        this.devicetype_ = i;
    }

    public final void m(a0 a0Var) {
        a0Var.getClass();
        this.geo_ = a0Var;
        this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
    }

    public final void n(int i) {
        this.bitField0_ |= 1024;
        this.h_ = i;
    }

    public final void o(String str) {
        this.bitField0_ |= 2097152;
        this.hardware_ = str;
    }

    public final void p(boolean z) {
        this.bitField0_ |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
        this.hasGy_ = z;
    }

    public final void q(String str) {
        this.bitField0_ |= 16;
        this.hwv_ = str;
    }

    public final void r() {
        this.bitField0_ |= 128;
        this.js_ = 1;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 131072;
        this.kbLoc_ = str;
    }

    public final void setLanguage(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.language_ = str;
    }

    public final void setMake(String str) {
        this.bitField0_ |= 4;
        this.make_ = str;
    }

    public final void setModel(String str) {
        this.bitField0_ |= 8;
        this.model_ = str;
    }

    public final void t(String str) {
        str.getClass();
        this.bitField0_ |= 262144;
        this.locale_ = str;
    }

    public final void u(v vVar) {
        this.ortn_ = vVar.getNumber();
        this.bitField0_ |= 32768;
    }

    public final void v() {
        this.bitField0_ |= 8192;
        this.os_ = "android";
    }

    public final void w() {
        String str = Build.VERSION.RELEASE;
        str.getClass();
        this.bitField0_ |= 2;
        this.osv_ = str;
    }

    public final void x(int i) {
        this.bitField0_ |= com.ironsource.mediationsdk.metadata.a.o;
        this.ppi_ = i;
    }

    public final void y(double d) {
        this.bitField0_ |= 4096;
        this.pxratio_ = d;
    }

    public final void z(int i) {
        this.bitField0_ |= 512;
        this.w_ = i;
    }
}
