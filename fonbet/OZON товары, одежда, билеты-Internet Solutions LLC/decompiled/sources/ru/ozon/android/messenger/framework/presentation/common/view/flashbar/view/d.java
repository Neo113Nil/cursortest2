package ru.ozon.android.messenger.framework.presentation.common.view.flashbar.view;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class d implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f91193a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.common.view.flashbar.view.b f91194b;

    /* renamed from: c, reason: collision with root package name */
    private final int f91195c;

    /* renamed from: d, reason: collision with root package name */
    private final int f91196d;

    /* renamed from: e, reason: collision with root package name */
    private final long f91197e;

    /* renamed from: f, reason: collision with root package name */
    private int f91198f;

    /* renamed from: g, reason: collision with root package name */
    private float f91199g;

    /* renamed from: h, reason: collision with root package name */
    private float f91200h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f91201i;

    /* renamed from: j, reason: collision with root package name */
    private int f91202j;

    /* renamed from: k, reason: collision with root package name */
    private VelocityTracker f91203k;

    /* renamed from: l, reason: collision with root package name */
    private float f91204l;

    public interface a {
    }

    public static final class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            d.d(d.this);
        }
    }

    public d(@NotNull View view, @NotNull ru.ozon.android.messenger.framework.presentation.common.view.flashbar.view.b callbacks) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.f91193a = view;
        this.f91194b = callbacks;
        this.f91198f = 1;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.f91195c = viewConfiguration.getScaledTouchSlop();
        this.f91196d = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.f91197e = view.getContext().getResources().getInteger(R.integer.config_shortAnimTime);
    }

    public static void a(ViewGroup.LayoutParams layoutParams, d dVar, ValueAnimator valueAnimator) {
        layoutParams.height = ((Integer) Bi.a.b(valueAnimator, "valueAnimator", "null cannot be cast to non-null type kotlin.Int")).intValue();
        dVar.f91193a.setLayoutParams(layoutParams);
    }

    public static final void d(d dVar) {
        View view = dVar.f91193a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int height = view.getHeight();
        ValueAnimator duration = ValueAnimator.ofInt(height, 1).setDuration(dVar.f91197e);
        duration.addListener(new e(dVar, layoutParams, height));
        duration.addUpdateListener(new UN.a(1, layoutParams, dVar));
        duration.start();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(@NotNull View view, @NotNull MotionEvent motionEvent) {
        boolean z11;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        motionEvent.offsetLocation(0.0f, this.f91204l);
        int i11 = this.f91198f;
        View view2 = this.f91193a;
        if (i11 < 2) {
            this.f91198f = view2.getHeight();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f91199g = motionEvent.getRawX();
            this.f91200h = motionEvent.getRawY();
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f91203k = obtain;
            Intrinsics.f(obtain);
            obtain.addMovement(motionEvent);
            return false;
        }
        ru.ozon.android.messenger.framework.presentation.common.view.flashbar.view.b bVar = this.f91194b;
        long j11 = this.f91197e;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                VelocityTracker velocityTracker = this.f91203k;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                    float rawX = motionEvent.getRawX() - this.f91199g;
                    float rawY = motionEvent.getRawY() - this.f91200h;
                    float abs = Math.abs(rawY);
                    int i12 = this.f91195c;
                    if (abs > i12 && Math.abs(rawX) < Math.abs(rawY) / 2) {
                        this.f91201i = true;
                        bVar.n(true);
                        if (rawY <= 0.0f) {
                            i12 = -i12;
                        }
                        this.f91202j = i12;
                        view2.getParent().requestDisallowInterceptTouchEvent(true);
                        MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                        obtain2.setAction((motionEvent.getActionIndex() << 8) | 3);
                        view2.onTouchEvent(obtain2);
                        obtain2.recycle();
                    }
                    if (this.f91201i) {
                        this.f91204l = rawY;
                        view2.setTranslationY(rawY - this.f91202j);
                        view2.setAlpha(Math.max(0.0f, Math.min(1.0f, 1.0f - ((Math.abs(rawY) * 2.0f) / this.f91198f))));
                        return true;
                    }
                }
            } else {
                if (actionMasked != 3) {
                    view.performClick();
                    return false;
                }
                if (this.f91203k != null) {
                    view2.animate().translationY(0.0f).alpha(1.0f).setDuration(j11).setListener(null);
                    VelocityTracker velocityTracker2 = this.f91203k;
                    Intrinsics.f(velocityTracker2);
                    velocityTracker2.recycle();
                    this.f91203k = null;
                    this.f91199g = 0.0f;
                    this.f91200h = 0.0f;
                    this.f91201i = false;
                    bVar.n(false);
                    return false;
                }
            }
        } else if (this.f91203k != null) {
            float rawY2 = motionEvent.getRawY() - this.f91200h;
            VelocityTracker velocityTracker3 = this.f91203k;
            Intrinsics.f(velocityTracker3);
            velocityTracker3.addMovement(motionEvent);
            VelocityTracker velocityTracker4 = this.f91203k;
            Intrinsics.f(velocityTracker4);
            velocityTracker4.computeCurrentVelocity(1000);
            VelocityTracker velocityTracker5 = this.f91203k;
            Intrinsics.f(velocityTracker5);
            float yVelocity = velocityTracker5.getYVelocity();
            VelocityTracker velocityTracker6 = this.f91203k;
            Intrinsics.f(velocityTracker6);
            float abs2 = Math.abs(velocityTracker6.getXVelocity());
            float abs3 = Math.abs(yVelocity);
            if (Math.abs(rawY2) > this.f91198f / 2 && this.f91201i) {
                z11 = rawY2 > 0.0f;
            } else if (this.f91196d > abs2 || abs3 >= abs2 || !this.f91201i) {
                z11 = false;
                r13 = false;
            } else {
                boolean z12 = ((yVelocity > 0.0f ? 1 : (yVelocity == 0.0f ? 0 : -1)) < 0) == ((rawY2 > 0.0f ? 1 : (rawY2 == 0.0f ? 0 : -1)) < 0);
                VelocityTracker velocityTracker7 = this.f91203k;
                Intrinsics.f(velocityTracker7);
                r13 = z12;
                z11 = velocityTracker7.getYVelocity() > 0.0f;
            }
            if (r13) {
                view2.animate().translationY(z11 ? this.f91198f : -this.f91198f).alpha(0.0f).setDuration(j11).setListener(new b());
            } else if (this.f91201i) {
                view2.animate().translationY(0.0f).alpha(1.0f).setDuration(j11).setListener(null);
            }
            VelocityTracker velocityTracker8 = this.f91203k;
            Intrinsics.f(velocityTracker8);
            velocityTracker8.recycle();
            this.f91203k = null;
            this.f91199g = 0.0f;
            this.f91200h = 0.0f;
            this.f91201i = false;
            bVar.n(false);
        }
        return false;
    }
}
