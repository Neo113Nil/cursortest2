package com.inmobi.media;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.qi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3708qi implements B {
    public final /* synthetic */ GestureDetectorOnGestureListenerC3889xi a;

    public C3708qi(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        this.a = gestureDetectorOnGestureListenerC3889xi;
    }

    public final void a() {
        InterfaceC3880x9 interfaceC3880x9 = this.a.i;
        if (interfaceC3880x9 != null) {
            String str = GestureDetectorOnGestureListenerC3889xi.i1;
            str.getClass();
            ((C3906y9) interfaceC3880x9).a(str, "onAdScreenDisplayFailed");
        }
        this.a.getListener().c();
    }

    public final void b() {
        InterfaceC3880x9 interfaceC3880x9 = this.a.i;
        if (interfaceC3880x9 != null) {
            String str = GestureDetectorOnGestureListenerC3889xi.i1;
            str.getClass();
            ((C3906y9) interfaceC3880x9).a(str, "onAdScreenDisplayed");
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        if (gestureDetectorOnGestureListenerC3889xi.b == 0) {
            gestureDetectorOnGestureListenerC3889xi.Q = false;
        }
        gestureDetectorOnGestureListenerC3889xi.getListener().f(this.a);
    }
}
