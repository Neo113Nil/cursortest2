package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class whc extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ACTION_FIELD_NUMBER = 2;
    private static final whc DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 1;
    private static volatile Parser<whc> PARSER;
    private mhc action_;
    private int bitField0_;
    private String imageUrl_ = "";

    static {
        whc whcVar = new whc();
        DEFAULT_INSTANCE = whcVar;
        GeneratedMessageLite.registerDefaultInstance(whc.class, whcVar);
    }

    public static whc i() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (khc.a[methodToInvoke.ordinal()]) {
            case 1:
                return new whc();
            case 2:
                return new vhc(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "imageUrl_", "action_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<whc> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (whc.class) {
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

    public final String j() {
        return this.imageUrl_;
    }

    public final boolean k() {
        return (this.bitField0_ & 1) != 0;
    }
}
