package com.inmobi.media;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.dmi;
import defpackage.ljg;
import defpackage.ti5;
import defpackage.ui5;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ei extends AbstractC3941zi {
    public final /* synthetic */ Fi a;
    public final /* synthetic */ Jo b;
    public final /* synthetic */ Yi c;

    public Ei(Fi fi, Jo jo, Yi yi) {
        this.a = fi;
        this.b = jo;
        this.c = yi;
    }

    public static final void a(Jo jo, Yi yi, Fi fi, GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        String str = yi.a;
        jo.getClass();
        str.getClass();
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2 = (GestureDetectorOnGestureListenerC3889xi) jo.b.get(str);
        if (gestureDetectorOnGestureListenerC3889xi2 == null) {
            InterfaceC3880x9 logger = fi.getLogger();
            if (logger != null) {
                ((C3906y9) logger).b(fi.m1, dmi.q("Source RenderView not found for id: ", yi.a));
                return;
            }
            return;
        }
        Integer a = gestureDetectorOnGestureListenerC3889xi.getWvStateMachine().a(3);
        if (a != null) {
            int intValue = a.intValue();
            InterfaceC3880x9 logger2 = fi.getLogger();
            if (logger2 != null) {
                ((C3906y9) logger2).b(fi.m1, ljg.j(intValue, "Failed to transition to FIRE_AD_FAILED state: "));
            }
            gestureDetectorOnGestureListenerC3889xi2.a("loadWebView", Oi.a(gestureDetectorOnGestureListenerC3889xi.getRoute().b, intValue));
        }
    }

    public static final void b(Jo jo, Yi yi, Fi fi, GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        String str = yi.a;
        jo.getClass();
        str.getClass();
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2 = (GestureDetectorOnGestureListenerC3889xi) jo.b.get(str);
        if (gestureDetectorOnGestureListenerC3889xi2 == null) {
            InterfaceC3880x9 logger = fi.getLogger();
            if (logger != null) {
                ((C3906y9) logger).b(fi.m1, dmi.q("Source RenderView not found for id: ", yi.a));
                return;
            }
            return;
        }
        Integer a = gestureDetectorOnGestureListenerC3889xi.getWvStateMachine().a(2);
        if (a == null) {
            fi.b(gestureDetectorOnGestureListenerC3889xi2, yi.b);
            return;
        }
        int intValue = a.intValue();
        InterfaceC3880x9 logger2 = fi.getLogger();
        if (logger2 != null) {
            ((C3906y9) logger2).b(fi.m1, ljg.j(intValue, "Failed to transition to FIRE_AD_READY state: "));
        }
        gestureDetectorOnGestureListenerC3889xi2.a("loadWebView", Oi.a(gestureDetectorOnGestureListenerC3889xi.getRoute().b, intValue));
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final void e(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        GestureDetectorOnGestureListenerC3889xi adRenderView;
        gestureDetectorOnGestureListenerC3889xi.getClass();
        adRenderView = this.a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().e(adRenderView);
        }
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final void f(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final void g(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final void h(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        ExecutorC3520jc executorC3520jc = (ExecutorC3520jc) AbstractC3851w6.e.getValue();
        ui5 ui5Var = new ui5(this.b, this.c, this.a, gestureDetectorOnGestureListenerC3889xi, 0);
        executorC3520jc.getClass();
        executorC3520jc.a.post(ui5Var);
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final void i(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final void j(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        GestureDetectorOnGestureListenerC3889xi adRenderView;
        gestureDetectorOnGestureListenerC3889xi.getClass();
        adRenderView = this.a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().j(adRenderView);
        }
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final void c() {
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final void a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, boolean z) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        ExecutorC3520jc executorC3520jc = (ExecutorC3520jc) AbstractC3851w6.e.getValue();
        ti5 ti5Var = new ti5(this.a, this.c, z);
        executorC3520jc.getClass();
        executorC3520jc.a.post(ti5Var);
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final void a(Fk fk) {
        GestureDetectorOnGestureListenerC3889xi adRenderView;
        AbstractC3941zi listener;
        fk.getClass();
        adRenderView = this.a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(fk);
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final void a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, String str) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        str.getClass();
        ExecutorC3520jc executorC3520jc = (ExecutorC3520jc) AbstractC3851w6.e.getValue();
        ui5 ui5Var = new ui5(this.b, this.c, this.a, gestureDetectorOnGestureListenerC3889xi, 1);
        executorC3520jc.getClass();
        executorC3520jc.a.post(ui5Var);
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final void b(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        GestureDetectorOnGestureListenerC3889xi adRenderView;
        gestureDetectorOnGestureListenerC3889xi.getClass();
        adRenderView = this.a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().b(adRenderView);
        }
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final void a(HashMap hashMap) {
        GestureDetectorOnGestureListenerC3889xi adRenderView;
        hashMap.getClass();
        adRenderView = this.a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.a(hashMap);
        }
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final void a(String str, HashMap hashMap) {
        GestureDetectorOnGestureListenerC3889xi adRenderView;
        AbstractC3941zi listener;
        str.getClass();
        hashMap.getClass();
        adRenderView = this.a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(str, hashMap);
    }

    @Override // com.inmobi.media.AbstractC3941zi, com.inmobi.media.InterfaceC3944zl
    public final void a() {
        GestureDetectorOnGestureListenerC3889xi adRenderView;
        AbstractC3941zi listener;
        adRenderView = this.a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a();
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final void a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, String str, Map map) {
        GestureDetectorOnGestureListenerC3889xi adRenderView;
        gestureDetectorOnGestureListenerC3889xi.getClass();
        str.getClass();
        map.getClass();
        adRenderView = this.a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().a(adRenderView, str, map);
        }
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final void a(Z1 z1) {
        GestureDetectorOnGestureListenerC3889xi adRenderView;
        AbstractC3941zi listener;
        z1.getClass();
        adRenderView = this.a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(z1);
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final void a(boolean z) {
        GestureDetectorOnGestureListenerC3889xi adRenderView;
        AbstractC3941zi listener;
        adRenderView = this.a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(z);
    }

    @Override // com.inmobi.media.AbstractC3941zi
    public final void a(String str) {
        GestureDetectorOnGestureListenerC3889xi adRenderView;
        AbstractC3941zi listener;
        str.getClass();
        adRenderView = this.a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(str);
    }

    public static final void a(Fi fi, Yi yi, boolean z) {
        GestureDetectorOnGestureListenerC3889xi adRenderView;
        if (fi.getWvStateMachine().a(4) != null) {
            fi.a("loadWebView", Oi.a(yi.b, Sdk.SDKError.Reason.AD_EXPIRED_ON_PLAY_VALUE));
        }
        adRenderView = fi.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().a(adRenderView, z);
        }
    }
}
