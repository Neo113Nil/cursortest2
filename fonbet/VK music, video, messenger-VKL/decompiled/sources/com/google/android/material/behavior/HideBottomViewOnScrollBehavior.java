package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$attr;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.LinkedHashSet;
import xsna.j8z;
import xsna.n3v;
import xsna.rq2;
import xsna.tb30;

/* loaded from: classes13.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public static final int j = R$attr.motionDurationLong2;
    public static final int k = R$attr.motionDurationMedium4;
    public static final int l = R$attr.motionEasingEmphasizedInterpolator;

    @NonNull
    public final LinkedHashSet<a> b;
    public int c;
    public int d;
    public TimeInterpolator e;
    public TimeInterpolator f;
    public int g;
    public int h;

    @Nullable
    public ViewPropertyAnimator i;

    public interface a {
        void a();
    }

    public HideBottomViewOnScrollBehavior() {
        this.b = new LinkedHashSet<>();
        this.g = 0;
        this.h = 2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean n(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        this.g = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        this.c = tb30.c(j, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, v.getContext());
        this.d = tb30.c(k, 175, v.getContext());
        Context context = v.getContext();
        j8z j8zVar = rq2.d;
        int i2 = l;
        this.e = tb30.d(context, i2, j8zVar);
        this.f = tb30.d(v.getContext(), i2, rq2.c);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void u(CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
        LinkedHashSet<a> linkedHashSet = this.b;
        if (i2 > 0) {
            if (this.h == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.i;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.h = 1;
            Iterator<a> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.i = v.animate().translationY(this.g).setInterpolator(this.f).setDuration(this.d).setListener(new n3v(this));
            return;
        }
        if (i2 >= 0 || this.h == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.i;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            v.clearAnimation();
        }
        this.h = 2;
        Iterator<a> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
        this.i = v.animate().translationY(0).setInterpolator(this.e).setDuration(this.c).setListener(new n3v(this));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean z(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new LinkedHashSet<>();
        this.g = 0;
        this.h = 2;
    }
}
