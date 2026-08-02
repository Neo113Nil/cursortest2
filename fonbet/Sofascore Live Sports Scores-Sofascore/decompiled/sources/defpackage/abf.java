package defpackage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.results.mvvm.base.SofaTabLayout;
import com.sofascore.results.profile.predictions.ProfilePredictionsFragment;
import com.sofascore.results.profile.predictions.ProfilePredictionsStatisticsFragment;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class abf extends s8 {
    public final String r;

    public abf(AppCompatActivity appCompatActivity, ViewPager2 viewPager2, SofaTabLayout sofaTabLayout, String str) {
        super(appCompatActivity, viewPager2, sofaTabLayout);
        this.r = str;
    }

    @Override // defpackage.d41
    public final Fragment C(Enum r4) {
        zaf zafVar = (zaf) r4;
        zafVar.getClass();
        int ordinal = zafVar.ordinal();
        String str = this.r;
        if (ordinal == 0) {
            t6e t6eVar = t6e.b;
            ProfilePredictionsFragment profilePredictionsFragment = new ProfilePredictionsFragment();
            profilePredictionsFragment.setArguments(fz8.C(fz8.G("PAGING_TYPE", t6eVar), fz8.H("OPEN_PROFILE_ID", str)));
            return profilePredictionsFragment;
        }
        if (ordinal == 1) {
            t6e t6eVar2 = t6e.a;
            ProfilePredictionsFragment profilePredictionsFragment2 = new ProfilePredictionsFragment();
            profilePredictionsFragment2.setArguments(fz8.C(fz8.G("PAGING_TYPE", t6eVar2), fz8.H("OPEN_PROFILE_ID", str)));
            return profilePredictionsFragment2;
        }
        if (ordinal != 2) {
            zzl.b();
            return null;
        }
        ProfilePredictionsStatisticsFragment profilePredictionsStatisticsFragment = new ProfilePredictionsStatisticsFragment();
        profilePredictionsStatisticsFragment.setArguments(fz8.C(fz8.H("OPEN_PROFILE_ID", str)));
        return profilePredictionsStatisticsFragment;
    }

    @Override // defpackage.s8
    public final String H(Enum r1) {
        zaf zafVar = (zaf) r1;
        zafVar.getClass();
        String string = y().getString(zafVar.a);
        string.getClass();
        return string;
    }
}
