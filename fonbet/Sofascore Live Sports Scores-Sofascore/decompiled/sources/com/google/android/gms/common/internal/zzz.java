package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzz extends zzb implements IGmsCallbacks {
    public zzz() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) com.google.android.gms.internal.common.zzc.a(parcel, Bundle.CREATOR);
            com.google.android.gms.internal.common.zzc.c(parcel);
            zzd zzdVar = (zzd) this;
            Preconditions.j(zzdVar.a, "onPostInitComplete can be called only once per call to getRemoteService");
            zzdVar.a.p(readInt, readStrongBinder, bundle, zzdVar.b);
            zzdVar.a = null;
        } else if (i == 2) {
            parcel.readInt();
            com.google.android.gms.internal.common.zzc.c(parcel);
            new Exception();
        } else {
            if (i != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            zzj zzjVar = (zzj) com.google.android.gms.internal.common.zzc.a(parcel, zzj.CREATOR);
            com.google.android.gms.internal.common.zzc.c(parcel);
            zzd zzdVar2 = (zzd) this;
            BaseGmsClient baseGmsClient = zzdVar2.a;
            Preconditions.j(baseGmsClient, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            Preconditions.i(zzjVar);
            baseGmsClient.C = zzjVar;
            if (baseGmsClient.usesClientTelemetry()) {
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar.d;
                RootTelemetryConfigManager a = RootTelemetryConfigManager.a();
                RootTelemetryConfiguration rootTelemetryConfiguration = connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.a;
                synchronized (a) {
                    if (rootTelemetryConfiguration == null) {
                        rootTelemetryConfiguration = RootTelemetryConfigManager.c;
                    } else {
                        RootTelemetryConfiguration rootTelemetryConfiguration2 = a.a;
                        if (rootTelemetryConfiguration2 != null) {
                            if (rootTelemetryConfiguration2.a < rootTelemetryConfiguration.a) {
                            }
                        }
                    }
                    a.a = rootTelemetryConfiguration;
                }
            }
            Bundle bundle2 = zzjVar.a;
            Preconditions.j(zzdVar2.a, "onPostInitComplete can be called only once per call to getRemoteService");
            zzdVar2.a.p(readInt2, readStrongBinder2, bundle2, zzdVar2.b);
            zzdVar2.a = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
