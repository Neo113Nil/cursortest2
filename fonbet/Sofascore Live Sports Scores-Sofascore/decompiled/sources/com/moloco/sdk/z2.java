package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class z2 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final z2 DEFAULT_INSTANCE;
    private static volatile Parser<z2> PARSER;

    static {
        z2 z2Var = new z2();
        DEFAULT_INSTANCE = z2Var;
        GeneratedMessageLite.registerDefaultInstance(z2.class, z2Var);
    }

    public static y2 h() {
        return (y2) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (k2.a[methodToInvoke.ordinal()]) {
            case 1:
                return new z2();
            case 2:
                return new y2(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<z2> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (z2.class) {
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
}
