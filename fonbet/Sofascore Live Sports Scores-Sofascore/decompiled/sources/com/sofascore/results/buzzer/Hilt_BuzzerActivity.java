package com.sofascore.results.buzzer;

import com.sofascore.results.mvvm.base.AbstractActivity;
import defpackage.ab0;
import defpackage.gc4;
import defpackage.n82;
import defpackage.p1f;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class Hilt_BuzzerActivity extends AbstractActivity {
    public boolean J = false;

    public Hilt_BuzzerActivity() {
        addOnContextAvailableListener(new ab0(this, 4));
    }

    @Override // com.sofascore.results.base.Hilt_BaseActivity
    public final void q() {
        if (this.J) {
            return;
        }
        this.J = true;
        ((BuzzerActivity) this).B = (p1f) ((gc4) ((n82) f())).a.M0.get();
    }
}
