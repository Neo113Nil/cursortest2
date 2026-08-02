package com.vk.core.view.collapse_behavior;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.unity3d.services.UnityAdsConstants;
import xsna.n8j;
import xsna.xwk;

/* compiled from: CollapseBehavior.kt */
/* loaded from: classes17.dex */
public final class CollapseBehavior extends CoordinatorLayout.c<View> {
    public final int b;
    public n8j.a c;
    public int d = 100;

    public CollapseBehavior(int i) {
        this.b = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void B(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        int i2 = this.d;
        if (i2 == 0 || i2 == 100) {
            return;
        }
        if (i2 < 50) {
            this.d = 0;
            n8j.a aVar = this.c;
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        this.d = 100;
        n8j.a aVar2 = this.c;
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean p(View view, View view2, float f) {
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.d != 100) {
            n8j.a aVar = this.c;
            if (aVar != null) {
                aVar.b();
            }
            this.d = 100;
            return false;
        }
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || this.d == 0) {
            return false;
        }
        n8j.a aVar2 = this.c;
        if (aVar2 != null) {
            aVar2.a();
        }
        this.d = 0;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void r(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        boolean z = i2 < 0 && this.d != 100;
        boolean z2 = i2 > 0 && this.d != 0;
        if (z || z2) {
            float f = 100;
            int b = xwk.b(this.d + ((int) (((-i2) / this.b) * f)), 0, 100);
            this.d = b;
            if (b == 100 || b == 0) {
                i2 = 0;
            } else {
                n8j.a aVar = this.c;
                if (aVar != null) {
                    n8j.P4(n8j.this, b / f);
                }
            }
            iArr[1] = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return (coordinatorLayout.getHeight() - view2.getHeight() <= view.getHeight() || this.d == 0) && (i & 2) != 0;
    }
}
