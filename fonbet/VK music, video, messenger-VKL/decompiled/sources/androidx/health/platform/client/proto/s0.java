package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.GeneratedMessageLite;
import xsna.gj90;
import xsna.jye0;
import xsna.ma20;

/* compiled from: RequestProto.java */
/* loaded from: classes12.dex */
public final class s0 extends GeneratedMessageLite<s0, a> implements ma20 {
    public static final int CALLING_PACKAGE_FIELD_NUMBER = 1;
    private static final s0 DEFAULT_INSTANCE;
    public static final int IS_IN_FOREGROUND_FIELD_NUMBER = 4;
    private static volatile gj90<s0> PARSER = null;
    public static final int PERMISSION_TOKEN_FIELD_NUMBER = 3;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean isInForeground_;
    private int sdkVersion_;
    private String callingPackage_ = "";
    private String permissionToken_ = "";

    /* compiled from: RequestProto.java */
    public static final class a extends GeneratedMessageLite.a<s0, a> {
        public a() {
            super(s0.DEFAULT_INSTANCE);
        }
    }

    static {
        s0 s0Var = new s0();
        DEFAULT_INSTANCE = s0Var;
        GeneratedMessageLite.r(s0.class, s0Var);
    }

    public static a B() {
        return DEFAULT_INSTANCE.h();
    }

    public static s0 C(byte[] bArr) throws InvalidProtocolBufferException {
        return (s0) GeneratedMessageLite.q(DEFAULT_INSTANCE, bArr);
    }

    public static void t(s0 s0Var, String str) {
        s0Var.getClass();
        str.getClass();
        s0Var.bitField0_ |= 1;
        s0Var.callingPackage_ = str;
    }

    public static void u(s0 s0Var, int i) {
        s0Var.bitField0_ |= 2;
        s0Var.sdkVersion_ = i;
    }

    public static void v(s0 s0Var, String str) {
        s0Var.getClass();
        str.getClass();
        s0Var.bitField0_ |= 4;
        s0Var.permissionToken_ = str;
    }

    public static void w(s0 s0Var, boolean z) {
        s0Var.bitField0_ |= 8;
        s0Var.isInForeground_ = z;
    }

    public final int A() {
        return this.sdkVersion_;
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        gj90 gj90Var;
        switch (o0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new s0();
            case 2:
                return new a();
            case 3:
                return new jye0(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "callingPackage_", "sdkVersion_", "permissionToken_", "isInForeground_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                gj90<s0> gj90Var2 = PARSER;
                if (gj90Var2 != null) {
                    return gj90Var2;
                }
                synchronized (s0.class) {
                    try {
                        gj90Var = PARSER;
                        if (gj90Var == null) {
                            gj90Var = new GeneratedMessageLite.b();
                            PARSER = gj90Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return gj90Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final String x() {
        return this.callingPackage_;
    }

    public final boolean y() {
        return this.isInForeground_;
    }

    public final String z() {
        return this.permissionToken_;
    }
}
