package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.android.gms.internal.ads.zzcas;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzar extends zzax {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zzbvu c;
    public final /* synthetic */ zzaw d;

    public zzar(zzaw zzawVar, Context context, zzbvu zzbvuVar) {
        this.b = context;
        this.c = zzbvuVar;
        this.d = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.a(this.b, "ads_preloader");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final Object zzb() {
        zzch zzcfVar;
        Context context = this.b;
        ObjectWrapper objectWrapper = new ObjectWrapper(context);
        zzbjg.a(context);
        boolean booleanValue = ((Boolean) zzba.zzc().a(zzbjg.oc)).booleanValue();
        zzaw zzawVar = this.d;
        zzbvu zzbvuVar = this.c;
        if (!booleanValue) {
            return zzawVar.g.zza(context, zzbvuVar);
        }
        try {
            IBinder zze = ((zzci) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl", zzaq.a)).zze(objectWrapper, zzbvuVar, ModuleDescriptor.MODULE_VERSION);
            if (zze == null) {
                zzcfVar = null;
            } else {
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                zzcfVar = queryLocalInterface instanceof zzch ? (zzch) queryLocalInterface : new zzcf(zze);
            }
            zzcfVar.zzl(zzbvuVar);
            return zzcfVar;
        } catch (RemoteException e) {
            e = e;
            zzcas c = zzcaq.c(context);
            zzawVar.f = c;
            c.a("ClientApiBroker.getAdPreloader", e);
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e2) {
            e = e2;
            zzcas c2 = zzcaq.c(context);
            zzawVar.f = c2;
            c2.a("ClientApiBroker.getAdPreloader", e);
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            zzcas c22 = zzcaq.c(context);
            zzawVar.f = c22;
            c22.a("ClientApiBroker.getAdPreloader", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final Object zzc(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzg(new ObjectWrapper(this.b), this.c, ModuleDescriptor.MODULE_VERSION);
    }
}
