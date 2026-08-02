package f8;

import com.google.crypto.tink.shaded.protobuf.AbstractC5917x;
import com.google.crypto.tink.shaded.protobuf.a0;

/* renamed from: f8.j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6454j extends AbstractC5917x<C6454j, b> implements com.google.crypto.tink.shaded.protobuf.T {
    private static final C6454j DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile a0<C6454j> PARSER;
    private int bitField0_;
    private int keySize_;
    private C6455k params_;

    /* renamed from: f8.j$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62972a;

        static {
            int[] iArr = new int[AbstractC5917x.f.values().length];
            f62972a = iArr;
            try {
                iArr[AbstractC5917x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62972a[AbstractC5917x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62972a[AbstractC5917x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62972a[AbstractC5917x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62972a[AbstractC5917x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f62972a[AbstractC5917x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f62972a[AbstractC5917x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: f8.j$b */
    public static final class b extends AbstractC5917x.a<C6454j, b> implements com.google.crypto.tink.shaded.protobuf.T {
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

        public final void i(int i11) {
            e();
            C6454j.F((C6454j) this.f59476b, i11);
        }

        public final void j(C6455k c6455k) {
            e();
            C6454j.E((C6454j) this.f59476b, c6455k);
        }

        private b() {
            super(C6454j.DEFAULT_INSTANCE);
        }
    }

    static {
        C6454j c6454j = new C6454j();
        DEFAULT_INSTANCE = c6454j;
        AbstractC5917x.B(C6454j.class, c6454j);
    }

    private C6454j() {
    }

    static void E(C6454j c6454j, C6455k c6455k) {
        c6454j.getClass();
        c6454j.params_ = c6455k;
        c6454j.bitField0_ |= 1;
    }

    static void F(C6454j c6454j, int i11) {
        c6454j.keySize_ = i11;
    }

    public static C6454j G() {
        return DEFAULT_INSTANCE;
    }

    public static b J() {
        return (b) DEFAULT_INSTANCE.h();
    }

    public final int H() {
        return this.keySize_;
    }

    public final C6455k I() {
        C6455k c6455k = this.params_;
        return c6455k == null ? C6455k.F() : c6455k;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5917x, com.google.crypto.tink.shaded.protobuf.T
    public final /* bridge */ /* synthetic */ AbstractC5917x getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5917x
    protected final Object j(AbstractC5917x.f fVar) {
        a0 a0Var;
        switch (a.f62972a[fVar.ordinal()]) {
            case 1:
                return new C6454j();
            case 2:
                return new b(0);
            case 3:
                return AbstractC5917x.v(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"bitField0_", "params_", "keySize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<C6454j> a0Var2 = PARSER;
                if (a0Var2 != null) {
                    return a0Var2;
                }
                synchronized (C6454j.class) {
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
