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
public final class wpf implements rt {
    public final dpe a;

    public wpf(dpe dpeVar) {
        this.a = dpeVar;
    }

    @Override // defpackage.rt
    public final xbb a(Context context, AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics, AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics2) {
        context.getClass();
        xbb b = a.b();
        String string = context.getString(R.string.receptions);
        string.getClass();
        Integer receivingReceptions = americanFootballPlayerEventStatistics.getReceivingReceptions();
        Integer receivingReceptions2 = americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getReceivingReceptions() : null;
        dpe dpeVar = this.a;
        Serializable h = dpe.h(dpeVar, string, receivingReceptions, receivingReceptions2, false, false, null, null, 120);
        if (h != null) {
            b.add(h);
        }
        String string2 = context.getString(R.string.receiving_targets);
        string2.getClass();
        Serializable h2 = dpe.h(dpeVar, string2, americanFootballPlayerEventStatistics.getReceivingTargets(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getReceivingTargets() : null, false, false, null, null, 120);
        if (h2 != null) {
            b.add(h2);
        }
        String string3 = context.getString(R.string.receiving_yards);
        string3.getClass();
        Serializable h3 = dpe.h(dpeVar, string3, americanFootballPlayerEventStatistics.getReceivingYards(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getReceivingYards() : null, false, false, null, null, 120);
        if (h3 != null) {
            b.add(h3);
        }
        String string4 = context.getString(R.string.receiving_touchdowns);
        string4.getClass();
        Serializable h4 = dpe.h(dpeVar, string4, americanFootballPlayerEventStatistics.getReceivingTouchdowns(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getReceivingTouchdowns() : null, false, false, null, null, 120);
        if (h4 != null) {
            b.add(h4);
        }
        String string5 = context.getString(R.string.longest_reception);
        string5.getClass();
        Serializable h5 = dpe.h(dpeVar, string5, americanFootballPlayerEventStatistics.getReceivingLongest(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getReceivingLongest() : null, false, false, null, null, 120);
        if (h5 != null) {
            b.add(h5);
        }
        String string6 = context.getString(R.string.receiving_yards_per_reception);
        string6.getClass();
        Serializable j = dpe.j(dpeVar, string6, americanFootballPlayerEventStatistics.getReceivingYardsPerReception(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getReceivingYardsPerReception() : null, 0, false, false, null, null, PglCryptUtils.BASE64_FAILED);
        if (j != null) {
            b.add(j);
        }
        String string7 = context.getString(R.string.receiving_yards_after_catch);
        string7.getClass();
        Serializable h6 = dpe.h(dpeVar, string7, americanFootballPlayerEventStatistics.getReceivingYardsAfterCatch(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getReceivingYardsAfterCatch() : null, false, false, null, null, 120);
        if (h6 != null) {
            b.add(h6);
        }
        String string8 = context.getString(R.string.am_football_receiving_fd_stat);
        string8.getClass();
        Serializable h7 = dpe.h(dpeVar, string8, americanFootballPlayerEventStatistics.getReceivingFirstDowns(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getReceivingFirstDowns() : null, false, false, null, null, 120);
        if (h7 != null) {
            b.add(h7);
        }
        String string9 = context.getString(R.string.am_football_drop_reception);
        string9.getClass();
        Serializable h8 = dpe.h(dpeVar, string9, americanFootballPlayerEventStatistics.getReceivingDroppedPasses(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getReceivingDroppedPasses() : null, false, false, null, null, 120);
        if (h8 != null) {
            b.add(h8);
        }
        String string10 = context.getString(R.string.am_football_rz_targets);
        string10.getClass();
        Serializable h9 = dpe.h(dpeVar, string10, americanFootballPlayerEventStatistics.getReceivingRedZoneTargets(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getReceivingRedZoneTargets() : null, false, false, null, null, 120);
        if (h9 != null) {
            b.add(h9);
        }
        String string11 = context.getString(R.string.am_football_yds_after_contact);
        string11.getClass();
        Serializable h10 = dpe.h(dpeVar, string11, americanFootballPlayerEventStatistics.getReceivingYardsAfterContact(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getReceivingYardsAfterContact() : null, false, false, null, null, 120);
        if (h10 != null) {
            b.add(h10);
        }
        return a.a(b);
    }

    @Override // defpackage.rt
    public final boolean b(AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics, AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics2) {
        return dpe.a(b.j(new Pair(americanFootballPlayerEventStatistics.getReceivingTargets(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getReceivingTargets() : null), new Pair(americanFootballPlayerEventStatistics.getReceivingReceptions(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getReceivingReceptions() : null)));
    }
}
