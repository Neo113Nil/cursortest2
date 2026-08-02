package com.bytedance.sdk.openadsdk.of;

import androidx.core.app.NotificationCompat;
import defpackage.ilg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vy {
    public static final vy pcc = new vy(285, NotificationCompat.FLAG_LOCAL_ONLY, 0);
    private final int[] gm;
    private final ork oo;
    private final int[] sf;
    private final int vj;
    private final int wh;

    public vy(int i, int i2, int i3) {
        this.vj = i2;
        this.wh = i3;
        this.sf = new int[i2];
        this.gm = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.sf[i5] = i4;
            i4 *= 2;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.gm[this.sf[i6]] = i6;
        }
        this.oo = new ork(this, new int[]{0});
    }

    public int gm(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.sf;
        int[] iArr2 = this.gm;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.vj - 1)];
    }

    public ork pcc(int i, int i2) {
        if (i < 0) {
            ilg.c();
            return null;
        }
        if (i2 == 0) {
            return this.oo;
        }
        int[] iArr = new int[i + 1];
        iArr[0] = i2;
        return new ork(this, iArr);
    }

    public int sf(int i) {
        if (i != 0) {
            return this.sf[(this.vj - this.gm[i]) - 1];
        }
        throw new ArithmeticException();
    }

    public static int sf(int i, int i2) {
        return i ^ i2;
    }

    public int sf() {
        return this.wh;
    }

    public ork pcc() {
        return this.oo;
    }

    public int pcc(int i) {
        return this.sf[i];
    }
}
