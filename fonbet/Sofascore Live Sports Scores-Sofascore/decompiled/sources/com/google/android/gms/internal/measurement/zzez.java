package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzlt;
import com.ironsource.Ua;
import com.unity3d.services.core.fid.Constants;
import defpackage.f5o;
import defpackage.gt7;
import defpackage.p2o;
import defpackage.tyn;
import defpackage.tzn;
import defpackage.y0o;
import defpackage.zyn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzez {
    public static volatile zzez i;
    public final DefaultClock a = DefaultClock.a;
    public final ExecutorService b;
    public final AppMeasurementSdk c;
    public final ArrayList d;
    public int e;
    public boolean f;
    public volatile zzcp g;
    public volatile long h;

    public zzez(Context context, Bundle bundle) {
        p2o p2oVar = new p2o(this);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), p2oVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.b = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.c = new AppMeasurementSdk(this);
        this.d = new ArrayList();
        try {
            if (zzlt.a(context, com.google.android.gms.measurement.internal.zzhu.a(context)) != null) {
                try {
                    Class.forName(Constants.FID_CLASS, false, zzez.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f = true;
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        c(new tzn(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new gt7(this, 2));
    }

    public static zzez f(Context context, Bundle bundle) {
        Preconditions.i(context);
        if (i == null) {
            synchronized (zzez.class) {
                try {
                    if (i == null) {
                        i = new zzez(context, bundle == null ? new Bundle() : new Bundle(bundle));
                    }
                } finally {
                }
            }
        }
        return i;
    }

    public final Map a(String str, String str2, boolean z) {
        zzcm zzcmVar = new zzcm();
        c(new tyn(this, str, str2, z, zzcmVar));
        Bundle Z1 = zzcmVar.Z1(5000L);
        if (Z1 == null || Z1.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap(Z1.size());
        for (String str3 : Z1.keySet()) {
            Object obj = Z1.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final int b(String str) {
        zzcm zzcmVar = new zzcm();
        c(new tzn(this, str, zzcmVar));
        Integer num = (Integer) zzcm.l2(Integer.class, zzcmVar.Z1(Ua.s));
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final void c(f5o f5oVar) {
        this.b.execute(f5oVar);
    }

    public final void d(Exception exc, boolean z, boolean z2) {
        this.f |= z;
        if (!z && z2) {
            c(new tzn(this, "Error with data collection. Data lost.", exc));
        }
    }

    public final void e(Bundle bundle, String str, String str2, boolean z) {
        c(new tyn(this, str, str2, bundle, z));
    }

    public final List g(String str, String str2) {
        zzcm zzcmVar = new zzcm();
        c(new zyn(this, str, str2, zzcmVar));
        List list = (List) zzcm.l2(List.class, zzcmVar.Z1(5000L));
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public final long h() {
        zzcm zzcmVar = new zzcm();
        c(new y0o(this, zzcmVar, 2));
        Long l = (Long) zzcm.l2(Long.class, zzcmVar.Z1(500L));
        if (l != null) {
            return l.longValue();
        }
        long nanoTime = System.nanoTime();
        this.a.getClass();
        long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
        int i2 = this.e + 1;
        this.e = i2;
        return nextLong + i2;
    }
}
