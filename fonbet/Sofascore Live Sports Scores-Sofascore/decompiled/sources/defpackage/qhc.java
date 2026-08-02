package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class qhc extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int BUTTON_HEX_COLOR_FIELD_NUMBER = 2;
    private static final qhc DEFAULT_INSTANCE;
    private static volatile Parser<qhc> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private String buttonHexColor_ = "";
    private aic text_;

    static {
        qhc qhcVar = new qhc();
        DEFAULT_INSTANCE = qhcVar;
        GeneratedMessageLite.registerDefaultInstance(qhc.class, qhcVar);
    }

    public static qhc i() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (khc.a[methodToInvoke.ordinal()]) {
            case 1:
                return new qhc();
            case 2:
                return new phc(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"bitField0_", "text_", "buttonHexColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<qhc> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (qhc.class) {
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
        return this.buttonHexColor_;
    }

    public final aic j() {
        aic aicVar = this.text_;
        return aicVar == null ? aic.h() : aicVar;
    }

    public final boolean k() {
        return (this.bitField0_ & 1) != 0;
    }
}
