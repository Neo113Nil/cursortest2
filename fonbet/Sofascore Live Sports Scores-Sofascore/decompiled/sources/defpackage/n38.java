package defpackage;

import androidx.annotation.NonNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class n38 {
    public static final n38 a;
    public static final n38 b;
    public static final n38 c;
    public static final n38 d;
    public static final /* synthetic */ n38[] e;

    static {
        n38 n38Var = new n38("AD_STORAGE", 0);
        a = n38Var;
        n38 n38Var2 = new n38("ANALYTICS_STORAGE", 1);
        b = n38Var2;
        n38 n38Var3 = new n38("AD_USER_DATA", 2);
        c = n38Var3;
        n38 n38Var4 = new n38("AD_PERSONALIZATION", 3);
        d = n38Var4;
        e = new n38[]{n38Var, n38Var2, n38Var3, n38Var4};
    }

    @NonNull
    public static n38 valueOf(@NonNull String str) {
        return (n38) Enum.valueOf(n38.class, str);
    }

    @NonNull
    public static n38[] values() {
        return (n38[]) e.clone();
    }
}
