package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class r2a {
    public static final r2a a;
    public static final r2a b;
    public static final r2a c;
    public static final /* synthetic */ r2a[] d;

    static {
        r2a r2aVar = new r2a("START", 0);
        a = r2aVar;
        r2a r2aVar2 = new r2a("CENTER", 1);
        b = r2aVar2;
        r2a r2aVar3 = new r2a("END", 2);
        c = r2aVar3;
        d = new r2a[]{r2aVar, r2aVar2, r2aVar3};
    }

    public static r2a valueOf(String str) {
        return (r2a) Enum.valueOf(r2a.class, str);
    }

    public static r2a[] values() {
        return (r2a[]) d.clone();
    }
}
