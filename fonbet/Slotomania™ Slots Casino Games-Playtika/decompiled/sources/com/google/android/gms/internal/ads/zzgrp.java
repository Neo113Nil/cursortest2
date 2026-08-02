package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
final class zzgrp implements ServiceConnection {
    final /* synthetic */ zzgrv zza;

    /* synthetic */ zzgrp(zzgrv zzgrvVar, byte[] bArr) {
        Objects.requireNonNull(zzgrvVar);
        this.zza = zzgrvVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        zzgrv zzgrvVar = this.zza;
        zzgrvVar.zzi().zza("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        zzgrvVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgro
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                IInterface zzm;
                zzgpz zzb = zzgpy.zzb(iBinder);
                zzgrp zzgrpVar = zzgrp.this;
                zzgrv zzgrvVar2 = zzgrpVar.zza;
                zzgrvVar2.zzn(zzb);
                zzgrvVar2.zzi().zza("linkToDeath", new Object[0]);
                try {
                    zzm = zzgrvVar2.zzm();
                } catch (RemoteException e) {
                    zzgrpVar.zza.zzi().zzd(e, "linkToDeath failed", new Object[0]);
                }
                if (zzm == null) {
                    throw null;
                }
                IInterface iInterface = zzm;
                zzm.asBinder().linkToDeath(zzgrvVar2.zzl(), 0);
                zzgrv zzgrvVar3 = zzgrpVar.zza;
                zzgrvVar3.zzk(false);
                synchronized (zzgrvVar3.zzj()) {
                    Iterator it = zzgrvVar3.zzj().iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zzgrvVar3.zzj().clear();
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzgrv zzgrvVar = this.zza;
        zzgrvVar.zzi().zza("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        zzgrvVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgrn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgrv zzgrvVar2 = zzgrp.this.zza;
                zzgrvVar2.zzi().zza("unlinkToDeath", new Object[0]);
                IInterface zzm = zzgrvVar2.zzm();
                zzm.getClass();
                zzm.asBinder().unlinkToDeath(zzgrvVar2.zzl(), 0);
                zzgrvVar2.zzn(null);
                zzgrvVar2.zzk(false);
            }
        });
    }
}
