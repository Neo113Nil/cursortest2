package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzbuq;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzbzo;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes3.dex */
public final class zzk extends RemoteCreator {
    private zzbzo zza;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof zzbv ? (zzbv) queryLocalInterface : new zzbv(iBinder);
    }

    public final zzbu zza(Context context, zzr zzrVar, String str, zzbuq zzbuqVar, int i) {
        zzbie.zza(context);
        if (!((Boolean) zzba.zzc().zzd(zzbie.zzmb)).booleanValue()) {
            try {
                IBinder zze = ((zzbv) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), zzrVar, str, zzbuqVar, ModuleDescriptor.MODULE_VERSION, i);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(zze);
            } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("Could not create remote AdManager.", e);
                return null;
            }
        }
        try {
            IBinder zze2 = ((zzbv) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", zzj.zza)).zze(ObjectWrapper.wrap(context), zzrVar, str, zzbuqVar, ModuleDescriptor.MODULE_VERSION, i);
            if (zze2 == null) {
                return null;
            }
            IInterface queryLocalInterface2 = zze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface2 instanceof zzbu ? (zzbu) queryLocalInterface2 : new zzbs(zze2);
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e2) {
            zzbzo zza = zzbzm.zza(context);
            this.zza = zza;
            zza.zzh(e2, "AdManagerCreator.newAdManagerByDynamiteLoader");
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
            return null;
        }
    }
}
