package com.vk.reefton.protocol;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int32Value;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import xsna.lof0;

/* compiled from: ReefProtocol.java */
/* loaded from: classes5.dex */
public final class w extends GeneratedMessageLite<w, a> implements MessageLiteOrBuilder {
    public static final int CQI_FIELD_NUMBER = 2;
    private static final w DEFAULT_INSTANCE;
    private static volatile Parser<w> PARSER = null;
    public static final int RSRP_FIELD_NUMBER = 3;
    public static final int RSRQ_FIELD_NUMBER = 4;
    public static final int RSSI_FIELD_NUMBER = 5;
    public static final int RSSNR_FIELD_NUMBER = 1;
    public static final int TIMINGADVANCE_FIELD_NUMBER = 6;
    private Int32Value cqi_;
    private Int32Value rsrp_;
    private Int32Value rsrq_;
    private Int32Value rssi_;
    private Int32Value rssnr_;
    private Int32Value timingAdvance_;

    /* compiled from: ReefProtocol.java */
    public static final class a extends GeneratedMessageLite.Builder<w, a> implements MessageLiteOrBuilder {
        public a() {
            super(w.DEFAULT_INSTANCE);
        }

        public final void b(Int32Value int32Value) {
            copyOnWrite();
            w.b((w) this.instance, int32Value);
        }

        public final void c(Int32Value int32Value) {
            copyOnWrite();
            w.c((w) this.instance, int32Value);
        }

        public final void d(Int32Value int32Value) {
            copyOnWrite();
            w.d((w) this.instance, int32Value);
        }

        public final void f(Int32Value int32Value) {
            copyOnWrite();
            w.f((w) this.instance, int32Value);
        }

        public final void g(Int32Value int32Value) {
            copyOnWrite();
            w.g((w) this.instance, int32Value);
        }

        public final void h(Int32Value int32Value) {
            copyOnWrite();
            w.h((w) this.instance, int32Value);
        }
    }

    static {
        w wVar = new w();
        DEFAULT_INSTANCE = wVar;
        GeneratedMessageLite.registerDefaultInstance(w.class, wVar);
    }

    public static void b(w wVar, Int32Value int32Value) {
        wVar.getClass();
        int32Value.getClass();
        wVar.cqi_ = int32Value;
    }

    public static void c(w wVar, Int32Value int32Value) {
        wVar.getClass();
        int32Value.getClass();
        wVar.rsrp_ = int32Value;
    }

    public static void d(w wVar, Int32Value int32Value) {
        wVar.getClass();
        int32Value.getClass();
        wVar.rsrq_ = int32Value;
    }

    public static void f(w wVar, Int32Value int32Value) {
        wVar.getClass();
        int32Value.getClass();
        wVar.rssi_ = int32Value;
    }

    public static void g(w wVar, Int32Value int32Value) {
        wVar.getClass();
        int32Value.getClass();
        wVar.rssnr_ = int32Value;
    }

    public static void h(w wVar, Int32Value int32Value) {
        wVar.getClass();
        int32Value.getClass();
        wVar.timingAdvance_ = int32Value;
    }

    public static a n() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (lof0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new w();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t", new Object[]{"rssnr_", "cqi_", "rsrp_", "rsrq_", "rssi_", "timingAdvance_"});
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
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
