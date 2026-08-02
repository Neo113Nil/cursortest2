package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xx2 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int APP_VERSION_FIELD_NUMBER = 1;
    private static final xx2 DEFAULT_INSTANCE;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
    private static volatile Parser<xx2> PARSER = null;
    public static final int PLATFORM_VERSION_FIELD_NUMBER = 2;
    public static final int TIME_ZONE_FIELD_NUMBER = 4;
    private String appVersion_ = "";
    private String platformVersion_ = "";
    private String languageCode_ = "";
    private String timeZone_ = "";

    static {
        xx2 xx2Var = new xx2();
        DEFAULT_INSTANCE = xx2Var;
        GeneratedMessageLite.registerDefaultInstance(xx2.class, xx2Var);
    }

    public static wx2 h() {
        return (wx2) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (vx2.a[methodToInvoke.ordinal()]) {
            case 1:
                return new xx2();
            case 2:
                return new wx2(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"appVersion_", "platformVersion_", "languageCode_", "timeZone_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<xx2> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (xx2.class) {
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
        str.getClass();
        this.appVersion_ = str;
    }

    public final void j(String str) {
        str.getClass();
        this.languageCode_ = str;
    }

    public final void k(String str) {
        str.getClass();
        this.platformVersion_ = str;
    }

    public final void setTimeZone(String str) {
        str.getClass();
        this.timeZone_ = str;
    }
}
