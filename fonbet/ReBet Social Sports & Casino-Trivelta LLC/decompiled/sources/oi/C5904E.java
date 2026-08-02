package oi;

/* renamed from: oi.E, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5904E extends r {
    private static final long serialVersionUID = -5638437652574160520L;

    public C5904E(x xVar, p pVar) {
        super(b(xVar, pVar));
    }

    public static String a(x xVar, Object obj) {
        return "Cannot find any rule for chronological unit \"" + c(obj) + "\" in: " + xVar.r().getName();
    }

    public static String b(x xVar, p pVar) {
        return "Cannot find any rule for chronological element \"" + pVar.name() + "\" in: " + xVar.r().getName();
    }

    public static String c(Object obj) {
        return obj instanceof Enum ? ((Enum) Enum.class.cast(obj)).name() : obj.toString();
    }

    public C5904E(String str) {
        super(str);
    }

    public C5904E(x xVar, Object obj) {
        super(a(xVar, obj));
    }
}
