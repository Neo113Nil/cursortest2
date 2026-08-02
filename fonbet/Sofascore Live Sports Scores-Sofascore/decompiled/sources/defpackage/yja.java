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
public final class yja implements rt {
    public final dpe a;

    public yja(dpe dpeVar) {
        this.a = dpeVar;
    }

    @Override // defpackage.rt
    public final xbb a(Context context, AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics, AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics2) {
        context.getClass();
        xbb b = a.b();
        String string = context.getString(R.string.field_goal_attempts);
        string.getClass();
        Integer kickingFgAttempts = americanFootballPlayerEventStatistics.getKickingFgAttempts();
        Integer kickingFgAttempts2 = americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getKickingFgAttempts() : null;
        dpe dpeVar = this.a;
        Serializable h = dpe.h(dpeVar, string, kickingFgAttempts, kickingFgAttempts2, false, false, null, null, 120);
        if (h != null) {
            b.add(h);
        }
        String string2 = context.getString(R.string.am_football_field_goals_made_long);
        string2.getClass();
        Serializable h2 = dpe.h(dpeVar, string2, americanFootballPlayerEventStatistics.getKickingFgMade(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getKickingFgMade() : null, false, false, null, null, 120);
        if (h2 != null) {
            b.add(h2);
        }
        String string3 = context.getString(R.string.field_goals_blocked);
        string3.getClass();
        Serializable h3 = dpe.h(dpeVar, string3, americanFootballPlayerEventStatistics.getKickingFgBlocked(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getKickingFgBlocked() : null, false, false, null, null, 120);
        if (h3 != null) {
            b.add(h3);
        }
        String string4 = context.getString(R.string.kicking_extra_made);
        string4.getClass();
        Serializable h4 = dpe.h(dpeVar, string4, americanFootballPlayerEventStatistics.getKickingExtraMade(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getKickingExtraMade() : null, false, false, null, null, 120);
        if (h4 != null) {
            b.add(h4);
        }
        String string5 = context.getString(R.string.kicking_extra_attempts);
        string5.getClass();
        Serializable h5 = dpe.h(dpeVar, string5, americanFootballPlayerEventStatistics.getKickingExtraMade(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getKickingExtraMade() : null, false, false, null, null, 120);
        if (h5 != null) {
            b.add(h5);
        }
        String string6 = context.getString(R.string.kicking_fg_long);
        string6.getClass();
        Serializable h6 = dpe.h(dpeVar, string6, americanFootballPlayerEventStatistics.getKickingFgLong(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getKickingFgLong() : null, false, false, null, null, 120);
        if (h6 != null) {
            b.add(h6);
        }
        String string7 = context.getString(R.string.am_football_kicking_total_points);
        string7.getClass();
        Serializable h7 = dpe.h(dpeVar, string7, americanFootballPlayerEventStatistics.getKickingTotalPoints(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getKickingTotalPoints() : null, false, false, null, null, 120);
        if (h7 != null) {
            b.add(h7);
        }
        String string8 = context.getString(R.string.am_football_touchback);
        string8.getClass();
        Serializable h8 = dpe.h(dpeVar, string8, americanFootballPlayerEventStatistics.getKickoffEndZone(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getKickoffEndZone() : null, false, false, null, null, 120);
        if (h8 != null) {
            b.add(h8);
        }
        String string9 = context.getString(R.string.am_football_out_of_bounds_kickoffs);
        string9.getClass();
        Serializable h9 = dpe.h(dpeVar, string9, americanFootballPlayerEventStatistics.getKickoffOutOfBounds(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getKickoffOutOfBounds() : null, false, false, null, null, 120);
        if (h9 != null) {
            b.add(h9);
        }
        String string10 = context.getString(R.string.am_football_inside_20);
        string10.getClass();
        Serializable h10 = dpe.h(dpeVar, string10, americanFootballPlayerEventStatistics.getKickoffInside20(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getKickoffInside20() : null, false, false, null, null, 120);
        if (h10 != null) {
            b.add(h10);
        }
        return a.a(b);
    }

    @Override // defpackage.rt
    public final boolean b(AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics, AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics2) {
        return dpe.a(b.j(new Pair(americanFootballPlayerEventStatistics.getKickingFgAttempts(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getKickingFgAttempts() : null), new Pair(americanFootballPlayerEventStatistics.getKickingExtraAttempts(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getKickingExtraAttempts() : null)));
    }
}
