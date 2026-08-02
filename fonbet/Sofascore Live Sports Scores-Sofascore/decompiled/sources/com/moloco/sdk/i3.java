package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class i3 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int BG_TS_MS_FIELD_NUMBER = 1;
    private static final i3 DEFAULT_INSTANCE;
    private static volatile Parser<i3> PARSER;
    private long bgTsMs_;

    static {
        i3 i3Var = new i3();
        DEFAULT_INSTANCE = i3Var;
        GeneratedMessageLite.registerDefaultInstance(i3.class, i3Var);
    }

    public static h3 h() {
        return (h3) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (c3.a[methodToInvoke.ordinal()]) {
            case 1:
                return new i3();
            case 2:
                return new h3(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"bgTsMs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<i3> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (i3.class) {
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

    public final void i(long j) {
        this.bgTsMs_ = j;
    }
}
