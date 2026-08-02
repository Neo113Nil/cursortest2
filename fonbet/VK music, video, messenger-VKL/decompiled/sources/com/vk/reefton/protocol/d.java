package com.vk.reefton.protocol;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import xsna.lof0;

/* compiled from: ReefProtocol.java */
/* loaded from: classes5.dex */
public final class d extends GeneratedMessageLite<d, a> implements MessageLiteOrBuilder {
    private static final d DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    private static volatile Parser<d> PARSER = null;
    public static final int USERIDENTIFIER_FIELD_NUMBER = 2;
    private String identifier_ = "";
    private String userIdentifier_ = "";

    /* compiled from: ReefProtocol.java */
    public static final class a extends GeneratedMessageLite.Builder<d, a> implements MessageLiteOrBuilder {
        public a() {
            super(d.DEFAULT_INSTANCE);
        }

        public final void b(String str) {
            copyOnWrite();
            d.b((d) this.instance, str);
        }

        public final void c(String str) {
            copyOnWrite();
            d.c((d) this.instance, str);
        }
    }

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        GeneratedMessageLite.registerDefaultInstance(d.class, dVar);
    }

    public static void b(d dVar, String str) {
        dVar.getClass();
        str.getClass();
        dVar.identifier_ = str;
    }

    public static void c(d dVar, String str) {
        dVar.getClass();
        str.getClass();
        dVar.userIdentifier_ = str;
    }

    public static a f() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (lof0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new d();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"identifier_", "userIdentifier_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<d> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (d.class) {
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
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
