package com.my.target.nativeads.views;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import xsna.c1z0;
import xsna.gu8;
import xsna.tj0;
import xsna.whz0;
import xsna.wvy0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public class MediaAdView extends FrameLayout {
    public final whz0 b;
    public final ProgressBar c;
    public final wvy0 d;
    public final CollageView e;
    public int f;
    public int g;
    public float h;
    public int i;

    public MediaAdView(@NonNull Context context) {
        super(context);
        this.i = -1;
        this.b = new whz0(context);
        this.d = new wvy0(context);
        this.c = new ProgressBar(context, null, R.attr.progressBarStyle);
        this.e = new CollageView(context);
        a(context);
    }

    public final void a(Context context) {
        Bitmap bitmap;
        View view = this.b;
        c1z0.n(view, "media_image");
        ProgressBar progressBar = this.c;
        c1z0.n(progressBar, "progress_bar");
        wvy0 wvy0Var = this.d;
        c1z0.n(wvy0Var, "play_button");
        View view2 = this.e;
        c1z0.n(view2, "collage_view");
        setBackgroundColor(-1118482);
        progressBar.setVisibility(8);
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setColorFilter(-16733198, PorterDuff.Mode.SRC_ATOP);
        }
        int a = (int) tj0.a(1, 80, context);
        Bitmap bitmap2 = null;
        try {
            bitmap = Bitmap.createBitmap(a, a, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            gu8.c(null, "NativeAdResources: Cannot build play icon - OOME");
            bitmap = null;
        }
        if (bitmap != null) {
            Canvas canvas = new Canvas(bitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(-1157627904);
            float f = a;
            canvas.drawOval(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f), paint);
            Paint paint2 = new Paint();
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(-1);
            paint2.setAntiAlias(true);
            paint2.setStrokeWidth(8);
            paint2.setStrokeCap(Paint.Cap.ROUND);
            float f2 = 4;
            float f3 = a - 4;
            canvas.drawOval(new RectF(f2, f2, f3, f3), paint2);
            Paint paint3 = new Paint();
            paint3.setColor(0);
            canvas.drawPaint(paint3);
            paint3.setStrokeWidth(4.0f);
            paint3.setColor(-1);
            paint3.setStyle(Paint.Style.FILL_AND_STROKE);
            paint3.setAntiAlias(true);
            float f4 = f / 160.0f;
            int i = (int) (60.0f * f4);
            Point point = new Point(i, (int) (50.0f * f4));
            Point point2 = new Point(i, (int) (110.0f * f4));
            Point point3 = new Point((int) (112.0f * f4), (int) (f4 * 80.0f));
            Path path = new Path();
            path.setFillType(Path.FillType.EVEN_ODD);
            path.moveTo(point.x, point.y);
            path.lineTo(point2.x, point2.y);
            path.lineTo(point3.x, point3.y);
            path.lineTo(point.x, point.y);
            path.close();
            canvas.drawPath(path, paint3);
            bitmap2 = bitmap;
        }
        wvy0Var.a(bitmap2, false);
        wvy0Var.setVisibility(8);
        view2.setVisibility(8);
        addView(view);
        addView(wvy0Var, new FrameLayout.LayoutParams(-2, -2));
        addView(progressBar, new FrameLayout.LayoutParams(-2, -2));
        addView(view2, new FrameLayout.LayoutParams(-1, -2));
    }

    public final void b(int i, int i2) {
        this.f = i;
        this.g = i2;
        whz0 whz0Var = this.b;
        whz0Var.e = i;
        whz0Var.d = i2;
        float f = i2;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = i / f;
        }
        this.h = f2;
    }

    @NonNull
    public CollageView getCollageView() {
        return this.e;
    }

    public int getHtml5ViewBackgroundColor() {
        return this.i;
    }

    @NonNull
    public ImageView getImageView() {
        return this.b;
    }

    public float getMediaAspectRatio() {
        return this.h;
    }

    @NonNull
    public View getPlayButtonView() {
        return this.d;
    }

    @NonNull
    public ProgressBar getProgressBarView() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredWidth != 0 && measuredHeight != 0) {
                    int i6 = ((i3 - i) - measuredWidth) / 2;
                    int i7 = ((i4 - i2) - measuredHeight) / 2;
                    childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i5 = this.f;
        if (i5 == 0 || (i3 = this.g) == 0) {
            if (mode != 1073741824) {
                size = 0;
            }
            if (mode2 != 1073741824) {
                size2 = 0;
            }
            setMeasuredDimension(size, size2);
            return;
        }
        float f = i5 / i3;
        if (mode == 0 && mode2 == 0) {
            super.onMeasure(i, i2);
            return;
        }
        if (mode == 0) {
            size = (int) (size2 * f);
        } else if (mode2 == 0 || mode2 != 1073741824) {
            size2 = (int) (size / f);
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                int i7 = Integer.MIN_VALUE;
                if (layoutParams != null) {
                    i4 = layoutParams.width == -1 ? 1073741824 : Integer.MIN_VALUE;
                    if (layoutParams.height == -1) {
                        i7 = 1073741824;
                    }
                } else {
                    i4 = Integer.MIN_VALUE;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, i4), View.MeasureSpec.makeMeasureSpec(size2, i7));
                if (childAt.getMeasuredHeight() > 0) {
                    z = true;
                }
            }
        }
        if (z) {
            setMeasuredDimension(size, size2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setHtml5ViewBackgroundColor(int i) {
        this.i = i;
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.d.setOnClickListener(onClickListener);
    }

    public MediaAdView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = -1;
        this.b = new whz0(context);
        this.d = new wvy0(context);
        this.c = new ProgressBar(context, null, R.attr.progressBarStyle);
        this.e = new CollageView(context);
        a(context);
    }
}
