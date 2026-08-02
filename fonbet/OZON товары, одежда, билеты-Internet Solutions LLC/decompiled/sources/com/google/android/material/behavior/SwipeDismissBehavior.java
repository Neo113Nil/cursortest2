package com.google.android.material.behavior;

import P2.b;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Y;
import y2.q;

/* loaded from: classes9.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a, reason: collision with root package name */
    P2.b f57993a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f57994b;

    /* renamed from: c, reason: collision with root package name */
    int f57995c = 2;

    /* renamed from: d, reason: collision with root package name */
    float f57996d = 0.5f;

    /* renamed from: e, reason: collision with root package name */
    float f57997e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    float f57998f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    private final b.c f57999g = new a();

    final class a extends b.c {

        /* renamed from: a, reason: collision with root package name */
        private int f58000a;

        /* renamed from: b, reason: collision with root package name */
        private int f58001b = -1;

        a() {
        }

        @Override // P2.b.c
        public final int clampViewPositionHorizontal(@NonNull View view, int i11, int i12) {
            int width;
            int width2;
            int width3;
            int i13 = Y.f42258g;
            boolean z11 = view.getLayoutDirection() == 1;
            int i14 = SwipeDismissBehavior.this.f57995c;
            if (i14 == 0) {
                if (z11) {
                    width = this.f58000a - view.getWidth();
                    width2 = this.f58000a;
                } else {
                    width = this.f58000a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i14 != 1) {
                width = this.f58000a - view.getWidth();
                width2 = view.getWidth() + this.f58000a;
            } else if (z11) {
                width = this.f58000a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f58000a - view.getWidth();
                width2 = this.f58000a;
            }
            return Math.min(Math.max(width, i11), width2);
        }

        @Override // P2.b.c
        public final int clampViewPositionVertical(@NonNull View view, int i11, int i12) {
            return view.getTop();
        }

        @Override // P2.b.c
        public final int getViewHorizontalDragRange(@NonNull View view) {
            return view.getWidth();
        }

        @Override // P2.b.c
        public final void onViewCaptured(@NonNull View view, int i11) {
            this.f58001b = i11;
            this.f58000a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // P2.b.c
        public final void onViewDragStateChanged(int i11) {
        }

        @Override // P2.b.c
        public final void onViewPositionChanged(@NonNull View view, int i11, int i12, int i13, int i14) {
            float f7 = this.f58000a;
            float width = view.getWidth();
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            float f11 = (width * swipeDismissBehavior.f57997e) + f7;
            float width2 = (view.getWidth() * swipeDismissBehavior.f57998f) + this.f58000a;
            float f12 = i11;
            if (f12 <= f11) {
                view.setAlpha(1.0f);
            } else if (f12 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((f12 - f11) / (width2 - f11))), 1.0f));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0050, code lost:
        
            if (java.lang.Math.abs(r9.getLeft() - r8.f58000a) >= java.lang.Math.round(r9.getWidth() * r2.f57996d)) goto L27;
         */
        @Override // P2.b.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onViewReleased(@NonNull View view, float f7, float f11) {
            int i11;
            this.f58001b = -1;
            int width = view.getWidth();
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            boolean z11 = true;
            if (f7 != 0.0f) {
                int i12 = Y.f42258g;
                boolean z12 = view.getLayoutDirection() == 1;
                int i13 = swipeDismissBehavior.f57995c;
                if (i13 != 2) {
                    if (i13 == 0) {
                        i11 = this.f58000a;
                        z11 = false;
                    } else {
                        i11 = this.f58000a;
                        z11 = false;
                    }
                }
                int left = view.getLeft();
                int i14 = this.f58000a;
                i11 = left < i14 ? i14 - width : i14 + width;
            }
            if (swipeDismissBehavior.f57993a.r(i11, view.getTop())) {
                c cVar = new c(view, z11);
                int i15 = Y.f42258g;
                view.postOnAnimation(cVar);
            }
        }

        @Override // P2.b.c
        public final boolean tryCaptureView(View view, int i11) {
            int i12 = this.f58001b;
            return (i12 == -1 || i12 == i11) && SwipeDismissBehavior.this.b(view);
        }
    }

    public interface b {
        void a(int i11);

        void onDismiss(View view);
    }

    private class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final View f58003a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f58004b;

        c(View view, boolean z11) {
            this.f58003a = view;
            this.f58004b = z11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            P2.b bVar = SwipeDismissBehavior.this.f57993a;
            View view = this.f58003a;
            if (bVar == null || !bVar.f()) {
                return;
            }
            int i11 = Y.f42258g;
            view.postOnAnimation(this);
        }
    }

    public boolean b(@NonNull View view) {
        return true;
    }

    public final void c() {
        this.f57998f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
    }

    public final void d() {
        this.f57997e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
    }

    public final void e() {
        this.f57995c = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull MotionEvent motionEvent) {
        boolean z11 = this.f57994b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z11 = coordinatorLayout.isPointInChildBounds(v11, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f57994b = z11;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f57994b = false;
        }
        if (!z11) {
            return false;
        }
        if (this.f57993a == null) {
            this.f57993a = P2.b.g(coordinatorLayout, this.f57999g);
        }
        return this.f57993a.s(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11) {
        boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, v11, i11);
        int i12 = Y.f42258g;
        if (v11.getImportantForAccessibility() == 0) {
            v11.setImportantForAccessibility(1);
            Y.x(1048576, v11);
            if (b(v11)) {
                Y.z(v11, q.a.f105949l, new com.google.android.material.behavior.b(this));
            }
        }
        return onLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v11, MotionEvent motionEvent) {
        P2.b bVar = this.f57993a;
        if (bVar == null) {
            return false;
        }
        bVar.m(motionEvent);
        return true;
    }
}
