package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zah extends Drawable implements Drawable.Callback {
    public int a;
    public long b;
    public int c;
    public int d;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i = this.a;
        boolean z = false;
        if (i != 1) {
            if (i == 2 && this.b >= 0) {
                float uptimeMillis = (SystemClock.uptimeMillis() - this.b) / UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                r2 = uptimeMillis >= 1.0f;
                if (r2) {
                    this.a = 0;
                }
                this.d = (int) ((Math.min(uptimeMillis, 1.0f) * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            z = r2;
        } else {
            this.b = SystemClock.uptimeMillis();
            this.a = 2;
        }
        if (!z) {
            throw null;
        }
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        super.getChangingConfigurations();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.d == this.c) {
            this.d = i;
        }
        this.c = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
