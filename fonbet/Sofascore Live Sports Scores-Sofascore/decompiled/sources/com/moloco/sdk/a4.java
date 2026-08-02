package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a4 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final a4 DEFAULT_INSTANCE;
    private static volatile Parser<a4> PARSER = null;
    public static final int X_FIELD_NUMBER = 1;
    public static final int Y_FIELD_NUMBER = 2;
    private float x_;
    private float y_;

    static {
        a4 a4Var = new a4();
        DEFAULT_INSTANCE = a4Var;
        GeneratedMessageLite.registerDefaultInstance(a4.class, a4Var);
    }

    public static z3 h() {
        return (z3) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (c3.a[methodToInvoke.ordinal()]) {
            case 1:
                return new a4();
            case 2:
                return new z3(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u0001", new Object[]{"x_", "y_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<a4> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (a4.class) {
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
        this.x_ = f;
    }

    public final void j(float f) {
        this.y_ = f;
    }
}
