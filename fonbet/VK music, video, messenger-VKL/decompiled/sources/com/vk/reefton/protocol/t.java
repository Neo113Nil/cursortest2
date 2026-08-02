package com.vk.reefton.protocol;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import xsna.lof0;

/* compiled from: ReefProtocol.java */
/* loaded from: classes5.dex */
public final class t extends GeneratedMessageLite<t, a> implements MessageLiteOrBuilder {
    private static final t DEFAULT_INSTANCE;
    public static final int LOSTEVENTS_FIELD_NUMBER = 1;
    private static volatile Parser<t> PARSER = null;
    public static final int PHONESTATELISTENERERRORS_FIELD_NUMBER = 3;
    public static final int SDKVERSION_FIELD_NUMBER = 2;
    private l lostEvents_;
    private long phoneStateListenerErrors_;
    private String sdkVersion_ = "";

    /* compiled from: ReefProtocol.java */
    public static final class a extends GeneratedMessageLite.Builder<t, a> implements MessageLiteOrBuilder {
        public a() {
            super(t.DEFAULT_INSTANCE);
        }

        public final void b(l lVar) {
            copyOnWrite();
            t.b((t) this.instance, lVar);
        }

        public final void d(long j) {
            copyOnWrite();
            t.c((t) this.instance, j);
        }

        public final void f(String str) {
            copyOnWrite();
            t.d((t) this.instance, str);
        }
    }

    static {
        t tVar = new t();
        DEFAULT_INSTANCE = tVar;
        GeneratedMessageLite.registerDefaultInstance(t.class, tVar);
    }

    public static void b(t tVar, l lVar) {
        tVar.getClass();
        lVar.getClass();
        tVar.lostEvents_ = lVar;
    }

    public static void c(t tVar, long j) {
        tVar.phoneStateListenerErrors_ = j;
    }

    public static void d(t tVar, String str) {
        tVar.getClass();
        str.getClass();
        tVar.sdkVersion_ = str;
    }

    public static a g() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (lof0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new t();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003\u0002", new Object[]{"lostEvents_", "sdkVersion_", "phoneStateListenerErrors_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<t> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (t.class) {
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
