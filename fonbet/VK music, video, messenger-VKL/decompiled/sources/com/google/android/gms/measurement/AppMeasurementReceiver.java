package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.legacy.content.WakefulBroadcastReceiver;
import xsna.eo9;
import xsna.k901;
import xsna.mb01;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class AppMeasurementReceiver extends WakefulBroadcastReceiver {
    public eo9 c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (this.c == null) {
            this.c = new eo9(this);
        }
        eo9 eo9Var = this.c;
        eo9Var.getClass();
        k901 k901Var = mb01.r(context, null, null).j;
        mb01.k(k901Var);
        if (intent == null) {
            k901Var.l.a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        k901Var.q.b(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                k901Var.l.a("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        k901Var.q.a("Starting wakeful intent.");
        ((AppMeasurementReceiver) eo9Var.a).getClass();
        SparseArray<PowerManager.WakeLock> sparseArray = WakefulBroadcastReceiver.a;
        synchronized (sparseArray) {
            try {
                int i = WakefulBroadcastReceiver.b;
                int i2 = i + 1;
                WakefulBroadcastReceiver.b = i2;
                if (i2 <= 0) {
                    WakefulBroadcastReceiver.b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i);
                ComponentName startService = context.startService(className);
                if (startService == null) {
                    return;
                }
                PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                newWakeLock.setReferenceCounted(false);
                newWakeLock.acquire(60000L);
                sparseArray.put(i, newWakeLock);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
