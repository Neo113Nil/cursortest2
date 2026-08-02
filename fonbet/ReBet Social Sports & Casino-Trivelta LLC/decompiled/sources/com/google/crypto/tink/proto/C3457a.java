package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC3476h;
import com.google.crypto.tink.shaded.protobuf.AbstractC3491x;
import com.google.crypto.tink.shaded.protobuf.C3484p;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;

/* renamed from: com.google.crypto.tink.proto.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3457a extends AbstractC3491x implements P {
    private static final C3457a DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile X PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC3476h keyValue_ = AbstractC3476h.f37290b;
    private C3459c params_;
    private int version_;

    /* renamed from: com.google.crypto.tink.proto.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0518a {
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

    /* renamed from: com.google.crypto.tink.proto.a$b */
    public static final class b extends AbstractC3491x.a implements P {
        public /* synthetic */ b(C0518a c0518a) {
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

        public b l(AbstractC3476h abstractC3476h) {
            f();
            ((C3457a) this.f37478b).X(abstractC3476h);
            return this;
        }

        public b m(C3459c c3459c) {
            f();
            ((C3457a) this.f37478b).Y(c3459c);
            return this;
        }

        public b n(int i10) {
            f();
            ((C3457a) this.f37478b).Z(i10);
            return this;
        }

        public b() {
            super(C3457a.DEFAULT_INSTANCE);
        }
    }

    static {
        C3457a c3457a = new C3457a();
        DEFAULT_INSTANCE = c3457a;
        AbstractC3491x.K(C3457a.class, c3457a);
    }

    public static b V() {
        return (b) DEFAULT_INSTANCE.k();
    }

    public static C3457a W(AbstractC3476h abstractC3476h, C3484p c3484p) {
        return (C3457a) AbstractC3491x.E(DEFAULT_INSTANCE, abstractC3476h, c3484p);
    }

    public AbstractC3476h S() {
        return this.keyValue_;
    }

    public C3459c T() {
        C3459c c3459c = this.params_;
        return c3459c == null ? C3459c.Q() : c3459c;
    }

    public int U() {
        return this.version_;
    }

    public final void X(AbstractC3476h abstractC3476h) {
        abstractC3476h.getClass();
        this.keyValue_ = abstractC3476h;
    }

    public final void Y(C3459c c3459c) {
        c3459c.getClass();
        this.params_ = c3459c;
    }

    public final void Z(int i10) {
        this.version_ = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public /* bridge */ /* synthetic */ O getDefaultInstanceForType() {
        return super.q();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3491x
    public final Object n(AbstractC3491x.d dVar, Object obj, Object obj2) {
        X x10;
        C0518a c0518a = null;
        switch (C0518a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dVar.ordinal()]) {
            case 1:
                return new C3457a();
            case 2:
                return new b(c0518a);
            case 3:
                return AbstractC3491x.C(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X x11 = PARSER;
                if (x11 != null) {
                    return x11;
                }
                synchronized (C3457a.class) {
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
