package com.vk.common.view.overlay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import xsna.h390;

/* compiled from: OverlayConstraintLayout.kt */
/* loaded from: classes17.dex */
public final class OverlayConstraintLayout extends ConstraintLayout {
    public final h390 t;

    public OverlayConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.t = new h390(this, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = this.t.c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.t.c;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        h390 h390Var = this.t;
        Drawable drawable = h390Var.c;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(drawableState);
        h390Var.a.postInvalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        h390 h390Var = this.t;
        Rect rect = h390Var.b;
        OverlayConstraintLayout overlayConstraintLayout = h390Var.a;
        Drawable drawable = h390Var.c;
        if (drawable == null) {
            return;
        }
        if (i == i3 && i2 == i4) {
            return;
        }
        if (h390Var.d) {
            drawable.setBounds(overlayConstraintLayout.getPaddingLeft(), overlayConstraintLayout.getPaddingTop(), i - overlayConstraintLayout.getPaddingRight(), i2 - overlayConstraintLayout.getPaddingBottom());
            return;
        }
        if (!h390Var.e) {
            drawable.setBounds(0, 0, i, i2);
            return;
        }
        if (overlayConstraintLayout.getBackground() != null && !overlayConstraintLayout.getBackground().getPadding(rect)) {
            rect.set(0, 0, 0, 0);
        }
        drawable.setBounds(rect.left, rect.top, i - rect.right, i2 - rect.bottom);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable.equals(this.t.c) || super.verifyDrawable(drawable);
    }
}
