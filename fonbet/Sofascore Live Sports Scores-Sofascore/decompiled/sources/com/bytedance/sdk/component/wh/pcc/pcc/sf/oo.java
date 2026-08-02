package com.bytedance.sdk.component.wh.pcc.pcc.sf;

import com.bytedance.sdk.component.wh.pcc.oo.pcc;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class oo<T extends com.bytedance.sdk.component.wh.pcc.oo.pcc> {
    private Queue<String> gm;
    private String oo;
    private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc pcc;
    private Queue<T> sf = new ConcurrentLinkedQueue();

    public oo(com.bytedance.sdk.component.wh.pcc.oo.sf.pcc pccVar, Queue<String> queue, String str) {
        this.pcc = pccVar;
        this.gm = queue;
        this.oo = str;
    }

    public synchronized List<com.bytedance.sdk.component.wh.pcc.oo.pcc> pcc(int i, int i2) {
        if (!sf(i, i2)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.pcc.pcc());
        do {
            T poll = this.sf.poll();
            if (poll == null) {
                break;
            }
            arrayList.add(poll);
        } while (arrayList.size() != this.pcc.sf());
        return arrayList;
    }

    public synchronized boolean sf(int i, int i2) {
        int size = this.sf.size();
        int pcc = this.pcc.pcc();
        return (i == 2 || i == 1) ? com.bytedance.sdk.component.wh.pcc.gm.pcc.gm() ? size > 0 : size >= pcc : size >= pcc;
    }

    public void pcc(T t) {
        Queue<T> queue = this.sf;
        if (queue == null || t == null) {
            return;
        }
        queue.offer(t);
    }

    public synchronized void pcc(int i, List<T> list) {
        if (i != -1 && i != 200 && i != 509) {
            this.sf.addAll(list);
        } else {
            this.sf.size();
        }
    }
}
