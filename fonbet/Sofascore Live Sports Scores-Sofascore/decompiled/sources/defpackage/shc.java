package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class shc extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 5;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final shc DEFAULT_INSTANCE;
    public static final int LANDSCAPE_IMAGE_URL_FIELD_NUMBER = 4;
    private static volatile Parser<shc> PARSER = null;
    public static final int PORTRAIT_IMAGE_URL_FIELD_NUMBER = 3;
    public static final int PRIMARY_ACTION_BUTTON_FIELD_NUMBER = 6;
    public static final int PRIMARY_ACTION_FIELD_NUMBER = 7;
    public static final int SECONDARY_ACTION_BUTTON_FIELD_NUMBER = 8;
    public static final int SECONDARY_ACTION_FIELD_NUMBER = 9;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private aic body_;
    private qhc primaryActionButton_;
    private mhc primaryAction_;
    private qhc secondaryActionButton_;
    private mhc secondaryAction_;
    private aic title_;
    private String portraitImageUrl_ = "";
    private String landscapeImageUrl_ = "";
    private String backgroundHexColor_ = "";

    static {
        shc shcVar = new shc();
        DEFAULT_INSTANCE = shcVar;
        GeneratedMessageLite.registerDefaultInstance(shc.class, shcVar);
    }

    public static shc j() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (khc.a[methodToInvoke.ordinal()]) {
            case 1:
                return new shc();
            case 2:
                return new rhc(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ဉ\u0002\u0007ဉ\u0003\bဉ\u0004\tဉ\u0005", new Object[]{"bitField0_", "title_", "body_", "portraitImageUrl_", "landscapeImageUrl_", "backgroundHexColor_", "primaryActionButton_", "primaryAction_", "secondaryActionButton_", "secondaryAction_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<shc> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (shc.class) {
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
        return this.backgroundHexColor_;
    }

    public final aic i() {
        aic aicVar = this.body_;
        return aicVar == null ? aic.h() : aicVar;
    }

    public final String k() {
        return this.landscapeImageUrl_;
    }

    public final String l() {
        return this.portraitImageUrl_;
    }

    public final mhc m() {
        mhc mhcVar = this.primaryAction_;
        return mhcVar == null ? mhc.i() : mhcVar;
    }

    public final qhc n() {
        qhc qhcVar = this.primaryActionButton_;
        return qhcVar == null ? qhc.i() : qhcVar;
    }

    public final mhc o() {
        mhc mhcVar = this.secondaryAction_;
        return mhcVar == null ? mhc.i() : mhcVar;
    }

    public final qhc p() {
        qhc qhcVar = this.secondaryActionButton_;
        return qhcVar == null ? qhc.i() : qhcVar;
    }

    public final aic q() {
        aic aicVar = this.title_;
        return aicVar == null ? aic.h() : aicVar;
    }

    public final boolean r() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean s() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean u() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean v() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean w() {
        return (this.bitField0_ & 1) != 0;
    }
}
