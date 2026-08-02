package com.google.android.gms.internal.ads;

import defpackage.bmo;
import defpackage.gsn;
import defpackage.hsn;
import defpackage.inn;
import defpackage.rvd;
import defpackage.slo;
import defpackage.wog;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcgj {
    public static final hsn a;
    public static final hsn b;
    public static final hsn c;
    public static final gsn d;
    public static final bmo e;
    public static final hsn f;
    public static final ExecutorService g;
    public static final hsn h;

    static {
        ThreadPoolExecutor threadPoolExecutor;
        inn innVar = zzbjg.Tc;
        Object b2 = com.google.android.gms.ads.internal.client.zzba.zzc().b(innVar);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (b2 != null && ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(innVar)).booleanValue()) {
            inn innVar2 = zzbjg.Uc;
            if (com.google.android.gms.ads.internal.client.zzba.zzc().b(innVar2) != null) {
                inn innVar3 = zzbjg.Vc;
                if (com.google.android.gms.ads.internal.client.zzba.zzc().b(innVar3) != null) {
                    threadPoolExecutor = new ThreadPoolExecutor(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().b(innVar2)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().b(innVar2)).intValue(), 10L, timeUnit, new LinkedBlockingQueue(), new rvd("Default", 1));
                    threadPoolExecutor.allowCoreThreadTimeOut(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(innVar3)).booleanValue());
                    a = new hsn((Executor) threadPoolExecutor);
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, timeUnit, new LinkedBlockingQueue(), new rvd("Loader", 1));
                    threadPoolExecutor2.allowCoreThreadTimeOut(true);
                    b = new hsn((Executor) threadPoolExecutor2);
                    ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new rvd("Activeview", 1));
                    threadPoolExecutor3.allowCoreThreadTimeOut(true);
                    c = new hsn((Executor) threadPoolExecutor3);
                    gsn gsnVar = new gsn(3, new rvd("Schedule", 1));
                    d = gsnVar;
                    e = new bmo(gsnVar);
                    f = new hsn(new wog());
                    g = Executors.newSingleThreadExecutor(new rvd("AdQualityMetrics", 1));
                    h = new hsn(slo.a);
                }
            }
        }
        threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, timeUnit, new SynchronousQueue(), new rvd("Default", 1));
        a = new hsn((Executor) threadPoolExecutor);
        ThreadPoolExecutor threadPoolExecutor22 = new ThreadPoolExecutor(5, 5, 10L, timeUnit, new LinkedBlockingQueue(), new rvd("Loader", 1));
        threadPoolExecutor22.allowCoreThreadTimeOut(true);
        b = new hsn((Executor) threadPoolExecutor22);
        ThreadPoolExecutor threadPoolExecutor32 = new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new rvd("Activeview", 1));
        threadPoolExecutor32.allowCoreThreadTimeOut(true);
        c = new hsn((Executor) threadPoolExecutor32);
        gsn gsnVar2 = new gsn(3, new rvd("Schedule", 1));
        d = gsnVar2;
        e = new bmo(gsnVar2);
        f = new hsn(new wog());
        g = Executors.newSingleThreadExecutor(new rvd("AdQualityMetrics", 1));
        h = new hsn(slo.a);
    }
}
