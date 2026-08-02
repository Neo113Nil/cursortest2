package com.bytedance.adsdk.sf.pcc.sf;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.bytedance.adsdk.sf.pcc.sf.pcc;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class dax {
    private pcc<?, Float> gbb;
    private final Matrix gm;
    private pcc<?, Float> hc;
    private pcc<com.bytedance.adsdk.sf.qf.gm, com.bytedance.adsdk.sf.qf.gm> kj;
    private final Matrix oo;
    private pcc<Integer, Integer> ork;
    private final Matrix pcc = new Matrix();
    private pcc<?, PointF> qf;
    private final Matrix sf;
    private oo tmg;
    private oo vh;
    private final float[] vj;
    private pcc<Float, Float> vy;
    private pcc<PointF, PointF> wh;

    public dax(com.bytedance.adsdk.sf.gm.pcc.tmg tmgVar) {
        this.wh = tmgVar.pcc() == null ? null : tmgVar.pcc().pcc();
        this.qf = tmgVar.sf() == null ? null : tmgVar.sf().pcc();
        this.kj = tmgVar.gm() == null ? null : tmgVar.gm().pcc();
        this.vy = tmgVar.oo() == null ? null : tmgVar.oo().pcc();
        oo ooVar = tmgVar.kj() == null ? null : (oo) tmgVar.kj().pcc();
        this.vh = ooVar;
        if (ooVar != null) {
            this.sf = new Matrix();
            this.gm = new Matrix();
            this.oo = new Matrix();
            this.vj = new float[9];
        } else {
            this.sf = null;
            this.gm = null;
            this.oo = null;
            this.vj = null;
        }
        this.tmg = tmgVar.vy() == null ? null : (oo) tmgVar.vy().pcc();
        if (tmgVar.vj() != null) {
            this.ork = tmgVar.vj().pcc();
        }
        if (tmgVar.wh() != null) {
            this.hc = tmgVar.wh().pcc();
        } else {
            this.hc = null;
        }
        if (tmgVar.qf() != null) {
            this.gbb = tmgVar.qf().pcc();
        } else {
            this.gbb = null;
        }
    }

    private void vj() {
        for (int i = 0; i < 9; i++) {
            this.vj[i] = 0.0f;
        }
    }

    public pcc<?, Float> gm() {
        return this.gbb;
    }

    public Matrix oo() {
        PointF qf;
        PointF qf2;
        this.pcc.reset();
        pcc<?, PointF> pccVar = this.qf;
        if (pccVar != null && (qf2 = pccVar.qf()) != null) {
            float f = qf2.x;
            if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || qf2.y != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.pcc.preTranslate(f, qf2.y);
            }
        }
        pcc<Float, Float> pccVar2 = this.vy;
        if (pccVar2 != null) {
            float floatValue = pccVar2 instanceof nac ? pccVar2.qf().floatValue() : ((oo) pccVar2).vy();
            if (floatValue != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.pcc.preRotate(floatValue);
            }
        }
        if (this.vh != null) {
            float cos = this.tmg == null ? 0.0f : (float) Math.cos(Math.toRadians((-r3.vy()) + 90.0f));
            float sin = this.tmg == null ? 1.0f : (float) Math.sin(Math.toRadians((-r5.vy()) + 90.0f));
            float tan = (float) Math.tan(Math.toRadians(r0.vy()));
            vj();
            float[] fArr = this.vj;
            fArr[0] = cos;
            fArr[1] = sin;
            float f2 = -sin;
            fArr[3] = f2;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.sf.setValues(fArr);
            vj();
            float[] fArr2 = this.vj;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.gm.setValues(fArr2);
            vj();
            float[] fArr3 = this.vj;
            fArr3[0] = cos;
            fArr3[1] = f2;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.oo.setValues(fArr3);
            this.gm.preConcat(this.sf);
            this.oo.preConcat(this.gm);
            this.pcc.preConcat(this.oo);
        }
        pcc<com.bytedance.adsdk.sf.qf.gm, com.bytedance.adsdk.sf.qf.gm> pccVar3 = this.kj;
        if (pccVar3 != null) {
            com.bytedance.adsdk.sf.qf.gm qf3 = pccVar3.qf();
            if (qf3.pcc() != 1.0f || qf3.sf() != 1.0f) {
                this.pcc.preScale(qf3.pcc(), qf3.sf());
            }
        }
        pcc<PointF, PointF> pccVar4 = this.wh;
        if (pccVar4 != null && (((qf = pccVar4.qf()) != null && qf.x != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) || qf.y != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            this.pcc.preTranslate(-qf.x, -qf.y);
        }
        return this.pcc;
    }

    public void pcc(pcc.InterfaceC0027pcc interfaceC0027pcc) {
        pcc<Integer, Integer> pccVar = this.ork;
        if (pccVar != null) {
            pccVar.pcc(interfaceC0027pcc);
        }
        pcc<?, Float> pccVar2 = this.hc;
        if (pccVar2 != null) {
            pccVar2.pcc(interfaceC0027pcc);
        }
        pcc<?, Float> pccVar3 = this.gbb;
        if (pccVar3 != null) {
            pccVar3.pcc(interfaceC0027pcc);
        }
        pcc<PointF, PointF> pccVar4 = this.wh;
        if (pccVar4 != null) {
            pccVar4.pcc(interfaceC0027pcc);
        }
        pcc<?, PointF> pccVar5 = this.qf;
        if (pccVar5 != null) {
            pccVar5.pcc(interfaceC0027pcc);
        }
        pcc<com.bytedance.adsdk.sf.qf.gm, com.bytedance.adsdk.sf.qf.gm> pccVar6 = this.kj;
        if (pccVar6 != null) {
            pccVar6.pcc(interfaceC0027pcc);
        }
        pcc<Float, Float> pccVar7 = this.vy;
        if (pccVar7 != null) {
            pccVar7.pcc(interfaceC0027pcc);
        }
        oo ooVar = this.vh;
        if (ooVar != null) {
            ooVar.pcc(interfaceC0027pcc);
        }
        oo ooVar2 = this.tmg;
        if (ooVar2 != null) {
            ooVar2.pcc(interfaceC0027pcc);
        }
    }

    public Matrix sf(float f) {
        pcc<?, PointF> pccVar = this.qf;
        PointF qf = pccVar == null ? null : pccVar.qf();
        pcc<com.bytedance.adsdk.sf.qf.gm, com.bytedance.adsdk.sf.qf.gm> pccVar2 = this.kj;
        com.bytedance.adsdk.sf.qf.gm qf2 = pccVar2 == null ? null : pccVar2.qf();
        this.pcc.reset();
        if (qf != null) {
            this.pcc.preTranslate(qf.x * f, qf.y * f);
        }
        if (qf2 != null) {
            double d = f;
            this.pcc.preScale((float) Math.pow(qf2.pcc(), d), (float) Math.pow(qf2.sf(), d));
        }
        pcc<Float, Float> pccVar3 = this.vy;
        if (pccVar3 != null) {
            float floatValue = pccVar3.qf().floatValue();
            pcc<PointF, PointF> pccVar4 = this.wh;
            PointF qf3 = pccVar4 != null ? pccVar4.qf() : null;
            Matrix matrix = this.pcc;
            float f2 = floatValue * f;
            float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f4 = qf3 == null ? 0.0f : qf3.x;
            if (qf3 != null) {
                f3 = qf3.y;
            }
            matrix.preRotate(f2, f4, f3);
        }
        return this.pcc;
    }

    public void pcc(com.bytedance.adsdk.sf.gm.gm.pcc pccVar) {
        pccVar.pcc(this.ork);
        pccVar.pcc(this.hc);
        pccVar.pcc(this.gbb);
        pccVar.pcc(this.wh);
        pccVar.pcc(this.qf);
        pccVar.pcc(this.kj);
        pccVar.pcc(this.vy);
        pccVar.pcc(this.vh);
        pccVar.pcc(this.tmg);
    }

    public void pcc(float f) {
        pcc<Integer, Integer> pccVar = this.ork;
        if (pccVar != null) {
            pccVar.pcc(f);
        }
        pcc<?, Float> pccVar2 = this.hc;
        if (pccVar2 != null) {
            pccVar2.pcc(f);
        }
        pcc<?, Float> pccVar3 = this.gbb;
        if (pccVar3 != null) {
            pccVar3.pcc(f);
        }
        pcc<PointF, PointF> pccVar4 = this.wh;
        if (pccVar4 != null) {
            pccVar4.pcc(f);
        }
        pcc<?, PointF> pccVar5 = this.qf;
        if (pccVar5 != null) {
            pccVar5.pcc(f);
        }
        pcc<com.bytedance.adsdk.sf.qf.gm, com.bytedance.adsdk.sf.qf.gm> pccVar6 = this.kj;
        if (pccVar6 != null) {
            pccVar6.pcc(f);
        }
        pcc<Float, Float> pccVar7 = this.vy;
        if (pccVar7 != null) {
            pccVar7.pcc(f);
        }
        oo ooVar = this.vh;
        if (ooVar != null) {
            ooVar.pcc(f);
        }
        oo ooVar2 = this.tmg;
        if (ooVar2 != null) {
            ooVar2.pcc(f);
        }
    }

    public pcc<?, Integer> pcc() {
        return this.ork;
    }

    public pcc<?, Float> sf() {
        return this.hc;
    }
}
