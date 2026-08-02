package com.inmobi.media;

import com.inmobi.ads.controllers.PublisherCallbacks;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ge extends Mi implements InterfaceC3737rm, InterfaceC3323bl {
    public final Sc f;
    public final C3870x g;
    public final PublisherCallbacks h;
    public final Ej i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ge(Sc sc, C3870x c3870x, PublisherCallbacks publisherCallbacks, Ej ej) {
        super(sc, c3870x, publisherCallbacks, ej);
        sc.getClass();
        c3870x.getClass();
        publisherCallbacks.getClass();
        ej.getClass();
        this.f = sc;
        this.g = c3870x;
        this.h = publisherCallbacks;
        this.i = ej;
    }

    @Override // com.inmobi.media.InterfaceC3737rm
    public final void a(boolean z) {
        InterfaceC3880x9 l = l();
        if (l != null) {
            ((C3906y9) l).a("AUM-NativeRenderedState", com.appsflyer.internal.i.j("onAudioStateChanged ", z));
        }
        X4.a(k(), new C3807ue(this, z, null));
    }

    @Override // com.inmobi.media.InterfaceC3737rm
    public final void b() {
        InterfaceC3880x9 l = l();
        if (l != null) {
            ((C3906y9) l).a("AUM-NativeRenderedState", "onVideoPaused");
        }
        X4.a(k(), new C3885xe(this, null));
    }

    @Override // com.inmobi.media.InterfaceC3323bl
    public final void d() {
        InterfaceC3880x9 l = l();
        if (l != null) {
            ((C3906y9) l).a("AUM-NativeRenderedState", "unTrackViews - stopping view tracking");
        }
        this.i.a(new Le(this.f, this.g, this.h, this.i), this);
    }

    @Override // com.inmobi.media.InterfaceC3737rm
    public final void f() {
        InterfaceC3880x9 l = l();
        if (l != null) {
            ((C3906y9) l).a("AUM-NativeRenderedState", "onVideoStarted");
        }
        X4.a(k(), new C3937ze(this, null));
    }

    @Override // com.inmobi.media.InterfaceC3737rm
    public final void h() {
        InterfaceC3880x9 l = l();
        if (l != null) {
            ((C3906y9) l).a("AUM-NativeRenderedState", "onVideoCompleted");
        }
        X4.a(k(), new C3859we(this, null));
    }

    @Override // com.inmobi.media.InterfaceC3737rm
    public final void i() {
        InterfaceC3880x9 l = l();
        if (l != null) {
            ((C3906y9) l).a("AUM-NativeRenderedState", "onVideoResumed");
        }
        X4.a(k(), new C3911ye(this, null));
    }
}
