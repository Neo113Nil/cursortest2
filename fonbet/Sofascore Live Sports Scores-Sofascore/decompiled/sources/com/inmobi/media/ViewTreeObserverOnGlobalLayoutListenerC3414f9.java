package com.inmobi.media;

import android.view.ViewTreeObserver;
import com.inmobi.ads.InMobiBanner;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.f9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3414f9 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ InMobiBanner a;

    public ViewTreeObserverOnGlobalLayoutListenerC3414f9(InMobiBanner inMobiBanner) {
        this.a = inMobiBanner;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C3906y9 c3906y9;
        boolean c;
        boolean c2;
        try {
            c = this.a.c();
            if (!c) {
                InMobiBanner.access$captureStandardBannerSize(this.a, N3.b(r0.getMeasuredWidth() / R5.b()), N3.b(this.a.getMeasuredHeight() / R5.b()));
            }
            c2 = this.a.c();
            if (c2) {
                this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        } catch (Exception e) {
            C3485i2 mAdManager = this.a.getMAdManager();
            if (mAdManager == null || (c3906y9 = mAdManager.f) == null) {
                return;
            }
            String access$getTAG$cp = InMobiBanner.access$getTAG$cp();
            access$getTAG$cp.getClass();
            c3906y9.a(access$getTAG$cp, "InMobiBanner$1.onGlobalLayout() handler threw unexpected error: ", e);
        }
    }
}
