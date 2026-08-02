package com.vk.core.tool.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.extra.R$styleable;
import xsna.f4m;

/* compiled from: FrameLayoutSameSize.kt */
/* loaded from: classes17.dex */
public final class FrameLayoutSameSize extends FrameLayout {
    public FrameLayoutSameSize(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        int i5 = ((a) view.getLayoutParams()).a;
        int i6 = ((a) view.getLayoutParams()).b;
        if (i5 <= 0) {
            super.measureChildWithMargins(view, i, i2, i3, i4);
            return;
        }
        View findViewById = findViewById(i5);
        if ((findViewById.getMeasuredHeight() == 0 || findViewById.getMeasuredWidth() == 0) && !f4m.f(findViewById)) {
            throw new IllegalStateException("View must located before in z order!");
        }
        if (i6 != 2) {
            view.getLayoutParams().width = findViewById.getMeasuredWidth();
        }
        if (i6 != 1) {
            view.getLayoutParams().height = findViewById.getMeasuredHeight();
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new FrameLayout.LayoutParams(layoutParams);
    }

    /* compiled from: FrameLayoutSameSize.kt */
    public static final class a extends FrameLayout.LayoutParams {
        public final int a;
        public final int b;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.d);
            this.a = obtainStyledAttributes.getResourceId(1, 0);
            this.b = obtainStyledAttributes.getResourceId(0, 0);
            obtainStyledAttributes.recycle();
        }

        public a() {
            super(-1, -1);
            this.a = 0;
            this.b = 0;
        }
    }
}
