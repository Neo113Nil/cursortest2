package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class n9a {
    public static final n9a a;
    public static final n9a b;
    public static final /* synthetic */ n9a[] c;

    static {
        n9a n9aVar = new n9a("Min", 0);
        a = n9aVar;
        n9a n9aVar2 = new n9a("Max", 1);
        b = n9aVar2;
        c = new n9a[]{n9aVar, n9aVar2};
    }

    public static n9a valueOf(String str) {
        return (n9a) Enum.valueOf(n9a.class, str);
    }

    public static n9a[] values() {
        return (n9a[]) c.clone();
    }
}
