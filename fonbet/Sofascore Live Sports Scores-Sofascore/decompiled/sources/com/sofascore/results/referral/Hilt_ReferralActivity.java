package com.sofascore.results.referral;

import com.sofascore.results.mvvm.base.AbstractActivity;
import defpackage.cb9;
import defpackage.gc4;
import defpackage.mc4;
import defpackage.p1f;
import defpackage.ptf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class Hilt_ReferralActivity extends AbstractActivity {
    public boolean J = false;

    public Hilt_ReferralActivity() {
        addOnContextAvailableListener(new cb9(this, 5));
    }

    @Override // com.sofascore.results.base.Hilt_BaseActivity
    public final void q() {
        if (this.J) {
            return;
        }
        this.J = true;
        mc4 mc4Var = ((gc4) ((ptf) f())).a;
        ((ReferralActivity) this).B = (p1f) mc4Var.M0.get();
    }
}
