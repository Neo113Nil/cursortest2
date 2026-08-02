package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class n0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final n0 DEFAULT_INSTANCE;
    public static final int INITIALIZED_FIELD_NUMBER = 1;
    private static volatile Parser<n0> PARSER;
    private int bitField0_;
    private boolean initialized_;

    static {
        n0 n0Var = new n0();
        DEFAULT_INSTANCE = n0Var;
        GeneratedMessageLite.registerDefaultInstance(n0.class, n0Var);
    }

    public static m0 h() {
        return (m0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new n0();
            case 2:
                return new m0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "initialized_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<n0> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (n0.class) {
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

    public final void i(boolean z) {
        this.bitField0_ |= 1;
        this.initialized_ = z;
    }
}
