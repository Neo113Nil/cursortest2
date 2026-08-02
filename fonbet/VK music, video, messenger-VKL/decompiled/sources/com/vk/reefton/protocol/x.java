package com.vk.reefton.protocol;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import xsna.lof0;

/* compiled from: ReefProtocol.java */
/* loaded from: classes5.dex */
public final class x extends GeneratedMessageLite<x, a> implements MessageLiteOrBuilder {
    private static final x DEFAULT_INSTANCE;
    public static final int FEATURES_FIELD_NUMBER = 1;
    private static volatile Parser<x> PARSER;
    private e features_;

    /* compiled from: ReefProtocol.java */
    public static final class a extends GeneratedMessageLite.Builder<x, a> implements MessageLiteOrBuilder {
        public a() {
            super(x.DEFAULT_INSTANCE);
        }

        public final void b(e eVar) {
            copyOnWrite();
            x.b((x) this.instance, eVar);
        }
    }

    static {
        x xVar = new x();
        DEFAULT_INSTANCE = xVar;
        GeneratedMessageLite.registerDefaultInstance(x.class, xVar);
    }

    public static void b(x xVar, e eVar) {
        xVar.getClass();
        eVar.getClass();
        xVar.features_ = eVar;
    }

    public static a d() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (lof0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new x();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"features_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<x> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (x.class) {
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
