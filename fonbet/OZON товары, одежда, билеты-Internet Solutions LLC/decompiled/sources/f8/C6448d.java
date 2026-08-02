package f8;

import com.google.crypto.tink.shaded.protobuf.AbstractC5903i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5917x;
import com.google.crypto.tink.shaded.protobuf.C5910p;
import com.google.crypto.tink.shaded.protobuf.a0;

/* renamed from: f8.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6448d extends AbstractC5917x<C6448d, b> implements com.google.crypto.tink.shaded.protobuf.T {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final C6448d DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile a0<C6448d> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C6453i aesCtrKey_;
    private int bitField0_;
    private C6444B hmacKey_;
    private int version_;

    /* renamed from: f8.d$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62966a;

        static {
            int[] iArr = new int[AbstractC5917x.f.values().length];
            f62966a = iArr;
            try {
                iArr[AbstractC5917x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62966a[AbstractC5917x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62966a[AbstractC5917x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62966a[AbstractC5917x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62966a[AbstractC5917x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f62966a[AbstractC5917x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f62966a[AbstractC5917x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: f8.d$b */
    /* loaded from: classes9.dex */
    public static final class b extends AbstractC5917x.a<C6448d, b> implements com.google.crypto.tink.shaded.protobuf.T {
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

        public final void i(C6453i c6453i) {
            e();
            C6448d.E((C6448d) this.f59476b, c6453i);
        }

        public final void j(C6444B c6444b) {
            e();
            C6448d.F((C6448d) this.f59476b, c6444b);
        }

        private b() {
            super(C6448d.DEFAULT_INSTANCE);
        }
    }

    static {
        C6448d c6448d = new C6448d();
        DEFAULT_INSTANCE = c6448d;
        AbstractC5917x.B(C6448d.class, c6448d);
    }

    private C6448d() {
    }

    static void E(C6448d c6448d, C6453i c6453i) {
        c6448d.getClass();
        c6448d.aesCtrKey_ = c6453i;
        c6448d.bitField0_ |= 1;
    }

    static void F(C6448d c6448d, C6444B c6444b) {
        c6448d.getClass();
        c6448d.hmacKey_ = c6444b;
        c6448d.bitField0_ |= 2;
    }

    public static b J() {
        return (b) DEFAULT_INSTANCE.h();
    }

    public static C6448d K(AbstractC5903i abstractC5903i, C5910p c5910p) throws com.google.crypto.tink.shaded.protobuf.A {
        return (C6448d) AbstractC5917x.x(DEFAULT_INSTANCE, abstractC5903i, c5910p);
    }

    public static a0<C6448d> L() {
        return DEFAULT_INSTANCE.n();
    }

    public final C6453i G() {
        C6453i c6453i = this.aesCtrKey_;
        return c6453i == null ? C6453i.G() : c6453i;
    }

    public final C6444B H() {
        C6444B c6444b = this.hmacKey_;
        return c6444b == null ? C6444B.G() : c6444b;
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
        switch (a.f62966a[fVar.ordinal()]) {
            case 1:
                return new C6448d();
            case 2:
                return new b(0);
            case 3:
                return AbstractC5917x.v(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "version_", "aesCtrKey_", "hmacKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<C6448d> a0Var2 = PARSER;
                if (a0Var2 != null) {
                    return a0Var2;
                }
                synchronized (C6448d.class) {
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
