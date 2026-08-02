package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzccy;
import com.google.android.gms.internal.ads.zzcda;
import com.google.android.gms.internal.ads.zzcde;
import defpackage.ubf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzaa extends zzax {
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ zzbvu d;

    public zzaa(zzaw zzawVar, Context context, String str, zzbvu zzbvuVar) {
        this.b = context;
        this.c = str;
        this.d = zzbvuVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.a(this.b, "rewarded");
        return new zzfm();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final Object zzb() throws RemoteException {
        String str = this.c;
        zzbvu zzbvuVar = this.d;
        Context context = this.b;
        try {
            IBinder zze = ((zzcde) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", ubf.b)).zze(new ObjectWrapper(context), str, zzbvuVar, ModuleDescriptor.MODULE_VERSION);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return queryLocalInterface instanceof zzcda ? (zzcda) queryLocalInterface : new zzccy(zze);
        } catch (RemoteException e) {
            e = e;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final Object zzc(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzk(new ObjectWrapper(this.b), this.c, this.d, ModuleDescriptor.MODULE_VERSION);
    }
}
