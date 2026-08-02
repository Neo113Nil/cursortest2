package com.google.crypto.tink.shaded.protobuf;

import java.io.Serializable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class B {
    private static final /* synthetic */ B[] $VALUES;
    public static final B BOOLEAN;
    public static final B BYTE_STRING;
    public static final B DOUBLE;
    public static final B ENUM;
    public static final B FLOAT;
    public static final B INT;
    public static final B LONG;
    public static final B MESSAGE;
    public static final B STRING;
    public static final B VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        B b11 = new B("VOID", 0, Void.class, Void.class, null);
        VOID = b11;
        Class cls = Integer.TYPE;
        B b12 = new B("INT", 1, cls, Integer.class, 0);
        INT = b12;
        B b13 = new B("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = b13;
        B b14 = new B("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = b14;
        B b15 = new B("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = b15;
        B b16 = new B("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = b16;
        B b17 = new B("STRING", 6, String.class, String.class, "");
        STRING = b17;
        B b18 = new B("BYTE_STRING", 7, AbstractC5903i.class, AbstractC5903i.class, AbstractC5903i.f59377b);
        BYTE_STRING = b18;
        B b19 = new B("ENUM", 8, cls, Integer.class, null);
        ENUM = b19;
        B b21 = new B("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = b21;
        $VALUES = new B[]{b11, b12, b13, b14, b15, b16, b17, b18, b19, b21};
    }

    private B(String str, int i11, Class cls, Class cls2, Serializable serializable) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = serializable;
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) $VALUES.clone();
    }

    public final Class<?> a() {
        return this.boxedType;
    }
}
