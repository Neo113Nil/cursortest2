package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final a0 DEFAULT_INSTANCE;
    private static volatile Parser<a0> PARSER = null;
    public static final int UTCOFFSET_FIELD_NUMBER = 1;
    private int bitField0_;
    private int utcoffset_;

    static {
        a0 a0Var = new a0();
        DEFAULT_INSTANCE = a0Var;
        GeneratedMessageLite.registerDefaultInstance(a0.class, a0Var);
    }

    public static z h() {
        return (z) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new a0();
            case 2:
                return new z(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"bitField0_", "utcoffset_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<a0> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (a0.class) {
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

    public final void i(int i) {
        this.bitField0_ |= 1;
        this.utcoffset_ = i;
    }
}
