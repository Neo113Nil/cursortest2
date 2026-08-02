package f8;

import com.google.crypto.tink.shaded.protobuf.AbstractC5903i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5917x;
import com.google.crypto.tink.shaded.protobuf.C5910p;
import com.google.crypto.tink.shaded.protobuf.a0;

/* renamed from: f8.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6450f extends AbstractC5917x<C6450f, b> implements com.google.crypto.tink.shaded.protobuf.T {
    private static final C6450f DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile a0<C6450f> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private AbstractC5903i keyValue_ = AbstractC5903i.f59377b;
    private C6452h params_;
    private int version_;

    /* renamed from: f8.f$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62968a;

        static {
            int[] iArr = new int[AbstractC5917x.f.values().length];
            f62968a = iArr;
            try {
                iArr[AbstractC5917x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62968a[AbstractC5917x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62968a[AbstractC5917x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62968a[AbstractC5917x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62968a[AbstractC5917x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f62968a[AbstractC5917x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f62968a[AbstractC5917x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: f8.f$b */
    public static final class b extends AbstractC5917x.a<C6450f, b> implements com.google.crypto.tink.shaded.protobuf.T {
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
            C6450f.F((C6450f) this.f59476b, abstractC5903i);
        }

        public final void j(C6452h c6452h) {
            e();
            C6450f.E((C6450f) this.f59476b, c6452h);
        }

        private b() {
            super(C6450f.DEFAULT_INSTANCE);
        }
    }

    static {
        C6450f c6450f = new C6450f();
        DEFAULT_INSTANCE = c6450f;
        AbstractC5917x.B(C6450f.class, c6450f);
    }

    private C6450f() {
    }

    static void E(C6450f c6450f, C6452h c6452h) {
        c6450f.getClass();
        c6450f.params_ = c6452h;
        c6450f.bitField0_ |= 1;
    }

    static void F(C6450f c6450f, AbstractC5903i abstractC5903i) {
        c6450f.getClass();
        c6450f.keyValue_ = abstractC5903i;
    }

    public static b J() {
        return (b) DEFAULT_INSTANCE.h();
    }

    public static C6450f K(AbstractC5903i abstractC5903i, C5910p c5910p) throws com.google.crypto.tink.shaded.protobuf.A {
        return (C6450f) AbstractC5917x.x(DEFAULT_INSTANCE, abstractC5903i, c5910p);
    }

    public static a0<C6450f> L() {
        return DEFAULT_INSTANCE.n();
    }

    public final AbstractC5903i G() {
        return this.keyValue_;
    }

    public final C6452h H() {
        C6452h c6452h = this.params_;
        return c6452h == null ? C6452h.J() : c6452h;
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
        switch (a.f62968a[fVar.ordinal()]) {
            case 1:
                return new C6450f();
            case 2:
                return new b(0);
            case 3:
                return AbstractC5917x.v(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<C6450f> a0Var2 = PARSER;
                if (a0Var2 != null) {
                    return a0Var2;
                }
                synchronized (C6450f.class) {
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
