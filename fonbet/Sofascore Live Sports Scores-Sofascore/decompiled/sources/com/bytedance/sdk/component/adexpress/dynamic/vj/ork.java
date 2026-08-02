package com.bytedance.sdk.component.adexpress.dynamic.vj;

import com.bytedance.sdk.component.adexpress.dynamic.vj.sf;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class ork {
    public static List<sf.pcc> pcc(float f, List<sf.pcc> list) {
        float pcc;
        ArrayList arrayList = new ArrayList();
        Iterator<sf.pcc> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((sf.pcc) it.next().clone());
        }
        Iterator it2 = arrayList.iterator();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        while (it2.hasNext()) {
            sf.pcc pccVar = (sf.pcc) it2.next();
            boolean z2 = pccVar.sf;
            float f2 = pccVar.pcc;
            if (z2) {
                i = (int) (i + f2);
            } else {
                i2 = (int) (i2 + f2);
                z = false;
            }
        }
        if (!z || f <= i) {
            float f3 = i;
            float f4 = f < f3 ? f / f3 : 1.0f;
            float f5 = f > f3 ? (f - f3) / i2 : 0.0f;
            if (f5 > 1.0f) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                boolean z3 = false;
                while (it3.hasNext()) {
                    sf.pcc pccVar2 = (sf.pcc) it3.next();
                    if (!pccVar2.sf) {
                        float f6 = pccVar2.gm;
                        if (f6 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && pccVar2.pcc * f5 > f6) {
                            pccVar2.pcc = f6;
                            pccVar2.sf = true;
                            z3 = true;
                        }
                    }
                    arrayList2.add(pccVar2);
                }
                if (z3) {
                    return pcc(f, arrayList2);
                }
            }
            Iterator it4 = arrayList.iterator();
            int i3 = 0;
            while (it4.hasNext()) {
                sf.pcc pccVar3 = (sf.pcc) it4.next();
                boolean z4 = pccVar3.sf;
                float f7 = pccVar3.pcc;
                if (z4) {
                    pcc = pcc(f7 * f4);
                    pccVar3.pcc = pcc;
                } else {
                    pcc = pcc(f7 * f5);
                    pccVar3.pcc = pcc;
                }
                i3 = (int) (i3 + pcc);
            }
            float f8 = i3;
            if (f8 < f) {
                float f9 = f - f8;
                for (int i4 = 0; i4 < arrayList.size() && f9 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT; i4 = (i4 + 1) % arrayList.size()) {
                    sf.pcc pccVar4 = (sf.pcc) arrayList.get(i4);
                    if ((f < f3 && pccVar4.sf) || (f > f3 && !pccVar4.sf)) {
                        pccVar4.pcc += 0.0625f;
                        f9 -= 0.0625f;
                    }
                }
            }
        }
        return arrayList;
    }

    public static float pcc(float f) {
        return (float) Math.ceil((f * 16.0f) / 16.0f);
    }
}
