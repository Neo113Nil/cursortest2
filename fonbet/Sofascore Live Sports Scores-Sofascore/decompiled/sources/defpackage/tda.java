package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class tda extends Drawable {
    public final Context a;
    public final int b;
    public final int c;
    public final float d;
    public final int e;
    public final float f;
    public final float g;
    public final int h;
    public float i;
    public Bitmap j;
    public Bitmap k;
    public Bitmap l;
    public String m;
    public final Rect n;
    public Paint o;
    public final Paint p;
    public float q;
    public boolean r;
    public final RectF s;
    public final Rect t;
    public final RectF u;
    public final Rect v;
    public final Paint w;

    public tda(Context context) {
        context.getClass();
        this.a = context;
        this.b = ao2.s(32, context);
        this.c = ao2.s(28, context);
        this.d = ao2.u(16, context);
        this.e = ao2.s(16, context);
        this.f = ao2.u(2, context);
        this.g = ao2.u(4, context);
        this.h = ao2.s(6, context);
        ao2.s(16, context);
        this.m = "";
        this.n = new Rect();
        Paint paint = new Paint();
        paint.setTypeface(z1g.a(R.font.sofascore_sans_bold_condensed, context));
        paint.setTextSize(ao2.u(18, context));
        paint.setTextAlign(Paint.Align.CENTER);
        this.p = paint;
        this.s = new RectF();
        this.t = new Rect();
        new RectF();
        new Rect();
        new Path();
        new Paint();
        Paint paint2 = new Paint();
        paint2.setTypeface(z1g.a(R.font.sofascore_sans_bold_condensed, context));
        paint2.setColor(context.getColor(R.color.surface_1));
        paint2.setTextSize(ao2.u(12, context));
        this.u = new RectF();
        this.v = new Rect();
        Paint paint3 = new Paint();
        paint3.setTypeface(z1g.a(R.font.sofascore_sans_bold_condensed, context));
        paint3.setColor(context.getColor(R.color.secondary_default));
        paint3.setTextSize(ao2.u(12, context));
        this.w = paint3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        Bitmap bitmap = this.j;
        float f = this.f;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, this.i + f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.o);
        }
        float f2 = this.i + f;
        int i = this.c;
        int i2 = this.b;
        canvas.drawText(this.m, f2 + (i / 2), ((this.n.height() / 2) + (i2 / 2)) - f, this.p);
        Bitmap bitmap2 = this.l;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, this.i + f + i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
        }
        if (this.v.width() > 0) {
            RectF rectF = this.u;
            canvas.drawText("", rectF.centerX() - r0.centerX(), rectF.centerY() - r0.centerY(), this.w);
        }
        float f3 = this.q;
        RectF rectF2 = this.s;
        if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !this.r) {
            float f4 = i2;
            rectF2.set(f3 + f, f4 / 2.0f, Math.max(this.d, this.t.width() + this.g) + f, f4);
            this.r = true;
        }
        if (rectF2.width() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = (this.q / 2.0f) + (((rectF2.width() / 2.0f) + f) - (this.e / 2));
        }
        Bitmap bitmap3 = this.k;
        if (bitmap3 != null) {
            canvas.drawBitmap(bitmap3, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.b + this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) ((this.f * 2.0f) + ((int) ((this.i * 2.0f) + this.c)));
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
