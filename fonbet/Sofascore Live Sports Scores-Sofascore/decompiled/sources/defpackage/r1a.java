package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r1a {
    public static final r1a a;
    public static final r1a b;
    public static final r1a c;
    public static final /* synthetic */ r1a[] d;

    static {
        r1a r1aVar = new r1a("Yes", 0);
        a = r1aVar;
        r1a r1aVar2 = new r1a("No", 1);
        b = r1aVar2;
        r1a r1aVar3 = new r1a("NotInitialized", 2);
        c = r1aVar3;
        d = new r1a[]{r1aVar, r1aVar2, r1aVar3};
    }

    public static r1a valueOf(String str) {
        return (r1a) Enum.valueOf(r1a.class, str);
    }

    public static r1a[] values() {
        return (r1a[]) d.clone();
    }
}
