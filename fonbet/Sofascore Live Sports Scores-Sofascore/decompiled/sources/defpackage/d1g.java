package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d1g {
    public static final d1g a;
    public static final d1g b;
    public static final /* synthetic */ d1g[] c;

    static {
        d1g d1gVar = new d1g("Ltr", 0);
        a = d1gVar;
        d1g d1gVar2 = new d1g("Rtl", 1);
        b = d1gVar2;
        c = new d1g[]{d1gVar, d1gVar2};
    }

    public static d1g valueOf(String str) {
        return (d1g) Enum.valueOf(d1g.class, str);
    }

    public static d1g[] values() {
        return (d1g[]) c.clone();
    }
}
