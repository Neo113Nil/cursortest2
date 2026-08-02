package com.vk.ecomm.design.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.krv0;
import xsna.l8g;
import xsna.t910;

/* compiled from: MarketPaginationDotsView.kt */
/* loaded from: classes18.dex */
public final class MarketPaginationDotsView extends View {
    public int b;
    public int c;
    public t910 d;
    public final Paint e;
    public final Paint f;
    public final int g;
    public final int h;

    public MarketPaginationDotsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.d = t910.f;
        Paint paint = new Paint(1);
        paint.setColor(l8g.f(0.4f, krv0.m(R.attr.vk_ui_overlay_primary, context)));
        this.e = paint;
        this.f = new Paint(1);
        this.g = l8g.f(0.3f, krv0.m(R.attr.vk_ui_icon_contrast, context));
        this.h = krv0.m(R.attr.vk_ui_icon_contrast, context);
    }

    public final int getCurrentPage() {
        return this.c;
    }

    public final int getPages() {
        return this.b;
    }

    public final t910 getSize() {
        return this.d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f;
        canvas.drawRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), getHeight(), getHeight() / 2.0f, getHeight() / 2.0f, this.e);
        int i = this.b;
        int i2 = 0;
        while (i2 < i) {
            t910 t910Var = this.d;
            float f = (t910Var.b * i2) + (t910Var.a * i2) + t910Var.d;
            float f2 = t910Var.c;
            int save = canvas.save();
            canvas.translate(f, f2);
            try {
                paint.setColor(this.c == i2 ? this.h : this.g);
                int i3 = this.d.a;
                canvas.drawCircle(i3 / 2.0f, i3 / 2.0f, i3 / 2.0f, paint);
                canvas.restoreToCount(save);
                i2++;
            } catch (Throwable th) {
                canvas.restoreToCount(save);
                throw th;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.b;
        t910 t910Var = this.d;
        int i4 = t910Var.a;
        setMeasuredDimension((t910Var.d * 2) + ((i3 - 1) * t910Var.b) + (i3 * i4), (t910Var.c * 2) + i4);
    }

    public final void setCurrentPage(int i) {
        this.c = i;
        invalidate();
    }

    public final void setPages(int i) {
        this.b = i;
        requestLayout();
    }

    public final void setSize(t910 t910Var) {
        this.d = t910Var;
        requestLayout();
    }
}
