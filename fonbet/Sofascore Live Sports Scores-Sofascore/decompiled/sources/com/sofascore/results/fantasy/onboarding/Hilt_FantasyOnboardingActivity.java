package com.sofascore.results.fantasy.onboarding;

import com.sofascore.results.mvvm.base.AbstractActivity;
import defpackage.ab0;
import defpackage.bfk;
import defpackage.gc4;
import defpackage.mc4;
import defpackage.p1f;
import defpackage.q87;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class Hilt_FantasyOnboardingActivity extends AbstractActivity {
    public boolean J = false;

    public Hilt_FantasyOnboardingActivity() {
        addOnContextAvailableListener(new ab0(this, 14));
    }

    @Override // com.sofascore.results.base.Hilt_BaseActivity
    public final void q() {
        if (this.J) {
            return;
        }
        this.J = true;
        q87 q87Var = (q87) f();
        FantasyOnboardingActivity fantasyOnboardingActivity = (FantasyOnboardingActivity) this;
        mc4 mc4Var = ((gc4) q87Var).a;
        fantasyOnboardingActivity.B = (p1f) mc4Var.M0.get();
        fantasyOnboardingActivity.K = (bfk) mc4Var.k.get();
    }
}
