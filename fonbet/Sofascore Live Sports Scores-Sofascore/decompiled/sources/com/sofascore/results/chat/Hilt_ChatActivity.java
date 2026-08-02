package com.sofascore.results.chat;

import com.sofascore.results.mvvm.base.AbstractActivity;
import defpackage.ab0;
import defpackage.gc4;
import defpackage.mc4;
import defpackage.p1f;
import defpackage.qq2;
import defpackage.s5d;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class Hilt_ChatActivity extends AbstractActivity {
    public boolean J = false;

    public Hilt_ChatActivity() {
        addOnContextAvailableListener(new ab0(this, 5));
    }

    @Override // com.sofascore.results.base.Hilt_BaseActivity
    public final void q() {
        if (this.J) {
            return;
        }
        this.J = true;
        qq2 qq2Var = (qq2) f();
        ChatActivity chatActivity = (ChatActivity) this;
        mc4 mc4Var = ((gc4) qq2Var).a;
        chatActivity.B = (p1f) mc4Var.M0.get();
        chatActivity.R = (s5d) mc4Var.F0.get();
    }
}
