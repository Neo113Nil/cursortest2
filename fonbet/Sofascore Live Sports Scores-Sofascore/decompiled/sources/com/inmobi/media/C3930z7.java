package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.inmobi.ads.rendering.InMobiAdActivity;
import defpackage.a0n;
import defpackage.iol;
import defpackage.w1l;
import defpackage.wzb;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.z7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3930z7 {
    public final RelativeLayout a;
    public Tf b;
    public float c;
    public boolean d;
    public final WeakReference e;
    public final GestureDetectorOnGestureListenerC3889xi f;
    public final RelativeLayout g;
    public boolean h;

    public C3930z7(WeakReference weakReference, GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, RelativeLayout relativeLayout) {
        weakReference.getClass();
        gestureDetectorOnGestureListenerC3889xi.getClass();
        relativeLayout.getClass();
        relativeLayout.getClass();
        this.a = relativeLayout;
        this.b = Uf.a(R5.g());
        this.c = 1.0f;
        this.e = weakReference;
        this.f = gestureDetectorOnGestureListenerC3889xi;
        this.g = relativeLayout;
    }

    public final void a() {
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.f;
        if (gestureDetectorOnGestureListenerC3889xi == null) {
            gestureDetectorOnGestureListenerC3889xi = null;
        }
        if (gestureDetectorOnGestureListenerC3889xi == null) {
            return;
        }
        gestureDetectorOnGestureListenerC3889xi.getWebViewFactory().a(new a0n(12));
        if (gestureDetectorOnGestureListenerC3889xi.L) {
            return;
        }
        try {
            gestureDetectorOnGestureListenerC3889xi.n();
        } catch (Exception e) {
            e.getMessage();
            Xb.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
        }
    }

    public final void b() {
        Activity activity = (Activity) this.e.get();
        boolean z = !(activity instanceof InMobiAdActivity) ? false : ((InMobiAdActivity) activity).e;
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.f;
        if (z) {
            try {
                B fullScreenEventsListener = gestureDetectorOnGestureListenerC3889xi.getFullScreenEventsListener();
                if (fullScreenEventsListener != null) {
                    C3708qi c3708qi = (C3708qi) fullScreenEventsListener;
                    InterfaceC3880x9 interfaceC3880x9 = c3708qi.a.i;
                    if (interfaceC3880x9 != null) {
                        String str = GestureDetectorOnGestureListenerC3889xi.i1;
                        str.getClass();
                        ((C3906y9) interfaceC3880x9).a(str, com.ironsource.Wf.m);
                    }
                    if ("Default".equals(c3708qi.a.getViewState())) {
                        c3708qi.a.setAndUpdateViewState("Hidden");
                    }
                    c3708qi.a.W();
                    Unit unit = Unit.a;
                }
            } catch (Exception e) {
                e.getMessage();
                Xb.a((byte) 2, "InMobi", "SDK encountered unexpected error while finishing fullscreen view");
                Unit unit2 = Unit.a;
            }
        } else {
            gestureDetectorOnGestureListenerC3889xi.getClass();
            gestureDetectorOnGestureListenerC3889xi.setFullScreenActivityContext(null);
            try {
                gestureDetectorOnGestureListenerC3889xi.n();
            } catch (Exception e2) {
                e2.getMessage();
                Xb.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
            }
            SparseArray sparseArray = InMobiAdActivity.t;
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2 = this.f;
            gestureDetectorOnGestureListenerC3889xi2.getClass();
            InMobiAdActivity.t.remove(gestureDetectorOnGestureListenerC3889xi2.hashCode());
        }
        this.f.b();
    }

    public final void c() {
        Q5 q5;
        RelativeLayout.LayoutParams layoutParams;
        if (this.c == 1.0f) {
            this.a.setLayoutParams(w1l.c(-1, -1, 10));
            return;
        }
        if (this.d) {
            T5 t5 = R5.a;
            Context context = this.a.getContext();
            context.getClass();
            q5 = R5.b(context);
        } else {
            T5 t52 = R5.a;
            Context context2 = this.a.getContext();
            context2.getClass();
            context2.getClass();
            Display a = R5.a(context2);
            if (a == null) {
                q5 = R5.b;
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                a.getMetrics(displayMetrics);
                q5 = new Q5(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
        }
        int i = q5.a;
        Objects.toString(this.b);
        if (Uf.b(this.b)) {
            layoutParams = new RelativeLayout.LayoutParams(wzb.b(q5.a * this.c), -1);
            layoutParams.addRule(9);
        } else {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, wzb.b(q5.b * this.c));
            layoutParams2.addRule(10);
            layoutParams = layoutParams2;
        }
        this.a.setLayoutParams(layoutParams);
    }

    public final void d() {
        this.g.setBackgroundColor(0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        AbstractC3429fo viewableAd = this.f.getViewableAd();
        View c = viewableAd != null ? viewableAd.c() : null;
        if (c != null) {
            ViewParent parent = c.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(c);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this.g.getContext());
            relativeLayout.addView(c, new RelativeLayout.LayoutParams(-1, -1));
            this.g.addView(relativeLayout, layoutParams);
            this.f.a(relativeLayout);
        }
    }

    public final void e() {
        if (1 == this.f.getPlacementType()) {
            try {
                HashMap hashMap = new HashMap();
                AbstractC3429fo viewableAd = this.f.getViewableAd();
                if (viewableAd != null) {
                    viewableAd.a(hashMap);
                }
            } catch (Exception e) {
                e.getMessage();
                B fullScreenEventsListener = this.f.getFullScreenEventsListener();
                if (fullScreenEventsListener != null) {
                    ((C3708qi) fullScreenEventsListener).a();
                }
            }
        }
    }

    public final void a(Tf tf) {
        tf.getClass();
        this.b = tf;
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.f;
        gestureDetectorOnGestureListenerC3889xi.getClass();
        gestureDetectorOnGestureListenerC3889xi.getWebViewFactory().a(new iol(tf, 21));
    }

    public static final Unit a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        gestureDetectorOnGestureListenerC3889xi.r();
        return Unit.a;
    }

    public static final Unit a(Tf tf, GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        gestureDetectorOnGestureListenerC3889xi.b(tf);
        return Unit.a;
    }
}
