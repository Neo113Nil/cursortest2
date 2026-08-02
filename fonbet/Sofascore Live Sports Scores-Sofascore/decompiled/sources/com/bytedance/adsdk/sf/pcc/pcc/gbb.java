package com.bytedance.adsdk.sf.pcc.pcc;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.sf.gm.sf.gpj;
import com.bytedance.adsdk.sf.gm.sf.ork;
import com.bytedance.adsdk.sf.pcc.sf.pcc;
import com.unity3d.services.UnityAdsConstants;
import defpackage.me4;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gbb implements hc, vh, pcc.InterfaceC0027pcc {
    private final com.bytedance.adsdk.sf.vy gm;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<?, Float> hc;
    private boolean jr;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<?, PointF> kj;
    private final ork.pcc oo;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<?, Float> ork;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<?, Float> qf;
    private final String sf;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<?, Float> tmg;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<?, Float> vh;
    private final boolean vj;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<?, Float> vy;
    private final boolean wh;
    private final Path pcc = new Path();
    private final sf gbb = new sf();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.adsdk.sf.pcc.pcc.gbb$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] pcc;

        static {
            int[] iArr = new int[ork.pcc.values().length];
            pcc = iArr;
            try {
                iArr[ork.pcc.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                pcc[ork.pcc.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public gbb(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar, com.bytedance.adsdk.sf.gm.sf.ork orkVar) {
        com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pccVar2;
        com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pccVar3;
        this.gm = vyVar;
        this.sf = orkVar.pcc();
        ork.pcc sf = orkVar.sf();
        this.oo = sf;
        this.vj = orkVar.ork();
        this.wh = orkVar.vh();
        com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pcc = orkVar.gm().pcc();
        this.qf = pcc;
        com.bytedance.adsdk.sf.pcc.sf.pcc<PointF, PointF> pcc2 = orkVar.oo().pcc();
        this.kj = pcc2;
        com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pcc3 = orkVar.vj().pcc();
        this.vy = pcc3;
        com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pcc4 = orkVar.qf().pcc();
        this.vh = pcc4;
        com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pcc5 = orkVar.vy().pcc();
        this.hc = pcc5;
        ork.pcc pccVar4 = ork.pcc.STAR;
        if (sf == pccVar4) {
            pccVar2 = orkVar.wh().pcc();
            this.ork = pccVar2;
            pccVar3 = orkVar.kj().pcc();
            this.tmg = pccVar3;
        } else {
            pccVar2 = null;
            this.ork = null;
            this.tmg = null;
            pccVar3 = null;
        }
        pccVar.pcc(pcc);
        pccVar.pcc(pcc2);
        pccVar.pcc(pcc3);
        pccVar.pcc(pcc4);
        pccVar.pcc(pcc5);
        if (sf == pccVar4) {
            pccVar.pcc(pccVar2);
            pccVar.pcc(pccVar3);
        }
        pcc.pcc(this);
        pcc2.pcc(this);
        pcc3.pcc(this);
        pcc4.pcc(this);
        pcc5.pcc(this);
        if (sf == pccVar4) {
            pccVar2.pcc(this);
            pccVar3.pcc(this);
        }
    }

    private void gm() {
        float f;
        float f2;
        int i;
        float cos;
        float sin;
        float f3;
        float f4;
        double d;
        float f5;
        int i2;
        float f6;
        double d2;
        float f7;
        float f8;
        double d3;
        float f9;
        float f10;
        float floatValue = this.qf.qf().floatValue();
        double radians = Math.toRadians((this.vy == null ? 0.0d : r2.qf().floatValue()) - 90.0d);
        double d4 = floatValue;
        float f11 = (float) (6.283185307179586d / d4);
        if (this.wh) {
            f11 *= -1.0f;
        }
        float f12 = f11 / 2.0f;
        float f13 = floatValue - ((int) floatValue);
        int i3 = (f13 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (f13 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1));
        if (i3 != 0) {
            radians += (1.0f - f13) * f12;
        }
        float floatValue2 = this.vh.qf().floatValue();
        float floatValue3 = this.ork.qf().floatValue();
        com.bytedance.adsdk.sf.pcc.sf.pcc<?, Float> pccVar = this.tmg;
        float floatValue4 = pccVar != null ? pccVar.qf().floatValue() / 100.0f : 0.0f;
        com.bytedance.adsdk.sf.pcc.sf.pcc<?, Float> pccVar2 = this.hc;
        float floatValue5 = pccVar2 != null ? pccVar2.qf().floatValue() / 100.0f : 0.0f;
        if (i3 != 0) {
            f5 = me4.b(floatValue2, floatValue3, f13, floatValue3);
            f2 = 0.0f;
            i = i3;
            double d5 = f5;
            f = 2.0f;
            float cos2 = (float) (Math.cos(radians) * d5);
            sin = (float) (Math.sin(radians) * d5);
            this.pcc.moveTo(cos2, sin);
            d = radians + ((f11 * f13) / 2.0f);
            f3 = f13;
            cos = cos2;
            f4 = f12;
        } else {
            f = 2.0f;
            f2 = 0.0f;
            i = i3;
            double d6 = floatValue2;
            cos = (float) (Math.cos(radians) * d6);
            sin = (float) (d6 * Math.sin(radians));
            this.pcc.moveTo(cos, sin);
            f3 = f13;
            f4 = f12;
            d = radians + f4;
            f5 = 0.0f;
        }
        double ceil = Math.ceil(d4) * 2.0d;
        int i4 = 0;
        boolean z = false;
        double d7 = d;
        float f14 = sin;
        float f15 = cos;
        double d8 = d7;
        while (true) {
            double d9 = i4;
            if (d9 >= ceil) {
                PointF qf = this.kj.qf();
                this.pcc.offset(qf.x, qf.y);
                this.pcc.close();
                return;
            }
            float f16 = z ? floatValue2 : floatValue3;
            if (f5 == f2 || d9 != ceil - 2.0d) {
                i2 = i4;
                f6 = f4;
            } else {
                i2 = i4;
                f6 = (f11 * f3) / f;
            }
            if (f5 == f2 || d9 != ceil - 1.0d) {
                d2 = d9;
                f7 = f16;
            } else {
                d2 = d9;
                f7 = f5;
            }
            double d10 = f7;
            float cos3 = (float) (Math.cos(d8) * d10);
            float f17 = f11;
            float sin2 = (float) (Math.sin(d8) * d10);
            if (floatValue4 == f2 && floatValue5 == f2) {
                this.pcc.lineTo(cos3, sin2);
                f10 = cos3;
                f9 = sin2;
                f8 = f4;
                d3 = d8;
            } else {
                f8 = f4;
                d3 = d8;
                double atan2 = (float) (Math.atan2(f14, f15) - 1.5707963267948966d);
                float cos4 = (float) Math.cos(atan2);
                float sin3 = (float) Math.sin(atan2);
                float f18 = f15;
                float f19 = f14;
                f9 = sin2;
                double atan22 = (float) (Math.atan2(sin2, cos3) - 1.5707963267948966d);
                float cos5 = (float) Math.cos(atan22);
                float sin4 = (float) Math.sin(atan22);
                float f20 = z ? floatValue4 : floatValue5;
                float f21 = z ? floatValue5 : floatValue4;
                float f22 = (z ? floatValue3 : floatValue2) * f20 * 0.47829f;
                float f23 = cos4 * f22;
                float f24 = f22 * sin3;
                float f25 = (z ? floatValue2 : floatValue3) * f21 * 0.47829f;
                float f26 = cos5 * f25;
                float f27 = f25 * sin4;
                if (i != 0) {
                    if (i2 == 0) {
                        f23 *= f3;
                        f24 *= f3;
                    } else if (d2 == ceil - 1.0d) {
                        f26 *= f3;
                        f27 *= f3;
                    }
                }
                f10 = cos3;
                this.pcc.cubicTo(f18 - f23, f19 - f24, cos3 + f26, f9 + f27, f10, f9);
            }
            d8 = d3 + f6;
            z = !z;
            i4 = i2 + 1;
            f4 = f8;
            f15 = f10;
            f14 = f9;
            f11 = f17;
        }
    }

    private void sf() {
        this.jr = false;
        this.gm.invalidateSelf();
    }

    private void vj() {
        double d;
        int floor = (int) Math.floor(this.qf.qf().floatValue());
        double radians = Math.toRadians((this.vy == null ? 0.0d : r2.qf().floatValue()) - 90.0d);
        double d2 = floor;
        float floatValue = this.hc.qf().floatValue() / 100.0f;
        float floatValue2 = this.vh.qf().floatValue();
        double d3 = floatValue2;
        float cos = (float) (Math.cos(radians) * d3);
        float sin = (float) (Math.sin(radians) * d3);
        this.pcc.moveTo(cos, sin);
        double d4 = (float) (6.283185307179586d / d2);
        double d5 = radians + d4;
        double ceil = Math.ceil(d2);
        int i = 0;
        while (i < ceil) {
            float cos2 = (float) (Math.cos(d5) * d3);
            int i2 = i;
            double d6 = d5;
            float sin2 = (float) (Math.sin(d5) * d3);
            if (floatValue != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                d = ceil;
                double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                float sin3 = (float) Math.sin(atan2);
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float f = floatValue2 * floatValue * 0.25f;
                this.pcc.cubicTo(cos - (f * cos3), sin - (f * sin3), cos2 + (((float) Math.cos(atan22)) * f), sin2 + (f * ((float) Math.sin(atan22))), cos2, sin2);
                cos = cos2;
                sin = sin2;
            } else {
                sin = sin2;
                d = ceil;
                cos = cos2;
                this.pcc.lineTo(cos, sin);
            }
            d5 = d6 + d4;
            i = i2 + 1;
            ceil = d;
        }
        PointF qf = this.kj.qf();
        this.pcc.offset(qf.x, qf.y);
        this.pcc.close();
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.hc
    public Path oo() {
        boolean z = this.jr;
        Path path = this.pcc;
        if (z) {
            return path;
        }
        path.reset();
        if (this.vj) {
            this.jr = true;
            return this.pcc;
        }
        int i = AnonymousClass1.pcc[this.oo.ordinal()];
        if (i == 1) {
            gm();
        } else if (i == 2) {
            vj();
        }
        this.pcc.close();
        this.gbb.pcc(this.pcc);
        this.jr = true;
        return this.pcc;
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.gm
    public void pcc(List<gm> list, List<gm> list2) {
        for (int i = 0; i < list.size(); i++) {
            gm gmVar = list.get(i);
            if (gmVar instanceof fum) {
                fum fumVar = (fum) gmVar;
                if (fumVar.sf() == gpj.pcc.SIMULTANEOUSLY) {
                    this.gbb.pcc(fumVar);
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
