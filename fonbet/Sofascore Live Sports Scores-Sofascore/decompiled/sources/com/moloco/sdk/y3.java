package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class y3 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CARRIER_FIELD_NUMBER = 2;
    public static final int CONNECTION_TYPE_FIELD_NUMBER = 1;
    private static final y3 DEFAULT_INSTANCE;
    private static volatile Parser<y3> PARSER;
    private String carrier_ = "";
    private int connectionType_;

    static {
        y3 y3Var = new y3();
        DEFAULT_INSTANCE = y3Var;
        GeneratedMessageLite.registerDefaultInstance(y3.class, y3Var);
    }

    public static w3 h() {
        return (w3) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (c3.a[methodToInvoke.ordinal()]) {
            case 1:
                return new y3();
            case 2:
                return new w3(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"connectionType_", "carrier_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<y3> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (y3.class) {
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

    public final void i(String str) {
        this.carrier_ = str;
    }

    public final void j(x3 x3Var) {
        this.connectionType_ = x3Var.getNumber();
    }
}
