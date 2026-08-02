package com.vk.reefton.protocol;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import xsna.lof0;

/* compiled from: ReefProtocol.java */
/* loaded from: classes5.dex */
public final class r extends GeneratedMessageLite<r, a> implements MessageLiteOrBuilder {
    private static final r DEFAULT_INSTANCE;
    public static final int LOCATIONACCESS_FIELD_NUMBER = 1;
    public static final int MOBILENETWORKACCESS_FIELD_NUMBER = 2;
    private static volatile Parser<r> PARSER = null;
    public static final int READPHONENUMBERS_FIELD_NUMBER = 5;
    public static final int READPRECISEPHONESTATE_FIELD_NUMBER = 4;
    public static final int WIFIACCESS_FIELD_NUMBER = 3;
    private boolean locationAccess_;
    private boolean mobileNetworkAccess_;
    private boolean readPhoneNumbers_;
    private boolean readPrecisePhoneState_;
    private boolean wifiAccess_;

    /* compiled from: ReefProtocol.java */
    public static final class a extends GeneratedMessageLite.Builder<r, a> implements MessageLiteOrBuilder {
        public a() {
            super(r.DEFAULT_INSTANCE);
        }

        public final void b(boolean z) {
            copyOnWrite();
            r.b((r) this.instance, z);
        }

        public final void c(boolean z) {
            copyOnWrite();
            r.c((r) this.instance, z);
        }

        public final void d(boolean z) {
            copyOnWrite();
            r.d((r) this.instance, z);
        }

        public final void f(boolean z) {
            copyOnWrite();
            r.f((r) this.instance, z);
        }

        public final void g(boolean z) {
            copyOnWrite();
            r.g((r) this.instance, z);
        }
    }

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        GeneratedMessageLite.registerDefaultInstance(r.class, rVar);
    }

    public static void b(r rVar, boolean z) {
        rVar.locationAccess_ = z;
    }

    public static void c(r rVar, boolean z) {
        rVar.mobileNetworkAccess_ = z;
    }

    public static void d(r rVar, boolean z) {
        rVar.readPhoneNumbers_ = z;
    }

    public static void f(r rVar, boolean z) {
        rVar.readPrecisePhoneState_ = z;
    }

    public static void g(r rVar, boolean z) {
        rVar.wifiAccess_ = z;
    }

    public static a m() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (lof0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new r();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007", new Object[]{"locationAccess_", "mobileNetworkAccess_", "wifiAccess_", "readPrecisePhoneState_", "readPhoneNumbers_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<r> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (r.class) {
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
