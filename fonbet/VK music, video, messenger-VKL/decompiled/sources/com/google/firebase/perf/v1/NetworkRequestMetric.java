package com.google.firebase.perf.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.util.List;

/* loaded from: classes13.dex */
public final class NetworkRequestMetric extends GeneratedMessageLite<NetworkRequestMetric, b> implements MessageLiteOrBuilder {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final NetworkRequestMetric DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile Parser<NetworkRequestMetric> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.emptyMapField();
    private String url_ = "";
    private String responseContentType_ = "";
    private Internal.ProtobufList<h> perfSessions_ = GeneratedMessageLite.emptyProtobufList();

    public enum HttpMethod implements Internal.EnumLite {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);

        public static final int CONNECT_VALUE = 9;
        public static final int DELETE_VALUE = 4;
        public static final int GET_VALUE = 1;
        public static final int HEAD_VALUE = 5;
        public static final int HTTP_METHOD_UNKNOWN_VALUE = 0;
        public static final int OPTIONS_VALUE = 7;
        public static final int PATCH_VALUE = 6;
        public static final int POST_VALUE = 3;
        public static final int PUT_VALUE = 2;
        public static final int TRACE_VALUE = 8;
        private static final Internal.EnumLiteMap<HttpMethod> internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap<HttpMethod> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final HttpMethod findValueByNumber(int i) {
                return HttpMethod.a(i);
            }
        }

        public static final class b implements Internal.EnumVerifier {
            public static final b a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return HttpMethod.a(i) != null;
            }
        }

        HttpMethod(int i) {
            this.value = i;
        }

        public static HttpMethod a(int i) {
            switch (i) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }
    }

    public enum NetworkClientErrorReason implements Internal.EnumLite {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);

        public static final int GENERIC_CLIENT_ERROR_VALUE = 1;
        public static final int NETWORK_CLIENT_ERROR_REASON_UNKNOWN_VALUE = 0;
        private static final Internal.EnumLiteMap<NetworkClientErrorReason> internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap<NetworkClientErrorReason> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final NetworkClientErrorReason findValueByNumber(int i) {
                if (i == 0) {
                    return NetworkClientErrorReason.NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
                }
                if (i != 1) {
                    return null;
                }
                return NetworkClientErrorReason.GENERIC_CLIENT_ERROR;
            }
        }

        public static final class b implements Internal.EnumVerifier {
            public static final b a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return (i != 0 ? i != 1 ? null : NetworkClientErrorReason.GENERIC_CLIENT_ERROR : NetworkClientErrorReason.NETWORK_CLIENT_ERROR_REASON_UNKNOWN) != null;
            }
        }

        NetworkClientErrorReason(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }
    }

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

    public static final class b extends GeneratedMessageLite.Builder<NetworkRequestMetric, b> implements MessageLiteOrBuilder {
        public b() {
            super(NetworkRequestMetric.DEFAULT_INSTANCE);
        }

        public final void A(long j) {
            copyOnWrite();
            NetworkRequestMetric.o((NetworkRequestMetric) this.instance, j);
        }

        public final void B(String str) {
            copyOnWrite();
            NetworkRequestMetric.c((NetworkRequestMetric) this.instance, str);
        }

        public final void b(List list) {
            copyOnWrite();
            NetworkRequestMetric.q((NetworkRequestMetric) this.instance, list);
        }

        public final void m() {
            copyOnWrite();
            NetworkRequestMetric.h((NetworkRequestMetric) this.instance);
        }

        public final long n() {
            return ((NetworkRequestMetric) this.instance).D();
        }

        public final boolean o() {
            return ((NetworkRequestMetric) this.instance).E();
        }

        public final boolean p() {
            return ((NetworkRequestMetric) this.instance).G();
        }

        public final boolean q() {
            return ((NetworkRequestMetric) this.instance).K();
        }

        public final void r(long j) {
            copyOnWrite();
            NetworkRequestMetric.m((NetworkRequestMetric) this.instance, j);
        }

        public final void s(HttpMethod httpMethod) {
            copyOnWrite();
            NetworkRequestMetric.r((NetworkRequestMetric) this.instance, httpMethod);
        }

        public final void t(int i) {
            copyOnWrite();
            NetworkRequestMetric.f((NetworkRequestMetric) this.instance, i);
        }

        public final void u(NetworkClientErrorReason networkClientErrorReason) {
            copyOnWrite();
            NetworkRequestMetric.d((NetworkRequestMetric) this.instance, networkClientErrorReason);
        }

        public final void v(long j) {
            copyOnWrite();
            NetworkRequestMetric.s((NetworkRequestMetric) this.instance, j);
        }

        public final void w(String str) {
            copyOnWrite();
            NetworkRequestMetric.g((NetworkRequestMetric) this.instance, str);
        }

        public final void x(long j) {
            copyOnWrite();
            NetworkRequestMetric.t((NetworkRequestMetric) this.instance, j);
        }

        public final void y(long j) {
            copyOnWrite();
            NetworkRequestMetric.n((NetworkRequestMetric) this.instance, j);
        }

        public final void z(long j) {
            copyOnWrite();
            NetworkRequestMetric.p((NetworkRequestMetric) this.instance, j);
        }
    }

    public static final class c {
        public static final MapEntryLite<String, String> a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            a = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }
    }

    static {
        NetworkRequestMetric networkRequestMetric = new NetworkRequestMetric();
        DEFAULT_INSTANCE = networkRequestMetric;
        GeneratedMessageLite.registerDefaultInstance(NetworkRequestMetric.class, networkRequestMetric);
    }

    public static b M() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static void c(NetworkRequestMetric networkRequestMetric, String str) {
        networkRequestMetric.getClass();
        str.getClass();
        networkRequestMetric.bitField0_ |= 1;
        networkRequestMetric.url_ = str;
    }

    public static void d(NetworkRequestMetric networkRequestMetric, NetworkClientErrorReason networkClientErrorReason) {
        networkRequestMetric.getClass();
        networkRequestMetric.networkClientErrorReason_ = networkClientErrorReason.getNumber();
        networkRequestMetric.bitField0_ |= 16;
    }

    public static void f(NetworkRequestMetric networkRequestMetric, int i) {
        networkRequestMetric.bitField0_ |= 32;
        networkRequestMetric.httpResponseCode_ = i;
    }

    public static void g(NetworkRequestMetric networkRequestMetric, String str) {
        networkRequestMetric.getClass();
        str.getClass();
        networkRequestMetric.bitField0_ |= 64;
        networkRequestMetric.responseContentType_ = str;
    }

    public static void h(NetworkRequestMetric networkRequestMetric) {
        networkRequestMetric.bitField0_ &= -65;
        networkRequestMetric.responseContentType_ = DEFAULT_INSTANCE.responseContentType_;
    }

    public static void m(NetworkRequestMetric networkRequestMetric, long j) {
        networkRequestMetric.bitField0_ |= 128;
        networkRequestMetric.clientStartTimeUs_ = j;
    }

    public static void n(NetworkRequestMetric networkRequestMetric, long j) {
        networkRequestMetric.bitField0_ |= 256;
        networkRequestMetric.timeToRequestCompletedUs_ = j;
    }

    public static void o(NetworkRequestMetric networkRequestMetric, long j) {
        networkRequestMetric.bitField0_ |= 512;
        networkRequestMetric.timeToResponseInitiatedUs_ = j;
    }

    public static void p(NetworkRequestMetric networkRequestMetric, long j) {
        networkRequestMetric.bitField0_ |= 1024;
        networkRequestMetric.timeToResponseCompletedUs_ = j;
    }

    public static void q(NetworkRequestMetric networkRequestMetric, Iterable iterable) {
        Internal.ProtobufList<h> protobufList = networkRequestMetric.perfSessions_;
        if (!protobufList.isModifiable()) {
            networkRequestMetric.perfSessions_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll(iterable, (List) networkRequestMetric.perfSessions_);
    }

    public static void r(NetworkRequestMetric networkRequestMetric, HttpMethod httpMethod) {
        networkRequestMetric.getClass();
        networkRequestMetric.httpMethod_ = httpMethod.getNumber();
        networkRequestMetric.bitField0_ |= 2;
    }

    public static void s(NetworkRequestMetric networkRequestMetric, long j) {
        networkRequestMetric.bitField0_ |= 4;
        networkRequestMetric.requestPayloadBytes_ = j;
    }

    public static void t(NetworkRequestMetric networkRequestMetric, long j) {
        networkRequestMetric.bitField0_ |= 8;
        networkRequestMetric.responsePayloadBytes_ = j;
    }

    public static NetworkRequestMetric v() {
        return DEFAULT_INSTANCE;
    }

    public final long A() {
        return this.responsePayloadBytes_;
    }

    public final long B() {
        return this.timeToRequestCompletedUs_;
    }

    public final long C() {
        return this.timeToResponseCompletedUs_;
    }

    public final long D() {
        return this.timeToResponseInitiatedUs_;
    }

    public final boolean E() {
        return (this.bitField0_ & 128) != 0;
    }

    public final boolean F() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean G() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean H() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean I() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean J() {
        return (this.bitField0_ & 256) != 0;
    }

    public final boolean K() {
        return (this.bitField0_ & 1024) != 0;
    }

    public final boolean L() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new NetworkRequestMetric();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000bဌ\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", HttpMethod.b.a, "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", NetworkClientErrorReason.b.a, "customAttributes_", c.a, "perfSessions_", h.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<NetworkRequestMetric> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (NetworkRequestMetric.class) {
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

    public final String getUrl() {
        return this.url_;
    }

    public final long u() {
        return this.clientStartTimeUs_;
    }

    public final HttpMethod w() {
        HttpMethod a2 = HttpMethod.a(this.httpMethod_);
        return a2 == null ? HttpMethod.HTTP_METHOD_UNKNOWN : a2;
    }

    public final int x() {
        return this.httpResponseCode_;
    }

    public final Internal.ProtobufList y() {
        return this.perfSessions_;
    }

    public final long z() {
        return this.requestPayloadBytes_;
    }
}
