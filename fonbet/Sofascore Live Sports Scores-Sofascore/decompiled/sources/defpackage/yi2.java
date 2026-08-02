package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class yi2 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 3;
    public static final int DATA_BUNDLE_FIELD_NUMBER = 8;
    private static final yi2 DEFAULT_INSTANCE;
    public static final int EXPERIMENTAL_PAYLOAD_FIELD_NUMBER = 2;
    public static final int IS_TEST_CAMPAIGN_FIELD_NUMBER = 7;
    private static volatile Parser<yi2> PARSER = null;
    public static final int PRIORITY_FIELD_NUMBER = 4;
    public static final int TRIGGERING_CONDITIONS_FIELD_NUMBER = 5;
    public static final int VANILLA_PAYLOAD_FIELD_NUMBER = 1;
    private int bitField0_;
    private uhc content_;
    private boolean isTestCampaign_;
    private Object payload_;
    private d53 priority_;
    private int payloadCase_ = 0;
    private MapFieldLite<String, String> dataBundle_ = MapFieldLite.emptyMapField();
    private Internal.ProtobufList<i53> triggeringConditions_ = GeneratedMessageLite.emptyProtobufList();

    static {
        yi2 yi2Var = new yi2();
        DEFAULT_INSTANCE = yi2Var;
        GeneratedMessageLite.registerDefaultInstance(yi2.class, yi2Var);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (ti2.a[methodToInvoke.ordinal()]) {
            case 1:
                return new yi2();
            case 2:
                return new wi2(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\b\u0007\u0001\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005\u001b\u0007\u0007\b2", new Object[]{"payload_", "payloadCase_", "bitField0_", aj2.class, vi2.class, "content_", "priority_", "triggeringConditions_", i53.class, "isTestCampaign_", "dataBundle_", xi2.a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<yi2> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (yi2.class) {
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

    public final uhc h() {
        uhc uhcVar = this.content_;
        return uhcVar == null ? uhc.j() : uhcVar;
    }

    public final Map i() {
        return Collections.unmodifiableMap(this.dataBundle_);
    }

    public final vi2 j() {
        return this.payloadCase_ == 2 ? (vi2) this.payload_ : vi2.l();
    }

    public final boolean k() {
        return this.isTestCampaign_;
    }

    public final int l() {
        int i = this.payloadCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public final d53 m() {
        d53 d53Var = this.priority_;
        return d53Var == null ? d53.h() : d53Var;
    }

    public final Internal.ProtobufList n() {
        return this.triggeringConditions_;
    }

    public final aj2 o() {
        return this.payloadCase_ == 1 ? (aj2) this.payload_ : aj2.l();
    }
}
