package com.google.protobuf;

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
/* renamed from: com.google.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5966q {
    private static final /* synthetic */ EnumC5966q[] $VALUES;
    public static final EnumC5966q BOOLEAN;
    public static final EnumC5966q BYTE_STRING;
    public static final EnumC5966q DOUBLE;
    public static final EnumC5966q ENUM;
    public static final EnumC5966q FLOAT;
    public static final EnumC5966q INT;
    public static final EnumC5966q LONG;
    public static final EnumC5966q MESSAGE;
    public static final EnumC5966q STRING;
    public static final EnumC5966q VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        EnumC5966q enumC5966q = new EnumC5966q("VOID", 0, Void.class, Void.class, null);
        VOID = enumC5966q;
        Class cls = Integer.TYPE;
        EnumC5966q enumC5966q2 = new EnumC5966q("INT", 1, cls, Integer.class, 0);
        INT = enumC5966q2;
        EnumC5966q enumC5966q3 = new EnumC5966q("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = enumC5966q3;
        EnumC5966q enumC5966q4 = new EnumC5966q("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = enumC5966q4;
        EnumC5966q enumC5966q5 = new EnumC5966q("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = enumC5966q5;
        EnumC5966q enumC5966q6 = new EnumC5966q("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = enumC5966q6;
        EnumC5966q enumC5966q7 = new EnumC5966q("STRING", 6, String.class, String.class, "");
        STRING = enumC5966q7;
        EnumC5966q enumC5966q8 = new EnumC5966q("BYTE_STRING", 7, ByteString.class, ByteString.class, ByteString.EMPTY);
        BYTE_STRING = enumC5966q8;
        EnumC5966q enumC5966q9 = new EnumC5966q("ENUM", 8, cls, Integer.class, null);
        ENUM = enumC5966q9;
        EnumC5966q enumC5966q10 = new EnumC5966q("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = enumC5966q10;
        $VALUES = new EnumC5966q[]{enumC5966q, enumC5966q2, enumC5966q3, enumC5966q4, enumC5966q5, enumC5966q6, enumC5966q7, enumC5966q8, enumC5966q9, enumC5966q10};
    }

    private EnumC5966q(String str, int i11, Class cls, Class cls2, Serializable serializable) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = serializable;
    }

    public static EnumC5966q valueOf(String str) {
        return (EnumC5966q) java.lang.Enum.valueOf(EnumC5966q.class, str);
    }

    public static EnumC5966q[] values() {
        return (EnumC5966q[]) $VALUES.clone();
    }

    public final Class<?> a() {
        return this.boxedType;
    }
}
