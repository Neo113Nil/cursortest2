package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
final class zzbgx implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzbgp zza;
    final /* synthetic */ zzcfk zzb;
    final /* synthetic */ zzbgz zzc;

    zzbgx(zzbgz zzbgzVar, zzbgp zzbgpVar, zzcfk zzcfkVar) {
        this.zza = zzbgpVar;
        this.zzb = zzcfkVar;
        Objects.requireNonNull(zzbgzVar);
        this.zzc = zzbgzVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbgz zzbgzVar = this.zzc;
        synchronized (zzbgzVar.zzf()) {
            if (zzbgzVar.zzd()) {
                return;
            }
            zzbgzVar.zze(true);
            final zzbgo zzc = zzbgzVar.zzc();
            if (zzc == null) {
                return;
            }
            zzhbs zzhbsVar = zzcff.zza;
            final zzbgp zzbgpVar = this.zza;
            final zzcfk zzcfkVar = this.zzb;
            final ListenableFuture submit = zzhbsVar.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbgw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcfk zzcfkVar2 = zzcfkVar;
                    zzbgo zzbgoVar = zzc;
                    zzbgx zzbgxVar = zzbgx.this;
                    try {
                        zzbgr zzq = zzbgoVar.zzq();
                        boolean zzp = zzbgoVar.zzp();
                        zzbgp zzbgpVar2 = zzbgpVar;
                        zzbgm zzf = zzp ? zzq.zzf(zzbgpVar2) : zzq.zze(zzbgpVar2);
                        if (!zzf.zza()) {
                            zzcfkVar2.zzd(new RuntimeException("No entry contents."));
                            zzbgxVar.zzc.zzb();
                            return;
                        }
                        zzbgu zzbguVar = new zzbgu(zzbgxVar, zzf.zzb(), 1);
                        int read = zzbguVar.read();
                        if (read == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        zzbguVar.unread(read);
                        zzcfkVar2.zzc(zzbhb.zza(zzbguVar, zzf.zzd(), zzf.zzg(), zzf.zzf(), zzf.zze()));
                    } catch (RemoteException | IOException e) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to obtain a cache service instance.", e);
                        zzcfkVar2.zzd(e);
                        zzbgxVar.zzc.zzb();
                    }
                }
            });
            zzcfkVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbgv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i = zzbgx.zzd;
                    if (zzcfk.this.isCancelled()) {
                        submit.cancel(true);
                    }
                }
            }, zzcff.zzh);
        }
    }
}
