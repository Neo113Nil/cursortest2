package com.fyber.inneractive.sdk.activities;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
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
