package defpackage;

import androidx.fragment.app.Fragment;
import com.sofascore.results.stagesport.fragments.category.StageCategoryOddsFragment;
import com.sofascore.results.stagesport.fragments.category.StageCategoryRacesFragment;
import com.sofascore.results.stagesport.fragments.category.StageCategoryRankingFragment;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b2i extends s8 {
    @Override // defpackage.d41
    public final Fragment C(Enum r1) {
        a2i a2iVar = (a2i) r1;
        a2iVar.getClass();
        int ordinal = a2iVar.ordinal();
        if (ordinal == 0) {
            return new StageCategoryRacesFragment();
        }
        if (ordinal == 1) {
            return new StageCategoryRankingFragment();
        }
        if (ordinal == 2) {
            return new StageCategoryOddsFragment();
        }
        zzl.b();
        return null;
    }

    @Override // defpackage.s8
    public final String H(Enum r1) {
        a2i a2iVar = (a2i) r1;
        a2iVar.getClass();
        String string = y().getString(a2iVar.a);
        string.getClass();
        return string;
    }
}
