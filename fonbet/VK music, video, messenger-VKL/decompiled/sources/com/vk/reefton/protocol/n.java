package com.vk.reefton.protocol;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int32Value;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import xsna.lof0;

/* compiled from: ReefProtocol.java */
/* loaded from: classes5.dex */
public final class n extends GeneratedMessageLite<n, a> implements MessageLiteOrBuilder {
    public static final int BER_FIELD_NUMBER = 7;
    public static final int CQI_FIELD_NUMBER = 5;
    private static final n DEFAULT_INSTANCE;
    private static volatile Parser<n> PARSER = null;
    public static final int RSRP_FIELD_NUMBER = 2;
    public static final int RSRQ_FIELD_NUMBER = 3;
    public static final int RSSNR_FIELD_NUMBER = 4;
    public static final int RSS_FIELD_NUMBER = 1;
    public static final int TIMINGADVANCE_FIELD_NUMBER = 6;
    private Int32Value ber_;
    private Int32Value cqi_;
    private Int32Value rsrp_;
    private Int32Value rsrq_;
    private Int32Value rss_;
    private Int32Value rssnr_;
    private Int32Value timingAdvance_;

    /* compiled from: ReefProtocol.java */
    public static final class a extends GeneratedMessageLite.Builder<n, a> implements MessageLiteOrBuilder {
    }

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        GeneratedMessageLite.registerDefaultInstance(n.class, nVar);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (lof0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new n();
            case 2:
                return new a(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t", new Object[]{"rss_", "rsrp_", "rsrq_", "rssnr_", "cqi_", "timingAdvance_", "ber_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<n> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (n.class) {
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
