package com.bytedance.adsdk.pcc.sf.gm.pcc;

import defpackage.a70;
import java.util.Deque;
import java.util.LinkedList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vy extends wh {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (r10.pcc() != com.bytedance.adsdk.pcc.sf.oo.sf.METHOD) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        r10 = (com.bytedance.adsdk.pcc.sf.sf.pcc.ork) r10;
        r0 = new java.util.LinkedList();
        r1 = new java.util.LinkedList();
        r6 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r6.hasNext() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        r3 = (com.bytedance.adsdk.pcc.sf.sf.pcc) r6.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (r3.pcc() != com.bytedance.adsdk.pcc.sf.oo.oo.COMMA) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        r1.addLast(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        r0.add(com.bytedance.adsdk.pcc.sf.vj.sf.pcc(r1, r7, r8));
        r1.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        if (r1.isEmpty() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
    
        r0.add(com.bytedance.adsdk.pcc.sf.vj.sf.pcc(r1, r7, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0086, code lost:
    
        r10.pcc((com.bytedance.adsdk.pcc.sf.sf.pcc[]) r0.toArray(new com.bytedance.adsdk.pcc.sf.sf.pcc[r0.size()]));
        r10.pcc(true);
        r8 = r8 + 1;
        r9.push(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        r9.push(com.bytedance.adsdk.pcc.sf.vj.sf.pcc(r6, r7, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a5, code lost:
    
        return r8 + 1;
     */
    @Override // com.bytedance.adsdk.pcc.sf.gm.pcc.wh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int pcc(String str, int i, Deque<com.bytedance.adsdk.pcc.sf.sf.pcc> deque, com.bytedance.adsdk.pcc.sf.gm.pcc pccVar) {
        if (')' != pcc(i, str)) {
            return pccVar.pcc(str, i, deque);
        }
        LinkedList linkedList = new LinkedList();
        while (true) {
            com.bytedance.adsdk.pcc.sf.sf.pcc pollFirst = deque.pollFirst();
            if (pollFirst == null || pollFirst.pcc() == com.bytedance.adsdk.pcc.sf.oo.oo.LEFT_PAREN || ((pollFirst instanceof com.bytedance.adsdk.pcc.sf.sf.pcc.ork) && pollFirst.pcc() == com.bytedance.adsdk.pcc.sf.oo.sf.METHOD && !((com.bytedance.adsdk.pcc.sf.sf.pcc.ork) pollFirst).gm())) {
                break;
            }
            linkedList.addFirst(pollFirst);
        }
        a70.p(str.substring(0, i));
        return 0;
    }
}
