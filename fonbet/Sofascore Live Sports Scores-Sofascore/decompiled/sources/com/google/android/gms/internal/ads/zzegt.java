package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.ConnectionResult;
import defpackage.hsn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzegt extends zzeha {
    public final Context g;
    public final hsn h;

    public zzegt(Context context, hsn hsnVar) {
        this.g = context;
        this.h = hsnVar;
        this.f = new zzcax(context, com.google.android.gms.ads.internal.zzt.zzs().zza(), this, this);
    }

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
                        ((zzcbi) this.f.getService()).F0(this.e, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Me)).booleanValue() ? new zzegz(this.a, this.e) : new zzegy(this));
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.a.zzd(new zzehp(1));
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzt.zzh().d("RemoteAdRequestClientTask.onConnected", th);
                        this.a.zzd(new zzehp(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
