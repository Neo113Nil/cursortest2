package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vfg {
    public static final vfg a;
    public static final vfg b;
    public static final /* synthetic */ vfg[] c;

    static {
        vfg vfgVar = new vfg("FIXED", 0);
        a = vfgVar;
        vfg vfgVar2 = new vfg("DYNAMIC", 1);
        b = vfgVar2;
        c = new vfg[]{vfgVar, vfgVar2};
    }

    public static vfg valueOf(String str) {
        return (vfg) Enum.valueOf(vfg.class, str);
    }

    public static vfg[] values() {
        return (vfg[]) c.clone();
    }
}
