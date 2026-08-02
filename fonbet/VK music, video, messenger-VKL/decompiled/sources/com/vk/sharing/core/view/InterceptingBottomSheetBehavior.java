package com.vk.sharing.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.PagerViewBottomSheetBehavior;
import java.lang.ref.WeakReference;
import xsna.id;
import xsna.kl2;
import xsna.tnf;
import xsna.tv9;
import xsna.x750;

/* compiled from: InterceptingBottomSheetBehavior.kt */
/* loaded from: classes5.dex */
public final class InterceptingBottomSheetBehavior<V extends View> extends PagerViewBottomSheetBehavior<V> {
    public static final /* synthetic */ int s0 = 0;
    public volatile boolean k0;
    public x750 l0;
    public int m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public WeakReference<View> q0;
    public final kl2 r0;

    /* compiled from: InterceptingBottomSheetBehavior.kt */
    public static final class a extends BottomSheetBehavior.d {
        public final /* synthetic */ InterceptingBottomSheetBehavior<V> a;

        public a(InterceptingBottomSheetBehavior<V> interceptingBottomSheetBehavior) {
            this.a = interceptingBottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void b(View view, float f) {
            if (this.a.k0) {
                InterceptingBottomSheetBehavior<V> interceptingBottomSheetBehavior = this.a;
                if (interceptingBottomSheetBehavior.n0) {
                    return;
                }
                int i = interceptingBottomSheetBehavior.m0;
                if ((i == 4 || i == 3) && f < -0.25f) {
                    interceptingBottomSheetBehavior.n0 = true;
                    interceptingBottomSheetBehavior.p0 = true;
                    view.removeCallbacks(interceptingBottomSheetBehavior.r0);
                    view.post(this.a.r0);
                    view.post(new id(this.a, 6));
                }
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void c(int i, View view) {
            InterceptingBottomSheetBehavior<V> interceptingBottomSheetBehavior;
            int i2;
            WeakReference<View> weakReference = this.a.q0;
            if ((weakReference != null ? weakReference.get() : null) == null) {
                this.a.q0 = new WeakReference<>(view);
            }
            if (i == 1) {
                InterceptingBottomSheetBehavior<V> interceptingBottomSheetBehavior2 = this.a;
                interceptingBottomSheetBehavior2.n0 = false;
                interceptingBottomSheetBehavior2.p0 = false;
                return;
            }
            if (i == 3 || i == 4) {
                InterceptingBottomSheetBehavior<V> interceptingBottomSheetBehavior3 = this.a;
                if (interceptingBottomSheetBehavior3.o0) {
                    return;
                }
                interceptingBottomSheetBehavior3.m0 = i;
                interceptingBottomSheetBehavior3.p0 = false;
                return;
            }
            if (i != 5) {
                return;
            }
            if (this.a.k0 && ((i2 = (interceptingBottomSheetBehavior = this.a).m0) == 4 || i2 == 3)) {
                view.post(new tv9(interceptingBottomSheetBehavior, 4));
                return;
            }
            InterceptingBottomSheetBehavior<V> interceptingBottomSheetBehavior4 = this.a;
            if (interceptingBottomSheetBehavior4.o0) {
                return;
            }
            interceptingBottomSheetBehavior4.m0 = i;
        }
    }

    public InterceptingBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m0 = 5;
        this.r0 = new kl2(this, 4);
        D(new a(this));
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean C(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!this.p0) {
            return super.C(coordinatorLayout, v, motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 1 && action != 3) {
            return true;
        }
        this.o0 = false;
        kl2 kl2Var = this.r0;
        v.removeCallbacks(kl2Var);
        v.post(kl2Var);
        return true;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    public final void X(int i) {
        int i2;
        View view;
        if (!this.k0 || (((i2 = this.m0) != 4 && i2 != 3) || i != 5)) {
            super.X(i);
            return;
        }
        super.X(4);
        if (this.n0) {
            return;
        }
        this.n0 = true;
        WeakReference<View> weakReference = this.q0;
        if (weakReference == null || (view = weakReference.get()) == null || !view.isAttachedToWindow()) {
            return;
        }
        view.post(new tnf(this, 3));
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean m(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.o0 = true;
            this.n0 = false;
            this.p0 = false;
        } else if (action == 1 || action == 3) {
            this.o0 = false;
            if (this.p0) {
                kl2 kl2Var = this.r0;
                v.removeCallbacks(kl2Var);
                v.post(kl2Var);
            }
        }
        if (this.p0) {
            return true;
        }
        return super.m(coordinatorLayout, v, motionEvent);
    }
}
