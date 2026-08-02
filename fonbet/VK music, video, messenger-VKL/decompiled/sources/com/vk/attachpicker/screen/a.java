package com.vk.attachpicker.screen;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.screen.a;
import com.vk.attachpicker.screen.p;
import com.vk.attachpicker.widget.ClippingView;
import com.vk.attachpicker.widget.LocalImageView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.log.L;
import com.vk.mediastore.system.MediaStoreEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.awt0;
import xsna.ds6;
import xsna.e43;
import xsna.em6;
import xsna.es6;
import xsna.f4m;
import xsna.fnj;
import xsna.gq;
import xsna.gzs;
import xsna.iah0;
import xsna.j0;
import xsna.yy80;
import xsna.zjt;
import xsna.zmw;

/* compiled from: BaseViewerScreen.kt */
/* loaded from: classes15.dex */
public abstract class a extends em6 {
    public ColorDrawable g;
    public ColorDrawable h;
    public p.c i;
    public Activity k;
    public C0386a l;
    public ClippingView m;
    public VelocityTracker o;
    public int p;
    public int q;
    public float u;
    public boolean v;
    public float w;
    public float x;
    public final yy80 j = new yy80();
    public final Handler n = new Handler(Looper.getMainLooper());
    public final AccelerateDecelerateInterpolator r = new AccelerateDecelerateInterpolator();
    public final AtomicBoolean s = new AtomicBoolean(false);
    public final AtomicBoolean t = new AtomicBoolean(false);

    /* compiled from: BaseViewerScreen.kt */
    /* renamed from: com.vk.attachpicker.screen.a$a, reason: collision with other inner class name */
    public final class C0386a extends FrameLayout {
        public C0386a(Activity activity) {
            super(activity);
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return a.this.A(motionEvent);
        }

