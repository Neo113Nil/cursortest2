package com.bytedance.adsdk.sf.pcc.pcc;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.bytedance.adsdk.sf.gm.sf.gpj;
import com.bytedance.adsdk.sf.pcc.sf.pcc;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class jr implements hc, vh, pcc.InterfaceC0027pcc {
    private final String gm;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<?, Float> kj;
    private final boolean oo;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<?, PointF> qf;
    private boolean vh;
    private final com.bytedance.adsdk.sf.vy vj;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<?, PointF> wh;
    private final Path pcc = new Path();
    private final RectF sf = new RectF();
    private final sf vy = new sf();
    private com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> ork = null;

    public jr(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar, com.bytedance.adsdk.sf.gm.sf.vh vhVar) {
        this.gm = vhVar.pcc();
        this.oo = vhVar.vj();
        this.vj = vyVar;
        com.bytedance.adsdk.sf.pcc.sf.pcc<PointF, PointF> pcc = vhVar.oo().pcc();
        this.wh = pcc;
        com.bytedance.adsdk.sf.pcc.sf.pcc<PointF, PointF> pcc2 = vhVar.gm().pcc();
        this.qf = pcc2;
        com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pcc3 = vhVar.sf().pcc();
        this.kj = pcc3;
        pccVar.pcc(pcc);
        pccVar.pcc(pcc2);
        pccVar.pcc(pcc3);
        pcc.pcc(this);
        pcc2.pcc(this);
        pcc3.pcc(this);
    }

    private void sf() {
        this.vh = false;
        this.vj.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.hc
    public Path oo() {
        com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pccVar;
        boolean z = this.vh;
        Path path = this.pcc;
        if (z) {
            return path;
        }
        path.reset();
        if (this.oo) {
            this.vh = true;
            return this.pcc;
        }
        PointF qf = this.qf.qf();
        float f = qf.x / 2.0f;
        float f2 = qf.y / 2.0f;
        com.bytedance.adsdk.sf.pcc.sf.pcc<?, Float> pccVar2 = this.kj;
        float vy = pccVar2 == null ? 0.0f : ((com.bytedance.adsdk.sf.pcc.sf.oo) pccVar2).vy();
        if (vy == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (pccVar = this.ork) != null) {
            vy = Math.min(pccVar.qf().floatValue(), Math.min(f, f2));
        }
        float min = Math.min(f, f2);
        if (vy > min) {
            vy = min;
        }
        PointF qf2 = this.wh.qf();
        this.pcc.moveTo(qf2.x + f, (qf2.y - f2) + vy);
        this.pcc.lineTo(qf2.x + f, (qf2.y + f2) - vy);
        if (vy > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            RectF rectF = this.sf;
            float f3 = qf2.x;
            float f4 = vy * 2.0f;
            float f5 = qf2.y;
            rectF.set((f3 + f) - f4, (f5 + f2) - f4, f3 + f, f5 + f2);
            this.pcc.arcTo(this.sf, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 90.0f, false);
        }
        this.pcc.lineTo((qf2.x - f) + vy, qf2.y + f2);
        if (vy > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            RectF rectF2 = this.sf;
            float f6 = qf2.x;
            float f7 = qf2.y;
            float f8 = vy * 2.0f;
            rectF2.set(f6 - f, (f7 + f2) - f8, (f6 - f) + f8, f7 + f2);
            this.pcc.arcTo(this.sf, 90.0f, 90.0f, false);
        }
        this.pcc.lineTo(qf2.x - f, (qf2.y - f2) + vy);
        if (vy > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            RectF rectF3 = this.sf;
            float f9 = qf2.x;
            float f10 = qf2.y;
            float f11 = vy * 2.0f;
            rectF3.set(f9 - f, f10 - f2, (f9 - f) + f11, (f10 - f2) + f11);
            this.pcc.arcTo(this.sf, 180.0f, 90.0f, false);
        }
        this.pcc.lineTo((qf2.x + f) - vy, qf2.y - f2);
        if (vy > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            RectF rectF4 = this.sf;
            float f12 = qf2.x;
            float f13 = vy * 2.0f;
            float f14 = qf2.y;
            rectF4.set((f12 + f) - f13, f14 - f2, f12 + f, (f14 - f2) + f13);
            this.pcc.arcTo(this.sf, 270.0f, 90.0f, false);
        }
        this.pcc.close();
        this.vy.pcc(this.pcc);
        this.vh = true;
        return this.pcc;
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.gm
    public void pcc(List<gm> list, List<gm> list2) {
        for (int i = 0; i < list.size(); i++) {
            gm gmVar = list.get(i);
            if (gmVar instanceof fum) {
                fum fumVar = (fum) gmVar;
                if (fumVar.sf() == gpj.pcc.SIMULTANEOUSLY) {
                    this.vy.pcc(fumVar);
                    fumVar.pcc(this);
                }
            }
            if (gmVar instanceof nac) {
                this.ork = ((nac) gmVar).sf();
            }
        }
    }

    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.InterfaceC0027pcc
    public void pcc() {
        sf();
    }
}
