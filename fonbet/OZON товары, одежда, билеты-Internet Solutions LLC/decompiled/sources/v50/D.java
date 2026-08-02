package v50;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.core.view.GestureDetectorCompat;
import c3.C5739a;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class D extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    private static final int f102300r = (int) (Resources.getSystem().getDisplayMetrics().density * 80.0f);

    /* renamed from: s, reason: collision with root package name */
    private static final int f102301s = (int) (Resources.getSystem().getDisplayMetrics().density * 400.0f);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f102302t = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f102303a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<View, Unit> f102304b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<View, Unit> f102305c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<MotionEvent, Unit> f102306d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<MotionEvent, Boolean, Boolean, Unit> f102307e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<View, Boolean, Boolean, Unit> f102308f;

    /* renamed from: g, reason: collision with root package name */
    private final float f102309g;

    /* renamed from: h, reason: collision with root package name */
    private final float f102310h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f102311i;

    /* renamed from: j, reason: collision with root package name */
    private final ViewConfiguration f102312j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C10255e f102313k = new C10255e();

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private PointF f102314l = new PointF(0.0f, 0.0f);

    /* renamed from: m, reason: collision with root package name */
    private VelocityTracker f102315m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final GestureDetectorCompat f102316n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f102317o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f102318p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f102319q;

    public static final class a extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f102321b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f102322c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f102323d;

        a(boolean z11, boolean z12, boolean z13) {
            this.f102321b = z11;
            this.f102322c = z12;
            this.f102323d = z13;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            D d11 = D.this;
            d11.f102313k.a(C10252b.f102328a, new C10250C(d11));
            d11.f102313k.b(C10253c.f102330a, new C10254d());
            if (this.f102321b) {
                d11.f102308f.invoke(d11.f102303a, Boolean.valueOf(this.f102322c), Boolean.valueOf(this.f102323d));
            }
        }
    }

    public D(View view, Function1 function1, Function1 function12, Function1 function13, InterfaceC6511n interfaceC6511n, InterfaceC6511n interfaceC6511n2, float f7, float f11, boolean z11) {
        this.f102303a = view;
        this.f102304b = function1;
        this.f102305c = function12;
        this.f102306d = function13;
        this.f102307e = interfaceC6511n;
        this.f102308f = interfaceC6511n2;
        this.f102309g = f7;
        this.f102310h = f11;
        this.f102311i = z11;
        this.f102312j = ViewConfiguration.get(view.getContext());
        this.f102316n = new GestureDetectorCompat(view.getContext(), this);
    }

    public static void a(boolean z11, D d11, boolean z12, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        if (z11) {
            View view = d11.f102303a;
            Object animatedValue = animator.getAnimatedValue();
            Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            view.setTranslationX(((Float) animatedValue).floatValue());
            return;
        }
        if (z12) {
            View view2 = d11.f102303a;
            Object animatedValue2 = animator.getAnimatedValue();
            Intrinsics.g(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
            view2.setTranslationY(((Float) animatedValue2).floatValue());
        }
    }

    public static Unit b(D d11, float f7) {
        View view = d11.f102303a;
        view.setTranslationX(view.getTranslationX() + f7);
        return Unit.f71690a;
    }

    public static Unit c(D d11) {
        d11.k(0.0f, false, d11.f102318p, d11.f102317o);
        return Unit.f71690a;
    }

    public static Unit d(D d11, float f7) {
        View view = d11.f102303a;
        view.setTranslationY(view.getTranslationY() + f7);
        return Unit.f71690a;
    }

    public static Unit e(D d11) {
        d11.k(0.0f, false, d11.f102318p, d11.f102317o);
        return Unit.f71690a;
    }

    private final void j(View view, MotionEvent motionEvent) {
        this.f102319q = true;
        this.f102317o = false;
        this.f102318p = false;
        this.f102315m = VelocityTracker.obtain();
        PointF pointF = this.f102314l;
        pointF.x = motionEvent.getX();
        pointF.y = motionEvent.getY();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        this.f102306d.invoke(motionEvent);
    }

    private final void k(float f7, boolean z11, final boolean z12, final boolean z13) {
        View view = this.f102303a;
        if (z11) {
            this.f102305c.invoke(view);
        }
        float translationX = z12 ? view.getTranslationX() : z13 ? view.getTranslationY() : 0.0f;
        float abs = (Math.abs(translationX - f7) / Resources.getSystem().getDisplayMetrics().density) * 0.8f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationX, f7);
        ofFloat.setDuration((long) abs);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: v50.x
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                D.a(z12, this, z13, valueAnimator);
            }
        });
        ofFloat.setInterpolator(new C5739a());
        ofFloat.addListener(new a(z11, z12, z13));
        ofFloat.start();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(@NotNull MotionEvent e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(@NotNull MotionEvent e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        View view = this.f102303a;
        view.performHapticFeedback(0);
        view.performLongClick();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(@NotNull MotionEvent e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        this.f102303a.performClick();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fe  */
    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(@NotNull View v11, @NotNull MotionEvent e11) {
        float f7;
        boolean z11;
        boolean z12;
        Intrinsics.checkNotNullParameter(v11, "v");
        Intrinsics.checkNotNullParameter(e11, "e");
        int action = e11.getAction();
        if (action != 0) {
            C10255e c10255e = this.f102313k;
            if (action == 1) {
                this.f102319q = false;
                boolean z13 = this.f102318p;
                int i11 = f102300r;
                int i12 = f102301s;
                float f11 = this.f102310h;
                InterfaceC6511n<MotionEvent, Boolean, Boolean, Unit> interfaceC6511n = this.f102307e;
                View view = this.f102303a;
                if (z13) {
                    int measuredWidth = view.getMeasuredWidth();
                    VelocityTracker velocityTracker = this.f102315m;
                    float f12 = measuredWidth;
                    float f13 = f12 * f11;
                    if (velocityTracker != null) {
                        velocityTracker.computeCurrentVelocity(i12);
                        f7 = 1.5f;
                        if (Math.abs(velocityTracker.getXVelocity()) > i11 && c10255e.b(C10252b.f102328a, new C10254d())) {
                            z12 = true;
                            if (Math.abs(view.getTranslationX()) <= f13) {
                                k(Math.signum(view.getTranslationX()) * f12 * f7, true, this.f102318p, this.f102317o);
                                interfaceC6511n.invoke(e11, Boolean.valueOf(this.f102318p), Boolean.valueOf(this.f102317o));
                            } else if (velocityTracker != null && z12) {
                                k(Math.signum(view.getTranslationX()) * f12 * f7, true, this.f102318p, this.f102317o);
                            } else if (velocityTracker != null && !z12) {
                                c10255e.b(C10256f.f102333a, new A50.a(this, 3));
                            }
                        }
                    } else {
                        f7 = 1.5f;
                    }
                    z12 = false;
                    if (Math.abs(view.getTranslationX()) <= f13) {
                    }
                } else {
                    f7 = 1.5f;
                }
                if (this.f102317o) {
                    int measuredHeight = view.getMeasuredHeight();
                    VelocityTracker velocityTracker2 = this.f102315m;
                    float f14 = measuredHeight;
                    float f15 = f11 * f14;
                    if (velocityTracker2 != null) {
                        velocityTracker2.computeCurrentVelocity(i12);
                        if (Math.abs(velocityTracker2.getYVelocity()) > i11 && c10255e.b(C10252b.f102328a, new C10254d())) {
                            z11 = true;
                            float f16 = !this.f102311i ? -1.0f : 1.0f;
                            if (Math.abs(view.getTranslationY()) <= f15) {
                                k(f14 * f7 * f16, true, this.f102318p, this.f102317o);
                                interfaceC6511n.invoke(e11, Boolean.valueOf(this.f102318p), Boolean.valueOf(this.f102317o));
                            } else if (velocityTracker2 != null && z11) {
                                k(f14 * f7 * f16, true, this.f102318p, this.f102317o);
                                velocityTracker2.recycle();
                            } else if (velocityTracker2 != null && !z11) {
                                c10255e.b(C10256f.f102333a, new A50.b(this, 5));
                                velocityTracker2.recycle();
                            }
                        }
                    }
                    z11 = false;
                    if (!this.f102311i) {
                    }
                    if (Math.abs(view.getTranslationY()) <= f15) {
                    }
                }
                ViewParent parent = v11.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
                interfaceC6511n.invoke(e11, Boolean.valueOf(this.f102318p), Boolean.valueOf(this.f102317o));
            } else if (action == 2) {
                if (!this.f102319q) {
                    j(v11, e11);
                }
                float x11 = e11.getX();
                PointF pointF = this.f102314l;
                final float f17 = x11 - pointF.x;
                final float y11 = e11.getY() - pointF.y;
                float scaledTouchSlop = this.f102312j.getScaledTouchSlop() * this.f102309g;
                if (Math.abs(y11) > scaledTouchSlop) {
                    if (!this.f102318p) {
                        this.f102317o = true;
                    }
                    if (this.f102317o) {
                        c10255e.b(C10251a.f102326a, new Function0() { // from class: v50.v
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return D.d(D.this, y11);
                            }
                        });
                        VelocityTracker velocityTracker3 = this.f102315m;
                        if (velocityTracker3 != null) {
                            velocityTracker3.addMovement(e11);
                        }
                    }
                }
                if (Math.abs(f17) > scaledTouchSlop) {
                    if (!this.f102317o) {
                        this.f102318p = true;
                    }
                    if (this.f102318p) {
                        c10255e.b(C10251a.f102326a, new Function0() { // from class: v50.w
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return D.b(D.this, f17);
                            }
                        });
                        VelocityTracker velocityTracker4 = this.f102315m;
                        if (velocityTracker4 != null) {
                            velocityTracker4.addMovement(e11);
                        }
                    }
                }
            } else if (action == 3) {
                this.f102319q = false;
            }
        } else {
            j(v11, e11);
        }
        this.f102316n.a(e11);
        return true;
    }
}
