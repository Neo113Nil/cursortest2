package com.bytedance.adsdk.ugeno.oo.oo;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.oo.gbb;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vy extends gm {
    private gbb gbb;
    private boolean hc;
    private float tmg;
    private float vh;

    public vy(Context context) {
        super(context);
    }

    public boolean pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float rawX = motionEvent.getRawX();
                    float rawY = motionEvent.getRawY();
                    if (Math.abs(rawX - this.vh) >= 15.0f || Math.abs(rawY - this.tmg) >= 15.0f) {
                        this.hc = true;
                    }
                } else if (action == 3) {
                    this.hc = false;
                }
            }
            if (this.hc) {
                this.hc = false;
                this.vh = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.tmg = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                return false;
            }
            float rawX2 = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            if (Math.abs(rawX2 - this.vh) >= 15.0f || Math.abs(rawY2 - this.tmg) >= 15.0f) {
                this.hc = false;
                return false;
            }
            com.bytedance.adsdk.ugeno.oo.vh vhVar = this.pcc;
            if (vhVar != null) {
                vhVar.pcc(gmVar, this.wh, this.gm.sf(), this.gm);
                this.vh = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.tmg = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                return true;
            }
        } else {
            this.vh = motionEvent.getRawX();
            this.tmg = motionEvent.getRawY();
        }
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.oo.oo.gm
    public boolean pcc(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        gbb gbbVar = this.gbb;
        com.bytedance.adsdk.ugeno.sf.gm gmVar = this.sf;
        if (gbbVar != null) {
            return gbbVar.pcc(gmVar, motionEvent, this.pcc, this);
        }
        return pcc(gmVar, motionEvent);
    }

    public void pcc(gbb gbbVar) {
        this.gbb = gbbVar;
    }
}
