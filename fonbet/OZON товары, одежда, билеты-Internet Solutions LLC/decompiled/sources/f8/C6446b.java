package f8;

import com.google.crypto.tink.shaded.protobuf.AbstractC5903i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5917x;
import com.google.crypto.tink.shaded.protobuf.C5910p;
import com.google.crypto.tink.shaded.protobuf.a0;

/* renamed from: f8.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6446b extends AbstractC5917x<C6446b, C1005b> implements com.google.crypto.tink.shaded.protobuf.T {
    private static final C6446b DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile a0<C6446b> PARSER;
    private int bitField0_;
    private int keySize_;
    private C6447c params_;

    /* renamed from: f8.b$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62964a;

        static {
            int[] iArr = new int[AbstractC5917x.f.values().length];
            f62964a = iArr;
            try {
                iArr[AbstractC5917x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62964a[AbstractC5917x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62964a[AbstractC5917x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62964a[AbstractC5917x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62964a[AbstractC5917x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f62964a[AbstractC5917x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f62964a[AbstractC5917x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: f8.b$b, reason: collision with other inner class name */
    public static final class C1005b extends AbstractC5917x.a<C6446b, C1005b> implements com.google.crypto.tink.shaded.protobuf.T {
        /* synthetic */ C1005b(int i11) {
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
            C6446b.E((C6446b) this.f59476b, i11);
        }

        public final void j(C6447c c6447c) {
            e();
            C6446b.F((C6446b) this.f59476b, c6447c);
        }

        private C1005b() {
            super(C6446b.DEFAULT_INSTANCE);
        }
    }

    static {
        C6446b c6446b = new C6446b();
        DEFAULT_INSTANCE = c6446b;
        AbstractC5917x.B(C6446b.class, c6446b);
    }

    private C6446b() {
    }

    static void E(C6446b c6446b, int i11) {
        c6446b.keySize_ = i11;
    }

    static void F(C6446b c6446b, C6447c c6447c) {
        c6446b.getClass();
        c6446b.params_ = c6447c;
        c6446b.bitField0_ |= 1;
    }

    public static C1005b I() {
        return (C1005b) DEFAULT_INSTANCE.h();
    }

    public static C6446b J(AbstractC5903i abstractC5903i, C5910p c5910p) throws com.google.crypto.tink.shaded.protobuf.A {
        return (C6446b) AbstractC5917x.x(DEFAULT_INSTANCE, abstractC5903i, c5910p);
    }

    public final int G() {
        return this.keySize_;
    }

    public final C6447c H() {
        C6447c c6447c = this.params_;
        return c6447c == null ? C6447c.F() : c6447c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5917x, com.google.crypto.tink.shaded.protobuf.T
    public final /* bridge */ /* synthetic */ AbstractC5917x getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5917x
    protected final Object j(AbstractC5917x.f fVar) {
        a0 a0Var;
        switch (a.f62964a[fVar.ordinal()]) {
            case 1:
                return new C6446b();
            case 2:
                return new C1005b(0);
            case 3:
                return AbstractC5917x.v(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"bitField0_", "keySize_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<C6446b> a0Var2 = PARSER;
                if (a0Var2 != null) {
                    return a0Var2;
                }
                synchronized (C6446b.class) {
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
