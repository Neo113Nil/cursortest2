package f8;

import com.google.crypto.tink.shaded.protobuf.AbstractC5903i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5917x;
import com.google.crypto.tink.shaded.protobuf.C5910p;
import com.google.crypto.tink.shaded.protobuf.a0;

/* loaded from: classes9.dex */
public final class G extends AbstractC5917x<G, b> implements com.google.crypto.tink.shaded.protobuf.T {
    private static final G DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile a0<G> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private AbstractC5903i value_ = AbstractC5903i.f59377b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62949a;

        static {
            int[] iArr = new int[AbstractC5917x.f.values().length];
            f62949a = iArr;
            try {
                iArr[AbstractC5917x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62949a[AbstractC5917x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62949a[AbstractC5917x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62949a[AbstractC5917x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62949a[AbstractC5917x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f62949a[AbstractC5917x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f62949a[AbstractC5917x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC5917x.a<G, b> implements com.google.crypto.tink.shaded.protobuf.T {
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

        public final void i(O o11) {
            e();
            G.G((G) this.f59476b, o11);
        }

        public final void j(String str) {
            e();
            G.E((G) this.f59476b, str);
        }

        public final void k(AbstractC5903i abstractC5903i) {
            e();
            G.F((G) this.f59476b, abstractC5903i);
        }

        private b() {
            super(G.DEFAULT_INSTANCE);
        }
    }

    static {
        G g10 = new G();
        DEFAULT_INSTANCE = g10;
        AbstractC5917x.B(G.class, g10);
    }

    private G() {
    }

    static void E(G g10, String str) {
        g10.getClass();
        str.getClass();
        g10.typeUrl_ = str;
    }

    static void F(G g10, AbstractC5903i abstractC5903i) {
        g10.getClass();
        abstractC5903i.getClass();
        g10.value_ = abstractC5903i;
    }

    static void G(G g10, O o11) {
        g10.getClass();
        g10.outputPrefixType_ = o11.getNumber();
    }

    public static G H() {
        return DEFAULT_INSTANCE;
    }

    public static b L() {
        return (b) DEFAULT_INSTANCE.h();
    }

    public static b M(G g10) {
        return (b) DEFAULT_INSTANCE.i(g10);
    }

    public static G N(byte[] bArr, C5910p c5910p) throws com.google.crypto.tink.shaded.protobuf.A {
        return (G) AbstractC5917x.z(DEFAULT_INSTANCE, bArr, c5910p);
    }

    public final O I() {
        O a11 = O.a(this.outputPrefixType_);
        return a11 == null ? O.UNRECOGNIZED : a11;
    }

    public final String J() {
        return this.typeUrl_;
    }

    public final AbstractC5903i K() {
        return this.value_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5917x, com.google.crypto.tink.shaded.protobuf.T
    public final /* bridge */ /* synthetic */ AbstractC5917x getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5917x
    protected final Object j(AbstractC5917x.f fVar) {
        a0 a0Var;
        switch (a.f62949a[fVar.ordinal()]) {
            case 1:
                return new G();
            case 2:
                return new b(0);
            case 3:
                return AbstractC5917x.v(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<G> a0Var2 = PARSER;
                if (a0Var2 != null) {
                    return a0Var2;
                }
                synchronized (G.class) {
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
