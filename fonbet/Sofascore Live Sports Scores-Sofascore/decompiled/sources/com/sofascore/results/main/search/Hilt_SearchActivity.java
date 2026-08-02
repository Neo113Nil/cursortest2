package com.sofascore.results.main.search;

import com.sofascore.results.mvvm.base.AbstractActivity;
import defpackage.cb9;
import defpackage.dwg;
import defpackage.gc4;
import defpackage.p1f;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class Hilt_SearchActivity extends AbstractActivity {
    public boolean J = false;

    public Hilt_SearchActivity() {
        addOnContextAvailableListener(new cb9(this, 6));
    }

    @Override // com.sofascore.results.base.Hilt_BaseActivity
    public final void q() {
        if (this.J) {
            return;
        }
        this.J = true;
        ((SearchActivity) this).B = (p1f) ((gc4) ((dwg) f())).a.M0.get();
    }
}
