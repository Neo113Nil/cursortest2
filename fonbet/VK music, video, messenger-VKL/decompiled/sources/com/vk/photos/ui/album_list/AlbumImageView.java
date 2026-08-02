package com.vk.photos.ui.album_list;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.drawee.generic.RoundingParams;
import com.unity3d.services.UnityAdsConstants;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.f5h0;
import xsna.iah0;
import xsna.ojt;

/* compiled from: AlbumImageView.kt */
/* loaded from: classes3.dex */
public final class AlbumImageView extends VKImageView {
    public boolean m;
    public final a n;

    public AlbumImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a aVar = new a(this, iah0.b(4.0f));
        this.n = aVar;
        setOverlayImage(aVar);
    }

    @Override // com.vk.imageloader.view.VKImageView
    public final void K0(ojt ojtVar) {
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.f(iah0.b(4.0f));
        ojtVar.q = roundingParams;
        ojtVar.l = f5h0.f.a;
    }

    @Override // android.view.View
    public final a getOverlay() {
        return this.n;
    }

    public final boolean getQuad() {
        return this.m;
    }

    @Override // xsna.zjt, android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.m) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824));
        } else {
            super.onMeasure(i, i2);
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        a aVar = this.n;
        RectF rectF = aVar.b;
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredWidth, measuredHeight);
        Paint paint = aVar.d;
        rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
        Path path = aVar.c;
        path.reset();
        float f = aVar.a;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        aVar.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public final void setQuad(boolean z) {
        this.m = z;
    }

    /* compiled from: AlbumImageView.kt */
    public final class a extends Drawable {
        public final float a;
        public final RectF b = new RectF();
        public final Path c = new Path();
        public final Paint d;

        public a(AlbumImageView albumImageView, float f) {
            this.a = f;
            Paint paint = new Paint(1);
            Context context = albumImageView.getContext();
            e3m.a aVar = e3m.a;
            paint.setColor(context.getColor(R.color.black_opacity_08));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(iah0.b(0.3f));
            this.d = paint;
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            canvas.drawPath(this.c, this.d);
        }

        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
