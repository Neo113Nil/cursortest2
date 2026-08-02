package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ri2 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ALREADY_SEEN_CAMPAIGNS_FIELD_NUMBER = 1;
    private static final ri2 DEFAULT_INSTANCE;
    private static volatile Parser<ri2> PARSER;
    private Internal.ProtobufList<oi2> alreadySeenCampaigns_ = GeneratedMessageLite.emptyProtobufList();

    static {
        ri2 ri2Var = new ri2();
        DEFAULT_INSTANCE = ri2Var;
        GeneratedMessageLite.registerDefaultInstance(ri2.class, ri2Var);
    }

    public static ri2 j() {
        return DEFAULT_INSTANCE;
    }

    public static qi2 k() {
        return (qi2) DEFAULT_INSTANCE.createBuilder();
    }

    public static qi2 l(ri2 ri2Var) {
        return (qi2) DEFAULT_INSTANCE.createBuilder(ri2Var);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (pi2.a[methodToInvoke.ordinal()]) {
            case 1:
                return new ri2();
            case 2:
                return new qi2(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"alreadySeenCampaigns_", oi2.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ri2> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (ri2.class) {
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

    public final void h(oi2 oi2Var) {
        oi2Var.getClass();
        Internal.ProtobufList<oi2> protobufList = this.alreadySeenCampaigns_;
        if (!protobufList.isModifiable()) {
            this.alreadySeenCampaigns_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        this.alreadySeenCampaigns_.add(oi2Var);
    }

    public final Internal.ProtobufList i() {
        return this.alreadySeenCampaigns_;
    }
}
