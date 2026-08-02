package defpackage;

import androidx.fragment.app.Fragment;
import com.sofascore.results.pots.highestRated.POTSHighestRatedPlayersFragment;
import com.sofascore.results.pots.mostAwards.POTSMostAwardsFragment;
import com.sofascore.results.pots.topLeagues.POTSTopLeaguesFragment;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class g3e extends s8 {
    @Override // defpackage.d41
    public final Fragment C(Enum r1) {
        f3e f3eVar = (f3e) r1;
        f3eVar.getClass();
        int ordinal = f3eVar.ordinal();
        if (ordinal == 0) {
            return new POTSHighestRatedPlayersFragment();
        }
        if (ordinal == 1) {
            return new POTSMostAwardsFragment();
        }
        if (ordinal == 2) {
            return new POTSTopLeaguesFragment();
        }
        zzl.b();
        return null;
    }

    @Override // defpackage.s8
    public final String H(Enum r1) {
        f3e f3eVar = (f3e) r1;
        f3eVar.getClass();
        String string = y().getString(f3eVar.a);
        string.getClass();
        return string;
    }
}
