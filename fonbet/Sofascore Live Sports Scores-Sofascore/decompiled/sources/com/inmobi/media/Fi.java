package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.core.config.models.AdConfig;
import com.unity3d.ads.BuildConfig;
import defpackage.dmi;
import defpackage.wv8;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Fi extends GestureDetectorOnGestureListenerC3889xi {
    public final byte k1;
    public final C3906y9 l1;
    public final String m1;
    public final GestureDetectorOnGestureListenerC3889xi n1;
    public final Ei o1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Fi(Context context, byte b, C3906y9 c3906y9, C3638o0 c3638o0, Jo jo, Yi yi, AdConfig adConfig) {
        super(context, b, r3, r4, c3638o0.r, 0L, c3638o0.s, c3906y9, yi, jo, c3638o0, adConfig, 92);
        context.getClass();
        c3638o0.getClass();
        jo.getClass();
        yi.getClass();
        adConfig.getClass();
        LinkedHashSet linkedHashSet = null;
        String str = null;
        this.k1 = b;
        this.l1 = c3906y9;
        this.m1 = dmi.q("RenderViewSibling - ", yi.b);
        jo.getClass();
        this.n1 = (GestureDetectorOnGestureListenerC3889xi) jo.b.get(BuildConfig.FLAVOR);
        this.o1 = new Ei(this, jo, yi);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GestureDetectorOnGestureListenerC3889xi getAdRenderView() {
        C3906y9 c3906y9;
        if (this.n1 == null && (c3906y9 = this.l1) != null) {
            wv8.x("Ad RenderView not found for id: ", getRoute().b, c3906y9, this.m1);
        }
        return this.n1;
    }

    public final void Z() {
        Map<View, FriendlyObstructionPurpose> friendlyViews;
        C3906y9 c3906y9 = this.l1;
        if (c3906y9 != null) {
            c3906y9.a(this.m1, "initialize RenderViewSibling");
        }
        a(this.o1);
        GestureDetectorOnGestureListenerC3889xi adRenderView = getAdRenderView();
        setContextualDataHandler(adRenderView != null ? adRenderView.getContextualDataHandler() : null);
        GestureDetectorOnGestureListenerC3889xi adRenderView2 = getAdRenderView();
        setEmbeddedBrowserJsCallbacks(adRenderView2 != null ? adRenderView2.getEmbeddedBrowserJsCallbacks() : null);
        GestureDetectorOnGestureListenerC3889xi adRenderView3 = getAdRenderView();
        if (adRenderView3 == null || (friendlyViews = adRenderView3.getFriendlyViews()) == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<View, FriendlyObstructionPurpose> entry : friendlyViews.entrySet()) {
            if (!(entry.getKey() instanceof Fi)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        C3906y9 c3906y92 = this.l1;
        if (c3906y92 != null) {
            c3906y92.a(this.m1, "Setting friendly views from adRenderView: " + linkedHashMap);
        }
        setFriendlyViews(new LinkedHashMap(linkedHashMap));
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3889xi
    public final void a(Vf vf) {
        vf.getClass();
        C3906y9 c3906y9 = this.l1;
        if (c3906y9 != null) {
            c3906y9.a(this.m1, "setOrientationProperties " + this);
        }
        setOrientationProperties(vf);
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3889xi, com.inmobi.media.C
    public final void b() {
        k();
        removeAllViews();
        destroy();
    }

    @Nullable
    public final InterfaceC3880x9 getLogger() {
        return this.l1;
    }

    public final byte getMPlacementType() {
        return this.k1;
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3889xi, com.inmobi.media.C
    @NotNull
    public AbstractC3429fo getViewableAd() {
        if (getMViewableAd() == null) {
            setMViewableAd(new O9(this, this, new C3904y7(getImpressionType(), getMCreativeType(), getMImpressionMinTimeViewed(), getMImpressionMinPercentageViewed(), getAdConfig().getViewability().getCompanionVisibilityMinPercentageViewed(), this.l1), this.l1));
        }
        AbstractC3429fo mViewableAd = getMViewableAd();
        mViewableAd.getClass();
        return mViewableAd;
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3889xi
    public final void n() {
        C3906y9 c3906y9 = this.l1;
        if (c3906y9 != null) {
            c3906y9.a(this.m1, "dismissCurrentViewContainer " + this);
        }
        Jc mediaProcessor = getMediaProcessor();
        if (mediaProcessor != null) {
            C3805uc c3805uc = mediaProcessor.c;
            if (c3805uc != null) {
                c3805uc.b();
            }
            mediaProcessor.c = null;
        }
        if ("Default".equals(getViewState())) {
            setAndUpdateViewState("Hidden");
        }
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3889xi, android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Jo webViewFactory = getWebViewFactory();
        String str = getRoute().a;
        webViewFactory.getClass();
        str.getClass();
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = (GestureDetectorOnGestureListenerC3889xi) webViewFactory.b.get(str);
        if (gestureDetectorOnGestureListenerC3889xi != null) {
            c(gestureDetectorOnGestureListenerC3889xi, getRoute().b);
            return;
        }
        C3906y9 c3906y9 = this.l1;
        if (c3906y9 != null) {
            c3906y9.b(this.m1, "Not able to give show success as the source view is not present");
        }
    }

    private static /* synthetic */ void getOverrideListener$annotations() {
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3889xi
    public final void C() {
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3889xi
    public final void u() {
    }
}
