package defpackage;

import com.sofascore.results.R;
import com.vungle.ads.internal.protos.Sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mei {
    public static final mei h;
    public static final mei i;
    public static final mei j;
    public static final mei k;
    public static final mei l;
    public static final mei m;
    public static final mei n;
    public static final mei o;
    public static final mei p;
    public static final /* synthetic */ mei[] q;
    public static final /* synthetic */ kp5 r;
    public final String a;
    public final int b;
    public final Integer c;
    public final Integer d;
    public final int e;
    public final boolean f;
    public final boolean g;

    static {
        mei meiVar = new mei(0, R.string.form_short, 0, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null, "FORM", "form");
        h = meiVar;
        mei meiVar2 = new mei(1, R.string.football_points_short, 0, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null, "TOTAL_SCORE", "totalScore");
        mei meiVar3 = new mei(2, R.string.player_price_short, 0, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null, "PRICE", "price");
        i = meiVar3;
        mei meiVar4 = new mei(3, R.string.player_price_short, 64, 72, Integer.valueOf(R.drawable.ic_graph_difference), "PRICE_GRAPH", "priceChange");
        j = meiVar4;
        mei meiVar5 = new mei(4, R.string.fantasy_fixture_difficulty_rating_short, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 96, Integer.valueOf(R.drawable.ic_info), "FDR", "fdr");
        k = meiVar5;
        mei meiVar6 = new mei(5, R.string.fantasy_points_per_round_short, 0, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null, "AVERAGE_SCORE", "averageScore");
        mei meiVar7 = new mei(6, R.string.selected_percentage_short, 0, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null, "OWNED_PERCENTAGE", "ownedPercentage");
        l = meiVar7;
        mei meiVar8 = new mei(7, R.string.fantasy_expected_fantasy_points_short, 0, 60, null, "EXPECTED_POINTS", "expectedPoints");
        m = meiVar8;
        mei meiVar9 = new mei(8, R.string.fantasy_fixture, 80, 12, null, "FIXTURE", "fixture");
        n = meiVar9;
        mei meiVar10 = new mei(9, R.string.fantasy_competition, 112, 12, null, "COMPETITION", "competition");
        o = meiVar10;
        mei meiVar11 = new mei(10, R.string.fantasy_elite_faceoff_avg_sofascore_rating, 96, 12, null, "AVERAGE_RATING", "averageRating");
        p = meiVar11;
        mei[] meiVarArr = {meiVar, meiVar2, meiVar3, meiVar4, meiVar5, meiVar6, meiVar7, meiVar8, meiVar9, meiVar10, meiVar11};
        q = meiVarArr;
        r = new kp5(meiVarArr);
    }

    public mei(int i2, int i3, int i4, int i5, Integer num, String str, String str2) {
        Integer valueOf = Integer.valueOf(R.color.primary_default);
        num = (i5 & 4) != 0 ? null : num;
        valueOf = (i5 & 8) != 0 ? null : valueOf;
        i4 = (i5 & 16) != 0 ? 50 : i4;
        boolean z = (i5 & 32) != 0;
        boolean z2 = (i5 & 64) == 0;
        this.a = str2;
        this.b = i3;
        this.c = num;
        this.d = valueOf;
        this.e = i4;
        this.f = z;
        this.g = z2;
    }

    public static mei valueOf(String str) {
        return (mei) Enum.valueOf(mei.class, str);
    }

    public static mei[] values() {
        return (mei[]) q.clone();
    }
}
