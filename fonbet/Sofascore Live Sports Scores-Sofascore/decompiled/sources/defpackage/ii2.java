package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ii2 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 2;
    public static final int CLIENT_APP_FIELD_NUMBER = 3;
    public static final int CLIENT_TIMESTAMP_MILLIS_FIELD_NUMBER = 4;
    private static final ii2 DEFAULT_INSTANCE;
    public static final int DISMISS_TYPE_FIELD_NUMBER = 6;
    public static final int ENGAGEMENTMETRICS_DELIVERY_RETRY_COUNT_FIELD_NUMBER = 10;
    public static final int EVENT_TYPE_FIELD_NUMBER = 5;
    public static final int FETCH_ERROR_REASON_FIELD_NUMBER = 8;
    public static final int FIAM_SDK_VERSION_FIELD_NUMBER = 9;
    private static volatile Parser<ii2> PARSER = null;
    public static final int PROJECT_NUMBER_FIELD_NUMBER = 1;
    public static final int RENDER_ERROR_REASON_FIELD_NUMBER = 7;
    private int bitField0_;
    private ax2 clientApp_;
    private long clientTimestampMillis_;
    private int engagementMetricsDeliveryRetryCount_;
    private Object event_;
    private int eventCase_ = 0;
    private String projectNumber_ = "";
    private String campaignId_ = "";
    private String fiamSdkVersion_ = "";

    static {
        ii2 ii2Var = new ii2();
        DEFAULT_INSTANCE = ii2Var;
        GeneratedMessageLite.registerDefaultInstance(ii2.class, ii2Var);
    }

    public static hi2 h() {
        return (hi2) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (gi2.a[methodToInvoke.ordinal()]) {
            case 1:
                return new ii2();
            case 2:
                return new hi2(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဂ\u0003\u0005\u083f\u0000\u0006\u083f\u0000\u0007\u083f\u0000\b\u083f\u0000\tဈ\u0004\nင\u0005", new Object[]{"event_", "eventCase_", "bitField0_", "projectNumber_", "campaignId_", "clientApp_", "clientTimestampMillis_", oc6.a, n45.a, kyf.a, xy7.a, "fiamSdkVersion_", "engagementMetricsDeliveryRetryCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ii2> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (ii2.class) {
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

    public final void i(String str) {
        this.bitField0_ |= 2;
        this.campaignId_ = str;
    }

    public final void j(ax2 ax2Var) {
        ax2Var.getClass();
        this.clientApp_ = ax2Var;
        this.bitField0_ |= 4;
    }

    public final void k(long j) {
        this.bitField0_ |= 8;
        this.clientTimestampMillis_ = j;
    }

    public final void l(o45 o45Var) {
        this.event_ = Integer.valueOf(o45Var.a);
        this.eventCase_ = 6;
    }

    public final void m(qc6 qc6Var) {
        this.event_ = Integer.valueOf(qc6Var.a);
        this.eventCase_ = 5;
    }

    public final void n() {
        this.bitField0_ |= 16;
        this.fiamSdkVersion_ = "22.0.3";
    }

    public final void o(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.projectNumber_ = str;
    }

    public final void p(lyf lyfVar) {
        this.event_ = Integer.valueOf(lyfVar.a);
        this.eventCase_ = 7;
    }
}
