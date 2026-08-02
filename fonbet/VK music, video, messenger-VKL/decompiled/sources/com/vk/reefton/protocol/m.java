package com.vk.reefton.protocol;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import xsna.lof0;

/* compiled from: ReefProtocol.java */
/* loaded from: classes5.dex */
public final class m extends GeneratedMessageLite<m, a> implements MessageLiteOrBuilder {
    private static final m DEFAULT_INSTANCE;
    public static final int MCC_FIELD_NUMBER = 1;
    public static final int MNC_FIELD_NUMBER = 2;
    private static volatile Parser<m> PARSER;
    private String mcc_ = "";
    private String mnc_ = "";

    /* compiled from: ReefProtocol.java */
    public static final class a extends GeneratedMessageLite.Builder<m, a> implements MessageLiteOrBuilder {
        public a() {
            super(m.DEFAULT_INSTANCE);
        }

        public final void b(String str) {
            copyOnWrite();
            m.b((m) this.instance, str);
        }

        public final void c(String str) {
            copyOnWrite();
            m.c((m) this.instance, str);
        }
    }

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        GeneratedMessageLite.registerDefaultInstance(m.class, mVar);
    }

    public static void b(m mVar, String str) {
        mVar.getClass();
        str.getClass();
        mVar.mcc_ = str;
    }

    public static void c(m mVar, String str) {
        mVar.getClass();
        str.getClass();
        mVar.mnc_ = str;
    }

    public static a f() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (lof0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new m();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"mcc_", "mnc_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<m> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (m.class) {
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
