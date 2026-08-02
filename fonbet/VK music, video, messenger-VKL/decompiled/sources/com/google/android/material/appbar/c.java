package com.google.android.material.appbar;

import android.view.View;
import xsna.iut0;

/* compiled from: NonBouncedAppBarLayout.java */
/* loaded from: classes13.dex */
public final class c implements Runnable {
    public final /* synthetic */ View b;

    public c(View view) {
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iut0.u(this.b);
    }
}
