package t9;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.AbstractC3175h;
import com.google.android.gms.common.C3171d;
import com.google.android.gms.common.C3172e;
import com.google.android.gms.common.C3173f;
import com.google.android.gms.common.ServiceConnectionC3116a;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: t9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6452a {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f65776h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public static volatile C6452a f65777i;

    /* renamed from: a, reason: collision with root package name */
    public ServiceConnectionC3116a f65778a;

    /* renamed from: b, reason: collision with root package name */
    public zzf f65779b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f65780c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f65781d;

    /* renamed from: e, reason: collision with root package name */
    public c f65782e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f65783f;

    /* renamed from: g, reason: collision with root package name */
    public final long f65784g;

    /* renamed from: t9.a$a, reason: collision with other inner class name */
    public static final class C0912a {

        /* renamed from: a, reason: collision with root package name */
        public final String f65785a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f65786b;

        public C0912a(String str, boolean z10) {
            this.f65785a = str;
            this.f65786b = z10;
        }

        public String a() {
            return this.f65785a;
        }

        public boolean b() {
            return this.f65786b;
        }

        public String toString() {
            return "{" + this.f65785a + "}" + this.f65786b;
        }
    }

    public C6452a(Context context) {
        this(context, 30000L, false, false);
    }

    public static C0912a a(Context context) {
        C0912a h10;
        long elapsedRealtime;
        C6452a c6452a = f65777i;
        if (c6452a == null) {
            synchronized (f65776h) {
                try {
                    c6452a = f65777i;
                    if (c6452a == null) {
                        c6452a = new C6452a(context);
                        f65777i = c6452a;
                    }
                } finally {
                }
            }
        }
        C6452a c6452a2 = c6452a;
        g a10 = g.a(context);
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        int i10 = -1;
        try {
            h10 = c6452a2.h(-1);
            elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime2;
            c6452a2.g(h10, true, 0.0f, elapsedRealtime, "", null);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            a10.c(35401, 0, elapsedRealtime2, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - elapsedRealtime2));
            elapsedRealtime2 = elapsedRealtime2;
            Log.i("AdvertisingIdClient", "GetInfoInternal elapse " + elapsedRealtime + "ms");
            return h10;
        } catch (Throwable th3) {
            th = th3;
            a10 = a10;
            elapsedRealtime2 = elapsedRealtime2;
            Throwable th4 = th;
            c6452a2.g(null, true, 0.0f, -1L, "", th4);
            if (th4 instanceof IOException) {
                i10 = 1;
            } else if (th4 instanceof C3172e) {
                i10 = 9;
            } else if (th4 instanceof C3173f) {
                i10 = 16;
            } else if (th4 instanceof IllegalStateException) {
                i10 = 8;
            }
            a10.c(35401, i10, elapsedRealtime2, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - elapsedRealtime2));
            throw th4;
        }
    }

    public final void c() {
        AbstractC3191o.l("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f65783f == null || this.f65778a == null) {
                    return;
                }
                try {
                    if (this.f65780c) {
                        J9.b.b().c(this.f65783f, this.f65778a);
                    }
                } catch (Throwable th2) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th2);
                }
                this.f65780c = false;
                this.f65779b = null;
                this.f65778a = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void d() {
        synchronized (this.f65781d) {
            c cVar = this.f65782e;
            if (cVar != null) {
                cVar.f65790c.countDown();
                try {
                    this.f65782e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.f65784g;
            if (j10 > 0) {
                this.f65782e = new c(this, j10);
            }
        }
    }

    public final void e(boolean z10) {
        IOException iOException;
        AbstractC3191o.l("Calling this from your main thread can lead to deadlock");
        if (z10) {
            d();
        }
        synchronized (this) {
            try {
                if (this.f65780c) {
                    return;
                }
                Context context = this.f65783f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int j10 = C3171d.h().j(context, AbstractC3175h.f32612a);
                    if (j10 != 0 && j10 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC3116a serviceConnectionC3116a = new ServiceConnectionC3116a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!J9.b.b().a(context, intent, serviceConnectionC3116a, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f65778a = serviceConnectionC3116a;
                        try {
                            try {
                                this.f65779b = zze.zza(serviceConnectionC3116a.b(10000L, TimeUnit.MILLISECONDS));
                                this.f65780c = true;
                            } catch (InterruptedException unused) {
                                throw new IOException("Interrupted exception");
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new C3172e(9);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void f() {
        try {
            if (!this.f65780c) {
                try {
                    e(false);
                    if (!this.f65780c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e10) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                }
            }
        } finally {
        }
    }

    public final void finalize() {
        c();
        super.finalize();
    }

    public final boolean g(C0912a c0912a, boolean z10, float f10, long j10, String str, Throwable th2) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_context", "1");
        if (c0912a != null) {
            hashMap.put("limit_ad_tracking", true != c0912a.b() ? "0" : "1");
            String a10 = c0912a.a();
            if (a10 != null) {
                hashMap.put("ad_id_size", Integer.toString(a10.length()));
            }
        }
        if (th2 != null) {
            hashMap.put("error", th2.getClass().getName());
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j10));
        new b(this, hashMap).start();
        return true;
    }

    public final C0912a h(int i10) {
        C0912a c0912a;
        AbstractC3191o.l("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            f();
            AbstractC3191o.m(this.f65778a);
            AbstractC3191o.m(this.f65779b);
            try {
                c0912a = new C0912a(this.f65779b.zzc(), this.f65779b.zze(true));
            } catch (RemoteException e10) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e10);
                throw new IOException("Remote exception", e10);
            }
        }
        d();
        return c0912a;
    }

    public C6452a(Context context, long j10, boolean z10, boolean z11) {
        this.f65781d = new Object();
        AbstractC3191o.m(context);
        this.f65783f = context.getApplicationContext();
        this.f65780c = false;
        this.f65784g = j10;
    }

    public static void b(boolean z10) {
    }
}
