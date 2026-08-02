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
public final class xja implements rt {
    public final dpe a;

    public xja(dpe dpeVar) {
        this.a = dpeVar;
    }

    @Override // defpackage.rt
    public final xbb a(Context context, AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics, AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics2) {
        context.getClass();
        xbb b = a.b();
        String string = context.getString(R.string.kick_returns_total);
        string.getClass();
        Integer kickReturnsTotal = americanFootballPlayerEventStatistics.getKickReturnsTotal();
        Integer kickReturnsTotal2 = americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getKickReturnsTotal() : null;
        dpe dpeVar = this.a;
        Serializable h = dpe.h(dpeVar, string, kickReturnsTotal, kickReturnsTotal2, false, false, null, null, 120);
        if (h != null) {
            b.add(h);
        }
        String string2 = context.getString(R.string.kick_returns_yards);
        string2.getClass();
        Serializable h2 = dpe.h(dpeVar, string2, americanFootballPlayerEventStatistics.getKickReturnsYards(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getKickReturnsYards() : null, false, false, null, null, 120);
        if (h2 != null) {
            b.add(h2);
        }
        String string3 = context.getString(R.string.kick_returns_touchdowns);
        string3.getClass();
        Serializable h3 = dpe.h(dpeVar, string3, americanFootballPlayerEventStatistics.getKickReturnsTouchdowns(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getKickReturnsTouchdowns() : null, false, false, null, null, 120);
        if (h3 != null) {
            b.add(h3);
        }
        String string4 = context.getString(R.string.kick_returns_average_yards);
        string4.getClass();
        Serializable g = dpeVar.g(string4, americanFootballPlayerEventStatistics.getKickReturnsAverageYards(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getKickReturnsAverageYards() : null, 1);
        if (g != null) {
            b.add(g);
        }
        String string5 = context.getString(R.string.kick_returns_longest);
        string5.getClass();
        Serializable h4 = dpe.h(dpeVar, string5, americanFootballPlayerEventStatistics.getKickReturnsLong(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getKickReturnsLong() : null, false, false, null, null, 120);
        if (h4 != null) {
            b.add(h4);
        }
        String string6 = context.getString(R.string.am_football_fair_catch_kick);
        string6.getClass();
        Serializable h5 = dpe.h(dpeVar, string6, americanFootballPlayerEventStatistics.getKickReturnsFairCatches(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getKickReturnsFairCatches() : null, false, false, null, null, 120);
        if (h5 != null) {
            b.add(h5);
        }
        return a.a(b);
    }

    @Override // defpackage.rt
    public final boolean b(AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics, AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics2) {
        return dpe.a(b.j(new Pair(americanFootballPlayerEventStatistics.getKickReturnsTotal(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getKickReturnsTotal() : null), new Pair(americanFootballPlayerEventStatistics.getKickReturnsFairCatches(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getKickReturnsFairCatches() : null)));
    }
}
