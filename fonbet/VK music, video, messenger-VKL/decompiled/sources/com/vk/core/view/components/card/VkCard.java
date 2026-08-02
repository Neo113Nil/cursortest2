package com.vk.core.view.components.card;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.avj;
import xsna.hbh0;
import xsna.krv0;
import xsna.too0;

/* compiled from: VkCard.kt */
/* loaded from: classes17.dex */
public final class VkCard extends FrameLayout implements too0 {
    public final Paint b;
    public int c;
    public int d;
    public float e;
    public boolean f;

    public VkCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // xsna.too0
    public final void Ng() {
        a(this.d);
        float f = this.e;
        getContext();
        setOutlineProvider(new avj(f));
        invalidate();
        if (getBackgroundColorAttr() != 0) {
            super.setBackgroundColor(krv0.m(getBackgroundColorAttr(), getContext()));
        }
    }

    public final void a(int i) {
        getContext();
        int m = krv0.m(i, getContext());
        Paint paint = this.b;
        paint.setColor(m);
        paint.setStrokeWidth(hbh0.a(getContext(), 0.5f) * 2);
        invalidate();
    }

    public final int getBackgroundColorAttr() {
        return this.c;
    }

    public final int getBorderColorAttr() {
        return this.d;
    }

    public final float getCardRadius() {
        return this.e;
    }

    public final boolean getDrawBorder() {
        return this.f;
    }

    @Override // android.view.View
    public final void onDrawForeground(Canvas canvas) {
        super.onDrawForeground(canvas);
        if (this.f) {
            float width = getWidth();
            float height = getHeight();
            float f = this.e;
            canvas.drawRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height, f, f, this.b);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        this.c = 0;
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.c = 0;
        super.setBackgroundColor(i);
    }

    public final void setBackgroundColorAttr(int i) {
        this.c = i;
        super.setBackgroundColor(krv0.m(i, getContext()));
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        this.c = 0;
        super.setBackgroundResource(i);
    }

    public final void setBorderColorAttr(int i) {
        this.d = i;
        a(i);
    }

    public final void setCardRadius(float f) {
        this.e = f;
        getContext();
        setOutlineProvider(new avj(f));
        invalidate();
    }

    public final void setDrawBorder(boolean z) {
        this.f = z;
        invalidate();
    }

    public VkCard(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        this.b = paint;
        this.c = R.attr.vk_ui_background_secondary;
        this.d = R.attr.vk_ui_image_border_alpha;
        this.e = context.getResources().getDimension(R.dimen.vk_ui_border_radius);
        setClipToOutline(true);
        setDrawBorder(this.f);
        setCardRadius(this.e);
        setBorderColorAttr(this.d);
        setBackgroundColorAttr(getBackgroundColorAttr());
        setWillNotDraw(false);
    }
}
