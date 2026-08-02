package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class e6b {
    public static final e6b a;
    public static final e6b b;
    public static final e6b c;
    public static final e6b d;
    public static final e6b e;
    public static final /* synthetic */ e6b[] f;

    static {
        e6b e6bVar = new e6b("DESTROYED", 0);
        a = e6bVar;
        e6b e6bVar2 = new e6b("INITIALIZED", 1);
        b = e6bVar2;
        e6b e6bVar3 = new e6b("CREATED", 2);
        c = e6bVar3;
        e6b e6bVar4 = new e6b("STARTED", 3);
        d = e6bVar4;
        e6b e6bVar5 = new e6b("RESUMED", 4);
        e = e6bVar5;
        f = new e6b[]{e6bVar, e6bVar2, e6bVar3, e6bVar4, e6bVar5};
    }

    public static e6b valueOf(String str) {
        return (e6b) Enum.valueOf(e6b.class, str);
    }

    public static e6b[] values() {
        return (e6b[]) f.clone();
    }

    public final boolean a(e6b e6bVar) {
        return compareTo(e6bVar) >= 0;
    }
}
