package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ib5 extends Drawable {
    public static final float l = (float) Math.toRadians(45.0d);
    public final Paint a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final Path g;
    public final int h;
    public float i;
    public final float j;
    public final int k;

    public ib5(Context context) {
        Paint paint = new Paint();
        this.a = paint;
        this.g = new Path();
        this.k = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, dkf.n, R.attr.drawerArrowStyle, R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        int color = obtainStyledAttributes.getColor(3, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = obtainStyledAttributes.getDimension(7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.j = (float) (Math.cos(l) * (dimension / 2.0f));
            invalidateSelf();
        }
        boolean z = obtainStyledAttributes.getBoolean(6, true);
        if (this.f != z) {
            this.f = z;
            invalidateSelf();
        }
        float round = Math.round(obtainStyledAttributes.getDimension(5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        if (round != this.e) {
            this.e = round;
            invalidateSelf();
        }
        this.h = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.c = Math.round(obtainStyledAttributes.getDimension(2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        this.b = Math.round(obtainStyledAttributes.getDimension(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        this.d = obtainStyledAttributes.getDimension(1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        obtainStyledAttributes.recycle();
    }

    public static float a(float f, float f2, float f3) {
        return me4.b(f2, f, f3, f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        boolean z = false;
        int i = this.k;
        if (i != 0 && (i == 1 || (i == 3 ? getLayoutDirection() == 0 : getLayoutDirection() == 1))) {
            z = true;
        }
        float f = this.b;
        float sqrt = (float) Math.sqrt(f * f * 2.0f);
        float f2 = this.i;
        float f3 = this.c;
        float a = a(f3, sqrt, f2);
        float a2 = a(f3, this.d, this.i);
        float f4 = this.i;
        float f5 = this.j;
        float round = Math.round(a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5, f4));
        float a3 = a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, l, this.i);
        float a4 = a(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.i);
        double d = a;
        double d2 = a3;
        float round2 = Math.round(Math.cos(d2) * d);
        float round3 = Math.round(Math.sin(d2) * d);
        Path path = this.g;
        path.rewind();
        Paint paint = this.a;
        float strokeWidth = paint.getStrokeWidth();
        float f6 = this.e;
        float a5 = a(strokeWidth + f6, -f5, this.i);
        float f7 = (-a2) / 2.0f;
        path.moveTo(f7 + round, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        path.rLineTo(a2 - (round * 2.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        path.moveTo(f7, a5);
        path.rLineTo(round2, round3);
        path.moveTo(f7, -a5);
        path.rLineTo(round2, -round3);
        path.close();
        canvas.save();
        canvas.translate(bounds.centerX(), (paint.getStrokeWidth() * 1.5f) + f6 + ((((int) ((bounds.height() - (3.0f * r4)) - (f6 * 2.0f))) / 4) * 2));
        if (this.f) {
            canvas.rotate(a4 * (z ? -1 : 1));
        } else if (z) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.a;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f) {
        if (this.i != f) {
            this.i = f;
            invalidateSelf();
        }
    }
}
