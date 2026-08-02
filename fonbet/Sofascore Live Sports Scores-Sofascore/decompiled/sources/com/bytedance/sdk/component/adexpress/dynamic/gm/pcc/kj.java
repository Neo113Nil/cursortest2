package com.bytedance.sdk.component.adexpress.dynamic.gm.pcc;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class kj implements View.OnTouchListener {
    private final int gm = 10;
    private float oo;
    private final com.bytedance.sdk.component.adexpress.dynamic.gm.kj pcc;
    private float qf;
    private final boolean sf;
    private float vj;
    private float wh;

    public kj(com.bytedance.sdk.component.adexpress.dynamic.gm.kj kjVar, boolean z) {
        this.pcc = kjVar;
        this.sf = z;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.gm.kj kjVar;
        com.bytedance.sdk.component.adexpress.dynamic.gm.kj kjVar2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.oo = motionEvent.getX();
            this.vj = motionEvent.getY();
            new StringBuilder(", mStartY: ").append(this.vj);
        } else if (action == 1) {
            this.wh = motionEvent.getX();
            this.qf = motionEvent.getY();
            new StringBuilder(", mEndY: ").append(this.qf);
            if (this.sf || (kjVar2 = this.pcc) == null) {
                float f = this.wh - this.oo;
                float f2 = this.qf - this.vj;
                if (com.bytedance.sdk.component.adexpress.oo.qf.sf(com.bytedance.sdk.component.adexpress.oo.pcc(), Math.abs((float) Math.sqrt((f2 * f2) + (f * f)))) > 10.0f && (kjVar = this.pcc) != null) {
                    kjVar.pcc();
                }
            } else {
                kjVar2.pcc();
            }
        }
        return true;
    }
}
