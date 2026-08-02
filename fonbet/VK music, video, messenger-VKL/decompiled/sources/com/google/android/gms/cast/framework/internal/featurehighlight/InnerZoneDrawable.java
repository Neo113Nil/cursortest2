package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.cast.zzgy;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public class InnerZoneDrawable extends Drawable {
    public final Paint a;
    public final Paint b;
    public final Rect c;
    public final int d;
    public final int e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;

    public InnerZoneDrawable(Context context) {
        Paint paint = new Paint();
        this.a = paint;
        Paint paint2 = new Paint();
        this.b = paint2;
        this.c = new Rect();
        this.g = 1.0f;
        Resources resources = context.getResources();
        this.d = resources.getDimensionPixelSize(R.dimen.cast_libraries_material_featurehighlight_inner_radius);
        this.e = resources.getInteger(R.integer.cast_libraries_material_featurehighlight_pulse_base_alpha);
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(-1);
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        paint2.setColor(-1);
    }

    public final Animator a() {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scale", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), PropertyValuesHolder.ofInt("alpha", 0), PropertyValuesHolder.ofFloat("pulseScale", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), PropertyValuesHolder.ofFloat("pulseAlpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        ofPropertyValuesHolder.setInterpolator(zzgy.zzb());
        return ofPropertyValuesHolder.setDuration(200L);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f = this.k;
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f2 = this.f * this.j;
            Paint paint = this.b;
            paint.setAlpha((int) (this.e * f));
            canvas.drawCircle(this.h, this.i, f2, paint);
        }
        canvas.drawCircle(this.h, this.i, this.f * this.g, this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Keep
    public void setPulseAlpha(float f) {
        this.k = f;
        invalidateSelf();
    }

    @Keep
    public void setPulseScale(float f) {
        this.j = f;
        invalidateSelf();
    }

    @Keep
    public void setScale(float f) {
        this.g = f;
        invalidateSelf();
    }
}
