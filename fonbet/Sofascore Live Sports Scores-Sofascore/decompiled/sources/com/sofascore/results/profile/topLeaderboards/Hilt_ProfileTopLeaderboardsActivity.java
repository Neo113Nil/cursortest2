package com.sofascore.results.profile.topLeaderboards;

import com.sofascore.results.mvvm.base.AbstractActivity;
import defpackage.cb9;
import defpackage.gc4;
import defpackage.lbf;
import defpackage.p1f;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class Hilt_ProfileTopLeaderboardsActivity extends AbstractActivity {
    public boolean J = false;

    public Hilt_ProfileTopLeaderboardsActivity() {
        addOnContextAvailableListener(new cb9(this, 2));
    }

    @Override // com.sofascore.results.base.Hilt_BaseActivity
    public final void q() {
        if (this.J) {
            return;
        }
        this.J = true;
        ((ProfileTopLeaderboardsActivity) this).B = (p1f) ((gc4) ((lbf) f())).a.M0.get();
    }
}
