package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class c4 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final c4 DEFAULT_INSTANCE;
    public static final int H_FIELD_NUMBER = 2;
    private static volatile Parser<c4> PARSER = null;
    public static final int W_FIELD_NUMBER = 1;
    private float h_;
    private float w_;

    static {
        c4 c4Var = new c4();
        DEFAULT_INSTANCE = c4Var;
        GeneratedMessageLite.registerDefaultInstance(c4.class, c4Var);
    }

    public static b4 h() {
        return (b4) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (c3.a[methodToInvoke.ordinal()]) {
            case 1:
                return new c4();
            case 2:
                return new b4(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u0001", new Object[]{"w_", "h_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<c4> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (c4.class) {
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

    public final void i(float f) {
        this.h_ = f;
    }

    public final void j(float f) {
        this.w_ = f;
    }
}
