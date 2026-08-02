package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class my4 extends hb5 {
    public static final ly4 x = new ly4(0);
    public final mb5 n;
    public final d0i o;
    public final kb5 p;
    public float q;
    public boolean r;
    public final ValueAnimator s;
    public ValueAnimator t;
    public TimeInterpolator u;
    public TimeInterpolator v;
    public TimeInterpolator w;

    public my4(Context context, l51 l51Var, mb5 mb5Var) {
        super(context, l51Var);
        this.r = false;
        this.n = mb5Var;
        kb5 kb5Var = new kb5();
        this.p = kb5Var;
        kb5Var.h = true;
        d0i d0iVar = new d0i(this, x);
        this.o = d0iVar;
        e0i e0iVar = new e0i();
        e0iVar.a(1.0f);
        e0iVar.b(50.0f);
        d0iVar.m = e0iVar;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.s = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new p6(5, this, l51Var));
        if (l51Var.b(true) && l51Var.m != 0) {
            valueAnimator.start();
        }
        if (this.i != 1.0f) {
            this.i = 1.0f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.l)) {
            canvas.save();
            Rect bounds = getBounds();
            float b = b();
            ObjectAnimator objectAnimator = this.d;
            boolean z = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.e;
            boolean z2 = objectAnimator2 != null && objectAnimator2.isRunning();
            mb5 mb5Var = this.n;
            mb5Var.a.d();
            mb5Var.a(canvas, bounds, b, z, z2);
            float c = c();
            kb5 kb5Var = this.p;
            kb5Var.f = c;
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.j;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            l51 l51Var = this.b;
            kb5Var.c = l51Var.e[0];
            int i = l51Var.i;
            mb5 mb5Var2 = this.n;
            if (i > 0) {
                if (!(mb5Var2 instanceof t7b)) {
                    i = (int) ((s6a.s(kb5Var.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.01f) * i) / 0.01f);
                }
                this.n.d(canvas, paint, kb5Var.b, 1.0f, l51Var.f, this.k, i);
            } else {
                mb5Var2.d(canvas, paint, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, l51Var.f, this.k, 0);
            }
            int i2 = this.k;
            mb5 mb5Var3 = this.n;
            mb5Var3.c(canvas, paint, kb5Var, i2);
            mb5Var3.b(l51Var.e[0], this.k, canvas, paint);
            canvas.restore();
        }
    }

    @Override // defpackage.hb5
    public final boolean e(boolean z, boolean z2, boolean z3) {
        boolean e = super.e(z, z2, z3);
        l80 l80Var = this.c;
        ContentResolver contentResolver = this.a.getContentResolver();
        l80Var.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.r = true;
            return e;
        }
        this.r = false;
        this.o.m.b(50.0f / f);
        return e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.n.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.n.f();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.o.e();
        this.p.b = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        float f = i;
        l51 l51Var = this.b;
        float f2 = (f < l51Var.o * 10000.0f || f > l51Var.p * 10000.0f) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f;
        boolean z = this.r;
        kb5 kb5Var = this.p;
        d0i d0iVar = this.o;
        if (z) {
            d0iVar.e();
            kb5Var.b = f / 10000.0f;
            invalidateSelf();
            kb5Var.e = f2;
            invalidateSelf();
        } else {
            int width = getBounds().width();
            int height = getBounds().height();
            if (width > 0 && height > 0) {
                if (this.n instanceof t7b) {
                    d0iVar.c(10000.0f / width);
                } else {
                    d0iVar.c((float) (10000.0d / (Math.min(height, width) * 3.141592653589793d)));
                }
            }
            d0iVar.b = kb5Var.b * 10000.0f;
            d0iVar.c = true;
            d0iVar.a(f);
        }
        return true;
    }
}
