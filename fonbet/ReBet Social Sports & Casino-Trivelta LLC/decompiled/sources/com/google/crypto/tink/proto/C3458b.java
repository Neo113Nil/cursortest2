package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC3476h;
import com.google.crypto.tink.shaded.protobuf.AbstractC3491x;
import com.google.crypto.tink.shaded.protobuf.C3484p;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;

/* renamed from: com.google.crypto.tink.proto.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3458b extends AbstractC3491x implements P {
    private static final C3458b DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile X PARSER;
    private int keySize_;
    private C3459c params_;

    /* renamed from: com.google.crypto.tink.proto.b$a */
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

    /* renamed from: com.google.crypto.tink.proto.b$b, reason: collision with other inner class name */
    public static final class C0519b extends AbstractC3491x.a implements P {
        public /* synthetic */ C0519b(a aVar) {
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

        public C0519b l(int i10) {
            f();
            ((C3458b) this.f37478b).V(i10);
            return this;
        }

        public C0519b m(C3459c c3459c) {
            f();
            ((C3458b) this.f37478b).W(c3459c);
            return this;
        }

        public C0519b() {
            super(C3458b.DEFAULT_INSTANCE);
        }
    }

    static {
        C3458b c3458b = new C3458b();
        DEFAULT_INSTANCE = c3458b;
        AbstractC3491x.K(C3458b.class, c3458b);
    }

    public static C0519b T() {
        return (C0519b) DEFAULT_INSTANCE.k();
    }

    public static C3458b U(AbstractC3476h abstractC3476h, C3484p c3484p) {
        return (C3458b) AbstractC3491x.E(DEFAULT_INSTANCE, abstractC3476h, c3484p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(C3459c c3459c) {
        c3459c.getClass();
        this.params_ = c3459c;
    }

    public int R() {
        return this.keySize_;
    }

    public C3459c S() {
        C3459c c3459c = this.params_;
        return c3459c == null ? C3459c.Q() : c3459c;
    }

    public final void V(int i10) {
        this.keySize_ = i10;
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
                return new C3458b();
            case 2:
                return new C0519b(aVar);
            case 3:
                return AbstractC3491x.C(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X x11 = PARSER;
                if (x11 != null) {
                    return x11;
                }
                synchronized (C3458b.class) {
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
