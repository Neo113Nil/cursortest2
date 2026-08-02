package com.vk.reefton.protocol;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import xsna.lof0;

/* compiled from: ReefProtocol.java */
/* loaded from: classes5.dex */
public final class l extends GeneratedMessageLite<l, a> implements MessageLiteOrBuilder {
    public static final int BYAPPRESTART_FIELD_NUMBER = 1;
    public static final int BYNETWORKERROR2G_FIELD_NUMBER = 6;
    public static final int BYNETWORKERROR3G_FIELD_NUMBER = 7;
    public static final int BYNETWORKERROR4G_FIELD_NUMBER = 8;
    public static final int BYNETWORKERRORCELLULARUNKNOWN_FIELD_NUMBER = 9;
    public static final int BYNETWORKERROROFFLINE_FIELD_NUMBER = 4;
    public static final int BYNETWORKERROROTHER_FIELD_NUMBER = 10;
    public static final int BYNETWORKERRORTOTAL_FIELD_NUMBER = 3;
    public static final int BYNETWORKERRORWIFI_FIELD_NUMBER = 5;
    public static final int BYQUEUELIMIT_FIELD_NUMBER = 2;
    private static final l DEFAULT_INSTANCE;
    private static volatile Parser<l> PARSER;
    private long byAppRestart_;
    private long byNetworkError2G_;
    private long byNetworkError3G_;
    private long byNetworkError4G_;
    private long byNetworkErrorCellularUnknown_;
    private long byNetworkErrorOffline_;
    private long byNetworkErrorOther_;
    private long byNetworkErrorTotal_;
    private long byNetworkErrorWifi_;
    private long byQueueLimit_;

    /* compiled from: ReefProtocol.java */
    public static final class a extends GeneratedMessageLite.Builder<l, a> implements MessageLiteOrBuilder {
        public a() {
            super(l.DEFAULT_INSTANCE);
        }

        public final void b(long j) {
            copyOnWrite();
            l.b((l) this.instance, j);
        }

        public final void d(long j) {
            copyOnWrite();
            l.c((l) this.instance, j);
        }

        public final void f(long j) {
            copyOnWrite();
            l.d((l) this.instance, j);
        }

        public final void g(long j) {
            copyOnWrite();
            l.f((l) this.instance, j);
        }

        public final void h(long j) {
            copyOnWrite();
            l.g((l) this.instance, j);
        }

        public final void m(long j) {
            copyOnWrite();
            l.h((l) this.instance, j);
        }

        public final void n(long j) {
            copyOnWrite();
            l.m((l) this.instance, j);
        }

        public final void o(long j) {
            copyOnWrite();
            l.n((l) this.instance, j);
        }

        public final void p(long j) {
            copyOnWrite();
            l.o((l) this.instance, j);
        }

        public final void q(long j) {
            copyOnWrite();
            l.p((l) this.instance, j);
        }
    }

    static {
        l lVar = new l();
        DEFAULT_INSTANCE = lVar;
        GeneratedMessageLite.registerDefaultInstance(l.class, lVar);
    }

    public static void b(l lVar, long j) {
        lVar.byAppRestart_ = j;
    }

    public static void c(l lVar, long j) {
        lVar.byNetworkError2G_ = j;
    }

    public static void d(l lVar, long j) {
        lVar.byNetworkError3G_ = j;
    }

    public static void f(l lVar, long j) {
        lVar.byNetworkError4G_ = j;
    }

    public static void g(l lVar, long j) {
        lVar.byNetworkErrorCellularUnknown_ = j;
    }

    public static void h(l lVar, long j) {
        lVar.byNetworkErrorOffline_ = j;
    }

    public static void m(l lVar, long j) {
        lVar.byNetworkErrorOther_ = j;
    }

    public static void n(l lVar, long j) {
        lVar.byNetworkErrorTotal_ = j;
    }

    public static void o(l lVar, long j) {
        lVar.byNetworkErrorWifi_ = j;
    }

    public static void p(l lVar, long j) {
        lVar.byQueueLimit_ = j;
    }

    public static a r() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (lof0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new l();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0002\u0005\u0002\u0006\u0002\u0007\u0002\b\u0002\t\u0002\n\u0002", new Object[]{"byAppRestart_", "byQueueLimit_", "byNetworkErrorTotal_", "byNetworkErrorOffline_", "byNetworkErrorWifi_", "byNetworkError2G_", "byNetworkError3G_", "byNetworkError4G_", "byNetworkErrorCellularUnknown_", "byNetworkErrorOther_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<l> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (l.class) {
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
