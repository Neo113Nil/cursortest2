package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import com.facebook.hermes.intl.Constants;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import x8.AbstractC6803a;
import x8.C6805c;
import y8.AbstractC6859b;

/* loaded from: classes2.dex */
public class SoLoader {

    /* renamed from: b, reason: collision with root package name */
    public static x f31568b;

    /* renamed from: l, reason: collision with root package name */
    public static int f31578l;

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantReadWriteLock f31569c = new ReentrantReadWriteLock();

    /* renamed from: d, reason: collision with root package name */
    public static Context f31570d = null;
    private static volatile E[] sSoSources = null;

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicInteger f31571e = new AtomicInteger(0);

    /* renamed from: f, reason: collision with root package name */
    public static z8.i f31572f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final Set f31573g = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: h, reason: collision with root package name */
    public static final Map f31574h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public static final Set f31575i = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: j, reason: collision with root package name */
    public static final Map f31576j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public static boolean f31577k = true;

    /* renamed from: m, reason: collision with root package name */
    public static int f31579m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static l f31580n = null;

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f31567a = true;

    public static final class a extends UnsatisfiedLinkError {
        public a(Throwable th2, String str) {
            super("APK was built for a different platform. Supported ABIs: " + Arrays.toString(SysUtil.j()) + " error: " + str);
            initCause(th2);
        }
    }

