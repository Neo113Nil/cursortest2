package defpackage;

import androidx.fragment.app.Fragment;
import com.sofascore.results.stagesport.fragments.team.StageTeamRankingsFragment;
import com.sofascore.results.stagesport.fragments.team.constructor.StageConstructorCareerFragment;
import com.sofascore.results.stagesport.fragments.team.constructor.StageConstructorDetailsFragment;
import com.sofascore.results.stagesport.fragments.team.driver.StageDriverEventsFragment;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class n2i extends s8 {
    @Override // defpackage.d41
    public final Fragment C(Enum r2) {
        m2i m2iVar = (m2i) r2;
        m2iVar.getClass();
        int ordinal = m2iVar.ordinal();
        if (ordinal == 0) {
            return new StageConstructorDetailsFragment();
        }
        if (ordinal == 1) {
            return new StageTeamRankingsFragment();
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return new StageConstructorCareerFragment();
            }
            zzl.b();
            return null;
        }
        j5i j5iVar = j5i.c;
        StageDriverEventsFragment stageDriverEventsFragment = new StageDriverEventsFragment();
        stageDriverEventsFragment.setArguments(fz8.C(fz8.G("STANDINGS_TYPE", j5iVar)));
        return stageDriverEventsFragment;
    }

    @Override // defpackage.s8
    public final String H(Enum r1) {
        m2i m2iVar = (m2i) r1;
        m2iVar.getClass();
        String string = y().getString(m2iVar.a);
        string.getClass();
        return string;
    }
}
