package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class lbg {
    public static final lbg a;
    public static final lbg b;
    public static final lbg c;
    public static final /* synthetic */ lbg[] d;

    static {
        lbg lbgVar = new lbg("NEVER", 0);
        a = lbgVar;
        lbg lbgVar2 = new lbg("COLLAPSED_ONLY", 1);
        b = lbgVar2;
        lbg lbgVar3 = new lbg("ALWAYS", 2);
        c = lbgVar3;
        d = new lbg[]{lbgVar, lbgVar2, lbgVar3};
    }

    public static lbg valueOf(String str) {
        return (lbg) Enum.valueOf(lbg.class, str);
    }

    public static lbg[] values() {
        return (lbg[]) d.clone();
    }
}
