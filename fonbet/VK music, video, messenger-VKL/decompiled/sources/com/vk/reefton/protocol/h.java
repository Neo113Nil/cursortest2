package com.vk.reefton.protocol;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import xsna.lof0;

/* compiled from: ReefProtocol.java */
/* loaded from: classes5.dex */
public final class h extends GeneratedMessageLite<h, a> implements MessageLiteOrBuilder {
    public static final int CONNECTIONTIME_FIELD_NUMBER = 1;
    public static final int CONNECTIONTLSTIME_FIELD_NUMBER = 16;
    private static final h DEFAULT_INSTANCE;
    public static final int DOMAINLOOKUPTIME_FIELD_NUMBER = 13;
    public static final int FAILREASON_FIELD_NUMBER = 21;
    public static final int HTTPREQUESTBODYSIZE_FIELD_NUMBER = 19;
    public static final int HTTPREQUESTHOST_FIELD_NUMBER = 8;
    public static final int HTTPREQUESTMETHOD_FIELD_NUMBER = 7;
    public static final int HTTPRESPONSECODE_FIELD_NUMBER = 9;
    public static final int HTTPRESPONSECONTENTTYPE_FIELD_NUMBER = 10;
    public static final int ISCONNECTIONREUSED_FIELD_NUMBER = 5;
    public static final int ISFAILED_FIELD_NUMBER = 20;
    public static final int ISHTTPKEEPALIVE_FIELD_NUMBER = 18;
    public static final int ISPROXY_FIELD_NUMBER = 11;
    private static volatile Parser<h> PARSER = null;
    public static final int PROTOCOL_FIELD_NUMBER = 6;
    public static final int PROXYIPV4_FIELD_NUMBER = 12;
    public static final int REQUESTCOUNTER_FIELD_NUMBER = 22;
    public static final int RESPONSESIZE_FIELD_NUMBER = 4;
    public static final int RESPONSETIME_FIELD_NUMBER = 15;
    public static final int RESPONSETTFB_FIELD_NUMBER = 2;
    public static final int RTT_FIELD_NUMBER = 14;
    public static final int SESSIONTIME_FIELD_NUMBER = 3;
    public static final int TLSVERSION_FIELD_NUMBER = 17;
    private int connectionTime_;
    private int connectionTlsTime_;
    private int domainLookupTime_;
    private int httpRequestBodySize_;
    private int httpResponseCode_;
    private boolean isConnectionReused_;
    private boolean isFailed_;
    private boolean isHttpKeepAlive_;
    private boolean isProxy_;
    private int requestCounter_;
    private int responseSize_;
    private int responseTime_;
    private int responseTtfb_;
    private int rtt_;
    private int sessionTime_;
    private String protocol_ = "";
    private String httpRequestMethod_ = "";
    private String httpRequestHost_ = "";
    private String httpResponseContentType_ = "";
    private String proxyIpv4_ = "";
    private String tlsVersion_ = "";
    private String failReason_ = "";

    /* compiled from: ReefProtocol.java */
    public static final class a extends GeneratedMessageLite.Builder<h, a> implements MessageLiteOrBuilder {
        public a() {
            super(h.DEFAULT_INSTANCE);
        }

        public final void A(int i) {
            copyOnWrite();
            h.A((h) this.instance, i);
        }

        public final void B(String str) {
            copyOnWrite();
            h.B((h) this.instance, str);
        }

        public final void b(int i) {
            copyOnWrite();
            h.b((h) this.instance, i);
        }

        public final void c(int i) {
            copyOnWrite();
            h.c((h) this.instance, i);
        }

        public final void d(int i) {
            copyOnWrite();
            h.d((h) this.instance, i);
        }

        public final void f(String str) {
            copyOnWrite();
            h.f((h) this.instance, str);
        }

        public final void g(int i) {
            copyOnWrite();
            h.g((h) this.instance, i);
        }

        public final void h(String str) {
            copyOnWrite();
            h.h((h) this.instance, str);
        }

        public final void m(String str) {
            copyOnWrite();
            h.m((h) this.instance, str);
        }

        public final void n(int i) {
            copyOnWrite();
            h.n((h) this.instance, i);
        }

        public final void o(String str) {
            copyOnWrite();
            h.o((h) this.instance, str);
        }

        public final void p(boolean z) {
            copyOnWrite();
            h.p((h) this.instance, z);
        }

