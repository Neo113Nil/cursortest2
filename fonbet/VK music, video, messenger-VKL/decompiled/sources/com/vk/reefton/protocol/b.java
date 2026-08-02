package com.vk.reefton.protocol;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import xsna.lof0;

/* compiled from: ReefProtocol.java */
/* loaded from: classes5.dex */
public final class b extends GeneratedMessageLite<b, a> implements MessageLiteOrBuilder {
    public static final int BITRATE05_FIELD_NUMBER = 5;
    public static final int BITRATE09_FIELD_NUMBER = 6;
    public static final int BITRATE1_FIELD_NUMBER = 7;
    public static final int CHUNKNUM_FIELD_NUMBER = 8;
    private static final b DEFAULT_INSTANCE;
    private static volatile Parser<b> PARSER = null;
    public static final int SAMPLEBYTESLOADED_FIELD_NUMBER = 4;
    public static final int SAMPLEELAPSEDTIMEMS_FIELD_NUMBER = 3;
    private long bitrate05_;
    private long bitrate09_;
    private long bitrate1_;
    private int chunkNum_;
    private long sampleBytesLoaded_;
    private int sampleElapsedTimeMs_;

    /* compiled from: ReefProtocol.java */
    public static final class a extends GeneratedMessageLite.Builder<b, a> implements MessageLiteOrBuilder {
        public a() {
            super(b.DEFAULT_INSTANCE);
        }

        public final void b(long j) {
            copyOnWrite();
            b.b((b) this.instance, j);
        }

        public final void m() {
            copyOnWrite();
            b.c((b) this.instance);
        }

        public final void n() {
            copyOnWrite();
            b.d((b) this.instance);
        }

        public final void o() {
            copyOnWrite();
            b.f((b) this.instance);
        }

        public final void p(long j) {
            copyOnWrite();
            b.g((b) this.instance, j);
        }

        public final void q(int i) {
            copyOnWrite();
            b.h((b) this.instance, i);
        }
    }

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        GeneratedMessageLite.registerDefaultInstance(b.class, bVar);
    }

    public static void b(b bVar, long j) {
        bVar.bitrate05_ = j;
    }

    public static void c(b bVar) {
        bVar.bitrate09_ = -1L;
    }

    public static void d(b bVar) {
        bVar.bitrate1_ = -1L;
    }

    public static void f(b bVar) {
        bVar.chunkNum_ = -1;
    }

    public static void g(b bVar, long j) {
        bVar.sampleBytesLoaded_ = j;
    }

    public static void h(b bVar, int i) {
        bVar.sampleElapsedTimeMs_ = i;
    }

    public static a n() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (lof0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new b();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0003\b\u0006\u0000\u0000\u0000\u0003\u0004\u0004\u0002\u0005\u0002\u0006\u0002\u0007\u0002\b\u0004", new Object[]{"sampleElapsedTimeMs_", "sampleBytesLoaded_", "bitrate05_", "bitrate09_", "bitrate1_", "chunkNum_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<b> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (b.class) {
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
