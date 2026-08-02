package f8;

import com.google.crypto.tink.shaded.protobuf.AbstractC5917x;
import com.google.crypto.tink.shaded.protobuf.C5910p;
import com.google.crypto.tink.shaded.protobuf.C5919z;
import com.google.crypto.tink.shaded.protobuf.a0;
import f8.E;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class I extends AbstractC5917x<I, b> implements com.google.crypto.tink.shaded.protobuf.T {
    private static final I DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile a0<I> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private C5919z.d<c> key_ = AbstractC5917x.k();
    private int primaryKeyId_;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62951a;

        static {
            int[] iArr = new int[AbstractC5917x.f.values().length];
            f62951a = iArr;
            try {
                iArr[AbstractC5917x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62951a[AbstractC5917x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62951a[AbstractC5917x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62951a[AbstractC5917x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62951a[AbstractC5917x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f62951a[AbstractC5917x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f62951a[AbstractC5917x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC5917x.a<I, b> implements com.google.crypto.tink.shaded.protobuf.T {
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
            I.F((I) this.f59476b, cVar);
        }

        public final void j(int i11) {
            e();
            I.E((I) this.f59476b, i11);
        }

        private b() {
            super(I.DEFAULT_INSTANCE);
        }
    }

    public static final class c extends AbstractC5917x<c, a> implements com.google.crypto.tink.shaded.protobuf.T {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile a0<c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private int bitField0_;
        private E keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

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

            public final void i(E.b bVar) {
                e();
                c.E((c) this.f59476b, bVar.b());
            }

            public final void j(int i11) {
                e();
                c.H((c) this.f59476b, i11);
            }

            public final void k(O o11) {
                e();
                c.F((c) this.f59476b, o11);
            }

            public final void l(F f7) {
                e();
                c.G((c) this.f59476b, f7);
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

        static void E(c cVar, E e11) {
            cVar.getClass();
            cVar.keyData_ = e11;
            cVar.bitField0_ |= 1;
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

        public static a N() {
            return (a) DEFAULT_INSTANCE.h();
        }

        public final E I() {
            E e11 = this.keyData_;
            return e11 == null ? E.H() : e11;
        }

        public final int J() {
            return this.keyId_;
        }

        public final O K() {
            O a11 = O.a(this.outputPrefixType_);
            return a11 == null ? O.UNRECOGNIZED : a11;
        }

        public final F L() {
            int i11 = this.status_;
            F f7 = i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? null : F.DESTROYED : F.DISABLED : F.ENABLED : F.UNKNOWN_STATUS;
            return f7 == null ? F.UNRECOGNIZED : f7;
        }

        public final boolean M() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5917x, com.google.crypto.tink.shaded.protobuf.T
        public final /* bridge */ /* synthetic */ AbstractC5917x getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5917x
        protected final Object j(AbstractC5917x.f fVar) {
            a0 a0Var;
            switch (a.f62951a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(0);
                case 3:
                    return AbstractC5917x.v(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"bitField0_", "keyData_", "status_", "keyId_", "outputPrefixType_"});
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
        I i11 = new I();
        DEFAULT_INSTANCE = i11;
        AbstractC5917x.B(I.class, i11);
    }

    private I() {
    }

    static void E(I i11, int i12) {
        i11.primaryKeyId_ = i12;
    }

    static void F(I i11, c cVar) {
        i11.getClass();
        C5919z.d<c> dVar = i11.key_;
        if (!dVar.isModifiable()) {
            i11.key_ = dVar.mutableCopyWithCapacity(dVar.size() * 2);
        }
        i11.key_.add(cVar);
    }

    public static b K() {
        return (b) DEFAULT_INSTANCE.h();
    }

    public static I L(ByteArrayInputStream byteArrayInputStream, C5910p c5910p) throws IOException {
        return (I) AbstractC5917x.y(DEFAULT_INSTANCE, byteArrayInputStream, c5910p);
    }

    public static I M(byte[] bArr, C5910p c5910p) throws com.google.crypto.tink.shaded.protobuf.A {
        return (I) AbstractC5917x.z(DEFAULT_INSTANCE, bArr, c5910p);
    }

    public final c G(int i11) {
        return this.key_.get(i11);
    }

    public final int H() {
        return this.key_.size();
    }

    public final C5919z.d I() {
        return this.key_;
    }

    public final int J() {
        return this.primaryKeyId_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5917x, com.google.crypto.tink.shaded.protobuf.T
    public final /* bridge */ /* synthetic */ AbstractC5917x getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5917x
    protected final Object j(AbstractC5917x.f fVar) {
        a0 a0Var;
        switch (a.f62951a[fVar.ordinal()]) {
            case 1:
                return new I();
            case 2:
                return new b(0);
            case 3:
                return AbstractC5917x.v(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<I> a0Var2 = PARSER;
                if (a0Var2 != null) {
                    return a0Var2;
                }
                synchronized (I.class) {
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
