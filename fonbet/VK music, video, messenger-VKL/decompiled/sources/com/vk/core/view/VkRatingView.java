package com.vk.core.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import xsna.iah0;
import xsna.ozl;

/* compiled from: VkRatingView.kt */
@ozl
/* loaded from: classes17.dex */
public final class VkRatingView extends View {
    public static final int h = iah0.a(10);
    public final Path b;
    public final Paint c;
    public final Paint d;
    public float e;
    public int f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VkRatingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Path path = new Path();
        this.b = path;
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.f = -24576;
        this.g = -2130731008;
        double radians = Math.toRadians(72.0d);
        double radians2 = Math.toRadians(36.0d);
        double d = h / 2;
        path.moveTo((float) d, (float) ((-d) + d));
        for (int i = 0; i < 5; i++) {
            double d2 = i * radians;
            this.b.lineTo((float) ((-(Math.sin(d2) * d)) + d), (float) ((-(Math.cos(d2) * d)) + d));
            double d3 = d2 + radians2;
            double d4 = 0.4f;
            this.b.lineTo((float) ((-(Math.sin(d3) * d * d4)) + d), (float) ((-(Math.cos(d3) * d * d4)) + d));
        }
        this.b.close();
        this.c.setColor(this.f);
        this.d.setColor(this.g);
    }

    public final int getEmptyColor() {
        return this.g;
    }

    public final int getFilledColor() {
        return this.f;
    }

    public final float getRating() {
        return this.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        int i = 0;
        boolean z = Math.floor((double) this.e) == Math.ceil((double) this.e);
        int height = getHeight() / 2;
        int i2 = h;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, height - (i2 / 2));
        while (i < 5) {
            int save = canvas.save();
            canvas.translate(getPaddingLeft() + (i2 * i), f2);
            Paint paint = this.d;
            Paint paint2 = this.c;
            Path path = this.b;
            if (z || i + 1 != Math.ceil(this.e)) {
                f = f2;
                if (i + 1 <= this.e) {
                    canvas.drawPath(path, paint2);
                } else {
                    canvas.drawPath(path, paint);
                }
            } else {
                int save2 = canvas.save();
                float f3 = this.e;
                canvas.clipRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.round((f3 - Math.floor(f3)) * i2), canvas.getHeight());
                canvas.drawPath(path, paint2);
                canvas.restoreToCount(save2);
                float f4 = this.e;
                float round = Math.round((f4 - Math.floor(f4)) * i2);
                float width = canvas.getWidth();
                float height2 = canvas.getHeight();
                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                canvas.clipRect(round, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height2);
                canvas.drawPath(path, paint);
            }
            canvas.restoreToCount(save);
            i++;
            f2 = f;
        }
    }

    public final void setEmptyColor(int i) {
        this.g = i;
        invalidate();
    }

    public final void setFilledColor(int i) {
        this.f = i;
        invalidate();
    }

    public final void setRating(float f) {
        this.e = f;
        invalidate();
    }
}
