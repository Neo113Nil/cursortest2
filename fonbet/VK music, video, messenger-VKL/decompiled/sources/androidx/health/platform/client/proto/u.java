package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.GeneratedMessageLite;
import androidx.health.platform.client.proto.b0;
import xsna.gj90;
import xsna.jye0;
import xsna.ma20;

/* compiled from: ErrorProto.java */
/* loaded from: classes12.dex */
public final class u extends GeneratedMessageLite<u, a> implements ma20 {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final u DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile gj90<u> PARSER = null;
    public static final int PERMISSION_FIELD_NUMBER = 3;
    private int bitField0_;
    private int code_;
    private String message_ = "";
    private b0.d<m0> permission_ = n0.e;

    /* compiled from: ErrorProto.java */
    public static final class a extends GeneratedMessageLite.a<u, a> {
        public a() {
            super(u.DEFAULT_INSTANCE);
        }
    }

    static {
        u uVar = new u();
        DEFAULT_INSTANCE = uVar;
        GeneratedMessageLite.r(u.class, uVar);
    }

    public static void t(u uVar, int i) {
        uVar.bitField0_ |= 1;
        uVar.code_ = i;
    }

    public static void u(u uVar, String str) {
        uVar.getClass();
        str.getClass();
        uVar.bitField0_ |= 2;
        uVar.message_ = str;
    }

    public static a y() {
        return DEFAULT_INSTANCE.h();
    }

    public static u z(byte[] bArr) throws InvalidProtocolBufferException {
        return (u) GeneratedMessageLite.q(DEFAULT_INSTANCE, bArr);
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        gj90 gj90Var;
        switch (t.a[methodToInvoke.ordinal()]) {
            case 1:
                return new u();
            case 2:
                return new a();
            case 3:
                return new jye0(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"bitField0_", "code_", "message_", "permission_", m0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                gj90<u> gj90Var2 = PARSER;
                if (gj90Var2 != null) {
                    return gj90Var2;
                }
                synchronized (u.class) {
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

    public final int v() {
        return this.code_;
    }

    public final String w() {
        return this.message_;
    }

    public final boolean x() {
        return (this.bitField0_ & 2) != 0;
    }
}
