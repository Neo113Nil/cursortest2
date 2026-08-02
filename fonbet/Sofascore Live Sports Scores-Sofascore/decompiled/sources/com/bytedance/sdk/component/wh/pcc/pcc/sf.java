package com.bytedance.sdk.component.wh.pcc.pcc;

import android.text.TextUtils;
import com.bytedance.sdk.component.wh.pcc.qf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf extends pcc {
    private final Queue<String> gm;
    private final oo pcc;
    private final gm sf;

    public sf() {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        this.gm = concurrentLinkedQueue;
        this.pcc = new wh(concurrentLinkedQueue);
        this.sf = new gm();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
    
        if (r7 == 2) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.wh.pcc.pcc.oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized List<com.bytedance.sdk.component.wh.pcc.oo.pcc> pcc(int i, int i2, List<String> list) {
        List<com.bytedance.sdk.component.wh.pcc.oo.pcc> list2;
        try {
            List<com.bytedance.sdk.component.wh.pcc.oo.pcc> pcc = this.pcc.pcc(i, i2, list);
            if (pcc == 0 || pcc.size() == 0) {
                ArrayList arrayList = new ArrayList(this.gm);
                if (list != null && !list.isEmpty()) {
                    arrayList.addAll(list);
                }
                List<com.bytedance.sdk.component.wh.pcc.oo.pcc> pcc2 = this.sf.pcc(i, i2, arrayList);
                if (pcc2 != 0 && pcc2.size() != 0) {
                    HashMap hashMap = new HashMap();
                    for (com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar : pcc2) {
                        hashMap.put(pccVar.gm(), pccVar);
                    }
                    arrayList.size();
                    if (arrayList.size() != 0) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            if (hashMap.get(str) != null) {
                                hashMap.remove(str);
                            }
                        }
                    }
                    pcc2.clear();
                    Iterator it2 = hashMap.keySet().iterator();
                    while (it2.hasNext()) {
                        pcc2.add(hashMap.get((String) it2.next()));
                    }
                }
                list2 = pcc2;
            } else {
                pcc.size();
                if (i != 1) {
                    list2 = pcc;
                }
                List<com.bytedance.sdk.component.wh.pcc.oo.pcc> sf = this.sf.sf((com.bytedance.sdk.component.wh.pcc.oo.pcc) pcc.get(0), pcc.size());
                list2 = pcc;
                if (sf != null) {
                    list2 = pcc;
                    if (sf.size() != 0) {
                        sf.size();
                        HashMap hashMap2 = new HashMap();
                        for (com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar2 : sf) {
                            hashMap2.put(pccVar2.gm(), pccVar2);
                        }
                        ArrayList arrayList2 = new ArrayList(this.gm);
                        for (com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar3 : sf) {
                            Iterator it3 = arrayList2.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (TextUtils.equals(pccVar3.gm(), (String) it3.next())) {
                                        hashMap2.remove(pccVar3.gm());
                                        break;
                                    }
                                }
                            }
                        }
                        for (com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar4 : pcc) {
                            hashMap2.put(pccVar4.gm(), pccVar4);
                        }
                        pcc.clear();
                        Iterator it4 = hashMap2.keySet().iterator();
                        while (it4.hasNext()) {
                            pcc.add(hashMap2.get((String) it4.next()));
                        }
                        sf.clear();
                        list2 = pcc;
                    }
                }
            }
            if (list2 != null && !list2.isEmpty()) {
                Iterator<com.bytedance.sdk.component.wh.pcc.oo.pcc> it5 = list2.iterator();
                while (it5.hasNext()) {
                    this.gm.offer(it5.next().gm());
                }
                return list2;
            }
            return new ArrayList();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.oo
    public synchronized void pcc(int i, List<com.bytedance.sdk.component.wh.pcc.oo.pcc> list) {
        try {
            Iterator<com.bytedance.sdk.component.wh.pcc.oo.pcc> it = list.iterator();
            while (it.hasNext()) {
                this.gm.remove(it.next().gm());
            }
            oo ooVar = this.pcc;
            if (ooVar != null) {
                ooVar.pcc(i, list);
            }
            gm gmVar = this.sf;
            if (gmVar != null) {
                gmVar.pcc(i, list);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.oo
    public synchronized void pcc(com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar, int i) {
        oo ooVar;
        if (i != 5) {
            try {
                if (qf.wh().jr().pcc(qf.wh().vj()) && (ooVar = this.pcc) != null && pccVar != null) {
                    ooVar.pcc(pccVar, i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        gm gmVar = this.sf;
        if (gmVar != null && pccVar != null) {
            gmVar.pcc(pccVar, i);
        }
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.oo
    public synchronized boolean pcc(int i, boolean z) {
        if (this.pcc.pcc(i, z)) {
            com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.lq(), 1);
            return true;
        }
        if ((i != 1 && i != 2) || !this.sf.pcc(i, z)) {
            return false;
        }
        com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.zti(), 1);
        return true;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.oo
    public void pcc(int i, long j) {
        this.sf.pcc(i, j);
        this.pcc.pcc(i, j);
    }
}
