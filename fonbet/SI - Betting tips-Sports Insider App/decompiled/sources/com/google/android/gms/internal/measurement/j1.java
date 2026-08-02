package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: f, reason: collision with root package name */
    public static volatile j1 f5090f;

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f5091a;

    /* renamed from: b, reason: collision with root package name */
    public final r7.a f5092b;

    /* renamed from: c, reason: collision with root package name */
    public int f5093c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5094d;

    /* renamed from: e, reason: collision with root package name */
    public volatile l0 f5095e;

    public j1(Context context, Bundle bundle) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new f1(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f5091a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f5092b = new r7.a(0, this);
        new ArrayList();
        try {
            if (s7.r1.b(context, s7.r1.a(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, j1.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f5094d = true;
                    io.sentry.android.core.w0.m("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        c(new z0(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            io.sentry.android.core.w0.m("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new i1(this));
        }
    }

    public static j1 e(Context context, Bundle bundle) {
        g6.v.h(context);
        if (f5090f == null) {
            synchronized (j1.class) {
                try {
                    if (f5090f == null) {
                        f5090f = new j1(context, bundle);
                    }
                } finally {
                }
            }
        }
        return f5090f;
    }

    public final Map a(String str, String str2, boolean z5) {
        i0 i0Var = new i0();
        c(new e1(this, str, str2, z5, i0Var));
        Bundle e7 = i0Var.e(5000L);
        if (e7 == null || e7.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap(e7.size());
        for (String str3 : e7.keySet()) {
            Object obj = e7.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final int b(String str) {
        i0 i0Var = new i0();
        c(new z0(this, str, i0Var));
        Integer num = (Integer) i0.f(i0Var.e(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final void c(g1 g1Var) {
        this.f5091a.execute(g1Var);
    }

    public final void d(Exception exc, boolean z5, boolean z7) {
        this.f5094d |= z5;
        if (z5) {
            io.sentry.android.core.w0.n("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z7) {
            c(new w0(this, exc));
        }
        io.sentry.android.core.w0.n("FA", "Error with data collection. Data lost.", exc);
    }

    public final List f(String str, String str2) {
        i0 i0Var = new i0();
        c(new y0(this, str, str2, i0Var));
        List list = (List) i0.f(i0Var.e(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }
}
