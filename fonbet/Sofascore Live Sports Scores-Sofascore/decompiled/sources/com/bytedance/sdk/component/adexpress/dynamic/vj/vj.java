package com.bytedance.sdk.component.adexpress.dynamic.vj;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.vj.sf;
import com.bytedance.sdk.component.adexpress.sf.hc;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import defpackage.wt3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj {
    private com.bytedance.sdk.component.adexpress.dynamic.oo.kj gm;
    private pcc oo;
    public com.bytedance.sdk.component.adexpress.dynamic.oo.sf pcc;
    protected sf sf;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        float gm;
        float pcc;
        float sf;
    }

    public vj(double d, int i, double d2, String str, hc hcVar) {
        this.sf = new sf(d, i, d2, str, hcVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x027d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.bytedance.sdk.component.adexpress.dynamic.oo.sf pcc(com.bytedance.sdk.component.adexpress.dynamic.oo.sf sfVar, float f) {
        float f2;
        float f3;
        int i;
        List<List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj>> list;
        float f4;
        float f5;
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> it;
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> it2;
        float f6;
        String str;
        com.bytedance.sdk.component.adexpress.dynamic.oo.vy vyVar;
        float f7;
        com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar = sfVar.wh;
        if (kjVar != null) {
            kjVar.fum();
            List<List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj>> nac = kjVar.nac();
            if (nac != null && nac.size() > 0) {
                com.bytedance.sdk.component.adexpress.dynamic.oo.wh vj = kjVar.ork().vj();
                float nac2 = vj.nac();
                float dax = vj.dax();
                float gbb = vj.gbb();
                float jr = vj.jr();
                float tmg = vj.tmg();
                String rj = vj.rj();
                String lrr = vj.lrr();
                float f8 = sfVar.pcc + jr;
                float f9 = sfVar.sf + nac2;
                float f10 = (sfVar.gm - jr) - dax;
                float f11 = 2.0f;
                float f12 = tmg * 2.0f;
                float f13 = f10 - f12;
                float f14 = ((sfVar.oo - nac2) - gbb) - f12;
                com.bytedance.sdk.component.adexpress.dynamic.oo.vy vyVar2 = new com.bytedance.sdk.component.adexpress.dynamic.oo.vy(f8, f9);
                if (sfVar.qf == null) {
                    sfVar.qf = new ArrayList();
                }
                Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj>> it3 = nac.iterator();
                float f15 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                while (it3.hasNext()) {
                    float f16 = f11;
                    sf.gm pcc2 = this.sf.pcc(it3.next());
                    if (pcc2 != null) {
                        f15 += pcc2.sf;
                    }
                    f11 = f16;
                }
                float f17 = f11;
                String str2 = "space-between";
                String str3 = "space-around";
                int i2 = 1;
                if (f15 < f14) {
                    if (TextUtils.equals(lrr, TtmlNode.CENTER)) {
                        f3 = (f14 - f15) / f17;
                    } else if (TextUtils.equals(lrr, "flex-end")) {
                        f3 = f14 - f15;
                    } else if (TextUtils.equals(lrr, "space-around")) {
                        f3 = ork.pcc((f14 - f15) / (nac.size() + 1));
                        f2 = f3;
                        vyVar2.sf += f3;
                        float f18 = f;
                        i = 0;
                        while (i < nac.size()) {
                            List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> list2 = nac.get(i);
                            i++;
                            int i3 = i2;
                            if (i >= sfVar.qf.size()) {
                                list = nac;
                                int i4 = 0;
                                for (int size = (i - sfVar.qf.size()) + 1; i4 < size; size = size) {
                                    sfVar.qf.add(new ArrayList());
                                    i4++;
                                }
                            } else {
                                list = nac;
                            }
                            Iterator<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> it4 = list2.iterator();
                            float f19 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            while (true) {
                                Iterator<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> it5 = it4;
                                if (!it4.hasNext()) {
                                    break;
                                }
                                com.bytedance.sdk.component.adexpress.dynamic.oo.kj next = it5.next();
                                com.bytedance.sdk.component.adexpress.dynamic.oo.wh vj2 = next.ork().vj();
                                float f20 = f19;
                                String mk = vj2.mk();
                                float f21 = f2;
                                int qcw = vj2.qcw();
                                float f22 = f18;
                                if (TextUtils.equals(mk, "flex") || qcw == i3 || qcw == 2) {
                                    it4 = it5;
                                    f18 = f22;
                                    f19 = f20;
                                } else {
                                    sf.gm pcc3 = this.sf.pcc(next);
                                    f19 = pcc3 != null ? f20 + pcc3.pcc : f20;
                                    it4 = it5;
                                    f18 = f22;
                                }
                                f2 = f21;
                                i3 = 1;
                            }
                            float f23 = f2;
                            float f24 = f18;
                            float max = Math.max(f13 - f19, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            Iterator<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> it6 = list2.iterator();
                            float f25 = 0.0f;
                            while (it6.hasNext()) {
                                com.bytedance.sdk.component.adexpress.dynamic.oo.kj next2 = it6.next();
                                com.bytedance.sdk.component.adexpress.dynamic.oo.wh vj3 = next2.ork().vj();
                                Iterator<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> it7 = it6;
                                float f26 = f25;
                                if (vj3.qcw() == 1 || vj3.qcw() == 2) {
                                    it6 = it7;
                                    f25 = f26;
                                } else {
                                    sf.gm pcc4 = this.sf.pcc(next2);
                                    f25 = pcc4 != null ? f26 + pcc4.pcc : f26;
                                    it6 = it7;
                                }
                            }
                            float f27 = f25;
                            if (f27 < f13) {
                                if (TextUtils.equals(rj, TtmlNode.CENTER)) {
                                    f4 = (f13 - f27) / f17;
                                } else if (TextUtils.equals(rj, "flex-end")) {
                                    f4 = f13 - f27;
                                } else {
                                    if (TextUtils.equals(rj, str3)) {
                                        f4 = ork.pcc((f13 - f27) / (list2.size() + 1));
                                        f5 = f4;
                                    } else if (TextUtils.equals(rj, str2) && list2.size() > 1) {
                                        f5 = ork.pcc((f13 - f27) / (list2.size() - 1.0f));
                                        f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                    }
                                    vyVar2.pcc += f4;
                                    it = list2.iterator();
                                    float f28 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                    while (it.hasNext()) {
                                        Iterator<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> it8 = it;
                                        com.bytedance.sdk.component.adexpress.dynamic.oo.kj next3 = it.next();
                                        float f29 = f5;
                                        float f30 = this.sf.pcc(next3) != null ? this.sf.pcc(next3).sf : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                        com.bytedance.sdk.component.adexpress.dynamic.oo.wh vj4 = next3.ork().vj();
                                        f28 = Math.max(f28, (vj4.qcw() == 1 || vj4.qcw() == 2) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f30);
                                        it = it8;
                                        f5 = f29;
                                    }
                                    float f31 = f5;
                                    it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        com.bytedance.sdk.component.adexpress.dynamic.oo.kj next4 = it2.next();
                                        Iterator<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> it9 = it2;
                                        sf.gm pcc5 = this.sf.pcc(next4);
                                        String str4 = str2;
                                        com.bytedance.sdk.component.adexpress.dynamic.oo.wh vj5 = next4.ork().vj();
                                        String str5 = rj;
                                        float ri = vj5.ri();
                                        float zsj = vj5.zsj();
                                        float hpk = vj5.hpk();
                                        float fmh = vj5.fmh();
                                        float f32 = pcc5 == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : pcc5.pcc;
                                        float f33 = pcc5 == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : pcc5.sf;
                                        float f34 = f32;
                                        float f35 = TextUtils.equals(kjVar.gm(), "root") ? i : f24;
                                        float f36 = f28;
                                        com.bytedance.sdk.component.adexpress.dynamic.oo.vy pcc6 = vj5.qcw() == 1 ? pcc(sfVar, vj5, (f34 - zsj) - fmh, (f33 - ri) - hpk) : vyVar2;
                                        if (vj5.qcw() == 2) {
                                            f6 = f13;
                                            str = str3;
                                            vyVar = pcc(vj5, this.sf.pcc(this.gm), new sf.gm((f34 - zsj) - fmh, (f33 - ri) - hpk));
                                        } else {
                                            f6 = f13;
                                            str = str3;
                                            vyVar = pcc6;
                                        }
                                        String bbd = vj.bbd();
                                        if (f36 > f33 && !TextUtils.equals(bbd, "flex-start")) {
                                            bbd.getClass();
                                            if (bbd.equals(TtmlNode.CENTER)) {
                                                f7 = (f36 - f33) / f17;
                                            } else if (bbd.equals("flex-end")) {
                                                f7 = f36 - f33;
                                            }
                                            com.bytedance.sdk.component.adexpress.dynamic.oo.sf sfVar2 = new com.bytedance.sdk.component.adexpress.dynamic.oo.sf();
                                            sfVar2.pcc = vyVar.pcc + fmh;
                                            sfVar2.sf = vyVar.sf + ri + f7;
                                            sfVar2.gm = (f34 - zsj) - fmh;
                                            sfVar2.oo = (f33 - ri) - hpk;
                                            sfVar2.vj = sfVar.vj + "." + next4.gm();
                                            sfVar2.kj = sfVar;
                                            sfVar2.wh = next4;
                                            sfVar2.vy = max;
                                            sfVar2.ork = list2;
                                            next4.gm(sfVar2.pcc);
                                            sfVar2.wh.oo(sfVar2.sf);
                                            sfVar2.wh.vj(sfVar2.gm);
                                            sfVar2.wh.wh(sfVar2.oo);
                                            sfVar.qf.get(i).add(pcc(sfVar2, f35));
                                            if (vj5.qcw() != 1 && vj5.qcw() != 2) {
                                                vyVar2.pcc = f34 + f31 + vyVar2.pcc;
                                            }
                                            f24 = f35;
                                            rj = str5;
                                            str2 = str4;
                                            f28 = f36;
                                            f13 = f6;
                                            str3 = str;
                                            it2 = it9;
                                        }
                                        f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                        com.bytedance.sdk.component.adexpress.dynamic.oo.sf sfVar22 = new com.bytedance.sdk.component.adexpress.dynamic.oo.sf();
                                        sfVar22.pcc = vyVar.pcc + fmh;
                                        sfVar22.sf = vyVar.sf + ri + f7;
                                        sfVar22.gm = (f34 - zsj) - fmh;
                                        sfVar22.oo = (f33 - ri) - hpk;
                                        sfVar22.vj = sfVar.vj + "." + next4.gm();
                                        sfVar22.kj = sfVar;
                                        sfVar22.wh = next4;
                                        sfVar22.vy = max;
                                        sfVar22.ork = list2;
                                        next4.gm(sfVar22.pcc);
                                        sfVar22.wh.oo(sfVar22.sf);
                                        sfVar22.wh.vj(sfVar22.gm);
                                        sfVar22.wh.wh(sfVar22.oo);
                                        sfVar.qf.get(i).add(pcc(sfVar22, f35));
                                        if (vj5.qcw() != 1) {
                                            vyVar2.pcc = f34 + f31 + vyVar2.pcc;
                                        }
                                        f24 = f35;
                                        rj = str5;
                                        str2 = str4;
                                        f28 = f36;
                                        f13 = f6;
                                        str3 = str;
                                        it2 = it9;
                                    }
                                    vyVar2.pcc = f8;
                                    vyVar2.sf = f28 + f23 + vyVar2.sf;
                                    i2 = 1;
                                    nac = list;
                                    f18 = f24;
                                    f2 = f23;
                                }
                                f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                vyVar2.pcc += f4;
                                it = list2.iterator();
                                float f282 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                while (it.hasNext()) {
                                }
                                float f312 = f5;
                                it2 = list2.iterator();
                                while (it2.hasNext()) {
                                }
                                vyVar2.pcc = f8;
                                vyVar2.sf = f282 + f23 + vyVar2.sf;
                                i2 = 1;
                                nac = list;
                                f18 = f24;
                                f2 = f23;
                            }
                            f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            vyVar2.pcc += f4;
                            it = list2.iterator();
                            float f2822 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            while (it.hasNext()) {
                            }
                            float f3122 = f5;
                            it2 = list2.iterator();
                            while (it2.hasNext()) {
                            }
                            vyVar2.pcc = f8;
                            vyVar2.sf = f2822 + f23 + vyVar2.sf;
                            i2 = 1;
                            nac = list;
                            f18 = f24;
                            f2 = f23;
                        }
                    } else if (TextUtils.equals(lrr, "space-between") && nac.size() > 1) {
                        f2 = ork.pcc((f14 - f15) / (nac.size() - 1));
                        f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        vyVar2.sf += f3;
                        float f182 = f;
                        i = 0;
                        while (i < nac.size()) {
                        }
                    }
                    f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    vyVar2.sf += f3;
                    float f1822 = f;
                    i = 0;
                    while (i < nac.size()) {
                    }
                }
                f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                vyVar2.sf += f3;
                float f18222 = f;
                i = 0;
                while (i < nac.size()) {
                }
            }
        }
        return sfVar;
    }

    public void pcc() {
        this.sf.pcc();
    }

    public void pcc(com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar, float f, float f2) {
        if (kjVar != null) {
            this.gm = kjVar;
        }
        com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar2 = this.gm;
        float kj = kjVar2.kj();
        float vy = kjVar2.vy();
        float f3 = TextUtils.equals(kjVar2.ork().vj().tsz(), "fixed") ? vy : 65536.0f;
        this.sf.pcc();
        this.sf.gm(kjVar2, kj, f3);
        sf.gm pcc2 = this.sf.pcc(kjVar2);
        com.bytedance.sdk.component.adexpress.dynamic.oo.sf sfVar = new com.bytedance.sdk.component.adexpress.dynamic.oo.sf();
        sfVar.pcc = f;
        sfVar.sf = f2;
        if (pcc2 != null) {
            kj = pcc2.pcc;
        }
        sfVar.gm = kj;
        if (pcc2 != null) {
            vy = pcc2.sf;
        }
        sfVar.oo = vy;
        sfVar.vj = "root";
        sfVar.vy = 1280.0f;
        sfVar.wh = kjVar2;
        kjVar2.gm(f);
        sfVar.wh.oo(sfVar.sf);
        sfVar.wh.vj(sfVar.gm);
        sfVar.wh.wh(sfVar.oo);
        com.bytedance.sdk.component.adexpress.dynamic.oo.sf pcc3 = pcc(sfVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.pcc = pcc3;
        pcc(pcc3);
    }

    public void pcc(com.bytedance.sdk.component.adexpress.dynamic.oo.sf sfVar) {
        if (sfVar == null) {
            return;
        }
        sfVar.wh.ork().sf();
        List<List<com.bytedance.sdk.component.adexpress.dynamic.oo.sf>> list = sfVar.qf;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (List<com.bytedance.sdk.component.adexpress.dynamic.oo.sf> list2 : list) {
            if (list2 != null && list2.size() > 0) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.oo.sf> it = list2.iterator();
                while (it.hasNext()) {
                    pcc(it.next());
                }
            }
        }
    }

    public void pcc(pcc pccVar) {
        this.oo = pccVar;
    }

    private com.bytedance.sdk.component.adexpress.dynamic.oo.vy pcc(com.bytedance.sdk.component.adexpress.dynamic.oo.wh whVar, sf.gm gmVar, sf.gm gmVar2) {
        float ra = whVar.ra();
        float qc = whVar.qc();
        float rt = whVar.rt();
        float wax = whVar.wax();
        boolean bg = whVar.bg();
        boolean kz = whVar.kz();
        boolean ew = whVar.ew();
        boolean tmh = whVar.tmh();
        if (!bg) {
            if (kz) {
                float f = this.oo.pcc;
                ra = ((f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Math.min(f, gmVar.pcc) : gmVar.pcc) - rt) - gmVar2.pcc;
            } else {
                ra = 0.0f;
            }
        }
        if (!ew) {
            if (tmh) {
                float f2 = this.oo.sf;
                if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f2 = gmVar.sf;
                }
                qc = (f2 - wax) - gmVar2.sf;
            } else {
                qc = 0.0f;
            }
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.oo.vy(ra, qc);
    }

    private com.bytedance.sdk.component.adexpress.dynamic.oo.vy pcc(com.bytedance.sdk.component.adexpress.dynamic.oo.sf sfVar, com.bytedance.sdk.component.adexpress.dynamic.oo.wh whVar, float f, float f2) {
        float f3;
        float f4;
        float f5;
        float f6 = sfVar.pcc;
        float f7 = sfVar.sf;
        float ra = whVar.ra();
        float qc = whVar.qc();
        float rt = whVar.rt();
        float wax = whVar.wax();
        boolean bg = whVar.bg();
        boolean kz = whVar.kz();
        boolean ew = whVar.ew();
        boolean tmh = whVar.tmh();
        String vr = whVar.vr();
        float f8 = sfVar.gm;
        float f9 = sfVar.oo;
        if (TextUtils.equals(vr, "0")) {
            if (bg) {
                f3 = sfVar.pcc + ra;
            } else {
                f3 = kz ? ((sfVar.pcc + f8) - rt) - f : f6;
            }
            if (ew) {
                f5 = sfVar.sf;
                f7 = f5 + qc;
            } else if (tmh) {
                f4 = sfVar.sf;
                f7 = ((f4 + f9) - wax) - f2;
            }
        } else if (TextUtils.equals(vr, "1")) {
            f3 = wt3.e(f8, f, 2.0f, sfVar.pcc);
            if (ew) {
                f5 = sfVar.sf;
                f7 = f5 + qc;
            } else if (tmh) {
                f4 = sfVar.sf;
                f7 = ((f4 + f9) - wax) - f2;
            }
        } else if (TextUtils.equals(vr, "2")) {
            f7 = wt3.e(f9, f2, 2.0f, sfVar.sf);
            if (bg) {
                f3 = sfVar.pcc + ra;
            } else {
                if (kz) {
                    f3 = ((sfVar.pcc + f8) - rt) - f;
                }
                f3 = f6;
            }
        } else {
            if (TextUtils.equals(vr, "3")) {
                float e = wt3.e(f8, f, 2.0f, sfVar.pcc);
                f7 = wt3.e(f9, f2, 2.0f, sfVar.sf);
                f3 = e;
            }
            f3 = f6;
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.oo.vy(f3, f7);
    }
}
