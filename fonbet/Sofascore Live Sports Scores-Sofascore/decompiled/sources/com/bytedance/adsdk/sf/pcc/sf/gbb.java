package com.bytedance.adsdk.sf.pcc.sf;

import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gbb extends pcc<PointF, PointF> {
    private final pcc<Float, Float> kj;
    protected com.bytedance.adsdk.sf.qf.sf<Float> oo;
    private final PointF qf;
    protected com.bytedance.adsdk.sf.qf.sf<Float> vj;
    private final pcc<Float, Float> vy;
    private final PointF wh;

    public gbb(pcc<Float, Float> pccVar, pcc<Float, Float> pccVar2) {
        super(Collections.EMPTY_LIST);
        this.wh = new PointF();
        this.qf = new PointF();
        this.kj = pccVar;
        this.vy = pccVar2;
        pcc(kj());
    }

    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc
    public void pcc(float f) {
        this.kj.pcc(f);
        this.vy.pcc(f);
        this.wh.set(this.kj.qf().floatValue(), this.vy.qf().floatValue());
        for (int i = 0; i < this.pcc.size(); i++) {
            this.pcc.get(i).pcc();
        }
    }

    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public PointF pcc(com.bytedance.adsdk.sf.qf.pcc<PointF> pccVar, float f) {
        if (this.oo != null && this.kj.gm() != null) {
            this.kj.vj();
            throw null;
        }
        if (this.vj != null && this.vy.gm() != null) {
            this.vy.vj();
            throw null;
        }
        this.qf.set(this.wh.x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        PointF pointF = this.qf;
        pointF.set(pointF.x, this.wh.y);
        return this.qf;
    }

    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc
    /* renamed from: vy, reason: merged with bridge method [inline-methods] */
    public PointF qf() {
        return pcc(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
