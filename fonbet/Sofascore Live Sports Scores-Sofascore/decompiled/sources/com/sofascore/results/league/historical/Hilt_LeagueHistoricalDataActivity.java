package com.sofascore.results.league.historical;

import com.sofascore.results.mvvm.base.AbstractActivity;
import defpackage.ab0;
import defpackage.gc4;
import defpackage.p1f;
import defpackage.pxa;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class Hilt_LeagueHistoricalDataActivity extends AbstractActivity {
    public boolean J = false;

    public Hilt_LeagueHistoricalDataActivity() {
        addOnContextAvailableListener(new ab0(this, 19));
    }

    @Override // com.sofascore.results.base.Hilt_BaseActivity
    public final void q() {
        if (this.J) {
            return;
        }
        this.J = true;
        ((LeagueHistoricalDataActivity) this).B = (p1f) ((gc4) ((pxa) f())).a.M0.get();
    }
}
