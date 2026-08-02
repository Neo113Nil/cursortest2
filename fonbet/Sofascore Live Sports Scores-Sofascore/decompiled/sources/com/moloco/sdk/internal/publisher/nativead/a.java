package com.moloco.sdk.internal.publisher.nativead;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a implements NativeAd.Assets {
    public final Context a;
    public final q b;
    public final com.moloco.sdk.internal.d c;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b d;
    public final com.moloco.sdk.internal.g e;
    public final com.moloco.sdk.acm.recorder.c f;
    public b g;
    public boolean h;
    public com.moloco.sdk.internal.publisher.nativead.model.n i;
    public final Uri j;
    public com.moloco.sdk.internal.publisher.nativead.ui.f k;
    public FrameLayout l;

    public a(Context context, q qVar, com.moloco.sdk.internal.d dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b bVar, com.moloco.sdk.internal.g gVar, com.moloco.sdk.acm.recorder.c cVar) {
        this.a = context;
        this.b = qVar;
        this.c = dVar;
        this.d = bVar;
        this.e = gVar;
        this.f = cVar;
        com.moloco.sdk.internal.publisher.nativead.model.n nVar = this.i;
        this.j = nVar != null ? nVar.b(1) : null;
    }

    public static void b(ViewGroup viewGroup) {
        ViewParent parent = viewGroup.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "NativeAdAssetsProvider", "Detaching view " + viewGroup.getClass().getSimpleName() + " from parent " + viewGroup2.getClass().getSimpleName(), null, false, 12, null);
            viewGroup2.removeView(viewGroup);
        }
    }

    public final FrameLayout a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m mVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m) this.e.invoke(aVar);
        mVar.d();
        boolean z = this.h;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b bVar = this.d;
        q qVar = this.b;
        Context context = this.a;
        return z ? new com.moloco.sdk.internal.publisher.nativead.ui.k(context, mVar, qVar, bVar, this.g) : new com.moloco.sdk.internal.publisher.nativead.ui.i(context, mVar, qVar, this.c, bVar, this.g);
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public final String getCallToActionText() {
        com.moloco.sdk.internal.publisher.nativead.model.n nVar = this.i;
        if (nVar != null) {
            return nVar.a(7);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public final String getDescription() {
        com.moloco.sdk.internal.publisher.nativead.model.n nVar = this.i;
        if (nVar != null) {
            return nVar.a(5);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public final Uri getIconUri() {
        com.moloco.sdk.internal.publisher.nativead.model.n nVar = this.i;
        if (nVar != null) {
            return nVar.b(0);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public final Uri getMainImageUri() {
        return this.j;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public final View getMediaView() {
        Uri b;
        FrameLayout frameLayout = this.l;
        if (frameLayout != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "NativeAdAssetsProvider", "Using cached video view", null, false, 12, null);
            b(frameLayout);
            return frameLayout;
        }
        com.moloco.sdk.internal.publisher.nativead.model.n nVar = this.i;
        if (nVar != null) {
            com.moloco.sdk.internal.publisher.nativead.model.l lVar = (com.moloco.sdk.internal.publisher.nativead.model.l) nVar.d.get(2);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar = lVar != null ? lVar.b : null;
            if (aVar != null) {
                try {
                    FrameLayout a = a(aVar);
                    this.l = a;
                    return a;
                } catch (NoClassDefFoundError e) {
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "NativeAdAssetsProvider", "Compose dependency not available for native video rendering, falling back to image", e, false, 8, null);
                    com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
                    this.f.a(new com.moloco.sdk.acm.d("native_ad_compose_not_available"));
                }
            }
        }
        com.moloco.sdk.internal.publisher.nativead.ui.f fVar = this.k;
        if (fVar != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "NativeAdAssetsProvider", "Using cached image view", null, false, 12, null);
            b(fVar);
            return fVar;
        }
        com.moloco.sdk.internal.publisher.nativead.model.n nVar2 = this.i;
        if (nVar2 == null || (b = nVar2.b(1)) == null) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "NativeAdAssetsProvider", "Missing video and image asset", new Exception(), false, 8, null);
            return null;
        }
        b bVar = this.g;
        t0 a2 = com.moloco.sdk.service_locator.i.a();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.n nVar3 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.n();
        Context context = this.a;
        com.moloco.sdk.internal.publisher.nativead.ui.f fVar2 = new com.moloco.sdk.internal.publisher.nativead.ui.f(context);
        ImageView imageView = new ImageView(context);
        imageView.setImageURI(b);
        imageView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        imageView.setOnClickListener(new com.moloco.sdk.internal.publisher.nativead.ui.e(0, bVar));
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e eVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e(a2, context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(12);
        layoutParams.addRule(20);
        eVar.setPadding(16, 0, 0, 16);
        eVar.setOnButtonRenderedListener(new com.moloco.sdk.acm.db.e(nVar3, 2));
        eVar.setLayoutParams(layoutParams);
        this.d.b(imageView);
        fVar2.addView(imageView);
        fVar2.addView(eVar);
        this.k = fVar2;
        return fVar2;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public final Float getRating() {
        String a;
        com.moloco.sdk.internal.publisher.nativead.model.n nVar = this.i;
        if (nVar == null || (a = nVar.a(6)) == null) {
            return null;
        }
        return kotlin.text.b.g(a);
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public final String getSponsorText() {
        com.moloco.sdk.internal.publisher.nativead.model.n nVar = this.i;
        if (nVar != null) {
            return nVar.a(4);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public final String getTitle() {
        com.moloco.sdk.internal.publisher.nativead.model.k kVar;
        com.moloco.sdk.internal.publisher.nativead.model.n nVar = this.i;
        if (nVar == null || (kVar = (com.moloco.sdk.internal.publisher.nativead.model.k) nVar.c.get(3)) == null) {
            return null;
        }
        return kVar.b;
    }
}
