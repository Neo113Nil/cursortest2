package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import defpackage.bsk;
import defpackage.j0l;
import defpackage.jsk;
import defpackage.us3;
import defpackage.woi;
import defpackage.x9;
import defpackage.yia;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class SwipeDismissBehavior<V extends View> extends us3 {
    public jsk a;
    public j0l b;
    public boolean c;
    public boolean d;
    public int e = 2;
    public float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float g = 0.5f;
    public final woi h = new woi(this);

    @Override // defpackage.us3
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.n(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.c = false;
        }
        if (z) {
            jsk jskVar = this.a;
            if (jskVar == null) {
                jskVar = new jsk(coordinatorLayout.getContext(), coordinatorLayout, this.h);
                this.a = jskVar;
            }
            if (!this.d && jskVar.o(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.us3
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            bsk.n(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, view);
            bsk.k(0, view);
            if (w(view)) {
                bsk.o(view, x9.k, new yia(this, 21));
            }
        }
        return false;
    }

    @Override // defpackage.us3
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        if (this.d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.a.i(motionEvent);
        return true;
    }

    public boolean w(View view) {
        return true;
    }
}
