package defpackage;

import androidx.fragment.app.Fragment;
import com.sofascore.results.stagesport.fragments.team.StageTeamRankingsFragment;
import com.sofascore.results.stagesport.fragments.team.driver.StageDriverCareerFragment;
import com.sofascore.results.stagesport.fragments.team.driver.StageDriverDetailsFragment;
import com.sofascore.results.stagesport.fragments.team.driver.StageDriverEventsFragment;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c5i extends s8 {
    @Override // defpackage.d41
    public final Fragment C(Enum r2) {
        b5i b5iVar = (b5i) r2;
        b5iVar.getClass();
        int ordinal = b5iVar.ordinal();
        if (ordinal == 0) {
            return new StageDriverDetailsFragment();
        }
        if (ordinal == 1) {
            return new StageTeamRankingsFragment();
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return new StageDriverCareerFragment();
            }
            zzl.b();
            return null;
        }
        j5i j5iVar = j5i.b;
        StageDriverEventsFragment stageDriverEventsFragment = new StageDriverEventsFragment();
        stageDriverEventsFragment.setArguments(fz8.C(fz8.G("STANDINGS_TYPE", j5iVar)));
        return stageDriverEventsFragment;
    }

    @Override // defpackage.s8
    public final String H(Enum r1) {
        b5i b5iVar = (b5i) r1;
        b5iVar.getClass();
        String string = y().getString(b5iVar.a);
        string.getClass();
        return string;
    }
}
