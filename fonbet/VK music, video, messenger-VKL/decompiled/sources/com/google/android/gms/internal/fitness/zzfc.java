package com.google.android.gms.internal.fitness;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.result.BleDevicesResult;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Collections;
import xsna.cv90;
import xsna.exc0;
import xsna.me7;
import xsna.nnz0;
import xsna.xo9;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzfc {
    public static final Status zza = new Status(IronSourceConstants.errorCode_initSuccess);

    public final cv90<Status> claimBleDevice(c cVar, BleDevice bleDevice) {
        return xo9.p(zza, cVar);
    }

    public final cv90<BleDevicesResult> listClaimedBleDevices(c cVar) {
        BleDevicesResult bleDevicesResult = new BleDevicesResult(Collections.EMPTY_LIST, zza);
        exc0.a("Status code must not be SUCCESS", !bleDevicesResult.getStatus().i());
        nnz0 nnz0Var = new nnz0(cVar, bleDevicesResult);
        nnz0Var.setResult(bleDevicesResult);
        return nnz0Var;
    }

    public final cv90<Status> startBleScan(c cVar, StartBleScanRequest startBleScanRequest) {
        return xo9.p(zza, cVar);
    }

    public final cv90<Status> stopBleScan(c cVar, me7 me7Var) {
        return xo9.p(zza, cVar);
    }

    public final cv90<Status> unclaimBleDevice(c cVar, BleDevice bleDevice) {
        return xo9.p(zza, cVar);
    }

    public final cv90<Status> claimBleDevice(c cVar, String str) {
        return xo9.p(zza, cVar);
    }

    public final cv90<Status> unclaimBleDevice(c cVar, String str) {
        return xo9.p(zza, cVar);
    }
}
