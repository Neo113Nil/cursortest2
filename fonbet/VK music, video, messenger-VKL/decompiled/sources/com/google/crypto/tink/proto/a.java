package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.k;
import com.google.crypto.tink.shaded.protobuf.q;
import com.google.crypto.tink.shaded.protobuf.z;
import java.util.List;
import xsna.hj90;
import xsna.kye0;
import xsna.na20;

/* compiled from: Keyset.java */
/* loaded from: classes.dex */
public final class a extends GeneratedMessageLite<a, b> implements na20 {
    private static final a DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile hj90<a> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private q.d<c> key_ = z.e;
    private int primaryKeyId_;

    /* compiled from: Keyset.java */
    /* renamed from: com.google.crypto.tink.proto.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0133a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Keyset.java */
    public static final class b extends GeneratedMessageLite.a<a, b> implements na20 {
        public b() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: Keyset.java */
    public static final class c extends GeneratedMessageLite<c, C0134a> implements na20 {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile hj90<c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private KeyData keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        /* compiled from: Keyset.java */
        /* renamed from: com.google.crypto.tink.proto.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes13.dex */
        public static final class C0134a extends GeneratedMessageLite.a<c, C0134a> implements na20 {
            public /* synthetic */ C0134a(int i) {
                this();
            }

            public final void o(KeyData keyData) {
                l();
                c.q((c) this.c, keyData);
            }

            public final void p(int i) {
                l();
                c.t((c) this.c, i);
            }

            public final void q(OutputPrefixType outputPrefixType) {
                l();
                c.r((c) this.c, outputPrefixType);
            }

            public final void r(KeyStatusType keyStatusType) {
                l();
                c.s((c) this.c, keyStatusType);
            }

            public C0134a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            GeneratedMessageLite.o(c.class, cVar);
        }

        public static void q(c cVar, KeyData keyData) {
            cVar.getClass();
            cVar.keyData_ = keyData;
        }

        public static void r(c cVar, OutputPrefixType outputPrefixType) {
            cVar.getClass();
            cVar.outputPrefixType_ = outputPrefixType.getNumber();
        }

        public static void s(c cVar, KeyStatusType keyStatusType) {
            cVar.getClass();
            cVar.status_ = keyStatusType.getNumber();
        }

        public static void t(c cVar, int i) {
            cVar.keyId_ = i;
        }

        public static C0134a z() {
            return DEFAULT_INSTANCE.g();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
        public final Object h(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
            hj90 hj90Var;
            switch (C0133a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new C0134a(0);
                case 3:
                    return new kye0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    hj90<c> hj90Var2 = PARSER;
                    if (hj90Var2 != null) {
                        return hj90Var2;
                    }
                    synchronized (c.class) {
                        try {
                            hj90Var = PARSER;
                            if (hj90Var == null) {
                                hj90Var = new GeneratedMessageLite.b(DEFAULT_INSTANCE);
                                PARSER = hj90Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return hj90Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final KeyData u() {
            KeyData keyData = this.keyData_;
            return keyData == null ? KeyData.t() : keyData;
        }

        public final int v() {
            return this.keyId_;
        }

        public final OutputPrefixType w() {
            OutputPrefixType a = OutputPrefixType.a(this.outputPrefixType_);
            return a == null ? OutputPrefixType.UNRECOGNIZED : a;
        }

        public final KeyStatusType x() {
            int i = this.status_;
            KeyStatusType keyStatusType = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : KeyStatusType.DESTROYED : KeyStatusType.DISABLED : KeyStatusType.ENABLED : KeyStatusType.UNKNOWN_STATUS;
            return keyStatusType == null ? KeyStatusType.UNRECOGNIZED : keyStatusType;
        }

        public final boolean y() {
            return this.keyData_ != null;
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        GeneratedMessageLite.o(a.class, aVar);
    }

    public static void q(a aVar, int i) {
        aVar.primaryKeyId_ = i;
    }

    public static void r(a aVar, c cVar) {
        aVar.getClass();
        if (!aVar.key_.isModifiable()) {
            q.d<c> dVar = aVar.key_;
            int size = dVar.size();
            aVar.key_ = dVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        }
        aVar.key_.add(cVar);
    }

    public static b w() {
        return DEFAULT_INSTANCE.g();
    }

    public static a x(byte[] bArr, k kVar) throws InvalidProtocolBufferException {
        return (a) GeneratedMessageLite.n(DEFAULT_INSTANCE, bArr, kVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object h(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        hj90 hj90Var;
        switch (C0133a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return new b();
            case 3:
                return new kye0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hj90<a> hj90Var2 = PARSER;
                if (hj90Var2 != null) {
                    return hj90Var2;
                }
                synchronized (a.class) {
                    try {
                        hj90Var = PARSER;
                        if (hj90Var == null) {
                            hj90Var = new GeneratedMessageLite.b(DEFAULT_INSTANCE);
                            PARSER = hj90Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return hj90Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final c s(int i) {
        return this.key_.get(i);
    }

    public final int t() {
        return this.key_.size();
    }

    public final List<c> u() {
        return this.key_;
    }

    public final int v() {
        return this.primaryKeyId_;
    }
}
