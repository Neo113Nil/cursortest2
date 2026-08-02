package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.NonBouncedAppBarLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.bqx0;
import xsna.bzt0;
import xsna.iut0;
import xsna.xwk;

/* loaded from: classes13.dex */
public class NonBouncedCollapsingToolbarLayout extends CollapsingToolbarLayout {
    public a H;

    public class a implements NonBouncedAppBarLayout.d {
        public a() {
        }

        @Override // com.google.android.material.appbar.NonBouncedAppBarLayout.d
        public final void a(NonBouncedAppBarLayout nonBouncedAppBarLayout, int i) {
            NonBouncedCollapsingToolbarLayout nonBouncedCollapsingToolbarLayout = NonBouncedCollapsingToolbarLayout.this;
            nonBouncedCollapsingToolbarLayout.z = i;
            bqx0 bqx0Var = nonBouncedCollapsingToolbarLayout.B;
            int i2 = bqx0Var != null ? bqx0Var.a.i(1).b : 0;
            int childCount = nonBouncedCollapsingToolbarLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = nonBouncedCollapsingToolbarLayout.getChildAt(i3);
                CollapsingToolbarLayout.b bVar = (CollapsingToolbarLayout.b) childAt.getLayoutParams();
                bzt0 c = CollapsingToolbarLayout.c(childAt);
                int i4 = bVar.a;
                if (i4 == 1) {
                    c.d(xwk.b(-i, 0, nonBouncedCollapsingToolbarLayout.b(childAt)));
                } else if (i4 == 2) {
                    c.d(Math.round((-i) * bVar.b));
                }
            }
            nonBouncedCollapsingToolbarLayout.e();
            if (nonBouncedCollapsingToolbarLayout.q != null && i2 > 0) {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                nonBouncedCollapsingToolbarLayout.postInvalidateOnAnimation();
            }
            int height = nonBouncedCollapsingToolbarLayout.getHeight();
            WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
            nonBouncedCollapsingToolbarLayout.l.p(Math.abs(i) / ((height - nonBouncedCollapsingToolbarLayout.getMinimumHeight()) - i2));
        }
    }

    public NonBouncedCollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.appbar.CollapsingToolbarLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Object parent = getParent();
        if (parent instanceof NonBouncedAppBarLayout) {
            setFitsSystemWindows(((View) parent).getFitsSystemWindows());
            if (this.H == null) {
                this.H = new a();
            }
            ((NonBouncedAppBarLayout) parent).a(this.H);
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            requestApplyInsets();
        }
    }

    @Override // com.google.android.material.appbar.CollapsingToolbarLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        ViewParent parent = getParent();
        a aVar = this.H;
        if (aVar != null && (parent instanceof NonBouncedAppBarLayout) && (arrayList = ((NonBouncedAppBarLayout) parent).h) != null) {
            arrayList.remove(aVar);
        }
        super.onDetachedFromWindow();
    }
}
