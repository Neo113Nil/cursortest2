package com.bytedance.sdk.openadsdk.of;

import defpackage.a70;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class pcc {
    private static final int[] pcc = new int[0];
    private int gm = 0;
    private int[] sf = pcc;

    private static int[] gm(int i) {
        return new int[(i + 31) / 32];
    }

    private void sf(int i) {
        if (i > this.sf.length * 32) {
            int[] gm = gm((int) Math.ceil(i / 0.75f));
            int[] iArr = this.sf;
            System.arraycopy(iArr, 0, gm, 0, iArr.length);
            this.sf = gm;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof pcc)) {
            return false;
        }
        pcc pccVar = (pcc) obj;
        return this.gm == pccVar.gm && Arrays.equals(this.sf, pccVar.sf);
    }

    public int hashCode() {
        return Arrays.hashCode(this.sf) + (this.gm * 31);
    }

    public void pcc(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            a70.p("Num bits must be between 0 and 32");
            return;
        }
        int i3 = this.gm;
        sf(i3 + i2);
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            if (((1 << i4) & i) != 0) {
                int[] iArr = this.sf;
                int i5 = i3 / 32;
                iArr[i5] = iArr[i5] | (1 << (i3 & 31));
            }
            i3++;
        }
        this.gm = i3;
    }

    public int sf() {
        return (this.gm + 7) / 8;
    }

    public void sf(pcc pccVar) {
        if (this.gm != pccVar.gm) {
            a70.p("Sizes don't match");
            return;
        }
        int i = 0;
        while (true) {
            int[] iArr = this.sf;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = iArr[i] ^ pccVar.sf[i];
            i++;
        }
    }

    public boolean pcc(int i) {
        return (this.sf[i / 32] & (1 << (i & 31))) != 0;
    }

    public void pcc(boolean z) {
        sf(this.gm + 1);
        if (z) {
            int[] iArr = this.sf;
            int i = this.gm;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.gm++;
    }

    public int pcc() {
        return this.gm;
    }

    public void pcc(pcc pccVar) {
        int i = pccVar.gm;
        sf(this.gm + i);
        for (int i2 = 0; i2 < i; i2++) {
            pcc(pccVar.pcc(i2));
        }
    }

    public void pcc(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < 8; i6++) {
                if (pcc(i)) {
                    i5 |= 1 << (7 - i6);
                }
                i++;
            }
            bArr[i2 + i4] = (byte) i5;
        }
    }
}
