package com.inmobi.media;

import android.view.ViewTreeObserver;
import com.inmobi.ads.InMobiAudio;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.c9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3337c9 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ InMobiAudio a;

    public ViewTreeObserverOnGlobalLayoutListenerC3337c9(InMobiAudio inMobiAudio) {
        this.a = inMobiAudio;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        try {
            this.a.f = N3.b(r0.getMeasuredWidth() / R5.b());
            this.a.g = N3.b(r0.getMeasuredHeight() / R5.b());
            if (InMobiAudio.access$hasValidSize(this.a)) {
                this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        } catch (Exception e) {
            Xb.a((byte) 1, "InMobiAudio", "InMobiAudio$1.onGlobalLayout() handler threw unexpected error");
            e.getMessage();
        }
    }
}
