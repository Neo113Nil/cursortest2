package com.vk.stickers.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.cn70;

/* compiled from: RoundImageView.kt */
/* loaded from: classes6.dex */
public final class RoundImageView extends AppCompatImageView {
    public final RectF b;
    public final Path c;
    public final Paint d;
    public final float e;

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new RectF();
        this.c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setColor(context.getColor(R.color.vk_black_alpha8));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(cn70.a() * 0.5f);
        this.e = cn70.a() * 10.0f;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.clipPath(this.c);
        super.onDraw(canvas);
        float f = this.e;
        canvas.drawRoundRect(this.b, f, f, this.d);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.b;
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredWidth, measuredHeight);
        Path path = this.c;
        path.reset();
        float f = this.e;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
    }
}
