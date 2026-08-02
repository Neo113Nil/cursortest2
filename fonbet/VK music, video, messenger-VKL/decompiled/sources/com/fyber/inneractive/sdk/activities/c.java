package com.fyber.inneractive.sdk.activities;

/* loaded from: classes12.dex */
public final class c implements Runnable {
    public final /* synthetic */ InneractiveFullscreenAdActivity a;

    public c(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.a = inneractiveFullscreenAdActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.isFinishing()) {
            return;
        }
        this.a.hideNavigationBar();
    }
}
