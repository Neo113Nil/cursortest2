package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.c;
import androidx.core.view.z0;
import androidx.customview.widget.h;
import androidx.customview.widget.i;
import java.util.WeakHashMap;
import q0.b;
import q0.g;
import q0.o;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends c {
    private static final float DEFAULT_ALPHA_END_DISTANCE = 0.5f;
    private static final float DEFAULT_ALPHA_START_DISTANCE = 0.0f;
    private static final float DEFAULT_DRAG_DISMISS_THRESHOLD = 0.5f;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public static final int SWIPE_DIRECTION_ANY = 2;
    public static final int SWIPE_DIRECTION_END_TO_START = 1;
    public static final int SWIPE_DIRECTION_START_TO_END = 0;
    private boolean interceptingEvents;
    OnDismissListener listener;
    private boolean requestingDisallowInterceptTouchEvent;
    private boolean sensitivitySet;
    i viewDragHelper;
    private float sensitivity = DEFAULT_ALPHA_START_DISTANCE;
    int swipeDirection = 2;
    float dragDismissThreshold = 0.5f;
    float alphaStartSwipeDistance = DEFAULT_ALPHA_START_DISTANCE;
    float alphaEndSwipeDistance = 0.5f;
    private final h dragCallback = new h() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.1
        private static final int INVALID_POINTER_ID = -1;
        private int activePointerId = -1;
        private int originalCapturedViewLeft;

        private boolean shouldDismiss(@NonNull View view, float f6) {
            if (f6 == SwipeDismissBehavior.DEFAULT_ALPHA_START_DISTANCE) {
                return Math.abs(view.getLeft() - this.originalCapturedViewLeft) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.dragDismissThreshold);
            }
            boolean z5 = view.getLayoutDirection() == 1;
            int i5 = SwipeDismissBehavior.this.swipeDirection;
            if (i5 == 2) {
                return true;
            }
            if (i5 == 0) {
                return z5 ? f6 < SwipeDismissBehavior.DEFAULT_ALPHA_START_DISTANCE : f6 > SwipeDismissBehavior.DEFAULT_ALPHA_START_DISTANCE;
            }
            if (i5 == 1) {
                if (z5) {
                    return f6 > SwipeDismissBehavior.DEFAULT_ALPHA_START_DISTANCE;
                }
                if (f6 < SwipeDismissBehavior.DEFAULT_ALPHA_START_DISTANCE) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.customview.widget.h
        public int clampViewPositionHorizontal(@NonNull View view, int i5, int i10) {
            int width;
            int width2;
            int width3;
            boolean z5 = view.getLayoutDirection() == 1;
            int i11 = SwipeDismissBehavior.this.swipeDirection;
            if (i11 == 0) {
                if (z5) {
                    width = this.originalCapturedViewLeft - view.getWidth();
                    width2 = this.originalCapturedViewLeft;
                } else {
                    width = this.originalCapturedViewLeft;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i11 != 1) {
                width = this.originalCapturedViewLeft - view.getWidth();
                width2 = view.getWidth() + this.originalCapturedViewLeft;
            } else if (z5) {
                width = this.originalCapturedViewLeft;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.originalCapturedViewLeft - view.getWidth();
                width2 = this.originalCapturedViewLeft;
            }
            return SwipeDismissBehavior.clamp(width, i5, width2);
        }

        @Override // androidx.customview.widget.h
        public int clampViewPositionVertical(@NonNull View view, int i5, int i10) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.h
        public int getViewHorizontalDragRange(@NonNull View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.h
        public void onViewCaptured(@NonNull View view, int i5) {
            this.activePointerId = i5;
            this.originalCapturedViewLeft = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.requestingDisallowInterceptTouchEvent = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.requestingDisallowInterceptTouchEvent = false;
            }
        }

        @Override // androidx.customview.widget.h
        public void onViewDragStateChanged(int i5) {
            OnDismissListener onDismissListener = SwipeDismissBehavior.this.listener;
            if (onDismissListener != null) {
                onDismissListener.onDragStateChanged(i5);
            }
        }

        @Override // androidx.customview.widget.h
        public void onViewPositionChanged(@NonNull View view, int i5, int i10, int i11, int i12) {
            float width = view.getWidth() * SwipeDismissBehavior.this.alphaStartSwipeDistance;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.alphaEndSwipeDistance;
            float abs = Math.abs(i5 - this.originalCapturedViewLeft);
            if (abs <= width) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(SwipeDismissBehavior.DEFAULT_ALPHA_START_DISTANCE);
            } else {
                view.setAlpha(SwipeDismissBehavior.clamp(SwipeDismissBehavior.DEFAULT_ALPHA_START_DISTANCE, 1.0f - SwipeDismissBehavior.fraction(width, width2, abs), 1.0f));
            }
        }

        @Override // androidx.customview.widget.h
        public void onViewReleased(@NonNull View view, float f6, float f10) {
            int i5;
            boolean z5;
            OnDismissListener onDismissListener;
            this.activePointerId = -1;
            int width = view.getWidth();
            if (shouldDismiss(view, f6)) {
                if (f6 >= SwipeDismissBehavior.DEFAULT_ALPHA_START_DISTANCE) {
                    int left = view.getLeft();
                    int i10 = this.originalCapturedViewLeft;
                    if (left >= i10) {
                        i5 = i10 + width;
                        z5 = true;
                    }
                }
                i5 = this.originalCapturedViewLeft - width;
                z5 = true;
            } else {
                i5 = this.originalCapturedViewLeft;
                z5 = false;
            }
            if (SwipeDismissBehavior.this.viewDragHelper.q(i5, view.getTop())) {
                view.postOnAnimation(new SettleRunnable(view, z5));
            } else {
                if (!z5 || (onDismissListener = SwipeDismissBehavior.this.listener) == null) {
                    return;
                }
                onDismissListener.onDismiss(view);
            }
        }

        @Override // androidx.customview.widget.h
        public boolean tryCaptureView(View view, int i5) {
            int i10 = this.activePointerId;
            return (i10 == -1 || i10 == i5) && SwipeDismissBehavior.this.canSwipeDismissView(view);
        }
    };

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public interface OnDismissListener {
        void onDismiss(View view);

        void onDragStateChanged(int i5);
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public class SettleRunnable implements Runnable {
        private final boolean dismiss;
        private final View view;

        public SettleRunnable(View view, boolean z5) {
            this.view = view;
            this.dismiss = z5;
        }

        @Override // java.lang.Runnable
        public void run() {
            OnDismissListener onDismissListener;
            i iVar = SwipeDismissBehavior.this.viewDragHelper;
            if (iVar != null && iVar.g()) {
                this.view.postOnAnimation(this);
            } else {
                if (!this.dismiss || (onDismissListener = SwipeDismissBehavior.this.listener) == null) {
                    return;
                }
                onDismissListener.onDismiss(this.view);
            }
        }
    }

    public static float clamp(float f6, float f10, float f11) {
        return Math.min(Math.max(f6, f10), f11);
    }

    private void ensureViewDragHelper(ViewGroup viewGroup) {
        i iVar;
        if (this.viewDragHelper == null) {
            if (this.sensitivitySet) {
                float f6 = this.sensitivity;
                iVar = new i(viewGroup.getContext(), viewGroup, this.dragCallback);
                iVar.f1552b = (int) ((1.0f / f6) * iVar.f1552b);
            } else {
                iVar = new i(viewGroup.getContext(), viewGroup, this.dragCallback);
            }
            this.viewDragHelper = iVar;
        }
    }

    public static float fraction(float f6, float f10, float f11) {
        return (f11 - f6) / (f10 - f6);
    }

    private void updateAccessibilityActions(View view) {
        z0.l(1048576, view);
        z0.i(0, view);
        if (canSwipeDismissView(view)) {
            z0.m(view, b.f21904l, null, new o() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.2
                @Override // q0.o
                public boolean perform(@NonNull View view2, g gVar) {
                    if (!SwipeDismissBehavior.this.canSwipeDismissView(view2)) {
                        return false;
                    }
                    boolean z5 = view2.getLayoutDirection() == 1;
                    int i5 = SwipeDismissBehavior.this.swipeDirection;
                    int width = (!(i5 == 0 && z5) && (i5 != 1 || z5)) ? view2.getWidth() : -view2.getWidth();
                    WeakHashMap weakHashMap = z0.f1413a;
                    view2.offsetLeftAndRight(width);
                    view2.setAlpha(SwipeDismissBehavior.DEFAULT_ALPHA_START_DISTANCE);
                    OnDismissListener onDismissListener = SwipeDismissBehavior.this.listener;
                    if (onDismissListener != null) {
                        onDismissListener.onDismiss(view2);
                    }
                    return true;
                }
            });
        }
    }

    public boolean canSwipeDismissView(@NonNull View view) {
        return true;
    }

    public int getDragState() {
        i iVar = this.viewDragHelper;
        if (iVar != null) {
            return iVar.f1551a;
        }
        return 0;
    }

    public OnDismissListener getListener() {
        return this.listener;
    }

    @Override // androidx.coordinatorlayout.widget.c
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull MotionEvent motionEvent) {
        boolean z5 = this.interceptingEvents;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z5 = coordinatorLayout.isPointInChildBounds(v5, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.interceptingEvents = z5;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.interceptingEvents = false;
        }
        if (z5) {
            ensureViewDragHelper(coordinatorLayout);
            if (!this.requestingDisallowInterceptTouchEvent && this.viewDragHelper.r(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.c
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, int i5) {
        boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, v5, i5);
        if (v5.getImportantForAccessibility() == 0) {
            v5.setImportantForAccessibility(1);
            updateAccessibilityActions(v5);
        }
        return onLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.c
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v5, MotionEvent motionEvent) {
        if (this.viewDragHelper == null) {
            return false;
        }
        if (this.requestingDisallowInterceptTouchEvent && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.viewDragHelper.k(motionEvent);
        return true;
    }

    public void setDragDismissDistance(float f6) {
        this.dragDismissThreshold = clamp(DEFAULT_ALPHA_START_DISTANCE, f6, 1.0f);
    }

    public void setEndAlphaSwipeDistance(float f6) {
        this.alphaEndSwipeDistance = clamp(DEFAULT_ALPHA_START_DISTANCE, f6, 1.0f);
    }

    public void setListener(OnDismissListener onDismissListener) {
        this.listener = onDismissListener;
    }

    public void setSensitivity(float f6) {
        this.sensitivity = f6;
        this.sensitivitySet = true;
    }

    public void setStartAlphaSwipeDistance(float f6) {
        this.alphaStartSwipeDistance = clamp(DEFAULT_ALPHA_START_DISTANCE, f6, 1.0f);
    }

    public void setSwipeDirection(int i5) {
        this.swipeDirection = i5;
    }

    public static int clamp(int i5, int i10, int i11) {
        return Math.min(Math.max(i5, i10), i11);
    }
}
