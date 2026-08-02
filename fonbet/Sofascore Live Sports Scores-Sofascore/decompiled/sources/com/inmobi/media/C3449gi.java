package com.inmobi.media;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.gi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3449gi implements InterfaceC3507j {
    public final /* synthetic */ GestureDetectorOnGestureListenerC3889xi a;

    public C3449gi(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        this.a = gestureDetectorOnGestureListenerC3889xi;
    }

    public final void a(Float f) {
        this.a.h("window.mraidview.broadcastEvent('audioVolumeChange', " + f + ");");
    }
}
