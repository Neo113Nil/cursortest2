package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.FootballPlayerSeasonStatistics;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wh8 extends vi8 {
    public final uh8 O;
    public final uh8 P;
    public final uh8 Q;

    public wh8() {
        super("EXPECTED_GOAL_INVOLVEMENTS", 8, new uh8(4), new uh8(5));
        this.O = new uh8(6);
        this.P = new uh8(7);
        this.Q = new uh8(8);
    }

    @Override // defpackage.vi8, defpackage.lk2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean k(FootballPlayerSeasonStatistics footballPlayerSeasonStatistics, String str) {
        return (footballPlayerSeasonStatistics.getExpectedGoals() == null && footballPlayerSeasonStatistics.getExpectedAssists() == null) ? false : true;
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
}
