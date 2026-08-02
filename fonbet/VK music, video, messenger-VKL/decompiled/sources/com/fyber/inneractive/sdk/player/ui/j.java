package com.fyber.inneractive.sdk.player.ui;

import com.fyber.inneractive.sdk.player.controller.z;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.u1;

/* loaded from: classes12.dex */
public final class j implements u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public j(l lVar, int i) {
        this.b = lVar;
        this.a = i;
    }

    @Override // com.fyber.inneractive.sdk.util.u1
    public final void a() {
        if (this.b.h) {
            IAlog.a("Autoclick is aborted - app in background", new Object[0]);
        } else {
            IAlog.a("Autoclick is triggered", new Object[0]);
            ((z) this.b.g).a(this.a, l.J);
        }
        this.b.p();
    }
}
