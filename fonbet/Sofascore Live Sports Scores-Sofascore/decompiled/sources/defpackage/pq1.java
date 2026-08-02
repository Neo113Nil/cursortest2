package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.BasketballPlayerSeasonStatistics;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pq1 extends br1 {
    public final kq1 C;
    public final kq1 D;
    public final kq1 E;

    public pq1() {
        super("PLUS_MINUS", 21, new kq1(20), new kq1(21));
        this.C = new kq1(22);
        this.D = new kq1(23);
        this.E = new kq1(24);
    }

    @Override // defpackage.br1
    public final boolean a(BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics) {
        return basketballPlayerSeasonStatistics.getPlusMinus() != null;
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
    public final boolean k(AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics, String str) {
        return ((BasketballPlayerSeasonStatistics) abstractPlayerSeasonStatistics).getPlusMinus() != null;
    }
}
