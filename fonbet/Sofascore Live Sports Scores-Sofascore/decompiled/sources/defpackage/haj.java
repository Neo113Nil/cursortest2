package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class haj {
    public static final haj a;
    public static final haj b;
    public static final /* synthetic */ haj[] c;

    static {
        haj hajVar = new haj("MergeIfPossible", 0);
        a = hajVar;
        haj hajVar2 = new haj("ClearHistory", 1);
        haj hajVar3 = new haj("NeverMerge", 2);
        b = hajVar3;
        c = new haj[]{hajVar, hajVar2, hajVar3};
    }

    public static haj valueOf(String str) {
        return (haj) Enum.valueOf(haj.class, str);
    }

    public static haj[] values() {
        return (haj[]) c.clone();
    }
}
