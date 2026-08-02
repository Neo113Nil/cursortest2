package com.bytedance.sdk.openadsdk.core.hc.wh;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.oo.gbb;
import com.bytedance.adsdk.ugeno.oo.vh;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm implements gbb {
    private boolean pcc = false;

    @Override // com.bytedance.adsdk.ugeno.oo.gbb
    public boolean pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, MotionEvent motionEvent, vh vhVar, com.bytedance.adsdk.ugeno.oo.oo.gm gmVar2) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.pcc = true;
        } else if ((action == 1 || action == 3) && this.pcc) {
            this.pcc = false;
            if (pcc(gmVar.vh(), motionEvent.getX(), motionEvent.getY()) && vhVar != null) {
                vhVar.pcc(gmVar, gmVar2.oo(), gmVar2.qf().sf(), gmVar2.qf());
            }
        }
        return true;
    }

    private boolean pcc(View view, float f, float f2) {
        return f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f < ((float) view.getWidth()) && f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 < ((float) view.getHeight());
    }
}
