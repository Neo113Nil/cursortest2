package com.vk.superapp.miniapps.impl;

import com.vk.superapp.miniapps.impl.b;
import xsna.dcn;
import xsna.sq9;

/* compiled from: AppsCatalogBadgesQueueProvider.kt */
/* loaded from: classes6.dex */
public final class c implements dcn {
    public final /* synthetic */ sq9 b;

    public c(sq9 sq9Var) {
        this.b = sq9Var;
    }

    @Override // xsna.dcn
    public final void dismiss() {
        b.C1886b c1886b = b.b;
        sq9 sq9Var = this.b;
        synchronized (c1886b) {
            sq9Var.cancel();
        }
    }
}
