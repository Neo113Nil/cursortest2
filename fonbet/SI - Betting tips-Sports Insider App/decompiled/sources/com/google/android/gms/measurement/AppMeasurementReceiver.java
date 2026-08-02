package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import r1.a;
import s7.f1;
import s7.n0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends a {

    /* renamed from: c, reason: collision with root package name */
    public r7.a f5778c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f5778c == null) {
            this.f5778c = new r7.a(5, this);
        }
        r7.a aVar = this.f5778c;
        aVar.getClass();
        n0 n0Var = f1.s(context, null, null).f22745f;
        f1.m(n0Var);
        if (intent == null) {
            n0Var.f22906i.a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        n0Var.f22910n.b(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                n0Var.f22906i.a("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        n0Var.f22910n.a("Starting wakeful intent.");
        ((AppMeasurementReceiver) aVar.f22318b).getClass();
        SparseArray sparseArray = a.f22197a;
        synchronized (sparseArray) {
            try {
                int i5 = a.f22198b;
                int i10 = i5 + 1;
                a.f22198b = i10;
                if (i10 <= 0) {
                    a.f22198b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i5);
                ComponentName startService = context.startService(className);
                if (startService == null) {
                    return;
                }
                PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                newWakeLock.setReferenceCounted(false);
                newWakeLock.acquire(60000L);
                sparseArray.put(i5, newWakeLock);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
