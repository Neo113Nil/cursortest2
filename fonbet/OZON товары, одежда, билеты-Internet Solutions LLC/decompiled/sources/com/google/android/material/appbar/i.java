package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import ru.ozon.composer.ui.behavior.ComposerListBehavior;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class i extends j<View> {

    /* renamed from: c, reason: collision with root package name */
    final Rect f57979c;

    /* renamed from: d, reason: collision with root package name */
    final Rect f57980d;

    /* renamed from: e, reason: collision with root package name */
    private int f57981e;

    /* renamed from: f, reason: collision with root package name */
    private int f57982f;

    public i() {
        this.f57979c = new Rect();
        this.f57980d = new Rect();
        this.f57981e = 0;
    }

    @Override // com.google.android.material.appbar.j
    protected final void d(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i11) {
        AppBarLayout f7 = f(coordinatorLayout.getDependencies(view));
        if (f7 == null) {
            coordinatorLayout.onLayoutChild(view, i11);
            this.f57981e = 0;
            return;
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
        int bottom = f7.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin;
        int bottom2 = ((f7.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
        Rect rect = this.f57979c;
        rect.set(paddingLeft, bottom, width, bottom2);
        C5353y0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null) {
            int i12 = Y.f42258g;
            if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left = lastWindowInsets.j() + rect.left;
                rect.right -= lastWindowInsets.k();
            }
        }
        int i13 = fVar.f41884c;
        if (i13 == 0) {
            i13 = 8388659;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.f57980d;
        Gravity.apply(i13, measuredWidth, measuredHeight, rect, rect2, i11);
        int g10 = g(f7);
        view.layout(rect2.left, rect2.top - g10, rect2.right, rect2.bottom - g10);
        this.f57981e = rect2.top - f7.getBottom();
    }

    abstract AppBarLayout f(List list);

    final int g(View view) {
        if (this.f57982f == 0) {
            return 0;
        }
        float h11 = h(view);
        int i11 = this.f57982f;
        return com.google.common.primitives.e.b((int) (h11 * i11), 0, i11);
    }

    float h(View view) {
        return 1.0f;
    }

    public final int i() {
        return this.f57982f;
    }

    int j(@NonNull View view) {
        return view.getMeasuredHeight();
    }

    final int k() {
        return this.f57981e;
    }

    public final void l(int i11) {
        this.f57982f = i11;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i11, int i12, int i13, int i14) {
        AppBarLayout f7;
        C5353y0 lastWindowInsets;
        int i15 = view.getLayoutParams().height;
        if ((i15 != -1 && i15 != -2) || (f7 = f(coordinatorLayout.getDependencies(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i13);
        if (size > 0) {
            int i16 = Y.f42258g;
            if (f7.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.i() + lastWindowInsets.l();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int j11 = size + j(f7);
        int measuredHeight = f7.getMeasuredHeight();
        if (this instanceof ComposerListBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            j11 -= measuredHeight;
        }
        coordinatorLayout.onMeasureChild(view, i11, i12, View.MeasureSpec.makeMeasureSpec(j11, i15 == -1 ? 1073741824 : LinearLayoutManager.INVALID_OFFSET), i14);
        return true;
    }

    public i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f57979c = new Rect();
        this.f57980d = new Rect();
        this.f57981e = 0;
    }
}
