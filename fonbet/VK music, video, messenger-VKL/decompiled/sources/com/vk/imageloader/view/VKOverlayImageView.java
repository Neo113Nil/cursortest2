package com.vk.imageloader.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.vk.imageloader.R$styleable;
import xsna.e3m;
import xsna.m33;

/* loaded from: classes2.dex */
public class VKOverlayImageView extends VKImageView {
    public Drawable m;
    public boolean n;

    public VKOverlayImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.b, 0, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(1);
            this.n = obtainStyledAttributes.getBoolean(3, true);
            if (drawable != null) {
                setOverlay(drawable);
            }
        }
        setWillNotDraw(false);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.m;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.m.setState(getDrawableState());
    }

    @Override // com.vk.imageloader.view.VKImageView, xsna.zjt, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        super.onDraw(canvas);
        canvas.restore();
        Drawable drawable = this.m;
        if (drawable != null) {
            if (this.n) {
                drawable.setBounds(0, 0, getWidth(), getHeight());
            } else {
                drawable.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            }
            this.m.draw(canvas);
        }
    }

    public void setOverlay(@Nullable Drawable drawable) {
        Drawable drawable2 = this.m;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.m = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        if (this.n && this.m != null) {
            Rect rect = new Rect();
            this.m.getPadding(rect);
            setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
        invalidate();
    }

    public void setPadOverlay(boolean z) {
        this.n = z;
        if (!z || this.m == null) {
            return;
        }
        Rect rect = new Rect();
        this.m.getPadding(rect);
        setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.m;
    }

    public void setOverlay(int i) {
        Context context = getContext();
        e3m.a aVar = e3m.a;
        setOverlay(m33.a(i, context));
    }
}
