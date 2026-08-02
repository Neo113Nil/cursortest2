package com.vk.music.onboarding.impl.behavior;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import xsna.f4m;
import xsna.iah0;

/* compiled from: SearchFieldToToolbarBehavior.kt */
/* loaded from: classes3.dex */
public final class SearchFieldToToolbarBehavior extends CoordinatorLayout.c<View> {
    public static final int f = iah0.a(12);
    public float b;
    public final int c;
    public final int d;
    public boolean e;

    public SearchFieldToToolbarBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = -1.0f;
        TypedValue typedValue = new TypedValue();
        this.c = context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true) ? TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()) : 0;
        this.d = iah0.a(40);
        this.e = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(View view, View view2) {
        return view2 instanceof AppBarLayout;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, View view2) {
        float y = view2.getY() + view2.getMeasuredHeight();
        boolean z = this.b == y;
        boolean z2 = !z;
        if (!z) {
            float measuredHeight = view2.getMeasuredHeight();
            float f2 = this.c;
            view.setY((y - f2) * (view2.getMeasuredHeight() / (measuredHeight - f2)));
            if (this.e) {
                float y2 = 1 - (view.getY() / f2);
                float y3 = view.getY();
                int i = f;
                int i2 = y3 < f2 ? (int) (y2 * this.d) : i;
                this.b = view.getY();
                f4m.x(Math.max(i2, i), view);
            }
        }
        return z2;
    }
}
