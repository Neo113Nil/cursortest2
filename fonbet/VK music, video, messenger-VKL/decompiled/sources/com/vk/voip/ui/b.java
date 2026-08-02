package com.vk.voip.ui;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.voip.ui.VoipViewBehaviour;
import java.util.Objects;
import kotlin.Pair;
import xsna.gb9;
import xsna.smk0;
import xsna.woo;

/* compiled from: VoipViewBehaviour.kt */
/* loaded from: classes7.dex */
public final class b implements View.OnTouchListener {
    public float b;
    public float c;
    public float d;
    public float e;
    public VelocityTracker f;
    public float g;
    public float h;
    public boolean i;
    public final /* synthetic */ VoipViewBehaviour j;

    public b(VoipViewBehaviour voipViewBehaviour) {
        this.j = voipViewBehaviour;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        motionEvent.toString();
        Objects.toString(this.f);
        VoipViewBehaviour voipViewBehaviour = this.j;
        FrameLayout frameLayout = voipViewBehaviour.a;
        if (voipViewBehaviour.f.a || c.b.s0() || !c.t) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2 && voipViewBehaviour.f.a) {
                        float rawX = motionEvent.getRawX() - this.b;
                        float rawY = motionEvent.getRawY() - this.c;
                        float scaledTouchSlop = ViewConfiguration.get(frameLayout.getContext()).getScaledTouchSlop();
                        if (Math.abs(rawX) > scaledTouchSlop || Math.abs(rawY) > scaledTouchSlop) {
                            this.i = true;
                            frameLayout.setTranslationX(this.d + rawX);
                            frameLayout.setTranslationY(this.e + rawY);
                            frameLayout.getTranslationX();
                            frameLayout.getTranslationY();
                        }
                        motionEvent.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
                        motionEvent.toString();
                        VelocityTracker velocityTracker = this.f;
                        if (velocityTracker != null) {
                            velocityTracker.addMovement(motionEvent);
                        }
                        return true;
                    }
                } else if (voipViewBehaviour.f.a) {
                    VelocityTracker velocityTracker2 = this.f;
                    if (velocityTracker2 != null) {
                        velocityTracker2.computeCurrentVelocity(1000);
                    }
                    VelocityTracker velocityTracker3 = this.f;
                    this.g = velocityTracker3 != null ? velocityTracker3.getXVelocity() : 0.0f;
                    VelocityTracker velocityTracker4 = this.f;
                    this.h = velocityTracker4 != null ? velocityTracker4.getYVelocity() : 0.0f;
                    VelocityTracker velocityTracker5 = this.f;
                    if (velocityTracker5 != null) {
                        velocityTracker5.recycle();
                    }
                    this.f = null;
                    if (!this.i) {
                        voipViewBehaviour.b.performClick();
                        return true;
                    }
                    float f = this.g;
                    float f2 = this.h;
                    float f3 = 2;
                    float translationX = frameLayout.getTranslationX() + (voipViewBehaviour.f() / f3);
                    float translationY = frameLayout.getTranslationY() + (voipViewBehaviour.e() / f3);
                    float f4 = f;
                    float f5 = f2;
                    while (true) {
                        if (Math.abs(f4) <= 10.0f && Math.abs(f5) <= 10.0f) {
                            break;
                        }
                        f4 /= f3;
                        f5 /= f3;
                    }
                    if (Math.abs(f) > 100.0f || Math.abs(f2) > 100.0f) {
                        while (translationX <= voipViewBehaviour.f() && translationX >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && translationY <= voipViewBehaviour.e() && translationY >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            translationX += f4;
                            translationY += f5;
                        }
                    }
                    float d = VoipViewBehaviour.d(translationX, translationY, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    VoipViewBehaviour.Attractor attractor = VoipViewBehaviour.Attractor.TopLeft;
                    float d2 = VoipViewBehaviour.d(translationX, translationY, voipViewBehaviour.f(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    if (d2 < d) {
                        attractor = VoipViewBehaviour.Attractor.TopRight;
                        d = d2;
                    }
                    float d3 = VoipViewBehaviour.d(translationX, translationY, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, voipViewBehaviour.e());
                    if (d3 < d) {
                        attractor = VoipViewBehaviour.Attractor.BottomLeft;
                        d = d3;
                    }
                    if (VoipViewBehaviour.d(translationX, translationY, voipViewBehaviour.f(), voipViewBehaviour.e()) < d) {
                        attractor = VoipViewBehaviour.Attractor.BottomRight;
                    }
                    Pair<Float, Float> b = voipViewBehaviour.b(attractor);
                    float floatValue = b.i().floatValue();
                    float floatValue2 = b.j().floatValue();
                    voipViewBehaviour.c();
                    View view2 = voipViewBehaviour.c;
                    float width = view2.getWidth();
                    smk0 smk0Var = new smk0(frameLayout, woo.m, floatValue);
                    smk0Var.a = f;
                    smk0Var.h = Math.min((-width) / f3, frameLayout.getTranslationX());
                    smk0Var.g = Math.max(width / f3, frameLayout.getTranslationX());
                    smk0Var.u.b(200.0f);
                    smk0Var.u.a(1.0f);
                    voipViewBehaviour.j(smk0Var);
                    smk0Var.h();
                    float height = view2.getHeight();
                    smk0 smk0Var2 = new smk0(frameLayout, woo.n, floatValue2);
                    smk0Var2.a = f2;
                    smk0Var2.h = Math.min((-height) / f3, frameLayout.getTranslationY());
                    smk0Var2.g = Math.max(height / f3, frameLayout.getTranslationY());
                    smk0Var2.u.b(200.0f);
                    smk0Var2.u.a(1.0f);
                    voipViewBehaviour.j(smk0Var2);
                    smk0Var2.h();
                    voipViewBehaviour.f.b = attractor;
                    return true;
                }
            } else if (voipViewBehaviour.f.a) {
                this.d = frameLayout.getTranslationX();
                this.e = frameLayout.getTranslationY();
                this.b = motionEvent.getRawX();
                this.c = motionEvent.getRawY();
                VelocityTracker velocityTracker6 = this.f;
                if (velocityTracker6 != null) {
                    velocityTracker6.clear();
                }
                VelocityTracker velocityTracker7 = this.f;
                if (velocityTracker7 == null) {
                    velocityTracker7 = VelocityTracker.obtain();
                }
                this.f = velocityTracker7;
                motionEvent.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
                motionEvent.toString();
                VelocityTracker velocityTracker8 = this.f;
                if (velocityTracker8 != null) {
                    velocityTracker8.addMovement(motionEvent);
                }
                this.i = false;
                return true;
            }
        } else {
            gb9 gb9Var = voipViewBehaviour.e;
            if (gb9Var != null) {
                return gb9Var.b(motionEvent);
            }
        }
        return false;
    }
}
