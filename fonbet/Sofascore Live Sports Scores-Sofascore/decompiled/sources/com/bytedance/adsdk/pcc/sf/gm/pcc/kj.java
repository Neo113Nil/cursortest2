package com.bytedance.adsdk.pcc.sf.gm.pcc;

import com.bytedance.adsdk.pcc.sf.sf.pcc.dax;
import defpackage.vp2;
import defpackage.wt3;
import java.util.Deque;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class kj extends wh {
    @Override // com.bytedance.adsdk.pcc.sf.gm.pcc.wh
    public int pcc(String str, int i, Deque<com.bytedance.adsdk.pcc.sf.sf.pcc> deque, com.bytedance.adsdk.pcc.sf.gm.pcc pccVar) {
        if (!com.bytedance.adsdk.pcc.sf.vj.pcc.oo(pcc(i, str))) {
            return pccVar.pcc(str, i, deque);
        }
        int i2 = i + 1;
        String str2 = new String(new char[]{pcc(i, str), pcc(i2, str)});
        if (com.bytedance.adsdk.pcc.sf.oo.gm.pcc(str2) != null) {
            deque.push(new dax(com.bytedance.adsdk.pcc.sf.oo.gm.pcc(str2)));
            return i + 2;
        }
        String valueOf = String.valueOf(pcc(i, str));
        if (com.bytedance.adsdk.pcc.sf.oo.gm.pcc(valueOf) != null) {
            deque.push(new dax(com.bytedance.adsdk.pcc.sf.oo.gm.pcc(valueOf)));
            return i2;
        }
        vp2.f(wt3.q("Unrecognized:", valueOf, "examine:"), str.substring(0, i));
        return 0;
    }
}
