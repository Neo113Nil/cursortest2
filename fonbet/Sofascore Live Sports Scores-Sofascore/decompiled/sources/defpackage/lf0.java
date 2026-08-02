package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class lf0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final lf0 DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile Parser<lf0> PARSER;
    private qx androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.emptyMapField();
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    static {
        lf0 lf0Var = new lf0();
        DEFAULT_INSTANCE = lf0Var;
        GeneratedMessageLite.registerDefaultInstance(lf0.class, lf0Var);
    }

    public static lf0 i() {
        return DEFAULT_INSTANCE;
    }

    public static if0 n() {
        return (if0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (hf0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new lf0();
            case 2:
                return new if0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005᠌\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", nf0.a, "customAttributes_", jf0.a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<lf0> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (lf0.class) {
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

    public final qx h() {
        qx qxVar = this.androidAppInfo_;
        return qxVar == null ? qx.h() : qxVar;
    }

    public final boolean hasGoogleAppId() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean j() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean k() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean l() {
        return (this.bitField0_ & 8) != 0;
    }

    public final MapFieldLite m() {
        if (!this.customAttributes_.isMutable()) {
            this.customAttributes_ = this.customAttributes_.mutableCopy();
        }
        return this.customAttributes_;
    }

    public final void o(qx qxVar) {
        qxVar.getClass();
        this.androidAppInfo_ = qxVar;
        this.bitField0_ |= 4;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.appInstanceId_ = str;
    }

    public final void q(of0 of0Var) {
        this.applicationProcessState_ = of0Var.a;
        this.bitField0_ |= 8;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.googleAppId_ = str;
    }
}
