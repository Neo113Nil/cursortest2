package com.playtika.pras.e;

import android.widget.ScrollView;

/* loaded from: classes4.dex */
public final class c implements Runnable {
    public final /* synthetic */ ScrollView a;
    public final /* synthetic */ int b;

    public c(ScrollView scrollView, int i) {
        this.a = scrollView;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.smoothScrollTo(0, this.b / 2);
    }
}
