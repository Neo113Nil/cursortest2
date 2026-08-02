package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cwk {
    public static final cwk a;
    public static final /* synthetic */ cwk[] b;

    static {
        cwk cwkVar = new cwk("Visible", 0);
        a = cwkVar;
        b = new cwk[]{cwkVar, new cwk("Invisible", 1), new cwk("Gone", 2)};
    }

    public static cwk valueOf(String str) {
        return (cwk) Enum.valueOf(cwk.class, str);
    }

    public static cwk[] values() {
        return (cwk[]) b.clone();
    }
}
