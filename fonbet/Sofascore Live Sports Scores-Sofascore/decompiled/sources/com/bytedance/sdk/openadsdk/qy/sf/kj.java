package com.bytedance.sdk.openadsdk.qy.sf;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.qy.sf.vj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class kj extends sf {
    private int oo;

    public kj(Integer num, View view, of ofVar, vj.pcc pccVar) {
        super(num, view, ofVar, 2000, pccVar);
        this.oo = 0;
    }

    @Override // com.bytedance.sdk.openadsdk.qy.sf.sf
    public boolean gm() {
        return wh.pcc(this.pcc.get(), this.sf.tqg()) && this.oo == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.qy.sf.sf
    public void oo() {
        super.oo();
    }

    @Override // com.bytedance.sdk.openadsdk.qy.sf.sf
    public void pcc() {
        if (this.oo != 1) {
            return;
        }
        super.pcc();
    }

    @Override // com.bytedance.sdk.openadsdk.qy.sf.sf
    public void sf(int i) {
        if (vy()) {
            return;
        }
        if (i == 6 || i == 5) {
            this.oo = 0;
            kj();
        }
        if (i == 3 || i == 2) {
            this.oo = 2;
            kj();
        }
        if (this.oo == 1 || i != 0) {
            return;
        }
        this.oo = 1;
        pcc();
    }

    @Override // com.bytedance.sdk.openadsdk.qy.sf.sf
    public boolean tmg() {
        int i = this.oo;
        boolean z = i == 2 || i == 0;
        if (z) {
            this.gm.set(false);
        }
        return !z || super.tmg();
    }

    @Override // com.bytedance.sdk.openadsdk.qy.sf.sf
    public int wh() {
        return 200;
    }
}
