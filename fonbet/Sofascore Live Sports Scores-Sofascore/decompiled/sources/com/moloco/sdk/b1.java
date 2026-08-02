package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class b1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ANDROID_CONFIG_FIELD_NUMBER = 1;
    public static final int COMMON_CONFIGS_FIELD_NUMBER = 3;
    private static final b1 DEFAULT_INSTANCE;
    public static final int IOS_CONFIG_FIELD_NUMBER = 2;
    private static volatile Parser<b1> PARSER;
    private int clientConfigsCase_ = 0;
    private Object clientConfigs_;
    private y0 commonConfigs_;

    static {
        b1 b1Var = new b1();
        DEFAULT_INSTANCE = b1Var;
        GeneratedMessageLite.registerDefaultInstance(b1.class, b1Var);
    }

    public static b1 i() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (r0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new b1();
            case 2:
                return new u0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003\t", new Object[]{"clientConfigs_", "clientConfigsCase_", t0.class, a1.class, "commonConfigs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<b1> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (b1.class) {
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

    public final y0 h() {
        y0 y0Var = this.commonConfigs_;
        return y0Var == null ? y0.h() : y0Var;
    }

    public final boolean j() {
        return this.commonConfigs_ != null;
    }
}
