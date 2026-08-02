package com.vk.reefton.protocol;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int32Value;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import xsna.lof0;

/* compiled from: ReefProtocol.java */
/* loaded from: classes5.dex */
public final class v extends GeneratedMessageLite<v, a> implements MessageLiteOrBuilder {
    public static final int BITERRORRATE_FIELD_NUMBER = 1;
    private static final v DEFAULT_INSTANCE;
    private static volatile Parser<v> PARSER = null;
    public static final int TIMINGADVANCE_FIELD_NUMBER = 2;
    private Int32Value bitErrorRate_;
    private Int32Value timingAdvance_;

    /* compiled from: ReefProtocol.java */
    public static final class a extends GeneratedMessageLite.Builder<v, a> implements MessageLiteOrBuilder {
        public a() {
            super(v.DEFAULT_INSTANCE);
        }

        public final void b(Int32Value int32Value) {
            copyOnWrite();
            v.b((v) this.instance, int32Value);
        }

        public final void c(Int32Value int32Value) {
            copyOnWrite();
            v.c((v) this.instance, int32Value);
        }
    }

    static {
        v vVar = new v();
        DEFAULT_INSTANCE = vVar;
        GeneratedMessageLite.registerDefaultInstance(v.class, vVar);
    }

    public static void b(v vVar, Int32Value int32Value) {
        vVar.getClass();
        int32Value.getClass();
        vVar.bitErrorRate_ = int32Value;
    }

    public static void c(v vVar, Int32Value int32Value) {
        vVar.getClass();
        int32Value.getClass();
        vVar.timingAdvance_ = int32Value;
    }

    public static a f() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (lof0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new v();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"bitErrorRate_", "timingAdvance_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<v> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (v.class) {
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
