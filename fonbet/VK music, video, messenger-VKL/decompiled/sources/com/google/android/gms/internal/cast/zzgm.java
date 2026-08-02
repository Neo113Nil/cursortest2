package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.c;
import java.util.concurrent.atomic.AtomicReference;
import xsna.olc;
import xsna.u2u;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzgm extends u2u {
    private final AtomicReference zze;

    public zzgm(Context context, Looper looper, olc olcVar, c.b bVar, c.InterfaceC0114c interfaceC0114c) {
        super(context, looper, 41, olcVar, bVar, interfaceC0114c);
        this.zze = new AtomicReference();
    }

    @Override // xsna.rd6
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingService");
        return queryLocalInterface instanceof zzgh ? (zzgh) queryLocalInterface : new zzgh(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.rd6, com.google.android.gms.common.api.a.f
    public final void disconnect() {
        try {
            byte[] bArr = null;
            zzgl zzglVar = (zzgl) this.zze.getAndSet(null);
            if (zzglVar != null) {
                ((zzgh) getService()).zzf(zzglVar, new zzgk(bArr));
            }
        } catch (RemoteException e) {
            Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener from remote:", e);
        }
        super.disconnect();
    }

    @Override // xsna.rd6
    public final Feature[] getApiFeatures() {
        return zzfr.zzg;
    }

    @Override // xsna.rd6, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12600000;
    }

    @Override // xsna.rd6
    public final String getServiceDescriptor() {
        return "com.google.android.gms.usagereporting.internal.IUsageReportingService";
    }

    @Override // xsna.rd6
    public final String getStartServiceAction() {
        return "com.google.android.gms.usagereporting.service.START";
    }

    @Override // xsna.rd6
    public final boolean usesClientTelemetry() {
        return true;
    }
}
