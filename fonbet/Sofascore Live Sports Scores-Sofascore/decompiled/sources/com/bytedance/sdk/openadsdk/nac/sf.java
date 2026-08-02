package com.bytedance.sdk.openadsdk.nac;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf {
    public static int gm = 1;
    public static int oo = 2;
    public static int pcc = -1;
    public static int sf = 0;
    public static int vj = 3;
    private int wh = pcc;
    private long qf = 0;
    private long kj = 0;
    private final List<gm> vy = new ArrayList();
    private long ork = 0;

    public void gm(long j) {
        int i;
        int i2 = this.wh;
        if (i2 == pcc || i2 == (i = oo) || i2 == vj) {
            return;
        }
        this.wh = i;
        this.ork = j;
    }

    public void oo(long j) {
        int i = this.wh;
        if (i == pcc || i != oo) {
            return;
        }
        this.wh = gm;
        this.vy.add(new gm(this.ork, j));
        this.ork = 0L;
    }

    public long pcc(long j, long j2) {
        long j3;
        long j4;
        long j5;
        long sf2;
        long j6 = this.kj;
        if (j6 != 0 && j > j6) {
            return 0L;
        }
        int i = 0;
        for (gm gmVar : this.vy) {
            if (gmVar.sf() > j) {
                if (j < gmVar.pcc()) {
                    j5 = i;
                    sf2 = gmVar.sf() - gmVar.pcc();
                } else {
                    j5 = i;
                    sf2 = gmVar.sf() - j;
                }
                i = (int) (sf2 + j5);
            }
        }
        long j7 = this.qf;
        long j8 = this.ork;
        if (j7 < j) {
            if (j8 != 0) {
                if (j8 <= j) {
                    return 0L;
                }
                j4 = j8 - j;
                return j4 - i;
            }
            long j9 = this.kj;
            if (j9 != 0) {
                return (j9 - j) - i;
            }
            j3 = j2 - j;
            return j3 - i;
        }
        if (j8 != 0) {
            if (j8 <= j7) {
                return 0L;
            }
            j4 = j8 - j7;
            return j4 - i;
        }
        long j10 = this.kj;
        if (j10 != 0) {
            return (j10 - j7) - i;
        }
        j3 = j2 - j7;
        return j3 - i;
    }

    public void sf(long j) {
        int i;
        int i2 = this.wh;
        if (i2 == pcc || i2 == (i = vj)) {
            return;
        }
        this.wh = i;
        this.kj = j;
    }

    public void pcc(long j) {
        this.wh = sf;
        this.qf = j;
    }

    public int pcc() {
        return this.wh;
    }
}
