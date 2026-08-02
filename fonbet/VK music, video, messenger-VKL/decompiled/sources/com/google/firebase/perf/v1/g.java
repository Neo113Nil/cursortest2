package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.c;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import xsna.wv90;

/* compiled from: PerfMetric.java */
/* loaded from: classes13.dex */
public final class g extends GeneratedMessageLite<g, b> implements wv90 {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final g DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile Parser<g> PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private c applicationInfo_;
    private int bitField0_;
    private f gaugeMetric_;
    private NetworkRequestMetric networkRequestMetric_;
    private i traceMetric_;
    private TransportInfo transportInfo_;

    /* compiled from: PerfMetric.java */
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

    /* compiled from: PerfMetric.java */
    public static final class b extends GeneratedMessageLite.Builder<g, b> implements wv90 {
        public b() {
            super(g.DEFAULT_INSTANCE);
        }

        @Override // xsna.wv90
        public final NetworkRequestMetric a() {
            return ((g) this.instance).a();
        }

        public final void b(c.b bVar) {
            copyOnWrite();
            g.c((g) this.instance, bVar.build());
        }

        public final void c(f fVar) {
            copyOnWrite();
            g.d((g) this.instance, fVar);
        }

        public final void d(NetworkRequestMetric networkRequestMetric) {
            copyOnWrite();
            g.g((g) this.instance, networkRequestMetric);
        }

        @Override // xsna.wv90
        public final f e() {
            return ((g) this.instance).e();
        }

        public final void f(i iVar) {
            copyOnWrite();
            g.f((g) this.instance, iVar);
        }

        @Override // xsna.wv90
        public final boolean i() {
            return ((g) this.instance).i();
        }

        @Override // xsna.wv90
        public final boolean j() {
            return ((g) this.instance).j();
        }

        @Override // xsna.wv90
        public final boolean k() {
            return ((g) this.instance).k();
        }

        @Override // xsna.wv90
        public final i l() {
            return ((g) this.instance).l();
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        GeneratedMessageLite.registerDefaultInstance(g.class, gVar);
    }

    public static void c(g gVar, c cVar) {
        gVar.getClass();
        cVar.getClass();
        gVar.applicationInfo_ = cVar;
        gVar.bitField0_ |= 1;
    }

    public static void d(g gVar, f fVar) {
        gVar.getClass();
        fVar.getClass();
        gVar.gaugeMetric_ = fVar;
        gVar.bitField0_ |= 8;
    }

    public static void f(g gVar, i iVar) {
        gVar.getClass();
        iVar.getClass();
        gVar.traceMetric_ = iVar;
        gVar.bitField0_ |= 2;
    }

    public static void g(g gVar, NetworkRequestMetric networkRequestMetric) {
        gVar.getClass();
        networkRequestMetric.getClass();
        gVar.networkRequestMetric_ = networkRequestMetric;
        gVar.bitField0_ |= 4;
    }

    public static b n() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // xsna.wv90
    public final NetworkRequestMetric a() {
        NetworkRequestMetric networkRequestMetric = this.networkRequestMetric_;
        return networkRequestMetric == null ? NetworkRequestMetric.v() : networkRequestMetric;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<g> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (g.class) {
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

    @Override // xsna.wv90
    public final f e() {
        f fVar = this.gaugeMetric_;
        return fVar == null ? f.n() : fVar;
    }

    public final c h() {
        c cVar = this.applicationInfo_;
        return cVar == null ? c.n() : cVar;
    }

    @Override // xsna.wv90
    public final boolean i() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // xsna.wv90
    public final boolean j() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // xsna.wv90
    public final boolean k() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // xsna.wv90
    public final i l() {
        i iVar = this.traceMetric_;
        return iVar == null ? i.u() : iVar;
    }

    public final boolean m() {
        return (this.bitField0_ & 1) != 0;
    }
}
