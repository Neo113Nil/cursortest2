package com.google.firebase.perf.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* compiled from: GaugeMetric.java */
/* loaded from: classes13.dex */
public final class f extends GeneratedMessageLite<f, b> implements MessageLiteOrBuilder {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final f DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile Parser<f> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private e gaugeMetadata_;
    private String sessionId_ = "";
    private Internal.ProtobufList<d> cpuMetricReadings_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<com.google.firebase.perf.v1.b> androidMemoryReadings_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: GaugeMetric.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: GaugeMetric.java */
    public static final class b extends GeneratedMessageLite.Builder<f, b> implements MessageLiteOrBuilder {
        public b() {
            super(f.DEFAULT_INSTANCE);
        }

        public final void b(com.google.firebase.perf.v1.b bVar) {
            copyOnWrite();
            f.d((f) this.instance, bVar);
        }

        public final void c(d dVar) {
            copyOnWrite();
            f.g((f) this.instance, dVar);
        }

        public final void d(e eVar) {
            copyOnWrite();
            f.f((f) this.instance, eVar);
        }

        public final void f(String str) {
            copyOnWrite();
            f.c((f) this.instance, str);
        }
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        GeneratedMessageLite.registerDefaultInstance(f.class, fVar);
    }

    public static void c(f fVar, String str) {
        fVar.getClass();
        str.getClass();
        fVar.bitField0_ |= 1;
        fVar.sessionId_ = str;
    }

    public static void d(f fVar, com.google.firebase.perf.v1.b bVar) {
        fVar.getClass();
        bVar.getClass();
        Internal.ProtobufList<com.google.firebase.perf.v1.b> protobufList = fVar.androidMemoryReadings_;
        if (!protobufList.isModifiable()) {
            fVar.androidMemoryReadings_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        fVar.androidMemoryReadings_.add(bVar);
    }

    public static void f(f fVar, e eVar) {
        fVar.getClass();
        eVar.getClass();
        fVar.gaugeMetadata_ = eVar;
        fVar.bitField0_ |= 2;
    }

    public static void g(f fVar, d dVar) {
        fVar.getClass();
        dVar.getClass();
        Internal.ProtobufList<d> protobufList = fVar.cpuMetricReadings_;
        if (!protobufList.isModifiable()) {
            fVar.cpuMetricReadings_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        fVar.cpuMetricReadings_.add(dVar);
    }

    public static f n() {
        return DEFAULT_INSTANCE;
    }

    public static b q() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", d.class, "gaugeMetadata_", "androidMemoryReadings_", com.google.firebase.perf.v1.b.class});
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

    public final int h() {
        return this.androidMemoryReadings_.size();
    }

    public final boolean hasSessionId() {
        return (this.bitField0_ & 1) != 0;
    }

    public final int m() {
        return this.cpuMetricReadings_.size();
    }

    public final e o() {
        e eVar = this.gaugeMetadata_;
        return eVar == null ? e.g() : eVar;
    }

    public final boolean p() {
        return (this.bitField0_ & 2) != 0;
    }
}
