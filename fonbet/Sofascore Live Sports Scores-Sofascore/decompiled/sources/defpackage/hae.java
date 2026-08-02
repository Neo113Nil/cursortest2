package defpackage;

import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.sofascore.model.network.response.AmericanFootballPlayerEventStatistics;
import com.sofascore.results.R;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hae implements rt {
    public final dpe a;

    public hae(dpe dpeVar) {
        this.a = dpeVar;
    }

    @Override // defpackage.rt
    public final xbb a(Context context, AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics, AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics2) {
        context.getClass();
        xbb b = a.b();
        String string = context.getString(R.string.am_football_completion_pct_stat);
        string.getClass();
        Integer passingCompletions = americanFootballPlayerEventStatistics.getPassingCompletions();
        Integer passingAttempts = americanFootballPlayerEventStatistics.getPassingAttempts();
        Integer passingCompletions2 = americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getPassingCompletions() : null;
        Integer passingAttempts2 = americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getPassingAttempts() : null;
        dpe dpeVar = this.a;
        Serializable e = dpe.e(dpeVar, string, passingCompletions, passingAttempts, passingCompletions2, passingAttempts2, true, false, false, 960);
        if (e != null) {
            b.add(e);
        }
        String string2 = context.getString(R.string.passing_yards);
        string2.getClass();
        Serializable h = dpe.h(dpeVar, string2, americanFootballPlayerEventStatistics.getPassingYards(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getPassingYards() : null, false, false, null, null, 120);
        if (h != null) {
            b.add(h);
        }
        String string3 = context.getString(R.string.passing_net_yards);
        string3.getClass();
        Serializable h2 = dpe.h(dpeVar, string3, americanFootballPlayerEventStatistics.getPassingNetYards(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getPassingNetYards() : null, false, false, null, null, 120);
        if (h2 != null) {
            b.add(h2);
        }
        String string4 = context.getString(R.string.longest_pass);
        string4.getClass();
        Serializable h3 = dpe.h(dpeVar, string4, americanFootballPlayerEventStatistics.getPassingLongest(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getPassingLongest() : null, false, false, null, null, 120);
        if (h3 != null) {
            b.add(h3);
        }
        String string5 = context.getString(R.string.passing_interceptions);
        string5.getClass();
        Serializable h4 = dpe.h(dpeVar, string5, americanFootballPlayerEventStatistics.getPassingInterceptions(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getPassingInterceptions() : null, false, false, null, null, 120);
        if (h4 != null) {
            b.add(h4);
        }
        String string6 = context.getString(R.string.am_football_sack_yards_stat);
        string6.getClass();
        Serializable o = dpe.o(dpeVar, string6, americanFootballPlayerEventStatistics.getPassingSackYards(), americanFootballPlayerEventStatistics.getPassingSacked(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getPassingSackYards() : null, americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getPassingSacked() : null, true, false, false, true, PsExtractor.AUDIO_STREAM);
        if (o != null) {
            b.add(o);
        }
        String string7 = context.getString(R.string.passing_touchdowns);
        string7.getClass();
        Serializable h5 = dpe.h(dpeVar, string7, americanFootballPlayerEventStatistics.getPassingTouchdowns(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getPassingTouchdowns() : null, false, false, null, null, 120);
        if (h5 != null) {
            b.add(h5);
        }
        String string8 = context.getString(R.string.passing_yards_per_attempt);
        string8.getClass();
        Serializable g = dpeVar.g(string8, americanFootballPlayerEventStatistics.getPassingYardsPerAttempt(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getPassingYardsPerAttempt() : null, 1);
        if (g != null) {
            b.add(g);
        }
        String string9 = context.getString(R.string.am_football_air_yds);
        string9.getClass();
        Serializable h6 = dpe.h(dpeVar, string9, americanFootballPlayerEventStatistics.getPassingAirYards(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getPassingAirYards() : null, false, false, null, null, 120);
        if (h6 != null) {
            b.add(h6);
        }
        String string10 = context.getString(R.string.am_football_drop_pass);
        string10.getClass();
        Serializable h7 = dpe.h(dpeVar, string10, americanFootballPlayerEventStatistics.getPassingDroppedPasses(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getPassingDroppedPasses() : null, false, false, null, null, 120);
        if (h7 != null) {
            b.add(h7);
        }
        String string11 = context.getString(R.string.am_football_pass_1st_downs);
        string11.getClass();
        Serializable h8 = dpe.h(dpeVar, string11, americanFootballPlayerEventStatistics.getPassingFirstDowns(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getPassingFirstDowns() : null, false, false, null, null, 120);
        if (h8 != null) {
            b.add(h8);
        }
        return a.a(b);
    }

    @Override // defpackage.rt
    public final boolean b(AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics, AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics2) {
        return dpe.a(a.c(new Pair(americanFootballPlayerEventStatistics.getPassingAttempts(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getPassingAttempts() : null)));
    }
}
