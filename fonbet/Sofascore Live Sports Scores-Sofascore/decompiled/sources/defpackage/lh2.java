package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lh2 {
    public static final lh2 a;
    public static final lh2 b;
    public static final lh2 c;
    public static final /* synthetic */ lh2[] d;

    static {
        lh2 lh2Var = new lh2("HEAD_TO_HEAD", 0);
        a = lh2Var;
        lh2 lh2Var2 = new lh2("FIRST_TEAM", 1);
        b = lh2Var2;
        lh2 lh2Var3 = new lh2("SECOND_TEAM", 2);
        c = lh2Var3;
        d = new lh2[]{lh2Var, lh2Var2, lh2Var3};
    }

    public static lh2 valueOf(String str) {
        return (lh2) Enum.valueOf(lh2.class, str);
    }

    public static lh2[] values() {
        return (lh2[]) d.clone();
    }
}
