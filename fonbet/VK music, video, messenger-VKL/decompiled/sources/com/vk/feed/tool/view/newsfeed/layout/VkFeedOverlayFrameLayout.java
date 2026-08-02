package com.vk.feed.tool.view.newsfeed.layout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import xsna.yuu0;

/* compiled from: VkFeedOverlayFrameLayout.kt */
/* loaded from: classes18.dex */
public final class VkFeedOverlayFrameLayout extends FrameLayout {
    public final yuu0 b;

    public VkFeedOverlayFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new yuu0(this, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = this.b.c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.b.c;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        yuu0 yuu0Var = this.b;
        Drawable drawable = yuu0Var.c;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(drawableState);
        yuu0Var.a.postInvalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        yuu0 yuu0Var = this.b;
        Rect rect = yuu0Var.b;
        VkFeedOverlayFrameLayout vkFeedOverlayFrameLayout = yuu0Var.a;
        Drawable drawable = yuu0Var.c;
        if (drawable == null) {
            return;
        }
        if (i == i3 && i2 == i4) {
            return;
        }
        if (yuu0Var.d) {
            drawable.setBounds(vkFeedOverlayFrameLayout.getPaddingLeft(), vkFeedOverlayFrameLayout.getPaddingTop(), i - vkFeedOverlayFrameLayout.getPaddingRight(), i2 - vkFeedOverlayFrameLayout.getPaddingBottom());
            return;
        }
        if (!yuu0Var.e) {
            drawable.setBounds(0, 0, i, i2);
            return;
        }
        if (vkFeedOverlayFrameLayout.getBackground() != null && !vkFeedOverlayFrameLayout.getBackground().getPadding(rect)) {
            rect.set(0, 0, 0, 0);
        }
        drawable.setBounds(rect.left, rect.top, i - rect.right, i2 - rect.bottom);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable.equals(this.b.c) || super.verifyDrawable(drawable);
    }
}
