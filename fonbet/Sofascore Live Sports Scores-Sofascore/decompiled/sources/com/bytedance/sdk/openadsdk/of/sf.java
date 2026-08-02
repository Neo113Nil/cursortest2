package com.bytedance.sdk.openadsdk.of;

import defpackage.a70;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class sf {
    private int gm;
    private int[] oo;
    private int pcc;
    private int sf;

    public sf(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            a70.p("Both dimensions must be greater than 0");
            throw null;
        }
        this.pcc = i;
        this.sf = i2;
        int i3 = (i + 31) / 32;
        this.gm = i3;
        this.oo = new int[i3 * i2];
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof sf)) {
            return false;
        }
        sf sfVar = (sf) obj;
        return this.pcc == sfVar.pcc && this.sf == sfVar.sf && this.gm == sfVar.gm && Arrays.equals(this.oo, sfVar.oo);
    }

    public int hashCode() {
        int i = this.pcc;
        return Arrays.hashCode(this.oo) + (((((((i * 31) + i) * 31) + this.sf) * 31) + this.gm) * 31);
    }

    public void pcc(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            a70.p("Left and top must be nonnegative");
            return;
        }
        if (i4 <= 0 || i3 <= 0) {
            a70.p("Height and width must be at least 1");
            return;
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.sf || i5 > this.pcc) {
            a70.p("The region must fit inside the matrix");
            return;
        }
        while (i2 < i6) {
            int i7 = this.gm * i2;
            for (int i8 = i; i8 < i5; i8++) {
                int[] iArr = this.oo;
                int i9 = (i8 / 32) + i7;
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    public boolean pcc(int i, int i2) {
        return ((this.oo[(i / 32) + (i2 * this.gm)] >>> (i & 31)) & 1) != 0;
    }
}
