package com.sofascore.results.settings.deleteAccount;

import com.sofascore.results.mvvm.base.AbstractActivity;
import defpackage.ab0;
import defpackage.bfk;
import defpackage.gc4;
import defpackage.mc4;
import defpackage.p1f;
import defpackage.vw4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class Hilt_DeleteAccountActivity extends AbstractActivity {
    public boolean J = false;

    public Hilt_DeleteAccountActivity() {
        addOnContextAvailableListener(new ab0(this, 6));
    }

    @Override // com.sofascore.results.base.Hilt_BaseActivity
    public final void q() {
        if (this.J) {
            return;
        }
        this.J = true;
        vw4 vw4Var = (vw4) f();
        DeleteAccountActivity deleteAccountActivity = (DeleteAccountActivity) this;
        mc4 mc4Var = ((gc4) vw4Var).a;
        deleteAccountActivity.B = (p1f) mc4Var.M0.get();
        deleteAccountActivity.K = (bfk) mc4Var.k.get();
    }
}
