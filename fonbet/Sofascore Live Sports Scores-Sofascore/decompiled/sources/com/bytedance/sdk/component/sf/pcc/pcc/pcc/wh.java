package com.bytedance.sdk.component.sf.pcc.pcc.pcc;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh extends com.bytedance.sdk.component.sf.pcc.oo {
    private ExecutorService pcc;
    private List<com.bytedance.sdk.component.sf.pcc.sf> sf = new CopyOnWriteArrayList();
    private List<com.bytedance.sdk.component.sf.pcc.sf> gm = new CopyOnWriteArrayList();
    private AtomicInteger oo = new AtomicInteger(64);

    public wh() {
        if (this.pcc == null) {
            this.pcc = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 20L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.bytedance.sdk.component.sf.pcc.pcc.pcc.wh.1
                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable, "systemHttp Dispatcher");
                    thread.setDaemon(false);
                    thread.setPriority(10);
                    return thread;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.sf.pcc.oo
    public List<com.bytedance.sdk.component.sf.pcc.sf> gm() {
        return this.sf;
    }

    @Override // com.bytedance.sdk.component.sf.pcc.oo
    public List<com.bytedance.sdk.component.sf.pcc.sf> oo() {
        return this.gm;
    }

    @Override // com.bytedance.sdk.component.sf.pcc.oo
    public int pcc() {
        return this.oo.get();
    }

    @Override // com.bytedance.sdk.component.sf.pcc.oo
    public ExecutorService sf() {
        return this.pcc;
    }

    @Override // com.bytedance.sdk.component.sf.pcc.oo
    public void pcc(int i) {
        this.oo.set(i);
    }
}
