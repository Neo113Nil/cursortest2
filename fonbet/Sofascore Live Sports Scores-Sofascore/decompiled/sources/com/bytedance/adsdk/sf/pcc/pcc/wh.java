package com.bytedance.adsdk.sf.pcc.pcc;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.sf.gm.sf.gpj;
import com.bytedance.adsdk.sf.pcc.sf.pcc;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh implements hc, vh, pcc.InterfaceC0027pcc {
    private final com.bytedance.adsdk.sf.vy gm;
    private boolean kj;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<?, PointF> oo;
    private final Path pcc = new Path();
    private final sf qf = new sf();
    private final String sf;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<?, PointF> vj;
    private final com.bytedance.adsdk.sf.gm.sf.sf wh;

    public wh(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar, com.bytedance.adsdk.sf.gm.sf.sf sfVar) {
        this.sf = sfVar.pcc();
        this.gm = vyVar;
        com.bytedance.adsdk.sf.pcc.sf.pcc<PointF, PointF> pcc = sfVar.gm().pcc();
        this.oo = pcc;
        com.bytedance.adsdk.sf.pcc.sf.pcc<PointF, PointF> pcc2 = sfVar.sf().pcc();
        this.vj = pcc2;
        this.wh = sfVar;
        pccVar.pcc(pcc);
        pccVar.pcc(pcc2);
        pcc.pcc(this);
        pcc2.pcc(this);
    }

    private void sf() {
        this.kj = false;
        this.gm.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.hc
    public Path oo() {
        boolean z = this.kj;
        Path path = this.pcc;
        if (z) {
            return path;
        }
        path.reset();
        if (this.wh.vj()) {
            this.kj = true;
            return this.pcc;
        }
        PointF qf = this.oo.qf();
        float f = qf.x / 2.0f;
        float f2 = qf.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.pcc.reset();
        boolean oo = this.wh.oo();
        Path path2 = this.pcc;
        if (oo) {
            float f5 = -f2;
            path2.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5);
            Path path3 = this.pcc;
            float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f3;
            float f7 = -f;
            float f8 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f4;
            path3.cubicTo(f6, f5, f7, f8, f7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Path path4 = this.pcc;
            float f9 = f4 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            path4.cubicTo(f7, f9, f6, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2);
            Path path5 = this.pcc;
            float f10 = f3 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            path5.cubicTo(f10, f2, f, f9, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.pcc.cubicTo(f, f8, f10, f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5);
        } else {
            float f11 = -f2;
            path2.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f11);
            Path path6 = this.pcc;
            float f12 = f3 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f13 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f4;
            path6.cubicTo(f12, f11, f, f13, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Path path7 = this.pcc;
            float f14 = f4 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            path7.cubicTo(f, f14, f12, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2);
            Path path8 = this.pcc;
            float f15 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f3;
            float f16 = -f;
            path8.cubicTo(f15, f2, f16, f14, f16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.pcc.cubicTo(f16, f13, f15, f11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f11);
        }
        PointF qf2 = this.vj.qf();
        this.pcc.offset(qf2.x, qf2.y);
        this.pcc.close();
        this.qf.pcc(this.pcc);
        this.kj = true;
        return this.pcc;
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.gm
    public void pcc(List<gm> list, List<gm> list2) {
        for (int i = 0; i < list.size(); i++) {
            gm gmVar = list.get(i);
            if (gmVar instanceof fum) {
                fum fumVar = (fum) gmVar;
                if (fumVar.sf() == gpj.pcc.SIMULTANEOUSLY) {
                    this.qf.pcc(fumVar);
                    fumVar.pcc(this);
                }
            }
        }
    }

    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.InterfaceC0027pcc
    public void pcc() {
        sf();
    }
}
