package com.bytedance.adsdk.sf.pcc.pcc;

import android.graphics.PointF;
import com.bytedance.adsdk.sf.pcc.sf.pcc;
import com.unity3d.services.UnityAdsConstants;
import defpackage.me4;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class nac implements gpj, pcc.InterfaceC0027pcc {
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> gm;
    private com.bytedance.adsdk.sf.gm.sf.gbb oo;
    private final com.bytedance.adsdk.sf.vy pcc;
    private final String sf;

    public nac(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar, com.bytedance.adsdk.sf.gm.sf.hc hcVar) {
        this.pcc = vyVar;
        this.sf = hcVar.pcc();
        com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pcc = hcVar.sf().pcc();
        this.gm = pcc;
        pccVar.pcc(pcc);
        pcc.pcc(this);
    }

    private com.bytedance.adsdk.sf.gm.sf.gbb sf(com.bytedance.adsdk.sf.gm.sf.gbb gbbVar) {
        List<com.bytedance.adsdk.sf.gm.pcc> gm = gbbVar.gm();
        boolean sf = gbbVar.sf();
        int size = gm.size() - 1;
        int i = 0;
        while (size >= 0) {
            com.bytedance.adsdk.sf.gm.pcc pccVar = gm.get(size);
            com.bytedance.adsdk.sf.gm.pcc pccVar2 = gm.get(pcc(size - 1, gm.size()));
            PointF gm2 = (size != 0 || sf) ? pccVar2.gm() : gbbVar.pcc();
            i = (((size != 0 || sf) ? pccVar2.sf() : gm2).equals(gm2) && pccVar.pcc().equals(gm2) && !(!gbbVar.sf() && size == 0 && size == gm.size() - 1)) ? i + 2 : i + 1;
            size--;
        }
        com.bytedance.adsdk.sf.gm.sf.gbb gbbVar2 = this.oo;
        if (gbbVar2 == null || gbbVar2.gm().size() != i) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new com.bytedance.adsdk.sf.gm.pcc());
            }
            this.oo = new com.bytedance.adsdk.sf.gm.sf.gbb(new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), false, arrayList);
        }
        this.oo.pcc(sf);
        return this.oo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009c, code lost:
    
        if (r6 == (r0.size() - 1)) goto L27;
     */
    @Override // com.bytedance.adsdk.sf.pcc.pcc.gpj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.bytedance.adsdk.sf.gm.sf.gbb pcc(com.bytedance.adsdk.sf.gm.sf.gbb gbbVar) {
        int i;
        List<com.bytedance.adsdk.sf.gm.pcc> gm = gbbVar.gm();
        if (gm.size() > 2) {
            float floatValue = this.gm.qf().floatValue();
            if (floatValue != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                com.bytedance.adsdk.sf.gm.sf.gbb sf = sf(gbbVar);
                sf.pcc(gbbVar.pcc().x, gbbVar.pcc().y);
                List<com.bytedance.adsdk.sf.gm.pcc> gm2 = sf.gm();
                boolean sf2 = gbbVar.sf();
                int i2 = 0;
                int i3 = 0;
                while (i2 < gm.size()) {
                    com.bytedance.adsdk.sf.gm.pcc pccVar = gm.get(i2);
                    com.bytedance.adsdk.sf.gm.pcc pccVar2 = gm.get(pcc(i2 - 1, gm.size()));
                    com.bytedance.adsdk.sf.gm.pcc pccVar3 = gm.get(pcc(i2 - 2, gm.size()));
                    PointF gm3 = (i2 != 0 || sf2) ? pccVar2.gm() : gbbVar.pcc();
                    PointF sf3 = (i2 != 0 || sf2) ? pccVar2.sf() : gm3;
                    PointF pcc = pccVar.pcc();
                    PointF gm4 = pccVar3.gm();
                    PointF gm5 = pccVar.gm();
                    boolean z = !gbbVar.sf() && i2 == 0;
                    if (sf3.equals(gm3) && pcc.equals(gm3) && !z) {
                        float f = gm3.x;
                        float f2 = f - gm4.x;
                        float f3 = gm3.y;
                        float f4 = f3 - gm4.y;
                        float f5 = gm5.x - f;
                        float f6 = gm5.y - f3;
                        i = i2;
                        float hypot = (float) Math.hypot(f2, f4);
                        float hypot2 = (float) Math.hypot(f5, f6);
                        float min = Math.min(floatValue / hypot, 0.5f);
                        float min2 = Math.min(floatValue / hypot2, 0.5f);
                        float f7 = gm3.x;
                        float b = me4.b(gm4.x, f7, min, f7);
                        float f8 = gm3.y;
                        float b2 = me4.b(gm4.y, f8, min, f8);
                        float b3 = me4.b(gm5.x, f7, min2, f7);
                        float b4 = me4.b(gm5.y, f8, min2, f8);
                        float f9 = b - ((b - f7) * 0.5519f);
                        float f10 = b2 - ((b2 - f8) * 0.5519f);
                        float f11 = b3 - ((b3 - f7) * 0.5519f);
                        float f12 = b4 - ((b4 - f8) * 0.5519f);
                        com.bytedance.adsdk.sf.gm.pcc pccVar4 = gm2.get(pcc(i3 - 1, gm2.size()));
                        com.bytedance.adsdk.sf.gm.pcc pccVar5 = gm2.get(i3);
                        pccVar4.sf(b, b2);
                        pccVar4.gm(b, b2);
                        if (i == 0) {
                            sf.pcc(b, b2);
                        }
                        pccVar5.pcc(f9, f10);
                        com.bytedance.adsdk.sf.gm.pcc pccVar6 = gm2.get(i3 + 1);
                        pccVar5.sf(f11, f12);
                        pccVar5.gm(b3, b4);
                        pccVar6.pcc(b3, b4);
                        i3 += 2;
                    } else {
                        i = i2;
                        com.bytedance.adsdk.sf.gm.pcc pccVar7 = gm2.get(pcc(i3 - 1, gm2.size()));
                        com.bytedance.adsdk.sf.gm.pcc pccVar8 = gm2.get(i3);
                        pccVar7.sf(pccVar2.sf().x, pccVar2.sf().y);
                        pccVar7.gm(pccVar2.gm().x, pccVar2.gm().y);
                        pccVar8.pcc(pccVar.pcc().x, pccVar.pcc().y);
                        i3++;
                    }
                    i2 = i + 1;
                }
                return sf;
            }
        }
        return gbbVar;
    }

    public com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> sf() {
        return this.gm;
    }

    private static int sf(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }

    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.InterfaceC0027pcc
    public void pcc() {
        this.pcc.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.gm
    public void pcc(List<gm> list, List<gm> list2) {
    }

    private static int pcc(int i, int i2) {
        return i - (sf(i, i2) * i2);
    }
}
