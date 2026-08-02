package com.google.android.material.snackbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.view.Y;
import i7.C7017a;
import n7.C8448a;
import ru.ozon.app.android.R;
import s7.C9621p;
import v7.c;

/* loaded from: classes9.dex */
public class a extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    private static final View.OnTouchListener f58510d = new ViewOnTouchListenerC0887a();

    /* renamed from: a, reason: collision with root package name */
    private final int f58511a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f58512b;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f58513c;

    /* renamed from: com.google.android.material.snackbar.a$a, reason: collision with other inner class name */
    final class ViewOnTouchListenerC0887a implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    protected a(@NonNull Context context, AttributeSet attributeSet) {
        super(B7.a.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C7017a.f65928L);
        if (obtainStyledAttributes.hasValue(6)) {
            Y.H(this, obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        obtainStyledAttributes.getInt(2, 0);
        float f7 = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(c.a(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(C9621p.e(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        obtainStyledAttributes.getFloat(1, 1.0f);
        this.f58511a = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f58510d);
        setFocusable(true);
        if (getBackground() == null) {
            float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(C8448a.d(f7, C8448a.b(R.attr.colorSurface, this), C8448a.b(R.attr.colorOnSurface, this)));
            ColorStateList colorStateList = this.f58512b;
            if (colorStateList != null) {
                androidx.core.graphics.drawable.a.j(gradientDrawable, colorStateList);
            }
            int i11 = Y.f42258g;
            setBackgroundDrawable(gradientDrawable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Y.A(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int i13 = this.f58511a;
        if (i13 <= 0 || getMeasuredWidth() <= i13) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), i12);
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f58512b != null) {
            drawable = drawable.mutate();
            androidx.core.graphics.drawable.a.j(drawable, this.f58512b);
            androidx.core.graphics.drawable.a.k(drawable, this.f58513c);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        this.f58512b = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            androidx.core.graphics.drawable.a.j(mutate, colorStateList);
            androidx.core.graphics.drawable.a.k(mutate, this.f58513c);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f58513c = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            androidx.core.graphics.drawable.a.k(mutate, mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f58510d);
        super.setOnClickListener(onClickListener);
    }
}
