package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.FootballPlayerSeasonStatistics;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class th8 extends vi8 {
    public final nh8 O;
    public final nh8 P;
    public final nh8 Q;

    public th8() {
        super("EXPECTED_GOALS", 5, new nh8(24), new nh8(25));
        this.O = new nh8(26);
        this.P = new nh8(27);
        this.Q = new nh8(28);
    }

    @Override // defpackage.vi8
    /* renamed from: a */
    public final boolean k(FootballPlayerSeasonStatistics footballPlayerSeasonStatistics, String str) {
        return footballPlayerSeasonStatistics.getExpectedGoals() != null;
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
        return ((FootballPlayerSeasonStatistics) abstractPlayerSeasonStatistics).getExpectedGoals() != null;
    }
}
