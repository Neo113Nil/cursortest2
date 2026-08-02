package com.bytedance.adsdk.sf.gm.pcc;

import android.graphics.PointF;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj implements hc<PointF, PointF> {
    private final List<com.bytedance.adsdk.sf.qf.pcc<PointF>> pcc;

    public vj(List<com.bytedance.adsdk.sf.qf.pcc<PointF>> list) {
        this.pcc = list;
    }

    @Override // com.bytedance.adsdk.sf.gm.pcc.hc
    public List<com.bytedance.adsdk.sf.qf.pcc<PointF>> gm() {
        return this.pcc;
    }

    @Override // com.bytedance.adsdk.sf.gm.pcc.hc
    public com.bytedance.adsdk.sf.pcc.sf.pcc<PointF, PointF> pcc() {
        boolean vj = this.pcc.get(0).vj();
        List<com.bytedance.adsdk.sf.qf.pcc<PointF>> list = this.pcc;
        return vj ? new com.bytedance.adsdk.sf.pcc.sf.vh(list) : new com.bytedance.adsdk.sf.pcc.sf.ork(list);
    }

    @Override // com.bytedance.adsdk.sf.gm.pcc.hc
    public boolean sf() {
        return this.pcc.size() == 1 && this.pcc.get(0).vj();
    }
}
