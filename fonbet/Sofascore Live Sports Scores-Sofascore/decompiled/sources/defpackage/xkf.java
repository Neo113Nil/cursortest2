package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xkf {
    public static final wkf a;
    public static final xkf b;
    public static final xkf c;
    public static final xkf d;
    public static final /* synthetic */ xkf[] e;

    static {
        xkf xkfVar = new xkf("FORMULA_1", 0);
        b = xkfVar;
        xkf xkfVar2 = new xkf("MOTO_GP", 1);
        c = xkfVar2;
        xkf xkfVar3 = new xkf("WRC", 2);
        d = xkfVar3;
        e = new xkf[]{xkfVar, xkfVar2, xkfVar3};
        a = new wkf(0);
    }

    public static xkf valueOf(String str) {
        return (xkf) Enum.valueOf(xkf.class, str);
    }

    public static xkf[] values() {
        return (xkf[]) e.clone();
    }
}
