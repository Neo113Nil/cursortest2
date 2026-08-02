package com.vk.reefton.protocol;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import xsna.lof0;

/* compiled from: ReefProtocol.java */
/* loaded from: classes5.dex */
public final class j extends GeneratedMessageLite<j, a> implements MessageLiteOrBuilder {
    private static final j DEFAULT_INSTANCE;
    public static final int EVENTSOURCE_FIELD_NUMBER = 1;
    public static final int HTTPREQUESTHOST_FIELD_NUMBER = 10;
    public static final int HTTPRESPONSECODE_FIELD_NUMBER = 11;
    public static final int IMAGEAPPEARINGTIME_FIELD_NUMBER = 7;
    public static final int IMAGEFORMAT_FIELD_NUMBER = 6;
    public static final int IMAGEPROCESSINGTIME_FIELD_NUMBER = 8;
    public static final int IMAGESIZEBYTES_FIELD_NUMBER = 3;
    public static final int IMAGESIZEPIXELS_FIELD_NUMBER = 4;
    public static final int IMAGEWIDTHPIXELS_FIELD_NUMBER = 5;
    private static volatile Parser<j> PARSER = null;
    public static final int PROTOCOL_FIELD_NUMBER = 9;
    public static final int RESPONSETIME_FIELD_NUMBER = 13;
    public static final int RESPONSETTFB_FIELD_NUMBER = 12;
    public static final int STATUS_FIELD_NUMBER = 2;
    private int httpResponseCode_;
    private int imageAppearingTime_;
    private int imageProcessingTime_;
    private int imageSizeBytes_;
    private int imageSizePixels_;
    private int imageWidthPixels_;
    private int responseTime_;
    private int responseTtfb_;
    private String eventSource_ = "";
    private String status_ = "";
    private String imageFormat_ = "";
    private String protocol_ = "";
    private String httpRequestHost_ = "";

    /* compiled from: ReefProtocol.java */
    public static final class a extends GeneratedMessageLite.Builder<j, a> implements MessageLiteOrBuilder {
        public a() {
            super(j.DEFAULT_INSTANCE);
        }

        public final void b(String str) {
            copyOnWrite();
            j.b((j) this.instance, str);
        }

        public final void c(String str) {
            copyOnWrite();
            j.c((j) this.instance, str);
        }

        public final void d(int i) {
            copyOnWrite();
            j.d((j) this.instance, i);
        }

        public final void f(int i) {
            copyOnWrite();
            j.f((j) this.instance, i);
        }

        public final void g(String str) {
            copyOnWrite();
            j.g((j) this.instance, str);
        }

        public final void h(int i) {
            copyOnWrite();
            j.h((j) this.instance, i);
        }

        public final void m(int i) {
            copyOnWrite();
            j.m((j) this.instance, i);
        }

        public final void n(int i) {
            copyOnWrite();
            j.n((j) this.instance, i);
        }

        public final void o(int i) {
            copyOnWrite();
            j.o((j) this.instance, i);
        }

        public final void p(String str) {
            copyOnWrite();
            j.p((j) this.instance, str);
        }

        public final void q(int i) {
            copyOnWrite();
            j.q((j) this.instance, i);
        }

        public final void r(int i) {
            copyOnWrite();
            j.r((j) this.instance, i);
        }

        public final void s(String str) {
            copyOnWrite();
            j.s((j) this.instance, str);
        }
    }

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        GeneratedMessageLite.registerDefaultInstance(j.class, jVar);
    }

    public static void b(j jVar, String str) {
        jVar.getClass();
        str.getClass();
        jVar.eventSource_ = str;
    }

    public static void c(j jVar, String str) {
        jVar.getClass();
        jVar.httpRequestHost_ = str;
    }

    public static void d(j jVar, int i) {
        jVar.httpResponseCode_ = i;
    }

    public static void f(j jVar, int i) {
        jVar.imageAppearingTime_ = i;
    }

    public static void g(j jVar, String str) {
        jVar.getClass();
        jVar.imageFormat_ = str;
    }

    public static void h(j jVar, int i) {
        jVar.imageProcessingTime_ = i;
    }

    public static void m(j jVar, int i) {
        jVar.imageSizeBytes_ = i;
    }

    public static void n(j jVar, int i) {
        jVar.imageSizePixels_ = i;
    }

    public static void o(j jVar, int i) {
        jVar.imageWidthPixels_ = i;
    }

    public static void p(j jVar, String str) {
        jVar.getClass();
        jVar.protocol_ = str;
    }

    public static void q(j jVar, int i) {
        jVar.responseTime_ = i;
    }

    public static void r(j jVar, int i) {
        jVar.responseTtfb_ = i;
    }

    public static void s(j jVar, String str) {
        jVar.getClass();
        jVar.status_ = str;
    }

    public static a u() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (lof0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new j();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u0004\u0005\u0004\u0006Ȉ\u0007\u0004\b\u0004\tȈ\nȈ\u000b\u0004\f\u0004\r\u0004", new Object[]{"eventSource_", "status_", "imageSizeBytes_", "imageSizePixels_", "imageWidthPixels_", "imageFormat_", "imageAppearingTime_", "imageProcessingTime_", "protocol_", "httpRequestHost_", "httpResponseCode_", "responseTtfb_", "responseTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<j> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (j.class) {
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
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
