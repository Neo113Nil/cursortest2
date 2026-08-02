package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class n1d {
    public static final n1d a;
    public static final /* synthetic */ n1d[] b;

    static {
        n1d n1dVar = new n1d("Default", 0);
        a = n1dVar;
        b = new n1d[]{n1dVar, new n1d("UserInput", 1), new n1d("PreventUserInput", 2)};
    }

    public static n1d valueOf(String str) {
        return (n1d) Enum.valueOf(n1d.class, str);
    }

    public static n1d[] values() {
        return (n1d[]) b.clone();
    }
}
