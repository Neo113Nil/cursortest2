package com.ironsource;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import com.ironsource.X3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.vk.core.preference.Preference;
import java.lang.Thread;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import xsna.d4k;
import xsna.y370;

/* renamed from: com.ironsource.n4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4452n4 {
    private static final String k = "1.0.6";
    public static String l = "";
    private final InterfaceC4652y7 a;
    private String b;
    private String c;
    private String d;
    private String e;
    private ContextProvider f;
    public Thread.UncaughtExceptionHandler g;
    public String h;
    private String i;
    private boolean j;

    /* renamed from: com.ironsource.n4$b */
    public class b implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;

        public b(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String I = C4452n4.this.a.I(this.a);
                if (!TextUtils.isEmpty(I)) {
                    C4452n4.this.c = I;
                }
                String c = C4452n4.this.a.c(this.a);
                if (!TextUtils.isEmpty(c)) {
                    C4452n4.this.e = c;
                }
                SharedPreferences.Editor edit = Preference.h(this.a, 0, "CRep").edit();
                edit.putString("String1", C4452n4.this.c);
                edit.putString("sId", this.b);
                edit.apply();
            } catch (Exception e) {
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    /* renamed from: com.ironsource.n4$c */
    public class c extends RunnableC4470o4 {
        public c(JSONObject jSONObject) {
            super(jSONObject);
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.ironsource.n4$d */
    public static class d {
        static volatile C4452n4 a = new C4452n4(0);

        private d() {
        }
    }

    public /* synthetic */ C4452n4(int i) {
        this();
    }

    public String e() {
        return this.i;
    }

    private C4452n4() {
        this.j = false;
        this.a = Kb.Y().a();
        this.f = ContextProvider.getInstance();
        AtomicBoolean atomicBoolean = d4k.a;
        y370 y370Var = y370.a;
        this.g = y370Var;
        this.i = " ";
        this.h = "https://o-crash.mediation.unity3d.com/reporter";
        d4k.a(new C4416l4(y370Var));
    }

    public static List<K5> c() {
        return null;
    }

    public static C4452n4 d() {
        return d.a;
    }

    public void a(HashSet<String> hashSet, String str, String str2, boolean z, String str3, int i, boolean z2) {
        Context applicationContext = this.f.getApplicationContext();
        if (applicationContext != null) {
            if (!TextUtils.isEmpty(str2)) {
                this.i = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                this.h = str;
            }
            this.d = str3;
            if (z) {
                new C4214a(i).a(z2).b(true).a(new a()).start();
            }
            a(applicationContext, hashSet);
            new Thread(new b(applicationContext, str3)).start();
        }
        this.j = true;
        IronLog.INTERNAL.verbose("initialized");
    }

    public String b() {
        return k;
    }

    /* renamed from: com.ironsource.n4$a */
    public class a implements InterfaceC4232b {
        public a() {
        }

        @Override // com.ironsource.InterfaceC4232b
        public void a() {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            StringBuilder sb = new StringBuilder(128);
            for (Thread thread : allStackTraces.keySet()) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace != null && stackTrace.length > 0) {
                    sb.append("*** Thread Name ");
                    sb.append(thread.getName());
                    sb.append(" Thread ID ");
                    sb.append(thread.getId());
                    sb.append(" (");
                    sb.append(thread.getState().toString());
                    sb.append(") ***\n");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        sb.append(stackTraceElement.toString());
                        sb.append(" ");
                        sb.append(thread.getState().toString());
                        sb.append("\n");
                    }
                }
            }
            C4452n4.l = sb.toString();
        }

        @Override // com.ironsource.InterfaceC4232b
        public void b() {
        }
    }

    public void a(Throwable th) {
        IronLog.INTERNAL.verbose("isInitialized=" + this.j);
        if (!this.j || th == null) {
            return;
        }
        new K5(new C4434m4(th).b(), "" + System.currentTimeMillis(), "Caught_IS_Crash").a();
    }

    private void a(Context context, HashSet<String> hashSet) {
        String a2 = a(a());
        if (a2.equals("none")) {
            return;
        }
        SharedPreferences h = Preference.h(context, 0, "CRep");
        String string = h.getString("String1", this.c);
        String string2 = h.getString("sId", this.d);
        List<K5> b2 = E4.b();
        IronLog.INTERNAL.verbose("reportList size " + b2.size());
        for (K5 k5 : b2) {
            JSONObject jSONObject = new JSONObject();
            String b3 = k5.b();
            String e = k5.e();
            String d2 = k5.d();
            String packageName = context.getPackageName();
            JSONObject jSONObject2 = new JSONObject();
            try {
                ActivityManager.MemoryInfo o = this.a.o(context);
                if (o != null) {
                    jSONObject2.put("availRam", this.a.c(o));
                    jSONObject2.put(O6.x, this.a.b(o));
                    jSONObject2.put("mThreshold", this.a.a(o));
                }
                String t = this.a.t();
                if (t != null) {
                    jSONObject2.put(O6.z, t);
                }
                jSONObject2.put("crashDate", b3);
                jSONObject2.put("stacktraceCrash", e);
                jSONObject2.put("crashType", d2);
                jSONObject2.put("CrashReporterVersion", k);
                jSONObject2.put(X3.j.q, "9.4.3");
                jSONObject2.put(X3.j.x, this.a.d(context));
                jSONObject2.put("appVersion", E1.b(context, packageName));
                jSONObject2.put(X3.j.n, this.a.i());
                jSONObject2.put("network", a2);
                jSONObject2.put(X3.j.p, this.a.e());
                jSONObject2.put("deviceModel", this.a.l());
                jSONObject2.put("totalRam", this.a.r(context));
                jSONObject2.put(Wa.o, this.a.f());
                jSONObject2.put("advertisingId", string);
                jSONObject2.put("deviceOEM", this.a.q());
                jSONObject2.put("systemProperties", System.getProperties());
                jSONObject2.put("bundleId", packageName);
                jSONObject2.put("sId", string2);
                if (!TextUtils.isEmpty(this.e)) {
                    jSONObject2.put(X3.j.M, Boolean.parseBoolean(this.e));
                }
                if (hashSet == null || hashSet.isEmpty()) {
                    jSONObject = jSONObject2;
                } else {
                    Iterator<String> it = hashSet.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        try {
                            if (jSONObject2.has(next)) {
                                jSONObject.put(next, jSONObject2.opt(next));
                            }
                        } catch (Exception e2) {
                            IronLog.INTERNAL.error(e2.toString());
                        }
                    }
                }
            } catch (Exception unused) {
            }
            if (jSONObject.length() != 0) {
                new Thread(new c(jSONObject)).start();
            }
        }
        E4.a();
    }

    public Context a() {
        return this.f.getApplicationContext();
    }

    private String a(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return "none";
            }
            if (networkCapabilities.hasTransport(1)) {
                return "wifi";
            }
            return networkCapabilities.hasTransport(0) ? "cellular" : "none";
        } catch (Exception e) {
            IronLog.INTERNAL.error(e.toString());
            return "none";
        }
    }
}
