package com.google.android.gms.stats;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.stats.zzb;
import com.google.android.gms.internal.stats.zzi;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import defpackage.eq3;
import defpackage.qqn;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes3.dex */
public class WakeLock {
    public static volatile ScheduledExecutorService o;
    public static final Object p = new Object();
    public final Object a;
    public final PowerManager.WakeLock b;
    public int c;
    public ScheduledFuture d;
    public long e;
    public final HashSet f;
    public boolean g;
    public zzb h;
    public final DefaultClock i;
    public final String j;
    public final Context k;
    public final HashMap l;
    public final AtomicInteger m;
    public final ScheduledExecutorService n;

    public WakeLock(Context context) {
        boolean z;
        String packageName = context.getPackageName();
        this.a = new Object();
        this.c = 0;
        this.f = new HashSet();
        this.g = true;
        this.i = DefaultClock.a;
        this.l = new HashMap();
        this.m = new AtomicInteger(0);
        Preconditions.g("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        this.k = context.getApplicationContext();
        WorkSource workSource = null;
        this.h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb.toString());
        }
        this.b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = WorkSourceUtil.a;
        synchronized (WorkSourceUtil.class) {
            Boolean bool = WorkSourceUtil.e;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = eq3.b(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                WorkSourceUtil.e = Boolean.valueOf(z);
            }
        }
        if (z) {
            packageName = Strings.a(packageName) ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo a = Wrappers.a(context).a(0, packageName);
                    if (a == null) {
                        "Could not get applicationInfo from package: ".concat(packageName);
                    } else {
                        int i = a.uid;
                        workSource = new WorkSource();
                        WorkSourceUtil.a(workSource, i, packageName);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    "Could not find package: ".concat(packageName);
                }
            }
            if (workSource != null) {
                try {
                    this.b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                    e.toString();
                }
            }
        }
        ScheduledExecutorService scheduledExecutorService = o;
        if (scheduledExecutorService == null) {
            synchronized (p) {
                try {
                    scheduledExecutorService = o;
                    if (scheduledExecutorService == null) {
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        o = scheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.n = scheduledExecutorService;
    }

    public final void a() {
        this.m.incrementAndGet();
        long min = Math.min(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS, Math.max(Math.min(Long.MAX_VALUE, 31622400000L), 1L));
        synchronized (this.a) {
            try {
                if (!b()) {
                    this.h = zzb.a;
                    this.b.acquire();
                    this.i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.c++;
                if (this.g) {
                    TextUtils.isEmpty(null);
                }
                qqn qqnVar = (qqn) this.l.get(null);
                if (qqnVar == null) {
                    qqnVar = new qqn();
                    this.l.put(null, qqnVar);
                }
                qqnVar.a++;
                this.i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = Long.MAX_VALUE - elapsedRealtime > min ? elapsedRealtime + min : Long.MAX_VALUE;
                if (j > this.e) {
                    this.e = j;
                    ScheduledFuture scheduledFuture = this.d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.d = this.n.schedule(new Runnable() { // from class: com.google.android.gms.stats.zza
                        @Override // java.lang.Runnable
                        public final void run() {
                            WakeLock wakeLock = WakeLock.this;
                            synchronized (wakeLock.a) {
                                try {
                                    if (wakeLock.b()) {
                                        String.valueOf(wakeLock.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **");
                                        wakeLock.d();
                                        if (wakeLock.b()) {
                                            wakeLock.c = 1;
                                            wakeLock.e();
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    }, min, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            z = this.c > 0;
        }
        return z;
    }

    public final void c() {
        if (this.m.decrementAndGet() < 0) {
            String.valueOf(this.j).concat(" release without a matched acquire!");
        }
        synchronized (this.a) {
            try {
                if (this.g) {
                    TextUtils.isEmpty(null);
                }
                if (this.l.containsKey(null)) {
                    qqn qqnVar = (qqn) this.l.get(null);
                    if (qqnVar != null) {
                        int i = qqnVar.a - 1;
                        qqnVar.a = i;
                        if (i == 0) {
                            this.l.remove(null);
                        }
                    }
                } else {
                    String.valueOf(this.j).concat(" counter does not exist");
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    public final void e() {
        synchronized (this.a) {
            try {
                if (b()) {
                    if (this.g) {
                        int i = this.c - 1;
                        this.c = i;
                        if (i > 0) {
                            return;
                        }
                    } else {
                        this.c = 0;
                    }
                    d();
                    Iterator it = this.l.values().iterator();
                    while (it.hasNext()) {
                        ((qqn) it.next()).a = 0;
                    }
                    this.l.clear();
                    ScheduledFuture scheduledFuture = this.d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.d = null;
                        this.e = 0L;
                    }
                    if (this.b.isHeld()) {
                        try {
                            try {
                                this.b.release();
                                if (this.h != null) {
                                    this.h = null;
                                }
                            } catch (RuntimeException e) {
                                if (!e.getClass().equals(RuntimeException.class)) {
                                    throw e;
                                }
                                String.valueOf(this.j).concat(" failed to release!");
                                if (this.h != null) {
                                    this.h = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.h != null) {
                                this.h = null;
                            }
                            throw th;
                        }
                    } else {
                        String.valueOf(this.j).concat(" should be held!");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
