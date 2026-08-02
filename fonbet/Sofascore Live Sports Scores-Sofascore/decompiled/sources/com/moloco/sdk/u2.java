package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class u2 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CLIENT_FAILURE_TYPE_FIELD_NUMBER = 1;
    private static final u2 DEFAULT_INSTANCE;
    private static volatile Parser<u2> PARSER;
    private int bitField0_;
    private int clientFailureType_;

    static {
        u2 u2Var = new u2();
        DEFAULT_INSTANCE = u2Var;
        GeneratedMessageLite.registerDefaultInstance(u2.class, u2Var);
    }

    public static s2 h() {
        return (s2) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (k2.a[methodToInvoke.ordinal()]) {
            case 1:
                return new u2();
            case 2:
                return new s2(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "clientFailureType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<u2> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (u2.class) {
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

    public final void i(t2 t2Var) {
        this.clientFailureType_ = t2Var.getNumber();
        this.bitField0_ |= 1;
    }
}
