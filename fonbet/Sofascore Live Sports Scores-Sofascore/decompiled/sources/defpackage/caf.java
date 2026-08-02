package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.sofascore.results.profile.topLeaderboards.ProfileTopLeaderboardFragment;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class caf extends s8 {
    @Override // defpackage.d41
    public final Fragment C(Enum r3) {
        baf bafVar = (baf) r3;
        bafVar.getClass();
        int ordinal = bafVar.ordinal();
        if (ordinal == 0) {
            gta gtaVar = gta.a;
            ProfileTopLeaderboardFragment profileTopLeaderboardFragment = new ProfileTopLeaderboardFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("LEADERBOARD_TYPE", gtaVar);
            profileTopLeaderboardFragment.setArguments(bundle);
            return profileTopLeaderboardFragment;
        }
        if (ordinal == 1) {
            gta gtaVar2 = gta.b;
            ProfileTopLeaderboardFragment profileTopLeaderboardFragment2 = new ProfileTopLeaderboardFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("LEADERBOARD_TYPE", gtaVar2);
            profileTopLeaderboardFragment2.setArguments(bundle2);
            return profileTopLeaderboardFragment2;
        }
        if (ordinal != 2) {
            zzl.b();
            return null;
        }
        gta gtaVar3 = gta.c;
        ProfileTopLeaderboardFragment profileTopLeaderboardFragment3 = new ProfileTopLeaderboardFragment();
        Bundle bundle3 = new Bundle();
        bundle3.putSerializable("LEADERBOARD_TYPE", gtaVar3);
        profileTopLeaderboardFragment3.setArguments(bundle3);
        return profileTopLeaderboardFragment3;
    }

    @Override // defpackage.s8
    public final String H(Enum r1) {
        baf bafVar = (baf) r1;
        bafVar.getClass();
        String string = y().getString(bafVar.a);
        string.getClass();
        return string;
    }
}
