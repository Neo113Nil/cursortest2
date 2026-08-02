package androidx.datastore.preferences;

import androidx.datastore.preferences.g;
import androidx.datastore.preferences.protobuf.AbstractC2132g;
import androidx.datastore.preferences.protobuf.AbstractC2147w;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.Y;

/* loaded from: classes.dex */
public final class h extends AbstractC2147w implements Q {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile Y PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    public static final class a extends AbstractC2147w.a implements Q {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public a m(boolean z10) {
            h();
            ((h) this.f19681b).e0(z10);
            return this;
        }

        public a n(AbstractC2132g abstractC2132g) {
            h();
            ((h) this.f19681b).f0(abstractC2132g);
            return this;
        }

        public a o(double d10) {
            h();
            ((h) this.f19681b).g0(d10);
            return this;
        }

        public a p(float f10) {
            h();
            ((h) this.f19681b).h0(f10);
            return this;
        }

        public a q(int i10) {
            h();
            ((h) this.f19681b).i0(i10);
            return this;
        }

        public a r(long j10) {
            h();
            ((h) this.f19681b).j0(j10);
            return this;
        }

        public a s(String str) {
            h();
            ((h) this.f19681b).k0(str);
            return this;
        }

        public a t(g.a aVar) {
            h();
            ((h) this.f19681b).l0((g) aVar.e());
            return this;
        }

        public a() {
            super(h.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        BYTES(8),
        VALUE_NOT_SET(0);


        /* renamed from: a, reason: collision with root package name */
        public final int f19399a;

        b(int i10) {
            this.f19399a = i10;
        }

        public static b b(int i10) {
            switch (i10) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                case 8:
                    return BYTES;
                default:
                    return null;
            }
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        AbstractC2147w.H(h.class, hVar);
    }

    public static h V() {
        return DEFAULT_INSTANCE;
    }

    public static a d0() {
        return (a) DEFAULT_INSTANCE.l();
    }

    public boolean T() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public AbstractC2132g U() {
        return this.valueCase_ == 8 ? (AbstractC2132g) this.value_ : AbstractC2132g.f19474b;
    }

    public double W() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public float X() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public int Y() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long Z() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public String a0() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public g b0() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.O();
    }

    public b c0() {
        return b.b(this.valueCase_);
    }

    public final void e0(boolean z10) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z10);
    }

    public final void f0(AbstractC2132g abstractC2132g) {
        abstractC2132g.getClass();
        this.valueCase_ = 8;
        this.value_ = abstractC2132g;
    }

    public final void g0(double d10) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d10);
    }

    public final void h0(float f10) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f10);
    }

    public final void i0(int i10) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i10);
    }

    public final void j0(long j10) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j10);
    }

    public final void k0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    public final void l0(g gVar) {
        gVar.getClass();
        this.value_ = gVar;
        this.valueCase_ = 6;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2147w
    public final Object o(AbstractC2147w.d dVar, Object obj, Object obj2) {
        Y y10;
        e eVar = null;
        switch (e.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC2147w.D(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y y11 = PARSER;
                if (y11 != null) {
                    return y11;
                }
                synchronized (h.class) {
                    try {
                        y10 = PARSER;
                        if (y10 == null) {
                            y10 = new AbstractC2147w.b(DEFAULT_INSTANCE);
                            PARSER = y10;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return y10;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
