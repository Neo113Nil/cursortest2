package com.bytedance.adsdk.sf.gm.pcc;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm extends gbb<com.bytedance.adsdk.sf.gm.sf.oo, com.bytedance.adsdk.sf.gm.sf.oo> {
    public gm(List<com.bytedance.adsdk.sf.qf.pcc<com.bytedance.adsdk.sf.gm.sf.oo>> list) {
        super(pcc(list));
    }

    private static com.bytedance.adsdk.sf.qf.pcc<com.bytedance.adsdk.sf.gm.sf.oo> pcc(com.bytedance.adsdk.sf.qf.pcc<com.bytedance.adsdk.sf.gm.sf.oo> pccVar) {
        com.bytedance.adsdk.sf.gm.sf.oo ooVar = pccVar.pcc;
        com.bytedance.adsdk.sf.gm.sf.oo ooVar2 = pccVar.sf;
        if (ooVar == null || ooVar2 == null || ooVar.pcc().length == ooVar2.pcc().length) {
            return pccVar;
        }
        float[] pcc = pcc(ooVar.pcc(), ooVar2.pcc());
        return pccVar.pcc(ooVar.pcc(pcc), ooVar2.pcc(pcc));
    }

    @Override // com.bytedance.adsdk.sf.gm.pcc.gbb, com.bytedance.adsdk.sf.gm.pcc.hc
    public /* bridge */ /* synthetic */ List gm() {
        return super.gm();
    }

    @Override // com.bytedance.adsdk.sf.gm.pcc.gbb, com.bytedance.adsdk.sf.gm.pcc.hc
    public /* bridge */ /* synthetic */ boolean sf() {
        return super.sf();
    }

    @Override // com.bytedance.adsdk.sf.gm.pcc.gbb
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    private static List<com.bytedance.adsdk.sf.qf.pcc<com.bytedance.adsdk.sf.gm.sf.oo>> pcc(List<com.bytedance.adsdk.sf.qf.pcc<com.bytedance.adsdk.sf.gm.sf.oo>> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, pcc(list.get(i)));
        }
        return list;
    }

    public static float[] pcc(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f = Float.NaN;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            float f2 = fArr3[i2];
            if (f2 != f) {
                fArr3[i] = f2;
                i++;
                f = fArr3[i2];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i);
    }

    @Override // com.bytedance.adsdk.sf.gm.pcc.hc
    public com.bytedance.adsdk.sf.pcc.sf.pcc<com.bytedance.adsdk.sf.gm.sf.oo, com.bytedance.adsdk.sf.gm.sf.oo> pcc() {
        return new com.bytedance.adsdk.sf.pcc.sf.vj(this.pcc);
    }
}
