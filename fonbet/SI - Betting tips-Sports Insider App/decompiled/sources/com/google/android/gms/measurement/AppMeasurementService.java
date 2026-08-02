package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import androidx.recyclerview.widget.f;
import io.sentry.android.core.w0;
import r7.a;
import s7.b3;
import s7.f1;
import s7.k1;
import s7.n0;
import s7.r3;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements b3 {

    /* renamed from: a, reason: collision with root package name */
    public a f5779a;

    @Override // s7.b3
    public final boolean a(int i5) {
        return stopSelfResult(i5);
    }

    @Override // s7.b3
    public final void b(Intent intent) {
        SparseArray sparseArray = r1.a.f22197a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = r1.a.f22197a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    w0.m("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // s7.b3
    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final a d() {
        if (this.f5779a == null) {
            this.f5779a = new a(8, this);
        }
        return this.f5779a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        a d10 = d();
        d10.getClass();
        if (intent == null) {
            w0.d("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new k1(r3.C((Service) d10.f22318b));
        }
        w0.m("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) d().f22318b).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) d().f22318b).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d();
        if (intent == null) {
            w0.d("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i5, int i10) {
        a d10 = d();
        if (intent == null) {
            d10.getClass();
            w0.m("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = (Service) d10.f22318b;
        n0 n0Var = f1.s(service, null, null).f22745f;
        f1.m(n0Var);
        String action = intent.getAction();
        n0Var.f22910n.c(Integer.valueOf(i10), action, "Local AppMeasurementService called. startId, action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        f fVar = new f(d10, i10, n0Var, intent);
        r3 C = r3.C(service);
        C.b().s(new s7.w0(d10, C, fVar));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d();
        if (intent == null) {
            w0.d("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }
}
