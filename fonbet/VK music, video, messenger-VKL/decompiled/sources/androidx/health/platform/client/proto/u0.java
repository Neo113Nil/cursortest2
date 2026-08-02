package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.GeneratedMessageLite;
import androidx.health.platform.client.proto.b0;
import xsna.gj90;
import xsna.jye0;
import xsna.ma20;

/* compiled from: ResponseProto.java */
/* loaded from: classes12.dex */
public final class u0 extends GeneratedMessageLite<u0, a> implements ma20 {
    private static final u0 DEFAULT_INSTANCE;
    private static volatile gj90<u0> PARSER = null;
    public static final int ROWS_FIELD_NUMBER = 1;
    private b0.d<j> rows_ = n0.e;

    /* compiled from: ResponseProto.java */
    public static final class a extends GeneratedMessageLite.a<u0, a> {
    }

    static {
        u0 u0Var = new u0();
        DEFAULT_INSTANCE = u0Var;
        GeneratedMessageLite.r(u0.class, u0Var);
    }

    public static u0 t(byte[] bArr) throws InvalidProtocolBufferException {
        return (u0) GeneratedMessageLite.q(DEFAULT_INSTANCE, bArr);
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        gj90 gj90Var;
        switch (t0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new u0();
            case 2:
                return new a(DEFAULT_INSTANCE);
            case 3:
                return new jye0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rows_", j.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                gj90<u0> gj90Var2 = PARSER;
                if (gj90Var2 != null) {
                    return gj90Var2;
                }
                synchronized (u0.class) {
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

    public final b0.d s() {
        return this.rows_;
    }
}
