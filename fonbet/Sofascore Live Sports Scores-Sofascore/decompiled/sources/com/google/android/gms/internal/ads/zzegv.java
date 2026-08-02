package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.ConnectionResult;
import defpackage.me4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzegv extends zzeha {
    public final Context g;
    public final VersionInfoParcel h;
    public final zzegu i;

    public zzegv(Context context, VersionInfoParcel versionInfoParcel, zzegu zzeguVar) {
        this.g = context;
        this.h = versionInfoParcel;
        this.i = zzeguVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeha, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void J(ConnectionResult connectionResult) {
        super.J(connectionResult);
        this.i.a(new RemoteException("Connection failed: ".concat(String.valueOf(connectionResult.d))));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.b) {
            if (!this.d) {
                this.d = true;
                try {
                    ((zzcbi) this.f.getService()).zzi(this.h.afmaVersion);
                    this.i.mo12zza();
                } catch (RemoteException e) {
                    this.i.a(e);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeha, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzd("Cannot connect to remote service, fallback to local instance.");
        this.i.a(new RemoteException(me4.g(i, "Connection suspended with cause: ", new StringBuilder(String.valueOf(i).length() + 33))));
    }
}
