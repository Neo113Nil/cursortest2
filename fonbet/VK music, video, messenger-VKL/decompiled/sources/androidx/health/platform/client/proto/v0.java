package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.GeneratedMessageLite;
import androidx.health.platform.client.proto.b0;
import xsna.gj90;
import xsna.jye0;
import xsna.ma20;

/* compiled from: ResponseProto.java */
/* loaded from: classes12.dex */
public final class v0 extends GeneratedMessageLite<v0, a> implements ma20 {
    public static final int DATA_POINT_FIELD_NUMBER = 1;
    private static final v0 DEFAULT_INSTANCE;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 2;
    private static volatile gj90<v0> PARSER;
    private int bitField0_;
    private b0.d<m> dataPoint_ = n0.e;
    private String pageToken_ = "";

    /* compiled from: ResponseProto.java */
    public static final class a extends GeneratedMessageLite.a<v0, a> {
    }

    static {
        v0 v0Var = new v0();
        DEFAULT_INSTANCE = v0Var;
        GeneratedMessageLite.r(v0.class, v0Var);
    }

    public static v0 u(byte[] bArr) throws InvalidProtocolBufferException {
        return (v0) GeneratedMessageLite.q(DEFAULT_INSTANCE, bArr);
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        gj90 gj90Var;
        switch (t0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new v0();
            case 2:
                return new a(DEFAULT_INSTANCE);
            case 3:
                return new jye0(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"bitField0_", "dataPoint_", m.class, "pageToken_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                gj90<v0> gj90Var2 = PARSER;
                if (gj90Var2 != null) {
                    return gj90Var2;
                }
                synchronized (v0.class) {
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
        return this.dataPoint_;
    }

    public final String t() {
        return this.pageToken_;
    }
}
