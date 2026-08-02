package com.google.android.material.snackbar;

import Ve.C4202e4;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes9.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    private final C4202e4 f58508h;

    public BaseTransientBottomBar$Behavior() {
        C4202e4 c4202e4 = new C4202e4();
        d();
        c();
        e();
        this.f58508h = c4202e4;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean b(View view) {
        this.f58508h.getClass();
        return view instanceof a;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
        this.f58508h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                b.a().d();
            }
        } else if (coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            b.a().c();
        }
        return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
    }
}
