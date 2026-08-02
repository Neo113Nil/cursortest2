package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ldh implements View.OnTouchListener {
    public final View a;
    public final boolean b;
    public float c = -1.0f;
    public float d = -1.0f;
    public final BottomSheetBehavior e;

    public ldh(View view, boolean z) {
        this.a = view;
        this.b = z;
        Object parent = view.getParent();
        parent.getClass();
        this.e = BottomSheetBehavior.C((View) parent);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Boolean valueOf;
        view.getClass();
        motionEvent.getClass();
        if (motionEvent.getAction() == 0) {
            this.c = motionEvent.getX();
            this.d = motionEvent.getY();
        } else {
            int action = motionEvent.getAction();
            BottomSheetBehavior bottomSheetBehavior = this.e;
            View view2 = this.a;
            if (action == 1) {
                if (Math.abs(this.d - motionEvent.getY()) > Math.abs(this.c - motionEvent.getX())) {
                    ViewParent parent = view2.getParent().getParent();
                    CoordinatorLayout coordinatorLayout = parent instanceof CoordinatorLayout ? (CoordinatorLayout) parent : null;
                    Object parent2 = view2.getParent();
                    View view3 = parent2 instanceof View ? (View) parent2 : null;
                    if (coordinatorLayout != null) {
                        valueOf = view3 != null ? Boolean.valueOf(bottomSheetBehavior.v(coordinatorLayout, view3, motionEvent)) : null;
                        if (valueOf != null) {
                            return valueOf.booleanValue();
                        }
                    }
                    return false;
                }
            } else if (motionEvent.getAction() == 2 && Math.abs(this.d - motionEvent.getY()) > Math.abs(this.c - motionEvent.getX())) {
                ViewParent parent3 = view2.getParent().getParent();
                CoordinatorLayout coordinatorLayout2 = parent3 instanceof CoordinatorLayout ? (CoordinatorLayout) parent3 : null;
                Object parent4 = view2.getParent();
                View view4 = parent4 instanceof View ? (View) parent4 : null;
                if (coordinatorLayout2 != null) {
                    valueOf = view4 != null ? Boolean.valueOf(bottomSheetBehavior.v(coordinatorLayout2, view4, motionEvent)) : null;
                    if (valueOf != null) {
                        return valueOf.booleanValue();
                    }
                }
                return false;
            }
        }
        return this.b;
    }
}
