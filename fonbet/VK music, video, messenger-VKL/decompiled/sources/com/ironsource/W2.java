package com.ironsource;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.V0;
import com.ironsource.W2;
import com.unity3d.services.UnityAdsConstants;
import xsna.fl80;
import xsna.oyl0;
import xsna.rzs0;
import xsna.sla;

/* loaded from: classes13.dex */
public final class W2 extends FrameLayout {
    private final Eg a;

    public static final class a implements Eg {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(V0 v0, long j) {
            v0.c(new fl80(v0, j, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(V0 v0, long j) {
            v0.d().h().a(j);
        }

        @Override // com.ironsource.Eg
        public void a(View view, FrameLayout.LayoutParams layoutParams, final V0 v0) {
            View childAt = W2.this.getChildAt(0);
            final long f = Kb.u.d().h().f();
            if (f <= 0) {
                W2.this.removeView(childAt);
                W2.this.addView(view, layoutParams);
                v0.c(new rzs0(v0, f, 1));
                return;
            }
            v0.c(new Runnable() { // from class: xsna.r7x0
                @Override // java.lang.Runnable
                public final void run() {
                    W2.a.b(V0.this, f);
                }
            });
            view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            W2.this.addView(view, layoutParams);
            if (childAt != null) {
                childAt.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(f).withStartAction(new oyl0(childAt, 1)).withEndAction(new sla(W2.this, childAt, childAt, 3)).start();
            }
            view.animate().alpha(1.0f).setDuration(f).withEndAction(new Runnable() { // from class: xsna.s7x0
                @Override // java.lang.Runnable
                public final void run() {
                    W2.a.c(V0.this, f);
                }
            }).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(V0 v0, long j) {
            v0.d().h().a(true, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(V0 v0, long j) {
            v0.d().h().a(false, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(View view) {
            view.setEnabled(false);
            view.setClickable(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(W2 w2, View view, View view2) {
            w2.removeView(view);
            view2.setEnabled(true);
            view2.setClickable(true);
        }
    }

    public W2(Context context) {
        super(context);
        this.a = new a();
    }

    public final Eg getViewBinder() {
        return this.a;
    }
}
