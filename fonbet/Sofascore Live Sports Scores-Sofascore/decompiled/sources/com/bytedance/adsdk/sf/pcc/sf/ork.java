package com.bytedance.adsdk.sf.pcc.sf;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class ork extends qf<PointF> {
    private final PointF oo;
    private vy qf;
    private final float[] vj;
    private final PathMeasure wh;

    public ork(List<? extends com.bytedance.adsdk.sf.qf.pcc<PointF>> list) {
        super(list);
        this.oo = new PointF();
        this.vj = new float[2];
        this.wh = new PathMeasure();
    }

    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public PointF pcc(com.bytedance.adsdk.sf.qf.pcc<PointF> pccVar, float f) {
        vy vyVar = (vy) pccVar;
        Path sf = vyVar.sf();
        if (sf == null) {
            return pccVar.pcc;
        }
        if (this.gm != null) {
            vyVar.qf.getClass();
            oo();
            kj();
            throw null;
        }
        if (this.qf != vyVar) {
            this.wh.setPath(sf, false);
            this.qf = vyVar;
        }
        PathMeasure pathMeasure = this.wh;
        pathMeasure.getPosTan(pathMeasure.getLength() * f, this.vj, null);
        PointF pointF = this.oo;
        float[] fArr = this.vj;
        pointF.set(fArr[0], fArr[1]);
        return this.oo;
    }
}
