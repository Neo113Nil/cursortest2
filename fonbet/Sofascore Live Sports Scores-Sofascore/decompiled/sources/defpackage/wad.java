package defpackage;

import androidx.core.app.NotificationCompat;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wad extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final wad DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile Parser<wad> PARSER = null;
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
    private Internal.ProtobufList<sde> perfSessions_ = GeneratedMessageLite.emptyProtobufList();

    static {
        wad wadVar = new wad();
        DEFAULT_INSTANCE = wadVar;
        GeneratedMessageLite.registerDefaultInstance(wad.class, wadVar);
    }

    public static qad B() {
        return (qad) DEFAULT_INSTANCE.createBuilder();
    }

    public static wad k() {
        return DEFAULT_INSTANCE;
    }

    public final boolean A() {
        return (this.bitField0_ & 512) != 0;
    }

    public final void C(long j) {
        this.bitField0_ |= 128;
        this.clientStartTimeUs_ = j;
    }

    public final void D(tad tadVar) {
        this.httpMethod_ = tadVar.a;
        this.bitField0_ |= 2;
    }

    public final void E(int i) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = i;
    }

    public final void F() {
        this.networkClientErrorReason_ = 1;
        this.bitField0_ |= 16;
    }

    public final void G(long j) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = j;
    }

    public final void H(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.responseContentType_ = str;
    }

    public final void I(long j) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = j;
    }

    public final void J(long j) {
        this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
        this.timeToRequestCompletedUs_ = j;
    }

    public final void K(long j) {
        this.bitField0_ |= 1024;
        this.timeToResponseCompletedUs_ = j;
    }

    public final void L(long j) {
        this.bitField0_ |= 512;
        this.timeToResponseInitiatedUs_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (pad.a[methodToInvoke.ordinal()]) {
            case 1:
                return new wad();
            case 2:
                return new qad(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000b᠌\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", sad.a, "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", uad.a, "customAttributes_", rad.a, "perfSessions_", sde.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<wad> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (wad.class) {
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
            default:
                a70.i();
            case 7:
                return null;
        }
    }

    public final String getUrl() {
        return this.url_;
    }

    public final void h(Iterable iterable) {
        Internal.ProtobufList<sde> protobufList = this.perfSessions_;
        if (!protobufList.isModifiable()) {
            this.perfSessions_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll(iterable, (List) this.perfSessions_);
    }

    public final void i() {
        this.bitField0_ &= -65;
        this.responseContentType_ = DEFAULT_INSTANCE.responseContentType_;
    }

    public final long j() {
        return this.clientStartTimeUs_;
    }

    public final tad l() {
        tad a = tad.a(this.httpMethod_);
        return a == null ? tad.HTTP_METHOD_UNKNOWN : a;
    }

    public final int m() {
        return this.httpResponseCode_;
    }

    public final Internal.ProtobufList n() {
        return this.perfSessions_;
    }

    public final long o() {
        return this.requestPayloadBytes_;
    }

    public final long p() {
        return this.responsePayloadBytes_;
    }

    public final long q() {
        return this.timeToRequestCompletedUs_;
    }

    public final long r() {
        return this.timeToResponseCompletedUs_;
    }

    public final long s() {
        return this.timeToResponseInitiatedUs_;
    }

    public final void setUrl(String str) {
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    public final boolean t() {
        return (this.bitField0_ & 128) != 0;
    }

    public final boolean u() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean v() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean w() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean x() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean y() {
        return (this.bitField0_ & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
    }

    public final boolean z() {
        return (this.bitField0_ & 1024) != 0;
    }
}
