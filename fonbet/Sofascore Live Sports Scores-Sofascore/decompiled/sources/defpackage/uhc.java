package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class uhc extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int BANNER_FIELD_NUMBER = 1;
    public static final int CARD_FIELD_NUMBER = 4;
    private static final uhc DEFAULT_INSTANCE;
    public static final int IMAGE_ONLY_FIELD_NUMBER = 3;
    public static final int MODAL_FIELD_NUMBER = 2;
    private static volatile Parser<uhc> PARSER;
    private int messageDetailsCase_ = 0;
    private Object messageDetails_;

    static {
        uhc uhcVar = new uhc();
        DEFAULT_INSTANCE = uhcVar;
        GeneratedMessageLite.registerDefaultInstance(uhc.class, uhcVar);
    }

    public static uhc j() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (khc.a[methodToInvoke.ordinal()]) {
            case 1:
                return new uhc();
            case 2:
                return new thc(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"messageDetails_", "messageDetailsCase_", ohc.class, yhc.class, whc.class, shc.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<uhc> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (uhc.class) {
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

    public final ohc h() {
        return this.messageDetailsCase_ == 1 ? (ohc) this.messageDetails_ : ohc.k();
    }

    public final shc i() {
        return this.messageDetailsCase_ == 4 ? (shc) this.messageDetails_ : shc.j();
    }

    public final whc k() {
        return this.messageDetailsCase_ == 3 ? (whc) this.messageDetails_ : whc.i();
    }

    public final int l() {
        int i = this.messageDetailsCase_;
        if (i == 0) {
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    public final yhc m() {
        return this.messageDetailsCase_ == 2 ? (yhc) this.messageDetails_ : yhc.l();
    }
}
