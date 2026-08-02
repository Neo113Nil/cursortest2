package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j85 {
    public static final j85 a;
    public static final j85 b;
    public static final j85 c;
    public static final /* synthetic */ j85[] d;

    static {
        j85 j85Var = new j85("Yes", 0);
        a = j85Var;
        j85 j85Var2 = new j85("No", 1);
        b = j85Var2;
        j85 j85Var3 = new j85("NotInitialized", 2);
        c = j85Var3;
        d = new j85[]{j85Var, j85Var2, j85Var3};
    }

    public static j85 valueOf(String str) {
        return (j85) Enum.valueOf(j85.class, str);
    }

    public static j85[] values() {
        return (j85[]) d.clone();
    }
}
