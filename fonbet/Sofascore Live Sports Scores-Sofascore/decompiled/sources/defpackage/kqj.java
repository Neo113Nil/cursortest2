package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.PowerManager;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzlu;
import com.google.android.gms.measurement.internal.zzmb;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzpp;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kqj implements Runnable {
    public static final Object g = new Object();
    public static Boolean h;
    public static Boolean i;
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public kqj(iqj iqjVar, Context context, pic picVar, long j) {
        this.a = 0;
        this.f = iqjVar;
        this.c = context;
        this.b = j;
        this.d = picVar;
        this.e = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        synchronized (g) {
            try {
                Boolean bool = i;
                booleanValue = bool == null ? bool != null ? bool.booleanValue() : context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 : bool.booleanValue();
                i = Boolean.valueOf(booleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean b(Context context) {
        boolean booleanValue;
        synchronized (g) {
            try {
                Boolean bool = h;
                booleanValue = bool == null ? bool != null ? bool.booleanValue() : context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0 : bool.booleanValue();
                h = Boolean.valueOf(booleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public synchronized boolean c() {
        boolean z;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) ((Context) this.c).getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.a;
        long j = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.c;
        switch (i2) {
            case 0:
                iqj iqjVar = (iqj) obj3;
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) obj;
                Context context = (Context) obj4;
                if (b(context)) {
                    wakeLock.acquire(180000L);
                }
                try {
                    try {
                        iqjVar.a(true);
                        if (!((pic) obj2).e()) {
                            iqjVar.a(false);
                            if (!b(context)) {
                                return;
                            }
                        } else if (!a(context) || c()) {
                            if (iqjVar.b()) {
                                iqjVar.a(false);
                            } else {
                                iqjVar.c(j);
                            }
                            if (!b(context)) {
                                return;
                            }
                        } else {
                            jqj jqjVar = new jqj();
                            jqjVar.a = this;
                            context.registerReceiver(jqjVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                            if (!b(context)) {
                                return;
                            }
                        }
                    } catch (IOException e) {
                        e.getMessage();
                        iqjVar.a(false);
                        if (!b(context)) {
                            return;
                        }
                    }
                    try {
                        wakeLock.release();
                        return;
                    } catch (RuntimeException unused) {
                        return;
                    }
                } catch (Throwable th) {
                    if (b(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused2) {
                        }
                    }
                    throw th;
                }
            case 1:
                String str = (String) obj2;
                zzpg zzpgVar = ((zzjd) obj3).a;
                String str2 = (String) obj4;
                if (str2 == null) {
                    zzpgVar.d().Q();
                    String str3 = zzpgVar.G;
                    if (str3 == null || str3.equals(str)) {
                        zzpgVar.G = str;
                        zzpgVar.F = null;
                        return;
                    }
                    return;
                }
                zzlu zzluVar = new zzlu((String) obj, str2, j);
                zzpgVar.d().Q();
                String str4 = zzpgVar.G;
                if (str4 != null) {
                    str4.equals(str);
                }
                zzpgVar.G = str;
                zzpgVar.F = zzluVar;
                return;
            case 2:
                Object obj5 = this.e;
                ((zzlj) obj3).b0(this.b, obj5, (String) obj4, (String) obj2);
                return;
            default:
                Bundle bundle = (Bundle) obj4;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                zzmb zzmbVar = (zzmb) obj3;
                zzpp zzppVar = ((zzic) zzmbVar.b).i;
                zzic.k(zzppVar);
                zzmbVar.W((zzlu) obj2, (zzlu) obj, this.b, true, zzppVar.a0("screen_view", bundle, null, false));
                return;
        }
    }

    public kqj(zzmb zzmbVar, Bundle bundle, zzlu zzluVar, zzlu zzluVar2, long j) {
        this.a = 3;
        this.c = bundle;
        this.d = zzluVar;
        this.e = zzluVar2;
        this.b = j;
        Objects.requireNonNull(zzmbVar);
        this.f = zzmbVar;
    }

    public /* synthetic */ kqj(Object obj, String str, String str2, Object obj2, long j, int i2) {
        this.a = i2;
        this.c = str;
        this.d = str2;
        this.e = obj2;
        this.b = j;
        this.f = obj;
    }
}
