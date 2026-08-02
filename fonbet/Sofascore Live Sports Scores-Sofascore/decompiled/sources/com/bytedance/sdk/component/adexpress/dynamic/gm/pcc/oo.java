package com.bytedance.sdk.component.adexpress.dynamic.gm.pcc;

import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo implements View.OnTouchListener {
    private float gm;
    private boolean kj;
    private float oo;
    private int ork;
    private float pcc;
    private float qf;
    private float sf;
    private boolean vh;
    private boolean vj = true;
    private com.bytedance.sdk.component.adexpress.dynamic.gm.kj vy;
    private float wh;

    public oo(com.bytedance.sdk.component.adexpress.dynamic.gm.kj kjVar, int i, boolean z) {
        this.vy = kjVar;
        this.ork = i;
        this.vh = z;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.gm.kj kjVar;
        com.bytedance.sdk.component.adexpress.dynamic.gm.kj kjVar2;
        com.bytedance.sdk.component.adexpress.dynamic.gm.kj kjVar3;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.pcc = motionEvent.getX();
            this.sf = motionEvent.getY();
            this.wh = motionEvent.getY();
            this.vj = true;
        } else if (action != 1) {
            if (action == 2) {
                float y = motionEvent.getY();
                this.qf = y;
                if (Math.abs(y - this.wh) > 10.0f) {
                    this.kj = true;
                }
                this.oo = motionEvent.getX();
                this.gm = motionEvent.getY();
                if (Math.abs(this.oo - this.pcc) > 8.0f || Math.abs(this.gm - this.sf) > 8.0f) {
                    this.vj = false;
                }
            }
        } else {
            if (!this.kj && !this.vj) {
                return false;
            }
            if (this.vh || (kjVar3 = this.vy) == null) {
                int sf = com.bytedance.sdk.component.adexpress.oo.qf.sf(com.bytedance.sdk.component.adexpress.oo.pcc(), Math.abs(this.qf - this.wh));
                if (this.qf - this.wh < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && sf > this.ork && (kjVar2 = this.vy) != null) {
                    kjVar2.pcc();
                } else if (this.vj && (kjVar = this.vy) != null) {
                    kjVar.pcc();
                }
            } else {
                kjVar3.pcc();
            }
        }
        return true;
    }
}
