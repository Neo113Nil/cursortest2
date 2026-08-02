package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class b53 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int COUNT_FIELD_NUMBER = 5;
    private static final b53 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile Parser<b53> PARSER = null;
    public static final int PREVIOUS_TIMESTAMP_MILLIS_FIELD_NUMBER = 4;
    public static final int TIMESTAMP_MILLIS_FIELD_NUMBER = 3;
    public static final int TRIGGER_PARAMS_FIELD_NUMBER = 1;
    private int count_;
    private long previousTimestampMillis_;
    private long timestampMillis_;
    private Internal.ProtobufList<g53> triggerParams_ = GeneratedMessageLite.emptyProtobufList();
    private String name_ = "";

    static {
        b53 b53Var = new b53();
        DEFAULT_INSTANCE = b53Var;
        GeneratedMessageLite.registerDefaultInstance(b53.class, b53Var);
    }

    public static b53 h() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (z43.a[methodToInvoke.ordinal()]) {
            case 1:
                return new b53();
            case 2:
                return new a53(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003\u0002\u0004\u0002\u0005\u0004", new Object[]{"triggerParams_", g53.class, "name_", "timestampMillis_", "previousTimestampMillis_", "count_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<b53> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (b53.class) {
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

    public final String getName() {
        return this.name_;
    }
}
