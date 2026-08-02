package com.bytedance.adsdk.sf.pcc.sf;

import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo extends qf<Float> {
    public oo(List<com.bytedance.adsdk.sf.qf.pcc<Float>> list) {
        super(list);
    }

    public float gm(com.bytedance.adsdk.sf.qf.pcc<Float> pccVar, float f) {
        if (pccVar.pcc == null || pccVar.sf == null) {
            a70.r("Missing values for keyframe.");
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (this.gm == null) {
            return com.bytedance.adsdk.sf.wh.vj.pcc(pccVar.wh(), pccVar.qf(), f);
        }
        pccVar.qf.getClass();
        oo();
        kj();
        throw null;
    }

    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public Float pcc(com.bytedance.adsdk.sf.qf.pcc<Float> pccVar, float f) {
        return Float.valueOf(gm(pccVar, f));
    }

    public float vy() {
        return gm(gm(), vj());
    }
}
