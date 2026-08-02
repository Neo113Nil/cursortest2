package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a1a {
    public static final a1a a;
    public static final a1a b;
    public static final a1a c;
    public static final a1a d;
    public static final /* synthetic */ a1a[] e;

    static {
        a1a a1aVar = new a1a("Untransformed", 0);
        a = a1aVar;
        a1a a1aVar2 = new a1a("Insertion", 1);
        b = a1aVar2;
        a1a a1aVar3 = new a1a("Replacement", 2);
        c = a1aVar3;
        a1a a1aVar4 = new a1a("Deletion", 3);
        d = a1aVar4;
        e = new a1a[]{a1aVar, a1aVar2, a1aVar3, a1aVar4};
    }

    public static a1a valueOf(String str) {
        return (a1a) Enum.valueOf(a1a.class, str);
    }

    public static a1a[] values() {
        return (a1a[]) e.clone();
    }
}
