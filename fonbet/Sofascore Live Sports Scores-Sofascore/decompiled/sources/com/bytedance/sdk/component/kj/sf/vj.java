package com.bytedance.sdk.component.kj.sf;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj implements ThreadFactory {
    public static volatile boolean gm;
    private final AtomicInteger oo = new AtomicInteger(1);
    protected final ThreadGroup pcc;
    protected final String sf;

    public vj(String str) {
        this.pcc = new ThreadGroup("pag_g_".concat(String.valueOf(str)));
        this.sf = pcc(str);
    }

    public static String pcc(String str) {
        return "pag_".concat(String.valueOf(str));
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        if (gm) {
            return null;
        }
        Thread pcc = pcc(this.pcc, runnable, this.sf + "_" + this.oo.getAndIncrement());
        if (pcc.isDaemon()) {
            pcc.setDaemon(false);
        }
        return pcc;
    }

    public Thread pcc(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }
}
