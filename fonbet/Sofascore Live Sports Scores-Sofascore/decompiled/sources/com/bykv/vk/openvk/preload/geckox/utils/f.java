package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class f implements Executor {
    private static volatile f a;

    public static f a() {
        if (a == null) {
            synchronized (f.class) {
                try {
                    if (a == null) {
                        a = new f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.t().execute(runnable);
    }
}
