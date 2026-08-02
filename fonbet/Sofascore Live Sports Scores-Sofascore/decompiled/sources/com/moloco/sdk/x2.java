package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class x2 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CLIENT_ERROR_FIELD_NUMBER = 2;
    private static final x2 DEFAULT_INSTANCE;
    private static volatile Parser<x2> PARSER = null;
    public static final int SERVER_ERROR_FIELD_NUMBER = 1;
    private int errorTypeCase_ = 0;
    private Object errorType_;

    static {
        x2 x2Var = new x2();
        DEFAULT_INSTANCE = x2Var;
        GeneratedMessageLite.registerDefaultInstance(x2.class, x2Var);
    }

    public static r2 h() {
        return (r2) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (k2.a[methodToInvoke.ordinal()]) {
            case 1:
                return new x2();
            case 2:
                return new r2(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"errorType_", "errorTypeCase_", w2.class, u2.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<x2> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (x2.class) {
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

    public final void i(u2 u2Var) {
        u2Var.getClass();
        this.errorType_ = u2Var;
        this.errorTypeCase_ = 2;
    }

    public final void j(w2 w2Var) {
        w2Var.getClass();
        this.errorType_ = w2Var;
        this.errorTypeCase_ = 1;
    }
}
