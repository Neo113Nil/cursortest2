package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcai;
import com.google.android.gms.internal.ads.zzfte;
import com.google.android.gms.internal.ads.zzhcv;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzz implements zzhcv {
    public final /* synthetic */ zzcai a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ zzap c;

    public zzz(zzap zzapVar, zzcai zzcaiVar, boolean z) {
        this.a = zzcaiVar;
        this.b = z;
        this.c = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        try {
            zzcai zzcaiVar = this.a;
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
            sb.append("Internal error: ");
            sb.append(message);
            zzcaiVar.zzf(sb.toString());
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zzb(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.a.z(arrayList);
            zzap zzapVar = this.c;
            boolean z = zzapVar.m;
            zzfte zzfteVar = zzapVar.l;
            if (z || this.b) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Uri uri = (Uri) it.next();
                    if (zzap.I4(uri, zzapVar.y, zzapVar.z)) {
                        zzfteVar.b(zzap.L4(uri, zzapVar.v, "1").toString(), null, null, null);
                    } else {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.C8)).booleanValue()) {
                            zzfteVar.b(uri.toString(), null, null, null);
                        }
                    }
                }
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }
}
