package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vlf {
    public static final vlf a;
    public static final vlf b;
    public static final vlf c;
    public static final vlf d;
    public static final vlf e;
    public static final vlf f;
    public static final vlf g;
    public static final vlf h;
    public static final vlf i;
    public static final /* synthetic */ vlf[] j;

    static {
        vlf vlfVar = new vlf("TENNIS_RANKING_ITEM", 0);
        a = vlfVar;
        vlf vlfVar2 = new vlf("TENNIS_RANKING_LIVE_ITEM", 1);
        b = vlfVar2;
        vlf vlfVar3 = new vlf("FIFA_RANKING_ITEM", 2);
        c = vlfVar3;
        vlf vlfVar4 = new vlf("UEFA_COUNTRIES_RANKING_ITEM", 3);
        d = vlfVar4;
        vlf vlfVar5 = new vlf("UEFA_CLUBS_RANKING_ITEM", 4);
        e = vlfVar5;
        vlf vlfVar6 = new vlf("RUGBY_RANKING_ITEM", 5);
        f = vlfVar6;
        vlf vlfVar7 = new vlf("UTR_RANKING_ITEM", 6);
        g = vlfVar7;
        vlf vlfVar8 = new vlf("UPDATED_AT_SECTION", 7);
        h = vlfVar8;
        vlf vlfVar9 = new vlf("HEADER_SECTION", 8);
        i = vlfVar9;
        j = new vlf[]{vlfVar, vlfVar2, vlfVar3, vlfVar4, vlfVar5, vlfVar6, vlfVar7, vlfVar8, vlfVar9};
    }

    public static vlf valueOf(String str) {
        return (vlf) Enum.valueOf(vlf.class, str);
    }

    public static vlf[] values() {
        return (vlf[]) j.clone();
    }
}
