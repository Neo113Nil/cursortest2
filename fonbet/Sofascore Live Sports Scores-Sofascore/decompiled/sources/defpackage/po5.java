package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class po5 {
    public static final po5 a;
    public static final po5 b;
    public static final po5 c;
    public static final /* synthetic */ po5[] d;

    static {
        po5 po5Var = new po5("PreEnter", 0);
        a = po5Var;
        po5 po5Var2 = new po5("Visible", 1);
        b = po5Var2;
        po5 po5Var3 = new po5("PostExit", 2);
        c = po5Var3;
        d = new po5[]{po5Var, po5Var2, po5Var3};
    }

    public static po5 valueOf(String str) {
        return (po5) Enum.valueOf(po5.class, str);
    }

    public static po5[] values() {
        return (po5[]) d.clone();
    }
}
