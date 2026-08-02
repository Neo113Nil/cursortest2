package com.sofascore.results.profile;

import com.sofascore.results.base.BaseActivity;
import defpackage.ab0;
import defpackage.gc4;
import defpackage.ljb;
import defpackage.mc4;
import defpackage.p1f;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class Hilt_LoginScreenActivity extends BaseActivity {
    public boolean I = false;

    public Hilt_LoginScreenActivity() {
        addOnContextAvailableListener(new ab0(this, 20));
    }

    @Override // com.sofascore.results.base.Hilt_BaseActivity
    public final void q() {
        if (this.I) {
            return;
        }
        this.I = true;
        mc4 mc4Var = ((gc4) ((ljb) f())).a;
        ((LoginScreenActivity) this).B = (p1f) mc4Var.M0.get();
    }
}
