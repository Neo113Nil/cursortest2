package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class aic extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final aic DEFAULT_INSTANCE;
    public static final int HEX_COLOR_FIELD_NUMBER = 2;
    private static volatile Parser<aic> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private String text_ = "";
    private String hexColor_ = "";

    static {
        aic aicVar = new aic();
        DEFAULT_INSTANCE = aicVar;
        GeneratedMessageLite.registerDefaultInstance(aic.class, aicVar);
    }

    public static aic h() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (khc.a[methodToInvoke.ordinal()]) {
            case 1:
                return new aic();
            case 2:
                return new zhc(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"text_", "hexColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<aic> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (aic.class) {
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

    public final String i() {
        return this.hexColor_;
    }

    public final String j() {
        return this.text_;
    }
}
