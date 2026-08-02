package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.cast.zzgz;
import com.unity3d.services.UnityAdsConstants;
import xsna.n8g;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
class OuterHighlightDrawable extends Drawable {
    public final int a;
    public final int b;
    public final int c;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Paint f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public int m;

    public OuterHighlightDrawable(Context context) {
        Paint paint = new Paint();
        this.f = paint;
        this.h = 1.0f;
        this.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.m = 244;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        paint.setColor(n8g.l(typedValue.data, 244));
        this.m = paint.getAlpha();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Resources resources = context.getResources();
        this.a = resources.getDimensionPixelSize(com.vkontakte.android.R.dimen.cast_libraries_material_featurehighlight_center_threshold);
        this.b = resources.getDimensionPixelSize(com.vkontakte.android.R.dimen.cast_libraries_material_featurehighlight_center_horizontal_offset);
        this.c = resources.getDimensionPixelSize(com.vkontakte.android.R.dimen.cast_libraries_material_featurehighlight_outer_padding);
    }

    public static final float a(float f, float f2, Rect rect) {
        float f3 = rect.left;
        float f4 = rect.top;
        float f5 = rect.right;
        float f6 = rect.bottom;
        float zza = zzgz.zza(f, f2, f3, f4);
        float zza2 = zzgz.zza(f, f2, f5, f4);
        float zza3 = zzgz.zza(f, f2, f5, f6);
        float zza4 = zzgz.zza(f, f2, f3, f6);
        if (zza <= zza2 || zza <= zza3 || zza <= zza4) {
            zza = (zza2 <= zza3 || zza2 <= zza4) ? zza3 <= zza4 ? zza4 : zza3 : zza2;
        }
        return (float) Math.ceil(zza);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawCircle(this.i + this.k, this.j + this.l, this.g * this.h, this.f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Keep
    public void setScale(float f) {
        this.h = f;
        invalidateSelf();
    }

    @Keep
    public void setTranslationX(float f) {
        this.k = f;
        invalidateSelf();
    }

    @Keep
    public void setTranslationY(float f) {
        this.l = f;
        invalidateSelf();
    }
}
