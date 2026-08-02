package com.sofascore.results.event;

import com.sofascore.results.mvvm.base.AbstractActivity;
import defpackage.ab0;
import defpackage.gc4;
import defpackage.mc4;
import defpackage.nr5;
import defpackage.p1f;
import defpackage.s5d;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class Hilt_EventActivity extends AbstractActivity {
    public boolean J = false;

    public Hilt_EventActivity() {
        addOnContextAvailableListener(new ab0(this, 7));
    }

    @Override // com.sofascore.results.base.Hilt_BaseActivity
    public final void q() {
        if (this.J) {
            return;
        }
        this.J = true;
        nr5 nr5Var = (nr5) f();
        EventActivity eventActivity = (EventActivity) this;
        mc4 mc4Var = ((gc4) nr5Var).a;
        eventActivity.B = (p1f) mc4Var.M0.get();
        eventActivity.N = (s5d) mc4Var.F0.get();
    }
}
