package f8;

import com.google.crypto.tink.shaded.protobuf.AbstractC5917x;
import com.google.crypto.tink.shaded.protobuf.C5919z;
import com.google.crypto.tink.shaded.protobuf.a0;

@Deprecated
/* loaded from: classes.dex */
public final class P extends AbstractC5917x<P, b> implements com.google.crypto.tink.shaded.protobuf.T {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final P DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile a0<P> PARSER;
    private String configName_ = "";
    private C5919z.d<H> entry_ = AbstractC5917x.k();

    /* loaded from: classes9.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62957a;

        static {
            int[] iArr = new int[AbstractC5917x.f.values().length];
            f62957a = iArr;
            try {
                iArr[AbstractC5917x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62957a[AbstractC5917x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62957a[AbstractC5917x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62957a[AbstractC5917x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62957a[AbstractC5917x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f62957a[AbstractC5917x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f62957a[AbstractC5917x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes9.dex */
    public static final class b extends AbstractC5917x.a<P, b> implements com.google.crypto.tink.shaded.protobuf.T {
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

        private b() {
            super(P.DEFAULT_INSTANCE);
        }
    }

    static {
        P p11 = new P();
        DEFAULT_INSTANCE = p11;
        AbstractC5917x.B(P.class, p11);
    }

    private P() {
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5917x, com.google.crypto.tink.shaded.protobuf.T
    public final /* bridge */ /* synthetic */ AbstractC5917x getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5917x
    protected final Object j(AbstractC5917x.f fVar) {
        a0 a0Var;
        switch (a.f62957a[fVar.ordinal()]) {
            case 1:
                return new P();
            case 2:
                return new b(0);
            case 3:
                return AbstractC5917x.v(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", H.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<P> a0Var2 = PARSER;
                if (a0Var2 != null) {
                    return a0Var2;
                }
                synchronized (P.class) {
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
