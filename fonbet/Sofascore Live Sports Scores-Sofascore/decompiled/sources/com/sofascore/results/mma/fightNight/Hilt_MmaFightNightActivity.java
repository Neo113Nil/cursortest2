package com.sofascore.results.mma.fightNight;

import com.sofascore.results.mvvm.base.CollapsibleToolbarActivity;
import defpackage.ab0;
import defpackage.gc4;
import defpackage.p1f;
import defpackage.smc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class Hilt_MmaFightNightActivity extends CollapsibleToolbarActivity {
    public boolean L = false;

    public Hilt_MmaFightNightActivity() {
        addOnContextAvailableListener(new ab0(this, 23));
    }

    @Override // com.sofascore.results.base.Hilt_BaseActivity
    public final void q() {
        if (this.L) {
            return;
        }
        this.L = true;
        ((MmaFightNightActivity) this).B = (p1f) ((gc4) ((smc) f())).a.M0.get();
    }
}
