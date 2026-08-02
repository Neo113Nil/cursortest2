package com.vk.core.tool.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.vk.core.view.components.extra.R$styleable;
import xsna.m33;

/* loaded from: classes17.dex */
public class OverlayLinearLayout extends LinearLayout {
    public Drawable b;
    public boolean c;
    public final boolean d;

    public OverlayLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = false;
        this.d = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.e, 0, 0);
            int resourceId = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId != 0) {
                setOverlay(resourceId);
            }
            this.c = obtainStyledAttributes.getBoolean(3, false);
            this.d = obtainStyledAttributes.getBoolean(2, false);
        }
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = this.b;
        if (drawable != null) {
            if (this.c) {
                drawable.setBounds(getPaddingLeft(), getPaddingTop(), canvas.getWidth() - getPaddingRight(), canvas.getHeight() - getPaddingBottom());
            } else if (this.d) {
                Rect rect = new Rect();
                if (getBackground() != null && !getBackground().getPadding(rect)) {
                    rect.set(0, 0, 0, 0);
                }
                this.b.setBounds(rect.left, rect.top, canvas.getWidth() - rect.right, canvas.getHeight() - rect.bottom);
            } else {
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            }
            this.b.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.b;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.b.setState(getDrawableState());
        postInvalidate();
    }

    public void setOverlay(int i) {
        setOverlay(m33.a(i, getContext()));
    }

    public void setPadOverlay(boolean z) {
        this.c = z;
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.b;
    }

    public void setOverlay(Drawable drawable) {
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.b = drawable;
        drawable.setCallback(this);
        invalidate();
    }
}
