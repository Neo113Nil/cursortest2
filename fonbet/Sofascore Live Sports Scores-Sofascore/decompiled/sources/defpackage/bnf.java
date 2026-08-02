package defpackage;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bnf {
    public static final anf c;
    public static final bnf d;
    public static final bnf e;
    public static final bnf f;
    public static final bnf g;
    public static final bnf h;
    public static final bnf i;
    public static final /* synthetic */ bnf[] j;
    public static final /* synthetic */ kp5 k;
    public final q9k a;
    public final String b;

    static {
        bnf bnfVar = new bnf("Overall", 0, new q9k(R.string.sofascore_rating_short), CampaignEx.JSON_KEY_STAR);
        d = bnfVar;
        bnf bnfVar2 = new bnf("Shooting", 1, new q9k(R.string.football_rating_shooting_category), "shooting");
        e = bnfVar2;
        bnf bnfVar3 = new bnf("Passing", 2, new q9k(R.string.football_passing_category), "passing");
        f = bnfVar3;
        bnf bnfVar4 = new bnf("Dribbling", 3, new q9k(R.string.football_dribbling_category), "dribbling");
        g = bnfVar4;
        bnf bnfVar5 = new bnf("Defending", 4, new q9k(R.string.football_defending_category), "defending");
        h = bnfVar5;
        bnf bnfVar6 = new bnf("Goalkeeping", 5, new q9k(R.string.football_goalkeeping_category), "goalkeeping");
        i = bnfVar6;
        bnf[] bnfVarArr = {bnfVar, bnfVar2, bnfVar3, bnfVar4, bnfVar5, bnfVar6};
        j = bnfVarArr;
        k = new kp5(bnfVarArr);
        c = new anf(0);
    }

    public bnf(String str, int i2, q9k q9kVar, String str2) {
        this.a = q9kVar;
        this.b = str2;
    }

    public static bnf valueOf(String str) {
        return (bnf) Enum.valueOf(bnf.class, str);
    }

    public static bnf[] values() {
        return (bnf[]) j.clone();
    }
}
