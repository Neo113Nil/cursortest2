package com.bytedance.sdk.component.kj.pcc;

import com.bytedance.sdk.component.kj.pcc.gm;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo<T extends gm> {
    private int pcc;
    private BlockingQueue<T> sf = new LinkedBlockingQueue();

    private oo(int i) {
        this.pcc = i;
    }

    public boolean pcc(T t) {
        if (t == null) {
            return false;
        }
        t.pcc();
        if (this.sf.size() >= this.pcc) {
            return false;
        }
        return this.sf.offer(t);
    }

    public T pcc() {
        return this.sf.poll();
    }

    public static oo pcc(int i) {
        return new oo(i);
    }
}
