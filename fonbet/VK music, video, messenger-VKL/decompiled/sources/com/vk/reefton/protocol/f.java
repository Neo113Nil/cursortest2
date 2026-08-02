package com.vk.reefton.protocol;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import xsna.lof0;

/* compiled from: ReefProtocol.java */
/* loaded from: classes5.dex */
public final class f extends GeneratedMessageLite<f, a> implements MessageLiteOrBuilder {
    private static final f DEFAULT_INSTANCE;
    public static final int ERRORCODE_FIELD_NUMBER = 1;
    public static final int ERRORDESCRIPTION_FIELD_NUMBER = 2;
    private static volatile Parser<f> PARSER;
    private int errorCode_;
    private String errorDescription_ = "";

    /* compiled from: ReefProtocol.java */
    public static final class a extends GeneratedMessageLite.Builder<f, a> implements MessageLiteOrBuilder {
        public a() {
            super(f.DEFAULT_INSTANCE);
        }

        public final void b(int i) {
            copyOnWrite();
            f.b((f) this.instance, i);
        }

        public final void c(String str) {
            copyOnWrite();
            f.c((f) this.instance, str);
        }
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        GeneratedMessageLite.registerDefaultInstance(f.class, fVar);
    }

    public static void b(f fVar, int i) {
        fVar.errorCode_ = i;
    }

    public static void c(f fVar, String str) {
        fVar.getClass();
        str.getClass();
        fVar.errorDescription_ = str;
    }

    public static a f() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (lof0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"errorCode_", "errorDescription_"});
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
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
