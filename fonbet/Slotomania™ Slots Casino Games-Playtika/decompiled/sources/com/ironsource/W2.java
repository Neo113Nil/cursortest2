package com.ironsource;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.W2;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class W2 extends FrameLayout {
    private final InterfaceC2765yg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W2(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = new a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.f, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public final InterfaceC2765yg getViewBinder() {
        return this.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public static final class a implements InterfaceC2765yg {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(V0 adTools, long j) {
            Intrinsics.checkNotNullParameter(adTools, "$adTools");
            adTools.e().h().a(true, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(final V0 adTools, final long j) {
            Intrinsics.checkNotNullParameter(adTools, "$adTools");
            adTools.d(new Runnable() { // from class: com.ironsource.W2$a$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    W2.a.d(V0.this, j);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(V0 adTools, long j) {
            Intrinsics.checkNotNullParameter(adTools, "$adTools");
            adTools.e().h().a(j);
        }

        @Override // com.ironsource.InterfaceC2765yg
        public void a(View view, FrameLayout.LayoutParams layoutParams, final V0 adTools) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            final View childAt = W2.this.getChildAt(0);
            final long f = Jb.u.d().h().f();
            if (f <= 0) {
                W2.this.removeView(childAt);
                W2.this.addView(view, layoutParams);
                adTools.d(new Runnable() { // from class: com.ironsource.W2$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        W2.a.a(V0.this, f);
                    }
                });
                return;
            }
            adTools.d(new Runnable() { // from class: com.ironsource.W2$a$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    W2.a.b(V0.this, f);
                }
            });
            view.setAlpha(0.0f);
            W2.this.addView(view, layoutParams);
            if (childAt != null) {
                final W2 w2 = W2.this;
                childAt.animate().alpha(0.0f).setDuration(f).withStartAction(new Runnable() { // from class: com.ironsource.W2$a$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        W2.a.a(childAt);
                    }
                }).withEndAction(new Runnable() { // from class: com.ironsource.W2$a$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        W2.a.a(W2.this, childAt, childAt);
                    }
                }).start();
            }
            view.animate().alpha(1.0f).setDuration(f).withEndAction(new Runnable() { // from class: com.ironsource.W2$a$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    W2.a.c(V0.this, f);
                }
            }).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(V0 adTools, long j) {
            Intrinsics.checkNotNullParameter(adTools, "$adTools");
            adTools.e().h().a(false, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(View this_apply) {
            Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
            this_apply.setEnabled(false);
            this_apply.setClickable(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(W2 this$0, View view, View this_apply) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
            this$0.removeView(view);
            this_apply.setEnabled(true);
            this_apply.setClickable(true);
        }
    }
}
