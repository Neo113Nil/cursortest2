package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jxd extends Drawable {
    public float a;
    public boolean d;
    public boolean e;
    public Paint f;
    public final Paint h;
    public ixd i;
    public float j;
    public float[] b = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
    public final Path c = new Path();
    public final Paint g = new Paint(1);

    public jxd() {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setFilterBitmap(true);
        paint.setAntiAlias(true);
        this.h = paint;
        this.i = gxd.a;
    }

    public final Path a() {
        Path path = this.c;
        path.reset();
        path.addRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getBounds().width(), getBounds().height(), this.b, Path.Direction.CW);
        return path;
    }

    public final void b(int i, Integer num, Integer num2) {
        Paint paint;
        this.e = (num == null || num.intValue() == 0) ? false : true;
        this.g.setColor(i);
        if (num != null) {
            this.h.setColor(num.intValue());
        }
        if (num2 != null) {
            int alpha = Color.alpha(num2.intValue());
            paint = new Paint(1);
            paint.setColor(num2.intValue());
            if (alpha == 255) {
                paint.setAlpha(13);
            }
        } else {
            paint = null;
        }
        this.f = paint;
        invalidateSelf();
    }

    public final void c(ixd ixdVar, float f) {
        this.i = ixdVar;
        this.j = f;
        this.b = ixdVar.equals(ug5.c) ? new float[]{f, f, f, f, f, f, f, f} : ixdVar.equals(hxd.a) ? new float[]{f, f, f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT} : ixdVar.equals(fxd.a) ? new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, f, f} : new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        boolean z = this.e;
        Paint paint = this.g;
        if (!z) {
            canvas.drawPath(a(), paint);
            return;
        }
        if (this.d) {
            canvas.drawPath(a(), paint);
        } else {
            canvas.drawRect(getBounds(), paint);
        }
        Paint paint2 = this.f;
        if (paint2 != null) {
            canvas.drawPath(a(), paint2);
        }
        float width = getBounds().width();
        float height = getBounds().height();
        float f = this.a / 2.0f;
        float f2 = width - f;
        float f3 = height - f;
        Path path = this.c;
        path.reset();
        float[] fArr = this.b;
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = f + f4;
        path.moveTo(f6, f);
        float f7 = this.b[2];
        if (f7 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            path.lineTo(f2 - f7, f);
        } else {
            path.moveTo(f2 - f, f);
        }
        path.quadTo(f2, f, f2, this.b[3] + f);
        float f8 = this.b[5];
        if (f8 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            path.lineTo(f2, f3 - f8);
        } else {
            path.lineTo(f2, f3 + f);
        }
        path.quadTo(f2, f3, f2 - this.b[4], f3);
        float f9 = this.b[6];
        if (f9 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            path.lineTo(f9 + f, f3);
        } else {
            path.moveTo(f, f3 + f);
        }
        path.quadTo(f, f3, f, f3 - this.b[7]);
        if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            path.lineTo(f, f5 + f);
        } else {
            path.lineTo(f, f - f);
        }
        path.quadTo(f, f, f6, f);
        canvas.drawPath(path, this.h);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.getClass();
        if (this.e) {
            outline.setRect(getBounds());
            return;
        }
        ixd ixdVar = this.i;
        if (ixdVar instanceof hxd) {
            int i = getBounds().left;
            int i2 = getBounds().top;
            int i3 = getBounds().right;
            int i4 = getBounds().bottom;
            float f = this.j;
            outline.setRoundRect(i, i2, i3, i4 + ((int) f), f);
            return;
        }
        if (ixdVar instanceof fxd) {
            outline.setRoundRect(getBounds().left, getBounds().top - ((int) this.j), getBounds().right, getBounds().bottom, this.j);
        } else if (ixdVar instanceof gxd) {
            outline.setRect(getBounds());
        } else {
            outline.setRoundRect(getBounds(), this.j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.g.setAlpha(i);
        this.h.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
