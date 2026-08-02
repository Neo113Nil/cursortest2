package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcdh;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final /* synthetic */ class zzfl implements Runnable {
    public final /* synthetic */ zzcdh a;

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        zzcdh zzcdhVar = this.a;
        if (zzcdhVar != null) {
            try {
                zzcdhVar.zzf(1);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
