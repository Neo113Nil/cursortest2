package defpackage;

import android.content.Context;
import com.sofascore.model.network.response.AmericanFootballPlayerEventStatistics;
import com.sofascore.results.R;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wu4 implements rt {
    public final dpe a;

    public wu4(dpe dpeVar) {
        this.a = dpeVar;
    }

    @Override // defpackage.rt
    public final xbb a(Context context, AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics, AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics2) {
        Integer defensiveAssistTackles;
        Integer defensiveCombineTackles;
        context.getClass();
        xbb b = a.b();
        String string = context.getString(R.string.combine_tackles);
        string.getClass();
        Integer defensiveCombineTackles2 = americanFootballPlayerEventStatistics.getDefensiveCombineTackles();
        Integer defensiveCombineTackles3 = americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getDefensiveCombineTackles() : null;
        dpe dpeVar = this.a;
        Serializable h = dpe.h(dpeVar, string, defensiveCombineTackles2, defensiveCombineTackles3, false, false, null, null, 120);
        if (h != null) {
            b.add(h);
        }
        String string2 = context.getString(R.string.am_football_tackles);
        string2.getClass();
        Integer defensiveCombineTackles4 = americanFootballPlayerEventStatistics.getDefensiveCombineTackles();
        int i = 0;
        int intValue = defensiveCombineTackles4 != null ? defensiveCombineTackles4.intValue() : 0;
        Integer defensiveAssistTackles2 = americanFootballPlayerEventStatistics.getDefensiveAssistTackles();
        Integer valueOf = Integer.valueOf(intValue - (defensiveAssistTackles2 != null ? defensiveAssistTackles2.intValue() : 0));
        int intValue2 = (americanFootballPlayerEventStatistics2 == null || (defensiveCombineTackles = americanFootballPlayerEventStatistics2.getDefensiveCombineTackles()) == null) ? 0 : defensiveCombineTackles.intValue();
        if (americanFootballPlayerEventStatistics2 != null && (defensiveAssistTackles = americanFootballPlayerEventStatistics2.getDefensiveAssistTackles()) != null) {
            i = defensiveAssistTackles.intValue();
        }
        Serializable h2 = dpe.h(dpeVar, string2, valueOf, Integer.valueOf(intValue2 - i), false, false, null, null, 120);
        if (h2 != null) {
            b.add(h2);
        }
        String string3 = context.getString(R.string.assist_tackle);
        string3.getClass();
        Serializable h3 = dpe.h(dpeVar, string3, americanFootballPlayerEventStatistics.getDefensiveAssistTackles(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getDefensiveAssistTackles() : null, false, false, null, null, 120);
        if (h3 != null) {
            b.add(h3);
        }
        String string4 = context.getString(R.string.sacks);
        string4.getClass();
        Serializable g = dpeVar.g(string4, americanFootballPlayerEventStatistics.getDefensiveSacks(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getDefensiveSacks() : null, 1);
        if (g != null) {
            b.add(g);
        }
        String string5 = context.getString(R.string.passes_defended);
        string5.getClass();
        Serializable h4 = dpe.h(dpeVar, string5, americanFootballPlayerEventStatistics.getDefensivePassesDefensed(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getDefensivePassesDefensed() : null, false, false, null, null, 120);
        if (h4 != null) {
            b.add(h4);
        }
        String string6 = context.getString(R.string.am_football_batted_pass);
        string6.getClass();
        Serializable h5 = dpe.h(dpeVar, string6, americanFootballPlayerEventStatistics.getDefensiveBattedPasses(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getDefensiveBattedPasses() : null, false, false, null, null, 120);
        if (h5 != null) {
            b.add(h5);
        }
        String string7 = context.getString(R.string.am_football_def_targets);
        string7.getClass();
        Serializable h6 = dpe.h(dpeVar, string7, americanFootballPlayerEventStatistics.getDefensiveDefensiveTargets(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getDefensiveDefensiveTargets() : null, false, false, null, null, 120);
        if (h6 != null) {
            b.add(h6);
        }
        String string8 = context.getString(R.string.am_football_tackles_loss);
        string8.getClass();
        Serializable h7 = dpe.h(dpeVar, string8, americanFootballPlayerEventStatistics.getDefensiveTacklesForLoss(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getDefensiveTacklesForLoss() : null, false, false, null, null, 120);
        if (h7 != null) {
            b.add(h7);
        }
        return a.a(b);
    }

    @Override // defpackage.rt
    public final boolean b(AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics, AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics2) {
        return dpe.a(b.j(new Pair(americanFootballPlayerEventStatistics.getDefensiveCombineTackles(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getDefensiveCombineTackles() : null), new Pair(americanFootballPlayerEventStatistics.getDefensiveAssistTackles(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getDefensiveAssistTackles() : null), new Pair(americanFootballPlayerEventStatistics.getDefensiveSacks(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getDefensiveSacks() : null), new Pair(americanFootballPlayerEventStatistics.getDefensivePassesDefensed(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getDefensivePassesDefensed() : null)));
    }
}
