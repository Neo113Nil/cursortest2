package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzbuq;
import com.google.android.gms.internal.ads.zzbzm;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes2.dex */
final class zzar extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbuq zzb;
    final /* synthetic */ zzaw zzc;

    zzar(zzaw zzawVar, Context context, zzbuq zzbuqVar) {
        this.zza = context;
        this.zzb = zzbuqVar;
        Objects.requireNonNull(zzawVar);
        this.zzc = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzl(this.zza, "ads_preloader");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ Object zzb() throws RemoteException {
        zzch zzcfVar;
        Context context = this.zza;
        IObjectWrapper wrap = ObjectWrapper.wrap(context);
        zzbie.zza(context);
        if (!((Boolean) zzba.zzc().zzd(zzbie.zzmb)).booleanValue()) {
            return this.zzc.zzt().zza(this.zza, this.zzb);
        }
        try {
            zzci zzciVar = (zzci) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl", zzaq.zza);
            zzbuq zzbuqVar = this.zzb;
            IBinder zze = zzciVar.zze(wrap, zzbuqVar, ModuleDescriptor.MODULE_VERSION);
            if (zze == null) {
                zzcfVar = null;
            } else {
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                zzcfVar = queryLocalInterface instanceof zzch ? (zzch) queryLocalInterface : new zzcf(zze);
            }
            zzcfVar.zzl(zzbuqVar);
            return zzcfVar;
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e) {
            zzaw zzawVar = this.zzc;
            zzawVar.zzs(zzbzm.zza(this.zza));
            zzawVar.zzr().zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzh(ObjectWrapper.wrap(this.zza), this.zzb, ModuleDescriptor.MODULE_VERSION);
    }
}
