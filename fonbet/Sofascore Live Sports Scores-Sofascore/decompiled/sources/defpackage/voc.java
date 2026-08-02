package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.mma.fighter.details.MmaFighterDetailsFragment;
import com.sofascore.results.mma.fighter.matches.MmaFighterEventsFragment;
import com.sofascore.results.mma.fighter.statistics.MmaFighterStatisticsFragment;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class voc extends s8 {
    public Team r;

    @Override // defpackage.d41
    public final Fragment C(Enum r5) {
        uoc uocVar = (uoc) r5;
        uocVar.getClass();
        int ordinal = uocVar.ordinal();
        if (ordinal == 0) {
            Team team = this.r;
            if (team == null) {
                Intrinsics.i("fighter");
                throw null;
            }
            MmaFighterDetailsFragment mmaFighterDetailsFragment = new MmaFighterDetailsFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("FIGHTER", team);
            mmaFighterDetailsFragment.setArguments(bundle);
            return mmaFighterDetailsFragment;
        }
        if (ordinal == 1) {
            Team team2 = this.r;
            if (team2 == null) {
                Intrinsics.i("fighter");
                throw null;
            }
            MmaFighterStatisticsFragment mmaFighterStatisticsFragment = new MmaFighterStatisticsFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("FIGHTER", team2);
            mmaFighterStatisticsFragment.setArguments(bundle2);
            return mmaFighterStatisticsFragment;
        }
        if (ordinal != 2) {
            zzl.b();
            return null;
        }
        Team team3 = this.r;
        if (team3 == null) {
            Intrinsics.i("fighter");
            throw null;
        }
        MmaFighterEventsFragment mmaFighterEventsFragment = new MmaFighterEventsFragment();
        Bundle bundle3 = new Bundle();
        bundle3.putSerializable("FIGHTER", team3);
        mmaFighterEventsFragment.setArguments(bundle3);
        return mmaFighterEventsFragment;
    }

    @Override // defpackage.s8
    public final String H(Enum r1) {
        uoc uocVar = (uoc) r1;
        uocVar.getClass();
        String string = y().getString(uocVar.a);
        string.getClass();
        return string;
    }
}
