package com.fyber.inneractive.sdk.player.controller;

import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class d0 implements View.OnClickListener {
    public final /* synthetic */ f0 a;

    public d0(f0 f0Var) {
        this.a = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.b.dismiss();
        v vVar = this.a.a;
        vVar.b.d(vVar.a);
    }
}
