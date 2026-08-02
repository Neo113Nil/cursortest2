package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzhbf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
final class zzz implements zzhbf {
    final /* synthetic */ zzbze zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzap zzc;

    zzz(zzap zzapVar, zzbze zzbzeVar, boolean z) {
        this.zza = zzbzeVar;
        this.zzb = z;
        Objects.requireNonNull(zzapVar);
        this.zzc = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        try {
            zzbze zzbzeVar = this.zza;
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
            sb.append("Internal error: ");
            sb.append(message);
            zzbzeVar.zzf(sb.toString());
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(@Nonnull Object obj) {
        Uri zzZ;
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.zza.zze(arrayList);
            zzap zzapVar = this.zzc;
            if (zzapVar.zzC() || this.zzb) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Uri uri = (Uri) it.next();
                    if (zzapVar.zzc(uri)) {
                        zzZ = zzap.zzZ(uri, zzapVar.zzM(), "1");
                        zzapVar.zzB().zzb(zzZ.toString(), null, null, null);
                    } else {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziw)).booleanValue()) {
                            zzapVar.zzB().zzb(uri.toString(), null, null, null);
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
