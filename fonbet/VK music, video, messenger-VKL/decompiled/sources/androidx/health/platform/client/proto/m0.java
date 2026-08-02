package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.GeneratedMessageLite;
import androidx.health.platform.client.proto.PermissionProto$AccessType;
import xsna.gj90;
import xsna.jye0;
import xsna.ma20;

/* compiled from: PermissionProto.java */
/* loaded from: classes12.dex */
public final class m0 extends GeneratedMessageLite<m0, a> implements ma20 {
    public static final int ACCESS_TYPE_FIELD_NUMBER = 2;
    public static final int DATA_TYPE_FIELD_NUMBER = 1;
    private static final m0 DEFAULT_INSTANCE;
    private static volatile gj90<m0> PARSER = null;
    public static final int PERMISSION_FIELD_NUMBER = 3;
    private int accessType_;
    private int bitField0_;
    private n dataType_;
    private String permission_ = "";

    /* compiled from: PermissionProto.java */
    public static final class a extends GeneratedMessageLite.a<m0, a> {
        public a() {
            super(m0.DEFAULT_INSTANCE);
        }
    }

    static {
        m0 m0Var = new m0();
        DEFAULT_INSTANCE = m0Var;
        GeneratedMessageLite.r(m0.class, m0Var);
    }

    public static void t(m0 m0Var, String str) {
        m0Var.getClass();
        str.getClass();
        m0Var.bitField0_ |= 4;
        m0Var.permission_ = str;
    }

    public static a v() {
        return DEFAULT_INSTANCE.h();
    }

    public static m0 w(byte[] bArr) throws InvalidProtocolBufferException {
        return (m0) GeneratedMessageLite.q(DEFAULT_INSTANCE, bArr);
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        gj90 gj90Var;
        switch (l0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new m0();
            case 2:
                return new a();
            case 3:
                return new jye0(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "dataType_", "accessType_", PermissionProto$AccessType.b.a, "permission_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                gj90<m0> gj90Var2 = PARSER;
                if (gj90Var2 != null) {
                    return gj90Var2;
                }
                synchronized (m0.class) {
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

    public final String u() {
        return this.permission_;
    }
}
