package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class u1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final u1 DEFAULT_INSTANCE;
    public static final int ENABLED_FIELD_NUMBER = 1;
    private static volatile Parser<u1> PARSER = null;
    public static final int URL_FIELD_NUMBER = 2;
    private boolean enabled_;
    private String url_ = "";

    static {
        u1 u1Var = new u1();
        DEFAULT_INSTANCE = u1Var;
        GeneratedMessageLite.registerDefaultInstance(u1.class, u1Var);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (l1.a[methodToInvoke.ordinal()]) {
            case 1:
                return new u1();
            case 2:
                return new t1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002Ȉ", new Object[]{"enabled_", "url_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<u1> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (u1.class) {
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
