package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import defpackage.ddb;
import defpackage.hsn;
import defpackage.x3o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzehc extends zzeha {
    public final Context g;
    public final hsn h;

    public zzehc(Context context, hsn hsnVar) {
        this.g = context;
        this.h = hsnVar;
        this.f = new zzcax(context, com.google.android.gms.ads.internal.zzt.zzs().zza(), this, this);
    }

    public final ddb c(zzcbv zzcbvVar) {
        synchronized (this.b) {
            try {
                if (this.c) {
                    return this.a;
                }
                this.c = true;
                this.e = zzcbvVar;
                this.f.checkAvailabilityAndConnect();
                zzcgo zzcgoVar = this.a;
                zzcgoVar.addListener(new x3o(this, 0), zzcgj.h);
                zzeha.b(this.g, zzcgoVar, this.h);
                return zzcgoVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.b) {
            try {
                if (!this.d) {
                    this.d = true;
                    try {
                        ((zzcbi) this.f.getService()).K3(this.e, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Me)).booleanValue() ? new zzegz(this.a, this.e) : new zzegy(this));
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.a.zzd(new zzehp(1));
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzt.zzh().d("RemoteSignalsClientTask.onConnected", th);
                        this.a.zzd(new zzehp(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
