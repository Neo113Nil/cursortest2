package f8;

import com.google.crypto.tink.shaded.protobuf.AbstractC5917x;
import com.google.crypto.tink.shaded.protobuf.a0;

/* renamed from: f8.q, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6461q extends AbstractC5917x<C6461q, b> implements com.google.crypto.tink.shaded.protobuf.T {
    public static final int CIPHERTEXT_SEGMENT_SIZE_FIELD_NUMBER = 1;
    private static final C6461q DEFAULT_INSTANCE;
    public static final int DERIVED_KEY_SIZE_FIELD_NUMBER = 2;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 3;
    private static volatile a0<C6461q> PARSER;
    private int ciphertextSegmentSize_;
    private int derivedKeySize_;
    private int hkdfHashType_;

    /* renamed from: f8.q$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62979a;

        static {
            int[] iArr = new int[AbstractC5917x.f.values().length];
            f62979a = iArr;
            try {
                iArr[AbstractC5917x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62979a[AbstractC5917x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62979a[AbstractC5917x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62979a[AbstractC5917x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62979a[AbstractC5917x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f62979a[AbstractC5917x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f62979a[AbstractC5917x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: f8.q$b */
    public static final class b extends AbstractC5917x.a<C6461q, b> implements com.google.crypto.tink.shaded.protobuf.T {
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
            C6461q.E((C6461q) this.f59476b, i11);
        }

        public final void j(int i11) {
            e();
            C6461q.F((C6461q) this.f59476b, i11);
        }

        public final void k(EnumC6443A enumC6443A) {
            e();
            C6461q.G((C6461q) this.f59476b, enumC6443A);
        }

        private b() {
            super(C6461q.DEFAULT_INSTANCE);
        }
    }

    static {
        C6461q c6461q = new C6461q();
        DEFAULT_INSTANCE = c6461q;
        AbstractC5917x.B(C6461q.class, c6461q);
    }

    private C6461q() {
    }

    static void E(C6461q c6461q, int i11) {
        c6461q.ciphertextSegmentSize_ = i11;
    }

    static void F(C6461q c6461q, int i11) {
        c6461q.derivedKeySize_ = i11;
    }

    static void G(C6461q c6461q, EnumC6443A enumC6443A) {
        c6461q.getClass();
        c6461q.hkdfHashType_ = enumC6443A.getNumber();
    }

    public static C6461q I() {
        return DEFAULT_INSTANCE;
    }

    public static b L() {
        return (b) DEFAULT_INSTANCE.h();
    }

    public final int H() {
        return this.ciphertextSegmentSize_;
    }

    public final int J() {
        return this.derivedKeySize_;
    }

    public final EnumC6443A K() {
        EnumC6443A a11 = EnumC6443A.a(this.hkdfHashType_);
        return a11 == null ? EnumC6443A.UNRECOGNIZED : a11;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5917x, com.google.crypto.tink.shaded.protobuf.T
    public final /* bridge */ /* synthetic */ AbstractC5917x getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5917x
    protected final Object j(AbstractC5917x.f fVar) {
        a0 a0Var;
        switch (a.f62979a[fVar.ordinal()]) {
            case 1:
                return new C6461q();
            case 2:
                return new b(0);
            case 3:
                return AbstractC5917x.v(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\f", new Object[]{"ciphertextSegmentSize_", "derivedKeySize_", "hkdfHashType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<C6461q> a0Var2 = PARSER;
                if (a0Var2 != null) {
                    return a0Var2;
                }
                synchronized (C6461q.class) {
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
