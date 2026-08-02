package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import defpackage.uem;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.go, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3455go extends AbstractC3429fo {
    public final GestureDetectorOnGestureListenerC3889xi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3455go(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        super(gestureDetectorOnGestureListenerC3889xi);
        gestureDetectorOnGestureListenerC3889xi.getClass();
        this.d = gestureDetectorOnGestureListenerC3889xi;
    }

    public static final Unit b(View view, Fi fi) {
        fi.getClass();
        fi.getViewableAd().a(view);
        U exposureTracker = fi.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.b(view);
        }
        return Unit.a;
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        view.getClass();
        friendlyObstructionPurpose.getClass();
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.d.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.put(view, friendlyObstructionPurpose);
        }
        U exposureTracker = this.d.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.a(view);
        }
        b(view);
    }

    public final void c(View view) {
        this.d.getWebViewFactory().b(new uem(1, view));
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final View c() {
        this.b = new WeakReference(this.d);
        return this.d;
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final void d() {
    }

    public final void b(View view) {
        this.d.getWebViewFactory().b(new uem(0, view));
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final void a(Context context, byte b) {
        context.getClass();
    }

    public static final Unit a(View view, Fi fi) {
        fi.getClass();
        fi.getViewableAd().a(view, FriendlyObstructionPurpose.OTHER);
        U exposureTracker = fi.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.a(view);
        }
        return Unit.a;
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final void a(Map map) {
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final void a(View view) {
        view.getClass();
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.d.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.remove(view);
        }
        U exposureTracker = this.d.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.b(view);
        }
        c(view);
    }
}