        public final void q(boolean z) {
            copyOnWrite();
            h.q((h) this.instance, z);
        }

        public final void r(boolean z) {
            copyOnWrite();
            h.r((h) this.instance, z);
        }

        public final void s(boolean z) {
            copyOnWrite();
            h.s((h) this.instance, z);
        }

        public final void t(String str) {
            copyOnWrite();
            h.t((h) this.instance, str);
        }

        public final void u(String str) {
            copyOnWrite();
            h.u((h) this.instance, str);
        }

        public final void v(int i) {
            copyOnWrite();
            h.v((h) this.instance, i);
        }

        public final void w(int i) {
            copyOnWrite();
            h.w((h) this.instance, i);
        }

        public final void x(int i) {
            copyOnWrite();
            h.x((h) this.instance, i);
        }

        public final void y(int i) {
            copyOnWrite();
            h.y((h) this.instance, i);
        }

        public final void z(int i) {
            copyOnWrite();
            h.z((h) this.instance, i);
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        GeneratedMessageLite.registerDefaultInstance(h.class, hVar);
    }

    public static void A(h hVar, int i) {
        hVar.sessionTime_ = i;
    }

    public static void B(h hVar, String str) {
        hVar.getClass();
        str.getClass();
        hVar.tlsVersion_ = str;
    }

    public static a D() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static void b(h hVar, int i) {
        hVar.connectionTime_ = i;
    }

    public static void c(h hVar, int i) {
        hVar.connectionTlsTime_ = i;
    }

    public static void d(h hVar, int i) {
        hVar.domainLookupTime_ = i;
    }

    public static void f(h hVar, String str) {
        hVar.getClass();
        str.getClass();
        hVar.failReason_ = str;
    }

    public static void g(h hVar, int i) {
        hVar.httpRequestBodySize_ = i;
    }

    public static void h(h hVar, String str) {
        hVar.getClass();
        str.getClass();
        hVar.httpRequestHost_ = str;
    }

    public static void m(h hVar, String str) {
        hVar.getClass();
        str.getClass();
        hVar.httpRequestMethod_ = str;
    }

    public static void n(h hVar, int i) {
        hVar.httpResponseCode_ = i;
    }

    public static void o(h hVar, String str) {
        hVar.getClass();
        str.getClass();
        hVar.httpResponseContentType_ = str;
    }

    public static void p(h hVar, boolean z) {
        hVar.isConnectionReused_ = z;
    }

    public static void q(h hVar, boolean z) {
        hVar.isFailed_ = z;
    }

    public static void r(h hVar, boolean z) {
        hVar.isHttpKeepAlive_ = z;
    }

    public static void s(h hVar, boolean z) {
        hVar.isProxy_ = z;
    }

    public static void t(h hVar, String str) {
        hVar.getClass();
        str.getClass();
        hVar.protocol_ = str;
    }

    public static void u(h hVar, String str) {
        hVar.getClass();
        str.getClass();
        hVar.proxyIpv4_ = str;
    }

    public static void v(h hVar, int i) {
        hVar.requestCounter_ = i;
    }

    public static void w(h hVar, int i) {
        hVar.responseSize_ = i;
    }

    public static void x(h hVar, int i) {
        hVar.responseTime_ = i;
    }

    public static void y(h hVar, int i) {
        hVar.responseTtfb_ = i;
    }

    public static void z(h hVar, int i) {
        hVar.rtt_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (lof0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0016\u0000\u0000\u0001\u0016\u0016\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0007\u0006Ȉ\u0007Ȉ\bȈ\t\u0004\nȈ\u000b\u0007\fȈ\r\u0004\u000e\u0004\u000f\u0004\u0010\u0004\u0011Ȉ\u0012\u0007\u0013\u0004\u0014\u0007\u0015Ȉ\u0016\u0004", new Object[]{"connectionTime_", "responseTtfb_", "sessionTime_", "responseSize_", "isConnectionReused_", "protocol_", "httpRequestMethod_", "httpRequestHost_", "httpResponseCode_", "httpResponseContentType_", "isProxy_", "proxyIpv4_", "domainLookupTime_", "rtt_", "responseTime_", "connectionTlsTime_", "tlsVersion_", "isHttpKeepAlive_", "httpRequestBodySize_", "isFailed_", "failReason_", "requestCounter_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<h> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (h.class) {
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
