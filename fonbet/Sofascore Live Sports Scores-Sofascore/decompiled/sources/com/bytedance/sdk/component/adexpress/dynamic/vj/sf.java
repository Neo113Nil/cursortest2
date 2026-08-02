package com.bytedance.sdk.component.adexpress.dynamic.vj;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.sf.hc;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import defpackage.w1l;
import defpackage.wt3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf {
    private String kj;
    private double qf;
    private double vj;
    private hc vy;
    private int wh;
    public Map<String, gm> pcc = new HashMap();
    public Map<String, gm> sf = new HashMap();
    public Map<String, gm> gm = new HashMap();
    private double oo = Math.random();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc implements Cloneable {
        float gm;
        float pcc;
        boolean sf;

        public Object clone() {
            try {
                return (pcc) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.vj.sf$sf, reason: collision with other inner class name */
    public static class C0042sf {
        int gm;
        double oo;
        float pcc;
        int sf;
        float vj;

        public static JSONObject pcc(C0042sf c0042sf) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(TtmlNode.ATTR_TTS_FONT_SIZE, c0042sf.pcc);
                jSONObject.put("letterSpacing", c0042sf.sf);
                jSONObject.put("lineHeight", c0042sf.oo);
                jSONObject.put("maxWidth", c0042sf.vj);
                jSONObject.put(TtmlNode.ATTR_TTS_FONT_WEIGHT, c0042sf.gm);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    public sf(double d, int i, double d2, String str, hc hcVar) {
        this.vj = d;
        this.wh = i;
        this.qf = d2;
        this.kj = str;
        this.vy = hcVar;
    }

    private gm gm(List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> list, float f, float f2) {
        float f3;
        oo(list);
        gm gmVar = new gm();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.oo.wh vj = kjVar.ork().vj();
            if (vj.qcw() == 1 || vj.qcw() == 2) {
                arrayList.add(kjVar);
            }
            if (vj.qcw() != 1 && vj.qcw() != 2) {
                arrayList2.add(kjVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            gm((com.bytedance.sdk.component.adexpress.dynamic.oo.kj) it.next(), f, f2);
        }
        if (arrayList2.size() <= 0) {
            return gmVar;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Float.valueOf(gm((com.bytedance.sdk.component.adexpress.dynamic.oo.kj) it2.next(), f, f2).pcc));
        }
        ArrayList arrayList4 = new ArrayList();
        int i = 0;
        while (true) {
            int size = arrayList2.size();
            f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (i >= size) {
                break;
            }
            com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar2 = (com.bytedance.sdk.component.adexpress.dynamic.oo.kj) arrayList2.get(i);
            String mk = kjVar2.ork().vj().mk();
            float kj = kjVar2.kj();
            boolean equals = TextUtils.equals(mk, "flex");
            if (TextUtils.equals(mk, "auto")) {
                List<List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj>> nac = kjVar2.nac();
                if (nac != null && nac.size() > 0) {
                    Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj>> it3 = nac.iterator();
                    while (it3.hasNext()) {
                        if (sf(it3.next())) {
                            equals = true;
                            break;
                        }
                    }
                }
                equals = false;
            }
            pcc pccVar = new pcc();
            if (!equals) {
                kj = ((Float) arrayList3.get(i)).floatValue();
            }
            pccVar.pcc = kj;
            pccVar.sf = !equals;
            if (equals) {
                f3 = ((Float) arrayList3.get(i)).floatValue();
            }
            pccVar.gm = f3;
            arrayList4.add(pccVar);
            i++;
        }
        pcc(arrayList4, f, arrayList2);
        List<pcc> pcc2 = ork.pcc(f, arrayList4);
        float f4 = 0.0f;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            f4 += pcc2.get(i2).pcc;
            if (((Float) arrayList3.get(i2)).floatValue() != pcc2.get(i2).pcc) {
                oo((com.bytedance.sdk.component.adexpress.dynamic.oo.kj) arrayList2.get(i2));
            }
        }
        Iterator it4 = arrayList2.iterator();
        int i3 = 0;
        boolean z = false;
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            i3++;
            if (!sf((com.bytedance.sdk.component.adexpress.dynamic.oo.kj) it4.next())) {
                z = false;
                break;
            }
            if (i3 == arrayList2.size()) {
                z = true;
            }
        }
        if (z) {
            f3 = f2;
        }
        ArrayList arrayList5 = new ArrayList();
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar3 = (com.bytedance.sdk.component.adexpress.dynamic.oo.kj) arrayList2.get(i4);
            gm gm2 = gm(kjVar3, pcc2.get(i4).pcc, f2);
            if (!sf(kjVar3)) {
                f3 = Math.max(f3, gm2.sf);
            }
            arrayList5.add(gm2);
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            arrayList6.add(Float.valueOf(((gm) it5.next()).sf));
        }
        if (!z) {
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar4 = (com.bytedance.sdk.component.adexpress.dynamic.oo.kj) arrayList2.get(i5);
                if (sf(kjVar4) && ((Float) arrayList6.get(i5)).floatValue() != f3) {
                    oo(kjVar4);
                    gm(kjVar4, pcc2.get(i5).pcc, f3);
                }
            }
        }
        gmVar.pcc = f4;
        gmVar.sf = f3;
        return gmVar;
    }

    private boolean sf(List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> list) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj>> nac;
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().ork().vj().mk(), "flex")) {
                return true;
            }
        }
        while (true) {
            boolean z = false;
            for (com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar : list) {
                if (TextUtils.equals(kjVar.ork().vj().mk(), "auto") && (nac = kjVar.nac()) != null) {
                    int i = 0;
                    for (List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> list2 : nac) {
                        i++;
                        if (!sf(list2)) {
                            break;
                        }
                        if (i == list2.size()) {
                            z = true;
                        }
                    }
                }
            }
            return z;
        }
    }

    private gm vj(com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar, float f, float f2) {
        String str = kjVar.gm() + "_" + f + "_" + f2;
        if (this.gm.containsKey(str)) {
            return this.gm.get(str);
        }
        gm wh = wh(kjVar, f, f2);
        this.gm.put(str, wh);
        return wh;
    }

    private gm wh(com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar, float f, float f2) {
        new gm();
        com.bytedance.sdk.component.adexpress.dynamic.oo.wh vj = kjVar.ork().vj();
        kjVar.ork().gm();
        vj.se();
        float lu = vj.lu();
        int erj = vj.erj();
        double gd = vj.gd();
        int ptr = vj.ptr();
        boolean iv = vj.iv();
        boolean hoh = vj.hoh();
        int xb = vj.xb();
        C0042sf c0042sf = new C0042sf();
        c0042sf.pcc = lu;
        c0042sf.sf = erj;
        c0042sf.gm = ptr;
        c0042sf.oo = gd;
        c0042sf.vj = f;
        return pcc(kjVar.ork().gm(), c0042sf, iv, hoh, xb, kjVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gm oo(com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar, float f, float f2) {
        float min;
        float f3;
        float f4;
        gm gmVar = new gm();
        float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            gmVar.pcc = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            gmVar.sf = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            return gmVar;
        }
        if (kjVar.lu()) {
            return pcc(kjVar, f, f2);
        }
        float kj = kjVar.kj();
        float vy = kjVar.vy();
        float jr = kjVar.jr();
        float dax = kjVar.dax();
        com.bytedance.sdk.component.adexpress.dynamic.oo.wh vj = kjVar.ork().vj();
        String mk = vj.mk();
        String tsz = vj.tsz();
        float min2 = ((TextUtils.equals(mk, "flex") || TextUtils.equals(mk, "auto")) ? f : Math.min(kj, f)) - jr;
        if (!TextUtils.equals(tsz, "scale")) {
            if (!TextUtils.equals(tsz, "auto") && !TextUtils.equals(tsz, "flex")) {
                min = Math.min(vy, f2);
                float f6 = min - dax;
                List<List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj>> nac = kjVar.nac();
                float f7 = 0.0f;
                float f8 = 0.0f;
                while (r14.hasNext()) {
                }
                float f9 = f5;
                float f10 = min2;
                float f11 = jr;
                if (!TextUtils.equals(mk, "auto")) {
                }
                if (TextUtils.equals(tsz, "auto")) {
                }
                gmVar.pcc = Math.min(f3 + f11, f);
                gmVar.sf = Math.min(f6 + dax, f2);
                return gmVar;
            }
            min = f2;
            float f62 = min - dax;
            List<List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj>> nac2 = kjVar.nac();
            float f72 = 0.0f;
            float f82 = 0.0f;
            while (r14.hasNext()) {
            }
            float f92 = f5;
            float f102 = min2;
            float f112 = jr;
            if (!TextUtils.equals(mk, "auto")) {
            }
            if (TextUtils.equals(tsz, "auto")) {
            }
            gmVar.pcc = Math.min(f3 + f112, f);
            gmVar.sf = Math.min(f62 + dax, f2);
            return gmVar;
        }
        min = Math.round(min2 / vy) + dax;
        if (min > f2) {
            min2 = Math.round((f2 - dax) * vy);
            min = f2;
        }
        float f622 = min - dax;
        List<List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj>> nac22 = kjVar.nac();
        float f722 = 0.0f;
        float f822 = 0.0f;
        for (List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> list : nac22) {
            float f12 = f5;
            float f13 = jr;
            gm sf = sf(list, min2, f622);
            if (sf(list)) {
                f4 = f12 + 1.0f;
            } else {
                f722 = Math.max(f722, sf.pcc);
                f4 = f12;
            }
            float f14 = f4;
            float f15 = min2;
            f822 = kjVar.ork().sf().equals("carousel") ? Math.max(kjVar.vy(), sf.sf) : f822 + sf.sf;
            jr = f13;
            f5 = f14;
            min2 = f15;
        }
        float f922 = f5;
        float f1022 = min2;
        float f1122 = jr;
        if (!TextUtils.equals(mk, "auto")) {
            f3 = f1022;
        } else if (f922 == nac22.size()) {
            f3 = f;
        } else {
            for (List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> list2 : nac22) {
                gm(list2);
                sf(list2, f722, f622);
            }
            f3 = f722;
        }
        if (TextUtils.equals(tsz, "auto")) {
            if (f822 <= f2) {
                f622 = f822;
            } else {
                pcc(nac22, f3, f622);
            }
        } else if ((TextUtils.equals(tsz, "fixed") || TextUtils.equals(tsz, "flex")) && f622 < f822) {
            pcc(nac22, f3, f622);
        }
        gmVar.pcc = Math.min(f3 + f1122, f);
        gmVar.sf = Math.min(f622 + dax, f2);
        return gmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gm pcc(com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar, float f, float f2) {
        float f3;
        if (TextUtils.isEmpty(kjVar.ork().gm()) && kjVar.ork().vj().gh() == null) {
            return new gm(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (w1l.B(kjVar, "creative-playable-bait")) {
            return new gm(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        float kj = kjVar.kj();
        float vy = kjVar.vy();
        com.bytedance.sdk.component.adexpress.dynamic.oo.wh vj = kjVar.ork().vj();
        String mk = vj.mk();
        String tsz = vj.tsz();
        float hc = kjVar.hc();
        float gbb = kjVar.gbb();
        float jr = kjVar.jr();
        float dax = kjVar.dax();
        if (TextUtils.equals(mk, "fixed")) {
            f = Math.min(kj, f);
            if (TextUtils.equals(tsz, "auto")) {
                f3 = sf(kjVar, f - jr, f2 - dax).sf;
                vy = f3 + dax;
            }
            if (TextUtils.equals(tsz, "scale")) {
                float round = Math.round((f - hc) / vy) + gbb;
                if (round > f2) {
                    f = Math.round((f2 - gbb) * vy) + hc;
                } else {
                    f2 = round;
                }
            } else if (TextUtils.equals(tsz, "fixed")) {
                f2 = Math.min(vy + gbb, f2);
            } else if (!TextUtils.equals(tsz, "flex")) {
                f2 = vy;
            }
            gm gmVar = new gm();
            gmVar.pcc = f;
            gmVar.sf = f2;
            return gmVar;
        }
        if (TextUtils.equals(mk, "auto")) {
            gm sf = sf(kjVar, f - jr, f2 - dax);
            f = sf.pcc + jr;
            if (TextUtils.equals(tsz, "auto")) {
                f3 = sf.sf;
                vy = f3 + dax;
            }
            if (TextUtils.equals(tsz, "scale")) {
            }
            gm gmVar2 = new gm();
            gmVar2.pcc = f;
            gmVar2.sf = f2;
            return gmVar2;
        }
        if (!TextUtils.equals(mk, "flex")) {
            f = kj;
        } else if (TextUtils.equals(tsz, "auto")) {
            f3 = sf(kjVar, f - jr, f2 - dax).sf;
            vy = f3 + dax;
        }
        if (TextUtils.equals(tsz, "scale")) {
        }
        gm gmVar22 = new gm();
        gmVar22.pcc = f;
        gmVar22.sf = f2;
        return gmVar22;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class gm {
        float pcc;
        float sf;

        public gm(float f, float f2) {
            this.pcc = f;
            this.sf = f2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("UnitSize{width=");
            sb.append(this.pcc);
            sb.append(", height=");
            return wt3.n(sb, this.sf, '}');
        }

        public gm() {
        }
    }

    private String vj(com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        return kjVar.gm();
    }

    public gm sf(com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar, float f, float f2) {
        gm gmVar = new gm();
        if (kjVar.ork().vj() == null) {
            return gmVar;
        }
        gm vj = vj(kjVar, f, f2);
        float f3 = vj.pcc;
        float f4 = vj.sf;
        gmVar.pcc = Math.min(f3, f);
        gmVar.sf = Math.min(f4, f2);
        return gmVar;
    }

    private gm sf(List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> list, float f, float f2) {
        gm pcc2 = pcc(list);
        if (pcc2 != null && (pcc2.pcc != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || pcc2.sf != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            return pcc2;
        }
        gm gm2 = gm(list, f, f2);
        pcc(list, gm2);
        return gm2;
    }

    private boolean sf(com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        if (kjVar == null) {
            return false;
        }
        if (TextUtils.equals(kjVar.ork().vj().tsz(), "flex")) {
            return true;
        }
        return gm(kjVar);
    }

    private gm pcc(String str, C0042sf c0042sf, boolean z, boolean z2, int i, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        return vh.pcc(str, kjVar.ork().sf(), C0042sf.pcc(c0042sf).toString(), z, z2, i, kjVar, this.vj, this.wh, this.qf, this.kj, this.vy);
    }

    private void pcc(List<List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj>> list, float f, float f2) {
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj>> it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (pcc(it.next(), false)) {
                z = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> list2 : list) {
            pcc pccVar = new pcc();
            boolean pcc2 = pcc(list2, !z);
            pccVar.pcc = pcc2 ? 1.0f : sf(list2, f, f2).sf;
            pccVar.sf = !pcc2;
            arrayList.add(pccVar);
        }
        List<pcc> pcc3 = ork.pcc(f2, arrayList);
        for (int i = 0; i < list.size(); i++) {
            if (((pcc) arrayList.get(i)).pcc != pcc3.get(i).pcc) {
                List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> list3 = list.get(i);
                gm(list3);
                sf(list3, f, pcc3.get(i).pcc);
            }
        }
    }

    private boolean pcc(List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> list, boolean z) {
        for (com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.oo.wh vj = kjVar.ork().vj();
            String tsz = vj.tsz();
            if (TextUtils.equals(tsz, "flex") || (z && ((TextUtils.equals(vj.mk(), "flex") && TextUtils.equals(vj.tsz(), "scale") && com.bytedance.sdk.component.adexpress.dynamic.oo.vj.pcc.get(kjVar.ork().sf()).intValue() == 7) || TextUtils.equals(tsz, "flex")))) {
                return true;
            }
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> it = list.iterator();
        while (it.hasNext()) {
            if (gm(it.next())) {
                return true;
            }
        }
        return false;
    }

    private void pcc(List<pcc> list, float f, List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> list2) {
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (pcc pccVar : list) {
            if (pccVar.sf) {
                f2 += pccVar.pcc;
            }
        }
        if (f2 > f) {
            int i = 0;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (list.get(i2).sf && list2.get(i2).tz()) {
                    i++;
                }
            }
            if (i > 0) {
                float ceil = (float) (Math.ceil(((f2 - f) / i) * 1000.0f) / 1000.0d);
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    pcc pccVar2 = list.get(i3);
                    if (pccVar2.sf && list2.get(i3).tz()) {
                        pccVar2.pcc -= ceil;
                    }
                }
            }
        }
    }

    public void pcc() {
        this.gm.clear();
        this.pcc.clear();
        this.sf.clear();
    }

    public gm pcc(com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        return this.pcc.get(vj(kjVar));
    }

    public gm pcc(List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> list) {
        return this.sf.get(oo(list));
    }

    private void pcc(com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar, gm gmVar) {
        this.pcc.put(vj(kjVar), gmVar);
    }

    private void pcc(List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> list, gm gmVar) {
        this.sf.put(oo(list), gmVar);
    }

    private void oo(com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        this.pcc.remove(vj(kjVar));
        List<List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj>> nac = kjVar.nac();
        if (nac == null || nac.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj>> it = nac.iterator();
        while (it.hasNext()) {
            gm(it.next());
        }
    }

    private String oo(List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            String gm2 = list.get(i).gm();
            if (i < list.size() - 1) {
                sb.append(gm2);
                sb.append("-");
            } else {
                sb.append(gm2);
            }
        }
        return sb.toString();
    }

    public gm gm(com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar, float f, float f2) {
        if (kjVar == null) {
            return null;
        }
        gm pcc2 = pcc(kjVar);
        if (pcc2 != null && (pcc2.pcc != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || pcc2.sf != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            return pcc2;
        }
        gm oo = oo(kjVar, f, f2);
        pcc(kjVar, oo);
        return oo;
    }

    private boolean gm(com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj>> nac;
        if (!kjVar.lu() && TextUtils.equals(kjVar.ork().vj().tsz(), "auto") && (nac = kjVar.nac()) != null && nac.size() > 0) {
            if (nac.size() == 1) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> it = nac.get(0).iterator();
                while (it.hasNext()) {
                    if (!sf(it.next())) {
                        return false;
                    }
                }
                return true;
            }
            Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj>> it2 = nac.iterator();
            while (it2.hasNext()) {
                if (pcc(it2.next(), true)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void gm(List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.sf.remove(oo(list));
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> it = list.iterator();
        while (it.hasNext()) {
            oo(it.next());
        }
    }
}
