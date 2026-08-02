package com.sofascore.results.fantasy.competition.articles;

import com.sofascore.results.mvvm.base.AbstractActivity;
import defpackage.ab0;
import defpackage.gc4;
import defpackage.l87;
import defpackage.p1f;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class Hilt_FantasyNewsArticlesActivity extends AbstractActivity {
    public boolean J = false;

    public Hilt_FantasyNewsArticlesActivity() {
        addOnContextAvailableListener(new ab0(this, 13));
    }

    @Override // com.sofascore.results.base.Hilt_BaseActivity
    public final void q() {
        if (this.J) {
            return;
        }
        this.J = true;
        ((FantasyNewsArticlesActivity) this).B = (p1f) ((gc4) ((l87) f())).a.M0.get();
    }
}
