package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zoi implements View.OnTouchListener {
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final View e;
    public final hpo f;
    public int g = 1;
    public float h;
    public float i;
    public boolean j;
    public int k;
    public VelocityTracker l;
    public float m;

    public zoi(View view, hpo hpoVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.a = viewConfiguration.getScaledTouchSlop();
        this.b = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.c = viewConfiguration.getScaledMaximumFlingVelocity();
        this.d = view.getContext().getResources().getInteger(R.integer.config_shortAnimTime);
        this.e = view;
        this.f = hpoVar;
    }

    public final void a(float f, float f2, eb ebVar) {
        float b = b();
        float f3 = f - b;
        float alpha = this.e.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.setDuration(this.d);
        ofFloat.addUpdateListener(new xoi(this, b, f3, alpha, f2 - alpha));
        if (ebVar != null) {
            ofFloat.addListener(ebVar);
        }
        ofFloat.start();
    }

    public float b() {
        return this.e.getTranslationX();
    }

    public void c(float f) {
        this.e.setTranslationX(f);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        motionEvent.offsetLocation(this.m, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        int i = this.g;
        View view2 = this.e;
        if (i < 2) {
            this.g = view2.getWidth();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.h = motionEvent.getRawX();
            this.i = motionEvent.getRawY();
            VelocityTracker obtain = VelocityTracker.obtain();
            this.l = obtain;
            obtain.addMovement(motionEvent);
            return false;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                VelocityTracker velocityTracker = this.l;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                    float rawX = motionEvent.getRawX() - this.h;
                    float rawY = motionEvent.getRawY() - this.i;
                    float abs = Math.abs(rawX);
                    int i2 = this.a;
                    if (abs > i2 && Math.abs(rawY) < Math.abs(rawX) / 2.0f) {
                        this.j = true;
                        if (rawX <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            i2 = -i2;
                        }
                        this.k = i2;
                        view2.getParent().requestDisallowInterceptTouchEvent(true);
                        MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                        obtain2.setAction((motionEvent.getActionIndex() << 8) | 3);
                        view2.onTouchEvent(obtain2);
                        obtain2.recycle();
                    }
                    if (this.j) {
                        this.m = rawX;
                        c(rawX - this.k);
                        view2.setAlpha(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(1.0f, 1.0f - ((Math.abs(rawX) * 2.0f) / this.g))));
                        return true;
                    }
                }
            } else if (actionMasked == 3 && this.l != null) {
                a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, null);
                this.l.recycle();
                this.l = null;
                this.m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.j = false;
                return false;
            }
        } else if (this.l != null) {
            float rawX2 = motionEvent.getRawX() - this.h;
            this.l.addMovement(motionEvent);
            this.l.computeCurrentVelocity(1000);
            float xVelocity = this.l.getXVelocity();
            float abs2 = Math.abs(xVelocity);
            float abs3 = Math.abs(this.l.getYVelocity());
            if (Math.abs(rawX2) > this.g / 2 && this.j) {
                z = rawX2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            } else if (this.b > abs2 || abs2 > this.c || abs3 >= abs2 || abs3 >= abs2 || !this.j) {
                z = false;
                r6 = false;
            } else {
                r6 = ((xVelocity > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (xVelocity == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) < 0) == ((rawX2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (rawX2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) < 0);
                z = this.l.getXVelocity() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            if (r6) {
                a(z ? this.g : -r13, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new eb(this, 11));
            } else if (this.j) {
                a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, null);
            }
            VelocityTracker velocityTracker2 = this.l;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
            }
            this.l = null;
            this.m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.j = false;
            return false;
        }
        return false;
    }
}
