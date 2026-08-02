package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k4a {
    public static final k4a a;
    public static final k4a b;
    public static final k4a c;
    public static final /* synthetic */ k4a[] d;

    static {
        k4a k4aVar = new k4a("Focused", 0);
        a = k4aVar;
        k4a k4aVar2 = new k4a("UnfocusedEmpty", 1);
        b = k4aVar2;
        k4a k4aVar3 = new k4a("UnfocusedNotEmpty", 2);
        c = k4aVar3;
        d = new k4a[]{k4aVar, k4aVar2, k4aVar3};
    }

    public static k4a valueOf(String str) {
        return (k4a) Enum.valueOf(k4a.class, str);
    }

    public static k4a[] values() {
        return (k4a[]) d.clone();
    }
}
