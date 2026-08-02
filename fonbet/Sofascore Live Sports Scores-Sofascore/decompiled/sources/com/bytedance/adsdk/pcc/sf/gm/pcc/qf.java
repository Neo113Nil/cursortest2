package com.bytedance.adsdk.pcc.sf.gm.pcc;

import com.bytedance.adsdk.pcc.sf.sf.pcc.jr;
import defpackage.a70;
import java.util.Deque;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf extends wh {
    @Override // com.bytedance.adsdk.pcc.sf.gm.pcc.wh
    public int pcc(String str, int i, Deque<com.bytedance.adsdk.pcc.sf.sf.pcc> deque, com.bytedance.adsdk.pcc.sf.gm.pcc pccVar) {
        char pcc;
        if (!pcc(str, i, deque)) {
            return pccVar.pcc(str, i, deque);
        }
        int i2 = pcc(i, str) == '-' ? i + 1 : i;
        boolean z = false;
        while (true) {
            pcc = pcc(i2, str);
            if (com.bytedance.adsdk.pcc.sf.vj.pcc.gm(pcc) || (!z && pcc == '.')) {
                i2++;
                if (pcc == '.') {
                    z = true;
                }
            }
        }
        if (pcc != '.') {
            deque.push(new jr(str.substring(i, i2)));
            return i2;
        }
        a70.p("Illegal negative number format, problem interval:".concat(str.substring(i, i2)));
        return 0;
    }

    private boolean pcc(String str, int i, Deque<com.bytedance.adsdk.pcc.sf.sf.pcc> deque) {
        if ('-' == pcc(i, str)) {
            if (deque.peek() != null && !com.bytedance.adsdk.pcc.sf.oo.gm.pcc(deque.peek().pcc())) {
                return false;
            }
            if (com.bytedance.adsdk.pcc.sf.vj.pcc.gm(pcc(i + 1, str))) {
                return true;
            }
            a70.p("Unrecognized - symbol, not a negative number or operator, problem range:".concat(str.substring(0, i)));
            return false;
        }
        return com.bytedance.adsdk.pcc.sf.vj.pcc.gm(pcc(i, str));
    }
}
