package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
class InnerZoneDrawable extends Drawable {
    public float a;
    public float b;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.b > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw null;
        }
        canvas.drawCircle(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.a * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }

    @Keep
    public void setPulseAlpha(float f) {
        this.b = f;
        invalidateSelf();
    }

    @Keep
    public void setPulseScale(float f) {
        invalidateSelf();
    }

    @Keep
    public void setScale(float f) {
        this.a = f;
        invalidateSelf();
    }
}
