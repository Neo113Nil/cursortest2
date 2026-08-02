package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Type;

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
/* renamed from: com.google.crypto.tink.shaded.protobuf.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5914u {
    private static final /* synthetic */ EnumC5914u[] $VALUES;
    public static final EnumC5914u BOOL;
    public static final EnumC5914u BOOL_LIST;
    public static final EnumC5914u BOOL_LIST_PACKED;
    public static final EnumC5914u BYTES;
    public static final EnumC5914u BYTES_LIST;
    public static final EnumC5914u DOUBLE;
    public static final EnumC5914u DOUBLE_LIST;
    public static final EnumC5914u DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final EnumC5914u ENUM;
    public static final EnumC5914u ENUM_LIST;
    public static final EnumC5914u ENUM_LIST_PACKED;
    public static final EnumC5914u FIXED32;
    public static final EnumC5914u FIXED32_LIST;
    public static final EnumC5914u FIXED32_LIST_PACKED;
    public static final EnumC5914u FIXED64;
    public static final EnumC5914u FIXED64_LIST;
    public static final EnumC5914u FIXED64_LIST_PACKED;
    public static final EnumC5914u FLOAT;
    public static final EnumC5914u FLOAT_LIST;
    public static final EnumC5914u FLOAT_LIST_PACKED;
    public static final EnumC5914u GROUP;
    public static final EnumC5914u GROUP_LIST;
    public static final EnumC5914u INT32;
    public static final EnumC5914u INT32_LIST;
    public static final EnumC5914u INT32_LIST_PACKED;
    public static final EnumC5914u INT64;
    public static final EnumC5914u INT64_LIST;
    public static final EnumC5914u INT64_LIST_PACKED;
    public static final EnumC5914u MAP;
    public static final EnumC5914u MESSAGE;
    public static final EnumC5914u MESSAGE_LIST;
    public static final EnumC5914u SFIXED32;
    public static final EnumC5914u SFIXED32_LIST;
    public static final EnumC5914u SFIXED32_LIST_PACKED;
    public static final EnumC5914u SFIXED64;
    public static final EnumC5914u SFIXED64_LIST;
    public static final EnumC5914u SFIXED64_LIST_PACKED;
    public static final EnumC5914u SINT32;
    public static final EnumC5914u SINT32_LIST;
    public static final EnumC5914u SINT32_LIST_PACKED;
    public static final EnumC5914u SINT64;
    public static final EnumC5914u SINT64_LIST;
    public static final EnumC5914u SINT64_LIST_PACKED;
    public static final EnumC5914u STRING;
    public static final EnumC5914u STRING_LIST;
    public static final EnumC5914u UINT32;
    public static final EnumC5914u UINT32_LIST;
    public static final EnumC5914u UINT32_LIST_PACKED;
    public static final EnumC5914u UINT64;
    public static final EnumC5914u UINT64_LIST;
    public static final EnumC5914u UINT64_LIST_PACKED;
    private static final EnumC5914u[] VALUES;
    private final b collection;
    private final Class<?> elementType;

    /* renamed from: id, reason: collision with root package name */
    private final int f59469id;
    private final B javaType;
    private final boolean primitiveScalar;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.u$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f59470a;

        static {
            int[] iArr = new int[B.values().length];
            f59470a = iArr;
            try {
                iArr[B.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59470a[B.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59470a[B.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.u$b */
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
        B b11 = B.DOUBLE;
        EnumC5914u enumC5914u = new EnumC5914u("DOUBLE", 0, 0, bVar, b11);
        DOUBLE = enumC5914u;
        B b12 = B.FLOAT;
        EnumC5914u enumC5914u2 = new EnumC5914u("FLOAT", 1, 1, bVar, b12);
        FLOAT = enumC5914u2;
        B b13 = B.LONG;
        EnumC5914u enumC5914u3 = new EnumC5914u("INT64", 2, 2, bVar, b13);
        INT64 = enumC5914u3;
        EnumC5914u enumC5914u4 = new EnumC5914u("UINT64", 3, 3, bVar, b13);
        UINT64 = enumC5914u4;
        B b14 = B.INT;
        EnumC5914u enumC5914u5 = new EnumC5914u("INT32", 4, 4, bVar, b14);
        INT32 = enumC5914u5;
        EnumC5914u enumC5914u6 = new EnumC5914u("FIXED64", 5, 5, bVar, b13);
        FIXED64 = enumC5914u6;
        EnumC5914u enumC5914u7 = new EnumC5914u("FIXED32", 6, 6, bVar, b14);
        FIXED32 = enumC5914u7;
        B b15 = B.BOOLEAN;
        EnumC5914u enumC5914u8 = new EnumC5914u("BOOL", 7, 7, bVar, b15);
        BOOL = enumC5914u8;
        B b16 = B.STRING;
        EnumC5914u enumC5914u9 = new EnumC5914u("STRING", 8, 8, bVar, b16);
        STRING = enumC5914u9;
        B b17 = B.MESSAGE;
        EnumC5914u enumC5914u10 = new EnumC5914u("MESSAGE", 9, 9, bVar, b17);
        MESSAGE = enumC5914u10;
        B b18 = B.BYTE_STRING;
        EnumC5914u enumC5914u11 = new EnumC5914u("BYTES", 10, 10, bVar, b18);
        BYTES = enumC5914u11;
        EnumC5914u enumC5914u12 = new EnumC5914u("UINT32", 11, 11, bVar, b14);
        UINT32 = enumC5914u12;
        B b19 = B.ENUM;
        EnumC5914u enumC5914u13 = new EnumC5914u("ENUM", 12, 12, bVar, b19);
        ENUM = enumC5914u13;
        EnumC5914u enumC5914u14 = new EnumC5914u("SFIXED32", 13, 13, bVar, b14);
        SFIXED32 = enumC5914u14;
        EnumC5914u enumC5914u15 = new EnumC5914u("SFIXED64", 14, 14, bVar, b13);
        SFIXED64 = enumC5914u15;
        EnumC5914u enumC5914u16 = new EnumC5914u("SINT32", 15, 15, bVar, b14);
        SINT32 = enumC5914u16;
        EnumC5914u enumC5914u17 = new EnumC5914u("SINT64", 16, 16, bVar, b13);
        SINT64 = enumC5914u17;
        EnumC5914u enumC5914u18 = new EnumC5914u("GROUP", 17, 17, bVar, b17);
        GROUP = enumC5914u18;
        b bVar2 = b.VECTOR;
        EnumC5914u enumC5914u19 = new EnumC5914u("DOUBLE_LIST", 18, 18, bVar2, b11);
        DOUBLE_LIST = enumC5914u19;
        EnumC5914u enumC5914u20 = new EnumC5914u("FLOAT_LIST", 19, 19, bVar2, b12);
        FLOAT_LIST = enumC5914u20;
        EnumC5914u enumC5914u21 = new EnumC5914u("INT64_LIST", 20, 20, bVar2, b13);
        INT64_LIST = enumC5914u21;
        EnumC5914u enumC5914u22 = new EnumC5914u("UINT64_LIST", 21, 21, bVar2, b13);
        UINT64_LIST = enumC5914u22;
        EnumC5914u enumC5914u23 = new EnumC5914u("INT32_LIST", 22, 22, bVar2, b14);
        INT32_LIST = enumC5914u23;
        EnumC5914u enumC5914u24 = new EnumC5914u("FIXED64_LIST", 23, 23, bVar2, b13);
        FIXED64_LIST = enumC5914u24;
        EnumC5914u enumC5914u25 = new EnumC5914u("FIXED32_LIST", 24, 24, bVar2, b14);
        FIXED32_LIST = enumC5914u25;
        EnumC5914u enumC5914u26 = new EnumC5914u("BOOL_LIST", 25, 25, bVar2, b15);
        BOOL_LIST = enumC5914u26;
        EnumC5914u enumC5914u27 = new EnumC5914u("STRING_LIST", 26, 26, bVar2, b16);
        STRING_LIST = enumC5914u27;
        EnumC5914u enumC5914u28 = new EnumC5914u("MESSAGE_LIST", 27, 27, bVar2, b17);
        MESSAGE_LIST = enumC5914u28;
        EnumC5914u enumC5914u29 = new EnumC5914u("BYTES_LIST", 28, 28, bVar2, b18);
        BYTES_LIST = enumC5914u29;
        EnumC5914u enumC5914u30 = new EnumC5914u("UINT32_LIST", 29, 29, bVar2, b14);
        UINT32_LIST = enumC5914u30;
        EnumC5914u enumC5914u31 = new EnumC5914u("ENUM_LIST", 30, 30, bVar2, b19);
        ENUM_LIST = enumC5914u31;
        EnumC5914u enumC5914u32 = new EnumC5914u("SFIXED32_LIST", 31, 31, bVar2, b14);
        SFIXED32_LIST = enumC5914u32;
        EnumC5914u enumC5914u33 = new EnumC5914u("SFIXED64_LIST", 32, 32, bVar2, b13);
        SFIXED64_LIST = enumC5914u33;
        EnumC5914u enumC5914u34 = new EnumC5914u("SINT32_LIST", 33, 33, bVar2, b14);
        SINT32_LIST = enumC5914u34;
        EnumC5914u enumC5914u35 = new EnumC5914u("SINT64_LIST", 34, 34, bVar2, b13);
        SINT64_LIST = enumC5914u35;
        b bVar3 = b.PACKED_VECTOR;
        EnumC5914u enumC5914u36 = new EnumC5914u("DOUBLE_LIST_PACKED", 35, 35, bVar3, b11);
        DOUBLE_LIST_PACKED = enumC5914u36;
        EnumC5914u enumC5914u37 = new EnumC5914u("FLOAT_LIST_PACKED", 36, 36, bVar3, b12);
        FLOAT_LIST_PACKED = enumC5914u37;
        EnumC5914u enumC5914u38 = new EnumC5914u("INT64_LIST_PACKED", 37, 37, bVar3, b13);
        INT64_LIST_PACKED = enumC5914u38;
        EnumC5914u enumC5914u39 = new EnumC5914u("UINT64_LIST_PACKED", 38, 38, bVar3, b13);
        UINT64_LIST_PACKED = enumC5914u39;
        EnumC5914u enumC5914u40 = new EnumC5914u("INT32_LIST_PACKED", 39, 39, bVar3, b14);
        INT32_LIST_PACKED = enumC5914u40;
        EnumC5914u enumC5914u41 = new EnumC5914u("FIXED64_LIST_PACKED", 40, 40, bVar3, b13);
        FIXED64_LIST_PACKED = enumC5914u41;
        EnumC5914u enumC5914u42 = new EnumC5914u("FIXED32_LIST_PACKED", 41, 41, bVar3, b14);
        FIXED32_LIST_PACKED = enumC5914u42;
        EnumC5914u enumC5914u43 = new EnumC5914u("BOOL_LIST_PACKED", 42, 42, bVar3, b15);
        BOOL_LIST_PACKED = enumC5914u43;
        EnumC5914u enumC5914u44 = new EnumC5914u("UINT32_LIST_PACKED", 43, 43, bVar3, b14);
        UINT32_LIST_PACKED = enumC5914u44;
        EnumC5914u enumC5914u45 = new EnumC5914u("ENUM_LIST_PACKED", 44, 44, bVar3, b19);
        ENUM_LIST_PACKED = enumC5914u45;
        EnumC5914u enumC5914u46 = new EnumC5914u("SFIXED32_LIST_PACKED", 45, 45, bVar3, b14);
        SFIXED32_LIST_PACKED = enumC5914u46;
        EnumC5914u enumC5914u47 = new EnumC5914u("SFIXED64_LIST_PACKED", 46, 46, bVar3, b13);
        SFIXED64_LIST_PACKED = enumC5914u47;
        EnumC5914u enumC5914u48 = new EnumC5914u("SINT32_LIST_PACKED", 47, 47, bVar3, b14);
        SINT32_LIST_PACKED = enumC5914u48;
        EnumC5914u enumC5914u49 = new EnumC5914u("SINT64_LIST_PACKED", 48, 48, bVar3, b13);
        SINT64_LIST_PACKED = enumC5914u49;
        EnumC5914u enumC5914u50 = new EnumC5914u("GROUP_LIST", 49, 49, bVar2, b17);
        GROUP_LIST = enumC5914u50;
        EnumC5914u enumC5914u51 = new EnumC5914u("MAP", 50, 50, b.MAP, B.VOID);
        MAP = enumC5914u51;
        $VALUES = new EnumC5914u[]{enumC5914u, enumC5914u2, enumC5914u3, enumC5914u4, enumC5914u5, enumC5914u6, enumC5914u7, enumC5914u8, enumC5914u9, enumC5914u10, enumC5914u11, enumC5914u12, enumC5914u13, enumC5914u14, enumC5914u15, enumC5914u16, enumC5914u17, enumC5914u18, enumC5914u19, enumC5914u20, enumC5914u21, enumC5914u22, enumC5914u23, enumC5914u24, enumC5914u25, enumC5914u26, enumC5914u27, enumC5914u28, enumC5914u29, enumC5914u30, enumC5914u31, enumC5914u32, enumC5914u33, enumC5914u34, enumC5914u35, enumC5914u36, enumC5914u37, enumC5914u38, enumC5914u39, enumC5914u40, enumC5914u41, enumC5914u42, enumC5914u43, enumC5914u44, enumC5914u45, enumC5914u46, enumC5914u47, enumC5914u48, enumC5914u49, enumC5914u50, enumC5914u51};
        EMPTY_TYPES = new Type[0];
        EnumC5914u[] values = values();
        VALUES = new EnumC5914u[values.length];
        for (EnumC5914u enumC5914u52 : values) {
            VALUES[enumC5914u52.f59469id] = enumC5914u52;
        }
    }

    private EnumC5914u(String str, int i11, int i12, b bVar, B b11) {
        int i13;
        this.f59469id = i12;
        this.collection = bVar;
        this.javaType = b11;
        int ordinal = bVar.ordinal();
        if (ordinal == 1) {
            this.elementType = b11.a();
        } else if (ordinal != 3) {
            this.elementType = null;
        } else {
            this.elementType = b11.a();
        }
        this.primitiveScalar = (bVar != b.SCALAR || (i13 = a.f59470a[b11.ordinal()]) == 1 || i13 == 2 || i13 == 3) ? false : true;
    }

    public static EnumC5914u valueOf(String str) {
        return (EnumC5914u) Enum.valueOf(EnumC5914u.class, str);
    }

    public static EnumC5914u[] values() {
        return (EnumC5914u[]) $VALUES.clone();
    }

    public final int a() {
        return this.f59469id;
    }
}
