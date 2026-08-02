package com.google.android.gms.internal.ads;

import defpackage.ve6;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdi {
    public static ExecutorService a;

    public static synchronized Executor a() {
        ExecutorService executorService;
        synchronized (zzdi.class) {
            executorService = a;
            if (executorService == null) {
                String str = zzfm.a;
                executorService = Executors.newSingleThreadExecutor(new ve6(1, "ExoPlayer:BackgroundExecutor"));
                a = executorService;
            }
        }
        return executorService;
    }
}
