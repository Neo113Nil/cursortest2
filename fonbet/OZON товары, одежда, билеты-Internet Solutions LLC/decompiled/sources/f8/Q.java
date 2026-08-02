package f8;

import com.google.crypto.tink.shaded.protobuf.AbstractC5903i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5917x;
import com.google.crypto.tink.shaded.protobuf.C5910p;
import com.google.crypto.tink.shaded.protobuf.a0;

/* loaded from: classes9.dex */
public final class Q extends AbstractC5917x<Q, b> implements com.google.crypto.tink.shaded.protobuf.T {
    private static final Q DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile a0<Q> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private AbstractC5903i keyValue_ = AbstractC5903i.f59377b;
    private T params_;
    private int version_;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62958a;

        static {
            int[] iArr = new int[AbstractC5917x.f.values().length];
            f62958a = iArr;
            try {
                iArr[AbstractC5917x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62958a[AbstractC5917x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62958a[AbstractC5917x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62958a[AbstractC5917x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62958a[AbstractC5917x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f62958a[AbstractC5917x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f62958a[AbstractC5917x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC5917x.a<Q, b> implements com.google.crypto.tink.shaded.protobuf.T {
        /* synthetic */ b(int i11) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5917x.a, com.google.crypto.tink.shaded.protobuf.S.a
        public final /* bridge */ /* synthetic */ AbstractC5917x buildPartial() {
            return buildPartial();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5917x.a
        public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
            return clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5917x.a, com.google.crypto.tink.shaded.protobuf.T
        public final /* bridge */ /* synthetic */ AbstractC5917x getDefaultInstanceForType() {
            return f();
        }

        public final void i(AbstractC5903i abstractC5903i) {
            e();
            Q.F((Q) this.f59476b, abstractC5903i);
        }

        public final void j(T t2) {
            e();
            Q.E((Q) this.f59476b, t2);
        }

        private b() {
            super(Q.DEFAULT_INSTANCE);
        }
    }

    static {
        Q q11 = new Q();
        DEFAULT_INSTANCE = q11;
        AbstractC5917x.B(Q.class, q11);
    }

    private Q() {
    }

    static void E(Q q11, T t2) {
        q11.getClass();
        q11.params_ = t2;
        q11.bitField0_ |= 1;
    }

    static void F(Q q11, AbstractC5903i abstractC5903i) {
        q11.getClass();
        q11.keyValue_ = abstractC5903i;
    }

    public static b J() {
        return (b) DEFAULT_INSTANCE.h();
    }

    public static Q K(AbstractC5903i abstractC5903i, C5910p c5910p) throws com.google.crypto.tink.shaded.protobuf.A {
        return (Q) AbstractC5917x.x(DEFAULT_INSTANCE, abstractC5903i, c5910p);
    }

    public final AbstractC5903i G() {
        return this.keyValue_;
    }

    public final T H() {
        T t2 = this.params_;
        return t2 == null ? T.F() : t2;
    }

    public final int I() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5917x, com.google.crypto.tink.shaded.protobuf.T
    public final /* bridge */ /* synthetic */ AbstractC5917x getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5917x
    protected final Object j(AbstractC5917x.f fVar) {
        a0 a0Var;
        switch (a.f62958a[fVar.ordinal()]) {
            case 1:
                return new Q();
            case 2:
                return new b(0);
            case 3:
                return AbstractC5917x.v(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<Q> a0Var2 = PARSER;
                if (a0Var2 != null) {
                    return a0Var2;
                }
                synchronized (Q.class) {
                    try {
                        a0Var = PARSER;
                        if (a0Var == null) {
                            a0Var = new AbstractC5917x.b();
                            PARSER = a0Var;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return a0Var;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5917x, com.google.crypto.tink.shaded.protobuf.S
    public final /* bridge */ /* synthetic */ AbstractC5917x.a newBuilderForType() {
        return newBuilderForType();
    }
}
