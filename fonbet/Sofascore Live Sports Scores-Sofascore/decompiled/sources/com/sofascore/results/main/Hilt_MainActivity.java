package com.sofascore.results.main;

import com.sofascore.results.mvvm.base.AbstractActivity;
import defpackage.ab0;
import defpackage.gc4;
import defpackage.p1f;
import defpackage.pob;
import defpackage.rv7;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class Hilt_MainActivity extends AbstractActivity {
    public boolean J = false;

    public Hilt_MainActivity() {
        addOnContextAvailableListener(new ab0(this, 21));
    }

    @Override // com.sofascore.results.base.Hilt_BaseActivity
    public final void q() {
        if (this.J) {
            return;
        }
        this.J = true;
        pob pobVar = (pob) f();
        MainActivity mainActivity = (MainActivity) this;
        gc4 gc4Var = (gc4) pobVar;
        mainActivity.B = (p1f) gc4Var.a.M0.get();
        mainActivity.P = (rv7) gc4Var.d.get();
    }
}
