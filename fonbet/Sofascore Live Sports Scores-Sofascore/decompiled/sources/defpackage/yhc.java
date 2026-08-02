package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class yhc extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ACTION_BUTTON_FIELD_NUMBER = 4;
    public static final int ACTION_FIELD_NUMBER = 5;
    public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 6;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final yhc DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile Parser<yhc> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private qhc actionButton_;
    private mhc action_;
    private int bitField0_;
    private aic body_;
    private aic title_;
    private String imageUrl_ = "";
    private String backgroundHexColor_ = "";

    static {
        yhc yhcVar = new yhc();
        DEFAULT_INSTANCE = yhcVar;
        GeneratedMessageLite.registerDefaultInstance(yhc.class, yhcVar);
    }

    public static yhc l() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (khc.a[methodToInvoke.ordinal()]) {
            case 1:
                return new yhc();
            case 2:
                return new xhc(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004ဉ\u0002\u0005ဉ\u0003\u0006Ȉ", new Object[]{"bitField0_", "title_", "body_", "imageUrl_", "actionButton_", "action_", "backgroundHexColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<yhc> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (yhc.class) {
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

    public final mhc h() {
        mhc mhcVar = this.action_;
        return mhcVar == null ? mhc.i() : mhcVar;
    }

    public final qhc i() {
        qhc qhcVar = this.actionButton_;
        return qhcVar == null ? qhc.i() : qhcVar;
    }

    public final String j() {
        return this.backgroundHexColor_;
    }

    public final aic k() {
        aic aicVar = this.body_;
        return aicVar == null ? aic.h() : aicVar;
    }

    public final String m() {
        return this.imageUrl_;
    }

    public final aic n() {
        aic aicVar = this.title_;
        return aicVar == null ? aic.h() : aicVar;
    }

    public final boolean o() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean p() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) != 0;
    }
}
