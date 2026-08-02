package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC3491x;
import com.google.crypto.tink.shaded.protobuf.AbstractC3493z;
import com.google.crypto.tink.shaded.protobuf.C3484p;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class C extends AbstractC3491x implements P {
    private static final C DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile X PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private AbstractC3493z.d key_ = AbstractC3491x.o();
    private int primaryKeyId_;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[AbstractC3491x.d.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[AbstractC3491x.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[AbstractC3491x.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[AbstractC3491x.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[AbstractC3491x.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[AbstractC3491x.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[AbstractC3491x.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[AbstractC3491x.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC3491x.a implements P {
        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.O.a
        public /* bridge */ /* synthetic */ O buildPartial() {
            return super.d();
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.e();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.P
        public /* bridge */ /* synthetic */ O getDefaultInstanceForType() {
            return super.h();
        }

        public b l(c cVar) {
            f();
            ((C) this.f37478b).R(cVar);
            return this;
        }

        public c m(int i10) {
            return ((C) this.f37478b).T(i10);
        }

        public int n() {
            return ((C) this.f37478b).U();
        }

        public List o() {
            return Collections.unmodifiableList(((C) this.f37478b).V());
        }

        public b p(int i10) {
            f();
            ((C) this.f37478b).a0(i10);
            return this;
        }

        public b() {
            super(C.DEFAULT_INSTANCE);
        }
    }

    public static final class c extends AbstractC3491x implements P {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile X PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private y keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        public static final class a extends AbstractC3491x.a implements P {
            public /* synthetic */ a(a aVar) {
                this();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.O.a
            public /* bridge */ /* synthetic */ O buildPartial() {
                return super.d();
            }

            public /* bridge */ /* synthetic */ Object clone() {
                return super.e();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.P
            public /* bridge */ /* synthetic */ O getDefaultInstanceForType() {
                return super.h();
            }

            public a l(y yVar) {
                f();
                ((c) this.f37478b).Z(yVar);
                return this;
            }

            public a m(int i10) {
                f();
                ((c) this.f37478b).a0(i10);
                return this;
            }

            public a n(I i10) {
                f();
                ((c) this.f37478b).b0(i10);
                return this;
            }

            public a o(z zVar) {
                f();
                ((c) this.f37478b).c0(zVar);
                return this;
            }

            public a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            AbstractC3491x.K(c.class, cVar);
        }

        public static a Y() {
            return (a) DEFAULT_INSTANCE.k();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b0(I i10) {
            this.outputPrefixType_ = i10.getNumber();
        }

        public y T() {
            y yVar = this.keyData_;
            return yVar == null ? y.S() : yVar;
        }

        public int U() {
            return this.keyId_;
        }

        public I V() {
            I a10 = I.a(this.outputPrefixType_);
            return a10 == null ? I.UNRECOGNIZED : a10;
        }

        public z W() {
            z a10 = z.a(this.status_);
            return a10 == null ? z.UNRECOGNIZED : a10;
        }

        public boolean X() {
            return this.keyData_ != null;
        }

        public final void Z(y yVar) {
            yVar.getClass();
            this.keyData_ = yVar;
        }

        public final void a0(int i10) {
            this.keyId_ = i10;
        }

        public final void c0(z zVar) {
            this.status_ = zVar.getNumber();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.P
        public /* bridge */ /* synthetic */ O getDefaultInstanceForType() {
            return super.q();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3491x
        public final Object n(AbstractC3491x.d dVar, Object obj, Object obj2) {
            X x10;
            a aVar = null;
            switch (a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC3491x.C(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    X x11 = PARSER;
                    if (x11 != null) {
                        return x11;
                    }
                    synchronized (c.class) {
                        try {
                            x10 = PARSER;
                            if (x10 == null) {
                                x10 = new AbstractC3491x.b(DEFAULT_INSTANCE);
                                PARSER = x10;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return x10;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.O
        public /* bridge */ /* synthetic */ O.a newBuilderForType() {
            return super.B();
        }
    }

    static {
        C c10 = new C();
        DEFAULT_INSTANCE = c10;
        AbstractC3491x.K(C.class, c10);
    }

    public static b X() {
        return (b) DEFAULT_INSTANCE.k();
    }

    public static C Y(InputStream inputStream, C3484p c3484p) {
        return (C) AbstractC3491x.F(DEFAULT_INSTANCE, inputStream, c3484p);
    }

    public static C Z(byte[] bArr, C3484p c3484p) {
        return (C) AbstractC3491x.G(DEFAULT_INSTANCE, bArr, c3484p);
    }

    public final void R(c cVar) {
        cVar.getClass();
        S();
        this.key_.add(cVar);
    }

    public final void S() {
        AbstractC3493z.d dVar = this.key_;
        if (dVar.isModifiable()) {
            return;
        }
        this.key_ = AbstractC3491x.A(dVar);
    }

    public c T(int i10) {
        return (c) this.key_.get(i10);
    }

    public int U() {
        return this.key_.size();
    }

    public List V() {
        return this.key_;
    }

    public int W() {
        return this.primaryKeyId_;
    }

    public final void a0(int i10) {
        this.primaryKeyId_ = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public /* bridge */ /* synthetic */ O getDefaultInstanceForType() {
        return super.q();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3491x
    public final Object n(AbstractC3491x.d dVar, Object obj, Object obj2) {
        X x10;
        a aVar = null;
        switch (a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dVar.ordinal()]) {
            case 1:
                return new C();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC3491x.C(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X x11 = PARSER;
                if (x11 != null) {
                    return x11;
                }
                synchronized (C.class) {
                    try {
                        x10 = PARSER;
                        if (x10 == null) {
                            x10 = new AbstractC3491x.b(DEFAULT_INSTANCE);
                            PARSER = x10;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return x10;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public /* bridge */ /* synthetic */ O.a newBuilderForType() {
        return super.B();
    }
}
