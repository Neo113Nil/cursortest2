package com.bytedance.adsdk.ugeno.qf;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class ork implements Runnable {
    private WeakReference<Runnable> pcc;

    public ork(Runnable runnable) {
        this.pcc = new WeakReference<>(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable = this.pcc.get();
        if (runnable != null) {
            runnable.run();
        }
    }
}
