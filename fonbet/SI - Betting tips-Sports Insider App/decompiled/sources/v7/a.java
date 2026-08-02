package v7;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.i0;
import g6.v;
import io.sentry.android.core.w0;
import io.sentry.b5;
import io.sentry.f5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.LongCompanionObject;
import q6.e;
import q6.f;
import s6.c;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: n, reason: collision with root package name */
    public static final long f24435n = TimeUnit.DAYS.toMillis(366);

    /* renamed from: o, reason: collision with root package name */
    public static volatile ScheduledExecutorService f24436o = null;

    /* renamed from: p, reason: collision with root package name */
    public static final Object f24437p = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f24438a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f24439b;

    /* renamed from: c, reason: collision with root package name */
    public int f24440c;

    /* renamed from: d, reason: collision with root package name */
    public ScheduledFuture f24441d;

    /* renamed from: e, reason: collision with root package name */
    public long f24442e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f24443f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24444g;

    /* renamed from: h, reason: collision with root package name */
    public n7.a f24445h;

    /* renamed from: i, reason: collision with root package name */
    public final q6.a f24446i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f24447k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f24448l;

    /* renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f24449m;

    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(Context context) {
        WorkSource workSource;
        ApplicationInfo a7;
        String packageName = context.getPackageName();
        this.f24438a = new Object();
        this.f24440c = 0;
        this.f24443f = new HashSet();
        this.f24444g = true;
        this.f24446i = q6.a.f22039a;
        this.f24447k = new HashMap();
        this.f24448l = new AtomicInteger(0);
        v.f("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        this.f24445h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new i0(sb2.toString());
        }
        this.f24439b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        if (f.b(context)) {
            int i5 = e.f22050a;
            packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    a7 = c.a(context).a(0, packageName);
                } catch (PackageManager.NameNotFoundException unused) {
                    w0.d("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
                if (a7 == null) {
                    w0.d("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                } else {
                    int i10 = a7.uid;
                    workSource = new WorkSource();
                    f.a(workSource, i10, packageName);
                    if (workSource != null) {
                        try {
                            this.f24439b.setWorkSource(workSource);
                        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e7) {
                            String obj = e7.toString();
                            w0.a("WakeLock", b5.ERROR, obj, null);
                            w0.b(f5.FATAL, obj, null);
                            Log.wtf("WakeLock", obj);
                        }
                    }
                }
            }
            workSource = null;
            if (workSource != null) {
            }
        }
        ScheduledExecutorService scheduledExecutorService = f24436o;
        if (scheduledExecutorService == null) {
            synchronized (f24437p) {
                try {
                    scheduledExecutorService = f24436o;
                    if (scheduledExecutorService == null) {
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f24436o = scheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f24449m = scheduledExecutorService;
    }

    public final void a(long j) {
        this.f24448l.incrementAndGet();
        long j6 = f24435n;
        long j10 = LongCompanionObject.MAX_VALUE;
        long max = Math.max(Math.min(LongCompanionObject.MAX_VALUE, j6), 1L);
        if (j > 0) {
            max = Math.min(j, max);
        }
        synchronized (this.f24438a) {
            try {
                if (!b()) {
                    this.f24445h = n7.a.f20860a;
                    this.f24439b.acquire();
                    this.f24446i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f24440c++;
                if (this.f24444g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f24447k.get(null);
                if (bVar == null) {
                    bVar = new b();
                    this.f24447k.put(null, bVar);
                }
                bVar.f24450a++;
                this.f24446i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (LongCompanionObject.MAX_VALUE - elapsedRealtime > max) {
                    j10 = elapsedRealtime + max;
                }
                if (j10 > this.f24442e) {
                    this.f24442e = j10;
                    ScheduledFuture scheduledFuture = this.f24441d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f24441d = this.f24449m.schedule(new androidx.core.widget.b(27, this), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z5;
        synchronized (this.f24438a) {
            z5 = this.f24440c > 0;
        }
        return z5;
    }

    public final void c() {
        if (this.f24448l.decrementAndGet() < 0) {
            w0.d("WakeLock", String.valueOf(this.j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f24438a) {
            try {
                if (this.f24444g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f24447k.containsKey(null)) {
                    b bVar = (b) this.f24447k.get(null);
                    if (bVar != null) {
                        int i5 = bVar.f24450a - 1;
                        bVar.f24450a = i5;
                        if (i5 == 0) {
                            this.f24447k.remove(null);
                        }
                    }
                } else {
                    w0.m("WakeLock", String.valueOf(this.j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f24443f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final void e() {
        synchronized (this.f24438a) {
            try {
                if (b()) {
                    if (this.f24444g) {
                        int i5 = this.f24440c - 1;
                        this.f24440c = i5;
                        if (i5 > 0) {
                            return;
                        }
                    } else {
                        this.f24440c = 0;
                    }
                    d();
                    Iterator it = this.f24447k.values().iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).f24450a = 0;
                    }
                    this.f24447k.clear();
                    ScheduledFuture scheduledFuture = this.f24441d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f24441d = null;
                        this.f24442e = 0L;
                    }
                    if (this.f24439b.isHeld()) {
                        try {
                            try {
                                this.f24439b.release();
                                if (this.f24445h != null) {
                                    this.f24445h = null;
                                }
                            } catch (RuntimeException e7) {
                                if (!e7.getClass().equals(RuntimeException.class)) {
                                    throw e7;
                                }
                                w0.e("WakeLock", String.valueOf(this.j).concat(" failed to release!"), e7);
                                if (this.f24445h != null) {
                                    this.f24445h = null;
                                }
                            }
                        } catch (Throwable th2) {
                            if (this.f24445h != null) {
                                this.f24445h = null;
                            }
                            throw th2;
                        }
                    } else {
                        w0.d("WakeLock", String.valueOf(this.j).concat(" should be held!"));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
