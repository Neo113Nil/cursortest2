package com.vk.reefton.protocol;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int32Value;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import xsna.lof0;

/* compiled from: ReefProtocol.java */
/* loaded from: classes5.dex */
public final class p extends GeneratedMessageLite<p, a> implements MessageLiteOrBuilder {
    public static final int BER_FIELD_NUMBER = 8;
    public static final int CQI_FIELD_NUMBER = 5;
    private static final p DEFAULT_INSTANCE;
    public static final int ECNO_FIELD_NUMBER = 10;
    private static volatile Parser<p> PARSER = null;
    public static final int RSCP_FIELD_NUMBER = 9;
    public static final int RSRP_FIELD_NUMBER = 2;
    public static final int RSRQ_FIELD_NUMBER = 3;
    public static final int RSSI_FIELD_NUMBER = 7;
    public static final int RSSNR_FIELD_NUMBER = 4;
    public static final int RSS_FIELD_NUMBER = 1;
    public static final int TIMINGADVANCE_FIELD_NUMBER = 6;
    private Int32Value ber_;
    private Int32Value cqi_;
    private Int32Value ecno_;
    private Int32Value rscp_;
    private Int32Value rsrp_;
    private Int32Value rsrq_;
    private Int32Value rss_;
    private Int32Value rssi_;
    private Int32Value rssnr_;
    private Int32Value timingAdvance_;

    /* compiled from: ReefProtocol.java */
    public static final class a extends GeneratedMessageLite.Builder<p, a> implements MessageLiteOrBuilder {
        public a() {
            super(p.DEFAULT_INSTANCE);
        }

        public final void b(Int32Value int32Value) {
            copyOnWrite();
            p.b((p) this.instance, int32Value);
        }

        public final void c(Int32Value int32Value) {
            copyOnWrite();
            p.c((p) this.instance, int32Value);
        }
    }

    static {
        p pVar = new p();
        DEFAULT_INSTANCE = pVar;
        GeneratedMessageLite.registerDefaultInstance(p.class, pVar);
    }

    public static void b(p pVar, Int32Value int32Value) {
        pVar.getClass();
        int32Value.getClass();
        pVar.rscp_ = int32Value;
    }

    public static void c(p pVar, Int32Value int32Value) {
        pVar.getClass();
        int32Value.getClass();
        pVar.rssi_ = int32Value;
    }

    public static a f() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (lof0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new p();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\b\t\t\t\n\t", new Object[]{"rss_", "rsrp_", "rsrq_", "rssnr_", "cqi_", "timingAdvance_", "rssi_", "ber_", "rscp_", "ecno_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<p> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (p.class) {
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
