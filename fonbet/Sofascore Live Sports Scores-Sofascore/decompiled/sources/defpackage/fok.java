package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fok {
    public static final fok a;
    public static final fok b;
    public static final /* synthetic */ fok[] c;

    static {
        fok fokVar = new fok("STRICT", 0);
        a = fokVar;
        fok fokVar2 = new fok("LOG", 1);
        fok fokVar3 = new fok("QUIET", 2);
        b = fokVar3;
        c = new fok[]{fokVar, fokVar2, fokVar3};
    }

    public static fok valueOf(String str) {
        return (fok) Enum.valueOf(fok.class, str);
    }

    public static fok[] values() {
        return (fok[]) c.clone();
    }
}
