package com.vk.superapp.design.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.iah0;

/* compiled from: SuperAppProgressView.kt */
/* loaded from: classes6.dex */
public final class SuperAppProgressView extends View {
    public static final int h = iah0.a(10);
    public static final int i = iah0.a(4);
    public static final float j = iah0.b(4.0f);
    public int b;
    public int c;
    public final Paint d;
    public final Paint e;
    public final RectF f;
    public final RectF g;

    public SuperAppProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = 100;
        Paint paint = new Paint(1);
        paint.setColor(e3m.f(R.attr.vk_ui_track_background, context));
        this.d = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(e3m.f(R.attr.vk_ui_background_accent, context));
        this.e = paint2;
        this.f = new RectF();
        this.g = new RectF();
    }

    public final int getMaxProgress() {
        return this.c;
    }

    public final int getProgress() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float paddingLeft = getPaddingLeft();
        RectF rectF = this.f;
        rectF.left = paddingLeft;
        rectF.top = getPaddingTop();
        rectF.right = rectF.left + ((((getWidth() - rectF.left) - getPaddingRight()) / this.c) * this.b);
        rectF.bottom = getHeight() - getPaddingBottom();
        float paddingLeft2 = getPaddingLeft();
        RectF rectF2 = this.g;
        rectF2.left = paddingLeft2;
        rectF2.top = getPaddingTop();
        rectF2.right = getWidth() - getPaddingRight();
        rectF2.bottom = getHeight() - getPaddingBottom();
        Paint paint = this.d;
        float f = j;
        canvas.drawRoundRect(rectF2, f, f, paint);
        canvas.drawRoundRect(rectF, f, f, this.e);
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + h, i2, 0), View.resolveSizeAndState(getPaddingBottom() + getPaddingTop() + i, i3, 0));
    }

    public final void setMaxProgress(int i2) {
        if (i2 == 0) {
            return;
        }
        this.c = i2;
        invalidate();
    }

    public final void setProgress(int i2) {
        int i3 = this.c;
        if (i2 > i3) {
            i2 = i3;
        }
        this.b = i2;
        invalidate();
    }
}
