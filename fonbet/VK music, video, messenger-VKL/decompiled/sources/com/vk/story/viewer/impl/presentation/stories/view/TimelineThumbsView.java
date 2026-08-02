package com.vk.story.viewer.impl.presentation.stories.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.TimelineThumbs;
import com.vkontakte.android.R;
import java.util.List;
import xsna.an10;
import xsna.asu0;
import xsna.bxo0;
import xsna.iah0;
import xsna.lyl0;
import xsna.mcr0;
import xsna.n240;

/* compiled from: TimelineThumbsView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class TimelineThumbsView extends AppCompatImageView {
    public static final /* synthetic */ int h = 0;
    public final float b;
    public Path c;
    public RectF d;
    public final Paint e;
    public TimelineThumbs f;
    public float g;

    /* compiled from: TimelineThumbsView.kt */
    public final class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            TimelineThumbsView timelineThumbsView = TimelineThumbsView.this;
            timelineThumbsView.getViewTreeObserver().removeOnPreDrawListener(this);
            timelineThumbsView.U();
            return true;
        }
    }

    public TimelineThumbsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = iah0.a(8);
        this.d = new RectF();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(20.0f);
        paint.setColor(context.getColor(R.color.vk_white));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        this.e = paint;
        setScaleType(ImageView.ScaleType.MATRIX);
        setBackgroundColor(context.getColor(R.color.white_alpha30));
        setWillNotDraw(false);
        setClipToOutline(true);
        setOutlineProvider(new bxo0(this));
        getViewTreeObserver().addOnPreDrawListener(new a());
        setElevation(iah0.a(10.0f));
    }

    public final void U() {
        TimelineThumbs timelineThumbs = this.f;
        if (timelineThumbs != null) {
            int i = timelineThumbs.f;
            int i2 = timelineThumbs.d;
            if (timelineThumbs.b == 0 || timelineThumbs.c == 0 || getWidth() == 0 || getHeight() == 0 || getDrawable() == null) {
                return;
            }
            Matrix matrix = new Matrix();
            int intrinsicWidth = getDrawable().getIntrinsicWidth() / i2;
            float f = intrinsicWidth;
            float width = getWidth() / f;
            float intrinsicHeight = getDrawable().getIntrinsicHeight() / an10.a(Math.ceil(i / i2));
            float height = getHeight() / intrinsicHeight;
            double min = Math.min(Math.floor(i * this.g), i - 1);
            int floor = (int) Math.floor(min % i2);
            int floor2 = (int) Math.floor(min / i2);
            matrix.setScale(width, height);
            matrix.postTranslate((-width) * f * floor, (-height) * intrinsicHeight * floor2);
            setImageMatrix(matrix);
        }
    }

    public final float getPercent() {
        return this.g;
    }

    public final TimelineThumbs getTimelineThumbs() {
        return this.f;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Path path = this.c;
        if (path == null) {
            path = null;
        }
        canvas.clipPath(path);
        super.onDraw(canvas);
        RectF rectF = this.d;
        float f = this.b;
        canvas.drawRoundRect(rectF, f, f, this.e);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.f != null) {
            int max = Math.max(size, size2);
            float f = r0.c / r0.b;
            if (f >= 1.0f) {
                i3 = max;
                max = (int) (max / f);
            } else {
                i3 = (int) (max * f);
            }
            int[] iArr = {max, i3};
            int i4 = iArr[0];
            size2 = iArr[1];
            size = i4;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i == i3 && i2 == i4) {
            return;
        }
        this.c = new Path();
        RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i2);
        this.d = rectF;
        Path path = this.c;
        if (path == null) {
            path = null;
        }
        float f = this.b;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        setOutlineProvider(new bxo0(this));
        U();
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        U();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        U();
    }

    public final void setPercent(float f) {
        this.g = f;
        U();
    }

    public final void setTimelineThumbs(TimelineThumbs timelineThumbs) {
        this.f = timelineThumbs;
        if (timelineThumbs != null) {
            List<String> list = timelineThumbs.i;
            List<String> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            String str = list.get(0);
            Bitmap k = mcr0.k(str);
            if (k == null) {
                mcr0.h(Uri.parse(str)).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new n240(new lyl0(this, 5), 25));
            } else {
                setImageBitmap(k);
            }
        }
    }
}
