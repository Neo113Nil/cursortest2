package com.sofascore.results.fantasy.league;

import com.sofascore.results.mvvm.base.AbstractActivity;
import defpackage.ab0;
import defpackage.gc4;
import defpackage.m37;
import defpackage.p1f;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class Hilt_FantasyLeagueActivity extends AbstractActivity {
    public boolean J = false;

    public Hilt_FantasyLeagueActivity() {
        addOnContextAvailableListener(new ab0(this, 11));
    }

    @Override // com.sofascore.results.base.Hilt_BaseActivity
    public final void q() {
        if (this.J) {
            return;
        }
        this.J = true;
        ((FantasyLeagueActivity) this).B = (p1f) ((gc4) ((m37) f())).a.M0.get();
    }
}
