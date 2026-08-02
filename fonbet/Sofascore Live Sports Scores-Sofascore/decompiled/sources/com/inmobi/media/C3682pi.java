package com.inmobi.media;

import defpackage.ljg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.pi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3682pi {
    public final /* synthetic */ GestureDetectorOnGestureListenerC3889xi a;

    public C3682pi(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        this.a = gestureDetectorOnGestureListenerC3889xi;
    }

    public final void a(C3516j8 c3516j8) {
        c3516j8.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.a.i;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).b("HtmlVideoPlayer", ljg.j(c3516j8.b, "onVideoLoadFailed "));
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        EnumC3879x8 enumC3879x8 = EnumC3879x8.VIDEO_PLAYBACK_ERROR;
        c3516j8.getClass();
        gestureDetectorOnGestureListenerC3889xi.a(enumC3879x8, AbstractC3907ya.a(c3516j8, c3516j8.getClass()));
    }
}
