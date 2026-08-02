package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.q;
import xsna.hj90;
import xsna.kye0;
import xsna.na20;

/* loaded from: classes.dex */
public final class KeyData extends GeneratedMessageLite<KeyData, b> implements na20 {
    private static final KeyData DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile hj90<KeyData> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private ByteString value_ = ByteString.b;

    public enum KeyMaterialType implements q.a {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);

        public static final int ASYMMETRIC_PRIVATE_VALUE = 2;
        public static final int ASYMMETRIC_PUBLIC_VALUE = 3;
        public static final int REMOTE_VALUE = 4;
        public static final int SYMMETRIC_VALUE = 1;
        public static final int UNKNOWN_KEYMATERIAL_VALUE = 0;
        private static final q.b<KeyMaterialType> internalValueMap = new a();
        private final int value;

        public class a implements q.b<KeyMaterialType> {
        }

        KeyMaterialType(int i) {
            this.value = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q.a
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static /* synthetic */ class a {
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

    /* loaded from: classes13.dex */
    public static final class b extends GeneratedMessageLite.a<KeyData, b> implements na20 {
        public /* synthetic */ b(int i) {
            this();
        }

        public final void o(KeyMaterialType keyMaterialType) {
            l();
            KeyData.s((KeyData) this.c, keyMaterialType);
        }

        public final void p(String str) {
            l();
            KeyData.q((KeyData) this.c, str);
        }

        public final void q(ByteString byteString) {
            l();
            KeyData.r((KeyData) this.c, byteString);
        }

        public b() {
            super(KeyData.DEFAULT_INSTANCE);
        }
    }

    static {
        KeyData keyData = new KeyData();
        DEFAULT_INSTANCE = keyData;
        GeneratedMessageLite.o(KeyData.class, keyData);
    }

    public static void q(KeyData keyData, String str) {
        keyData.getClass();
        str.getClass();
        keyData.typeUrl_ = str;
    }

    public static void r(KeyData keyData, ByteString byteString) {
        keyData.getClass();
        byteString.getClass();
        keyData.value_ = byteString;
    }

    public static void s(KeyData keyData, KeyMaterialType keyMaterialType) {
        keyData.getClass();
        keyData.keyMaterialType_ = keyMaterialType.getNumber();
    }

    public static KeyData t() {
        return DEFAULT_INSTANCE;
    }

    public static b x() {
        return DEFAULT_INSTANCE.g();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object h(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        hj90 hj90Var;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new KeyData();
            case 2:
                return new b(0);
            case 3:
                return new kye0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hj90<KeyData> hj90Var2 = PARSER;
                if (hj90Var2 != null) {
                    return hj90Var2;
                }
                synchronized (KeyData.class) {
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

    public final KeyMaterialType u() {
        int i = this.keyMaterialType_;
        KeyMaterialType keyMaterialType = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : KeyMaterialType.REMOTE : KeyMaterialType.ASYMMETRIC_PUBLIC : KeyMaterialType.ASYMMETRIC_PRIVATE : KeyMaterialType.SYMMETRIC : KeyMaterialType.UNKNOWN_KEYMATERIAL;
        return keyMaterialType == null ? KeyMaterialType.UNRECOGNIZED : keyMaterialType;
    }

    public final String v() {
        return this.typeUrl_;
    }

    public final ByteString w() {
        return this.value_;
    }
}
