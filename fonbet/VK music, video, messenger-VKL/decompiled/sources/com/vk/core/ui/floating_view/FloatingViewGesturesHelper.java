package com.vk.core.ui.floating_view;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewParent;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.bp6;
import xsna.bz;
import xsna.czi;
import xsna.dz;
import xsna.epr0;
import xsna.fot;
import xsna.fr9;
import xsna.g8;
import xsna.izs;
import xsna.k0j;
import xsna.m9g0;
import xsna.mmf;
import xsna.mor0;
import xsna.n3i;
import xsna.rvq;
import xsna.s3q0;
import xsna.thp;
import xsna.wfv;
import xsna.zrp;

/* compiled from: FloatingViewGesturesHelper.kt */
/* loaded from: classes17.dex */
public final class FloatingViewGesturesHelper extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {
    public static final /* synthetic */ int f = 0;
    public final View b;
    public final boolean c;
    public final bp6 d;
    public final fot e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FloatingViewGesturesHelper.kt */
    public static final class SwipeDirection {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SwipeDirection[] $VALUES;
        public static final SwipeDirection Horizontal;
        public static final SwipeDirection None;
        public static final SwipeDirection VerticalBottom;
        public static final SwipeDirection VerticalUp;

        static {
            SwipeDirection swipeDirection = new SwipeDirection("Horizontal", 0);
            Horizontal = swipeDirection;
            SwipeDirection swipeDirection2 = new SwipeDirection("VerticalBottom", 1);
            VerticalBottom = swipeDirection2;
            SwipeDirection swipeDirection3 = new SwipeDirection("VerticalUp", 2);
            VerticalUp = swipeDirection3;
            SwipeDirection swipeDirection4 = new SwipeDirection("None", 3);
            None = swipeDirection4;
            SwipeDirection[] swipeDirectionArr = {swipeDirection, swipeDirection2, swipeDirection3, swipeDirection4};
            $VALUES = swipeDirectionArr;
            $ENTRIES = new asp(swipeDirectionArr);
        }

        public SwipeDirection() {
            throw null;
        }

        public static SwipeDirection valueOf(String str) {
            return (SwipeDirection) Enum.valueOf(SwipeDirection.class, str);
        }

        public static SwipeDirection[] values() {
            return (SwipeDirection[]) $VALUES.clone();
        }
    }

    /* compiled from: FloatingViewGesturesHelper.kt */
    public static final class a {

        /* compiled from: FloatingViewGesturesHelper.kt */
        /* renamed from: com.vk.core.ui.floating_view.FloatingViewGesturesHelper$a$a, reason: collision with other inner class name */
        public static final class C0787a {
            public izs<? super View, s3q0> a = new rvq(1);
            public izs<? super MotionEvent, s3q0> b = new bz(24);
            public izs<? super MotionEvent, s3q0> c = new g8(23);
            public izs<? super View, s3q0> d = new dz(28);
            public float e = 1.0f;
            public float f = 1.0f;
            public SwipeDirection g = SwipeDirection.Horizontal;
            public boolean h = true;

            public final FloatingViewGesturesHelper a(View view) {
                FloatingViewGesturesHelper floatingViewGesturesHelper = new FloatingViewGesturesHelper(view, this.b, this.a, this.c, this.d, this.e, this.f, this.g, this.h);
                view.setOnTouchListener(floatingViewGesturesHelper);
                return floatingViewGesturesHelper;
            }

            public final void b() {
                this.h = false;
            }

            public final void c(mmf mmfVar) {
                this.c = mmfVar;
            }

            public final void d(n3i n3iVar) {
                this.a = n3iVar;
            }

            public final void e(k0j k0jVar) {
                this.b = k0jVar;
            }

            public final void f(float f) {
                this.f = f;
            }

            public final void g(SwipeDirection swipeDirection) {
                this.g = swipeDirection;
            }

            public final void h() {
                this.e = 0.25f;
            }
        }

        public static C0787a a() {
            return new C0787a();
        }
    }

    /* compiled from: FloatingViewGesturesHelper.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            try {
                iArr[SwipeDirection.Horizontal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SwipeDirection.VerticalBottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SwipeDirection.VerticalUp.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SwipeDirection.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FloatingViewGesturesHelper(View view, izs izsVar, izs izsVar2, izs izsVar3, izs izsVar4, float f2, float f3, SwipeDirection swipeDirection, boolean z) {
        bp6 wfvVar;
        bp6 bp6Var;
        this.b = view;
        this.c = z;
        this.e = new fot(view.getContext(), this, null);
        int i = b.$EnumSwitchMapping$0[swipeDirection.ordinal()];
        if (i == 1) {
            wfvVar = new wfv(izsVar, izsVar3, izsVar2, izsVar4, f3, f2);
        } else if (i == 2) {
            wfvVar = new mor0(izsVar, izsVar3, izsVar2, izsVar4, f3, f2);
        } else {
            if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                bp6Var = new thp(izsVar, izsVar3, izsVar2, izsVar4, f3, f2);
                this.d = bp6Var;
            }
            wfvVar = new epr0(izsVar, izsVar3, izsVar2, izsVar4, f3, f2);
        }
        bp6Var = wfvVar;
        this.d = bp6Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        boolean z = this.c;
        View view = this.b;
        if (z) {
            view.performHapticFeedback(0);
        }
        view.performLongClick();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.b.performClick();
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        View view2 = this.b;
        bp6 bp6Var = this.d;
        if (action == 0) {
            bp6Var.getClass();
            bp6Var.j = VelocityTracker.obtain();
            PointF pointF = bp6Var.h;
            pointF.x = motionEvent.getX();
            pointF.y = motionEvent.getY();
            bp6Var.i = view2.getTranslationY();
            ViewParent parent = view2.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            bp6Var.a.invoke(motionEvent);
        } else if (action == 1) {
            bp6Var.a(view2, motionEvent);
        } else if (action == 2) {
            bp6Var.b(view, motionEvent);
        } else if (action == 3) {
            fr9 fr9Var = bp6Var.g;
            m9g0 m9g0Var = m9g0.c;
            if (((czi) fr9Var.b).j().contains(m9g0Var)) {
                fr9Var.b = m9g0Var;
                bp6.g(bp6Var, view2, bp6Var.i, 4);
                s3q0 s3q0Var = s3q0.a;
            }
            bp6Var.b.invoke(motionEvent);
        }
        this.e.a(motionEvent);
        return true;
    }
}
