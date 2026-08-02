package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.BasketballPlayerSeasonStatistics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class rr1 {
    public static final mqi a = ypa.b(new vn1(8));

    public static final String a(Double d) {
        double s = yid.s(Math.abs(d.doubleValue()), 2);
        return (0.01d > s || s > 0.09d) ? yid.c("%.1f", d) : yid.c("%.2f", d);
    }

    public static final BasketballPlayerSeasonStatistics b(wyg wygVar) {
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics = wygVar.a;
        if (abstractPlayerSeasonStatistics instanceof BasketballPlayerSeasonStatistics) {
            return (BasketballPlayerSeasonStatistics) abstractPlayerSeasonStatistics;
        }
        return null;
    }
}
