package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ndg {
    public static final ndg a;
    public static final ndg b;
    public static final /* synthetic */ ndg[] c;

    static {
        ndg ndgVar = new ndg("COLLAPSED", 0);
        a = ndgVar;
        ndg ndgVar2 = new ndg("EXPANDED", 1);
        b = ndgVar2;
        c = new ndg[]{ndgVar, ndgVar2};
    }

    public static ndg valueOf(String str) {
        return (ndg) Enum.valueOf(ndg.class, str);
    }

    public static ndg[] values() {
        return (ndg[]) c.clone();
    }
}
