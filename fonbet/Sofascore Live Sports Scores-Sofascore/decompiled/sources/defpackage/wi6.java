package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wi6 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final wi6 DEFAULT_INSTANCE;
    public static final int EXPERIMENT_ID_FIELD_NUMBER = 1;
    private static volatile Parser<wi6> PARSER;
    private String experimentId_ = "";

    static {
        wi6 wi6Var = new wi6();
        DEFAULT_INSTANCE = wi6Var;
        GeneratedMessageLite.registerDefaultInstance(wi6.class, wi6Var);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (ui6.a[methodToInvoke.ordinal()]) {
            case 1:
                return new wi6();
            case 2:
                return new vi6(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"experimentId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<wi6> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (wi6.class) {
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
}
