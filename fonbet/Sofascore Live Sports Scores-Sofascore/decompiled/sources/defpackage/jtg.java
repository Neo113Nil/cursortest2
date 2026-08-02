package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jtg extends Drawable implements Drawable.Callback, Animatable {
    public final ArrayList a;
    public final float b;
    public final float c;
    public float d;
    public float e;
    public boolean f;
    public int g;
    public final Paint h;
    public final int i;
    public final joa j;
    public final ValueAnimator k;

    public jtg(Context context) {
        context.getClass();
        this.a = new ArrayList();
        this.b = ao2.u(2, context);
        this.c = ao2.u(24, context);
        Paint paint = new Paint();
        paint.setColor(context.getColor(R.color.score_highlight));
        this.h = paint;
        this.i = paint.getAlpha();
        this.j = ypa.a(ysa.c, new e6g(this, 9));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new s2(this, 17));
        ofFloat.addListener(new itg(this, 1));
        ofFloat.addListener(new itg(this, 0));
        this.k = ofFloat;
        mutate();
    }

    public final void a(boolean z) {
        if (!isRunning() && this.g == 3) {
            this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (z) {
            start();
        } else {
            if (isRunning() || this.g != 2) {
                return;
            }
            this.f = true;
            this.k.reverse();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        canvas.clipPath((Path) this.j.getValue());
        canvas.drawRect(getBounds().width() * this.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getBounds().width() * this.e, getBounds().height(), this.h);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        drawable.getClass();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.g == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        rect.getClass();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        drawable.getClass();
        runnable.getClass();
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.h.setAlpha(i);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (isRunning() || this.g == 2) {
            return;
        }
        this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f = false;
        this.k.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.g != 3) {
            this.g = 3;
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((p50) it.next()).a(this);
            }
            this.k.cancel();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        drawable.getClass();
        runnable.getClass();
        unscheduleSelf(runnable);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
