package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.FootballPlayerSeasonStatistics;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yh8 extends vi8 {
    public final uh8 O;
    public final uh8 P;
    public final uh8 Q;

    public yh8() {
        super("GOALS_CONCEDED", 30, new uh8(14), new uh8(15));
        this.O = new uh8(16);
        this.P = new uh8(17);
        this.Q = new uh8(18);
    }

    @Override // defpackage.vi8
    /* renamed from: a */
    public final boolean k(FootballPlayerSeasonStatistics footballPlayerSeasonStatistics, String str) {
        return footballPlayerSeasonStatistics.getGoalsConceded() != null;
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
        return ((FootballPlayerSeasonStatistics) abstractPlayerSeasonStatistics).getGoalsConceded() != null;
    }
}
