package defpackage;

import android.content.Context;
import com.sofascore.model.network.response.AmericanFootballPlayerEventStatistics;
import com.sofascore.results.R;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zhf implements rt {
    public final dpe a;

    public zhf(dpe dpeVar) {
        this.a = dpeVar;
    }

    @Override // defpackage.rt
    public final xbb a(Context context, AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics, AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics2) {
        context.getClass();
        xbb b = a.b();
        String string = context.getString(R.string.punts);
        string.getClass();
        Integer puntingTotal = americanFootballPlayerEventStatistics.getPuntingTotal();
        Integer puntingTotal2 = americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getPuntingTotal() : null;
        dpe dpeVar = this.a;
        Serializable h = dpe.h(dpeVar, string, puntingTotal, puntingTotal2, false, false, null, null, 120);
        if (h != null) {
            b.add(h);
        }
        String string2 = context.getString(R.string.punting_yards);
        string2.getClass();
        Serializable h2 = dpe.h(dpeVar, string2, americanFootballPlayerEventStatistics.getPuntingYards(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getPuntingYards() : null, false, false, null, null, 120);
        if (h2 != null) {
            b.add(h2);
        }
        String string3 = context.getString(R.string.punting_net_yards);
        string3.getClass();
        Serializable h3 = dpe.h(dpeVar, string3, americanFootballPlayerEventStatistics.getPuntingNetYards(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getPuntingNetYards() : null, false, false, null, null, 120);
        if (h3 != null) {
            b.add(h3);
        }
        String string4 = context.getString(R.string.longest_punt);
        string4.getClass();
        Serializable h4 = dpe.h(dpeVar, string4, americanFootballPlayerEventStatistics.getPuntingLongest(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getPuntingLongest() : null, false, false, null, null, 120);
        if (h4 != null) {
            b.add(h4);
        }
        String string5 = context.getString(R.string.punts_blocked);
        string5.getClass();
        Serializable h5 = dpe.h(dpeVar, string5, americanFootballPlayerEventStatistics.getPuntingBlocked(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getPuntingBlocked() : null, false, false, null, null, 120);
        if (h5 != null) {
            b.add(h5);
        }
        String string6 = context.getString(R.string.touchbacks);
        string6.getClass();
        Serializable h6 = dpe.h(dpeVar, string6, americanFootballPlayerEventStatistics.getPuntingTouchbacks(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getPuntingTouchbacks() : null, false, false, null, null, 120);
        if (h6 != null) {
            b.add(h6);
        }
        String string7 = context.getString(R.string.punts_inside_20);
        string7.getClass();
        Serializable h7 = dpe.h(dpeVar, string7, americanFootballPlayerEventStatistics.getPuntingInside20(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getPuntingInside20() : null, false, false, null, null, 120);
        if (h7 != null) {
            b.add(h7);
        }
        String string8 = context.getString(R.string.yards_per_punt);
        string8.getClass();
        Serializable g = dpeVar.g(string8, americanFootballPlayerEventStatistics.getPuntingYardsPerPuntAvg(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getPuntingYardsPerPuntAvg() : null, 1);
        if (g != null) {
            b.add(g);
        }
        String string9 = context.getString(R.string.am_football_avg_hang_time);
        string9.getClass();
        Serializable g2 = dpeVar.g(string9, americanFootballPlayerEventStatistics.getPuntingAverageHangTime(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getPuntingAverageHangTime() : null, 1);
        if (g2 != null) {
            b.add(g2);
        }
        String string10 = context.getString(R.string.am_football_hang_time);
        string10.getClass();
        Serializable g3 = dpeVar.g(string10, americanFootballPlayerEventStatistics.getPuntingHangTime(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getPuntingHangTime() : null, 1);
        if (g3 != null) {
            b.add(g3);
        }
        return a.a(b);
    }

    @Override // defpackage.rt
    public final boolean b(AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics, AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics2) {
        return dpe.a(a.c(new Pair(americanFootballPlayerEventStatistics.getPuntingTotal(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getPuntingTotal() : null)));
    }
}
