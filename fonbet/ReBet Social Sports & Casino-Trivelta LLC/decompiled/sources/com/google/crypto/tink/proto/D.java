package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC3491x;
import com.google.crypto.tink.shaded.protobuf.AbstractC3493z;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;

/* loaded from: classes3.dex */
public final class D extends AbstractC3491x implements P {
    private static final D DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile X PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private AbstractC3493z.d keyInfo_ = AbstractC3491x.o();
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
            ((D) this.f37478b).R(cVar);
            return this;
        }

        public b m(int i10) {
            f();
            ((D) this.f37478b).V(i10);
            return this;
        }

        public b() {
            super(D.DEFAULT_INSTANCE);
        }
    }

    public static final class c extends AbstractC3491x implements P {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile X PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

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

            public a l(int i10) {
                f();
                ((c) this.f37478b).V(i10);
                return this;
            }

            public a m(I i10) {
                f();
                ((c) this.f37478b).W(i10);
                return this;
            }

            public a n(z zVar) {
                f();
                ((c) this.f37478b).X(zVar);
                return this;
            }

            public a o(String str) {
                f();
                ((c) this.f37478b).Y(str);
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

        public static a U() {
            return (a) DEFAULT_INSTANCE.k();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void V(int i10) {
            this.keyId_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void W(I i10) {
            this.outputPrefixType_ = i10.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void X(z zVar) {
            this.status_ = zVar.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Y(String str) {
            str.getClass();
            this.typeUrl_ = str;
        }

        public int T() {
            return this.keyId_;
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
                    return AbstractC3491x.C(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
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
        D d10 = new D();
        DEFAULT_INSTANCE = d10;
        AbstractC3491x.K(D.class, d10);
    }

    public static b U() {
        return (b) DEFAULT_INSTANCE.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(int i10) {
        this.primaryKeyId_ = i10;
    }

    public final void R(c cVar) {
        cVar.getClass();
        S();
        this.keyInfo_.add(cVar);
    }

    public final void S() {
        AbstractC3493z.d dVar = this.keyInfo_;
        if (dVar.isModifiable()) {
            return;
        }
        this.keyInfo_ = AbstractC3491x.A(dVar);
    }

    public c T(int i10) {
        return (c) this.keyInfo_.get(i10);
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
                return new D();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC3491x.C(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X x11 = PARSER;
                if (x11 != null) {
                    return x11;
                }
                synchronized (D.class) {
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
