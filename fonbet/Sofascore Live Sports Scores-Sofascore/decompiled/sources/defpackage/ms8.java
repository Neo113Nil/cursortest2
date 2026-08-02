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
public final class ms8 implements rt {
    public final dpe a;

    public ms8(dpe dpeVar) {
        this.a = dpeVar;
    }

    @Override // defpackage.rt
    public final xbb a(Context context, AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics, AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics2) {
        context.getClass();
        xbb b = a.b();
        String string = context.getString(R.string.fumbles);
        string.getClass();
        Integer fumbleFumbles = americanFootballPlayerEventStatistics.getFumbleFumbles();
        Integer fumbleFumbles2 = americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getFumbleFumbles() : null;
        dpe dpeVar = this.a;
        Serializable h = dpe.h(dpeVar, string, fumbleFumbles, fumbleFumbles2, false, false, null, null, 120);
        if (h != null) {
            b.add(h);
        }
        String string2 = context.getString(R.string.fumbles_lost);
        string2.getClass();
        Serializable h2 = dpe.h(dpeVar, string2, americanFootballPlayerEventStatistics.getFumbleLost(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getFumbleLost() : null, false, false, null, null, 120);
        if (h2 != null) {
            b.add(h2);
        }
        String string3 = context.getString(R.string.fumbles_safety);
        string3.getClass();
        Serializable k = dpeVar.k(string3, americanFootballPlayerEventStatistics.getFumbleSafety(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getFumbleSafety() : null, true, true);
        if (k != null) {
            b.add(k);
        }
        String string4 = context.getString(R.string.fumble_recoveries);
        string4.getClass();
        Serializable h3 = dpe.h(dpeVar, string4, americanFootballPlayerEventStatistics.getFumbleRecovery(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getFumbleRecovery() : null, false, false, null, null, 120);
        if (h3 != null) {
            b.add(h3);
        }
        String string5 = context.getString(R.string.forced_fumbles);
        string5.getClass();
        Serializable h4 = dpe.h(dpeVar, string5, americanFootballPlayerEventStatistics.getDefensiveForcedFumbles(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getDefensiveForcedFumbles() : null, false, false, null, null, 120);
        if (h4 != null) {
            b.add(h4);
        }
        String string6 = context.getString(R.string.fumbles_touchdown_returns);
        string6.getClass();
        Serializable h5 = dpe.h(dpeVar, string6, americanFootballPlayerEventStatistics.getFumbleTouchdownReturns(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getFumbleTouchdownReturns() : null, false, false, null, null, 120);
        if (h5 != null) {
            b.add(h5);
        }
        String string7 = context.getString(R.string.am_football_recoveries_opposition);
        string7.getClass();
        Serializable h6 = dpe.h(dpeVar, string7, americanFootballPlayerEventStatistics.getFumbleOpponentFumbleRecovery(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getFumbleOpponentFumbleRecovery() : null, false, false, null, null, 120);
        if (h6 != null) {
            b.add(h6);
        }
        String string8 = context.getString(R.string.am_football_recoveries_own);
        string8.getClass();
        Serializable h7 = dpe.h(dpeVar, string8, americanFootballPlayerEventStatistics.getFumbleOwnFumbleRecovery(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getFumbleOwnFumbleRecovery() : null, false, false, null, null, 120);
        if (h7 != null) {
            b.add(h7);
        }
        String string9 = context.getString(R.string.am_football_out_of_bounds_fumbles);
        string9.getClass();
        Serializable h8 = dpe.h(dpeVar, string9, americanFootballPlayerEventStatistics.getFumbleOutOfBounds(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getFumbleOutOfBounds() : null, false, false, null, null, 120);
        if (h8 != null) {
            b.add(h8);
        }
        return a.a(b);
    }

    @Override // defpackage.rt
    public final boolean b(AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics, AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics2) {
        return dpe.a(b.j(new Pair(americanFootballPlayerEventStatistics.getFumbleFumbles(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getFumbleFumbles() : null), new Pair(americanFootballPlayerEventStatistics.getFumbleLost(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getFumbleLost() : null), new Pair(americanFootballPlayerEventStatistics.getFumbleRecovery(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getFumbleRecovery() : null), new Pair(americanFootballPlayerEventStatistics.getDefensiveForcedFumbles(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getDefensiveForcedFumbles() : null), new Pair(americanFootballPlayerEventStatistics.getFumbleTouchdownReturns(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getFumbleTouchdownReturns() : null), new Pair(americanFootballPlayerEventStatistics.getFumbleOpponentFumbleRecovery(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getFumbleOpponentFumbleRecovery() : null), new Pair(americanFootballPlayerEventStatistics.getFumbleOwnFumbleRecovery(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getFumbleOwnFumbleRecovery() : null), new Pair(americanFootballPlayerEventStatistics.getFumbleOutOfBounds(), americanFootballPlayerEventStatistics2 != null ? americanFootballPlayerEventStatistics2.getFumbleOutOfBounds() : null)));
    }
}
