package com.vk.core.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import xsna.iah0;

@Deprecated
/* loaded from: classes17.dex */
public class RatingView extends View {
    public static final int f = iah0.a(14.1f);
    public static final int g = iah0.a(2.5f);
    public final Path b;
    public float c;
    public final Paint d;
    public final Paint e;

    public RatingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Path();
        double radians = Math.toRadians(72.0d);
        double radians2 = Math.toRadians(36.0d);
        double d = f / 2;
        this.b.moveTo((float) d, (float) ((-d) + d));
        for (int i = 0; i < 5; i++) {
            double d2 = i * radians;
            this.b.lineTo((float) ((-(Math.sin(d2) * d)) + d), (float) ((-(Math.cos(d2) * d)) + d));
            double d3 = d2 + radians2;
            this.b.lineTo((float) ((-(Math.sin(d3) * d * 0.4000000059604645d)) + d), (float) ((-(Math.cos(d3) * d * 0.4000000059604645d)) + d));
        }
        this.b.close();
        Paint paint = new Paint();
        this.d = paint;
        paint.setAntiAlias(true);
        this.d.setColor(-7631217);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setAntiAlias(true);
        this.e.setColor(-2368549);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z = Math.floor((double) this.c) != Math.ceil((double) this.c);
        int height = getHeight() / 2;
        int i = f;
        canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, height - (i / 2));
        for (int i2 = 0; i2 < 5; i2++) {
            canvas.save();
            canvas.translate(getPaddingLeft() + (g * i2) + (i * i2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            if (z && i2 + 1 == Math.ceil(this.c)) {
                canvas.save();
                float f2 = this.c;
                canvas.clipRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.round((f2 - Math.floor(f2)) * i), canvas.getHeight());
                canvas.drawPath(this.b, this.d);
                canvas.restore();
                float f3 = this.c;
                canvas.clipRect(Math.round((f3 - Math.floor(f3)) * i), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, canvas.getWidth(), canvas.getHeight());
                canvas.drawPath(this.b, this.e);
            } else {
                canvas.drawPath(this.b, ((float) (i2 + 1)) <= this.c ? this.d : this.e);
            }
            canvas.restore();
        }
    }

    public void setRating(float f2) {
        this.c = f2;
        invalidate();
    }
}