        @Override // android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return a.this.A(motionEvent);
        }
    }

    /* compiled from: BaseViewerScreen.kt */
    public interface b {
        default void Bi(p pVar, MediaStoreEntry mediaStoreEntry) {
            pVar.S(mediaStoreEntry);
        }

        void N7(MediaStoreEntry mediaStoreEntry);

        default void ig(a aVar, MediaStoreEntry mediaStoreEntry) {
            aVar.J(mediaStoreEntry);
        }

        c k9(int i);
    }

    /* compiled from: BaseViewerScreen.kt */
    public static final class c {
        public zjt<?> a;
        public View b;
        public View c;
        public MediaStoreEntry d;
        public int e;
        public int f;

        public final void a(VkImage vkImage) {
            this.b = vkImage;
        }

        public final void b(MediaStoreEntry mediaStoreEntry) {
            this.d = mediaStoreEntry;
        }

        public final void c(VkImage vkImage) {
            this.a = vkImage;
        }

        public final void d(View view) {
            this.c = view;
        }

        public final void e(int i) {
            this.f = i;
        }

        public final void f(int i) {
            this.e = i;
        }
    }

    /* compiled from: BaseViewerScreen.kt */
    public static final class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            onAnimationEnd(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            a.this.r();
        }
    }

    /* compiled from: BaseViewerScreen.kt */
    public static final class e extends AnimatorListenerAdapter {
        public final /* synthetic */ c c;

        public e(c cVar) {
            this.c = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            onAnimationEnd(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            View view;
            a aVar = a.this;
            aVar.w = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            aVar.s().setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            aVar.s().setScaleX(1.0f);
            aVar.s().setScaleY(1.0f);
            c cVar = this.c;
            if (cVar != null && (view = cVar.b) != null) {
                view.setVisibility(0);
            }
            aVar.F();
            C0386a c0386a = aVar.l;
            if (c0386a != null) {
                c0386a.post(new j0(aVar, 3));
            }
            Activity activity = aVar.k;
            if (activity != null) {
                aVar.j.b(activity);
            }
            aVar.I(false);
            aVar.t.set(false);
        }
    }

    public boolean A(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        if (!this.s.get()) {
            int actionMasked = motionEvent.getActionMasked();
            yy80 yy80Var = this.j;
            boolean z = true;
            if (actionMasked != 0 && motionEvent.getActionMasked() != 5) {
                if (motionEvent.getActionMasked() == 2) {
                    if (motionEvent.getPointerCount() == 1) {
                        VelocityTracker velocityTracker3 = this.o;
                        if (velocityTracker3 != null) {
                            velocityTracker3.addMovement(motionEvent);
                        }
                        float abs = Math.abs(motionEvent.getX() - this.x);
                        float abs2 = Math.abs(motionEvent.getY() - this.u);
                        if (!this.v && v() == 1.0f && abs2 >= iah0.a(30) && abs2 / 2 > abs) {
                            this.v = true;
                            this.u = motionEvent.getY();
                            return true;
                        }
                        if (!this.v) {
                            this.x = motionEvent.getX();
                            return false;
                        }
                        this.w = motionEvent.getY() - this.u;
                        float height = (this.l != null ? r9.getHeight() : 0) / 2.0f;
                        float f = 1;
                        float min = f - (Math.min(Math.abs(this.w), height) / height);
                        float f2 = 255 * min;
                        H((int) Math.max(127.0f, f2));
                        ColorDrawable colorDrawable = this.g;
                        (colorDrawable != null ? colorDrawable : null).setAlpha((int) Math.max(127.0f, f2));
                        s().setTranslationY(this.w);
                        float f3 = 0.9f;
                        if (0.5f <= min && min <= 1.0f) {
                            f3 = 0.9f + (((min - 0.5f) / 0.5f) * (f - 0.9f));
                        }
                        s().setScaleX(f3);
                        s().setScaleY(f3);
                        return false;
                    }
                } else if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                    if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) && (velocityTracker = this.o) != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.o.computeCurrentVelocity(1000);
                    }
                    if (this.v) {
                        VelocityTracker velocityTracker4 = this.o;
                        if (velocityTracker4 != null && (Math.abs(velocityTracker4.getYVelocity()) <= this.p || Math.abs(this.o.getYVelocity()) >= this.q)) {
                            z = false;
                        }
                        if (gq.a(motionEvent, this.u) > (this.l != null ? r2.getHeight() : 0) / 6.0f || z) {
                            m();
                        } else {
                            p();
                        }
                        this.v = false;
                    } else {
                        Activity activity = this.k;
                        if (activity != null) {
                            yy80Var.b(activity);
                        }
                    }
                    if (motionEvent.getActionMasked() == 3 && (velocityTracker2 = this.o) != null) {
                        velocityTracker2.recycle();
                        this.o = null;
                        return false;
                    }
                }
            } else if (!this.v && motionEvent.getPointerCount() == 1) {
                this.x = motionEvent.getX();
                this.u = motionEvent.getY();
                this.v = false;
                yy80Var.a(this.k);
                VelocityTracker obtain = VelocityTracker.obtain();
                this.o = obtain;
                obtain.addMovement(motionEvent);
            }
        }
        return false;
    }

    public final void B(ViewGroup viewGroup, final c cVar, final boolean z) {
        C0386a c0386a = this.l;
        ColorDrawable colorDrawable = this.h;
        if (colorDrawable == null) {
            colorDrawable = null;
        }
        c0386a.setBackground(colorDrawable);
        H(0);
        ClippingView clippingView = this.m;
        if (clippingView != null) {
            clippingView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        awt0.t(viewGroup, new gzs() { // from class: xsna.cs6
            @Override // xsna.gzs
            public final Object invoke() {
                final com.vk.attachpicker.screen.a aVar = this;
                aVar.I(true);
                aVar.j.a(aVar.k);
                aVar.s().setVisibility(4);
                Handler handler = aVar.n;
                final a.c cVar2 = cVar;
                final boolean z2 = z;
                handler.postDelayed(new Runnable() { // from class: xsna.fs6
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewGroup.LayoutParams layoutParams;
                        com.vk.attachpicker.screen.a aVar2 = aVar;
                        Activity d2 = aVar2.d();
                        if (d2 == null) {
                            return;
                        }
                        a.c cVar3 = cVar2;
                        int l = iah0.l(cVar3.a);
                        int a = iah0.n(d2) ? 0 : fnj.a(d2);
                        int k = iah0.n(d2) ? iah0.k(aVar2.d()) : 0;
                        int m = iah0.m(cVar3.a);
                        zjt<?> zjtVar = cVar3.a;
                        int width = zjtVar != null ? zjtVar.getWidth() : 0;
                        zjt<?> zjtVar2 = cVar3.a;
                        int height = zjtVar2 != null ? zjtVar2.getHeight() : 0;
                        zjt<?> zjtVar3 = cVar3.a;
                        float scaleX = zjtVar3 != null ? zjtVar3.getScaleX() : 1.0f;
                        zjt<?> zjtVar4 = cVar3.a;
                        RectF T0 = LocalImageView.T0((int) (width * scaleX), (int) (height * (zjtVar4 != null ? zjtVar4.getScaleY() : 1.0f)), cVar3.e, cVar3.f);
                        boolean z3 = z2;
                        if (z3) {
                            ClippingView clippingView2 = aVar2.m;
                            if (clippingView2 != null) {
                                clippingView2.setVisibility(0);
                            }
                        } else {
                            ClippingView clippingView3 = aVar2.m;
                            if (clippingView3 != null) {
                                f4m.j(clippingView3);
                            }
                        }
                        ClippingView clippingView4 = aVar2.m;
                        if (clippingView4 != null) {
                            clippingView4.W0(cVar3.d);
                        }
                        ClippingView clippingView5 = aVar2.m;
                        if (clippingView5 != null) {
                            clippingView5.setAlpha(1.0f);
                        }
                        ClippingView clippingView6 = aVar2.m;
                        if (clippingView6 != null) {
                            clippingView6.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        }
                        ClippingView clippingView7 = aVar2.m;
                        if (clippingView7 != null) {
                            clippingView7.setPivotY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        }
                        ClippingView clippingView8 = aVar2.m;
                        if (clippingView8 != null) {
                            clippingView8.setScaleX(1.0f);
                        }
                        ClippingView clippingView9 = aVar2.m;
                        if (clippingView9 != null) {
                            clippingView9.setScaleY(1.0f);
                        }
                        ClippingView clippingView10 = aVar2.m;
                        if (clippingView10 != null) {
                            clippingView10.setTranslationX(l + T0.left);
                        }
                        ClippingView clippingView11 = aVar2.m;
                        if (clippingView11 != null) {
                            clippingView11.setTranslationY(m + T0.top);
                        }
                        ClippingView clippingView12 = aVar2.m;
                        if (clippingView12 == null || (layoutParams = clippingView12.getLayoutParams()) == null) {
                            return;
                        }
                        layoutParams.width = (int) (T0.right - T0.left);
                        layoutParams.height = (int) (T0.bottom - T0.top);
                        ClippingView clippingView13 = aVar2.m;
                        if (clippingView13 != null) {
                            clippingView13.setLayoutParams(layoutParams);
                        }
                        float min = Math.min(iah0.f().widthPixels / layoutParams.width, ((iah0.f().heightPixels - a) - aVar2.t()) / layoutParams.height);
                        float f = (iah0.f().widthPixels - (layoutParams.width * min)) / 2.0f;
                        float t = (((iah0.f().heightPixels + k) - (layoutParams.height * min)) - aVar2.t()) / 2.0f;
                        int abs = (int) Math.abs(T0.left);
                        int abs2 = (int) Math.abs(T0.top);
                        ClippingView clippingView14 = aVar2.m;
                        if (clippingView14 != null) {
                            clippingView14.setClipHorizontal(abs);
                        }
                        ClippingView clippingView15 = aVar2.m;
                        if (clippingView15 != null) {
                            clippingView15.setClipVertical(abs2);
                        }
                        int[] iArr = new int[2];
                        View view = cVar3.c;
                        if (view != null) {
                            view.getLocationOnScreen(iArr);
                        }
                        int i = iArr[1];
                        float f2 = m + T0.top;
                        int i2 = (int) ((i - a) - f2);
                        if (i2 < 0) {
                            i2 = 0;
                        }
                        int height2 = (int) ((f2 + layoutParams.height) - ((i + (cVar3.c != null ? r4.getHeight() : 0)) - a));
                        if (height2 < 0) {
                            height2 = 0;
                        }
                        int max = Math.max(i2, abs2);
                        int max2 = Math.max(height2, abs2);
                        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                        ofInt.addUpdateListener(new gs6(aVar2, 0));
                        AnimatorSet animatorSet = new AnimatorSet();
                        ArrayList a2 = e43.a(ObjectAnimator.ofFloat(aVar2.m, (Property<ClippingView, Float>) View.SCALE_X, min), ObjectAnimator.ofFloat(aVar2.m, (Property<ClippingView, Float>) View.SCALE_Y, min), ObjectAnimator.ofFloat(aVar2.m, (Property<ClippingView, Float>) View.TRANSLATION_X, f), ObjectAnimator.ofFloat(aVar2.m, (Property<ClippingView, Float>) View.TRANSLATION_Y, t), ofInt, ObjectAnimator.ofInt(aVar2.m, ClippingView.v, abs, 0), ObjectAnimator.ofInt(aVar2.m, ClippingView.t, max, 0), ObjectAnimator.ofInt(aVar2.m, ClippingView.u, max2, 0));
                        a2.addAll(aVar2.y());
                        Animator[] animatorArr = (Animator[]) a2.toArray(new Animator[0]);
                        animatorSet.playTogether((Animator[]) Arrays.copyOf(animatorArr, animatorArr.length));
                        animatorSet.setInterpolator(aVar2.r);
                        animatorSet.setDuration(250L);
                        animatorSet.addListener(new com.vk.attachpicker.screen.b(cVar3, aVar2, z3));
                        animatorSet.setStartDelay(16L);
                        animatorSet.start();
                    }
                }, 70L);
                return s3q0.a;
            }
        });
    }

    public final void C() {
        this.w = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        s().setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        H(255);
        ClippingView clippingView = this.m;
        if (clippingView != null) {
            f4m.j(clippingView);
        }
        this.t.set(true);
        E();
    }

    public final void D(c cVar) {
        char c2;
        float f;
        char c3;
        float f2;
        int i;
        float f3;
        s().setVisibility(4);
        float v = v();
        zmw x = x();
        RectF rectF = null;
        rectF = null;
        RectF displayRect = x != null ? x.getDisplayRect() : null;
        C0386a c0386a = this.l;
        if (c0386a != null) {
            ColorDrawable colorDrawable = this.h;
            if (colorDrawable == null) {
                colorDrawable = null;
            }
            c0386a.setBackground(colorDrawable);
        }
        this.j.a(this.k);
        I(true);
        ClippingView clippingView = this.m;
        if (clippingView != null) {
            clippingView.setVisibility(0);
        }
        ClippingView clippingView2 = this.m;
        ViewGroup.LayoutParams layoutParams = clippingView2 != null ? clippingView2.getLayoutParams() : null;
        if (cVar != null && cVar.e > 0 && cVar.f > 0) {
            zjt<?> zjtVar = cVar.a;
            int width = zjtVar != null ? zjtVar.getWidth() : 0;
            zjt<?> zjtVar2 = cVar.a;
            int height = zjtVar2 != null ? zjtVar2.getHeight() : 0;
            zjt<?> zjtVar3 = cVar.a;
            float scaleX = zjtVar3 != null ? zjtVar3.getScaleX() : 1.0f;
            zjt<?> zjtVar4 = cVar.a;
            RectF T0 = LocalImageView.T0((int) (width * scaleX), (int) (height * (zjtVar4 != null ? zjtVar4.getScaleY() : 1.0f)), cVar.e, cVar.f);
            if (layoutParams != null) {
                layoutParams.width = (int) (T0.right - T0.left);
            }
            if (layoutParams != null) {
                layoutParams.height = (int) (T0.bottom - T0.top);
            }
            if (x == null || !x.c0() || Math.abs(x.getImageAspectRatio() - (T0.width() / T0.height())) >= 0.001f) {
                ClippingView clippingView3 = this.m;
                if (clippingView3 != null) {
                    clippingView3.setImageDrawable(x != null ? x.getDrawable() : null);
                }
            } else {
                ClippingView clippingView4 = this.m;
                if (clippingView4 != null) {
                    clippingView4.setImageDrawable(x.getDrawable());
                }
                zjt<?> zjtVar5 = cVar.a;
                int width2 = zjtVar5 != null ? zjtVar5.getWidth() : 0;
                zjt<?> zjtVar6 = cVar.a;
                T0.set(LocalImageView.T0(width2, zjtVar6 != null ? zjtVar6.getHeight() : 0, x.getImageWidth(), x.getImageHeight()));
            }
            rectF = T0;
        } else if (x != null && x.c0()) {
            ClippingView clippingView5 = this.m;
            if (clippingView5 != null) {
                clippingView5.setImageDrawable(x.getDrawable());
            }
            rectF = LocalImageView.T0(x.getWidth(), x.getHeight(), x.getImageWidth(), x.getImageHeight());
        }
        ClippingView clippingView6 = this.m;
        if (clippingView6 != null) {
            clippingView6.setLayoutParams(layoutParams);
        }
        int a = iah0.n(d()) ? 0 : fnj.a(d());
        int k = iah0.n(d()) ? iah0.k(d()) : 0;
        float f4 = iah0.f().widthPixels / (layoutParams != null ? layoutParams.width : 1);
        float t = (iah0.f().heightPixels - t()) / (layoutParams != null ? layoutParams.height : 1);
        if (f4 > t) {
            f4 = t;
        }
        float scaleX2 = s().getScaleX() * (layoutParams != null ? layoutParams.width : 0) * v * f4;
        float scaleY = s().getScaleY() * (layoutParams != null ? layoutParams.height : 0) * v * f4;
        float f5 = (iah0.f().widthPixels - scaleX2) / 2.0f;
        float f6 = ((iah0.f().heightPixels + k) - scaleY) / 2.0f;
        if (v == 1.0f || displayRect == null) {
            ClippingView clippingView7 = this.m;
            if (clippingView7 != null) {
                clippingView7.setTranslationX(f5);
            }
            ClippingView clippingView8 = this.m;
            if (clippingView8 != null) {
                clippingView8.setTranslationY((f6 + this.w) - (t() / 2));
            }
        } else {
            RectF rectF2 = new RectF(f5, f6, scaleX2 + f5, scaleY + f6);
            float centerX = displayRect.centerX() - rectF2.centerX();
            float centerY = (displayRect.centerY() - rectF2.centerY()) + a;
            ClippingView clippingView9 = this.m;
            if (clippingView9 != null) {
                clippingView9.setTranslationX(f5 + centerX);
            }
            ClippingView clippingView10 = this.m;
            if (clippingView10 != null) {
                clippingView10.setTranslationY((f6 + centerY) - (t() / 2));
            }
        }
        ClippingView clippingView11 = this.m;
        if (clippingView11 != null) {
            clippingView11.setScaleX(s().getScaleX() * v * f4);
        }
        ClippingView clippingView12 = this.m;
        if (clippingView12 != null) {
            clippingView12.setScaleY(s().getScaleY() * v * f4);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        if (cVar != null) {
            int abs = (int) Math.abs(rectF != null ? rectF.left : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            float abs2 = Math.abs(rectF != null ? rectF.top : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            int l = iah0.l(cVar.a);
            int m = iah0.m(cVar.a);
            int[] iArr = new int[2];
            float f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            View view = cVar.c;
            if (view != null) {
                view.getLocationOnScreen(iArr);
            }
            int i2 = iArr[1];
            float f8 = m;
            int i3 = (int) ((i2 - a) - ((rectF != null ? rectF.top : 0.0f) + f8));
            if (i3 < 0) {
                i3 = 0;
            }
            float f9 = (rectF != null ? rectF.top : 0.0f) + f8;
            if (rectF != null) {
                c2 = 2;
                f = rectF.bottom;
            } else {
                c2 = 2;
                f = 0.0f;
            }
            if (rectF != null) {
                c3 = 3;
                f2 = rectF.top;
            } else {
                c3 = 3;
                f2 = 0.0f;
            }
            int height2 = (int) (((f - f2) + f9) - ((i2 + (cVar.c != null ? r3.getHeight() : 0)) - a));
            if (height2 < 0) {
                height2 = 0;
            }
            int i4 = (int) abs2;
            int max = Math.max(i3, i4);
            int max2 = Math.max(height2, i4);
            ValueAnimator ofInt = ValueAnimator.ofInt(0);
            ofInt.addUpdateListener(new ds6(this, 0));
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.m, (Property<ClippingView, Float>) View.SCALE_X, 1.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.m, (Property<ClippingView, Float>) View.SCALE_Y, 1.0f);
            ClippingView clippingView13 = this.m;
            Property property = View.TRANSLATION_X;
            float f10 = l;
            if (rectF != null) {
                i = 0;
                f3 = rectF.left;
            } else {
                i = 0;
                f3 = 0.0f;
            }
            float f11 = f10 + f3;
            float[] fArr = new float[1];
            fArr[i] = f11;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(clippingView13, (Property<ClippingView, Float>) property, fArr);
            ClippingView clippingView14 = this.m;
            Property property2 = View.TRANSLATION_Y;
            if (rectF != null) {
                f7 = rectF.top;
            }
            float[] fArr2 = new float[1];
            fArr2[i] = f8 + f7;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(clippingView14, (Property<ClippingView, Float>) property2, fArr2);
            int i5 = i;
            ObjectAnimator ofInt2 = ObjectAnimator.ofInt(this.m, ClippingView.v, i5, abs);
            ObjectAnimator ofInt3 = ObjectAnimator.ofInt(this.m, ClippingView.t, i5, max);
            ObjectAnimator ofInt4 = ObjectAnimator.ofInt(this.m, ClippingView.u, i5, max2);
            ValueAnimator[] valueAnimatorArr = new ValueAnimator[8];
            valueAnimatorArr[i5] = ofFloat;
            valueAnimatorArr[1] = ofFloat2;
            valueAnimatorArr[c2] = ofFloat3;
            valueAnimatorArr[c3] = ofFloat4;
            valueAnimatorArr[4] = ofInt;
            valueAnimatorArr[5] = ofInt2;
            valueAnimatorArr[6] = ofInt3;
            valueAnimatorArr[7] = ofInt4;
            ArrayList a2 = e43.a(valueAnimatorArr);
            a2.addAll(z());
            ValueAnimator[] valueAnimatorArr2 = (ValueAnimator[]) a2.toArray(new ValueAnimator[0]);
            animatorSet.playTogether((Animator[]) Arrays.copyOf(valueAnimatorArr2, valueAnimatorArr2.length));
        } else {
            ValueAnimator ofInt5 = ValueAnimator.ofInt(0);
            ofInt5.addUpdateListener(new es6(this, 0));
            ArrayList a3 = e43.a(ofInt5, ObjectAnimator.ofFloat(this.m, (Property<ClippingView, Float>) View.ALPHA, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), ObjectAnimator.ofFloat(this.m, (Property<ClippingView, Float>) View.TRANSLATION_Y, this.w >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? iah0.f().heightPixels : -iah0.f().heightPixels));
            a3.addAll(z());
            ValueAnimator[] valueAnimatorArr3 = (ValueAnimator[]) a3.toArray(new ValueAnimator[0]);
            animatorSet.playTogether((Animator[]) Arrays.copyOf(valueAnimatorArr3, valueAnimatorArr3.length));
        }
        animatorSet.setDuration(250L);
        animatorSet.addListener(new e(cVar));
        animatorSet.setInterpolator(this.r);
        animatorSet.setStartDelay(16L);
        animatorSet.start();
    }

    public abstract void E();

    public abstract void F();

    public void H(int i) {
        ColorDrawable colorDrawable = this.h;
        if (colorDrawable == null) {
            colorDrawable = null;
        }
        colorDrawable.setAlpha(i);
    }

    public final void I(boolean z) {
        this.s.set(z);
    }

    public abstract void J(MediaStoreEntry mediaStoreEntry);

    @Override // xsna.em6
    public final View e(LayoutInflater layoutInflater) {
        Activity d2 = d();
        this.k = d2;
        C0386a c0386a = new C0386a(d2);
        this.l = c0386a;
        ColorDrawable colorDrawable = this.h;
        if (colorDrawable == null) {
            colorDrawable = null;
        }
        c0386a.setBackground(colorDrawable);
        C0386a c0386a2 = this.l;
        if (c0386a2 != null) {
            c0386a2.setFocusable(false);
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(d2);
        this.p = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.q = viewConfiguration.getScaledMaximumFlingVelocity();
        return super.e(layoutInflater);
    }

    @Override // xsna.em6
    public final boolean g() {
        if (this.s.get()) {
            return true;
        }
        if (!this.t.get()) {
            return false;
        }
        m();
        return true;
    }

    public abstract void m();

    public final void n() {
        this.w = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        s().setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        s().setScaleX(1.0f);
        s().setScaleY(1.0f);
        s().setVisibility(4);
        Activity activity = this.k;
        if (activity != null) {
            this.j.b(activity);
        }
        this.t.set(false);
        F();
        r();
        I(false);
    }

    public abstract void p();

    public final void q() {
        try {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.m, (Property<ClippingView, Float>) View.ALPHA, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            animatorSet.setDuration(83L);
            animatorSet.addListener(new d());
            animatorSet.start();
        } catch (Exception e2) {
            L.g("ImageViewer", e2);
        }
    }

    public final void r() {
        try {
            this.w = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            s().setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            s().setScaleX(1.0f);
            s().setScaleY(1.0f);
            ClippingView clippingView = this.m;
            if (clippingView != null) {
                clippingView.setImageBitmap(null);
            }
            c();
            ClippingView clippingView2 = this.m;
            if (clippingView2 != null) {
                clippingView2.setAlpha(1.0f);
            }
        } catch (Exception e2) {
            L.g("ImageViewer", e2);
        }
    }

    public abstract View s();

    public abstract float t();

    public abstract float v();

    public abstract zmw x();

    public abstract List<ObjectAnimator> y();

    public abstract List<ObjectAnimator> z();
}
