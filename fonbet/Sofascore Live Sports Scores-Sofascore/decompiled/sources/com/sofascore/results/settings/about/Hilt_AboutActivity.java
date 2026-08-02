package com.sofascore.results.settings.about;

import com.sofascore.results.base.BaseActivity;
import defpackage.ab0;
import defpackage.bfk;
import defpackage.gc4;
import defpackage.mc4;
import defpackage.n0;
import defpackage.p1f;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class Hilt_AboutActivity extends BaseActivity {
    public boolean I = false;

    public Hilt_AboutActivity() {
        addOnContextAvailableListener(new ab0(this, 1));
    }

    @Override // com.sofascore.results.base.Hilt_BaseActivity
    public final void q() {
        if (this.I) {
            return;
        }
        this.I = true;
        n0 n0Var = (n0) f();
        AboutActivity aboutActivity = (AboutActivity) this;
        mc4 mc4Var = ((gc4) n0Var).a;
        aboutActivity.B = (p1f) mc4Var.M0.get();
        aboutActivity.N = (bfk) mc4Var.k.get();
    }
}
