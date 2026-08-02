package com.google.ads.conversiontracking;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PowerManager;
import android.os.Process;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class c implements Runnable {
    private static final long a = TimeUnit.SECONDS.toMillis(3600);
    private static final long b = TimeUnit.SECONDS.toMillis(30);
    private static Object c = new Object();
    private static c d;
    private final long e;
    private final long f;
    private final b g;
    private final Context h;
    private final HandlerThread i;
    private final SharedPreferences m;
    private long n;
    private Handler o;
    private final Object j = new Object();
    private final Map<String, Long> l = new HashMap();
    private final Set<String> k = new HashSet();

    public static c a(Context context) {
        synchronized (c) {
            if (d == null) {
                try {
                    d = new c(context, a, b, new b(context));
                } catch (Exception e) {
                    Log.e("GoogleConversionReporter", "Error starting automated usage thread", e);
                }
            }
        }
        return d;
    }

    c(Context context, long j, long j2, b bVar) {
        this.h = context;
        this.f = j;
        this.e = j2;
        this.g = bVar;
        this.m = context.getSharedPreferences("google_auto_usage", 0);
        d();
        HandlerThread handlerThread = new HandlerThread("Google Conversion SDK", 10);
        this.i = handlerThread;
        handlerThread.start();
        this.o = new Handler(handlerThread.getLooper());
        c();
    }

    public void a(String str) {
        synchronized (this.j) {
            this.k.remove(str);
        }
        c(str);
    }

    public void b(String str) {
        synchronized (this.j) {
            this.k.add(str);
            this.l.remove(str);
        }
    }

    public void c(String str) {
        synchronized (this.j) {
            if (!this.k.contains(str) && !this.l.containsKey(str)) {
                this.g.a(str, this.n);
                this.l.put(str, Long.valueOf(this.n));
            }
        }
    }

    public boolean d(String str) {
        return this.l.containsKey(str);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!a()) {
            a(this.e);
            return;
        }
        synchronized (this.j) {
            for (Map.Entry<String, Long> entry : this.l.entrySet()) {
                String key = entry.getKey();
                long longValue = entry.getValue().longValue();
                long j = this.n;
                if (longValue < j) {
                    entry.setValue(Long.valueOf(j));
                    this.g.a(key, this.n);
                }
            }
        }
        c();
        b(b());
    }

    private long b() {
        long a2 = g.a();
        long j = this.n;
        return j + ((a2 >= j ? ((a2 - j) / this.f) + 1 : 0L) * this.f);
    }

    private void c() {
        synchronized (this.j) {
            a(b() - g.a());
        }
    }

    protected void a(long j) {
        synchronized (this.j) {
            Handler handler = this.o;
            if (handler != null) {
                handler.removeCallbacks(this);
                this.o.postDelayed(this, j);
            }
        }
    }

    private void d() {
        if (this.n == 0) {
            this.n = this.m.getLong("end_of_interval", g.a() + this.f);
        }
    }

    private void b(long j) {
        this.m.edit().putLong("end_of_interval", j).commit();
        this.n = j;
    }

    protected boolean a() {
        ActivityManager activityManager = (ActivityManager) this.h.getSystemService("activity");
        KeyguardManager keyguardManager = (KeyguardManager) this.h.getSystemService("keyguard");
        PowerManager powerManager = (PowerManager) this.h.getSystemService("power");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (Process.myPid() == runningAppProcessInfo.pid && runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && powerManager.isScreenOn()) {
                return true;
            }
        }
        return false;
    }
}
