package com.logrocket.protobuf;

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
public class f2 {

    /* renamed from: c, reason: collision with root package name */
    public static final b2 f6696c;

    /* renamed from: d, reason: collision with root package name */
    public static final c2 f6697d;

    /* renamed from: e, reason: collision with root package name */
    public static final d2 f6698e;

    /* renamed from: f, reason: collision with root package name */
    public static final f2 f6699f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ f2[] f6700g;

    /* renamed from: a, reason: collision with root package name */
    public final g2 f6701a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6702b;

    /* JADX INFO: Fake field, exist only in values array */
    f2 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    f2 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    f2 EF2;

    static {
        f2 f2Var = new f2("DOUBLE", 0, g2.f6718d, 1);
        f2 f2Var2 = new f2("FLOAT", 1, g2.f6717c, 5);
        g2 g2Var = g2.f6716b;
        f2 f2Var3 = new f2("INT64", 2, g2Var, 0);
        f2 f2Var4 = new f2("UINT64", 3, g2Var, 0);
        g2 g2Var2 = g2.f6715a;
        f2 f2Var5 = new f2("INT32", 4, g2Var2, 0);
        f2 f2Var6 = new f2("FIXED64", 5, g2Var, 1);
        f2 f2Var7 = new f2("FIXED32", 6, g2Var2, 5);
        f2 f2Var8 = new f2("BOOL", 7, g2.f6719e, 0);
        b2 b2Var = new b2("STRING", 8, g2.f6720f, 2);
        f6696c = b2Var;
        g2 g2Var3 = g2.f6723i;
        c2 c2Var = new c2("GROUP", 9, g2Var3, 3);
        f6697d = c2Var;
        d2 d2Var = new d2("MESSAGE", 10, g2Var3, 2);
        f6698e = d2Var;
        e2 e2Var = new e2("BYTES", 11, g2.f6721g, 2);
        f2 f2Var9 = new f2("UINT32", 12, g2Var2, 0);
        f6699f = f2Var9;
        f6700g = new f2[]{f2Var, f2Var2, f2Var3, f2Var4, f2Var5, f2Var6, f2Var7, f2Var8, b2Var, c2Var, d2Var, e2Var, f2Var9, new f2("ENUM", 13, g2.f6722h, 0), new f2("SFIXED32", 14, g2Var2, 5), new f2("SFIXED64", 15, g2Var, 1), new f2("SINT32", 16, g2Var2, 0), new f2("SINT64", 17, g2Var, 0)};
    }

    public f2(String str, int i5, g2 g2Var, int i10) {
        this.f6701a = g2Var;
        this.f6702b = i10;
    }

    public static f2 valueOf(String str) {
        return (f2) Enum.valueOf(f2.class, str);
    }

    public static f2[] values() {
        return (f2[]) f6700g.clone();
    }
}
