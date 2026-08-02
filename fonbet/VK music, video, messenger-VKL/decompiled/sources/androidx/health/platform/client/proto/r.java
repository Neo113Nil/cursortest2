package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.GeneratedMessageLite;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.gj90;
import xsna.jye0;
import xsna.ma20;

/* compiled from: DataProto.java */
/* loaded from: classes12.dex */
public final class r extends GeneratedMessageLite<r, a> implements ma20 {
    public static final int BOOLEAN_VAL_FIELD_NUMBER = 5;
    private static final r DEFAULT_INSTANCE;
    public static final int DOUBLE_VAL_FIELD_NUMBER = 2;
    public static final int ENUM_VAL_FIELD_NUMBER = 4;
    public static final int LONG_VAL_FIELD_NUMBER = 1;
    private static volatile gj90<r> PARSER = null;
    public static final int STRING_VAL_FIELD_NUMBER = 3;
    private int valueCase_ = 0;
    private Object value_;

    /* compiled from: DataProto.java */
    public static final class a extends GeneratedMessageLite.a<r, a> {
    }

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        GeneratedMessageLite.r(r.class, rVar);
    }

    public static r t() {
        return DEFAULT_INSTANCE;
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        gj90 gj90Var;
        switch (i.a[methodToInvoke.ordinal()]) {
            case 1:
                return new r();
            case 2:
                return new a(DEFAULT_INSTANCE);
            case 3:
                return new jye0(DEFAULT_INSTANCE, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u00015\u0000\u00023\u0000\u0003;\u0000\u0004;\u0000\u0005:\u0000", new Object[]{"value_", "valueCase_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                gj90<r> gj90Var2 = PARSER;
                if (gj90Var2 != null) {
                    return gj90Var2;
                }
                synchronized (r.class) {
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

    public final boolean s() {
        if (this.valueCase_ == 5) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final double u() {
        return this.valueCase_ == 2 ? ((Double) this.value_).doubleValue() : ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
    }

    public final String v() {
        return this.valueCase_ == 4 ? (String) this.value_ : "";
    }

    public final long w() {
        if (this.valueCase_ == 1) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String x() {
        return this.valueCase_ == 3 ? (String) this.value_ : "";
    }
}
