package com.vk.reefton.protocol;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import xsna.lof0;

/* compiled from: ReefProtocol.java */
/* loaded from: classes5.dex */
public final class a extends GeneratedMessageLite<a, C1757a> implements MessageLiteOrBuilder {
    public static final int AUDIOID_FIELD_NUMBER = 2;
    public static final int BUFFERINGTIME_FIELD_NUMBER = 6;
    private static final a DEFAULT_INSTANCE;
    public static final int FRAGMENTDURATION_FIELD_NUMBER = 8;
    public static final int FRAGMENTID_FIELD_NUMBER = 7;
    public static final int OWNERID_FIELD_NUMBER = 1;
    private static volatile Parser<a> PARSER = null;
    public static final int RESPONSETTFB_FIELD_NUMBER = 4;
    public static final int RESPONSETTFF_FIELD_NUMBER = 5;
    public static final int SESSIONIDENTIFIER_FIELD_NUMBER = 3;
    private long audioId_;
    private int bufferingTime_;
    private int fragmentDuration_;
    private int fragmentId_;
    private long ownerId_;
    private int responseTtfb_;
    private int responseTtff_;
    private String sessionIdentifier_ = "";

    /* compiled from: ReefProtocol.java */
    /* renamed from: com.vk.reefton.protocol.a$a, reason: collision with other inner class name */
    public static final class C1757a extends GeneratedMessageLite.Builder<a, C1757a> implements MessageLiteOrBuilder {
        public C1757a() {
            super(a.DEFAULT_INSTANCE);
        }

        public final void b(long j) {
            copyOnWrite();
            a.b((a) this.instance, j);
        }

        public final void c(int i) {
            copyOnWrite();
            a.c((a) this.instance, i);
        }

        public final void d(int i) {
            copyOnWrite();
            a.d((a) this.instance, i);
        }

        public final void f(int i) {
            copyOnWrite();
            a.f((a) this.instance, i);
        }

        public final void g(long j) {
            copyOnWrite();
            a.g((a) this.instance, j);
        }

        public final void h(int i) {
            copyOnWrite();
            a.h((a) this.instance, i);
        }

        public final void m(int i) {
            copyOnWrite();
            a.m((a) this.instance, i);
        }

        public final void n(String str) {
            copyOnWrite();
            a.n((a) this.instance, str);
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        GeneratedMessageLite.registerDefaultInstance(a.class, aVar);
    }

    public static void b(a aVar, long j) {
        aVar.audioId_ = j;
    }

    public static void c(a aVar, int i) {
        aVar.bufferingTime_ = i;
    }

    public static void d(a aVar, int i) {
        aVar.fragmentDuration_ = i;
    }

    public static void f(a aVar, int i) {
        aVar.fragmentId_ = i;
    }

    public static void g(a aVar, long j) {
        aVar.ownerId_ = j;
    }

    public static void h(a aVar, int i) {
        aVar.responseTtfb_ = i;
    }

    public static void m(a aVar, int i) {
        aVar.responseTtff_ = i;
    }

    public static void n(a aVar, String str) {
        aVar.getClass();
        str.getClass();
        aVar.sessionIdentifier_ = str;
    }

    public static C1757a p() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (lof0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return new C1757a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003Ȉ\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b\u0004", new Object[]{"ownerId_", "audioId_", "sessionIdentifier_", "responseTtfb_", "responseTtff_", "bufferingTime_", "fragmentId_", "fragmentDuration_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<a> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (a.class) {
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
