package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class s2a {
    public static final s2a a;
    public static final s2a b;
    public static final /* synthetic */ s2a[] c;

    static {
        s2a s2aVar = new s2a("BOTTOM", 0);
        a = s2aVar;
        s2a s2aVar2 = new s2a("TOP", 1);
        b = s2aVar2;
        c = new s2a[]{s2aVar, s2aVar2};
    }

    public static s2a valueOf(String str) {
        return (s2a) Enum.valueOf(s2a.class, str);
    }

    public static s2a[] values() {
        return (s2a[]) c.clone();
    }
}
