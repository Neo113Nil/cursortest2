package com.inmobi.media;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class X2 {
    public final /* synthetic */ Y2 a;

    public X2(Y2 y2) {
        this.a = y2;
    }

    public final void a(boolean z) {
        C3500ii c3500ii;
        if (z && (c3500ii = (C3500ii) this.a.i.get()) != null) {
            GestureDetectorOnGestureListenerC3889xi.g1.getClass();
            c3500ii.a(C3372di.a("IN_NATIVE_BROWSER", "onInteraction"));
        }
        C3500ii c3500ii2 = (C3500ii) this.a.i.get();
        if (c3500ii2 != null) {
            GestureDetectorOnGestureListenerC3889xi.g1.getClass();
            c3500ii2.a(C3372di.a("IN_NATIVE_BROWSER", "onClose"));
        }
    }
}
