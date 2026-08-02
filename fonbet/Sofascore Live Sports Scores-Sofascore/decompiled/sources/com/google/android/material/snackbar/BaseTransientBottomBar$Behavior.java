package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.unity3d.services.UnityAdsConstants;
import defpackage.hpo;
import defpackage.j71;
import defpackage.m71;
import defpackage.ujg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final hpo i;

    public BaseTransientBottomBar$Behavior() {
        hpo hpoVar = new hpo();
        this.f = Math.min(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.1f), 1.0f);
        this.g = Math.min(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.6f), 1.0f);
        this.e = 0;
        this.i = hpoVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.us3
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        hpo hpoVar = this.i;
        hpoVar.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                ujg.O().a0((j71) hpoVar.a);
            }
        } else if (coordinatorLayout.n(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            ujg.O().X((j71) hpoVar.a);
        }
        return super.k(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean w(View view) {
        this.i.getClass();
        return view instanceof m71;
    }
}
