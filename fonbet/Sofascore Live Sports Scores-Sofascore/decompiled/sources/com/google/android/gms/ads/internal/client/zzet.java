package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzbsn;
import com.google.android.gms.internal.ads.zzbsq;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzet extends zzbsn {
    public final /* synthetic */ zzeu a;

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zza(List list) throws RemoteException {
        int i;
        ArrayList arrayList;
        zzeu zzeuVar = this.a;
        synchronized (zzeuVar.d) {
            zzeuVar.g = false;
            zzeuVar.h = true;
            arrayList = new ArrayList(zzeuVar.f);
            zzeuVar.f.clear();
        }
        zzbsq a = zzeu.a(list);
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((OnInitializationCompleteListener) arrayList.get(i)).onInitializationComplete(a);
        }
    }
}
