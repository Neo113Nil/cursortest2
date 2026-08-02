package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzfg implements Runnable {
    public final /* synthetic */ zzfh a;

    public zzfg(zzfh zzfhVar) {
        this.a = zzfhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbh zzbhVar = this.a.a;
        if (zzbhVar != null) {
            try {
                zzbhVar.zzb(1);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
