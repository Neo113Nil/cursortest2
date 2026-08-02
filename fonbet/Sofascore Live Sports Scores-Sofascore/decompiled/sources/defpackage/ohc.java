package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ohc extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ACTION_FIELD_NUMBER = 4;
    public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 5;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final ohc DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile Parser<ohc> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private mhc action_;
    private int bitField0_;
    private aic body_;
    private aic title_;
    private String imageUrl_ = "";
    private String backgroundHexColor_ = "";

    static {
        ohc ohcVar = new ohc();
        DEFAULT_INSTANCE = ohcVar;
        GeneratedMessageLite.registerDefaultInstance(ohc.class, ohcVar);
    }

    public static ohc k() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (khc.a[methodToInvoke.ordinal()]) {
            case 1:
                return new ohc();
            case 2:
                return new nhc(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004ဉ\u0002\u0005Ȉ", new Object[]{"bitField0_", "title_", "body_", "imageUrl_", "action_", "backgroundHexColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ohc> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (ohc.class) {
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

    public final String i() {
        return this.backgroundHexColor_;
    }

    public final aic j() {
        aic aicVar = this.body_;
        return aicVar == null ? aic.h() : aicVar;
    }

    public final String l() {
        return this.imageUrl_;
    }

    public final aic m() {
        aic aicVar = this.title_;
        return aicVar == null ? aic.h() : aicVar;
    }

    public final boolean n() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean o() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean p() {
        return (this.bitField0_ & 1) != 0;
    }
}
