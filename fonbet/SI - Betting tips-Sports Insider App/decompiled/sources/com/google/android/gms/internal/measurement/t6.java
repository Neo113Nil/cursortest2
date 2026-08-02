package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t6 {

    /* renamed from: c, reason: collision with root package name */
    public static final t6 f5253c;

    /* renamed from: d, reason: collision with root package name */
    public static final t6 f5254d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ t6[] f5255e;

    /* renamed from: a, reason: collision with root package name */
    public final u6 f5256a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5257b;

    /* JADX INFO: Fake field, exist only in values array */
    t6 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    t6 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    t6 EF2;

    static {
        t6 t6Var = new t6("DOUBLE", 0, u6.f5271d, 1);
        t6 t6Var2 = new t6("FLOAT", 1, u6.f5270c, 5);
        u6 u6Var = u6.f5269b;
        t6 t6Var3 = new t6("INT64", 2, u6Var, 0);
        t6 t6Var4 = new t6("UINT64", 3, u6Var, 0);
        u6 u6Var2 = u6.f5268a;
        t6 t6Var5 = new t6("INT32", 4, u6Var2, 0);
        t6 t6Var6 = new t6("FIXED64", 5, u6Var, 1);
        t6 t6Var7 = new t6("FIXED32", 6, u6Var2, 5);
        t6 t6Var8 = new t6("BOOL", 7, u6.f5272e, 0);
        t6 t6Var9 = new t6("STRING", 8, u6.f5273f, 2);
        f5253c = t6Var9;
        u6 u6Var3 = u6.f5276i;
        t6 t6Var10 = new t6("GROUP", 9, u6Var3, 3);
        f5254d = t6Var10;
        f5255e = new t6[]{t6Var, t6Var2, t6Var3, t6Var4, t6Var5, t6Var6, t6Var7, t6Var8, t6Var9, t6Var10, new t6("MESSAGE", 10, u6Var3, 2), new t6("BYTES", 11, u6.f5274g, 2), new t6("UINT32", 12, u6Var2, 0), new t6("ENUM", 13, u6.f5275h, 0), new t6("SFIXED32", 14, u6Var2, 5), new t6("SFIXED64", 15, u6Var, 1), new t6("SINT32", 16, u6Var2, 0), new t6("SINT64", 17, u6Var, 0)};
    }

    public t6(String str, int i5, u6 u6Var, int i10) {
        this.f5256a = u6Var;
        this.f5257b = i10;
    }

    public static t6[] values() {
        return (t6[]) f5255e.clone();
    }
}
