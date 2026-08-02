package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xk {
    public static final xk b;
    public static final xk c;
    public static final xk d;
    public static final /* synthetic */ xk[] e;
    public static final /* synthetic */ kp5 f;
    public final String a;

    static {
        xk xkVar = new xk("GAM", 0, "GAM");
        b = xkVar;
        xk xkVar2 = new xk("GAM_AND_NIMBUS", 1, "GAM + Nimbus");
        c = xkVar2;
        xk xkVar3 = new xk("EQUATIV", 2, "Equativ");
        d = xkVar3;
        xk[] xkVarArr = {xkVar, xkVar2, xkVar3};
        e = xkVarArr;
        f = new kp5(xkVarArr);
    }

    public xk(String str, int i, String str2) {
        this.a = str2;
    }

    public static xk valueOf(String str) {
        return (xk) Enum.valueOf(xk.class, str);
    }

    public static xk[] values() {
        return (xk[]) e.clone();
    }
}
