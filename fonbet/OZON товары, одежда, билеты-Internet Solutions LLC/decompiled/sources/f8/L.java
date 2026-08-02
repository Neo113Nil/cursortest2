package f8;

import com.google.crypto.tink.shaded.protobuf.AbstractC5903i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5917x;
import com.google.crypto.tink.shaded.protobuf.C5910p;
import com.google.crypto.tink.shaded.protobuf.a0;

/* loaded from: classes9.dex */
public final class L extends AbstractC5917x<L, b> implements com.google.crypto.tink.shaded.protobuf.T {
    private static final L DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile a0<L> PARSER;
    private String keyUri_ = "";

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62954a;

        static {
            int[] iArr = new int[AbstractC5917x.f.values().length];
            f62954a = iArr;
            try {
                iArr[AbstractC5917x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62954a[AbstractC5917x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62954a[AbstractC5917x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62954a[AbstractC5917x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62954a[AbstractC5917x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f62954a[AbstractC5917x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f62954a[AbstractC5917x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC5917x.a<L, b> implements com.google.crypto.tink.shaded.protobuf.T {
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

        public final void i(String str) {
            e();
            L.E((L) this.f59476b, str);
        }

        private b() {
            super(L.DEFAULT_INSTANCE);
        }
    }

    static {
        L l11 = new L();
        DEFAULT_INSTANCE = l11;
        AbstractC5917x.B(L.class, l11);
    }

    private L() {
    }

    static void E(L l11, String str) {
        l11.getClass();
        str.getClass();
        l11.keyUri_ = str;
    }

    public static L F() {
        return DEFAULT_INSTANCE;
    }

    public static b H() {
        return (b) DEFAULT_INSTANCE.h();
    }

    public static L I(AbstractC5903i abstractC5903i, C5910p c5910p) throws com.google.crypto.tink.shaded.protobuf.A {
        return (L) AbstractC5917x.x(DEFAULT_INSTANCE, abstractC5903i, c5910p);
    }

    public final String G() {
        return this.keyUri_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5917x, com.google.crypto.tink.shaded.protobuf.T
    public final /* bridge */ /* synthetic */ AbstractC5917x getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5917x
    protected final Object j(AbstractC5917x.f fVar) {
        a0 a0Var;
        switch (a.f62954a[fVar.ordinal()]) {
            case 1:
                return new L();
            case 2:
                return new b(0);
            case 3:
                return AbstractC5917x.v(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<L> a0Var2 = PARSER;
                if (a0Var2 != null) {
                    return a0Var2;
                }
                synchronized (L.class) {
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
