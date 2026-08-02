package com.bytedance.sdk.openadsdk.of;

import defpackage.a70;
import defpackage.ilg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class ork {
    private final vy pcc;
    private final int[] sf;

    public ork(vy vyVar, int[] iArr) {
        if (iArr.length == 0) {
            ilg.c();
            throw null;
        }
        this.pcc = vyVar;
        int length = iArr.length;
        int i = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.sf = iArr;
            return;
        }
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.sf = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i];
        this.sf = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
    }

    public ork[] gm(ork orkVar) {
        if (!this.pcc.equals(orkVar.pcc)) {
            a70.p("GenericGFPolys do not have same GenericGF field");
            return null;
        }
        if (orkVar.gm()) {
            a70.p("Divide by 0");
            return null;
        }
        ork pcc = this.pcc.pcc();
        int sf = this.pcc.sf(orkVar.pcc(orkVar.sf()));
        ork orkVar2 = this;
        while (orkVar2.sf() >= orkVar.sf() && !orkVar2.gm()) {
            int sf2 = orkVar2.sf() - orkVar.sf();
            int gm = this.pcc.gm(orkVar2.pcc(orkVar2.sf()), sf);
            ork pcc2 = orkVar.pcc(sf2, gm);
            pcc = pcc.pcc(this.pcc.pcc(sf2, gm));
            orkVar2 = orkVar2.pcc(pcc2);
        }
        return new ork[]{pcc, orkVar2};
    }

    public ork pcc(ork orkVar) {
        if (!this.pcc.equals(orkVar.pcc)) {
            a70.p("GenericGFPolys do not have same GenericGF field");
            return null;
        }
        if (gm()) {
            return orkVar;
        }
        if (orkVar.gm()) {
            return this;
        }
        int[] iArr = this.sf;
        int[] iArr2 = orkVar.sf;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = vy.sf(iArr2[i - length], iArr[i]);
        }
        return new ork(this.pcc, iArr3);
    }

    public ork sf(ork orkVar) {
        if (!this.pcc.equals(orkVar.pcc)) {
            a70.p("GenericGFPolys do not have same GenericGF field");
            return null;
        }
        if (gm() || orkVar.gm()) {
            return this.pcc.pcc();
        }
        int[] iArr = this.sf;
        int length = iArr.length;
        int[] iArr2 = orkVar.sf;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                iArr3[i4] = vy.sf(iArr3[i4], this.pcc.gm(i2, iArr2[i3]));
            }
        }
        return new ork(this.pcc, iArr3);
    }

    public int pcc(int i) {
        return this.sf[(r1.length - 1) - i];
    }

    public int[] pcc() {
        return this.sf;
    }

    public ork pcc(int i, int i2) {
        if (i < 0) {
            ilg.c();
            return null;
        }
        if (i2 == 0) {
            return this.pcc.pcc();
        }
        int length = this.sf.length;
        int[] iArr = new int[i + length];
        int i3 = 0;
        while (true) {
            vy vyVar = this.pcc;
            if (i3 < length) {
                iArr[i3] = vyVar.gm(this.sf[i3], i2);
                i3++;
            } else {
                return new ork(vyVar, iArr);
            }
        }
    }

    public int sf() {
        return this.sf.length - 1;
    }

    public boolean gm() {
        return this.sf[0] == 0;
    }
}
