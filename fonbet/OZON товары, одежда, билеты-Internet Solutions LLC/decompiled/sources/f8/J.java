package f8;

import com.google.crypto.tink.shaded.protobuf.AbstractC5917x;
import com.google.crypto.tink.shaded.protobuf.C5919z;
import com.google.crypto.tink.shaded.protobuf.a0;

/* loaded from: classes.dex */
public final class J extends AbstractC5917x<J, b> implements com.google.crypto.tink.shaded.protobuf.T {
    private static final J DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile a0<J> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private C5919z.d<c> keyInfo_ = AbstractC5917x.k();
    private int primaryKeyId_;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62952a;

        static {
            int[] iArr = new int[AbstractC5917x.f.values().length];
            f62952a = iArr;
            try {
                iArr[AbstractC5917x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62952a[AbstractC5917x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62952a[AbstractC5917x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62952a[AbstractC5917x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62952a[AbstractC5917x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f62952a[AbstractC5917x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f62952a[AbstractC5917x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes9.dex */
    public static final class b extends AbstractC5917x.a<J, b> implements com.google.crypto.tink.shaded.protobuf.T {
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

        public final void i(c cVar) {
            e();
            J.F((J) this.f59476b, cVar);
        }

        public final void j(int i11) {
            e();
            J.E((J) this.f59476b, i11);
        }

        private b() {
            super(J.DEFAULT_INSTANCE);
        }
    }

    public static final class c extends AbstractC5917x<c, a> implements com.google.crypto.tink.shaded.protobuf.T {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile a0<c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

        /* loaded from: classes9.dex */
        public static final class a extends AbstractC5917x.a<c, a> implements com.google.crypto.tink.shaded.protobuf.T {
            /* synthetic */ a(int i11) {
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
                c.H((c) this.f59476b, i11);
            }

            public final void j(O o11) {
                e();
                c.F((c) this.f59476b, o11);
            }

            public final void k(F f7) {
                e();
                c.G((c) this.f59476b, f7);
            }

            public final void l(String str) {
                e();
                c.E((c) this.f59476b, str);
            }

            private a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            AbstractC5917x.B(c.class, cVar);
        }

        private c() {
        }

        static void E(c cVar, String str) {
            cVar.getClass();
            str.getClass();
            cVar.typeUrl_ = str;
        }

        static void F(c cVar, O o11) {
            cVar.getClass();
            cVar.outputPrefixType_ = o11.getNumber();
        }

        static void G(c cVar, F f7) {
            cVar.getClass();
            cVar.status_ = f7.getNumber();
        }

        static void H(c cVar, int i11) {
            cVar.keyId_ = i11;
        }

        public static a I() {
            return (a) DEFAULT_INSTANCE.h();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5917x, com.google.crypto.tink.shaded.protobuf.T
        public final /* bridge */ /* synthetic */ AbstractC5917x getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5917x
        protected final Object j(AbstractC5917x.f fVar) {
            a0 a0Var;
            switch (a.f62952a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(0);
                case 3:
                    return AbstractC5917x.v(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    a0<c> a0Var2 = PARSER;
                    if (a0Var2 != null) {
                        return a0Var2;
                    }
                    synchronized (c.class) {
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

    static {
        J j11 = new J();
        DEFAULT_INSTANCE = j11;
        AbstractC5917x.B(J.class, j11);
    }

    private J() {
    }

    static void E(J j11, int i11) {
        j11.primaryKeyId_ = i11;
    }

    static void F(J j11, c cVar) {
        j11.getClass();
        C5919z.d<c> dVar = j11.keyInfo_;
        if (!dVar.isModifiable()) {
            j11.keyInfo_ = dVar.mutableCopyWithCapacity(dVar.size() * 2);
        }
        j11.keyInfo_.add(cVar);
    }

    public static b G() {
        return (b) DEFAULT_INSTANCE.h();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5917x, com.google.crypto.tink.shaded.protobuf.T
    public final /* bridge */ /* synthetic */ AbstractC5917x getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5917x
    protected final Object j(AbstractC5917x.f fVar) {
        a0 a0Var;
        switch (a.f62952a[fVar.ordinal()]) {
            case 1:
                return new J();
            case 2:
                return new b(0);
            case 3:
                return AbstractC5917x.v(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<J> a0Var2 = PARSER;
                if (a0Var2 != null) {
                    return a0Var2;
                }
                synchronized (J.class) {
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
