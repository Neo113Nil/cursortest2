package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class oi2 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
    private static final oi2 DEFAULT_INSTANCE;
    public static final int IMPRESSION_TIMESTAMP_MILLIS_FIELD_NUMBER = 2;
    private static volatile Parser<oi2> PARSER;
    private String campaignId_ = "";
    private long impressionTimestampMillis_;

    static {
        oi2 oi2Var = new oi2();
        DEFAULT_INSTANCE = oi2Var;
        GeneratedMessageLite.registerDefaultInstance(oi2.class, oi2Var);
    }

    public static ni2 i() {
        return (ni2) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (mi2.a[methodToInvoke.ordinal()]) {
            case 1:
                return new oi2();
            case 2:
                return new ni2(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0002", new Object[]{"campaignId_", "impressionTimestampMillis_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<oi2> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (oi2.class) {
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

    public final String h() {
        return this.campaignId_;
    }

    public final void j(String str) {
        this.campaignId_ = str;
    }

    public final void k(long j) {
        this.impressionTimestampMillis_ = j;
    }
}
