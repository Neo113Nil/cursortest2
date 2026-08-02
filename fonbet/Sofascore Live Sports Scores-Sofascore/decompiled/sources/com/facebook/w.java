package com.facebook;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.appsflyer.sdk_base.referrer.Payload;
import defpackage.a70;
import defpackage.cw3;
import defpackage.de0;
import defpackage.ld;
import defpackage.md;
import defpackage.mx9;
import defpackage.ph0;
import defpackage.x9h;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class w {
    public static final w a = new w();
    public static final HashSet b = x9h.c(i0.b);
    public static Executor c;
    public static volatile String d;
    public static volatile String e;
    public static String f;
    public static String g;
    public static volatile String h;
    public static volatile Boolean i;
    public static Context j;
    public static int k;
    public static final ReentrantLock l;
    public static final String m;
    public static boolean n;
    public static boolean o;
    public static boolean p;
    public static final AtomicBoolean q;
    public static volatile String r;
    public static volatile String s;
    public static final t t;
    public static boolean u;

    static {
        new AtomicLong(65536L);
        k = 64206;
        l = new ReentrantLock();
        m = "v16.0";
        q = new AtomicBoolean(false);
        r = "instagram.com";
        s = "facebook.com";
        t = new t(1);
    }

    public static final Context a() {
        com.facebook.internal.h.k();
        Context context = j;
        if (context != null) {
            return context;
        }
        Intrinsics.i("applicationContext");
        throw null;
    }

    public static final String b() {
        com.facebook.internal.h.k();
        String str = d;
        if (str != null) {
            return str;
        }
        t.a("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
        return null;
    }

    public static final Executor c() {
        ReentrantLock reentrantLock = l;
        reentrantLock.lock();
        try {
            if (c == null) {
                c = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            Unit unit = Unit.a;
            reentrantLock.unlock();
            Executor executor = c;
            if (executor != null) {
                return executor;
            }
            a70.r("Required value was null.");
            return null;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String d() {
        String str = m;
        String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{str}, 1));
        return str;
    }

    public static final String e() {
        Date date = AccessToken.l;
        AccessToken p2 = com.facebook.appevents.g.p();
        String str = p2 != null ? p2.k : null;
        String str2 = s;
        if (str != null) {
            if (str.equals("gaming")) {
                return kotlin.text.c.r(str2, "facebook.com", "fb.gg", false);
            }
            if (str.equals(Payload.SOURCE_INSTAGRAM)) {
                return kotlin.text.c.r(str2, "facebook.com", "instagram.com", false);
            }
        }
        return str2;
    }

    public static final boolean f(Context context) {
        com.facebook.internal.h.k();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static final synchronized boolean g() {
        boolean z;
        synchronized (w.class) {
            z = u;
        }
        return z;
    }

    public static final void h(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            applicationInfo.getClass();
            if (applicationInfo.metaData == null) {
                return;
            }
            if (d == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale locale = Locale.ROOT;
                    locale.getClass();
                    String lowerCase = str.toLowerCase(locale);
                    lowerCase.getClass();
                    if (kotlin.text.c.v(lowerCase, "fb", false)) {
                        d = str.substring(2);
                    } else {
                        d = str;
                    }
                } else if (obj instanceof Number) {
                    t.a("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                    return;
                }
            }
            f = applicationInfo.metaData.getString("com.facebook.sdk.RedirectURI");
            g = applicationInfo.metaData.getString("com.facebook.sdk.IntentUriPackageTarget");
            if (e == null) {
                e = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (h == null) {
                h = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (k == 64206) {
                k = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (i == null) {
                i = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static final synchronized void i(Context context) {
        synchronized (w.class) {
            context.getClass();
            j(context);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007b A[Catch: all -> 0x0024, TryCatch #2 {, blocks: (B:4:0x0003, B:11:0x0011, B:13:0x0019, B:14:0x0020, B:16:0x0027, B:18:0x003d, B:20:0x0044, B:22:0x004a, B:24:0x004e, B:26:0x0054, B:31:0x007b, B:32:0x007d, B:34:0x0081, B:36:0x0085, B:38:0x008b, B:40:0x008f, B:41:0x00a0, B:43:0x00a8, B:45:0x00ac, B:51:0x00c1, B:52:0x00c5, B:53:0x00ca, B:54:0x00cb, B:56:0x00d7, B:59:0x0146, B:60:0x014b, B:61:0x0097, B:62:0x009c, B:63:0x009d, B:64:0x014c, B:65:0x0151, B:70:0x0075, B:71:0x0152, B:72:0x0159, B:73:0x015a, B:74:0x0161, B:75:0x0162, B:76:0x0167, B:48:0x00b7, B:67:0x0068), top: B:3:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081 A[Catch: all -> 0x0024, TryCatch #2 {, blocks: (B:4:0x0003, B:11:0x0011, B:13:0x0019, B:14:0x0020, B:16:0x0027, B:18:0x003d, B:20:0x0044, B:22:0x004a, B:24:0x004e, B:26:0x0054, B:31:0x007b, B:32:0x007d, B:34:0x0081, B:36:0x0085, B:38:0x008b, B:40:0x008f, B:41:0x00a0, B:43:0x00a8, B:45:0x00ac, B:51:0x00c1, B:52:0x00c5, B:53:0x00ca, B:54:0x00cb, B:56:0x00d7, B:59:0x0146, B:60:0x014b, B:61:0x0097, B:62:0x009c, B:63:0x009d, B:64:0x014c, B:65:0x0151, B:70:0x0075, B:71:0x0152, B:72:0x0159, B:73:0x015a, B:74:0x0161, B:75:0x0162, B:76:0x0167, B:48:0x00b7, B:67:0x0068), top: B:3:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014c A[Catch: all -> 0x0024, TryCatch #2 {, blocks: (B:4:0x0003, B:11:0x0011, B:13:0x0019, B:14:0x0020, B:16:0x0027, B:18:0x003d, B:20:0x0044, B:22:0x004a, B:24:0x004e, B:26:0x0054, B:31:0x007b, B:32:0x007d, B:34:0x0081, B:36:0x0085, B:38:0x008b, B:40:0x008f, B:41:0x00a0, B:43:0x00a8, B:45:0x00ac, B:51:0x00c1, B:52:0x00c5, B:53:0x00ca, B:54:0x00cb, B:56:0x00d7, B:59:0x0146, B:60:0x014b, B:61:0x0097, B:62:0x009c, B:63:0x009d, B:64:0x014c, B:65:0x0151, B:70:0x0075, B:71:0x0152, B:72:0x0159, B:73:0x015a, B:74:0x0161, B:75:0x0162, B:76:0x0167, B:48:0x00b7, B:67:0x0068), top: B:3:0x0003, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final synchronized void j(Context context) {
        boolean a2;
        Context context2;
        synchronized (w.class) {
            context.getClass();
            if (q.get()) {
                return;
            }
            int i2 = 1;
            try {
                int i3 = FacebookActivity.i;
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1);
                }
            } catch (PackageManager.NameNotFoundException | ClassNotFoundException unused) {
            }
            context.checkCallingOrSelfPermission("android.permission.INTERNET");
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            j = applicationContext;
            com.facebook.appevents.g.o(context);
            Context context3 = j;
            if (context3 == null) {
                Intrinsics.i("applicationContext");
                throw null;
            }
            h(context3);
            String str = d;
            if (str == null || str.length() == 0) {
                throw new q("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
            }
            String str2 = h;
            if (str2 == null || str2.length() == 0) {
                throw new q("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
            }
            q.set(true);
            k0 k0Var = k0.a;
            int i4 = 0;
            if (!cw3.a.contains(k0.class)) {
                try {
                    k0.a.e();
                    a2 = k0.d.a();
                } catch (Throwable th) {
                    cw3.a(k0.class, th);
                }
                if (a2) {
                    u = true;
                }
                context2 = j;
                if (context2 != null) {
                    Intrinsics.i("applicationContext");
                    throw null;
                }
                if ((context2 instanceof Application) && k0.c()) {
                    Context context4 = j;
                    if (context4 == null) {
                        Intrinsics.i("applicationContext");
                        throw null;
                    }
                    md.c((Application) context4, d);
                } else {
                    mx9.A();
                }
                de0 n2 = de0.c.n();
                if (n2 != null) {
                    Context context5 = j;
                    if (context5 == null) {
                        Intrinsics.i("applicationContext");
                        throw null;
                    }
                    Application application = (Application) context5;
                    if (!cw3.a.contains(n2)) {
                        try {
                            application.registerActivityLifecycleCallbacks(new ld(i2));
                        } catch (Throwable th2) {
                            cw3.a(n2, th2);
                        }
                    }
                }
                com.facebook.internal.x.d();
                com.facebook.internal.d0.m();
                com.facebook.internal.d dVar = com.facebook.internal.d.c;
                Context context6 = j;
                if (context6 == null) {
                    Intrinsics.i("applicationContext");
                    throw null;
                }
                com.facebook.internal.k0.r(context6);
                final u uVar = new u(i4);
                final com.facebook.internal.t tVar = new com.facebook.internal.t();
                tVar.c = new CountDownLatch(1);
                c().execute(new FutureTask(new Callable() { // from class: com.facebook.internal.z
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        com.facebook.u uVar2 = uVar;
                        t tVar2 = t.this;
                        CountDownLatch countDownLatch = (CountDownLatch) tVar2.c;
                        try {
                            tVar2.b = uVar2.call();
                        } finally {
                            if (countDownLatch != null) {
                                countDownLatch.countDown();
                            }
                        }
                    }
                }));
                com.facebook.internal.q.a(new t(2), com.facebook.internal.o.Instrument);
                com.facebook.internal.q.a(new t(3), com.facebook.internal.o.AppEvents);
                com.facebook.internal.q.a(new t(4), com.facebook.internal.o.ChromeCustomTabsPrefetching);
                com.facebook.internal.q.a(new t(5), com.facebook.internal.o.IgnoreAppSwitchToLoggedOut);
                com.facebook.internal.q.a(new t(6), com.facebook.internal.o.BypassAppSwitch);
                c().execute(new FutureTask(new u(i2)));
                return;
            }
            a2 = false;
            if (a2) {
            }
            context2 = j;
            if (context2 != null) {
            }
        }
    }

    public static final void k() {
        k0 k0Var = k0.a;
        if (cw3.a.contains(k0.class)) {
            return;
        }
        try {
            j0 j0Var = k0.e;
            j0Var.c = Boolean.FALSE;
            j0Var.d = System.currentTimeMillis();
            if (k0.b.get()) {
                k0Var.m(j0Var);
            } else {
                k0Var.e();
            }
        } catch (Throwable th) {
            cw3.a(k0.class, th);
        }
    }

    public static final void l(String[] strArr) {
        if (cw3.a.contains(w.class)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data_processing_options", new JSONArray((Collection) ph0.X(strArr)));
            jSONObject.put("data_processing_options_country", 0);
            jSONObject.put("data_processing_options_state", 0);
            Context context = j;
            if (context != null) {
                context.getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).edit().putString("data_processing_options", jSONObject.toString()).apply();
            } else {
                Intrinsics.i("applicationContext");
                throw null;
            }
        } catch (JSONException unused) {
        } catch (Throwable th) {
            cw3.a(w.class, th);
        }
    }
}
