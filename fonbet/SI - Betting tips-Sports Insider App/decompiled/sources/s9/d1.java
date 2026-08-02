package s9;

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
public class d1 {

    /* renamed from: b, reason: collision with root package name */
    public static final b1 f23291b;

    /* renamed from: c, reason: collision with root package name */
    public static final d1 f23292c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d1[] f23293d;

    /* renamed from: a, reason: collision with root package name */
    public final e1 f23294a;

    /* JADX INFO: Fake field, exist only in values array */
    d1 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    d1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    d1 EF2;

    static {
        d1 d1Var = new d1("DOUBLE", 0, e1.f23300d, 1);
        d1 d1Var2 = new d1("FLOAT", 1, e1.f23299c, 5);
        e1 e1Var = e1.f23298b;
        d1 d1Var3 = new d1("INT64", 2, e1Var, 0);
        d1 d1Var4 = new d1("UINT64", 3, e1Var, 0);
        e1 e1Var2 = e1.f23297a;
        d1 d1Var5 = new d1("INT32", 4, e1Var2, 0);
        d1 d1Var6 = new d1("FIXED64", 5, e1Var, 1);
        d1 d1Var7 = new d1("FIXED32", 6, e1Var2, 5);
        d1 d1Var8 = new d1("BOOL", 7, e1.f23301e, 0);
        z0 z0Var = new z0("STRING", 8, e1.f23302f, 2);
        e1 e1Var3 = e1.f23305i;
        a1 a1Var = new a1("GROUP", 9, e1Var3, 3);
        b1 b1Var = new b1("MESSAGE", 10, e1Var3, 2);
        f23291b = b1Var;
        c1 c1Var = new c1("BYTES", 11, e1.f23303g, 2);
        d1 d1Var9 = new d1("UINT32", 12, e1Var2, 0);
        f23292c = d1Var9;
        f23293d = new d1[]{d1Var, d1Var2, d1Var3, d1Var4, d1Var5, d1Var6, d1Var7, d1Var8, z0Var, a1Var, b1Var, c1Var, d1Var9, new d1("ENUM", 13, e1.f23304h, 0), new d1("SFIXED32", 14, e1Var2, 5), new d1("SFIXED64", 15, e1Var, 1), new d1("SINT32", 16, e1Var2, 0), new d1("SINT64", 17, e1Var, 0)};
    }

    public d1(String str, int i5, e1 e1Var, int i10) {
        this.f23294a = e1Var;
    }

    public static d1 valueOf(String str) {
        return (d1) Enum.valueOf(d1.class, str);
    }

    public static d1[] values() {
        return (d1[]) f23293d.clone();
    }
}
