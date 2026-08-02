package defpackage;

import androidx.fragment.app.Fragment;
import com.sofascore.results.bettingtips.fragment.BetBoostFragment;
import com.sofascore.results.bettingtips.fragment.DroppingOddsFragment;
import com.sofascore.results.bettingtips.fragment.HighValueStreaksFragment;
import com.sofascore.results.bettingtips.fragment.TeamStreaksFragment;
import com.sofascore.results.bettingtips.fragment.TopH2HFragment;
import com.sofascore.results.bettingtips.fragment.TrendingOddsFragment;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fv1 extends s8 {
    @Override // defpackage.d41
    public final Fragment C(Enum r1) {
        ev1 ev1Var = (ev1) r1;
        ev1Var.getClass();
        int ordinal = ev1Var.ordinal();
        if (ordinal == 0) {
            return new BetBoostFragment();
        }
        if (ordinal == 1) {
            return new DroppingOddsFragment();
        }
        if (ordinal == 2) {
            return new TrendingOddsFragment();
        }
        if (ordinal == 3) {
            return new HighValueStreaksFragment();
        }
        if (ordinal == 4) {
            return new TopH2HFragment();
        }
        if (ordinal == 5) {
            return new TeamStreaksFragment();
        }
        zzl.b();
        return null;
    }

    @Override // defpackage.s8
    public final String H(Enum r1) {
        ev1 ev1Var = (ev1) r1;
        ev1Var.getClass();
        String string = y().getString(ev1Var.a);
        string.getClass();
        return string;
    }
}
