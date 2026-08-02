package com.sofascore.results.referee;

import com.sofascore.results.mvvm.base.CollapsibleToolbarActivity;
import defpackage.cb9;
import defpackage.gc4;
import defpackage.ksf;
import defpackage.p1f;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class Hilt_RefereeActivity extends CollapsibleToolbarActivity {
    public boolean L = false;

    public Hilt_RefereeActivity() {
        addOnContextAvailableListener(new cb9(this, 4));
    }

    @Override // com.sofascore.results.base.Hilt_BaseActivity
    public final void q() {
        if (this.L) {
            return;
        }
        this.L = true;
        ((RefereeActivity) this).B = (p1f) ((gc4) ((ksf) f())).a.M0.get();
    }
}
