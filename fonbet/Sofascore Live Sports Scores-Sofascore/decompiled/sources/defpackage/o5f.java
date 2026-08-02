package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class o5f extends hw8 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final o5f DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile q9e PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        o5f o5fVar = new o5f();
        DEFAULT_INSTANCE = o5fVar;
        hw8.j(o5f.class, o5fVar);
    }

    public static o5f n() {
        return DEFAULT_INSTANCE;
    }

    public static n5f v() {
        return (n5f) ((dw8) DEFAULT_INSTANCE.c(5));
    }

    public final void A(int i) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i);
    }

    public final void B(long j) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j);
    }

    public final void C(String str) {
        this.valueCase_ = 5;
        this.value_ = str;
    }

    public final void D(m5f m5fVar) {
        this.value_ = m5fVar;
        this.valueCase_ = 6;
    }

    @Override // defpackage.hw8
    public final Object c(int i) {
        q9e q9eVar;
        switch (wt3.C(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new lnf(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", m5f.class});
            case 3:
                return new o5f();
            case 4:
                return new n5f(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                q9e q9eVar2 = PARSER;
                if (q9eVar2 != null) {
                    return q9eVar2;
                }
                synchronized (o5f.class) {
                    try {
                        q9eVar = PARSER;
                        if (q9eVar == null) {
                            q9eVar = new fw8();
                            PARSER = q9eVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return q9eVar;
            default:
                a70.i();
                return null;
        }
    }

    public final boolean l() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final ec2 m() {
        return this.valueCase_ == 8 ? (ec2) this.value_ : ec2.c;
    }

    public final double o() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float p() {
        return this.valueCase_ == 2 ? ((Float) this.value_).floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final int q() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long r() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String s() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final m5f t() {
        return this.valueCase_ == 6 ? (m5f) this.value_ : m5f.m();
    }

    public final int u() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    public final void w(boolean z) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z);
    }

    public final void x(ec2 ec2Var) {
        this.valueCase_ = 8;
        this.value_ = ec2Var;
    }

    public final void y(double d) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d);
    }

    public final void z(float f) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f);
    }
}
