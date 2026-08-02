package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzfd implements Runnable {
    public final /* synthetic */ zzfe a;

    public zzfd(zzfe zzfeVar) {
        this.a = zzfeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbh zzbhVar = this.a.a.a;
        if (zzbhVar != null) {
            try {
                zzbhVar.zzb(1);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
