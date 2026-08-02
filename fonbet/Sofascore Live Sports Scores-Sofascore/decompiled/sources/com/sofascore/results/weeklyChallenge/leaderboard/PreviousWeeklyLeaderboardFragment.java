package com.sofascore.results.weeklyChallenge.leaderboard;

import android.os.Bundle;
import android.view.View;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import defpackage.duf;
import defpackage.g4l;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.iz2;
import defpackage.krk;
import defpackage.otk;
import defpackage.s6f;
import defpackage.t6f;
import defpackage.tc3;
import defpackage.un0;
import defpackage.wrh;
import defpackage.xw3;
import defpackage.z45;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/weeklyChallenge/leaderboard/PreviousWeeklyLeaderboardFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lwrh;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PreviousWeeklyLeaderboardFragment extends Hilt_PreviousWeeklyLeaderboardFragment<wrh> {
    public final otk r = new otk(duf.a.getOrCreateKotlinClass(WeeklyChallengeViewModel.class), new t6f(this, 0), new t6f(this, 2), new t6f(this, 1));

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return wrh.b(getLayoutInflater(), null, false);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "PreviousWeekTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        ((wrh) krkVar).b.setContent(new tc3(179631250, new s6f(this, 0), true));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        WeeklyChallengeViewModel weeklyChallengeViewModel = (WeeklyChallengeViewModel) this.r.getValue();
        iz2 z = un0.z(weeklyChallengeViewModel);
        hs4 hs4Var = z45.a;
        xw3.L(z, hq4.c, null, new g4l(weeklyChallengeViewModel, null), 2);
    }
}
