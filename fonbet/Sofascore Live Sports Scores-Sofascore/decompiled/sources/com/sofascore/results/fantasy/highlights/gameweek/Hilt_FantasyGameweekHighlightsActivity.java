package com.sofascore.results.fantasy.highlights.gameweek;

import com.sofascore.results.tutorial.AbstractTutorialActivity;
import defpackage.ab0;
import defpackage.gc4;
import defpackage.k07;
import defpackage.p1f;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class Hilt_FantasyGameweekHighlightsActivity extends AbstractTutorialActivity {
    public boolean S = false;

    public Hilt_FantasyGameweekHighlightsActivity() {
        addOnContextAvailableListener(new ab0(this, 10));
    }

    @Override // com.sofascore.results.base.Hilt_BaseActivity
    public final void q() {
        if (this.S) {
            return;
        }
        this.S = true;
        ((FantasyGameweekHighlightsActivity) this).B = (p1f) ((gc4) ((k07) f())).a.M0.get();
    }
}
