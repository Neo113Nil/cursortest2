package com.bytedance.adsdk.pcc.sf.gm.pcc;

import java.util.Deque;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj extends wh {
    @Override // com.bytedance.adsdk.pcc.sf.gm.pcc.wh
    public int pcc(String str, int i, Deque<com.bytedance.adsdk.pcc.sf.sf.pcc> deque, com.bytedance.adsdk.pcc.sf.gm.pcc pccVar) {
        char pcc;
        int i2 = i;
        while (true) {
            pcc = pcc(i2, str);
            if (!com.bytedance.adsdk.pcc.sf.vj.pcc.sf(pcc) && !com.bytedance.adsdk.pcc.sf.vj.pcc.gm(pcc)) {
                break;
            }
            i2++;
        }
        if (pcc != '(') {
            return pccVar.pcc(str, i, deque);
        }
        deque.push(new com.bytedance.adsdk.pcc.sf.sf.pcc.ork(str.substring(i, i2)));
        return i2 + 1;
    }
}
