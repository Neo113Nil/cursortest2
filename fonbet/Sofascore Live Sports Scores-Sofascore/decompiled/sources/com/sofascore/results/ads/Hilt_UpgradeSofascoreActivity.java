package com.sofascore.results.ads;

import com.sofascore.results.mvvm.base.AbstractActivity;
import defpackage.cb9;
import defpackage.gc4;
import defpackage.p1f;
import defpackage.rdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class Hilt_UpgradeSofascoreActivity extends AbstractActivity {
    public boolean J = false;

    public Hilt_UpgradeSofascoreActivity() {
        addOnContextAvailableListener(new cb9(this, 17));
    }

    @Override // com.sofascore.results.base.Hilt_BaseActivity
    public final void q() {
        if (this.J) {
            return;
        }
        this.J = true;
        ((UpgradeSofascoreActivity) this).B = (p1f) ((gc4) ((rdk) f())).a.M0.get();
    }
}
