package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeud implements zzdgg {
    public final AtomicReference a = new AtomicReference();

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final void h(com.google.android.gms.ads.internal.client.zzt zztVar) {
        Object obj = this.a.get();
        if (obj == null) {
            return;
        }
        try {
            ((com.google.android.gms.ads.internal.client.zzdq) obj).zze(zztVar);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }
}
