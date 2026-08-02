package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vl {
    public static final ccd b;
    public static final vl c;
    public static final vl d;
    public static final vl e;
    public static final /* synthetic */ vl[] f;
    public static final /* synthetic */ kp5 g;
    public final String a;

    static {
        vl vlVar = new vl("OVER_25_YEARS", 0, "25_or_older");
        c = vlVar;
        vl vlVar2 = new vl("FROM_18_TO_24", 1, "18_to_24");
        d = vlVar2;
        vl vlVar3 = new vl("UNDER_18_YEARS", 2, "under_18");
        e = vlVar3;
        vl[] vlVarArr = {vlVar, vlVar2, vlVar3};
        f = vlVarArr;
        g = new kp5(vlVarArr);
        b = new ccd();
    }

    public vl(String str, int i, String str2) {
        this.a = str2;
    }

    public static vl valueOf(String str) {
        return (vl) Enum.valueOf(vl.class, str);
    }

    public static vl[] values() {
        return (vl[]) f.clone();
    }
}
