package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class f extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final f DEFAULT_INSTANCE;
    public static final int ENABLE_DBT_FIELD_NUMBER = 1;
    private static volatile Parser<f> PARSER;
    private boolean enableDbt_;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        GeneratedMessageLite.registerDefaultInstance(f.class, fVar);
    }

    public static f h() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new e(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"enableDbt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<f> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (f.class) {
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

    public final boolean i() {
        return this.enableDbt_;
    }
}
