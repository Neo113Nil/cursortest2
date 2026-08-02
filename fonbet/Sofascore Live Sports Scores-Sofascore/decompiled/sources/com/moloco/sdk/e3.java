package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class e3 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final e3 DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<e3> PARSER = null;
    public static final int VER_FIELD_NUMBER = 2;
    private String id_ = "";
    private String ver_ = "";

    static {
        e3 e3Var = new e3();
        DEFAULT_INSTANCE = e3Var;
        GeneratedMessageLite.registerDefaultInstance(e3.class, e3Var);
    }

    public static d3 h() {
        return (d3) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (c3.a[methodToInvoke.ordinal()]) {
            case 1:
                return new e3();
            case 2:
                return new d3(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"id_", "ver_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<e3> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (e3.class) {
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
        str.getClass();
        this.id_ = str;
    }

    public final void j(String str) {
        str.getClass();
        this.ver_ = str;
    }
}
