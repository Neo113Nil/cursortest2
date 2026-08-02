package com.google.crypto.tink.shaded.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class B {
    private static final /* synthetic */ B[] $VALUES;

    /* renamed from: d, reason: collision with root package name */
    public static final B f37221d;

    /* renamed from: e, reason: collision with root package name */
    public static final B f37222e;

    /* renamed from: f, reason: collision with root package name */
    public static final B f37223f;

    /* renamed from: g, reason: collision with root package name */
    public static final B f37224g;

    /* renamed from: h, reason: collision with root package name */
    public static final B f37225h;

    /* renamed from: i, reason: collision with root package name */
    public static final B f37226i;

    /* renamed from: j, reason: collision with root package name */
    public static final B f37227j;

    /* renamed from: k, reason: collision with root package name */
    public static final B f37228k;

    /* renamed from: l, reason: collision with root package name */
    public static final B f37229l;

    /* renamed from: m, reason: collision with root package name */
    public static final B f37230m;

    /* renamed from: a, reason: collision with root package name */
    public final Class f37231a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f37232b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f37233c;

    static {
        B b10 = new B("VOID", 0, Void.class, Void.class, null);
        f37221d = b10;
        Class cls = Integer.TYPE;
        B b11 = new B("INT", 1, cls, Integer.class, 0);
        f37222e = b11;
        B b12 = new B("LONG", 2, Long.TYPE, Long.class, 0L);
        f37223f = b12;
        B b13 = new B("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f37224g = b13;
        B b14 = new B("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f37225h = b14;
        B b15 = new B("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f37226i = b15;
        B b16 = new B("STRING", 6, String.class, String.class, "");
        f37227j = b16;
        B b17 = new B("BYTE_STRING", 7, AbstractC3476h.class, AbstractC3476h.class, AbstractC3476h.f37290b);
        f37228k = b17;
        B b18 = new B("ENUM", 8, cls, Integer.class, null);
        f37229l = b18;
        B b19 = new B("MESSAGE", 9, Object.class, Object.class, null);
        f37230m = b19;
        $VALUES = new B[]{b10, b11, b12, b13, b14, b15, b16, b17, b18, b19};
    }

    public B(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f37231a = cls;
        this.f37232b = cls2;
        this.f37233c = obj;
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) $VALUES.clone();
    }

    public Class a() {
        return this.f37232b;
    }
}
