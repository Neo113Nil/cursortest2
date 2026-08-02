package com.vk.cameraui.widgets;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.typography.FontFamily;
import com.vk.typography.b;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.observable.n0;
import java.util.ArrayList;
import xsna.e43;
import xsna.gpt0;
import xsna.iah0;
import xsna.m33;
import xsna.n8g;
import xsna.vye;
import xsna.z8s;

/* compiled from: ClipsProgressView.kt */
/* loaded from: classes.dex */
public final class ClipsProgressView extends View {
    public int b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final RectF h;
    public final RectF i;
    public final Paint j;
    public final Paint k;
    public final TextPaint l;
    public final Drawable m;
    public final Drawable n;
    public final ArrayList o;
    public float p;
    public float q;
    public float r;
    public Long s;
    public final ValueAnimator t;

    public ClipsProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 15000;
        this.c = iah0.a(6);
        this.d = iah0.a(8);
        float f = 4;
        this.e = iah0.a(f);
        this.f = iah0.a(18);
        this.g = iah0.a(f) * 0.5f;
        this.h = new RectF();
        this.i = new RectF();
        Paint paint = new Paint(1);
        this.j = paint;
        Paint paint2 = new Paint(1);
        this.k = paint2;
        TextPaint textPaint = new TextPaint(1);
        this.l = textPaint;
        this.m = m33.a(R.drawable.bg_story_progress_shadow, e43.a);
        this.n = m33.a(R.drawable.timeline_marker, e43.a);
        this.o = new ArrayList();
        this.t = ValueAnimator.ofInt(0, 255);
        paint.setColor(n8g.l(-1, 112));
        paint2.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setAlpha(0);
        Context context2 = e43.a;
        b.j(textPaint, context2 == null ? null : context2, FontFamily.MEDIUM, Float.valueOf(14.0f), 8);
        textPaint.setShadowLayer(iah0.b(4.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, e43.a.getColor(R.color.vk_black_alpha24));
    }

    private final String getCounterLabelText() {
        int i = ((int) (this.p + this.q)) / 1000;
        gpt0 gpt0Var = gpt0.a;
        return z8s.a(i);
    }

    public final int getMaxDurationMs() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        float f;
        float f2;
        super.onDraw(canvas);
        this.m.draw(canvas);
        float f3 = this.c;
        float f4 = this.e;
        RectF rectF = this.i;
        float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f6 = this.d;
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, f6, f3 + f4);
        RectF rectF2 = this.h;
        rectF2.set(rectF);
        rectF2.right = getWidth() - f6;
        float width = rectF2.width() - f6;
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            paint = this.k;
            f = this.g;
            if (i >= size) {
                break;
            }
            float min = Math.min(rectF.right + (i == 0 ? f5 : f), rectF2.right);
            rectF.left = min;
            float min2 = Math.min(((((Number) arrayList.get(i)).floatValue() * width) / this.b) + min, rectF2.right);
            rectF.right = min2;
            if (min2 == rectF2.right) {
                f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            } else {
                f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                rectF.right = Math.max(min2 - f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            float f7 = this.r;
            canvas.drawRoundRect(rectF, f7, f7, paint);
            i++;
            f5 = f2;
        }
        float f8 = f5;
        float f9 = rectF.right;
        if (!arrayList.isEmpty()) {
            f8 = f;
        }
        rectF2.left = Math.min(f9 + f8, rectF2.right);
        float f10 = this.r;
        canvas.drawRoundRect(rectF2, f10, f10, this.j);
        float f11 = rectF2.left;
        rectF.left = f11;
        rectF.right = Math.min(((this.q * width) / this.b) + f11, rectF2.right);
        float f12 = this.r;
        canvas.drawRoundRect(rectF, f12, f12, paint);
        Long l = this.s;
        if (l != null) {
            float longValue = l.longValue();
            if (longValue > this.q) {
                float b = n0.b(width, this.b, longValue, rectF.left);
                float centerY = rectF.centerY();
                float f13 = f4 / 2;
                int i2 = (int) (b - f13);
                int i3 = (int) (centerY - f13);
                int i4 = (int) (b + f13);
                int i5 = (int) (f13 + centerY);
                Drawable drawable = this.n;
                drawable.setBounds(i2, i3, i4, i5);
                drawable.draw(canvas);
            }
        }
        TextPaint textPaint = this.l;
        if (textPaint.getAlpha() > 0) {
            String counterLabelText = getCounterLabelText();
            float f14 = 2;
            canvas.drawText(counterLabelText, ((width / f14) + f6) - (textPaint.measureText(counterLabelText) / f14), rectF.bottom + f3 + this.f, textPaint);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.m.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        this.r = getMeasuredHeight() / 2.0f;
    }

    public final void setCountDownMarker(Long l) {
        this.s = l;
        invalidate();
    }

    public final void setCounterLabelVisibility(boolean z) {
        ValueAnimator valueAnimator = this.t;
        valueAnimator.cancel();
        valueAnimator.setIntValues(this.l.getAlpha(), z ? 255 : 0);
        valueAnimator.setDuration(200L);
        valueAnimator.addUpdateListener(new vye(this, 0));
        valueAnimator.start();
        invalidate();
    }

    public final void setCurrentSectionProgress(float f) {
        this.q = f;
        invalidate();
    }

    public final void setMaxDurationMs(int i) {
        if (i != this.b) {
            this.b = i;
            invalidate();
        }
    }
}
