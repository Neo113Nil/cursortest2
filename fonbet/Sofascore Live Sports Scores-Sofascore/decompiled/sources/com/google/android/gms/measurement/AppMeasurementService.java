package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zznp;
import com.google.android.gms.measurement.internal.zznt;
import com.google.android.gms.measurement.internal.zzpg;
import defpackage.g6n;
import defpackage.qzk;
import defpackage.vvo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class AppMeasurementService extends Service implements zznp {
    public zznt a;

    @Override // com.google.android.gms.measurement.internal.zznp
    public final boolean a(int i) {
        return stopSelfResult(i);
    }

    @Override // com.google.android.gms.measurement.internal.zznp
    public final void b(Intent intent) {
        SparseArray sparseArray = qzk.a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = qzk.a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zznp
    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final zznt d() {
        zznt zzntVar = this.a;
        if (zzntVar != null) {
            return zzntVar;
        }
        zznt zzntVar2 = new zznt(this);
        this.a = zzntVar2;
        return zzntVar2;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        zznt d = d();
        if (intent == null) {
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzjd(zzpg.C(d.a));
        }
        "onBind received unknown action: ".concat(String.valueOf(action));
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        d().a.getClass().getSimpleName().concat(" is starting up.");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        d().a.getClass().getSimpleName().concat(" is shutting down.");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d();
        if (intent == null) {
            return;
        }
        "onRebind called. action: ".concat(String.valueOf(intent.getAction()));
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        zznt d = d();
        if (intent == null) {
            return 2;
        }
        Service service = d.a;
        zzgu zzguVar = zzic.r(service, null, null, null).f;
        zzic.m(zzguVar);
        String action = intent.getAction();
        zzguVar.o.c(Integer.valueOf(i2), action, "Local AppMeasurementService called. startId, action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        g6n g6nVar = new g6n(d, i2, zzguVar, intent);
        zzpg C = zzpg.C(service);
        C.d().Z(new vvo(d, C, g6nVar));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d();
        if (intent == null) {
            return true;
        }
        "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction()));
        return true;
    }
}
