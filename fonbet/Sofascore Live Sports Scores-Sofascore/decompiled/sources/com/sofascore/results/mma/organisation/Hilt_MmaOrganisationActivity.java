package com.sofascore.results.mma.organisation;

import com.sofascore.results.mvvm.base.CollapsibleToolbarActivity;
import defpackage.ab0;
import defpackage.gc4;
import defpackage.gpc;
import defpackage.p1f;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class Hilt_MmaOrganisationActivity extends CollapsibleToolbarActivity {
    public boolean L = false;

    public Hilt_MmaOrganisationActivity() {
        addOnContextAvailableListener(new ab0(this, 25));
    }

    @Override // com.sofascore.results.base.Hilt_BaseActivity
    public final void q() {
        if (this.L) {
            return;
        }
        this.L = true;
        ((MmaOrganisationActivity) this).B = (p1f) ((gc4) ((gpc) f())).a.M0.get();
    }
}
