package com.bytedance.adsdk.sf.gm.pcc;

import android.graphics.PointF;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vy implements hc<PointF, PointF> {
    private final sf pcc;
    private final sf sf;

    public vy(sf sfVar, sf sfVar2) {
        this.pcc = sfVar;
        this.sf = sfVar2;
    }

    @Override // com.bytedance.adsdk.sf.gm.pcc.hc
    public List<com.bytedance.adsdk.sf.qf.pcc<PointF>> gm() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.bytedance.adsdk.sf.gm.pcc.hc
    public com.bytedance.adsdk.sf.pcc.sf.pcc<PointF, PointF> pcc() {
        return new com.bytedance.adsdk.sf.pcc.sf.gbb(this.pcc.pcc(), this.sf.pcc());
    }

    @Override // com.bytedance.adsdk.sf.gm.pcc.hc
    public boolean sf() {
        return this.pcc.sf() && this.sf.sf();
    }
}
