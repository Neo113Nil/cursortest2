package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class y84 {
    public static final y84 a;
    public static final y84 b;
    public static final y84 c;
    public static final /* synthetic */ y84[] d;

    static {
        y84 y84Var = new y84("None", 0);
        a = y84Var;
        y84 y84Var2 = new y84("Cancelled", 1);
        b = y84Var2;
        y84 y84Var3 = new y84("Redirected", 2);
        c = y84Var3;
        d = new y84[]{y84Var, y84Var2, y84Var3, new y84("RedirectCancelled", 3)};
    }

    public static y84 valueOf(String str) {
        return (y84) Enum.valueOf(y84.class, str);
    }

    public static y84[] values() {
        return (y84[]) d.clone();
    }
}
