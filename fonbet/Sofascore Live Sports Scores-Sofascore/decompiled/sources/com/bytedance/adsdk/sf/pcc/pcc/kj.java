package com.bytedance.adsdk.sf.pcc.pcc;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;
import com.bytedance.adsdk.sf.pcc.sf.pcc;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class kj implements vh, vj, pcc.InterfaceC0027pcc {
    private com.bytedance.adsdk.sf.pcc.sf.pcc<ColorFilter, ColorFilter> dax;
    private com.bytedance.adsdk.sf.pcc.sf.gm fum;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<PointF, PointF> gbb;
    private final boolean gm;
    private final int gpj;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<Integer, Integer> hc;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<PointF, PointF> jr;
    private final Paint kj;
    private com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> lo;
    private final com.bytedance.adsdk.sf.vy lu;
    private com.bytedance.adsdk.sf.pcc.sf.nac nac;
    private final com.bytedance.adsdk.sf.gm.gm.pcc oo;
    private final List<hc> ork;
    float pcc;
    private final Path qf;
    private final String sf;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<com.bytedance.adsdk.sf.gm.sf.oo, com.bytedance.adsdk.sf.gm.sf.oo> tmg;
    private final com.bytedance.adsdk.sf.gm.sf.qf vh;
    private final RectF vy;
    private final LongSparseArray<LinearGradient> vj = new LongSparseArray<>();
    private final LongSparseArray<RadialGradient> wh = new LongSparseArray<>();

    public kj(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.qf qfVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar, com.bytedance.adsdk.sf.gm.sf.vj vjVar) {
        Path path = new Path();
        this.qf = path;
        this.kj = new com.bytedance.adsdk.sf.pcc.pcc(1);
        this.vy = new RectF();
        this.ork = new ArrayList();
        this.pcc = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.oo = pccVar;
        this.sf = vjVar.pcc();
        this.gm = vjVar.kj();
        this.lu = vyVar;
        this.vh = vjVar.sf();
        path.setFillType(vjVar.gm());
        this.gpj = (int) (qfVar.vj() / 32.0f);
        com.bytedance.adsdk.sf.pcc.sf.pcc<com.bytedance.adsdk.sf.gm.sf.oo, com.bytedance.adsdk.sf.gm.sf.oo> pcc = vjVar.oo().pcc();
        this.tmg = pcc;
        pcc.pcc(this);
        pccVar.pcc(pcc);
        com.bytedance.adsdk.sf.pcc.sf.pcc<Integer, Integer> pcc2 = vjVar.vj().pcc();
        this.hc = pcc2;
        pcc2.pcc(this);
        pccVar.pcc(pcc2);
        com.bytedance.adsdk.sf.pcc.sf.pcc<PointF, PointF> pcc3 = vjVar.wh().pcc();
        this.gbb = pcc3;
        pcc3.pcc(this);
        pccVar.pcc(pcc3);
        com.bytedance.adsdk.sf.pcc.sf.pcc<PointF, PointF> pcc4 = vjVar.qf().pcc();
        this.jr = pcc4;
        pcc4.pcc(this);
        pccVar.pcc(pcc4);
        if (pccVar.ork() != null) {
            com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pcc5 = pccVar.ork().pcc().pcc();
            this.lo = pcc5;
            pcc5.pcc(this);
            pccVar.pcc(this.lo);
        }
        if (pccVar.vh() != null) {
            this.fum = new com.bytedance.adsdk.sf.pcc.sf.gm(this, pccVar, pccVar.vh());
        }
    }

    private RadialGradient gm() {
        long oo = oo();
        RadialGradient radialGradient = this.wh.get(oo);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF qf = this.gbb.qf();
        PointF qf2 = this.jr.qf();
        com.bytedance.adsdk.sf.gm.sf.oo qf3 = this.tmg.qf();
        int[] pcc = pcc(qf3.sf());
        float[] pcc2 = qf3.pcc();
        float f = qf.x;
        float f2 = qf.y;
        float hypot = (float) Math.hypot(qf2.x - f, qf2.y - f2);
        if (hypot <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            hypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f, f2, hypot, pcc, pcc2, Shader.TileMode.CLAMP);
        this.wh.put(oo, radialGradient2);
        return radialGradient2;
    }

    private int oo() {
        int round = Math.round(this.gbb.kj() * this.gpj);
        int round2 = Math.round(this.jr.kj() * this.gpj);
        int round3 = Math.round(this.tmg.kj() * this.gpj);
        int i = round != 0 ? round * IronSourceError.ERROR_NON_EXISTENT_INSTANCE : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    private LinearGradient sf() {
        long oo = oo();
        LinearGradient linearGradient = this.vj.get(oo);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF qf = this.gbb.qf();
        PointF qf2 = this.jr.qf();
        com.bytedance.adsdk.sf.gm.sf.oo qf3 = this.tmg.qf();
        LinearGradient linearGradient2 = new LinearGradient(qf.x, qf.y, qf2.x, qf2.y, pcc(qf3.sf()), qf3.pcc(), Shader.TileMode.CLAMP);
        this.vj.put(oo, linearGradient2);
        return linearGradient2;
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.vj
    public void pcc(Canvas canvas, Matrix matrix, int i) {
        Path path;
        if (this.gm) {
            return;
        }
        com.bytedance.adsdk.sf.vj.pcc("GradientFillContent#draw");
        this.qf.reset();
        int i2 = 0;
        while (true) {
            int size = this.ork.size();
            path = this.qf;
            if (i2 >= size) {
                break;
            }
            path.addPath(this.ork.get(i2).oo(), matrix);
            i2++;
        }
        path.computeBounds(this.vy, false);
        Shader sf = this.vh == com.bytedance.adsdk.sf.gm.sf.qf.LINEAR ? sf() : gm();
        sf.setLocalMatrix(matrix);
        this.kj.setShader(sf);
        com.bytedance.adsdk.sf.pcc.sf.pcc<ColorFilter, ColorFilter> pccVar = this.dax;
        if (pccVar != null) {
            this.kj.setColorFilter(pccVar.qf());
        }
        com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pccVar2 = this.lo;
        if (pccVar2 != null) {
            float floatValue = pccVar2.qf().floatValue();
            if (floatValue == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.kj.setMaskFilter(null);
            } else if (floatValue != this.pcc) {
                this.kj.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.pcc = floatValue;
        }
        com.bytedance.adsdk.sf.pcc.sf.gm gmVar = this.fum;
        if (gmVar != null) {
            gmVar.pcc(this.kj);
        }
        this.kj.setAlpha(com.bytedance.adsdk.sf.wh.vj.pcc((int) ((((i / 255.0f) * this.hc.qf().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.qf, this.kj);
        com.bytedance.adsdk.sf.vj.sf("GradientFillContent#draw");
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.gm
    public void pcc(List<gm> list, List<gm> list2) {
        for (int i = 0; i < list2.size(); i++) {
            gm gmVar = list2.get(i);
            if (gmVar instanceof hc) {
                this.ork.add((hc) gmVar);
            }
        }
    }

    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.InterfaceC0027pcc
    public void pcc() {
        this.lu.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.vj
    public void pcc(RectF rectF, Matrix matrix, boolean z) {
        this.qf.reset();
        int i = 0;
        while (true) {
            int size = this.ork.size();
            Path path = this.qf;
            if (i < size) {
                path.addPath(this.ork.get(i).oo(), matrix);
                i++;
            } else {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
        }
    }

    private int[] pcc(int[] iArr) {
        if (this.nac == null) {
            return iArr;
        }
        throw null;
    }
}