    public static int A() {
        ReentrantReadWriteLock reentrantReadWriteLock = f31569c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            int i10 = f31578l;
            int i11 = (i10 & 2) != 0 ? 1 : 0;
            if ((i10 & 256) != 0) {
                i11 |= 4;
            }
            if ((i10 & 128) == 0) {
                i11 |= 8;
            }
            reentrantReadWriteLock.writeLock().unlock();
            return i11;
        } catch (Throwable th2) {
            f31569c.writeLock().unlock();
            throw th2;
        }
    }

    public static int B(int i10) {
        return (i10 & 2048) != 0 ? 1 : 0;
    }

    public static z8.h C(String str, UnsatisfiedLinkError unsatisfiedLinkError, z8.h hVar) {
        p.g("SoLoader", "Running a recovery step for " + str + " due to " + unsatisfiedLinkError.toString());
        ReentrantReadWriteLock reentrantReadWriteLock = f31569c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (hVar == null) {
                try {
                    hVar = j();
                    if (hVar == null) {
                        p.g("SoLoader", "No recovery strategy");
                        throw unsatisfiedLinkError;
                    }
                } catch (v e10) {
                    p.c("SoLoader", "Base APK not found during recovery", e10);
                    throw e10;
                } catch (Exception e11) {
                    p.c("SoLoader", "Got an exception during recovery, will throw the initial error instead", e11);
                    throw unsatisfiedLinkError;
                }
            }
            if (D(unsatisfiedLinkError, hVar)) {
                f31571e.getAndIncrement();
                reentrantReadWriteLock.writeLock().unlock();
                return hVar;
            }
            reentrantReadWriteLock.writeLock().unlock();
            p.g("SoLoader", "Failed to recover");
            throw unsatisfiedLinkError;
        } catch (Throwable th2) {
            f31569c.writeLock().unlock();
            throw th2;
        }
    }

    public static boolean D(UnsatisfiedLinkError unsatisfiedLinkError, z8.h hVar) {
        AbstractC6859b.h(hVar);
        try {
            boolean a10 = hVar.a(unsatisfiedLinkError, sSoSources);
            AbstractC6859b.g(null);
            return a10;
        } finally {
        }
    }

    public static void a(ArrayList arrayList, int i10) {
        C3109a c3109a = new C3109a(f31570d, i10);
        p.a("SoLoader", "Adding application source: " + c3109a.toString());
        arrayList.add(0, c3109a);
    }

    public static void b(Context context, ArrayList arrayList, boolean z10) {
        if ((f31578l & 8) != 0) {
            return;
        }
        arrayList.add(0, new C3111c(context, "lib-main", !z10));
    }

    public static void c(Context context, ArrayList arrayList) {
        C3112d c3112d = new C3112d(context);
        p.a("SoLoader", "validating/adding directApk source: " + c3112d.toString());
        if (c3112d.isValid()) {
            arrayList.add(0, c3112d);
        }
    }

    public static void d(ArrayList arrayList) {
        String str = SysUtil.k() ? "/system/lib64:/vendor/lib64" : "/system/lib:/vendor/lib";
        String str2 = System.getenv("LD_LIBRARY_PATH");
        if (str2 != null && !str2.equals("")) {
            str = str2 + ":" + str;
        }
        for (String str3 : new HashSet(Arrays.asList(str.split(":")))) {
            p.a("SoLoader", "adding system library source: " + str3);
            arrayList.add(new C3114f(new File(str3), 2));
        }
    }

    public static void e(Context context, ArrayList arrayList) {
        F f10 = new F();
        p.a("SoLoader", "adding systemLoadWrapper source: " + f10);
        arrayList.add(0, f10);
    }

    public static void f() {
        if (!r()) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
    }

    public static void g(String str, String str2, int i10, StrictMode.ThreadPolicy threadPolicy) {
        boolean z10;
        ReentrantReadWriteLock reentrantReadWriteLock = f31569c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (sSoSources == null) {
                p.b("SoLoader", "Could not load: " + str + " because SoLoader is not initialized");
                throw new UnsatisfiedLinkError("SoLoader not initialized, couldn't find DSO to load: " + str);
            }
            reentrantReadWriteLock.readLock().unlock();
            if (threadPolicy == null) {
                threadPolicy = StrictMode.allowThreadDiskReads();
                z10 = true;
            } else {
                z10 = false;
            }
            if (f31567a) {
                if (str2 != null) {
                    Api18TraceUtils.a("SoLoader.loadLibrary[", str2, "]");
                }
                Api18TraceUtils.a("SoLoader.loadLibrary[", str, "]");
            }
            try {
                reentrantReadWriteLock.readLock().lock();
                try {
                    try {
                        for (E e10 : sSoSources) {
                            if (x(e10, str, i10, threadPolicy)) {
                                if (z10) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                        }
                        throw B.b(str, f31570d, sSoSources);
                    } catch (IOException e11) {
                        C c10 = new C(str, e11.toString());
                        c10.initCause(e11);
                        throw c10;
                    }
                } finally {
                }
            } finally {
                if (f31567a) {
                    if (str2 != null) {
                        Api18TraceUtils.b();
                    }
                    Api18TraceUtils.b();
                }
                if (z10) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            }
        } finally {
        }
    }

    public static int h(Context context) {
        int i10 = f31579m;
        if (i10 != 0) {
            return i10;
        }
        if (context == null) {
            p.a("SoLoader", "context is null, fallback to THIRD_PARTY_APP appType");
            return 1;
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i11 = applicationInfo.flags;
        int i12 = (i11 & 1) != 0 ? (i11 & 128) != 0 ? 3 : 2 : 1;
        p.a("SoLoader", "ApplicationInfo.flags is: " + applicationInfo.flags + " appType is: " + i12);
        return i12;
    }

    public static int i() {
        int i10 = f31579m;
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2 || i10 == 3) {
            return 1;
        }
        throw new RuntimeException("Unsupported app type, we should not reach here");
    }

    public static void init(Context context, int i10) {
        k(context, i10, null);
    }

    public static synchronized z8.h j() {
        z8.h hVar;
        synchronized (SoLoader.class) {
            z8.i iVar = f31572f;
            hVar = iVar == null ? null : iVar.get();
        }
        return hVar;
    }

    public static void k(Context context, int i10, x xVar) {
        if (r()) {
            p.g("SoLoader", "SoLoader already initialized");
            return;
        }
        p.g("SoLoader", "Initializing SoLoader: " + i10);
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            boolean o10 = o(context);
            f31577k = o10;
            if (o10) {
                int h10 = h(context);
                f31579m = h10;
                if ((i10 & 128) == 0 && SysUtil.l(context, h10)) {
                    i10 |= 8;
                }
                p(context, xVar, i10);
                q(context, i10);
                p.f("SoLoader", "Init SoLoader delegate");
                AbstractC6803a.b(new u());
            } else {
                n();
                p.f("SoLoader", "Init System Loader delegate");
                AbstractC6803a.b(new C6805c());
            }
            p.g("SoLoader", "SoLoader initialized: " + i10);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th2;
        }
    }

    public static void l(Context context, l lVar) {
        synchronized (SoLoader.class) {
            f31580n = lVar;
        }
        init(context, 0);
    }

    public static void m(Context context, boolean z10) {
        try {
            k(context, z10 ? 1 : 0, null);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void n() {
        if (sSoSources != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f31569c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (sSoSources == null) {
                sSoSources = new E[0];
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th2) {
            f31569c.writeLock().unlock();
            throw th2;
        }
    }

    public static boolean o(Context context) {
        String str;
        if (f31580n != null) {
            return true;
        }
        Bundle bundle = null;
        try {
            str = context.getPackageName();
        } catch (Exception e10) {
            e = e10;
            str = null;
        }
        try {
            bundle = context.getPackageManager().getApplicationInfo(str, 128).metaData;
        } catch (Exception e11) {
            e = e11;
            p.h("SoLoader", "Unexpected issue with package manager (" + str + ")", e);
            return bundle == null ? true : true;
        }
        if (bundle == null && !bundle.getBoolean("com.facebook.soloader.enabled", true)) {
            return false;
        }
    }

    public static synchronized void p(Context context, x xVar, int i10) {
        synchronized (SoLoader.class) {
            if (context != null) {
                try {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        p.g("SoLoader", "context.getApplicationContext returned null, holding reference to original context.ApplicationSoSource fallbacks to: " + context.getApplicationInfo().nativeLibraryDir);
                    } else {
                        context = applicationContext;
                    }
                    f31570d = context;
                    f31572f = new z8.f(context, B(i10));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (xVar != null || f31568b == null) {
                if (xVar != null) {
                    f31568b = xVar;
                } else {
                    f31568b = new o(new y());
                }
            }
        }
    }

    public static void q(Context context, int i10) {
        ReentrantReadWriteLock.WriteLock writeLock;
        if (sSoSources != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f31569c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (sSoSources != null) {
                writeLock = reentrantReadWriteLock.writeLock();
            } else {
                f31578l = i10;
                ArrayList arrayList = new ArrayList();
                boolean z10 = true;
                boolean z11 = (i10 & 512) != 0;
                boolean z12 = (i10 & 1024) != 0;
                if (z11) {
                    e(context, arrayList);
                } else if (z12) {
                    d(arrayList);
                    arrayList.add(0, new C3113e(Constants.SENSITIVITY_BASE));
                } else {
                    d(arrayList);
                    if (context != null) {
                        if ((i10 & 1) != 0) {
                            a(arrayList, i());
                            p.a("SoLoader", "Adding exo package source: lib-main");
                            arrayList.add(0, new k(context, "lib-main"));
                        } else {
                            if (SysUtil.l(context, f31579m)) {
                                c(context, arrayList);
                            }
                            a(arrayList, i());
                            if ((i10 & 4096) == 0) {
                                z10 = false;
                            }
                            b(context, arrayList, z10);
                        }
                    }
                }
                E[] eArr = (E[]) arrayList.toArray(new E[arrayList.size()]);
                int A10 = A();
                int length = eArr.length;
                while (true) {
                    int i11 = length - 1;
                    if (length <= 0) {
                        break;
                    }
                    p.d("SoLoader", "Preparing SO source: " + eArr[i11]);
                    boolean z13 = f31567a;
                    if (z13) {
                        Api18TraceUtils.a("SoLoader", "_", eArr[i11].getClass().getSimpleName());
                    }
                    eArr[i11].e(A10);
                    if (z13) {
                        Api18TraceUtils.b();
                    }
                    length = i11;
                }
                sSoSources = eArr;
                f31571e.getAndIncrement();
                p.d("SoLoader", "init finish: " + sSoSources.length + " SO sources prepared");
                writeLock = f31569c.writeLock();
            }
            writeLock.unlock();
        } catch (Throwable th2) {
            f31569c.writeLock().unlock();
            throw th2;
        }
    }

    public static boolean r() {
        if (sSoSources != null) {
            return true;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f31569c;
        reentrantReadWriteLock.readLock().lock();
        try {
            boolean z10 = sSoSources != null;
            reentrantReadWriteLock.readLock().unlock();
            return z10;
        } catch (Throwable th2) {
            f31569c.readLock().unlock();
            throw th2;
        }
    }

    public static void s(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        AbstractC6859b.d(str, i10);
        try {
            AbstractC6859b.c(null, w(str, null, null, i10 | 1, threadPolicy));
        } finally {
        }
    }

    public static boolean t(String str) {
        return f31577k ? u(str, 0) : AbstractC6803a.d(str);
    }

    public static boolean u(String str, int i10) {
        Boolean z10 = z(str);
        if (z10 != null) {
            return z10.booleanValue();
        }
        if (!f31577k) {
            return AbstractC6803a.d(str);
        }
        if (f31579m != 2) {
        }
        return y(str, i10);
    }

    public static boolean v(String str, String str2, String str3, int i10, StrictMode.ThreadPolicy threadPolicy) {
        z8.h hVar = null;
        while (true) {
            try {
                return w(str, str2, str3, i10, threadPolicy);
            } catch (UnsatisfiedLinkError e10) {
                hVar = C(str, e10, hVar);
            }
        }
    }

    public static boolean w(String str, String str2, String str3, int i10, StrictMode.ThreadPolicy threadPolicy) {
        boolean z10;
        Object obj;
        Object obj2;
        if (!TextUtils.isEmpty(str2) && f31575i.contains(str2)) {
            return false;
        }
        Set set = f31573g;
        if (set.contains(str) && str3 == null) {
            return false;
        }
        synchronized (SoLoader.class) {
            try {
                if (!set.contains(str)) {
                    z10 = false;
                } else {
                    if (str3 == null) {
                        return false;
                    }
                    z10 = true;
                }
                Map map = f31574h;
                if (map.containsKey(str)) {
                    obj = map.get(str);
                } else {
                    Object obj3 = new Object();
                    map.put(str, obj3);
                    obj = obj3;
                }
                Map map2 = f31576j;
                if (map2.containsKey(str2)) {
                    obj2 = map2.get(str2);
                } else {
                    Object obj4 = new Object();
                    map2.put(str2, obj4);
                    obj2 = obj4;
                }
                ReentrantReadWriteLock reentrantReadWriteLock = f31569c;
                reentrantReadWriteLock.readLock().lock();
                try {
                    synchronized (obj) {
                        if (!z10) {
                            if (set.contains(str)) {
                                if (str3 == null) {
                                    reentrantReadWriteLock.readLock().unlock();
                                    return false;
                                }
                                z10 = true;
                            }
                            if (!z10) {
                                try {
                                    p.a("SoLoader", "About to load: " + str);
                                    g(str, str2, i10, threadPolicy);
                                    p.a("SoLoader", "Loaded: " + str);
                                    set.add(str);
                                } catch (UnsatisfiedLinkError e10) {
                                    String message = e10.getMessage();
                                    if (message == null || !message.contains("unexpected e_machine:")) {
                                        throw e10;
                                    }
                                    throw new a(e10, message.substring(message.lastIndexOf("unexpected e_machine:")));
                                }
                            }
                        }
                        synchronized (obj2) {
                            if ((i10 & 16) == 0 && str3 != null) {
                                try {
                                    if (TextUtils.isEmpty(str2) || !f31575i.contains(str2)) {
                                        boolean z11 = f31567a;
                                        if (z11 && f31580n == null) {
                                            Api18TraceUtils.a("MergedSoMapping.invokeJniOnload[", str2, "]");
                                        }
                                        try {
                                            p.a("SoLoader", "About to invoke JNI_OnLoad for merged library " + str2 + ", which was merged into " + str);
                                            l lVar = f31580n;
                                            if (lVar != null) {
                                                lVar.invokeJniOnload(str2);
                                            } else {
                                                r.a(str2);
                                            }
                                            f31575i.add(str2);
                                            if (z11 && f31580n == null) {
                                                Api18TraceUtils.b();
                                            }
                                        } catch (UnsatisfiedLinkError e11) {
                                            throw new RuntimeException("Failed to call JNI_OnLoad from '" + str2 + "', which has been merged into '" + str + "'.  See comment for details.", e11);
                                        }
                                    }
                                } catch (Throwable th2) {
                                    if (f31567a && f31580n == null) {
                                        Api18TraceUtils.b();
                                    }
                                    throw th2;
                                } finally {
                                }
                            }
                        }
                        reentrantReadWriteLock.readLock().unlock();
                        return !z10;
                    }
                } catch (Throwable th3) {
                    f31569c.readLock().unlock();
                    throw th3;
                }
            } finally {
            }
        }
    }

    public static boolean x(E e10, String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        AbstractC6859b.l(e10);
        try {
            boolean z10 = e10.d(str, i10, threadPolicy) != 0;
            AbstractC6859b.k(null);
            return z10;
        } finally {
        }
    }

    public static boolean y(String str, int i10) {
        l lVar = f31580n;
        String mapLibName = lVar != null ? lVar.mapLibName(str) : r.b(str);
        String str2 = mapLibName != null ? mapLibName : str;
        AbstractC6859b.f(str, mapLibName, i10);
        try {
            boolean v10 = v(System.mapLibraryName(str2), str, mapLibName, i10, null);
            AbstractC6859b.e(null, v10);
            return v10;
        } finally {
        }
    }

    public static Boolean z(String str) {
        Boolean valueOf;
        if (sSoSources != null) {
            return null;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f31569c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (sSoSources == null) {
                if (!"http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    synchronized (SoLoader.class) {
                        try {
                            boolean contains = f31573g.contains(str);
                            boolean z10 = !contains;
                            if (!contains) {
                                System.loadLibrary(str);
                            }
                            valueOf = Boolean.valueOf(z10);
                        } finally {
                        }
                    }
                    reentrantReadWriteLock.readLock().unlock();
                    return valueOf;
                }
                f();
            }
            reentrantReadWriteLock.readLock().unlock();
            return null;
        } catch (Throwable th2) {
            f31569c.readLock().unlock();
            throw th2;
        }
    }
}
