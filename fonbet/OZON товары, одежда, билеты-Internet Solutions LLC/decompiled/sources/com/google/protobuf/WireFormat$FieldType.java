package com.google.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public class WireFormat$FieldType {
    private static final /* synthetic */ WireFormat$FieldType[] $VALUES;
    public static final WireFormat$FieldType BOOL;
    public static final WireFormat$FieldType BYTES;
    public static final WireFormat$FieldType ENUM;
    public static final WireFormat$FieldType FIXED32;
    public static final WireFormat$FieldType FIXED64;
    public static final WireFormat$FieldType GROUP;
    public static final WireFormat$FieldType INT32;
    public static final WireFormat$FieldType INT64;
    public static final WireFormat$FieldType MESSAGE;
    public static final WireFormat$FieldType SFIXED32;
    public static final WireFormat$FieldType SFIXED64;
    public static final WireFormat$FieldType SINT32;
    public static final WireFormat$FieldType SINT64;
    public static final WireFormat$FieldType STRING;
    public static final WireFormat$FieldType UINT32;
    public static final WireFormat$FieldType UINT64;
    private final Q javaType;
    private final int wireType;
    public static final WireFormat$FieldType DOUBLE = new WireFormat$FieldType("DOUBLE", 0, Q.DOUBLE, 1);
    public static final WireFormat$FieldType FLOAT = new WireFormat$FieldType("FLOAT", 1, Q.FLOAT, 5);

    private static /* synthetic */ WireFormat$FieldType[] $values() {
        return new WireFormat$FieldType[]{DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, GROUP, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64};
    }

    static {
        Q q11 = Q.LONG;
        int i11 = 2;
        INT64 = new WireFormat$FieldType("INT64", 2, q11, 0);
        UINT64 = new WireFormat$FieldType("UINT64", 3, q11, 0);
        Q q12 = Q.INT;
        INT32 = new WireFormat$FieldType("INT32", 4, q12, 0);
        FIXED64 = new WireFormat$FieldType("FIXED64", 5, q11, 1);
        FIXED32 = new WireFormat$FieldType("FIXED32", 6, q12, 5);
        BOOL = new WireFormat$FieldType("BOOL", 7, Q.BOOLEAN, 0);
        STRING = new WireFormat$FieldType("STRING", 8, Q.STRING, i11) { // from class: com.google.protobuf.WireFormat$FieldType.1
            @Override // com.google.protobuf.WireFormat$FieldType
            public boolean isPackable() {
                return false;
            }
        };
        Q q13 = Q.MESSAGE;
        GROUP = new WireFormat$FieldType("GROUP", 9, q13, 3) { // from class: com.google.protobuf.WireFormat$FieldType.2
            @Override // com.google.protobuf.WireFormat$FieldType
            public boolean isPackable() {
                return false;
            }
        };
        MESSAGE = new WireFormat$FieldType("MESSAGE", 10, q13, i11) { // from class: com.google.protobuf.WireFormat$FieldType.3
            @Override // com.google.protobuf.WireFormat$FieldType
            public boolean isPackable() {
                return false;
            }
        };
        BYTES = new WireFormat$FieldType("BYTES", 11, Q.BYTE_STRING, i11) { // from class: com.google.protobuf.WireFormat$FieldType.4
            @Override // com.google.protobuf.WireFormat$FieldType
            public boolean isPackable() {
                return false;
            }
        };
        UINT32 = new WireFormat$FieldType("UINT32", 12, q12, 0);
        ENUM = new WireFormat$FieldType("ENUM", 13, Q.ENUM, 0);
        SFIXED32 = new WireFormat$FieldType("SFIXED32", 14, q12, 5);
        SFIXED64 = new WireFormat$FieldType("SFIXED64", 15, q11, 1);
        SINT32 = new WireFormat$FieldType("SINT32", 16, q12, 0);
        SINT64 = new WireFormat$FieldType("SINT64", 17, q11, 0);
        $VALUES = $values();
    }

    public static WireFormat$FieldType valueOf(String str) {
        return (WireFormat$FieldType) java.lang.Enum.valueOf(WireFormat$FieldType.class, str);
    }

    public static WireFormat$FieldType[] values() {
        return (WireFormat$FieldType[]) $VALUES.clone();
    }

    public Q getJavaType() {
        return this.javaType;
    }

    public int getWireType() {
        return this.wireType;
    }

    public boolean isPackable() {
        return true;
    }

    private WireFormat$FieldType(String str, int i11, Q q11, int i12) {
        this.javaType = q11;
        this.wireType = i12;
    }
}
