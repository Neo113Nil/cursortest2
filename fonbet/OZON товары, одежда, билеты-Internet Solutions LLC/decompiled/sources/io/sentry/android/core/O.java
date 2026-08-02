package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Looper;
import io.sentry.C7165l;
import io.sentry.C7230z2;
import io.sentry.I2;
import io.sentry.InterfaceC7227z;
import io.sentry.O1;
import io.sentry.X2;
import io.sentry.android.core.K;
import io.sentry.protocol.C7185a;
import io.sentry.protocol.C7189e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class O implements InterfaceC7227z {

    /* renamed from: a, reason: collision with root package name */
    final Context f66945a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final I f66946b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final SentryAndroidOptions f66947c;

    /* renamed from: d, reason: collision with root package name */
    final Future<P> f66948d;

    public O(@NotNull Context context, @NotNull I i11, @NotNull final SentryAndroidOptions sentryAndroidOptions) {
        Future<P> future;
        new io.sentry.util.l(new M());
        Context applicationContext = context.getApplicationContext();
        this.f66945a = applicationContext != null ? applicationContext : context;
        this.f66946b = i11;
        io.sentry.util.p.b(sentryAndroidOptions, "The options object is required.");
        this.f66947c = sentryAndroidOptions;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            future = newSingleThreadExecutor.submit(new Callable() { // from class: io.sentry.android.core.N
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return P.c(O.this.f66945a, sentryAndroidOptions);
                }
            });
        } catch (RejectedExecutionException e11) {
            sentryAndroidOptions.getLogger().a(I2.WARNING, "Device info caching task rejected.", e11);
            future = null;
        }
        this.f66948d = future;
        newSingleThreadExecutor.shutdown();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2, types: [io.sentry.ILogger] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v3, types: [io.sentry.ILogger] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [android.content.pm.PackageInfo] */
    private void a(@NotNull O1 o12, @NotNull io.sentry.E e11) {
        PackageManager.PackageInfoFlags of2;
        PackageInfo packageInfo;
        Boolean p11;
        C7185a d11 = o12.C().d();
        if (d11 == null) {
            d11 = new C7185a();
        }
        Context context = this.f66945a;
        d11.o(K.b(context));
        io.sentry.android.core.performance.j m11 = io.sentry.android.core.performance.j.m();
        SentryAndroidOptions sentryAndroidOptions = this.f66947c;
        io.sentry.android.core.performance.l i11 = m11.i(sentryAndroidOptions);
        P p12 = null;
        if (i11.j()) {
            d11.p(i11.d() == null ? null : C7165l.c(Double.valueOf(r2.d() / 1000000.0d).longValue()));
        }
        if (!io.sentry.util.h.c(e11) && d11.l() == null && (p11 = F.o().p()) != null) {
            d11.r(Boolean.valueOf(!p11.booleanValue()));
        }
        ?? logger = sentryAndroidOptions.getLogger();
        I i12 = this.f66946b;
        try {
            i12.getClass();
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = context.getPackageManager();
                String packageName = context.getPackageName();
                of2 = PackageManager.PackageInfoFlags.of(4096);
                packageInfo = packageManager.getPackageInfo(packageName, of2);
                logger = packageInfo;
            } else {
                logger = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            }
        } catch (Throwable th2) {
            logger.a(I2.ERROR, "Error getting package info.", th2);
            logger = 0;
        }
        if (logger != 0) {
            String f7 = K.f(logger, i12);
            if (o12.E() == null) {
                o12.S(f7);
            }
            Future<P> future = this.f66948d;
            if (future != null) {
                try {
                    p12 = future.get();
                } catch (Throwable th3) {
                    sentryAndroidOptions.getLogger().a(I2.ERROR, "Failed to retrieve device info", th3);
                }
            } else {
                sentryAndroidOptions.getLogger().c(I2.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            d11.n(((PackageInfo) logger).packageName);
            d11.q(((PackageInfo) logger).versionName);
            d11.m(K.f(logger, i12));
            HashMap hashMap = new HashMap();
            String[] strArr = ((PackageInfo) logger).requestedPermissions;
            int[] iArr = ((PackageInfo) logger).requestedPermissionsFlags;
            if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
                for (int i13 = 0; i13 < strArr.length; i13++) {
                    String str = strArr[i13];
                    hashMap.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i13] & 2) == 2 ? "granted" : "not_granted");
                }
            }
            d11.s(hashMap);
            if (p12 != null) {
                try {
                    K.b f11 = p12.f();
                    if (f11 != null) {
                        d11.t(Boolean.valueOf(f11.b()));
                        if (f11.a() != null) {
                            d11.u(Arrays.asList(f11.a()));
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        o12.C().o(d11);
    }

    private void b(@NotNull O1 o12, boolean z11, boolean z12) {
        io.sentry.protocol.E P11 = o12.P();
        if (P11 == null) {
            P11 = new io.sentry.protocol.E();
            o12.d0(P11);
        }
        if (P11.j() == null) {
            P11.n(V.a(this.f66945a));
        }
        String k11 = P11.k();
        SentryAndroidOptions sentryAndroidOptions = this.f66947c;
        if (k11 == null && sentryAndroidOptions.isSendDefaultPii()) {
            P11.o();
        }
        C7189e e11 = o12.C().e();
        Future<P> future = this.f66948d;
        if (e11 == null) {
            if (future != null) {
                try {
                    o12.C().q(future.get().a(z11, z12));
                } catch (Throwable th2) {
                    sentryAndroidOptions.getLogger().a(I2.ERROR, "Failed to retrieve device info", th2);
                }
            } else {
                sentryAndroidOptions.getLogger().c(I2.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            io.sentry.protocol.n h11 = o12.C().h();
            if (future != null) {
                try {
                    o12.C().t(future.get().d());
                } catch (Throwable th3) {
                    sentryAndroidOptions.getLogger().a(I2.ERROR, "Failed to retrieve os system", th3);
                }
            } else {
                sentryAndroidOptions.getLogger().c(I2.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            if (h11 != null) {
                String g10 = h11.g();
                o12.C().l(h11, (g10 == null || g10.isEmpty()) ? "os_1" : "os_" + g10.trim().toLowerCase(Locale.ROOT));
            }
        }
        if (future == null) {
            sentryAndroidOptions.getLogger().c(I2.ERROR, "Failed to retrieve device info", new Object[0]);
            return;
        }
        try {
            K.a e12 = future.get().e();
            if (e12 != null) {
                for (Map.Entry entry : e12.a().entrySet()) {
                    o12.b0((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th4) {
            sentryAndroidOptions.getLogger().a(I2.ERROR, "Error getting side loaded info.", th4);
        }
    }

    private boolean e(@NotNull O1 o12, @NotNull io.sentry.E e11) {
        if (io.sentry.util.h.d(e11)) {
            return true;
        }
        this.f66947c.getLogger().c(I2.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", o12.G());
        return false;
    }

    @Override // io.sentry.InterfaceC7227z
    @NotNull
    public final X2 c(@NotNull X2 x22, @NotNull io.sentry.E e11) {
        boolean e12 = e(x22, e11);
        if (e12) {
            a(x22, e11);
        }
        b(x22, false, e12);
        return x22;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    @Override // io.sentry.InterfaceC7227z
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C7230z2 d(@NotNull C7230z2 c7230z2, @NotNull io.sentry.E e11) {
        io.sentry.protocol.y i11;
        List<io.sentry.protocol.x> e12;
        boolean z11;
        boolean e13 = e(c7230z2, e11);
        if (e13) {
            a(c7230z2, e11);
            if (c7230z2.s0() != null) {
                boolean c11 = io.sentry.util.h.c(e11);
                Iterator it = c7230z2.s0().iterator();
                while (it.hasNext()) {
                    io.sentry.protocol.z zVar = (io.sentry.protocol.z) it.next();
                    io.sentry.android.core.internal.util.d.d().getClass();
                    Long l11 = zVar.l();
                    if (l11 != null) {
                        if (io.sentry.android.core.internal.util.d.e(Looper.getMainLooper().getThread()) == l11.longValue()) {
                            z11 = true;
                            if (zVar.o() == null) {
                                zVar.r(Boolean.valueOf(z11));
                            }
                            if (!c11 && zVar.p() == null) {
                                zVar.v(Boolean.valueOf(z11));
                            }
                        }
                    }
                    z11 = false;
                    if (zVar.o() == null) {
                    }
                    if (!c11) {
                        zVar.v(Boolean.valueOf(z11));
                    }
                }
            }
        }
        b(c7230z2, true, e13);
        ArrayList n02 = c7230z2.n0();
        if (n02 != null && n02.size() > 1) {
            io.sentry.protocol.s sVar = (io.sentry.protocol.s) C.o0.b(1, n02);
            if ("java.lang".equals(sVar.h()) && (i11 = sVar.i()) != null && (e12 = i11.e()) != null) {
                Iterator<io.sentry.protocol.x> it2 = e12.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if ("com.android.internal.os.RuntimeInit$MethodAndArgsCaller".equals(it2.next().v())) {
                        Collections.reverse(n02);
                        break;
                    }
                }
            }
        }
        return c7230z2;
    }

    @Override // io.sentry.InterfaceC7227z
    @NotNull
    public final io.sentry.protocol.A j(@NotNull io.sentry.protocol.A a11, @NotNull io.sentry.E e11) {
        boolean e12 = e(a11, e11);
        if (e12) {
            a(a11, e11);
        }
        b(a11, false, e12);
        return a11;
    }
}
