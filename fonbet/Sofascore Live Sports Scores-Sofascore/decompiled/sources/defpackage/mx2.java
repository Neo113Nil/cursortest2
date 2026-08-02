package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mx2 {
    public static final mx2 a;
    public static final /* synthetic */ mx2[] b;

    /* JADX INFO: Fake field, exist only in values array */
    mx2 EF0;

    static {
        mx2 mx2Var = new mx2("UNKNOWN", 0);
        mx2 mx2Var2 = new mx2("ANDROID_FIREBASE", 1);
        a = mx2Var2;
        b = new mx2[]{mx2Var, mx2Var2};
    }

    public static mx2 valueOf(String str) {
        return (mx2) Enum.valueOf(mx2.class, str);
    }

    public static mx2[] values() {
        return (mx2[]) b.clone();
    }
}
