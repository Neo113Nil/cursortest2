package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cgf {
    public static final bgf a;
    public static final cgf b;
    public static final cgf c;
    public static final cgf d;
    public static final /* synthetic */ cgf[] e;

    static {
        cgf cgfVar = new cgf("Shown", 0);
        b = cgfVar;
        cgf cgfVar2 = new cgf("NotShown", 1);
        c = cgfVar2;
        cgf cgfVar3 = new cgf("Placeholder", 2);
        d = cgfVar3;
        e = new cgf[]{cgfVar, cgfVar2, cgfVar3};
        a = new bgf(0);
    }

    public static cgf valueOf(String str) {
        return (cgf) Enum.valueOf(cgf.class, str);
    }

    public static cgf[] values() {
        return (cgf[]) e.clone();
    }
}
