package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC3491x;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;

/* renamed from: com.google.crypto.tink.proto.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3459c extends AbstractC3491x implements P {
    private static final C3459c DEFAULT_INSTANCE;
    private static volatile X PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    /* renamed from: com.google.crypto.tink.proto.c$a */
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

    /* renamed from: com.google.crypto.tink.proto.c$b */
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

        public b l(int i10) {
            f();
            ((C3459c) this.f37478b).T(i10);
            return this;
        }

        public b() {
            super(C3459c.DEFAULT_INSTANCE);
        }
    }

    static {
        C3459c c3459c = new C3459c();
        DEFAULT_INSTANCE = c3459c;
        AbstractC3491x.K(C3459c.class, c3459c);
    }

    public static C3459c Q() {
        return DEFAULT_INSTANCE;
    }

    public static b S() {
        return (b) DEFAULT_INSTANCE.k();
    }

    public int R() {
        return this.tagSize_;
    }

    public final void T(int i10) {
        this.tagSize_ = i10;
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
                return new C3459c();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC3491x.C(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X x11 = PARSER;
                if (x11 != null) {
                    return x11;
                }
                synchronized (C3459c.class) {
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
