package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hd5 {
    public static final hd5 a;
    public static final /* synthetic */ hd5[] b;

    /* JADX INFO: Fake field, exist only in values array */
    hd5 EF0;

    static {
        hd5 hd5Var = new hd5("MatchAnchor", 0);
        hd5 hd5Var2 = new hd5("FillScreenWidth", 1);
        hd5 hd5Var3 = new hd5("FitWidestItem", 2);
        a = hd5Var3;
        b = new hd5[]{hd5Var, hd5Var2, hd5Var3};
    }

    public static hd5 valueOf(String str) {
        return (hd5) Enum.valueOf(hd5.class, str);
    }

    public static hd5[] values() {
        return (hd5[]) b.clone();
    }
}
