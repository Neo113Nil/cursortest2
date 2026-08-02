package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class y0 implements View.OnTouchListener {
    public final x0 a;
    public float b;
    public float c;
    public final float d;

    public y0(x0 x0Var, Context context) {
        this.a = x0Var;
        this.d = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.a != null) {
            if (motionEvent.getActionMasked() == 0) {
                ((i) this.a).i();
                this.b = motionEvent.getX();
                this.c = motionEvent.getY();
            } else if (motionEvent.getActionMasked() == 3) {
                ((i) this.a).i();
                this.c = -1.0f;
                this.b = -1.0f;
            } else if (motionEvent.getActionMasked() == 1) {
                float f = this.b;
                if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.c >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    float round = Math.round(Math.abs(f - motionEvent.getX()));
                    float round2 = Math.round(Math.abs(this.c - motionEvent.getY()));
                    float f2 = this.d;
                    if (round < f2 && round2 < f2) {
                        i iVar = (i) this.a;
                        iVar.getClass();
                        IAlog.a("IAWebViewController onClicked()", new Object[0]);
                        if (iVar.l != null) {
                            IAlog.e("Native click detected in time. Processing pending click", new Object[0]);
                            iVar.l.d();
                            d dVar = iVar.m;
                            if (dVar != null) {
                                com.fyber.inneractive.sdk.util.r.b.removeCallbacks(dVar);
                            }
                            iVar.l = null;
                            iVar.i();
                        } else {
                            if (iVar.n != null) {
                                com.fyber.inneractive.sdk.util.r.b.postDelayed(iVar.n, IAConfigManager.N.t.b.a("click_timeout", 1000, 1000));
                            }
                            iVar.j = true;
                        }
                    }
                    this.b = -1.0f;
                    this.c = -1.0f;
                }
            }
        }
        return false;
    }
}
