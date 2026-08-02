package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class y0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final y0 DEFAULT_INSTANCE;
    public static final int MEDIA_CONFIG_FIELD_NUMBER = 1;
    private static volatile Parser<y0> PARSER;
    private x0 mediaConfig_;

    static {
        y0 y0Var = new y0();
        DEFAULT_INSTANCE = y0Var;
        GeneratedMessageLite.registerDefaultInstance(y0.class, y0Var);
    }

    public static y0 h() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (r0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new y0();
            case 2:
                return new v0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"mediaConfig_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<y0> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (y0.class) {
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

    public final x0 i() {
        x0 x0Var = this.mediaConfig_;
        return x0Var == null ? x0.h() : x0Var;
    }

    public final boolean j() {
        return this.mediaConfig_ != null;
    }
}
