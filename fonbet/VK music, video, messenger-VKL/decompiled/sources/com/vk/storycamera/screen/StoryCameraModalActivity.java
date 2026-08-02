package com.vk.storycamera.screen;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.storycamera.screen.StoryCameraModalActivity;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.d0m0;
import xsna.dhr0;
import xsna.gq;
import xsna.hlq;
import xsna.iah0;
import xsna.iut0;
import xsna.oo6;

/* loaded from: classes6.dex */
public class StoryCameraModalActivity extends StoryCameraActivity {
    public static final /* synthetic */ int R = 0;

    @Nullable
    public View H;

    @Nullable
    public VelocityTracker I;
    public int J;
    public int K;
    public float L;
    public float M;
    public boolean N = false;
    public boolean O = false;
    public final hlq P = new hlq();

    @Nullable
    public ValueAnimator Q;

    @Override // com.vk.storycamera.screen.StoryCameraActivity
    public final int U1() {
        return dhr0.L() ? R.style.StoryFullscreenActivityTheme_Modal : R.style.StoryFullscreenActivityThemeDark_Modal;
    }

    public final void W1(float f, float f2) {
        final View view = this.H;
        if (view == null) {
            return;
        }
        final int height = view.getHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setDuration(120L);
        ofFloat.setInterpolator(this.P);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.f0m0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i = StoryCameraModalActivity.R;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                view.setTranslationY(floatValue);
                float f3 = height / 2.0f;
                StoryCameraModalActivity.this.getWindow().setDimAmount(1.0f - (Math.min(Math.abs(floatValue), f3) / f3));
            }
        });
        ofFloat.start();
        this.Q = ofFloat;
    }

    @Override // com.vkontakte.android.VKActivity, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ValueAnimator valueAnimator;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        View view = this.H;
        if (view != null && !isFinishing() && ((valueAnimator = this.Q) == null || !valueAnimator.isRunning())) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 || actionMasked == 5) {
                if (!this.N && motionEvent.getPointerCount() == 1) {
                    this.M = motionEvent.getX();
                    this.L = motionEvent.getY();
                    this.N = false;
                    this.O = true;
                    VelocityTracker obtain = VelocityTracker.obtain();
                    this.I = obtain;
                    obtain.addMovement(motionEvent);
                }
            } else if (actionMasked == 2 && this.O) {
                if (motionEvent.getPointerCount() == 1) {
                    VelocityTracker velocityTracker3 = this.I;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    float abs = Math.abs(motionEvent.getX() - this.M);
                    float abs2 = Math.abs(motionEvent.getY() - this.L);
                    if (motionEvent.getY() - this.L > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !this.N && abs2 >= iah0.a(30) && abs2 / 2.0f > abs && this.L >= iah0.a(40)) {
                        this.N = true;
                        this.L = motionEvent.getY();
                    } else if (this.N) {
                        float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, motionEvent.getY() - this.L);
                        view.setTranslationY(max);
                        float height = view.getHeight() / 2.0f;
                        getWindow().setDimAmount(1.0f - (Math.min(Math.abs(max), height) / height));
                    } else {
                        this.M = motionEvent.getX();
                    }
                }
            } else if (this.O && (actionMasked == 3 || actionMasked == 1 || actionMasked == 6)) {
                this.O = false;
                if ((actionMasked == 1 || actionMasked == 6) && (velocityTracker = this.I) != null) {
                    velocityTracker.addMovement(motionEvent);
                    this.I.computeCurrentVelocity(1000);
                }
                if (this.N) {
                    VelocityTracker velocityTracker4 = this.I;
                    boolean z = velocityTracker4 == null || (Math.abs(velocityTracker4.getYVelocity()) > ((float) this.J) && Math.abs(this.I.getYVelocity()) < ((float) this.K));
                    if (gq.a(motionEvent, this.L) > view.getHeight() / 5.0f || z) {
                        ValueAnimator valueAnimator2 = this.Q;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        View view2 = this.H;
                        if (view2 == null) {
                            o5(true);
                        } else {
                            W1(view2.getTranslationY(), view2.getHeight());
                            oo6 oo6Var = new oo6(this, 8);
                            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                            view2.postOnAnimationDelayed(oo6Var, 120L);
                        }
                    } else {
                        ValueAnimator valueAnimator3 = this.Q;
                        if (valueAnimator3 != null) {
                            valueAnimator3.cancel();
                        }
                        View view3 = this.H;
                        if (view3 != null) {
                            W1(view3.getTranslationY(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        }
                    }
                    this.N = false;
                }
                if (actionMasked == 3 && (velocityTracker2 = this.I) != null) {
                    velocityTracker2.recycle();
                    this.I = null;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.vk.storycamera.screen.StoryCameraActivity, xsna.g0m0
    public final void o5(boolean z) {
        d0m0 d0m0Var = this.y;
        if (d0m0Var == null) {
            d0m0Var = null;
        }
        d0m0Var.Hj();
        finish();
        overridePendingTransition(0, z ? R.anim.vk_bottom_sheet_slide_out : 0);
    }

    @Override // com.vk.storycamera.screen.StoryCameraActivity, com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setLayout(-1, -1);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(this);
        this.J = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.K = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        this.H = view;
        super.setContentView(view);
    }
}
