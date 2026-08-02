package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Looper;
import com.sports.insider.MyApp;
import io.appmetrica.analytics.impl.ap;
import io.sentry.ILogger;
import io.sentry.b5;
import io.sentry.d5;
import io.sentry.d6;
import io.sentry.f4;
import io.sentry.g5;
import io.sentry.h4;
import io.sentry.t4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o0 implements io.sentry.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15783a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f15784b;

    /* renamed from: c, reason: collision with root package name */
    public final SentryAndroidOptions f15785c;

    /* renamed from: d, reason: collision with root package name */
    public final Future f15786d;

    /* renamed from: e, reason: collision with root package name */
    public final io.sentry.util.f f15787e = new io.sentry.util.f(new ap(23));

    public o0(MyApp myApp, n0 n0Var, SentryAndroidOptions sentryAndroidOptions) {
        Future future;
        Context applicationContext = myApp.getApplicationContext();
        this.f15783a = applicationContext != null ? applicationContext : myApp;
        this.f15784b = n0Var;
        y4.a.C(sentryAndroidOptions, "The options object is required.");
        this.f15785c = sentryAndroidOptions;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            future = newSingleThreadExecutor.submit(new com.google.firebase.messaging.i(7, this, sentryAndroidOptions));
        } catch (RejectedExecutionException e7) {
            sentryAndroidOptions.getLogger().e(b5.WARNING, "Device info caching task rejected.", e7);
            future = null;
        }
        this.f15786d = future;
        newSingleThreadExecutor.shutdown();
    }

    public final void a(h4 h4Var, io.sentry.h0 h0Var) {
        Boolean bool;
        io.sentry.protocol.a d10 = h4Var.f16456b.d();
        if (d10 == null) {
            d10 = new io.sentry.protocol.a();
        }
        d10.f16737e = (String) m0.f15778c.a(this.f15783a);
        io.sentry.android.core.performance.g a7 = io.sentry.android.core.performance.f.b().a(this.f15785c);
        q0 q0Var = null;
        if (a7.b()) {
            d10.f16734b = (a7.b() ? new g5(a7.f15813b * 1000000) : null) == null ? null : com.google.android.play.core.appupdate.b.o(Double.valueOf(r2.f16439a / 1000000.0d).longValue());
        }
        if (!k2.x.u(h0Var) && d10.f16742k == null && (bool = h0.f15617e.f15621d) != null) {
            d10.f16742k = Boolean.valueOf(!bool.booleanValue());
        }
        Context context = this.f15783a;
        SentryAndroidOptions sentryAndroidOptions = this.f15785c;
        ILogger logger = sentryAndroidOptions.getLogger();
        n0 n0Var = this.f15784b;
        PackageInfo e7 = m0.e(context, logger, n0Var);
        if (e7 != null) {
            String g10 = m0.g(e7, n0Var);
            if (h4Var.f16465l == null) {
                h4Var.f16465l = g10;
            }
            Future future = this.f15786d;
            if (future != null) {
                try {
                    q0Var = (q0) future.get();
                } catch (Throwable th2) {
                    sentryAndroidOptions.getLogger().e(b5.ERROR, "Failed to retrieve device info", th2);
                }
            } else {
                sentryAndroidOptions.getLogger().h(b5.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            d10.f16733a = e7.packageName;
            d10.f16738f = e7.versionName;
            d10.f16739g = m0.g(e7, n0Var);
            HashMap hashMap = new HashMap();
            String[] strArr = e7.requestedPermissions;
            int[] iArr = e7.requestedPermissionsFlags;
            if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
                for (int i5 = 0; i5 < strArr.length; i5++) {
                    String str = strArr[i5];
                    hashMap.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i5] & 2) == 2 ? "granted" : "not_granted");
                }
            }
            d10.f16740h = hashMap;
            if (q0Var != null) {
                try {
                    com.android.billingclient.api.u0 u0Var = q0Var.f15823f;
                    if (u0Var != null) {
                        d10.f16743l = Boolean.valueOf(u0Var.f4106a);
                        String[] strArr2 = (String[]) u0Var.f4107b;
                        if (strArr2 != null) {
                            d10.f16744m = Arrays.asList(strArr2);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        h4Var.f16456b.m(d10);
    }

    public final void b(h4 h4Var, boolean z5, boolean z7) {
        io.sentry.protocol.i0 i0Var = h4Var.f16463i;
        if (i0Var == null) {
            i0Var = new io.sentry.protocol.i0();
            h4Var.f16463i = i0Var;
        }
        String str = i0Var.f16817b;
        SentryAndroidOptions sentryAndroidOptions = this.f15785c;
        if (str == null) {
            i0Var.f16817b = (String) sentryAndroidOptions.getRuntimeManager().b(new androidx.credentials.playservices.controllers.CreateRestoreCredential.a(26, this));
        }
        if (i0Var.f16819d == null && sentryAndroidOptions.isSendDefaultPii()) {
            i0Var.f16819d = "{{auto}}";
        }
        io.sentry.protocol.c cVar = h4Var.f16456b;
        io.sentry.protocol.f e7 = cVar.e();
        Future future = this.f15786d;
        if (e7 == null) {
            if (future != null) {
                try {
                    cVar.o(((q0) future.get()).a(z5, z7));
                } catch (Throwable th2) {
                    sentryAndroidOptions.getLogger().e(b5.ERROR, "Failed to retrieve device info", th2);
                }
            } else {
                sentryAndroidOptions.getLogger().h(b5.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            io.sentry.protocol.o g10 = cVar.g();
            if (future != null) {
                try {
                    cVar.r(((q0) future.get()).f15824g);
                } catch (Throwable th3) {
                    sentryAndroidOptions.getLogger().e(b5.ERROR, "Failed to retrieve os system", th3);
                }
            } else {
                sentryAndroidOptions.getLogger().h(b5.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            if (g10 != null) {
                String str2 = g10.f16869a;
                cVar.k(g10, (str2 == null || str2.isEmpty()) ? "os_1" : "os_" + str2.trim().toLowerCase(Locale.ROOT));
            }
        }
        if (future == null) {
            sentryAndroidOptions.getLogger().h(b5.ERROR, "Failed to retrieve device info", new Object[0]);
            return;
        }
        try {
            g6.h0 h0Var = ((q0) future.get()).f15822e;
            if (h0Var != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("isSideLoaded", String.valueOf(h0Var.f9847a));
                String str3 = h0Var.f9848b;
                if (str3 != null) {
                    hashMap.put("installerStore", str3);
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    h4Var.b((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th4) {
            sentryAndroidOptions.getLogger().e(b5.ERROR, "Error getting side loaded info.", th4);
        }
    }

    @Override // io.sentry.c0
    public final d6 c(d6 d6Var, io.sentry.h0 h0Var) {
        boolean d10 = d(d6Var, h0Var);
        if (d10) {
            a(d6Var, h0Var);
        }
        b(d6Var, false, d10);
        return d6Var;
    }

    public final boolean d(h4 h4Var, io.sentry.h0 h0Var) {
        if (k2.x.D(h0Var)) {
            return true;
        }
        this.f15785c.getLogger().h(b5.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", h4Var.f16455a);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    @Override // io.sentry.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t4 k(t4 t4Var, io.sentry.h0 h0Var) {
        io.sentry.protocol.b0 b0Var;
        List list;
        boolean z5;
        boolean d10 = d(t4Var, h0Var);
        if (d10) {
            a(t4Var, h0Var);
            com.android.billingclient.api.m mVar = t4Var.f17094s;
            if ((mVar != null ? mVar.f4046a : null) != null) {
                boolean u10 = k2.x.u(h0Var);
                com.android.billingclient.api.m mVar2 = t4Var.f17094s;
                Iterator it = (mVar2 != null ? mVar2.f4046a : null).iterator();
                while (it.hasNext()) {
                    io.sentry.protocol.d0 d0Var = (io.sentry.protocol.d0) it.next();
                    io.sentry.android.core.internal.util.e.f15712a.getClass();
                    Long l6 = d0Var.f16760a;
                    if (l6 != null) {
                        if (Looper.getMainLooper().getThread().getId() == l6.longValue()) {
                            z5 = true;
                            if (d0Var.f16765f == null) {
                                d0Var.f16765f = Boolean.valueOf(z5);
                            }
                            if (!u10 && d0Var.f16767h == null) {
                                d0Var.f16767h = Boolean.valueOf(z5);
                            }
                        }
                    }
                    z5 = false;
                    if (d0Var.f16765f == null) {
                    }
                    if (!u10) {
                        d0Var.f16767h = Boolean.valueOf(z5);
                    }
                }
            }
        }
        b(t4Var, true, d10);
        com.android.billingclient.api.m mVar3 = t4Var.f17095t;
        ArrayList arrayList = mVar3 != null ? mVar3.f4046a : null;
        if (arrayList != null && arrayList.size() > 1) {
            io.sentry.protocol.u uVar = (io.sentry.protocol.u) arrayList.get(arrayList.size() - 1);
            if ("java.lang".equals(uVar.f16917c) && (b0Var = uVar.f16919e) != null && (list = b0Var.f16749a) != null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if ("com.android.internal.os.RuntimeInit$MethodAndArgsCaller".equals(((io.sentry.protocol.z) it2.next()).f16948f)) {
                        Collections.reverse(arrayList);
                        break;
                    }
                }
            }
        }
        return t4Var;
    }

    @Override // io.sentry.c0
    public final io.sentry.protocol.e0 n(io.sentry.protocol.e0 e0Var, io.sentry.h0 h0Var) {
        boolean d10 = d(e0Var, h0Var);
        if (d10) {
            a(e0Var, h0Var);
        }
        b(e0Var, false, d10);
        return e0Var;
    }

    @Override // io.sentry.c0
    public final d5 r(d5 d5Var) {
        SentryAndroidOptions sentryAndroidOptions = this.f15785c;
        try {
            f4 f4Var = f4.STRING;
            d5Var.a("device.brand", new io.sentry.protocol.l(f4Var, (Object) Build.BRAND));
            d5Var.a("device.model", new io.sentry.protocol.l(Build.MODEL, f4Var.apiName()));
            d5Var.a("device.family", new io.sentry.protocol.l(this.f15787e.a(), f4Var.apiName()));
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().e(b5.ERROR, "Failed to retrieve device info", th2);
        }
        try {
            f4 f4Var2 = f4.STRING;
            d5Var.a("os.name", new io.sentry.protocol.l(f4Var2, (Object) "Android"));
            d5Var.a("os.version", new io.sentry.protocol.l(Build.VERSION.RELEASE, f4Var2.apiName()));
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().e(b5.ERROR, "Failed to retrieve os system", th3);
        }
        return d5Var;
    }
}
