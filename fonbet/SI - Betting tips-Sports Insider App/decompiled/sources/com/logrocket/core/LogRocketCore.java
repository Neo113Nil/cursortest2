package com.logrocket.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import android.view.WindowManager;
import androidx.annotation.Keep;
import androidx.appcompat.app.v0;
import androidx.appcompat.widget.c1;
import com.sports.insider.MyApp;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.impl.C0122e9;
import j$.util.Map;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import wg.k0;
import wg.l0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class LogRocketCore extends g {
    public static final long Y;
    public static final long Z;

    /* renamed from: a0, reason: collision with root package name */
    public static LogRocketCore f6381a0;
    public final AtomicBoolean A;
    public final File B;
    public final ArrayBlockingQueue C;
    public final Object D;
    public final ArrayList E;
    public final e F;
    public final HashMap G;
    public final AtomicLong H;
    public final Integer I;
    public final AtomicBoolean J;
    public final androidx.appcompat.widget.a0 K;
    public final ScheduledExecutorService L;
    public final AtomicInteger M;
    public f0 N;
    public ThreadPoolExecutor O;
    public aa.g P;
    public ScheduledFuture Q;
    public String R;
    public final ConcurrentHashMap.KeySetView S;
    public final b T;
    public long U;
    public final Object V;
    public ArrayList W;
    public final int X;

    /* renamed from: e, reason: collision with root package name */
    public final ba.d f6382e;

    /* renamed from: f, reason: collision with root package name */
    public final f f6383f;

    /* renamed from: g, reason: collision with root package name */
    public final y9.m f6384g;

    /* renamed from: h, reason: collision with root package name */
    public final aa.g f6385h;

    /* renamed from: i, reason: collision with root package name */
    public final x f6386i;
    public final v9.d j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f6387k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f6388l;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.appcompat.widget.a0 f6389m;

    /* renamed from: n, reason: collision with root package name */
    public final aa.g f6390n;

    /* renamed from: o, reason: collision with root package name */
    public final x9.b f6391o;

    /* renamed from: p, reason: collision with root package name */
    public final x9.e f6392p;
    public final x9.d q;

    /* renamed from: r, reason: collision with root package name */
    public final i0 f6393r;

    /* renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f6394s;

    /* renamed from: t, reason: collision with root package name */
    public final MyApp f6395t;

    /* renamed from: u, reason: collision with root package name */
    public final Context f6396u;

    /* renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f6397v;

    /* renamed from: w, reason: collision with root package name */
    public final AtomicLong f6398w;

    /* renamed from: x, reason: collision with root package name */
    public final com.google.firebase.messaging.x f6399x;

    /* renamed from: y, reason: collision with root package name */
    public final AtomicBoolean f6400y;

    /* renamed from: z, reason: collision with root package name */
    public final AtomicInteger f6401z;

    static {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Y = timeUnit.convert(5L, TimeUnit.MINUTES);
        Z = timeUnit.convert(5L, TimeUnit.SECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0253 A[EXC_TOP_SPLITTER, LOOP:1: B:41:0x0253->B:45:0x0260, LOOP_START, PHI: r7
      0x0253: PHI (r7v1 int) = (r7v0 int), (r7v2 int) binds: [B:37:0x0251, B:45:0x0260] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LogRocketCore(MyApp myApp, com.google.firebase.messaging.x xVar, f fVar, Context context, File file) {
        int i5;
        Map map;
        HashMap hashMap;
        JSONArray jSONArray;
        new ConcurrentHashMap();
        this.f6463b = new HashMap();
        this.f6464c = new ArrayList();
        this.f6465d = 0;
        ba.d dVar = new ba.d("LogRocketCore");
        this.f6382e = dVar;
        this.f6387k = new AtomicBoolean();
        this.f6388l = new HashMap();
        this.f6394s = new AtomicBoolean();
        this.f6397v = new AtomicBoolean();
        this.f6398w = new AtomicLong(System.currentTimeMillis());
        this.f6400y = new AtomicBoolean();
        this.f6401z = new AtomicInteger(1);
        this.A = new AtomicBoolean();
        this.C = new ArrayBlockingQueue(100);
        this.D = new Object();
        this.E = new ArrayList();
        this.G = new HashMap();
        this.H = new AtomicLong();
        this.J = new AtomicBoolean();
        this.L = aa.j.a("lr-buffer");
        this.M = new AtomicInteger();
        this.O = null;
        this.P = null;
        this.R = "";
        this.S = ConcurrentHashMap.newKeySet();
        this.U = Y;
        this.V = new Object();
        this.W = new ArrayList();
        h0.f6587b = null;
        this.f6395t = myApp;
        this.f6396u = context;
        this.f6383f = fVar;
        this.f6399x = xVar;
        f0 f0Var = (f0) xVar.f6182a;
        this.N = f0Var;
        this.B = file;
        JSONArray jSONArray2 = f0Var.f6452h;
        ArrayList arrayList = new ArrayList();
        if (jSONArray2 != null) {
            for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
                try {
                    arrayList.add(Integer.valueOf(jSONArray2.getInt(i10)));
                } catch (JSONException unused) {
                }
            }
        }
        this.f6464c = arrayList;
        JSONObject jSONObject = this.N.f6451g;
        HashMap hashMap2 = new HashMap();
        if (jSONObject != null) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap2.put(next, Boolean.valueOf(jSONObject.getBoolean(next)));
                }
            } catch (JSONException unused2) {
            }
        }
        this.f6463b = hashMap2;
        String str = this.N.f6453i;
        if (str != null) {
            i5 = 2;
            switch (str) {
                case "FULL":
                    i5 = 3;
                    break;
                case "NONE":
                    i5 = 1;
                    break;
            }
            this.f6465d = i5;
            c();
            v9.d dVar2 = new v9.d(this, this.N.f6450f, fVar.f6444v);
            this.j = dVar2;
            j();
            this.I = Integer.valueOf(fVar.f6429e);
            if (e.f6419e == null) {
                e.f6419e = new e();
            }
            e eVar = e.f6419e;
            HashMap hashMap3 = new HashMap();
            map = (Map) eVar.f6422c;
            if (map != null) {
                hashMap = null;
            } else {
                for (Map.Entry entry : map.entrySet()) {
                    Integer num = (Integer) entry.getKey();
                    try {
                        Typeface b10 = f0.l.b(context, num.intValue());
                        if (b10 != null) {
                            hashMap3.put(Integer.valueOf(b10.hashCode()), (Set) entry.getValue());
                        }
                    } catch (Exception unused3) {
                        dVar.d(String.format("Did not find resource 0x%X", num));
                    }
                }
                hashMap = hashMap3;
            }
            this.f6386i = new x(this, this, fVar, dVar2, hashMap);
            this.f6462a = new d(this, fVar.f6443u);
            this.T = new b(this);
            this.f6393r = new i0(fVar.f6425a);
            y9.m mVar = new y9.m(xVar, this, this, new androidx.recyclerview.widget.u(this, fVar), fVar.j);
            this.f6384g = mVar;
            this.f6385h = new aa.g(aa.j.a("lr-uploader"), mVar, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
            androidx.appcompat.widget.a0 a0Var = new androidx.appcompat.widget.a0(this, this);
            this.f6389m = a0Var;
            this.f6390n = new aa.g(aa.j.a("lr-memory"), a0Var, 500);
            this.f6391o = new x9.b(this);
            this.f6392p = new x9.e(this);
            this.q = new x9.d(this);
            this.F = new e(context, this, mVar);
            this.X = 1;
            jSONArray = this.N.f6454k;
            HashSet hashSet = new HashSet();
            if (jSONArray != null) {
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    try {
                        hashSet.add(jSONArray.getString(i11));
                    } catch (JSONException unused4) {
                    }
                }
            }
            f0 f0Var2 = this.N;
            this.K = new androidx.appcompat.widget.a0(hashSet, f0Var2.f6455l, f0Var2.f6456m, f0Var2.f6457n);
        }
        i5 = 0;
        this.f6465d = i5;
        c();
        v9.d dVar22 = new v9.d(this, this.N.f6450f, fVar.f6444v);
        this.j = dVar22;
        j();
        this.I = Integer.valueOf(fVar.f6429e);
        if (e.f6419e == null) {
        }
        e eVar2 = e.f6419e;
        HashMap hashMap32 = new HashMap();
        map = (Map) eVar2.f6422c;
        if (map != null) {
        }
        this.f6386i = new x(this, this, fVar, dVar22, hashMap);
        this.f6462a = new d(this, fVar.f6443u);
        this.T = new b(this);
        this.f6393r = new i0(fVar.f6425a);
        y9.m mVar2 = new y9.m(xVar, this, this, new androidx.recyclerview.widget.u(this, fVar), fVar.j);
        this.f6384g = mVar2;
        this.f6385h = new aa.g(aa.j.a("lr-uploader"), mVar2, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
        androidx.appcompat.widget.a0 a0Var2 = new androidx.appcompat.widget.a0(this, this);
        this.f6389m = a0Var2;
        this.f6390n = new aa.g(aa.j.a("lr-memory"), a0Var2, 500);
        this.f6391o = new x9.b(this);
        this.f6392p = new x9.e(this);
        this.q = new x9.d(this);
        this.F = new e(context, this, mVar2);
        this.X = 1;
        jSONArray = this.N.f6454k;
        HashSet hashSet2 = new HashSet();
        if (jSONArray != null) {
        }
        f0 f0Var22 = this.N;
        this.K = new androidx.appcompat.widget.a0(hashSet2, f0Var22.f6455l, f0Var22.f6456m, f0Var22.f6457n);
    }

    public static void d(Context context, String str, boolean z5, boolean z7) {
        Intent intent = new Intent();
        intent.setAction("LogRocketSDK.Error");
        LogRocketCore logRocketCore = f6381a0;
        if (logRocketCore != null) {
            intent.setPackage(logRocketCore.f6396u.getPackageName());
        }
        intent.putExtra("errorMessage", str);
        intent.putExtra("shouldDisableAndFreeMemory", z5);
        intent.putExtra("shouldWarnAboutReduxSize", z7);
        context.sendBroadcast(intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b0 A[LOOP:1: B:77:0x01aa->B:79:0x01b0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d7 A[LOOP:2: B:82:0x01d1->B:84:0x01d7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0226 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(MyApp myApp, Context context, f fVar) {
        y9.c fVar2;
        int i5;
        aa.g gVar;
        aa.g gVar2;
        aa.g gVar3;
        y9.m mVar;
        Iterator it;
        Iterator it2;
        i iVar;
        WeakReference weakReference;
        LogRocketCore logRocketCore = f6381a0;
        if (logRocketCore != null) {
            String str = logRocketCore.f6383f.f6425a;
            int i10 = logRocketCore.X;
            if (str == null || !str.equals(fVar.f6425a)) {
                if (i10 == 1 || f6381a0.f6401z.get() != 1) {
                    throw new z("LogRocket has already been configured.");
                }
                String str2 = "Attempted to initialize LogRocket again with new appID: " + fVar.f6425a + ". Continuing recording with initial appID: " + f6381a0.f6383f.f6425a;
                d(context, str2, true, false);
                throw new b0(str2);
            }
            if (i10 == 1 || f6381a0.f6401z.getAndIncrement() != 1) {
                throw new c0("LogRocket has already been configured for this app.");
            }
            ArrayList arrayList = fVar.f6427c;
            if (arrayList.size() > 1) {
                HashSet hashSet = new HashSet(f6381a0.f6383f.f6427c);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (!hashSet.contains(next)) {
                        f fVar3 = f6381a0.f6383f;
                        if (next != null) {
                            fVar3.f6427c.add(next);
                        } else {
                            fVar3.getClass();
                        }
                    }
                }
                return;
            }
            return;
        }
        if (fVar.f6425a == null) {
            throw new z("appID has not been configured.");
        }
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 25 || i11 > 36) {
            throw new g0(d9.e.f(i11, "API version ", " is not supported, recording is disabled. API versions 25 through 36 are supported."));
        }
        if (context.checkPermission("android.permission.INTERNET", myPid, myUid) != 0) {
            throw new g0("Internet access denied, recording is disabled.");
        }
        if (context.checkPermission("android.permission.ACCESS_NETWORK_STATE", myPid, myUid) != 0) {
            throw new g0("Unable to access network state, recording is disabled.");
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            throw new g0("Failed to get window manager, recording is disabled.");
        }
        aa.b.o(windowManager);
        File file = new File(context.getCacheDir(), "logrocket");
        ba.d dVar = new ba.d("persistence");
        try {
            fVar2 = com.google.android.play.core.appupdate.b.a(file);
        } catch (Throwable th2) {
            dVar.e("Failed to initialize Disk adapter", th2);
            fVar2 = new y9.f();
        }
        y9.i iVar2 = new y9.i(fVar.f6425a, fVar2);
        try {
            ArrayList b10 = iVar2.b();
            f0 a7 = iVar2.a(b10);
            if (!b10.isEmpty()) {
                y9.b bVar = (y9.b) b10.get(b10.size() - 1);
                if (bVar.f25740a.f25735a.b(a7)) {
                    i5 = bVar.f25740a.f25736b + 1;
                    androidx.appcompat.widget.a0 a0Var = new androidx.appcompat.widget.a0(a7, iVar2.f25753b, i5);
                    l4.e eVar = new l4.e(b10);
                    com.google.firebase.messaging.x xVar = new com.google.firebase.messaging.x();
                    xVar.f6185d = new ba.d("persistence");
                    xVar.f6182a = a7;
                    xVar.f6184c = eVar;
                    xVar.f6183b = a0Var;
                    LogRocketCore logRocketCore2 = new LogRocketCore(myApp, xVar, fVar, context, file);
                    logRocketCore2.f("Core instance initialized");
                    f6381a0 = logRocketCore2;
                    logRocketCore2.f6390n.c();
                    gVar = logRocketCore2.f6391o.f25422f;
                    if (gVar != null) {
                        gVar.c();
                    }
                    gVar2 = logRocketCore2.f6392p.f25441d;
                    if (gVar2 != null) {
                        gVar2.c();
                    }
                    x9.d dVar2 = logRocketCore2.q;
                    dVar2.f25430c = false;
                    gVar3 = dVar2.f25429b;
                    if (gVar3 != null) {
                        gVar3.c();
                    }
                    mVar = logRocketCore2.f6384g;
                    f0 f0Var = logRocketCore2.N;
                    if (mVar.f25767h.compareAndSet(false, true)) {
                        aa.j.a("logrocket-relay").execute(new io.sentry.android.replay.util.c(21, mVar, f0Var));
                    }
                    logRocketCore2.f6383f.getClass();
                    logRocketCore2.f6385h.c();
                    i iVar3 = ApplicationInitProvider.f6379c;
                    iVar3.getClass();
                    it = new HashSet(iVar3.f6588a).iterator();
                    while (it.hasNext()) {
                        Activity activity = (Activity) it.next();
                        logRocketCore2.f6462a.onActivityStarted(activity);
                        logRocketCore2.T.onActivityStarted(activity);
                    }
                    i iVar4 = ApplicationInitProvider.f6379c;
                    iVar4.getClass();
                    it2 = new HashSet(iVar4.f6589b).iterator();
                    while (it2.hasNext()) {
                        Activity activity2 = (Activity) it2.next();
                        logRocketCore2.f6462a.onActivityResumed(activity2);
                        logRocketCore2.T.onActivityResumed(activity2);
                    }
                    logRocketCore2.f6395t.registerActivityLifecycleCallbacks(logRocketCore2.f6462a);
                    logRocketCore2.f6395t.registerActivityLifecycleCallbacks(logRocketCore2.T);
                    e eVar2 = logRocketCore2.F;
                    ConnectivityManager connectivityManager = (ConnectivityManager) ((Context) eVar2.f6420a).getSystemService("connectivity");
                    NetworkRequest build = new NetworkRequest.Builder().build();
                    q qVar = new q(new androidx.credentials.playservices.controllers.CreateRestoreCredential.a(12, eVar2));
                    eVar2.f6423d = qVar;
                    connectivityManager.registerNetworkCallback(build, qVar);
                    logRocketCore2.o();
                    iVar = ApplicationInitProvider.f6379c;
                    synchronized (iVar.f6594g) {
                        try {
                            if (iVar.f6592e != null && (weakReference = iVar.f6593f) != null && weakReference.get() != null) {
                                eh.b bVar2 = iVar.f6592e;
                                String d10 = logRocketCore2.f6462a.d((Activity) iVar.f6593f.get());
                                bVar2.d();
                                eh.f.r((eh.f) bVar2.f6816b, d10);
                                logRocketCore2.a(24, bVar2);
                                iVar.f6592e = null;
                                iVar.f6593f.clear();
                            }
                        } finally {
                        }
                    }
                    logRocketCore2.f6383f.getClass();
                    x xVar2 = logRocketCore2.f6386i;
                    if (xVar2.j.compareAndSet(false, true)) {
                        xVar2.c(false);
                    }
                    PostInitializationTasks.drain(logRocketCore2);
                    return;
                }
            }
            i5 = 0;
            androidx.appcompat.widget.a0 a0Var2 = new androidx.appcompat.widget.a0(a7, iVar2.f25753b, i5);
            l4.e eVar3 = new l4.e(b10);
            com.google.firebase.messaging.x xVar3 = new com.google.firebase.messaging.x();
            xVar3.f6185d = new ba.d("persistence");
            xVar3.f6182a = a7;
            xVar3.f6184c = eVar3;
            xVar3.f6183b = a0Var2;
            LogRocketCore logRocketCore22 = new LogRocketCore(myApp, xVar3, fVar, context, file);
            logRocketCore22.f("Core instance initialized");
            f6381a0 = logRocketCore22;
            logRocketCore22.f6390n.c();
            gVar = logRocketCore22.f6391o.f25422f;
            if (gVar != null) {
            }
            gVar2 = logRocketCore22.f6392p.f25441d;
            if (gVar2 != null) {
            }
            x9.d dVar22 = logRocketCore22.q;
            dVar22.f25430c = false;
            gVar3 = dVar22.f25429b;
            if (gVar3 != null) {
            }
            mVar = logRocketCore22.f6384g;
            f0 f0Var2 = logRocketCore22.N;
            if (mVar.f25767h.compareAndSet(false, true)) {
            }
            logRocketCore22.f6383f.getClass();
            logRocketCore22.f6385h.c();
            i iVar32 = ApplicationInitProvider.f6379c;
            iVar32.getClass();
            it = new HashSet(iVar32.f6588a).iterator();
            while (it.hasNext()) {
            }
            i iVar42 = ApplicationInitProvider.f6379c;
            iVar42.getClass();
            it2 = new HashSet(iVar42.f6589b).iterator();
            while (it2.hasNext()) {
            }
            logRocketCore22.f6395t.registerActivityLifecycleCallbacks(logRocketCore22.f6462a);
            logRocketCore22.f6395t.registerActivityLifecycleCallbacks(logRocketCore22.T);
            e eVar22 = logRocketCore22.F;
            ConnectivityManager connectivityManager2 = (ConnectivityManager) ((Context) eVar22.f6420a).getSystemService("connectivity");
            NetworkRequest build2 = new NetworkRequest.Builder().build();
            q qVar2 = new q(new androidx.credentials.playservices.controllers.CreateRestoreCredential.a(12, eVar22));
            eVar22.f6423d = qVar2;
            connectivityManager2.registerNetworkCallback(build2, qVar2);
            logRocketCore22.o();
            iVar = ApplicationInitProvider.f6379c;
            synchronized (iVar.f6594g) {
            }
        } catch (Throwable th3) {
            throw new y9.h("Failed to load persisted batches.", th3);
        }
    }

    @Keep
    public static LogRocketCore getInstance() throws z {
        LogRocketCore logRocketCore = f6381a0;
        if (logRocketCore != null) {
            return logRocketCore;
        }
        throw new z("LogRocket Android SDK has not been configured");
    }

    public static void k(String str) {
        try {
            wg.k q = wg.l.q();
            q.d();
            wg.l.p((wg.l) q.f6816b, str);
            f6381a0.a(15, q);
        } catch (Throwable unused) {
        }
    }

    public static void l(String str, Throwable th2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            th2.printStackTrace(new PrintStream(byteArrayOutputStream));
            k(str + "\n\n" + byteArrayOutputStream.toString("UTF8"));
        } catch (Throwable th3) {
            Log.d("LogRocket", "Failed to add debugLog event", th3);
        }
    }

    @Keep
    public static g maybeGetEventAdder() {
        return f6381a0;
    }

    @Keep
    public static LogRocketCore maybeGetInstance() {
        return maybeGetInstance(false);
    }

    @Override // com.logrocket.core.g
    public final void b(int i5, com.logrocket.protobuf.x xVar, StackTraceElement[] stackTraceElementArr, boolean z5, Long l6) {
        long longValue = l6 != null ? l6.longValue() : System.currentTimeMillis();
        v9.d dVar = this.j;
        if (!dVar.j.get()) {
            dVar.d(i5, xVar, longValue);
            try {
                switch (v9.c.f24472a[v.f.d(i5)]) {
                    case 1:
                        if (xVar != null) {
                            throw new ClassCastException();
                        }
                        synchronized (dVar.f24489s) {
                            throw null;
                        }
                    case 2:
                        synchronized (dVar.f24489s) {
                            try {
                                dVar.e(i5, xVar, longValue, 4);
                                if (xVar != null) {
                                    throw new ClassCastException();
                                }
                                throw null;
                            } finally {
                            }
                        }
                    case 3:
                    case 4:
                    case 5:
                        synchronized (dVar.f24489s) {
                            dVar.e(i5, xVar, longValue, 4);
                        }
                        break;
                    case 6:
                        xg.b bVar = (xg.b) xVar;
                        if (((xg.c) bVar.f6816b).u() == 2 || ((xg.c) bVar.f6816b).u() == 3 || ((xg.c) bVar.f6816b).u() == 8) {
                            synchronized (dVar.f24489s) {
                                dVar.e(i5, xVar, longValue, 4);
                            }
                            break;
                        }
                        break;
                    case 7:
                        if (((xg.q) xVar).e() == 1) {
                            synchronized (dVar.f24489s) {
                                dVar.e(i5, xVar, longValue, 3);
                            }
                            break;
                        }
                        break;
                }
            } catch (Exception e7) {
                dVar.f24482k.e("Error while observing event ".concat(c1.d(i5)), e7);
            }
        }
        g(i5, xVar.a().d(), stackTraceElementArr, z5, Long.valueOf(longValue));
    }

    public final void c() {
        if (this.f6465d == 2 && this.f6383f.j == a0.f6405b) {
            this.f6382e.j("Limited lookback detected for this session but configuration type set to WIFI. Shutting down");
            s("wifiConnectionInLimitedLookbackCR");
        }
    }

    public final void f(String str) {
        wg.g0 r5 = wg.h0.r();
        double currentTimeMillis = System.currentTimeMillis();
        r5.d();
        wg.h0.p((wg.h0) r5.f6816b, currentTimeMillis);
        r5.d();
        wg.h0.q((wg.h0) r5.f6816b, str);
        synchronized (this.V) {
            this.W.add((wg.h0) r5.a());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x001b, code lost:
    
        if (r9.S.contains(com.logrocket.core.u.f6640a) != false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(final int i5, final com.logrocket.protobuf.j jVar, final StackTraceElement[] stackTraceElementArr, final boolean z5, final Long l6) {
        Throwable th2;
        f0 f0Var;
        String str;
        if (!this.J.get()) {
            if (i5 == 19 || i5 == 18) {
            }
            if (f6381a0 == null) {
                PostInitializationTasks.run(new t() { // from class: com.logrocket.core.j
                    @Override // com.logrocket.core.t
                    public final void a(LogRocketCore logRocketCore, Long l10) {
                        LogRocketCore logRocketCore2 = LogRocketCore.f6381a0;
                        logRocketCore.g(i5, jVar, stackTraceElementArr, z5, l6);
                    }
                });
                return;
            }
            long longValue = l6.longValue();
            if (!this.f6394s.get() && longValue - this.f6398w.get() > this.U && this.f6400y.compareAndSet(false, true)) {
                s.a(false);
                this.A.set(false);
                String str2 = "Inactive session, stop recording events for session: " + this.N.c();
                f(str2);
                this.f6382e.a(str2);
                return;
            }
            if (this.f6400y.get()) {
                ba.d dVar = this.f6382e;
                switch (i5) {
                    case 1:
                        str = "Exception";
                        break;
                    case 2:
                        str = "Identify";
                        break;
                    case 3:
                        str = "LogEvent";
                        break;
                    case 4:
                        str = "Metadata";
                        break;
                    case 5:
                        str = "TouchEvent";
                        break;
                    case 6:
                        str = "ActivityLifecycleEvent";
                        break;
                    case 7:
                        str = "RequestEvent";
                        break;
                    case 8:
                        str = "ResponseEvent";
                        break;
                    case 9:
                        str = "ResourceInitializationEvent";
                        break;
                    case 10:
                        str = "NetworkStatusEvent";
                        break;
                    case 11:
                        str = "Buffer";
                        break;
                    case 12:
                        str = "FlatViewCapture";
                        break;
                    case 13:
                        str = "InputChangeEvent";
                        break;
                    case 14:
                        str = "CustomEvent";
                        break;
                    case 15:
                        str = "DebugLog";
                        break;
                    case 16:
                        str = "FilterMatch";
                        break;
                    case 17:
                        str = "FilterErrorState";
                        break;
                    case 18:
                        str = "ReduxAction";
                        break;
                    case 19:
                        str = "ReduxInitialState";
                        break;
                    case 20:
                        str = "ErrorTruncated";
                        break;
                    case 21:
                        str = "Memory";
                        break;
                    case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                        str = "CpuUsage";
                        break;
                    case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                        str = "NetworkThroughput";
                        break;
                    case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                        str = "AppStartTiming";
                        break;
                    case C0122e9.F /* 25 */:
                        str = "WebViewInitEvent";
                        break;
                    case C0122e9.G /* 26 */:
                        str = "ImageNonCaptureEvent";
                        break;
                    case C0122e9.H /* 27 */:
                        str = "CustomFonts";
                        break;
                    case 28:
                        str = "Metric";
                        break;
                    case C0122e9.I /* 29 */:
                        str = "PreviousSession";
                        break;
                    case 30:
                        str = "ConditionalRecordingConfirmation";
                        break;
                    case 31:
                        str = "AppFramework";
                        break;
                    default:
                        str = "null";
                        break;
                }
                dVar.a("SDK currently inactive, ignoring event: ".concat(str));
                return;
            }
            try {
                final wg.m C = wg.q.C();
                String d10 = c1.d(i5);
                C.d();
                wg.q.r((wg.q) C.f6816b, d10);
                C.d();
                wg.q.q((wg.q) C.f6816b, longValue);
                C.d();
                wg.q.t((wg.q) C.f6816b);
                if (stackTraceElementArr != null) {
                    try {
                        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                            wg.o t3 = wg.p.t();
                            String methodName = stackTraceElement.getMethodName();
                            t3.d();
                            wg.p.r((wg.p) t3.f6816b, methodName);
                            String className = stackTraceElement.getClassName();
                            t3.d();
                            wg.p.s((wg.p) t3.f6816b, className);
                            if (stackTraceElement.getLineNumber() >= 0) {
                                int lineNumber = stackTraceElement.getLineNumber();
                                t3.d();
                                wg.p.p((wg.p) t3.f6816b, lineNumber);
                            }
                            if (stackTraceElement.getFileName() != null) {
                                String fileName = stackTraceElement.getFileName();
                                t3.d();
                                wg.p.q((wg.p) t3.f6816b, fileName);
                            }
                            C.d();
                            wg.q.s((wg.q) C.f6816b, (wg.p) t3.a());
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        Log.e("LogRocket", "Failed to add event, shutting down.", th2);
                        s("failedToAddEvent");
                    }
                }
                if (this.C.size() == 100) {
                    Log.e("LogRocket", "Event queue overflow. Disabling SDK.");
                    s("pendingEvents");
                    return;
                }
                if (z5) {
                    this.M.getAndIncrement();
                }
                int i10 = h.f6585a[v.f.d(i5)];
                if (i10 == 1 || i10 == 2) {
                    long currentTimeMillis = System.currentTimeMillis();
                    v9.d dVar2 = this.j;
                    double d11 = currentTimeMillis;
                    if (!dVar2.f24485n.booleanValue() && d11 > dVar2.f24473a.N.f6459p + 5000.0d) {
                        dVar2.f24485n = Boolean.TRUE;
                    }
                    if (currentTimeMillis - this.H.get() > Z) {
                        String c2 = this.f6462a.c();
                        this.H.set(currentTimeMillis);
                        com.google.firebase.messaging.x h10 = com.google.firebase.messaging.x.h();
                        h10.getClass();
                        if (maybeGetInstance(true) != null && (f0Var = (f0) ((WeakReference) h10.f6184c).get()) != null) {
                            try {
                                h10.j(new com.logrocket.core.webview.a(f0Var, currentTimeMillis));
                            } catch (JSONException unused) {
                            }
                        }
                        synchronized (this.G) {
                            try {
                                if (this.G.containsKey(c2)) {
                                    HashMap hashMap = this.G;
                                    hashMap.put(c2, Integer.valueOf(((Integer) hashMap.get(c2)).intValue() + 1));
                                } else {
                                    this.G.put(c2, 1);
                                }
                            } finally {
                            }
                        }
                    }
                }
                final double b10 = this.f6393r.b(c1.d(i5));
                try {
                    this.C.add(new Runnable() { // from class: com.logrocket.core.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            int b11;
                            LogRocketCore logRocketCore = LogRocketCore.this;
                            ConcurrentHashMap.KeySetView keySetView = logRocketCore.S;
                            wg.m mVar = C;
                            com.logrocket.protobuf.j jVar2 = jVar;
                            double d12 = b10;
                            Context context = logRocketCore.f6396u;
                            try {
                                f0 f0Var2 = logRocketCore.N;
                                f0Var2.getClass();
                                f0Var2.f6460r = System.currentTimeMillis();
                                int andIncrement = f0Var2.f6458o.getAndIncrement();
                                mVar.d();
                                wg.q.w((wg.q) mVar.f6816b, andIncrement);
                                int i11 = logRocketCore.N.f6447c;
                                mVar.d();
                                wg.q.z((wg.q) mVar.f6816b, i11);
                                Objects.requireNonNull(logRocketCore.N);
                                mVar.d();
                                wg.q.p((wg.q) mVar.f6816b);
                                f0 f0Var3 = logRocketCore.N;
                                f0Var3.getClass();
                                double currentTimeMillis2 = System.currentTimeMillis() - f0Var3.f6459p;
                                mVar.d();
                                wg.q.v((wg.q) mVar.f6816b, currentTimeMillis2);
                                mVar.d();
                                wg.q.x((wg.q) mVar.f6816b, jVar2);
                                int b12 = ((wg.q) mVar.a()).b(null);
                                int i12 = i5;
                                if ((i12 == 19 || i12 == 18) && b12 >= 1044480) {
                                    LogRocketCore.d(context, "LogRocket: Redux state is large (> 1MB), consider using stateSanitizer to prevent data loss: https://docs.logrocket.com/reference#redux-logging", false, true);
                                }
                                if (i12 != 19 && i12 != 18) {
                                    if (b12 > 10444800) {
                                        String str3 = "Payload too large (> 10MB). Event: " + ((wg.q) mVar.f6816b).B();
                                        Log.e("LogRocket", str3);
                                        LogRocketCore.d(context, str3, false, false);
                                        mVar.d();
                                        wg.q.u((wg.q) mVar.f6816b);
                                        mVar.d();
                                        wg.q.y((wg.q) mVar.f6816b);
                                        mVar.d();
                                        wg.q.A((wg.q) mVar.f6816b);
                                        mVar.d();
                                        wg.q.r((wg.q) mVar.f6816b, "lr.error.Truncated");
                                        ah.b q = ah.c.q();
                                        q.d();
                                        ah.c.p((ah.c) q.f6816b, str3);
                                        com.logrocket.protobuf.i d13 = ((ah.c) q.a()).d();
                                        mVar.d();
                                        wg.q.x((wg.q) mVar.f6816b, d13);
                                    }
                                    logRocketCore.f6393r.c(c1.d(i12), b12, d12);
                                    logRocketCore.f6384g.b((wg.q) mVar.a());
                                }
                                u uVar = u.f6640a;
                                if (!keySetView.contains(uVar)) {
                                    if (b12 > 4177920) {
                                        StringBuilder sb2 = new StringBuilder("Redux ");
                                        sb2.append(i12 == 19 ? "state" : "action");
                                        sb2.append(" too large (> 4MB). Stopping Redux capture. Consider sanitizing: https://docs.logrocket.com/reference/redux-logging");
                                        String sb3 = sb2.toString();
                                        keySetView.add(uVar);
                                        LogRocketCore.d(context, sb3, false, false);
                                        zg.h u10 = zg.i.u();
                                        u10.d();
                                        zg.i.q((zg.i) u10.f6816b, 4);
                                        fh.c k6 = h8.b.k(sb3);
                                        u10.d();
                                        zg.i.r((zg.i) u10.f6816b, k6);
                                        mVar.d();
                                        wg.q.u((wg.q) mVar.f6816b);
                                        mVar.d();
                                        wg.q.y((wg.q) mVar.f6816b);
                                        mVar.d();
                                        wg.q.A((wg.q) mVar.f6816b);
                                        mVar.d();
                                        wg.q.r((wg.q) mVar.f6816b, "lr.core.LogEvent");
                                        com.logrocket.protobuf.i d14 = ((zg.i) u10.a()).d();
                                        mVar.d();
                                        wg.q.x((wg.q) mVar.f6816b, d14);
                                        b11 = ((wg.q) mVar.a()).b(null);
                                    }
                                    logRocketCore.f6393r.c(c1.d(i12), b12, d12);
                                    logRocketCore.f6384g.b((wg.q) mVar.a());
                                }
                                zg.h u11 = zg.i.u();
                                u11.d();
                                zg.i.q((zg.i) u11.f6816b, 1);
                                fh.c k9 = h8.b.k("Encountered Redux event after Redux capture was disabled so it is being ignored.");
                                u11.d();
                                zg.i.r((zg.i) u11.f6816b, k9);
                                mVar.d();
                                wg.q.u((wg.q) mVar.f6816b);
                                mVar.d();
                                wg.q.y((wg.q) mVar.f6816b);
                                mVar.d();
                                wg.q.A((wg.q) mVar.f6816b);
                                mVar.d();
                                wg.q.r((wg.q) mVar.f6816b, "lr.core.LogEvent");
                                com.logrocket.protobuf.i d15 = ((zg.i) u11.a()).d();
                                mVar.d();
                                wg.q.x((wg.q) mVar.f6816b, d15);
                                b11 = ((wg.q) mVar.a()).b(null);
                                b12 = b11;
                                logRocketCore.f6393r.c(c1.d(i12), b12, d12);
                                logRocketCore.f6384g.b((wg.q) mVar.a());
                            } catch (IOException e7) {
                                Log.e("LogRocket", "Failed to add event, shutting down.", e7);
                                logRocketCore.s("failedToAddEvent");
                            }
                        }
                    });
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    Log.e("LogRocket", "Failed to add event, shutting down.", th2);
                    s("failedToAddEvent");
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public final void h(long j) {
        i0 i0Var = this.f6393r;
        synchronized (i0Var) {
            try {
                aa.i iVar = i0Var.f6600e;
                if (iVar == null) {
                    i0Var.f6600e = new aa.i(j);
                } else {
                    double d10 = j;
                    int i5 = iVar.f104a;
                    iVar.f104a = i5 + 1;
                    int i10 = i5 % 5;
                    double d11 = iVar.f105b;
                    double[] dArr = iVar.f106c;
                    double d12 = d11 - dArr[i10];
                    iVar.f105b = d12;
                    dArr[i10] = d10;
                    iVar.f105b = d12 + d10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String i() {
        if (!this.A.get()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        f fVar = this.f6383f;
        sb2.append(fVar.f6426b);
        sb2.append("/");
        sb2.append(fVar.f6425a);
        sb2.append("/s/");
        sb2.append(this.N.f6446b);
        sb2.append("/");
        sb2.append(this.N.f6447c);
        sb2.append("?t=");
        sb2.append(System.currentTimeMillis());
        return sb2.toString();
    }

    @Keep
    public void identify(String str, Map<String, String> map, Boolean bool, Long l6) {
        wg.t f6 = this.K.f(str, map, bool);
        if (f6 != null) {
            b(2, f6, null, false, l6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        com.android.billingclient.api.i iVar;
        f fVar = this.f6383f;
        fVar.getClass();
        File file = this.B;
        f0 f0Var = this.N;
        if (fVar.f6434k) {
            try {
                File file2 = new File(file, "crashReports");
                ci.c.q(file2);
                e eVar = new e(this, "https://r.lr-intake.com", f0Var);
                io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(file2);
                iVar = new com.android.billingclient.api.i();
                iVar.f4030d = new ba.d("crash-report-handler");
                iVar.f4027a = false;
                try {
                    iVar.f4028b = cVar;
                    cVar.e();
                    iVar.f4029c = eVar;
                    iVar.f4027a = true;
                } catch (IOException e7) {
                    ((ba.d) iVar.f4030d).e("Failed to initialize crash report handler", e7);
                }
            } catch (Throwable th2) {
                Log.w("LogRocket", "Failed to initialize crash report handler", th2);
            }
            boolean z5 = fVar.f6435l;
            if (n.f6627f == null) {
                n.a();
            }
            n nVar = n.f6627f;
            nVar.f6630c = iVar;
            nVar.f6631d = Boolean.valueOf(z5);
            if (iVar.f4027a) {
                return;
            }
            try {
                File[] listFiles = ((File) ((io.sentry.internal.debugmeta.c) iVar.f4028b).f16517b).listFiles();
                if (listFiles != null) {
                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                    newSingleThreadExecutor.submit(new androidx.appcompat.app.t(7, iVar, listFiles)).get();
                    newSingleThreadExecutor.shutdown();
                    return;
                }
                return;
            } catch (InterruptedException | RuntimeException | ExecutionException e9) {
                ((ba.d) iVar.f4030d).f("Error while uploading pending crash reports", e9.getCause());
                return;
            }
        }
        iVar = new com.android.billingclient.api.i(2);
        boolean z52 = fVar.f6435l;
        if (n.f6627f == null) {
        }
        n nVar2 = n.f6627f;
        nVar2.f6630c = iVar;
        nVar2.f6631d = Boolean.valueOf(z52);
        if (iVar.f4027a) {
        }
    }

    public final void m() {
        String valueOf = String.valueOf(this.N.f6447c);
        if (!(this.f6463b.containsKey(valueOf) ? ((Boolean) this.f6463b.get(valueOf)).booleanValue() : false) || this.f6400y.get()) {
            return;
        }
        this.A.compareAndSet(false, true);
    }

    public final Boolean n() {
        return (Boolean) Map.EL.getOrDefault(this.f6463b, String.valueOf(this.N.f6447c), Boolean.FALSE);
    }

    public final void o() {
        wg.a0 f6;
        StringBuilder sb2 = new StringBuilder("Registering session ");
        sb2.append(this.N.f6446b);
        sb2.append("/");
        sb2.append(this.N.f6447c);
        sb2.append(" with ");
        sb2.append(((y9.c) ((androidx.appcompat.widget.a0) this.f6399x.f6183b).f682d) instanceof y9.f ? "in memory" : "on disk");
        sb2.append(" batches");
        f(sb2.toString());
        this.f6400y.set(false);
        synchronized (this.V) {
            f6 = io.sentry.util.network.b.f(this.f6396u, this.f6383f, this.W);
        }
        this.R = ((wg.j0) f6.f6816b).v();
        if (!this.f6383f.f6438o.isEmpty() || !this.f6383f.q.isEmpty()) {
            if (!this.R.isEmpty()) {
                this.R = d9.e.l(new StringBuilder(), this.R, "#");
            }
            if (!this.f6383f.q.isEmpty()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.R);
                sb3.append(this.f6383f.q);
                sb3.append(!this.f6383f.f6438o.isEmpty() ? StringUtils.PROCESS_POSTFIX_DELIMITER : "");
                this.R = sb3.toString();
            }
            String str = this.R + this.f6383f.f6438o;
            this.R = str;
            f6.d();
            wg.j0.q((wg.j0) f6.f6816b, str);
        }
        a(4, f6);
        int i5 = this.X;
        if (i5 == 2) {
            this.f6383f.getClass();
        }
        wg.b q = wg.c.q();
        q.d();
        wg.c.p((wg.c) q.f6816b, i5);
        a(31, q);
        t9.c.f23780k.set(false);
        f0 f0Var = this.N.f6461s;
        dh.b bVar = null;
        if (f0Var != null) {
            k0 r5 = l0.r();
            String str2 = f0Var.f6446b;
            r5.d();
            l0.q((l0) r5.f6816b, str2);
            int i10 = f0Var.f6447c;
            r5.d();
            l0.p((l0) r5.f6816b, i10);
            a(29, r5);
            this.N.f6461s = null;
        }
        androidx.appcompat.widget.a0 a0Var = this.K;
        String str3 = this.N.f6449e;
        String str4 = (String) a0Var.f681c;
        wg.t f10 = (str4 == null || str4.length() <= 0) ? a0Var.f(str3, null, Boolean.TRUE) : a0Var.f((String) a0Var.f681c, (java.util.Map) a0Var.f683e, Boolean.FALSE);
        if (f10 != null) {
            a(2, f10);
        }
        if (e.f6419e == null) {
            e.f6419e = new e();
        }
        e eVar = e.f6419e;
        String str5 = (String) eVar.f6420a;
        String[] strArr = (String[]) eVar.f6421b;
        if (str5 != null && strArr != null) {
            bVar = dh.c.r();
            bVar.d();
            dh.c.p((dh.c) bVar.f6816b, str5);
            List asList = Arrays.asList(strArr);
            bVar.d();
            dh.c.q((dh.c) bVar.f6816b, asList);
        }
        if (bVar != null) {
            a(27, bVar);
        }
        com.google.firebase.messaging.x.L(this.N);
    }

    public final void p() {
        this.M.set(0);
        this.G.clear();
        this.f6397v.set(false);
        this.f6388l.clear();
        androidx.appcompat.widget.a0 a0Var = this.K;
        a0Var.f684f = 0;
        ((HashSet) a0Var.f680b).clear();
        x xVar = this.f6386i;
        com.logrocket.core.graphics.f fVar = xVar.f6650f;
        fVar.f6545o.f6573g = 0;
        com.logrocket.core.graphics.b bVar = fVar.f6544n;
        bVar.f6478b.clear();
        bVar.f6480d.clear();
        bVar.f6481e = 0;
        bVar.f6482f = 1;
        fVar.f6541k.clear();
        fVar.q.f6564a.clear();
        v0 v0Var = xVar.f6658o;
        v0Var.getClass();
        v0Var.f365c = new HashSet();
        v0Var.f366d = new HashSet();
        this.S.clear();
    }

    public final void q() {
        synchronized (this.D) {
            try {
                if (this.Q == null) {
                    this.Q = this.L.schedule(new m(this, 1), this.I.intValue(), TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void r() {
        if (s.f6638b.compareAndSet(false, true)) {
            Iterator it = new ArrayList(s.f6637a).iterator();
            while (it.hasNext()) {
                r rVar = (r) it.next();
                rVar.getClass();
                try {
                    ((d0) rVar.f6636a.f1514b).g(i());
                } catch (Throwable th2) {
                    Log.e("LogRocket", "Failed to run post acceptance task", th2);
                }
            }
            Intent intent = new Intent();
            intent.setAction("LogRocketSDK.SessionAccepted");
            Context context = this.f6396u;
            intent.setPackage(context.getPackageName());
            intent.putExtra("appID", this.f6383f.f6425a);
            intent.putExtra("sessionURL", i());
            context.sendBroadcast(intent);
        }
        synchronized (this.V) {
            this.W = new ArrayList();
        }
    }

    public final void s(String str) {
        StringBuilder p10 = d9.e.p("shutdownReason: ", str, " hardShutdown: true purgeSession: true recordingID: ");
        p10.append(this.N.f6446b);
        p10.append(" sessionID: ");
        p10.append(this.N.f6447c);
        f(p10.toString());
        boolean z5 = true;
        if (str.equals("START_NEW_SESSION")) {
            f0 f0Var = this.N;
            JSONArray jSONArray = new JSONArray((Collection) this.f6464c);
            f0Var.getClass();
            String a7 = f0.a();
            f0 f0Var2 = new f0(f0Var.f6445a, a7, 0, f0Var.f6449e, f0Var.f6451g, jSONArray);
            f0Var2.f6461s = this.N;
            StringBuilder p11 = d9.e.p("startNewSession ", a7, "/0 hardReset: true wasResumed: ");
            p11.append(f0Var2.f6461s != null);
            f(p11.toString());
            this.f6400y.set(true);
            this.C.add(new l(0, this, f0Var2, z5));
            return;
        }
        if (this.J.compareAndSet(false, true)) {
            try {
                try {
                    PostInitializationTasks.reset();
                    Iterator it = this.E.iterator();
                    while (it.hasNext()) {
                        try {
                            ((Runnable) it.next()).run();
                        } catch (Throwable th2) {
                            this.f6382e.e("Failed to run a shutdown handler.", th2);
                        }
                    }
                    this.E.clear();
                    this.f6390n.d();
                    this.f6386i.f();
                    this.f6391o.b();
                    x9.e eVar = this.f6392p;
                    eVar.f25442e = true;
                    aa.g gVar = eVar.f25441d;
                    if (gVar != null) {
                        gVar.d();
                    }
                    x9.d dVar = this.q;
                    dVar.f25430c = true;
                    aa.g gVar2 = dVar.f25429b;
                    if (gVar2 != null) {
                        gVar2.d();
                    }
                    ch.d dVar2 = dVar.f25433f;
                    dVar2.d();
                    ch.f.r((ch.f) dVar2.f6816b);
                    n nVar = n.f6627f;
                    if (nVar != null) {
                        nVar.f6631d = Boolean.FALSE;
                        nVar.f6630c = null;
                    }
                    aa.g gVar3 = this.P;
                    if (gVar3 != null) {
                        gVar3.d();
                    }
                    this.f6395t.unregisterActivityLifecycleCallbacks(this.f6462a);
                    e eVar2 = this.F;
                    ((ConnectivityManager) ((Context) eVar2.f6420a).getSystemService("connectivity")).unregisterNetworkCallback((q) eVar2.f6423d);
                    synchronized (this.D) {
                        try {
                            if (this.Q != null) {
                                this.f6382e.o("Cancelling pending activity recording task...");
                                this.Q.cancel(false);
                                this.f6382e.o("Task Cancelled");
                            }
                        } finally {
                        }
                    }
                    this.L.shutdown();
                    androidx.appcompat.widget.a0 a0Var = this.f6389m;
                    a0Var.f685g = Boolean.TRUE;
                    eh.k kVar = (eh.k) a0Var.f683e;
                    kVar.d();
                    eh.n.p((eh.n) kVar.f6816b);
                    this.f6384g.f25764e.set(false);
                    ThreadPoolExecutor threadPoolExecutor = this.O;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdownNow();
                    }
                    this.f6382e.o("Stopping uploads");
                    this.f6385h.d();
                    this.f6384g.f();
                    com.google.firebase.messaging.x xVar = this.f6384g.f25760a;
                    xVar.K((f0) xVar.f6182a);
                    s.a(true);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("appID", this.f6383f.f6425a);
                    jSONObject.put("sdkType", ConstantDeviceInfo.APP_PLATFORM);
                    jSONObject.put("sdkVersion", "1.57.4");
                    jSONObject.put("recordingID", this.N.f6446b);
                    jSONObject.put("sessionID", this.N.f6447c);
                    jSONObject.put("sdkShutdownReason", str);
                    h0.f6586a.execute(new aa.c(14, jSONObject.toString()));
                } catch (JSONException unused) {
                    this.f6382e.j("Failed to send shutdown stats");
                }
                this.f6382e.o("SDK shutdown completed.");
                f6381a0 = null;
            } catch (Throwable th3) {
                this.f6382e.o("SDK shutdown completed.");
                f6381a0 = null;
                throw th3;
            }
        }
    }

    @Keep
    public static LogRocketCore maybeGetInstance(boolean z5) {
        if (!z5 && f6381a0 == null) {
            Log.w("LogRocket", "Tried to access LogRocket before it has been configured");
        }
        return f6381a0;
    }
}
