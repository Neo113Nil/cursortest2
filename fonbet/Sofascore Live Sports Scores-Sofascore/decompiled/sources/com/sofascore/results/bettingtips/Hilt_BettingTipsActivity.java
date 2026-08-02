package com.sofascore.results.bettingtips;

import com.sofascore.results.mvvm.base.AbstractActivity;
import defpackage.ab0;
import defpackage.gc4;
import defpackage.p1f;
import defpackage.xu1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class Hilt_BettingTipsActivity extends AbstractActivity {
    public boolean J = false;

    public Hilt_BettingTipsActivity() {
        addOnContextAvailableListener(new ab0(this, 3));
    }

    @Override // com.sofascore.results.base.Hilt_BaseActivity
    public final void q() {
        if (this.J) {
            return;
        }
        this.J = true;
        ((BettingTipsActivity) this).B = (p1f) ((gc4) ((xu1) f())).a.M0.get();
    }
}
