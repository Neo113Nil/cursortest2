package com.vk.reefton.protocol;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int32Value;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import xsna.lof0;

/* compiled from: ReefProtocol.java */
/* loaded from: classes5.dex */
public final class o extends GeneratedMessageLite<o, a> implements MessageLiteOrBuilder {
    public static final int BITE_FIELD_NUMBER = 2;
    private static final o DEFAULT_INSTANCE;
    public static final int GSMS_FIELD_NUMBER = 1;
    public static final int LTECQI_FIELD_NUMBER = 6;
    public static final int LTERQ_FIELD_NUMBER = 5;
    public static final int LTERSSNR_FIELD_NUMBER = 7;
    public static final int LTER_FIELD_NUMBER = 4;
    public static final int LTES_FIELD_NUMBER = 3;
    private static volatile Parser<o> PARSER;
    private Int32Value bitE_;
    private Int32Value gsmS_;
    private Int32Value lteCqi_;
    private Int32Value lteR_;
    private Int32Value lteRq_;
    private Int32Value lteRssnr_;
    private Int32Value lteS_;

    /* compiled from: ReefProtocol.java */
    public static final class a extends GeneratedMessageLite.Builder<o, a> implements MessageLiteOrBuilder {
    }

    static {
        o oVar = new o();
        DEFAULT_INSTANCE = oVar;
        GeneratedMessageLite.registerDefaultInstance(o.class, oVar);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (lof0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new o();
            case 2:
                return new a(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t", new Object[]{"gsmS_", "bitE_", "lteS_", "lteR_", "lteRq_", "lteCqi_", "lteRssnr_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<o> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (o.class) {
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
