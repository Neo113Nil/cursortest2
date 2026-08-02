package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class amf {
    public static final amf d;
    public static final amf e;
    public static final amf f;
    public static final amf g;
    public static final amf h;
    public static final amf i;
    public static final amf j;
    public static final amf k;
    public static final amf l;
    public static final amf m;
    public static final /* synthetic */ amf[] n;
    public static final /* synthetic */ kp5 o;
    public final int a;
    public final vlf b;
    public final int c;

    static {
        amf amfVar = new amf("UEFA_COUNTRIES", 0, 1, vlf.d, R.string.countries);
        d = amfVar;
        amf amfVar2 = new amf("FIFA", 1, 2, vlf.c, R.string.countries);
        e = amfVar2;
        amf amfVar3 = new amf("RUGBY", 2, 3, vlf.f, R.string.rugby_union_ranking);
        f = amfVar3;
        vlf vlfVar = vlf.a;
        amf amfVar4 = new amf("TENNIS_ATP_SINGLES", 3, 5, vlfVar, R.string.official);
        g = amfVar4;
        amf amfVar5 = new amf("TENNIS_WTA_SINGLES", 4, 6, vlfVar, R.string.official);
        h = amfVar5;
        vlf vlfVar2 = vlf.b;
        amf amfVar6 = new amf("TENNIS_ATP_SINGLES_LIVE", 5, 7, vlfVar2, R.string.standings_live);
        i = amfVar6;
        amf amfVar7 = new amf("TENNIS_WTA_SINGLES_LIVE", 6, 8, vlfVar2, R.string.standings_live);
        j = amfVar7;
        amf amfVar8 = new amf("UEFA_CLUBS", 7, 9, vlf.e, R.string.clubs);
        k = amfVar8;
        vlf vlfVar3 = vlf.g;
        amf amfVar9 = new amf("UTR_MEN", 8, 34, vlfVar3, R.string.utr_mens_rankings);
        l = amfVar9;
        amf amfVar10 = new amf("UTR_WOMEN", 9, 35, vlfVar3, R.string.utr_womens_rankings);
        m = amfVar10;
        amf[] amfVarArr = {amfVar, amfVar2, amfVar3, amfVar4, amfVar5, amfVar6, amfVar7, amfVar8, amfVar9, amfVar10};
        n = amfVarArr;
        o = new kp5(amfVarArr);
    }

    public amf(String str, int i2, int i3, vlf vlfVar, int i4) {
        this.a = i3;
        this.b = vlfVar;
        this.c = i4;
    }

    public static amf valueOf(String str) {
        return (amf) Enum.valueOf(amf.class, str);
    }

    public static amf[] values() {
        return (amf[]) n.clone();
    }
}
