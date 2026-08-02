package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sofascore.model.FirebaseBundle;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ha0 implements rq4 {
    public final /* synthetic */ ia0 a;

    public ha0(ia0 ia0Var) {
        this.a = ia0Var;
    }

    @Override // defpackage.rq4
    public final void onStart(u6b u6bVar) {
        Object u2gVar;
        SharedPreferences d;
        u6bVar.getClass();
        ia0 ia0Var = this.a;
        ia0Var.b = true;
        ia0 ia0Var2 = ia0.q;
        ok3.i(ia0Var);
        ia0 ia0Var3 = this.a;
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = ia0Var3.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.getClass();
        edit.putLong("SESSION_TIME_PREF", System.currentTimeMillis());
        Unit unit = Unit.a;
        edit.apply();
        ia0 ia0Var4 = this.a;
        SharedPreferences sharedPreferences2 = uic.j;
        if (sharedPreferences2 == null) {
            Context applicationContext2 = ia0Var4.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences2 = a5f.d(applicationContext2);
                uic.j = sharedPreferences2;
            }
            sharedPreferences2.getClass();
        }
        rq3 rq3Var = null;
        if (!sharedPreferences2.getBoolean("retained_12_48h", false)) {
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences sharedPreferences3 = uic.j;
            if (sharedPreferences3 == null) {
                Context applicationContext3 = ia0Var4.getApplicationContext();
                synchronized (uic.i) {
                    sharedPreferences3 = a5f.d(applicationContext3);
                    uic.j = sharedPreferences3;
                }
                sharedPreferences3.getClass();
            }
            long j = currentTimeMillis - sharedPreferences3.getLong("PREF_FIRST_RUN_TIMESTAMP", currentTimeMillis);
            if (43200000 <= j && j <= 172800000) {
                SharedPreferences sharedPreferences4 = uic.j;
                if (sharedPreferences4 == null) {
                    Context applicationContext4 = ia0Var4.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences4 = a5f.d(applicationContext4);
                        uic.j = sharedPreferences4;
                    }
                    sharedPreferences4.getClass();
                }
                wt3.v(sharedPreferences4, "retained_12_48h", true);
                nv.N(ia0Var4, null, "retained_12_48h");
                nv.Q(ia0Var4, "retained_12_48h");
                nv.O(ia0Var4, "retained_12_48h", null);
            }
        }
        y65 y65Var = this.a.j;
        if (y65Var == null) {
            Intrinsics.i("networkMonitor");
            throw null;
        }
        had hadVar = (had) y65Var.get();
        if (!hadVar.f) {
            try {
                p2g p2gVar = w2g.b;
                ConnectivityManager connectivityManager = hadVar.b;
                if (connectivityManager != null) {
                    connectivityManager.registerDefaultNetworkCallback(hadVar.e);
                    u2gVar = Unit.a;
                } else {
                    u2gVar = null;
                }
            } catch (Throwable th) {
                p2g p2gVar2 = w2g.b;
                u2gVar = new u2g(th);
            }
            if (!(u2gVar instanceof u2g)) {
                hadVar.f = true;
            }
        }
        ia0 ia0Var5 = this.a;
        int i = 2;
        if (!ia0Var5.c) {
            ga0 ga0Var = new ga0(ia0Var5, rq3Var, i);
            hs4 hs4Var = z45.a;
            ia0Var5.b(rob.a, ga0Var);
        }
        ia0 ia0Var6 = this.a;
        hs4 hs4Var2 = z45.a;
        ia0Var6.b(hq4.c, new fa0(ia0Var6, rq3Var, i));
    }

    @Override // defpackage.rq4
    public final void onStop(u6b u6bVar) {
        ia0 ia0Var = this.a;
        ia0Var.b = false;
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = ia0Var.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        firebaseBundle.putLong("time_on_screen", currentTimeMillis - sharedPreferences.getLong("SESSION_TIME_PREF", currentTimeMillis));
        firebaseBundle.putBoolean("turn_off_connection", true);
        ia0 ia0Var2 = ia0.q;
        ((f5d) me4.e()).c("total_session_time", firebaseBundle);
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(ia0Var);
        firebaseAnalytics.getClass();
        firebaseAnalytics.a.e(n9e.K(firebaseBundle), null, "total_session_time", false);
        y65 y65Var = this.a.j;
        if (y65Var == null) {
            Intrinsics.i("networkMonitor");
            throw null;
        }
        had hadVar = (had) y65Var.get();
        if (hadVar.f) {
            try {
                ConnectivityManager connectivityManager = hadVar.b;
                if (connectivityManager != null) {
                    connectivityManager.unregisterNetworkCallback(hadVar.e);
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable unused) {
            }
            hadVar.f = false;
        }
    }
}
