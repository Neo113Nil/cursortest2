package com.vk.libvideo.design.view.swipe;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.design.view.swipe.layout.a;
import xsna.pmn0;

/* compiled from: SwipeFrameLayout.kt */
/* loaded from: classes2.dex */
public final class SwipeFrameLayout extends FrameLayout implements a.f {
    public final pmn0 b;

    public SwipeFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new pmn0(this);
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.f
    public final boolean a() {
        pmn0 pmn0Var = this.b;
        return pmn0Var.d && !pmn0Var.l;
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.f
    public final boolean b() {
        pmn0 pmn0Var = this.b;
        return pmn0Var.e && !pmn0Var.l;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        pmn0 pmn0Var = this.b;
        SwipeFrameLayout swipeFrameLayout = pmn0Var.a;
        boolean z = false;
        if (motionEvent.getPointerCount() == 1 && motionEvent.getAction() == 0) {
            pmn0Var.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            pmn0Var.j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            pmn0Var.l = false;
            pmn0Var.d = false;
            pmn0Var.e = false;
            pmn0Var.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            pmn0Var.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            pmn0Var.a(motionEvent);
            if ((!swipeFrameLayout.canScrollVertically(-1) || !swipeFrameLayout.canScrollVertically(1)) && pmn0Var.b == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                pmn0Var.b = motionEvent.getY();
            }
        } else if (motionEvent.getPointerCount() == 1 && motionEvent.getAction() == 2) {
            float f = pmn0Var.f;
            pmn0Var.a(motionEvent);
            if ((!swipeFrameLayout.canScrollVertically(-1) || !swipeFrameLayout.canScrollVertically(1)) && pmn0Var.b == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && pmn0Var.h) {
                pmn0Var.b = motionEvent.getY();
            }
            pmn0Var.c = motionEvent.getY() - pmn0Var.b;
            boolean z2 = !swipeFrameLayout.canScrollVertically(-1) && pmn0Var.c > f;
            if (!swipeFrameLayout.canScrollVertically(1) && (-pmn0Var.c) > f) {
                z = true;
            }
            if (pmn0Var.b != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (z2 || z)) {
                pmn0Var.d = true;
            }
            if (motionEvent.getX() - pmn0Var.j > pmn0Var.g) {
                pmn0Var.e = true;
            }
        } else {
            pmn0Var.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            pmn0Var.j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            pmn0Var.l = false;
            pmn0Var.d = false;
            pmn0Var.e = false;
            pmn0Var.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            pmn0Var.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (pmn0Var.l) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
