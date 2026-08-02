package com.google.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.google.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5962m {
    private static final /* synthetic */ EnumC5962m[] $VALUES;
    public static final EnumC5962m BOOL;
    public static final EnumC5962m BOOL_LIST;
    public static final EnumC5962m BOOL_LIST_PACKED;
    public static final EnumC5962m BYTES;
    public static final EnumC5962m BYTES_LIST;
    public static final EnumC5962m DOUBLE;
    public static final EnumC5962m DOUBLE_LIST;
    public static final EnumC5962m DOUBLE_LIST_PACKED;
    private static final java.lang.reflect.Type[] EMPTY_TYPES;
    public static final EnumC5962m ENUM;
    public static final EnumC5962m ENUM_LIST;
    public static final EnumC5962m ENUM_LIST_PACKED;
    public static final EnumC5962m FIXED32;
    public static final EnumC5962m FIXED32_LIST;
    public static final EnumC5962m FIXED32_LIST_PACKED;
    public static final EnumC5962m FIXED64;
    public static final EnumC5962m FIXED64_LIST;
    public static final EnumC5962m FIXED64_LIST_PACKED;
    public static final EnumC5962m FLOAT;
    public static final EnumC5962m FLOAT_LIST;
    public static final EnumC5962m FLOAT_LIST_PACKED;
    public static final EnumC5962m GROUP;
    public static final EnumC5962m GROUP_LIST;
    public static final EnumC5962m INT32;
    public static final EnumC5962m INT32_LIST;
    public static final EnumC5962m INT32_LIST_PACKED;
    public static final EnumC5962m INT64;
    public static final EnumC5962m INT64_LIST;
    public static final EnumC5962m INT64_LIST_PACKED;
    public static final EnumC5962m MAP;
    public static final EnumC5962m MESSAGE;
    public static final EnumC5962m MESSAGE_LIST;
    public static final EnumC5962m SFIXED32;
    public static final EnumC5962m SFIXED32_LIST;
    public static final EnumC5962m SFIXED32_LIST_PACKED;
    public static final EnumC5962m SFIXED64;
    public static final EnumC5962m SFIXED64_LIST;
    public static final EnumC5962m SFIXED64_LIST_PACKED;
    public static final EnumC5962m SINT32;
    public static final EnumC5962m SINT32_LIST;
    public static final EnumC5962m SINT32_LIST_PACKED;
    public static final EnumC5962m SINT64;
    public static final EnumC5962m SINT64_LIST;
    public static final EnumC5962m SINT64_LIST_PACKED;
    public static final EnumC5962m STRING;
    public static final EnumC5962m STRING_LIST;
    public static final EnumC5962m UINT32;
    public static final EnumC5962m UINT32_LIST;
    public static final EnumC5962m UINT32_LIST_PACKED;
    public static final EnumC5962m UINT64;
    public static final EnumC5962m UINT64_LIST;
    public static final EnumC5962m UINT64_LIST_PACKED;
    private static final EnumC5962m[] VALUES;
    private final b collection;
    private final Class<?> elementType;

    /* renamed from: id, reason: collision with root package name */
    private final int f60218id;
    private final EnumC5966q javaType;
    private final boolean primitiveScalar;

    /* renamed from: com.google.protobuf.m$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f60219a;

        static {
            int[] iArr = new int[EnumC5966q.values().length];
            f60219a = iArr;
            try {
                iArr[EnumC5966q.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60219a[EnumC5966q.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60219a[EnumC5966q.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.google.protobuf.m$b */
    enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        private final boolean isList;

        b(boolean z11) {
            this.isList = z11;
        }
    }

    static {
        b bVar = b.SCALAR;
        EnumC5966q enumC5966q = EnumC5966q.DOUBLE;
        EnumC5962m enumC5962m = new EnumC5962m("DOUBLE", 0, 0, bVar, enumC5966q);
        DOUBLE = enumC5962m;
        EnumC5966q enumC5966q2 = EnumC5966q.FLOAT;
        EnumC5962m enumC5962m2 = new EnumC5962m("FLOAT", 1, 1, bVar, enumC5966q2);
        FLOAT = enumC5962m2;
        EnumC5966q enumC5966q3 = EnumC5966q.LONG;
        EnumC5962m enumC5962m3 = new EnumC5962m("INT64", 2, 2, bVar, enumC5966q3);
        INT64 = enumC5962m3;
        EnumC5962m enumC5962m4 = new EnumC5962m("UINT64", 3, 3, bVar, enumC5966q3);
        UINT64 = enumC5962m4;
        EnumC5966q enumC5966q4 = EnumC5966q.INT;
        EnumC5962m enumC5962m5 = new EnumC5962m("INT32", 4, 4, bVar, enumC5966q4);
        INT32 = enumC5962m5;
        EnumC5962m enumC5962m6 = new EnumC5962m("FIXED64", 5, 5, bVar, enumC5966q3);
        FIXED64 = enumC5962m6;
        EnumC5962m enumC5962m7 = new EnumC5962m("FIXED32", 6, 6, bVar, enumC5966q4);
        FIXED32 = enumC5962m7;
        EnumC5966q enumC5966q5 = EnumC5966q.BOOLEAN;
        EnumC5962m enumC5962m8 = new EnumC5962m("BOOL", 7, 7, bVar, enumC5966q5);
        BOOL = enumC5962m8;
        EnumC5966q enumC5966q6 = EnumC5966q.STRING;
        EnumC5962m enumC5962m9 = new EnumC5962m("STRING", 8, 8, bVar, enumC5966q6);
        STRING = enumC5962m9;
        EnumC5966q enumC5966q7 = EnumC5966q.MESSAGE;
        EnumC5962m enumC5962m10 = new EnumC5962m("MESSAGE", 9, 9, bVar, enumC5966q7);
        MESSAGE = enumC5962m10;
        EnumC5966q enumC5966q8 = EnumC5966q.BYTE_STRING;
        EnumC5962m enumC5962m11 = new EnumC5962m("BYTES", 10, 10, bVar, enumC5966q8);
        BYTES = enumC5962m11;
        EnumC5962m enumC5962m12 = new EnumC5962m("UINT32", 11, 11, bVar, enumC5966q4);
        UINT32 = enumC5962m12;
        EnumC5966q enumC5966q9 = EnumC5966q.ENUM;
        EnumC5962m enumC5962m13 = new EnumC5962m("ENUM", 12, 12, bVar, enumC5966q9);
        ENUM = enumC5962m13;
        EnumC5962m enumC5962m14 = new EnumC5962m("SFIXED32", 13, 13, bVar, enumC5966q4);
        SFIXED32 = enumC5962m14;
        EnumC5962m enumC5962m15 = new EnumC5962m("SFIXED64", 14, 14, bVar, enumC5966q3);
        SFIXED64 = enumC5962m15;
        EnumC5962m enumC5962m16 = new EnumC5962m("SINT32", 15, 15, bVar, enumC5966q4);
        SINT32 = enumC5962m16;
        EnumC5962m enumC5962m17 = new EnumC5962m("SINT64", 16, 16, bVar, enumC5966q3);
        SINT64 = enumC5962m17;
        EnumC5962m enumC5962m18 = new EnumC5962m("GROUP", 17, 17, bVar, enumC5966q7);
        GROUP = enumC5962m18;
        b bVar2 = b.VECTOR;
        EnumC5962m enumC5962m19 = new EnumC5962m("DOUBLE_LIST", 18, 18, bVar2, enumC5966q);
        DOUBLE_LIST = enumC5962m19;
        EnumC5962m enumC5962m20 = new EnumC5962m("FLOAT_LIST", 19, 19, bVar2, enumC5966q2);
        FLOAT_LIST = enumC5962m20;
        EnumC5962m enumC5962m21 = new EnumC5962m("INT64_LIST", 20, 20, bVar2, enumC5966q3);
        INT64_LIST = enumC5962m21;
        EnumC5962m enumC5962m22 = new EnumC5962m("UINT64_LIST", 21, 21, bVar2, enumC5966q3);
        UINT64_LIST = enumC5962m22;
        EnumC5962m enumC5962m23 = new EnumC5962m("INT32_LIST", 22, 22, bVar2, enumC5966q4);
        INT32_LIST = enumC5962m23;
        EnumC5962m enumC5962m24 = new EnumC5962m("FIXED64_LIST", 23, 23, bVar2, enumC5966q3);
        FIXED64_LIST = enumC5962m24;
        EnumC5962m enumC5962m25 = new EnumC5962m("FIXED32_LIST", 24, 24, bVar2, enumC5966q4);
        FIXED32_LIST = enumC5962m25;
        EnumC5962m enumC5962m26 = new EnumC5962m("BOOL_LIST", 25, 25, bVar2, enumC5966q5);
        BOOL_LIST = enumC5962m26;
        EnumC5962m enumC5962m27 = new EnumC5962m("STRING_LIST", 26, 26, bVar2, enumC5966q6);
        STRING_LIST = enumC5962m27;
        EnumC5962m enumC5962m28 = new EnumC5962m("MESSAGE_LIST", 27, 27, bVar2, enumC5966q7);
        MESSAGE_LIST = enumC5962m28;
        EnumC5962m enumC5962m29 = new EnumC5962m("BYTES_LIST", 28, 28, bVar2, enumC5966q8);
        BYTES_LIST = enumC5962m29;
        EnumC5962m enumC5962m30 = new EnumC5962m("UINT32_LIST", 29, 29, bVar2, enumC5966q4);
        UINT32_LIST = enumC5962m30;
        EnumC5962m enumC5962m31 = new EnumC5962m("ENUM_LIST", 30, 30, bVar2, enumC5966q9);
        ENUM_LIST = enumC5962m31;
        EnumC5962m enumC5962m32 = new EnumC5962m("SFIXED32_LIST", 31, 31, bVar2, enumC5966q4);
        SFIXED32_LIST = enumC5962m32;
        EnumC5962m enumC5962m33 = new EnumC5962m("SFIXED64_LIST", 32, 32, bVar2, enumC5966q3);
        SFIXED64_LIST = enumC5962m33;
        EnumC5962m enumC5962m34 = new EnumC5962m("SINT32_LIST", 33, 33, bVar2, enumC5966q4);
        SINT32_LIST = enumC5962m34;
        EnumC5962m enumC5962m35 = new EnumC5962m("SINT64_LIST", 34, 34, bVar2, enumC5966q3);
        SINT64_LIST = enumC5962m35;
        b bVar3 = b.PACKED_VECTOR;
        EnumC5962m enumC5962m36 = new EnumC5962m("DOUBLE_LIST_PACKED", 35, 35, bVar3, enumC5966q);
        DOUBLE_LIST_PACKED = enumC5962m36;
        EnumC5962m enumC5962m37 = new EnumC5962m("FLOAT_LIST_PACKED", 36, 36, bVar3, enumC5966q2);
        FLOAT_LIST_PACKED = enumC5962m37;
        EnumC5962m enumC5962m38 = new EnumC5962m("INT64_LIST_PACKED", 37, 37, bVar3, enumC5966q3);
        INT64_LIST_PACKED = enumC5962m38;
        EnumC5962m enumC5962m39 = new EnumC5962m("UINT64_LIST_PACKED", 38, 38, bVar3, enumC5966q3);
        UINT64_LIST_PACKED = enumC5962m39;
        EnumC5962m enumC5962m40 = new EnumC5962m("INT32_LIST_PACKED", 39, 39, bVar3, enumC5966q4);
        INT32_LIST_PACKED = enumC5962m40;
        EnumC5962m enumC5962m41 = new EnumC5962m("FIXED64_LIST_PACKED", 40, 40, bVar3, enumC5966q3);
        FIXED64_LIST_PACKED = enumC5962m41;
        EnumC5962m enumC5962m42 = new EnumC5962m("FIXED32_LIST_PACKED", 41, 41, bVar3, enumC5966q4);
        FIXED32_LIST_PACKED = enumC5962m42;
        EnumC5962m enumC5962m43 = new EnumC5962m("BOOL_LIST_PACKED", 42, 42, bVar3, enumC5966q5);
        BOOL_LIST_PACKED = enumC5962m43;
        EnumC5962m enumC5962m44 = new EnumC5962m("UINT32_LIST_PACKED", 43, 43, bVar3, enumC5966q4);
        UINT32_LIST_PACKED = enumC5962m44;
        EnumC5962m enumC5962m45 = new EnumC5962m("ENUM_LIST_PACKED", 44, 44, bVar3, enumC5966q9);
        ENUM_LIST_PACKED = enumC5962m45;
        EnumC5962m enumC5962m46 = new EnumC5962m("SFIXED32_LIST_PACKED", 45, 45, bVar3, enumC5966q4);
        SFIXED32_LIST_PACKED = enumC5962m46;
        EnumC5962m enumC5962m47 = new EnumC5962m("SFIXED64_LIST_PACKED", 46, 46, bVar3, enumC5966q3);
        SFIXED64_LIST_PACKED = enumC5962m47;
        EnumC5962m enumC5962m48 = new EnumC5962m("SINT32_LIST_PACKED", 47, 47, bVar3, enumC5966q4);
        SINT32_LIST_PACKED = enumC5962m48;
        EnumC5962m enumC5962m49 = new EnumC5962m("SINT64_LIST_PACKED", 48, 48, bVar3, enumC5966q3);
        SINT64_LIST_PACKED = enumC5962m49;
        EnumC5962m enumC5962m50 = new EnumC5962m("GROUP_LIST", 49, 49, bVar2, enumC5966q7);
        GROUP_LIST = enumC5962m50;
        EnumC5962m enumC5962m51 = new EnumC5962m("MAP", 50, 50, b.MAP, EnumC5966q.VOID);
        MAP = enumC5962m51;
        $VALUES = new EnumC5962m[]{enumC5962m, enumC5962m2, enumC5962m3, enumC5962m4, enumC5962m5, enumC5962m6, enumC5962m7, enumC5962m8, enumC5962m9, enumC5962m10, enumC5962m11, enumC5962m12, enumC5962m13, enumC5962m14, enumC5962m15, enumC5962m16, enumC5962m17, enumC5962m18, enumC5962m19, enumC5962m20, enumC5962m21, enumC5962m22, enumC5962m23, enumC5962m24, enumC5962m25, enumC5962m26, enumC5962m27, enumC5962m28, enumC5962m29, enumC5962m30, enumC5962m31, enumC5962m32, enumC5962m33, enumC5962m34, enumC5962m35, enumC5962m36, enumC5962m37, enumC5962m38, enumC5962m39, enumC5962m40, enumC5962m41, enumC5962m42, enumC5962m43, enumC5962m44, enumC5962m45, enumC5962m46, enumC5962m47, enumC5962m48, enumC5962m49, enumC5962m50, enumC5962m51};
        EMPTY_TYPES = new java.lang.reflect.Type[0];
        EnumC5962m[] values = values();
        VALUES = new EnumC5962m[values.length];
        for (EnumC5962m enumC5962m52 : values) {
            VALUES[enumC5962m52.f60218id] = enumC5962m52;
        }
    }

    private EnumC5962m(String str, int i11, int i12, b bVar, EnumC5966q enumC5966q) {
        int i13;
        this.f60218id = i12;
        this.collection = bVar;
        this.javaType = enumC5966q;
        int ordinal = bVar.ordinal();
        if (ordinal == 1) {
            this.elementType = enumC5966q.a();
        } else if (ordinal != 3) {
            this.elementType = null;
        } else {
            this.elementType = enumC5966q.a();
        }
        this.primitiveScalar = (bVar != b.SCALAR || (i13 = a.f60219a[enumC5966q.ordinal()]) == 1 || i13 == 2 || i13 == 3) ? false : true;
    }

    public static EnumC5962m valueOf(String str) {
        return (EnumC5962m) java.lang.Enum.valueOf(EnumC5962m.class, str);
    }

    public static EnumC5962m[] values() {
        return (EnumC5962m[]) $VALUES.clone();
    }

    public final int a() {
        return this.f60218id;
    }
}
