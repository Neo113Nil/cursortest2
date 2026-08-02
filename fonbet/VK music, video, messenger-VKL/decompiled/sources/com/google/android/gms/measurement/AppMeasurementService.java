package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.legacy.content.WakefulBroadcastReceiver;
import xsna.cd01;
import xsna.di01;
import xsna.ei01;
import xsna.fi01;
import xsna.k901;
import xsna.mb01;
import xsna.qj01;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class AppMeasurementService extends Service implements ei01 {
    public fi01 b;

    @Override // xsna.ei01
    public final void a(@NonNull Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = WakefulBroadcastReceiver.a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray<PowerManager.WakeLock> sparseArray2 = WakefulBroadcastReceiver.a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.ei01
    public final void b(@NonNull JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final fi01 c() {
        if (this.b == null) {
            this.b = new fi01(this);
        }
        return this.b;
    }

    @Override // android.app.Service
    @Nullable
    public final IBinder onBind(@NonNull Intent intent) {
        fi01 c = c();
        if (intent == null) {
            c.a().i.a("onBind called with null intent");
            return null;
        }
        c.getClass();
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new cd01(qj01.O(c.a));
        }
        c.a().l.b(action, "onBind received unknown action");
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        k901 k901Var = mb01.r(c().a, null, null).j;
        mb01.k(k901Var);
        k901Var.q.a("Local AppMeasurementService is starting up");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        k901 k901Var = mb01.r(c().a, null, null).j;
        mb01.k(k901Var);
        k901Var.q.a("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(@NonNull Intent intent) {
        fi01 c = c();
        if (intent == null) {
            c.a().i.a("onRebind called with null intent");
            return;
        }
        c.getClass();
        c.a().q.b(intent.getAction(), "onRebind called. action");
    }

    @Override // android.app.Service
    public final int onStartCommand(@NonNull final Intent intent, int i, final int i2) {
        final fi01 c = c();
        final k901 k901Var = mb01.r(c.a, null, null).j;
        mb01.k(k901Var);
        if (intent == null) {
            k901Var.l.a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        k901Var.q.c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        Runnable runnable = new Runnable() { // from class: xsna.ci01
            @Override // java.lang.Runnable
            public final void run() {
                fi01 fi01Var = fi01.this;
                ei01 ei01Var = (ei01) fi01Var.a;
                int i3 = i2;
                if (ei01Var.zzc(i3)) {
                    k901Var.q.b(Integer.valueOf(i3), "Local AppMeasurementService processed last upload request. StartId");
                    fi01Var.a().q.a("Completed wakeful intent.");
                    ei01Var.a(intent);
                }
            }
        };
        qj01 O = qj01.O(c.a);
        O.d().s(new di01(O, runnable));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(@NonNull Intent intent) {
        fi01 c = c();
        if (intent == null) {
            c.a().i.a("onUnbind called with null intent");
            return true;
        }
        c.getClass();
        c.a().q.b(intent.getAction(), "onUnbind called for intent. action");
        return true;
    }

    @Override // xsna.ei01
    public final boolean zzc(int i) {
        return stopSelfResult(i);
    }
}
