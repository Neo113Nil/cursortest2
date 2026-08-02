package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jfg {
    public static final jfg a;
    public static final jfg b;
    public static final jfg c;
    public static final /* synthetic */ jfg[] d;

    static {
        jfg jfgVar = new jfg("COLLAPSED", 0);
        a = jfgVar;
        jfg jfgVar2 = new jfg("EXPANDED", 1);
        b = jfgVar2;
        jfg jfgVar3 = new jfg("TRANSITIONING", 2);
        c = jfgVar3;
        d = new jfg[]{jfgVar, jfgVar2, jfgVar3};
    }

    public static jfg valueOf(String str) {
        return (jfg) Enum.valueOf(jfg.class, str);
    }

    public static jfg[] values() {
        return (jfg[]) d.clone();
    }
}
