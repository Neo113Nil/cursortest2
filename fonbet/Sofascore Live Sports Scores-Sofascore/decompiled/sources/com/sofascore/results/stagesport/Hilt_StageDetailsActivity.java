package com.sofascore.results.stagesport;

import com.sofascore.results.mvvm.base.CollapsibleToolbarActivity;
import defpackage.cb9;
import defpackage.gc4;
import defpackage.p1f;
import defpackage.q2i;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class Hilt_StageDetailsActivity extends CollapsibleToolbarActivity {
    public boolean L = false;

    public Hilt_StageDetailsActivity() {
        addOnContextAvailableListener(new cb9(this, 10));
    }

    @Override // com.sofascore.results.base.Hilt_BaseActivity
    public final void q() {
        if (this.L) {
            return;
        }
        this.L = true;
        ((StageDetailsActivity) this).B = (p1f) ((gc4) ((q2i) f())).a.M0.get();
    }
}
