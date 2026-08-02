package com.bytedance.adsdk.sf.pcc.sf;

import android.graphics.PointF;
import defpackage.a70;
import defpackage.me4;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vh extends qf<PointF> {
    private final PointF oo;

    public vh(List<com.bytedance.adsdk.sf.qf.pcc<PointF>> list) {
        super(list);
        this.oo = new PointF();
    }

    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public PointF pcc(com.bytedance.adsdk.sf.qf.pcc<PointF> pccVar, float f, float f2, float f3) {
        PointF pointF;
        PointF pointF2 = pccVar.pcc;
        if (pointF2 == null || (pointF = pccVar.sf) == null) {
            a70.r("Missing values for keyframe.");
            return null;
        }
        PointF pointF3 = pointF2;
        PointF pointF4 = pointF;
        if (this.gm != null) {
            pccVar.qf.getClass();
            oo();
            kj();
            throw null;
        }
        PointF pointF5 = this.oo;
        float f4 = pointF3.x;
        float b = me4.b(pointF4.x, f4, f2, f4);
        float f5 = pointF3.y;
        pointF5.set(b, me4.b(pointF4.y, f5, f3, f5));
        return this.oo;
    }

    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public PointF pcc(com.bytedance.adsdk.sf.qf.pcc<PointF> pccVar, float f) {
        return pcc(pccVar, f, f, f);
    }
}
