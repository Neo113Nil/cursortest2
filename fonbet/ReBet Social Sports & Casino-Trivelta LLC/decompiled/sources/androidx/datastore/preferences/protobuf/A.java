package androidx.datastore.preferences.protobuf;

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
/* loaded from: classes.dex */
public final class A {
    private static final /* synthetic */ A[] $VALUES;

    /* renamed from: d, reason: collision with root package name */
    public static final A f19407d;

    /* renamed from: e, reason: collision with root package name */
    public static final A f19408e;

    /* renamed from: f, reason: collision with root package name */
    public static final A f19409f;

    /* renamed from: g, reason: collision with root package name */
    public static final A f19410g;

    /* renamed from: h, reason: collision with root package name */
    public static final A f19411h;

    /* renamed from: i, reason: collision with root package name */
    public static final A f19412i;

    /* renamed from: j, reason: collision with root package name */
    public static final A f19413j;

    /* renamed from: k, reason: collision with root package name */
    public static final A f19414k;

    /* renamed from: l, reason: collision with root package name */
    public static final A f19415l;

    /* renamed from: m, reason: collision with root package name */
    public static final A f19416m;

    /* renamed from: a, reason: collision with root package name */
    public final Class f19417a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f19418b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f19419c;

    static {
        A a10 = new A("VOID", 0, Void.class, Void.class, null);
        f19407d = a10;
        Class cls = Integer.TYPE;
        A a11 = new A("INT", 1, cls, Integer.class, 0);
        f19408e = a11;
        A a12 = new A("LONG", 2, Long.TYPE, Long.class, 0L);
        f19409f = a12;
        A a13 = new A("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f19410g = a13;
        A a14 = new A("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f19411h = a14;
        A a15 = new A("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f19412i = a15;
        A a16 = new A("STRING", 6, String.class, String.class, "");
        f19413j = a16;
        A a17 = new A("BYTE_STRING", 7, AbstractC2132g.class, AbstractC2132g.class, AbstractC2132g.f19474b);
        f19414k = a17;
        A a18 = new A("ENUM", 8, cls, Integer.class, null);
        f19415l = a18;
        A a19 = new A("MESSAGE", 9, Object.class, Object.class, null);
        f19416m = a19;
        $VALUES = new A[]{a10, a11, a12, a13, a14, a15, a16, a17, a18, a19};
    }

    public A(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f19417a = cls;
        this.f19418b = cls2;
        this.f19419c = obj;
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) $VALUES.clone();
    }

    public Class a() {
        return this.f19418b;
    }
}
