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
public final class xu4 implements rt {
    public final dpe a;

    public xu4(dpe dpeVar) {
        this.a = dpeVar;
    }

    @Override // defpackage.rt
    public final xbb a(Context context, AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics, AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics2) {
        context.getClass();
        xbb b = a.b();
        String string = context.getString(R.string.interceptions);
        string.getClass();
        Integer defensiveInterceptions = americanFootballPlayerEventStatistics.getDefensiveInterceptions();
        Integer defensiveInterceptions2 = americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getDefensiveInterceptions() : null;
        dpe dpeVar = this.a;
        Serializable h = dpe.h(dpeVar, string, defensiveInterceptions, defensiveInterceptions2, false, false, null, null, 120);
        if (h != null) {
            b.add(h);
        }
        String string2 = context.getString(R.string.interceptions_touchdowns);
        string2.getClass();
        Serializable h2 = dpe.h(dpeVar, string2, americanFootballPlayerEventStatistics.getDefensiveInterceptionsTouchdowns(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getDefensiveInterceptionsTouchdowns() : null, false, false, null, null, 120);
        if (h2 != null) {
            b.add(h2);
        }
        String string3 = context.getString(R.string.interceptions_yards);
        string3.getClass();
        Serializable h3 = dpe.h(dpeVar, string3, americanFootballPlayerEventStatistics.getDefensiveInterceptionsYards(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getDefensiveInterceptionsYards() : null, false, false, null, null, 120);
        if (h3 != null) {
            b.add(h3);
        }
        String string4 = context.getString(R.string.am_football_int_return_average);
        string4.getClass();
        Serializable g = dpeVar.g(string4, americanFootballPlayerEventStatistics.getInterceptionReturnsAverageYards(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getInterceptionReturnsAverageYards() : null, 1);
        if (g != null) {
            b.add(g);
        }
        String string5 = context.getString(R.string.am_football_longest_interception_return);
        string5.getClass();
        Serializable h4 = dpe.h(dpeVar, string5, americanFootballPlayerEventStatistics.getInterceptionReturnsLongest(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getInterceptionReturnsLongest() : null, false, false, null, null, 120);
        if (h4 != null) {
            b.add(h4);
        }
        return a.a(b);
    }

    @Override // defpackage.rt
    public final boolean b(AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics, AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics2) {
        return dpe.a(b.j(new Pair(americanFootballPlayerEventStatistics.getDefensiveInterceptions(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getDefensiveInterceptions() : null), new Pair(americanFootballPlayerEventStatistics.getDefensiveInterceptionsTouchdowns(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getDefensiveInterceptionsTouchdowns() : null), new Pair(americanFootballPlayerEventStatistics.getDefensiveInterceptionsYards(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getDefensiveInterceptionsYards() : null), new Pair(americanFootballPlayerEventStatistics.getInterceptionReturnsAverageYards(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getInterceptionReturnsAverageYards() : null), new Pair(americanFootballPlayerEventStatistics.getInterceptionReturnsLongest(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getInterceptionReturnsLongest() : null)));
    }
}
