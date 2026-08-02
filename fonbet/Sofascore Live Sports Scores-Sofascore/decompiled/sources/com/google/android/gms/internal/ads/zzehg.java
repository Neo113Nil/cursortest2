package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzehg extends zzeha {
    public String g;
    public int h;

    @Override // com.google.android.gms.internal.ads.zzeha, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void J(ConnectionResult connectionResult) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzd("Cannot connect to remote service, fallback to local instance.");
        this.a.zzd(new zzehp(1));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.b) {
            try {
                if (!this.d) {
                    this.d = true;
                    try {
                        try {
                            int i = this.h;
                            if (i == 2) {
                                ((zzcbi) this.f.getService()).o3(this.e, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Me)).booleanValue() ? new zzegz(this.a, this.e) : new zzegy(this));
                            } else if (i == 3) {
                                ((zzcbi) this.f.getService()).e3(this.g, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Me)).booleanValue() ? new zzegz(this.a, this.e) : new zzegy(this));
                            } else {
                                this.a.zzd(new zzehp(1));
                            }
                        } catch (Throwable th) {
                            com.google.android.gms.ads.internal.zzt.zzh().d("RemoteUrlAndCacheKeyClientTask.onConnected", th);
                            this.a.zzd(new zzehp(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.a.zzd(new zzehp(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
