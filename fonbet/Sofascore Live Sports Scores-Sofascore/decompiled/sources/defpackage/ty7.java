package defpackage;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ty7 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ALREADY_SEEN_CAMPAIGNS_FIELD_NUMBER = 3;
    public static final int CLIENT_SIGNALS_FIELD_NUMBER = 4;
    private static final ty7 DEFAULT_INSTANCE;
    private static volatile Parser<ty7> PARSER = null;
    public static final int PROJECT_NUMBER_FIELD_NUMBER = 1;
    public static final int REQUESTING_CLIENT_APP_FIELD_NUMBER = 2;
    private int bitField0_;
    private xx2 clientSignals_;
    private zw2 requestingClientApp_;
    private String projectNumber_ = "";
    private Internal.ProtobufList<oi2> alreadySeenCampaigns_ = GeneratedMessageLite.emptyProtobufList();

    static {
        ty7 ty7Var = new ty7();
        DEFAULT_INSTANCE = ty7Var;
        GeneratedMessageLite.registerDefaultInstance(ty7.class, ty7Var);
    }

    public static ty7 i() {
        return DEFAULT_INSTANCE;
    }

    public static sy7 j() {
        return (sy7) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (ry7.a[methodToInvoke.ordinal()]) {
            case 1:
                return new ty7();
            case 2:
                return new sy7(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u001b\u0004ဉ\u0001", new Object[]{"bitField0_", "projectNumber_", "requestingClientApp_", "alreadySeenCampaigns_", oi2.class, "clientSignals_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ty7> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (ty7.class) {
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

    public final void h(Iterable iterable) {
        Internal.ProtobufList<oi2> protobufList = this.alreadySeenCampaigns_;
        if (!protobufList.isModifiable()) {
            this.alreadySeenCampaigns_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll(iterable, (List) this.alreadySeenCampaigns_);
    }

    public final void k(xx2 xx2Var) {
        xx2Var.getClass();
        this.clientSignals_ = xx2Var;
        this.bitField0_ |= 2;
    }

    public final void l(String str) {
        str.getClass();
        this.projectNumber_ = str;
    }

    public final void m(zw2 zw2Var) {
        zw2Var.getClass();
        this.requestingClientApp_ = zw2Var;
        this.bitField0_ |= 1;
    }
}
