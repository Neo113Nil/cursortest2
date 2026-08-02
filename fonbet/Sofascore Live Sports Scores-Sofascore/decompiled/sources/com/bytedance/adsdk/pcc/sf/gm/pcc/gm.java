package com.bytedance.adsdk.pcc.sf.gm.pcc;

import com.bytedance.adsdk.pcc.sf.sf.pcc.tz;
import java.util.Deque;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm extends wh {
    private int pcc(String str, int i, Deque<com.bytedance.adsdk.pcc.sf.sf.pcc> deque) {
        int i2;
        int i3 = 0;
        while (true) {
            i2 = i3 + i;
            char pcc = pcc(i2, str);
            if (!com.bytedance.adsdk.pcc.sf.vj.pcc.sf(pcc) && !com.bytedance.adsdk.pcc.sf.vj.pcc.gm(pcc) && '.' != pcc && '[' != pcc && ']' != pcc && '_' != pcc && '$' != pcc) {
                break;
            }
            i3++;
        }
        String substring = str.substring(i, i2);
        if (com.bytedance.adsdk.pcc.sf.oo.pcc.pcc(substring) != null) {
            deque.push(new com.bytedance.adsdk.pcc.sf.sf.pcc.qf(substring));
            return i2;
        }
        deque.push(new tz(substring));
        return i2;
    }

    @Override // com.bytedance.adsdk.pcc.sf.gm.pcc.wh
    public int pcc(String str, int i, Deque<com.bytedance.adsdk.pcc.sf.sf.pcc> deque, com.bytedance.adsdk.pcc.sf.gm.pcc pccVar) {
        char pcc = pcc(i, str);
        if (!com.bytedance.adsdk.pcc.sf.vj.pcc.sf(pcc) && pcc != '$') {
            return pccVar.pcc(str, i, deque);
        }
        return pcc(str, i, deque);
    }
}
