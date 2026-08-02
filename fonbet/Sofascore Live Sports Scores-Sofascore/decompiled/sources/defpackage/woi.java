package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class woi extends wba {
    public int f;
    public int g = -1;
    public final /* synthetic */ SwipeDismissBehavior h;

    public woi(SwipeDismissBehavior swipeDismissBehavior) {
        this.h = swipeDismissBehavior;
    }

    @Override // defpackage.wba
    public final void D(int i, View view) {
        this.g = i;
        this.f = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.h;
            swipeDismissBehavior.d = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.d = false;
        }
    }

    @Override // defpackage.wba
    public final void E(int i) {
        j0l j0lVar = this.h.b;
        if (j0lVar != null) {
            j71 j71Var = ((n71) j0lVar.b).w;
            if (i == 0) {
                ujg.O().a0(j71Var);
            } else if (i == 1 || i == 2) {
                ujg.O().X(j71Var);
            }
        }
    }

    @Override // defpackage.wba
    public final void F(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.h;
        float f = width * swipeDismissBehavior.f;
        float width2 = view.getWidth() * swipeDismissBehavior.g;
        float abs = Math.abs(i - this.f);
        if (abs <= f) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            view.setAlpha(Math.min(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f - ((abs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x004e, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.f) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L27;
     */
    @Override // defpackage.wba
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(View view, float f, float f2) {
        int i;
        j0l j0lVar;
        this.g = -1;
        int width = view.getWidth();
        int i2 = 2;
        boolean z = false;
        SwipeDismissBehavior swipeDismissBehavior = this.h;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            boolean z2 = view.getLayoutDirection() == 1;
            int i3 = swipeDismissBehavior.e;
            if (i3 != 2) {
                i = i3 == 0 ? this.f : this.f;
            }
            if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int left = view.getLeft();
                int i4 = this.f;
                if (left >= i4) {
                    i = i4 + width;
                    z = true;
                }
            }
            i = this.f - width;
            z = true;
        }
        if (swipeDismissBehavior.a.n(i, view.getTop())) {
            view.postOnAnimation(new o8a(swipeDismissBehavior, view, z, i2));
        } else {
            if (!z || (j0lVar = swipeDismissBehavior.b) == null) {
                return;
            }
            j0lVar.r(view);
        }
    }

    @Override // defpackage.wba
    public final boolean T(int i, View view) {
        int i2 = this.g;
        return (i2 == -1 || i2 == i) && this.h.w(view);
    }

    @Override // defpackage.wba
    public final int o(int i, View view) {
        int width;
        int width2;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.h.e;
        if (i2 == 0) {
            width = this.f;
            if (z) {
                width -= view.getWidth();
                width2 = this.f;
            } else {
                width2 = view.getWidth() + width;
            }
        } else {
            int i3 = this.f;
            if (i2 != 1) {
                width = i3 - view.getWidth();
                width2 = this.f + view.getWidth();
            } else if (z) {
                width2 = view.getWidth() + i3;
                width = i3;
            } else {
                width = i3 - view.getWidth();
                width2 = this.f;
            }
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // defpackage.wba
    public final int p(int i, View view) {
        return view.getTop();
    }

    @Override // defpackage.wba
    public final int y(View view) {
        return view.getWidth();
    }
}
