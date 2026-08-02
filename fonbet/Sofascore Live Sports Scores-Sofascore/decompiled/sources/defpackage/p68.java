package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class p68 {
    public static final kpg b;
    public static final p68 c;
    public static final /* synthetic */ p68[] d;
    public static final /* synthetic */ kp5 e;
    public final String a;

    static {
        p68 p68Var = new p68("HOME", 0, "H");
        p68 p68Var2 = new p68("AWAY", 1, "A");
        c = p68Var2;
        p68[] p68VarArr = {p68Var, p68Var2};
        d = p68VarArr;
        e = new kp5(p68VarArr);
        b = new kpg(23);
    }

    public p68(String str, int i, String str2) {
        this.a = str2;
    }

    public static p68 valueOf(String str) {
        return (p68) Enum.valueOf(p68.class, str);
    }

    public static p68[] values() {
        return (p68[]) d.clone();
    }
}
