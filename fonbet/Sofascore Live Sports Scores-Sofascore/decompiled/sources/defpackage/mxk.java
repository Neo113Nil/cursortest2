package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.CustomizableDivider;
import com.sofascore.model.network.response.VolleyballPlayerEventStatistics;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mxk implements epe {
    public final Context a;
    public final VolleyballPlayerEventStatistics b;
    public final VolleyballPlayerEventStatistics c;
    public final dpe d;

    public mxk(Context context, boolean z, VolleyballPlayerEventStatistics volleyballPlayerEventStatistics, VolleyballPlayerEventStatistics volleyballPlayerEventStatistics2) {
        context.getClass();
        this.a = context;
        this.b = volleyballPlayerEventStatistics;
        this.c = volleyballPlayerEventStatistics2;
        this.d = new dpe(volleyballPlayerEventStatistics2 != null, z);
    }

    @Override // defpackage.epe
    public final List a() {
        Integer attacksTotal;
        xbb b = a.b();
        String b2 = b(R.string.total);
        VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = this.b;
        Integer pointsTotal = volleyballPlayerEventStatistics.getPointsTotal();
        VolleyballPlayerEventStatistics volleyballPlayerEventStatistics2 = this.c;
        Integer pointsTotal2 = volleyballPlayerEventStatistics2 != null ? volleyballPlayerEventStatistics2.getPointsTotal() : null;
        dpe dpeVar = this.d;
        List x = ph0.x(new Object[]{dpe.h(dpeVar, b2, pointsTotal, pointsTotal2, false, false, null, null, 120), dpe.h(dpeVar, b(R.string.volleyball_break_points), volleyballPlayerEventStatistics.getBreakPoints(), volleyballPlayerEventStatistics2 != null ? volleyballPlayerEventStatistics2.getBreakPoints() : null, false, false, null, null, 120), dpe.h(dpeVar, b(R.string.volleyball_won_lost_points_ratio), volleyballPlayerEventStatistics.getWinLoss(), volleyballPlayerEventStatistics2 != null ? volleyballPlayerEventStatistics2.getWinLoss() : null, false, false, null, null, 120), dpe.h(dpeVar, b(R.string.volleyball_block_points), volleyballPlayerEventStatistics.getBlockPoints(), volleyballPlayerEventStatistics2 != null ? volleyballPlayerEventStatistics2.getBlockPoints() : null, false, false, null, null, 120)});
        if (((ArrayList) x).isEmpty()) {
            x = null;
        }
        if (x != null) {
            b.add(b(R.string.volleyball_points));
            b.addAll(x);
            b.add(new CustomizableDivider(true, 0, false, null, 14, null));
        }
        List x2 = ph0.x(new Object[]{dpe.h(dpeVar, b(R.string.total), volleyballPlayerEventStatistics.getServes(), volleyballPlayerEventStatistics2 != null ? volleyballPlayerEventStatistics2.getServes() : null, false, false, null, null, 120), dpe.h(dpeVar, b(R.string.volleyball_errors), volleyballPlayerEventStatistics.getServeErrors(), volleyballPlayerEventStatistics2 != null ? volleyballPlayerEventStatistics2.getServeErrors() : null, false, false, null, null, 120), dpe.h(dpeVar, b(R.string.volleyball_aces), volleyballPlayerEventStatistics.getAces(), volleyballPlayerEventStatistics2 != null ? volleyballPlayerEventStatistics2.getAces() : null, false, false, null, null, 120)});
        if (((ArrayList) x2).isEmpty()) {
            x2 = null;
        }
        if (x2 != null) {
            b.add(b(R.string.volleyball_serve));
            b.addAll(x2);
            b.add(new CustomizableDivider(true, 0, false, null, 14, null));
        }
        Double valueOf = Double.valueOf(0.01d);
        List x3 = ph0.x(new Object[]{dpe.h(dpeVar, b(R.string.total), volleyballPlayerEventStatistics.getReceptionsTotal(), volleyballPlayerEventStatistics2 != null ? volleyballPlayerEventStatistics2.getReceptionsTotal() : null, false, false, null, null, 120), dpe.h(dpeVar, b(R.string.volleyball_errors), volleyballPlayerEventStatistics.getReceptionErrors(), volleyballPlayerEventStatistics2 != null ? volleyballPlayerEventStatistics2.getReceptionErrors() : null, false, false, null, null, 120), dpe.m(dpeVar, b(R.string.volleyball_positive_reception_percentage), yid.b(volleyballPlayerEventStatistics.getReceptionPositivity(), valueOf), yid.b(volleyballPlayerEventStatistics2 != null ? volleyballPlayerEventStatistics2.getReceptionPositivity() : null, valueOf), false, 112), dpe.m(dpeVar, b(R.string.volleyball_excellent_reception_percentage), yid.b(volleyballPlayerEventStatistics.getReceptionPerf(), valueOf), yid.b(volleyballPlayerEventStatistics2 != null ? volleyballPlayerEventStatistics2.getReceptionPerf() : null, valueOf), false, 112)});
        if (((ArrayList) x3).isEmpty()) {
            x3 = null;
        }
        if (x3 != null) {
            b.add(b(R.string.volleyball_reception));
            b.addAll(x3);
            b.add(new CustomizableDivider(true, 0, false, null, 14, null));
        }
        List x4 = ph0.x(new Object[]{dpe.h(dpeVar, b(R.string.total), volleyballPlayerEventStatistics.getAttacksTotal(), volleyballPlayerEventStatistics2 != null ? volleyballPlayerEventStatistics2.getAttacksTotal() : null, false, false, null, null, 120), dpe.h(dpeVar, b(R.string.volleyball_errors), volleyballPlayerEventStatistics.getAttackErrors(), volleyballPlayerEventStatistics2 != null ? volleyballPlayerEventStatistics2.getAttackErrors() : null, false, false, null, null, 120), dpe.h(dpeVar, b(R.string.volleyball_blocked_attacks), volleyballPlayerEventStatistics.getAttacksBlocked(), volleyballPlayerEventStatistics2 != null ? volleyballPlayerEventStatistics2.getAttacksBlocked() : null, false, false, null, null, 120), dpe.h(dpeVar, b(R.string.volleyball_points), volleyballPlayerEventStatistics.getAttackPoints(), volleyballPlayerEventStatistics2 != null ? volleyballPlayerEventStatistics2.getAttackPoints() : null, false, false, null, null, 120), dpe.m(dpeVar, b(R.string.volleyball_points_percentage), yid.b(volleyballPlayerEventStatistics.getAttackPoints(), volleyballPlayerEventStatistics.getAttacksTotal() != null ? Double.valueOf(r7.intValue() / 100.0d) : null), yid.b(volleyballPlayerEventStatistics2 != null ? volleyballPlayerEventStatistics2.getAttackPoints() : null, (volleyballPlayerEventStatistics2 == null || (attacksTotal = volleyballPlayerEventStatistics2.getAttacksTotal()) == null) ? null : Double.valueOf(attacksTotal.intValue() / 100.0d)), false, 112)});
        List list = ((ArrayList) x4).isEmpty() ? null : x4;
        if (list != null) {
            b.add(b(R.string.volleyball_attack));
            b.addAll(list);
        }
        return a.a(b);
    }

    public final String b(int i) {
        String string = this.a.getString(i);
        string.getClass();
        return string;
    }
}
