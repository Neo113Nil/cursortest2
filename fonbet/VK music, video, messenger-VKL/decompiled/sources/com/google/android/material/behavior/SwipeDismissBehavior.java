package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.e;
import com.google.android.material.snackbar.g;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;
import xsna.am;
import xsna.b0u0;
import xsna.iut0;
import xsna.sln0;
import xsna.zut0;

/* loaded from: classes13.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public zut0 b;
    public e c;
    public boolean d;
    public boolean e;
    public int f = 2;
    public final float g = 0.5f;
    public float h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float i = 0.5f;
    public final a j = new a();

    public class a extends zut0.c {
        public int a;
        public int b = -1;

        public a() {
        }

        @Override // xsna.zut0.c
        public final int clampViewPositionHorizontal(@NonNull View view, int i, int i2) {
            int width;
            int width2;
            int width3;
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            boolean z = view.getLayoutDirection() == 1;
            int i3 = SwipeDismissBehavior.this.f;
            if (i3 == 0) {
                if (z) {
                    width = this.a - view.getWidth();
                    width2 = this.a;
                } else {
                    width = this.a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i3 != 1) {
                width = this.a - view.getWidth();
                width2 = view.getWidth() + this.a;
            } else if (z) {
                width = this.a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.a - view.getWidth();
                width2 = this.a;
            }
            return Math.min(Math.max(width, i), width2);
        }

        @Override // xsna.zut0.c
        public final int clampViewPositionVertical(@NonNull View view, int i, int i2) {
            return view.getTop();
        }

        @Override // xsna.zut0.c
        public final int getViewHorizontalDragRange(@NonNull View view) {
            return view.getWidth();
        }

        @Override // xsna.zut0.c
        public final void onViewCaptured(@NonNull View view, int i) {
            this.b = i;
            this.a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
                swipeDismissBehavior.e = true;
                parent.requestDisallowInterceptTouchEvent(true);
                swipeDismissBehavior.e = false;
            }
        }

        @Override // xsna.zut0.c
        public final void onViewDragStateChanged(int i) {
            e eVar = SwipeDismissBehavior.this.c;
            if (eVar != null) {
                BaseTransientBottomBar baseTransientBottomBar = eVar.a;
                if (i == 0) {
                    g.b().e(baseTransientBottomBar.t);
                } else if (i == 1 || i == 2) {
                    g.b().d(baseTransientBottomBar.t);
                }
            }
        }

        @Override // xsna.zut0.c
        public final void onViewPositionChanged(@NonNull View view, int i, int i2, int i3, int i4) {
            float width = view.getWidth();
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            float f = width * swipeDismissBehavior.h;
            float width2 = view.getWidth() * swipeDismissBehavior.i;
            float abs = Math.abs(i - this.a);
            if (abs <= f) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else {
                view.setAlpha(Math.min(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f - ((abs - f) / (width2 - f))), 1.0f));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x0050, code lost:
        
            if (java.lang.Math.abs(r9.getLeft() - r8.a) >= java.lang.Math.round(r9.getWidth() * r3.g)) goto L27;
         */
        @Override // xsna.zut0.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onViewReleased(@NonNull View view, float f, float f2) {
            int i;
            e eVar;
            this.b = -1;
            int width = view.getWidth();
            boolean z = false;
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                boolean z2 = view.getLayoutDirection() == 1;
                int i2 = swipeDismissBehavior.f;
                if (i2 != 2) {
                    i = i2 == 0 ? this.a : this.a;
                }
                if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    int left = view.getLeft();
                    int i3 = this.a;
                    if (left >= i3) {
                        i = i3 + width;
                        z = true;
                    }
                }
                i = this.a - width;
                z = true;
            }
            if (swipeDismissBehavior.b.s(i, view.getTop())) {
                b bVar = new b(view, z);
                WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                view.postOnAnimation(bVar);
            } else {
                if (!z || (eVar = swipeDismissBehavior.c) == null) {
                    return;
                }
                eVar.a(view);
            }
        }

        @Override // xsna.zut0.c
        public final boolean tryCaptureView(View view, int i) {
            int i2 = this.b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.D(view);
        }
    }

    public class b implements Runnable {
        public final View b;
        public final boolean c;

        public b(View view, boolean z) {
            this.b = view;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            e eVar;
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            zut0 zut0Var = swipeDismissBehavior.b;
            View view = this.b;
            if (zut0Var != null && zut0Var.h()) {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                view.postOnAnimation(this);
            } else {
                if (!this.c || (eVar = swipeDismissBehavior.c) == null) {
                    return;
                }
                eVar.a(view);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean C(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.b == null) {
            return false;
        }
        if (this.e && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.b.m(motionEvent);
        return true;
    }

    public boolean D(@NonNull View view) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        boolean z = this.d;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.O((int) motionEvent.getX(), (int) motionEvent.getY(), v);
            this.d = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.d = false;
        }
        if (z) {
            if (this.b == null) {
                this.b = new zut0(coordinatorLayout.getContext(), coordinatorLayout, this.j);
            }
            if (!this.e && this.b.t(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean n(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (v.getImportantForAccessibility() == 0) {
            v.setImportantForAccessibility(1);
            iut0.n(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, v);
            iut0.k(0, v);
            if (D(v)) {
                iut0.o(v, am.a.m, null, new sln0(this));
            }
        }
        return false;
    }
}
