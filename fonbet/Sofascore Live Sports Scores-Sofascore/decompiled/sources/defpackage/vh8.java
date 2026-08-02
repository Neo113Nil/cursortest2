package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.FootballPlayerSeasonStatistics;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vh8 extends vi8 {
    public final uh8 O;
    public final uh8 P;
    public final uh8 Q;

    public vh8() {
        super("EXPECTED_GOALS_CONCEDED", 31, new nh8(29), new uh8(0));
        this.O = new uh8(1);
        this.P = new uh8(2);
        this.Q = new uh8(3);
    }

    @Override // defpackage.vi8
    /* renamed from: a */
    public final boolean k(FootballPlayerSeasonStatistics footballPlayerSeasonStatistics, String str) {
        return footballPlayerSeasonStatistics.getGoalsPrevented() != null;
    }

    @Override // defpackage.lk2
    public final Function1 d() {
        return this.O;
    }

    @Override // defpackage.lk2
    public final Function1 g() {
        return this.Q;
    }

    @Override // defpackage.lk2
    public final Function1 i() {
        return this.P;
    }

    @Override // defpackage.vi8, defpackage.lk2
    public final boolean k(AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics, String str) {
        return ((FootballPlayerSeasonStatistics) abstractPlayerSeasonStatistics).getGoalsPrevented() != null;
    }
}
