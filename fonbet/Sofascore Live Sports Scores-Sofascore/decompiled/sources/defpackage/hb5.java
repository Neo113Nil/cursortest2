package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class hb5 extends Drawable implements Animatable {
    public static final e51 m = new e51(10, "growFraction", Float.class);
    public final Context a;
    public final l51 b;
    public ObjectAnimator d;
    public ObjectAnimator e;
    public ArrayList g;
    public boolean h;
    public float i;
    public int k;
    public final float f = -1.0f;
    public final Paint j = new Paint();
    public final Rect l = new Rect();
    public l80 c = new l80();

    public hb5(Context context, l51 l51Var) {
        this.a = context;
        this.b = l51Var;
        setAlpha(255);
    }

    public final float b() {
        l51 l51Var = this.b;
        if (l51Var.g == 0 && l51Var.h == 0) {
            return 1.0f;
        }
        return this.i;
    }

    public final float c() {
        float f = this.f;
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return f;
        }
        boolean z = this instanceof my4;
        l51 l51Var = this.b;
        if (l51Var.b(z) && l51Var.m != 0) {
            l80 l80Var = this.c;
            ContentResolver contentResolver = this.a.getContentResolver();
            l80Var.getClass();
            float f2 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
            if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                float uptimeMillis = (SystemClock.uptimeMillis() % r7) / ((int) ((((z ? l51Var.j : l51Var.k) * 1000.0f) / l51Var.m) * f2));
                return uptimeMillis < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (uptimeMillis % 1.0f) + 1.0f : uptimeMillis;
            }
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final boolean d(boolean z, boolean z2, boolean z3) {
        l80 l80Var = this.c;
        ContentResolver contentResolver = this.a.getContentResolver();
        l80Var.getClass();
        return e(z, z2, z3 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public boolean e(boolean z, boolean z2, boolean z3) {
        ObjectAnimator objectAnimator = this.d;
        int i = 0;
        e51 e51Var = m;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, e51Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            this.d = ofFloat;
            ofFloat.setDuration(500L);
            this.d.setInterpolator(e80.b);
            ObjectAnimator objectAnimator2 = this.d;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                a70.p("Cannot set showAnimator while the current showAnimator is running.");
                return false;
            }
            this.d = objectAnimator2;
            objectAnimator2.addListener(new gb5(this, i));
        }
        int i2 = 1;
        if (this.e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, e51Var, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.e = ofFloat2;
            ofFloat2.setDuration(500L);
            this.e.setInterpolator(e80.b);
            ObjectAnimator objectAnimator3 = this.e;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                a70.p("Cannot set hideAnimator while the current hideAnimator is running.");
                return false;
            }
            this.e = objectAnimator3;
            objectAnimator3.addListener(new gb5(this, i2));
        }
        if (isVisible() || z) {
            ObjectAnimator objectAnimator4 = z ? this.d : this.e;
            ObjectAnimator objectAnimator5 = z ? this.e : this.d;
            if (!z3) {
                if (objectAnimator5.isRunning()) {
                    boolean z4 = this.h;
                    this.h = true;
                    new ValueAnimator[]{objectAnimator5}[0].cancel();
                    this.h = z4;
                }
                if (objectAnimator4.isRunning()) {
                    objectAnimator4.end();
                } else {
                    boolean z5 = this.h;
                    this.h = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.h = z5;
                }
                return super.setVisible(z, false);
            }
            if (!objectAnimator4.isRunning()) {
                boolean z6 = !z || super.setVisible(z, false);
                l51 l51Var = this.b;
                if (!z ? l51Var.h != 0 : l51Var.g != 0) {
                    boolean z7 = this.h;
                    this.h = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.h = z7;
                    return z6;
                }
                if (z2 || !objectAnimator4.isPaused()) {
                    objectAnimator4.start();
                    return z6;
                }
                objectAnimator4.resume();
                return z6;
            }
        }
        return false;
    }

    public final void f(j51 j51Var) {
        ArrayList arrayList = this.g;
        if (arrayList == null || !arrayList.contains(j51Var)) {
            return;
        }
        this.g.remove(j51Var);
        if (this.g.isEmpty()) {
            this.g = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return true;
        }
        ObjectAnimator objectAnimator2 = this.e;
        return objectAnimator2 != null && objectAnimator2.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.k = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.j.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return d(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        e(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        e(false, true, false);
    }
}
