package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.unity3d.ads.BuildConfig;
import defpackage.joa;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.wi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3863wi extends To {
    public final /* synthetic */ GestureDetectorOnGestureListenerC3889xi a;

    public C3863wi(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        this.a = gestureDetectorOnGestureListenerC3889xi;
    }

    @Override // com.inmobi.media.To
    public final void a(Tf tf, Vo vo) {
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi;
        tf.getClass();
        vo.getClass();
        this.a.a(tf, vo);
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2 = this.a;
        gestureDetectorOnGestureListenerC3889xi2.getClass();
        vo.getClass();
        tf.getClass();
        Uo uo = (Uo) vo.a.get(tf);
        if (uo == null) {
            return;
        }
        if (uo.b == 0 && uo.c == 0) {
            return;
        }
        gestureDetectorOnGestureListenerC3889xi2.setCloseAssetArea(uo);
        joa joaVar = Oi.a;
        if (Intrinsics.c(gestureDetectorOnGestureListenerC3889xi2.getRoute().b, BuildConfig.FLAVOR)) {
            gestureDetectorOnGestureListenerC3889xi = gestureDetectorOnGestureListenerC3889xi2;
        } else {
            Jo webViewFactory = gestureDetectorOnGestureListenerC3889xi2.getWebViewFactory();
            webViewFactory.getClass();
            gestureDetectorOnGestureListenerC3889xi = (GestureDetectorOnGestureListenerC3889xi) webViewFactory.b.get(BuildConfig.FLAVOR);
        }
        if (gestureDetectorOnGestureListenerC3889xi != null) {
            Uo uo2 = gestureDetectorOnGestureListenerC3889xi2.f1;
            uo2.getClass();
            View findViewById = gestureDetectorOnGestureListenerC3889xi.getRootView().findViewById(65532);
            C3720r5 c3720r5 = findViewById instanceof C3720r5 ? (C3720r5) findViewById : null;
            if (c3720r5 == null) {
                return;
            }
            View findViewById2 = gestureDetectorOnGestureListenerC3889xi.getRootView().findViewById(65531);
            C3720r5 c3720r52 = findViewById2 instanceof C3720r5 ? (C3720r5) findViewById2 : null;
            if (c3720r52 == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = c3720r5.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = c3720r52.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 == null) {
                return;
            }
            layoutParams2.setMargins(0, uo2.b, uo2.c, 0);
            layoutParams4.setMargins(0, uo2.b, uo2.c, 0);
        }
    }

    @Override // com.inmobi.media.To
    public final boolean a() {
        return !"Hidden".equals(this.a.getViewState());
    }
}
