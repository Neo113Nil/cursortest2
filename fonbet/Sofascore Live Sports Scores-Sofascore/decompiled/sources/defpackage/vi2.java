package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vi2 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CAMPAIGN_END_TIME_MILLIS_FIELD_NUMBER = 4;
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
    public static final int CAMPAIGN_NAME_FIELD_NUMBER = 5;
    public static final int CAMPAIGN_START_TIME_MILLIS_FIELD_NUMBER = 3;
    private static final vi2 DEFAULT_INSTANCE;
    public static final int EXPERIMENT_PAYLOAD_FIELD_NUMBER = 2;
    private static volatile Parser<vi2> PARSER;
    private int bitField0_;
    private long campaignEndTimeMillis_;
    private String campaignId_ = "";
    private String campaignName_ = "";
    private long campaignStartTimeMillis_;
    private yi6 experimentPayload_;

    static {
        vi2 vi2Var = new vi2();
        DEFAULT_INSTANCE = vi2Var;
        GeneratedMessageLite.registerDefaultInstance(vi2.class, vi2Var);
    }

    public static vi2 l() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (ti2.a[methodToInvoke.ordinal()]) {
            case 1:
                return new vi2();
            case 2:
                return new ui2(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u0002\u0004\u0002\u0005Ȉ", new Object[]{"bitField0_", "campaignId_", "experimentPayload_", "campaignStartTimeMillis_", "campaignEndTimeMillis_", "campaignName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<vi2> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (vi2.class) {
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

    public final long h() {
        return this.campaignEndTimeMillis_;
    }

    public final String i() {
        return this.campaignId_;
    }

    public final String j() {
        return this.campaignName_;
    }

    public final long k() {
        return this.campaignStartTimeMillis_;
    }

    public final yi6 m() {
        yi6 yi6Var = this.experimentPayload_;
        return yi6Var == null ? yi6.h() : yi6Var;
    }
}
