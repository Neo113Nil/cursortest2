package com.vk.reefton.protocol;

import com.google.protobuf.FloatValue;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int32Value;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import xsna.lof0;

/* compiled from: ReefProtocol.java */
/* loaded from: classes5.dex */
public final class y extends GeneratedMessageLite<y, a> implements MessageLiteOrBuilder {
    public static final int BBSID_FIELD_NUMBER = 4;
    private static final y DEFAULT_INSTANCE;
    public static final int FREQ_FIELD_NUMBER = 5;
    public static final int ISCONNECTED_FIELD_NUMBER = 1;
    public static final int LEVEL_FIELD_NUMBER = 3;
    private static volatile Parser<y> PARSER = null;
    public static final int SIGNALLEVEL_FIELD_NUMBER = 2;
    private String bbsid_ = "";
    private Int32Value freq_;
    private boolean isConnected_;
    private Int32Value level_;
    private FloatValue signalLevel_;

    /* compiled from: ReefProtocol.java */
    public static final class a extends GeneratedMessageLite.Builder<y, a> implements MessageLiteOrBuilder {
        public a() {
            super(y.DEFAULT_INSTANCE);
        }

        public final void b(String str) {
            copyOnWrite();
            y.b((y) this.instance, str);
        }

        public final void c(Int32Value int32Value) {
            copyOnWrite();
            y.c((y) this.instance, int32Value);
        }

        public final void d(boolean z) {
            copyOnWrite();
            y.d((y) this.instance, z);
        }

        public final void f(Int32Value int32Value) {
            copyOnWrite();
            y.f((y) this.instance, int32Value);
        }

        public final void g(FloatValue floatValue) {
            copyOnWrite();
            y.g((y) this.instance, floatValue);
        }
    }

    static {
        y yVar = new y();
        DEFAULT_INSTANCE = yVar;
        GeneratedMessageLite.registerDefaultInstance(y.class, yVar);
    }

    public static void b(y yVar, String str) {
        yVar.getClass();
        yVar.bbsid_ = str;
    }

    public static void c(y yVar, Int32Value int32Value) {
        yVar.getClass();
        int32Value.getClass();
        yVar.freq_ = int32Value;
    }

    public static void d(y yVar, boolean z) {
        yVar.isConnected_ = z;
    }

    public static void f(y yVar, Int32Value int32Value) {
        yVar.getClass();
        int32Value.getClass();
        yVar.level_ = int32Value;
    }

    public static void g(y yVar, FloatValue floatValue) {
        yVar.getClass();
        floatValue.getClass();
        yVar.signalLevel_ = floatValue;
    }

    public static a m() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (lof0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new y();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0002\t\u0003\t\u0004Ȉ\u0005\t", new Object[]{"isConnected_", "signalLevel_", "level_", "bbsid_", "freq_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<y> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (y.class) {
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
