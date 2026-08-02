package defpackage;

import android.content.Context;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.sofascore.model.network.response.AmericanFootballPlayerEventStatistics;
import com.sofascore.results.R;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class aag implements rt {
    public final dpe a;

    public aag(dpe dpeVar) {
        this.a = dpeVar;
    }

    @Override // defpackage.rt
    public final xbb a(Context context, AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics, AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics2) {
        context.getClass();
        xbb b = a.b();
        String string = context.getString(R.string.rushing_attempts);
        string.getClass();
        Integer rushingAttempts = americanFootballPlayerEventStatistics.getRushingAttempts();
        Integer rushingAttempts2 = americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getRushingAttempts() : null;
        dpe dpeVar = this.a;
        Serializable h = dpe.h(dpeVar, string, rushingAttempts, rushingAttempts2, false, false, null, null, 120);
        if (h != null) {
            b.add(h);
        }
        String string2 = context.getString(R.string.rushing_yards);
        string2.getClass();
        Serializable h2 = dpe.h(dpeVar, string2, americanFootballPlayerEventStatistics.getRushingYards(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getRushingYards() : null, false, false, null, null, 120);
        if (h2 != null) {
            b.add(h2);
        }
        String string3 = context.getString(R.string.rushing_touchdowns);
        string3.getClass();
        Serializable h3 = dpe.h(dpeVar, string3, americanFootballPlayerEventStatistics.getRushingTouchdowns(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getRushingTouchdowns() : null, false, false, null, null, 120);
        if (h3 != null) {
            b.add(h3);
        }
        String string4 = context.getString(R.string.longest_rush);
        string4.getClass();
        Serializable h4 = dpe.h(dpeVar, string4, americanFootballPlayerEventStatistics.getRushingLongest(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getRushingLongest() : null, false, false, null, null, 120);
        if (h4 != null) {
            b.add(h4);
        }
        String string5 = context.getString(R.string.rushing_yards_per_attempt);
        string5.getClass();
        Serializable j = dpe.j(dpeVar, string5, americanFootballPlayerEventStatistics.getRushingYardsPerAttempt(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getRushingYardsPerAttempt() : null, 0, false, false, null, null, PglCryptUtils.BASE64_FAILED);
        if (j != null) {
            b.add(j);
        }
        String string6 = context.getString(R.string.rushing_yards_after_contact);
        string6.getClass();
        Serializable h5 = dpe.h(dpeVar, string6, americanFootballPlayerEventStatistics.getRushingYardsAfterContact(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getRushingYardsAfterContact() : null, false, false, null, null, 120);
        if (h5 != null) {
            b.add(h5);
        }
        String string7 = context.getString(R.string.am_football_rushing_fd_stat);
        string7.getClass();
        Serializable h6 = dpe.h(dpeVar, string7, americanFootballPlayerEventStatistics.getRushingFirstDowns(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getRushingFirstDowns() : null, false, false, null, null, 120);
        if (h6 != null) {
            b.add(h6);
        }
        String string8 = context.getString(R.string.am_football_rz_attempts);
        string8.getClass();
        Serializable h7 = dpe.h(dpeVar, string8, americanFootballPlayerEventStatistics.getRushingRedZoneAttempts(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getRushingRedZoneAttempts() : null, false, false, null, null, 120);
        if (h7 != null) {
            b.add(h7);
        }
        return a.a(b);
    }

    @Override // defpackage.rt
    public final boolean b(AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics, AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics2) {
        return dpe.a(a.c(new Pair(americanFootballPlayerEventStatistics.getRushingAttempts(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getRushingAttempts() : null)));
    }
}
