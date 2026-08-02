package com.vk.newsfeed.impl.posting.newposter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.iah0;

/* compiled from: NewPosterImageView.kt */
/* loaded from: classes4.dex */
public final class NewPosterImageView extends VKImageView {
    public static final float u = iah0.a(1);
    public final Paint m;
    public final Paint n;
    public final Paint o;
    public final RectF p;
    public Bitmap q;
    public int r;
    public int s;
    public float t;

    public NewPosterImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        this.m = new Paint(1);
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.o = paint2;
        this.p = new RectF();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setColor(dhr0.t.c(R.attr.vk_ui_image_border_alpha));
        paint2.setStrokeWidth(u);
        paint2.setStyle(Paint.Style.STROKE);
    }

    public final float getRadius() {
        return this.t;
    }

    @Override // com.vk.imageloader.view.VKImageView, xsna.zjt, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.q;
        if (bitmap == null) {
            return;
        }
        canvas.drawBitmap(bitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.m);
    }

    @Override // xsna.zjt, android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int color;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        if (size2 != this.s || size != this.r) {
            RectF rectF = this.p;
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, size, size2);
            this.q = Bitmap.createBitmap(size, size2, Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(this.q);
            if (getDrawable() instanceof ColorDrawable) {
                color = ((ColorDrawable) getDrawable()).getColor();
            } else {
                Drawable background = getBackground();
                ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
                color = colorDrawable != null ? colorDrawable.getColor() : -1;
            }
            canvas.drawColor(color);
            float f = this.t;
            canvas.drawRoundRect(rectF, f, f, this.n);
            float f2 = u / 2.0f;
            float f3 = rectF.right - f2;
            float f4 = rectF.bottom - f2;
            float f5 = this.t;
            canvas.drawRoundRect(f2, f2, f3, f4, f5, f5, this.o);
        }
        this.r = size;
        this.s = size2;
    }

    public final void setRadius(float f) {
        this.t = f;
    }
}
