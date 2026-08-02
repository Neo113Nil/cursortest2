package com.bytedance.adsdk.sf.gm.gm;

import com.bytedance.adsdk.sf.gm.pcc.tmg;
import com.bytedance.adsdk.sf.gm.pcc.vh;
import defpackage.fc6;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj {
    private final float dax;
    private final sf fum;
    private final float gbb;
    private final String gm;
    private final com.bytedance.adsdk.sf.gm.pcc.sf gpj;
    private final float hc;
    private final float jr;
    private final List<com.bytedance.adsdk.sf.gm.sf.kj> kj;
    private final List<com.bytedance.adsdk.sf.qf.pcc<Float>> lo;
    private final vh lu;
    private final com.bytedance.adsdk.sf.gm.pcc.ork nac;
    private final com.bytedance.adsdk.sf.gm.sf.pcc of;
    private final long oo;
    private final int ork;
    private final List<com.bytedance.adsdk.sf.gm.sf.gm> pcc;
    private final String qf;
    private final com.bytedance.adsdk.sf.qf sf;
    private final int tmg;
    private final boolean tz;
    private final int vh;
    private final pcc vj;
    private final tmg vy;
    private final long wh;
    private final com.bytedance.adsdk.sf.vj.ork yt;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum pcc {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum sf {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public vj(List<com.bytedance.adsdk.sf.gm.sf.gm> list, com.bytedance.adsdk.sf.qf qfVar, String str, long j, pcc pccVar, long j2, String str2, List<com.bytedance.adsdk.sf.gm.sf.kj> list2, tmg tmgVar, int i, int i2, int i3, float f, float f2, float f3, float f4, com.bytedance.adsdk.sf.gm.pcc.ork orkVar, vh vhVar, List<com.bytedance.adsdk.sf.qf.pcc<Float>> list3, sf sfVar, com.bytedance.adsdk.sf.gm.pcc.sf sfVar2, boolean z, com.bytedance.adsdk.sf.gm.sf.pcc pccVar2, com.bytedance.adsdk.sf.vj.ork orkVar2) {
        this.pcc = list;
        this.sf = qfVar;
        this.gm = str;
        this.oo = j;
        this.vj = pccVar;
        this.wh = j2;
        this.qf = str2;
        this.kj = list2;
        this.vy = tmgVar;
        this.ork = i;
        this.vh = i2;
        this.tmg = i3;
        this.hc = f;
        this.gbb = f2;
        this.jr = f3;
        this.dax = f4;
        this.nac = orkVar;
        this.lu = vhVar;
        this.lo = list3;
        this.fum = sfVar;
        this.gpj = sfVar2;
        this.tz = z;
        this.of = pccVar2;
        this.yt = orkVar2;
    }

    public int dax() {
        return this.tmg;
    }

    public com.bytedance.adsdk.sf.gm.pcc.sf fum() {
        return this.gpj;
    }

    public List<com.bytedance.adsdk.sf.gm.sf.gm> gbb() {
        return this.pcc;
    }

    public float gm() {
        return this.gbb / this.sf.nac();
    }

    public com.bytedance.adsdk.sf.gm.pcc.ork gpj() {
        return this.nac;
    }

    public long hc() {
        return this.wh;
    }

    public tmg jr() {
        return this.vy;
    }

    public float kj() {
        return this.jr;
    }

    public vh lo() {
        return this.lu;
    }

    public int lu() {
        return this.ork;
    }

    public int nac() {
        return this.vh;
    }

    public com.bytedance.adsdk.sf.gm.sf.pcc of() {
        return this.of;
    }

    public List<com.bytedance.adsdk.sf.qf.pcc<Float>> oo() {
        return this.lo;
    }

    public List<com.bytedance.adsdk.sf.gm.sf.kj> ork() {
        return this.kj;
    }

    public String pcc(String str) {
        StringBuilder q = fc6.q(str);
        q.append(wh());
        q.append("\n");
        vj pcc2 = this.sf.pcc(hc());
        if (pcc2 != null) {
            q.append("\t\tParents: ");
            q.append(pcc2.wh());
            vj pcc3 = this.sf.pcc(pcc2.hc());
            while (pcc3 != null) {
                q.append("->");
                q.append(pcc3.wh());
                pcc3 = this.sf.pcc(pcc3.hc());
            }
            q.append(str);
            q.append("\n");
        }
        if (!ork().isEmpty()) {
            q.append(str);
            q.append("\tMasks: ");
            q.append(ork().size());
            q.append("\n");
        }
        if (lu() != 0 && nac() != 0) {
            q.append(str);
            q.append("\tBackground: ");
            q.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(lu()), Integer.valueOf(nac()), Integer.valueOf(dax())));
        }
        if (!this.pcc.isEmpty()) {
            q.append(str);
            q.append("\tShapes:\n");
            for (com.bytedance.adsdk.sf.gm.sf.gm gmVar : this.pcc) {
                q.append(str);
                q.append("\t\t");
                q.append(gmVar);
                q.append("\n");
            }
        }
        return q.toString();
    }

    public String qf() {
        return this.qf;
    }

    public float sf() {
        return this.hc;
    }

    public sf tmg() {
        return this.fum;
    }

    public String toString() {
        return pcc("");
    }

    public boolean tz() {
        return this.tz;
    }

    public pcc vh() {
        return this.vj;
    }

    public long vj() {
        return this.oo;
    }

    public float vy() {
        return this.dax;
    }

    public String wh() {
        return this.gm;
    }

    public com.bytedance.adsdk.sf.vj.ork yt() {
        return this.yt;
    }

    public com.bytedance.adsdk.sf.qf pcc() {
        return this.sf;
    }
}
