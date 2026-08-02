package ea;

import K9.h;
import K9.r;
import K9.t;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.stats.zzb;
import com.google.android.gms.internal.stats.zzh;
import com.google.android.gms.internal.stats.zzi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: ea.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4189a {

    /* renamed from: r, reason: collision with root package name */
    public static final long f45842r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s, reason: collision with root package name */
    public static volatile ScheduledExecutorService f45843s = null;

    /* renamed from: t, reason: collision with root package name */
    public static final Object f45844t = new Object();

    /* renamed from: u, reason: collision with root package name */
    public static volatile e f45845u = new c();

    /* renamed from: a, reason: collision with root package name */
    public final Object f45846a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f45847b;

    /* renamed from: c, reason: collision with root package name */
    public int f45848c;

    /* renamed from: d, reason: collision with root package name */
    public Future f45849d;

    /* renamed from: e, reason: collision with root package name */
    public long f45850e;

    /* renamed from: f, reason: collision with root package name */
    public final Set f45851f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f45852g;

    /* renamed from: h, reason: collision with root package name */
    public int f45853h;

    /* renamed from: i, reason: collision with root package name */
    public zzb f45854i;

    /* renamed from: j, reason: collision with root package name */
    public K9.e f45855j;

    /* renamed from: k, reason: collision with root package name */
    public WorkSource f45856k;

    /* renamed from: l, reason: collision with root package name */
    public final String f45857l;

    /* renamed from: m, reason: collision with root package name */
    public final String f45858m;

    /* renamed from: n, reason: collision with root package name */
    public final Context f45859n;

    /* renamed from: o, reason: collision with root package name */
    public final Map f45860o;

    /* renamed from: p, reason: collision with root package name */
    public AtomicInteger f45861p;

    /* renamed from: q, reason: collision with root package name */
    public final ScheduledExecutorService f45862q;

    public C4189a(Context context, int i10, String str) {
        String packageName = context.getPackageName();
        this.f45846a = new Object();
        this.f45848c = 0;
        this.f45851f = new HashSet();
        this.f45852g = true;
        this.f45855j = h.c();
        this.f45860o = new HashMap();
        this.f45861p = new AtomicInteger(0);
        AbstractC3191o.n(context, "WakeLock: context must not be null");
        AbstractC3191o.h(str, "WakeLock: wakeLockName must not be empty");
        this.f45859n = context.getApplicationContext();
        this.f45858m = str;
        this.f45854i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f45857l = str;
        } else {
            String valueOf = String.valueOf(str);
            this.f45857l = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb2.toString());
        }
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i10, str);
        this.f45847b = newWakeLock;
        if (t.c(context)) {
            WorkSource b10 = t.b(context, r.b(packageName) ? context.getPackageName() : packageName);
            this.f45856k = b10;
            if (b10 != null) {
                i(newWakeLock, b10);
            }
        }
        ScheduledExecutorService scheduledExecutorService = f45843s;
        if (scheduledExecutorService == null) {
            synchronized (f45844t) {
                try {
                    scheduledExecutorService = f45843s;
                    if (scheduledExecutorService == null) {
                        zzh.zza();
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f45843s = scheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f45862q = scheduledExecutorService;
    }

    public static /* synthetic */ void e(C4189a c4189a) {
        synchronized (c4189a.f45846a) {
            try {
                if (c4189a.b()) {
                    Log.e("WakeLock", String.valueOf(c4189a.f45857l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    c4189a.g();
                    if (c4189a.b()) {
                        c4189a.f45848c = 1;
                        c4189a.h(0);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
            Log.wtf("WakeLock", e10.toString());
        }
    }

    public void a(long j10) {
        this.f45861p.incrementAndGet();
        long j11 = f45842r;
        long j12 = LongCompanionObject.MAX_VALUE;
        long max = Math.max(Math.min(LongCompanionObject.MAX_VALUE, j11), 1L);
        if (j10 > 0) {
            max = Math.min(j10, max);
        }
        synchronized (this.f45846a) {
            try {
                if (!b()) {
                    this.f45854i = zzb.zza(false, null);
                    this.f45847b.acquire();
                    this.f45855j.b();
                }
                this.f45848c++;
                this.f45853h++;
                f(null);
                d dVar = (d) this.f45860o.get(null);
                if (dVar == null) {
                    dVar = new d(null);
                    this.f45860o.put(null, dVar);
                }
                dVar.f45864a++;
                long b10 = this.f45855j.b();
                if (LongCompanionObject.MAX_VALUE - b10 > max) {
                    j12 = b10 + max;
                }
                if (j12 > this.f45850e) {
                    this.f45850e = j12;
                    Future future = this.f45849d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f45849d = this.f45862q.schedule(new Runnable() { // from class: ea.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4189a.e(C4189a.this);
                        }
                    }, max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f45846a) {
            z10 = this.f45848c > 0;
        }
        return z10;
    }

    public void c() {
        if (this.f45861p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f45857l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f45846a) {
            try {
                f(null);
                if (this.f45860o.containsKey(null)) {
                    d dVar = (d) this.f45860o.get(null);
                    if (dVar != null) {
                        int i10 = dVar.f45864a - 1;
                        dVar.f45864a = i10;
                        if (i10 == 0) {
                            this.f45860o.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f45857l).concat(" counter does not exist"));
                }
                h(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d(boolean z10) {
        synchronized (this.f45846a) {
            this.f45852g = z10;
        }
    }

    public final String f(String str) {
        if (this.f45852g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    public final void g() {
        if (this.f45851f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f45851f);
        this.f45851f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(arrayList.get(0));
        throw null;
    }

    public final void h(int i10) {
        synchronized (this.f45846a) {
            try {
                if (b()) {
                    if (this.f45852g) {
                        int i11 = this.f45848c - 1;
                        this.f45848c = i11;
                        if (i11 > 0) {
                            return;
                        }
                    } else {
                        this.f45848c = 0;
                    }
                    g();
                    Iterator it = this.f45860o.values().iterator();
                    while (it.hasNext()) {
                        ((d) it.next()).f45864a = 0;
                    }
                    this.f45860o.clear();
                    Future future = this.f45849d;
                    if (future != null) {
                        future.cancel(false);
                        this.f45849d = null;
                        this.f45850e = 0L;
                    }
                    this.f45853h = 0;
                    if (this.f45847b.isHeld()) {
                        try {
                            try {
                                this.f45847b.release();
                                if (this.f45854i != null) {
                                    this.f45854i = null;
                                }
                            } catch (RuntimeException e10) {
                                if (!e10.getClass().equals(RuntimeException.class)) {
                                    throw e10;
                                }
                                Log.e("WakeLock", String.valueOf(this.f45857l).concat(" failed to release!"), e10);
                                if (this.f45854i != null) {
                                    this.f45854i = null;
                                }
                            }
                        } catch (Throwable th2) {
                            if (this.f45854i != null) {
                                this.f45854i = null;
                            }
                            throw th2;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f45857l).concat(" should be held!"));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
