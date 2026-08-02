package com.bytedance.adsdk.sf.gm.sf;

import defpackage.a70;
import defpackage.fc6;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo {
    private final float[] pcc;
    private final int[] sf;

    public oo(float[] fArr, int[] iArr) {
        this.pcc = fArr;
        this.sf = iArr;
    }

    public int gm() {
        return this.sf.length;
    }

    public void pcc(oo ooVar, oo ooVar2, float f) {
        if (ooVar.sf.length != ooVar2.sf.length) {
            StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
            sb.append(ooVar.sf.length);
            sb.append(" vs ");
            a70.p(fc6.h(ooVar2.sf.length, ")", sb));
            return;
        }
        for (int i = 0; i < ooVar.sf.length; i++) {
            this.pcc[i] = com.bytedance.adsdk.sf.wh.vj.pcc(ooVar.pcc[i], ooVar2.pcc[i], f);
            this.sf[i] = com.bytedance.adsdk.sf.wh.sf.pcc(f, ooVar.sf[i], ooVar2.sf[i]);
        }
    }

    public int[] sf() {
        return this.sf;
    }

    public float[] pcc() {
        return this.pcc;
    }

    public oo pcc(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            iArr[i] = pcc(fArr[i]);
        }
        return new oo(fArr, iArr);
    }

    private int pcc(float f) {
        int binarySearch = Arrays.binarySearch(this.pcc, f);
        if (binarySearch >= 0) {
            return this.sf[binarySearch];
        }
        int i = -(binarySearch + 1);
        int[] iArr = this.sf;
        if (i == 0) {
            return iArr[0];
        }
        if (i == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.pcc;
        int i2 = i - 1;
        float f2 = fArr[i2];
        return com.bytedance.adsdk.sf.wh.sf.pcc((f - f2) / (fArr[i] - f2), iArr[i2], iArr[i]);
    }
}
