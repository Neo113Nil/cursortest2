package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.kj90;
import xsna.mye0;
import xsna.oa20;
import xsna.yyc0;

/* loaded from: classes.dex */
public final class PreferencesProto$Value extends GeneratedMessageLite<PreferencesProto$Value, a> implements oa20 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final PreferencesProto$Value DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile kj90<PreferencesProto$Value> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    public enum ValueCase {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        BYTES(8),
        VALUE_NOT_SET(0);

        private final int value;

        ValueCase(int i) {
            this.value = i;
        }
    }

    public static final class a extends GeneratedMessageLite.a<PreferencesProto$Value, a> implements oa20 {
        public a() {
            super(PreferencesProto$Value.DEFAULT_INSTANCE);
        }
    }

    static {
        PreferencesProto$Value preferencesProto$Value = new PreferencesProto$Value();
        DEFAULT_INSTANCE = preferencesProto$Value;
        GeneratedMessageLite.m(PreferencesProto$Value.class, preferencesProto$Value);
    }

    public static a G() {
        return (a) ((GeneratedMessageLite.a) DEFAULT_INSTANCE.f(GeneratedMessageLite.MethodToInvoke.NEW_BUILDER));
    }

    public static void n(PreferencesProto$Value preferencesProto$Value, long j) {
        preferencesProto$Value.valueCase_ = 4;
        preferencesProto$Value.value_ = Long.valueOf(j);
    }

    public static void o(PreferencesProto$Value preferencesProto$Value, String str) {
        preferencesProto$Value.getClass();
        str.getClass();
        preferencesProto$Value.valueCase_ = 5;
        preferencesProto$Value.value_ = str;
    }

    public static void p(PreferencesProto$Value preferencesProto$Value, androidx.datastore.preferences.a aVar) {
        preferencesProto$Value.getClass();
        preferencesProto$Value.value_ = aVar;
        preferencesProto$Value.valueCase_ = 6;
    }

    public static void q(PreferencesProto$Value preferencesProto$Value, double d) {
        preferencesProto$Value.valueCase_ = 7;
        preferencesProto$Value.value_ = Double.valueOf(d);
    }

    public static void r(PreferencesProto$Value preferencesProto$Value, ByteString.g gVar) {
        preferencesProto$Value.getClass();
        preferencesProto$Value.valueCase_ = 8;
        preferencesProto$Value.value_ = gVar;
    }

    public static void t(PreferencesProto$Value preferencesProto$Value, boolean z) {
        preferencesProto$Value.valueCase_ = 1;
        preferencesProto$Value.value_ = Boolean.valueOf(z);
    }

    public static void u(PreferencesProto$Value preferencesProto$Value, float f) {
        preferencesProto$Value.valueCase_ = 2;
        preferencesProto$Value.value_ = Float.valueOf(f);
    }

    public static void v(PreferencesProto$Value preferencesProto$Value, int i) {
        preferencesProto$Value.valueCase_ = 3;
        preferencesProto$Value.value_ = Integer.valueOf(i);
    }

    public static PreferencesProto$Value y() {
        return DEFAULT_INSTANCE;
    }

    public final float A() {
        return this.valueCase_ == 2 ? ((Float) this.value_).floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final int B() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long C() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String D() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final androidx.datastore.preferences.a E() {
        return this.valueCase_ == 6 ? (androidx.datastore.preferences.a) this.value_ : androidx.datastore.preferences.a.p();
    }

    public final ValueCase F() {
        switch (this.valueCase_) {
            case 0:
                return ValueCase.VALUE_NOT_SET;
            case 1:
                return ValueCase.BOOLEAN;
            case 2:
                return ValueCase.FLOAT;
            case 3:
                return ValueCase.INTEGER;
            case 4:
                return ValueCase.LONG;
            case 5:
                return ValueCase.STRING;
            case 6:
                return ValueCase.STRING_SET;
            case 7:
                return ValueCase.DOUBLE;
            case 8:
                return ValueCase.BYTES;
            default:
                return null;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object f(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        kj90 kj90Var;
        switch (yyc0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new PreferencesProto$Value();
            case 2:
                return new a();
            case 3:
                return new mye0(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", androidx.datastore.preferences.a.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                kj90<PreferencesProto$Value> kj90Var2 = PARSER;
                if (kj90Var2 != null) {
                    return kj90Var2;
                }
                synchronized (PreferencesProto$Value.class) {
                    try {
                        kj90Var = PARSER;
                        if (kj90Var == null) {
                            kj90Var = new GeneratedMessageLite.b(DEFAULT_INSTANCE);
                            PARSER = kj90Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return kj90Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean w() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final ByteString x() {
        return this.valueCase_ == 8 ? (ByteString) this.value_ : ByteString.b;
    }

    public final double z() {
        return this.valueCase_ == 7 ? ((Double) this.value_).doubleValue() : ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
    }
}
