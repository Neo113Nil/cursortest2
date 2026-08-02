package com.inmobi.media;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.unity3d.ads.BuildConfig;
import defpackage.cd5;
import kotlin.Pair;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class G3 {
    public final GestureDetectorOnGestureListenerC3889xi a;
    public final boolean b;
    public final boolean c;
    public final InterfaceC3880x9 d;

    public G3(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, boolean z, boolean z2, InterfaceC3880x9 interfaceC3880x9) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        this.a = gestureDetectorOnGestureListenerC3889xi;
        this.b = z;
        this.c = z2;
        this.d = interfaceC3880x9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00a7, code lost:
    
        if (r2 == null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(G3 g3, ViewGroup viewGroup, Uo uo) {
        Unit unit;
        AbstractC3429fo viewableAd;
        AbstractC3429fo viewableAd2;
        Pair a = g3.a();
        View.OnClickListener onClickListener = (View.OnClickListener) a.a;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) a.b;
        Unit unit2 = null;
        if (g3.b) {
            View findViewById = viewGroup != null ? viewGroup.findViewById(65532) : null;
            if (findViewById != null) {
                InterfaceC3880x9 interfaceC3880x9 = g3.d;
                if (interfaceC3880x9 != null) {
                    ((C3906y9) interfaceC3880x9).c("CloseButtonHandler", "Close button already present, not adding again");
                }
                g3.a(findViewById);
            } else {
                Context context = g3.a.getContext();
                context.getClass();
                View c3720r5 = new C3720r5(context, (byte) 0, g3.d);
                c3720r5.setId(65532);
                F5.a.getClass();
                if (F5.x()) {
                    c3720r5.setElevation(1.7014117E38f);
                }
                c3720r5.setOnClickListener(onClickListener);
                g3.a(c3720r5);
                if (viewGroup != null) {
                    viewGroup.addView(c3720r5, layoutParams);
                }
                layoutParams.setMargins(0, uo.b, uo.c, 0);
            }
        } else {
            View findViewById2 = g3.a.getRootView().findViewById(65532);
            if (findViewById2 != null) {
                Jo webViewFactory = g3.a.getWebViewFactory();
                webViewFactory.getClass();
                GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = (GestureDetectorOnGestureListenerC3889xi) webViewFactory.b.get(BuildConfig.FLAVOR);
                if (gestureDetectorOnGestureListenerC3889xi != null && (viewableAd = gestureDetectorOnGestureListenerC3889xi.getViewableAd()) != null) {
                    viewableAd.a(findViewById2);
                }
                ViewParent parent = findViewById2.getParent();
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(findViewById2);
                    unit = Unit.a;
                } else {
                    unit = null;
                }
            }
            InterfaceC3880x9 interfaceC3880x92 = g3.d;
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).c("CloseButtonHandler", "Close button not present, not removing");
                Unit unit3 = Unit.a;
            }
        }
        if (g3.c) {
            View findViewById3 = viewGroup != null ? viewGroup.findViewById(65531) : null;
            if (findViewById3 != null) {
                InterfaceC3880x9 interfaceC3880x93 = g3.d;
                if (interfaceC3880x93 != null) {
                    ((C3906y9) interfaceC3880x93).c("CloseButtonHandler", "Close region already present, not adding again");
                }
                g3.a(findViewById3);
                return;
            }
            Context context2 = g3.a.getContext();
            context2.getClass();
            View c3720r52 = new C3720r5(context2, (byte) 1, g3.d);
            c3720r52.setId(65531);
            F5.a.getClass();
            if (F5.x()) {
                c3720r52.setElevation(1.7014117E38f);
            }
            c3720r52.setOnClickListener(onClickListener);
            g3.a(c3720r52);
            if (viewGroup != null) {
                viewGroup.addView(c3720r52, layoutParams);
            }
            layoutParams.setMargins(0, uo.b, uo.c, 0);
            return;
        }
        View findViewById4 = g3.a.getRootView().findViewById(65531);
        if (findViewById4 != null) {
            Jo webViewFactory2 = g3.a.getWebViewFactory();
            webViewFactory2.getClass();
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2 = (GestureDetectorOnGestureListenerC3889xi) webViewFactory2.b.get(BuildConfig.FLAVOR);
            if (gestureDetectorOnGestureListenerC3889xi2 != null && (viewableAd2 = gestureDetectorOnGestureListenerC3889xi2.getViewableAd()) != null) {
                viewableAd2.a(findViewById4);
            }
            ViewParent parent2 = findViewById4.getParent();
            ViewGroup viewGroup3 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup3 != null) {
                viewGroup3.removeView(findViewById4);
                unit2 = Unit.a;
            }
            if (unit2 != null) {
                return;
            }
        }
        InterfaceC3880x9 interfaceC3880x94 = g3.d;
        if (interfaceC3880x94 != null) {
            ((C3906y9) interfaceC3880x94).c("CloseButtonHandler", "Close region not present, not removing");
            Unit unit4 = Unit.a;
        }
    }

    public final void a(Uo uo) {
        ViewGroup viewGroup;
        Handler handler;
        uo.getClass();
        if (!(this.a.getContainerContext() instanceof InMobiAdActivity) || (viewGroup = (ViewGroup) this.a.getRootView().findViewById(65534)) == null || (handler = viewGroup.getHandler()) == null) {
            return;
        }
        handler.post(new defpackage.p3(23, this, viewGroup, uo));
    }

    public final void a(View view) {
        AbstractC3429fo viewableAd;
        Jo webViewFactory = this.a.getWebViewFactory();
        webViewFactory.getClass();
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = (GestureDetectorOnGestureListenerC3889xi) webViewFactory.b.get(BuildConfig.FLAVOR);
        if (gestureDetectorOnGestureListenerC3889xi == null || (viewableAd = gestureDetectorOnGestureListenerC3889xi.getViewableAd()) == null) {
            return;
        }
        viewableAd.a(view, FriendlyObstructionPurpose.CLOSE_AD);
    }

    public final Pair a() {
        float f = R5.d().c;
        cd5 cd5Var = new cd5(this, 10);
        int i = (int) (50.0f * f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        layoutParams.addRule(11);
        return new Pair(cd5Var, layoutParams);
    }

    public static final void a(G3 g3, View view) {
        try {
            g3.a.n();
        } catch (Exception e) {
            e.getMessage();
            Xb.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
        }
    }
}
