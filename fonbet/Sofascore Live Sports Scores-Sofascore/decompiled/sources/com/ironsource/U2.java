package com.ironsource;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import defpackage.j7k;
import defpackage.kdc;
import defpackage.rj4;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class U2 extends FrameLayout {

    @NotNull
    private final Bg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U2(@NotNull Context context) {
        super(context);
        context.getClass();
        this.a = new a();
    }

    @NotNull
    public final Bg getViewBinder() {
        return this.a;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Bg {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(T0 t0, long j) {
            t0.getClass();
            t0.f().h().a(true, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(T0 t0, long j) {
            t0.getClass();
            t0.a(new j7k(t0, j, 3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(T0 t0, long j) {
            t0.getClass();
            t0.f().h().a(j);
        }

        @Override // com.ironsource.Bg
        public void a(@NotNull View view, @NotNull FrameLayout.LayoutParams layoutParams, @NotNull T0 t0) {
            view.getClass();
            layoutParams.getClass();
            t0.getClass();
            int i = 0;
            View childAt = U2.this.getChildAt(0);
            long g = Ib.v.d().h().g();
            if (g <= 0) {
                U2.this.removeView(childAt);
                U2.this.addView(view, layoutParams);
                t0.a(new j7k(t0, g, i));
                return;
            }
            t0.a(new j7k(t0, g, 1));
            view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            U2.this.addView(view, layoutParams);
            if (childAt != null) {
                childAt.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(g).withStartAction(new rj4(4, childAt)).withEndAction(new kdc(20, U2.this, childAt, childAt)).start();
            }
            view.animate().alpha(1.0f).setDuration(g).withEndAction(new j7k(t0, g, 2)).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(T0 t0, long j) {
            t0.getClass();
            t0.f().h().a(false, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(View view) {
            view.getClass();
            view.setEnabled(false);
            view.setClickable(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(U2 u2, View view, View view2) {
            u2.getClass();
            view2.getClass();
            u2.removeView(view);
            view2.setEnabled(true);
            view2.setClickable(true);
        }
    }
}
