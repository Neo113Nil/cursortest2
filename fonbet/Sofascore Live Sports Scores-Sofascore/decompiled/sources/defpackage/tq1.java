package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.BasketballPlayerSeasonStatistics;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tq1 extends br1 {
    public final rq1 C;
    public final rq1 D;
    public final rq1 E;

    public tq1() {
        super("SOFASCORE_RATING", 0, new rq1(5), new rq1(6));
        this.C = new rq1(7);
        this.D = new rq1(8);
        this.E = new rq1(9);
    }

    @Override // defpackage.br1
    public final boolean a(BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics) {
        return (basketballPlayerSeasonStatistics.getTotalRating() == null || basketballPlayerSeasonStatistics.getCountRating() == null) ? false : true;
    }

    @Override // defpackage.lk2
    public final Function1 d() {
        return this.C;
    }

    @Override // defpackage.lk2
    public final Function1 g() {
        return this.E;
    }

    @Override // defpackage.lk2
    public final Function1 i() {
        return this.D;
    }

    @Override // defpackage.br1, defpackage.lk2
    public final /* bridge */ /* synthetic */ boolean k(AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics, String str) {
        return a((BasketballPlayerSeasonStatistics) abstractPlayerSeasonStatistics);
    }
}
