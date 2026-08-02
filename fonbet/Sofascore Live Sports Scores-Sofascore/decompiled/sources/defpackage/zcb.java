package defpackage;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zcb implements View.OnTouchListener {
    public static final int q = ViewConfiguration.getTapTimeout();
    public final xr0 a;
    public final AccelerateInterpolator b;
    public final qc5 c;
    public b8 d;
    public final float[] e;
    public final float[] f;
    public final int g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final qc5 p;

    public zcb(qc5 qc5Var) {
        xr0 xr0Var = new xr0();
        xr0Var.e = Long.MIN_VALUE;
        xr0Var.g = -1L;
        xr0Var.f = 0L;
        this.a = xr0Var;
        this.b = new AccelerateInterpolator();
        float[] fArr = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        this.e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f = fArr2;
        float[] fArr3 = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        this.h = fArr3;
        float[] fArr4 = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        this.i = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.j = fArr5;
        this.c = qc5Var;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.g = q;
        xr0Var.a = 500;
        xr0Var.b = 500;
        this.p = qc5Var;
    }

    public static float b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f, float f2, float f3, int i) {
        float f4;
        float interpolation;
        float b = b(this.e[i] * f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f[i]);
        float c = c(f2 - f, b) - c(f, b);
        AccelerateInterpolator accelerateInterpolator = this.b;
        if (c < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            interpolation = -accelerateInterpolator.getInterpolation(-c);
        } else {
            if (c <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f4 = 0.0f;
                if (f4 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                float f5 = this.h[i];
                float f6 = this.i[i];
                float f7 = this.j[i];
                float f8 = f5 * f3;
                return f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? b(f4 * f8, f6, f7) : -b((-f4) * f8, f6, f7);
            }
            interpolation = accelerateInterpolator.getInterpolation(c);
        }
        f4 = b(interpolation, -1.0f, 1.0f);
        if (f4 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
        }
    }

    public final float c(float f, float f2) {
        if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f < f2) {
            if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return 1.0f - (f / f2);
            }
            if (this.n) {
                return 1.0f;
            }
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void d() {
        int i = 0;
        if (this.l) {
            this.n = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        xr0 xr0Var = this.a;
        int i2 = (int) (currentAnimationTimeMillis - xr0Var.e);
        int i3 = xr0Var.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        xr0Var.i = i;
        xr0Var.h = xr0Var.a(currentAnimationTimeMillis);
        xr0Var.g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        qc5 qc5Var;
        int count;
        xr0 xr0Var = this.a;
        float f = xr0Var.d;
        int abs = (int) (f / Math.abs(f));
        Math.abs(xr0Var.c);
        if (abs != 0 && (count = (qc5Var = this.p).getCount()) != 0) {
            int childCount = qc5Var.getChildCount();
            int firstVisiblePosition = qc5Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && qc5Var.getChildAt(0).getTop() >= 0)) : !(i >= count && qc5Var.getChildAt(childCount - 1).getBottom() <= qc5Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (this.o) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.m = true;
            this.k = false;
            float x = motionEvent.getX();
            float width = view.getWidth();
            qc5 qc5Var = this.c;
            float a = a(x, width, qc5Var.getWidth(), 0);
            float a2 = a(motionEvent.getY(), view.getHeight(), qc5Var.getHeight(), 1);
            xr0 xr0Var = this.a;
            xr0Var.c = a;
            xr0Var.d = a2;
            if (!this.n && e()) {
                b8 b8Var = this.d;
                if (b8Var == null) {
                    b8Var = new b8(this, 5);
                    this.d = b8Var;
                }
                this.n = true;
                this.l = true;
                if (this.k || (i = this.g) <= 0) {
                    b8Var.run();
                } else {
                    long j = i;
                    WeakHashMap weakHashMap = bsk.a;
                    qc5Var.postOnAnimationDelayed(b8Var, j);
                }
                this.k = true;
            }
        }
        return false;
    }
}
