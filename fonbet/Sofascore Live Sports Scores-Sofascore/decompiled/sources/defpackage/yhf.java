package defpackage;

import android.content.Context;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.sofascore.model.network.response.AmericanFootballPlayerEventStatistics;
import com.sofascore.results.R;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yhf implements rt {
    public final dpe a;

    public yhf(dpe dpeVar) {
        this.a = dpeVar;
    }

    @Override // defpackage.rt
    public final xbb a(Context context, AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics, AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics2) {
        context.getClass();
        xbb b = a.b();
        String string = context.getString(R.string.punt_returns_total);
        string.getClass();
        Integer puntReturnsTotal = americanFootballPlayerEventStatistics.getPuntReturnsTotal();
        Integer puntReturnsTotal2 = americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getPuntReturnsTotal() : null;
        dpe dpeVar = this.a;
        Serializable h = dpe.h(dpeVar, string, puntReturnsTotal, puntReturnsTotal2, false, false, null, null, 120);
        if (h != null) {
            b.add(h);
        }
        String string2 = context.getString(R.string.punt_returns_yards);
        string2.getClass();
        Serializable h2 = dpe.h(dpeVar, string2, americanFootballPlayerEventStatistics.getPuntReturnsYards(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getPuntReturnsYards() : null, false, false, null, null, 120);
        if (h2 != null) {
            b.add(h2);
        }
        String string3 = context.getString(R.string.punt_returns_touchdowns);
        string3.getClass();
        Serializable h3 = dpe.h(dpeVar, string3, americanFootballPlayerEventStatistics.getPuntReturnsTouchdowns(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getPuntReturnsTouchdowns() : null, false, false, null, null, 120);
        if (h3 != null) {
            b.add(h3);
        }
        String string4 = context.getString(R.string.punt_returns_longest);
        string4.getClass();
        Serializable h4 = dpe.h(dpeVar, string4, americanFootballPlayerEventStatistics.getPuntReturnsLong(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getPuntReturnsLong() : null, false, false, null, null, 120);
        if (h4 != null) {
            b.add(h4);
        }
        String string5 = context.getString(R.string.punt_returns_average_yards);
        string5.getClass();
        Serializable j = dpe.j(dpeVar, string5, americanFootballPlayerEventStatistics.getPuntReturnsAverageYards(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getPuntReturnsAverageYards() : null, 0, false, false, null, null, PglCryptUtils.BASE64_FAILED);
        if (j != null) {
            b.add(j);
        }
        String string6 = context.getString(R.string.am_football_fair_catch_punt);
        string6.getClass();
        Serializable h5 = dpe.h(dpeVar, string6, americanFootballPlayerEventStatistics.getPuntReturnsFairCatches(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getPuntReturnsFairCatches() : null, false, false, null, null, 120);
        if (h5 != null) {
            b.add(h5);
        }
        return a.a(b);
    }

    @Override // defpackage.rt
    public final boolean b(AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics, AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics2) {
        return dpe.a(b.j(new Pair(americanFootballPlayerEventStatistics.getPuntReturnsTotal(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getPuntReturnsTotal() : null), new Pair(americanFootballPlayerEventStatistics.getPuntReturnsFairCatches(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getPuntReturnsFairCatches() : null)));
    }
}
