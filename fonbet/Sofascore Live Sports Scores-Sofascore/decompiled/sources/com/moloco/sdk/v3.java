package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class v3 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ADAPTER_VER_FIELD_NUMBER = 2;
    public static final int CORE_VER_FIELD_NUMBER = 1;
    private static final v3 DEFAULT_INSTANCE;
    private static volatile Parser<v3> PARSER;
    private String coreVer_ = "";
    private String adapterVer_ = "";

    static {
        v3 v3Var = new v3();
        DEFAULT_INSTANCE = v3Var;
        GeneratedMessageLite.registerDefaultInstance(v3.class, v3Var);
    }

    public static u3 h() {
        return (u3) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (c3.a[methodToInvoke.ordinal()]) {
            case 1:
                return new v3();
            case 2:
                return new u3(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"coreVer_", "adapterVer_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<v3> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (v3.class) {
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

    public final void i() {
        this.coreVer_ = BuildConfig.SDK_VERSION_NAME;
    }
}
