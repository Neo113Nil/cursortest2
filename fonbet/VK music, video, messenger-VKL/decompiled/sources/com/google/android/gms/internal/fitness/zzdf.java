package com.google.android.gms.internal.fitness;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.result.BleDevicesResult;
import xsna.c501;
import xsna.cv90;
import xsna.ehz;
import xsna.exc0;
import xsna.f801;
import xsna.fhz;
import xsna.me7;
import xsna.xo9;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzdf {
    public final cv90<Status> claimBleDevice(c cVar, BleDevice bleDevice) {
        return cVar.b(new zzda(this, cVar, bleDevice));
    }

    public final cv90<BleDevicesResult> listClaimedBleDevices(c cVar) {
        return cVar.a(new zzdc(this, cVar));
    }

    public final cv90<Status> startBleScan(c cVar, StartBleScanRequest startBleScanRequest) {
        c501 c501Var = c501.b;
        startBleScanRequest.getClass();
        exc0.i(null);
        throw null;
    }

    public final cv90<Status> stopBleScan(c cVar, me7 me7Var) {
        f801 f801Var;
        c501 c501Var = c501.b;
        Looper d = cVar.d();
        c501Var.getClass();
        ehz a = fhz.a(d, me7Var, me7.class.getSimpleName());
        synchronized (c501Var.a) {
            try {
                ehz.a aVar = a.b;
                if (aVar == null) {
                    f801Var = null;
                } else {
                    f801Var = (f801) c501Var.a.get(aVar);
                    if (f801Var != null) {
                        throw null;
                    }
                }
            } finally {
            }
        }
        return f801Var == null ? xo9.p(Status.f, cVar) : cVar.a(new zzcy(this, cVar, f801Var));
    }

    public final cv90<Status> unclaimBleDevice(c cVar, BleDevice bleDevice) {
        return unclaimBleDevice(cVar, bleDevice.b);
    }

    public final cv90<Status> claimBleDevice(c cVar, String str) {
        return cVar.b(new zzcz(this, cVar, str));
    }

    public final cv90<Status> unclaimBleDevice(c cVar, String str) {
        return cVar.b(new zzdb(this, cVar, str));
    }
}
