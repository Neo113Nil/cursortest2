package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class qx extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final qx DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile Parser<qx> PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    static {
        qx qxVar = new qx();
        DEFAULT_INSTANCE = qxVar;
        GeneratedMessageLite.registerDefaultInstance(qx.class, qxVar);
    }

    public static qx h() {
        return DEFAULT_INSTANCE;
    }

    public static ox k() {
        return (ox) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (nx.a[methodToInvoke.ordinal()]) {
            case 1:
                return new qx();
            case 2:
                return new ox(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<qx> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (qx.class) {
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

    public final boolean i() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean j() {
        return (this.bitField0_ & 2) != 0;
    }

    public final void l(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.packageName_ = str;
    }

    public final void m() {
        this.bitField0_ |= 2;
        this.sdkVersion_ = "22.0.6";
    }

    public final void n(String str) {
        this.bitField0_ |= 4;
        this.versionName_ = str;
    }
}
