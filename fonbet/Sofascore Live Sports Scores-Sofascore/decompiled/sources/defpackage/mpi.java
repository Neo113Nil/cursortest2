package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.PowerManager;
import android.webkit.WebView;
import com.appsflyer.internal.i;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzblj;
import com.google.android.gms.internal.ads.zzcjs;
import com.google.android.gms.internal.ads.zzfdi;
import com.google.android.gms.internal.ads.zzfdl;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class mpi implements Runnable {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;

    public mpi(FirebaseMessaging firebaseMessaging, long j) {
        this.a = 0;
        this.e = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
        this.d = firebaseMessaging;
        this.b = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.c = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.d).b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean b() {
        try {
        } catch (IOException e) {
            String message = e.getMessage();
            if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message)) {
                e.getMessage();
                return false;
            }
            if (e.getMessage() != null) {
                throw e;
            }
        } catch (SecurityException unused) {
        }
        return ((FirebaseMessaging) this.d).a() != null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.c;
                g7h s = g7h.s();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.d;
                if (s.w(firebaseMessaging.b)) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.k = true;
                        }
                        if (!firebaseMessaging.i.e()) {
                            synchronized (firebaseMessaging) {
                                firebaseMessaging.k = false;
                            }
                            if (!g7h.s().w(firebaseMessaging.b)) {
                                return;
                            }
                        } else if (!g7h.s().v(firebaseMessaging.b) || a()) {
                            if (b()) {
                                synchronized (firebaseMessaging) {
                                    firebaseMessaging.k = false;
                                }
                            } else {
                                firebaseMessaging.g(this.b);
                            }
                            if (!g7h.s().w(firebaseMessaging.b)) {
                                return;
                            }
                        } else {
                            lpi lpiVar = new lpi();
                            lpiVar.a = this;
                            lpiVar.a();
                            if (!g7h.s().w(firebaseMessaging.b)) {
                                return;
                            }
                        }
                    } catch (IOException e) {
                        e.getMessage();
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.k = false;
                            if (!g7h.s().w(firebaseMessaging.b)) {
                                return;
                            }
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th) {
                    if (g7h.s().w(firebaseMessaging.b)) {
                        wakeLock.release();
                    }
                    throw th;
                }
            case 1:
                ((xx3) this.e).execute((jqi) this.c);
                return;
            case 2:
                n8p n8pVar = (n8p) this.d;
                try {
                    WebView webView = new WebView((Context) this.c);
                    long j = this.b;
                    sen senVar = (sen) this.e;
                    pen s2 = qen.s();
                    s2.f(j);
                    s2.g(System.currentTimeMillis());
                    qen qenVar = (qen) s2.c();
                    senVar.b();
                    ((uen) senVar.b).x(qenVar);
                    n8pVar.d(webView);
                    return;
                } catch (Throwable th2) {
                    n8pVar.e(th2);
                    return;
                }
            case 3:
                HashMap l = i.l("event", "precacheComplete");
                l.put("src", (String) this.c);
                l.put("cachedSrc", (String) this.d);
                l.put("totalDuration", Long.toString(this.b));
                ((zzcjs) this.e).q(l);
                return;
            default:
                long elapsedRealtime = zzt.zzk().elapsedRealtime() - this.b;
                boolean booleanValue = ((Boolean) zzblj.a.c()).booleanValue();
                Bundle bundle = (Bundle) this.e;
                zzfdi zzfdiVar = (zzfdi) this.d;
                if (booleanValue) {
                    String canonicalName = zzfdiVar.getClass().getCanonicalName();
                    if (canonicalName == null) {
                        canonicalName = "";
                    }
                    StringBuilder sb = new StringBuilder(canonicalName.length() + 25 + String.valueOf(elapsedRealtime).length());
                    wt3.A("Signal runtime (ms) : ", canonicalName, sb, " = ");
                    sb.append(elapsedRealtime);
                    zze.zza(sb.toString());
                }
                if (((Boolean) zzba.zzc().a(zzbjg.S2)).booleanValue()) {
                    if (((Boolean) zzba.zzc().a(zzbjg.Y2)).booleanValue()) {
                        synchronized (((zzfdl) this.c)) {
                            int zzb = zzfdiVar.zzb();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(zzb).length() + 3);
                            sb2.append("sig");
                            sb2.append(zzb);
                            bundle.putLong(sb2.toString(), elapsedRealtime);
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append(((lv4) this.d).toString());
                sb.append("(scheduled in SynchronizationContext with delay of ");
                return lnb.l(this.b, ")", sb);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ mpi(Context context, n8p n8pVar, sen senVar, long j) {
        this.a = 2;
        this.c = context;
        this.d = n8pVar;
        this.e = senVar;
        this.b = j;
    }

    public /* synthetic */ mpi(zzfdl zzfdlVar, long j, zzfdi zzfdiVar, Bundle bundle) {
        this.a = 4;
        this.c = zzfdlVar;
        this.b = j;
        this.d = zzfdiVar;
        this.e = bundle;
    }

    public /* synthetic */ mpi(int i, long j, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.e = obj;
        this.c = obj2;
        this.d = obj3;
        this.b = j;
    }
}
