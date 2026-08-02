package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.android.gms.internal.ads.zzcas;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzap extends zzax {
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ zzbvu d;
    public final /* synthetic */ zzaw e;

    public zzap(zzaw zzawVar, Context context, String str, zzbvu zzbvuVar) {
        this.b = context;
        this.c = str;
        this.d = zzbvuVar;
        this.e = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.a(this.b, "native_ad");
        return new zzff();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final Object zzb() throws RemoteException {
        Context context = this.b;
        zzbjg.a(context);
        boolean booleanValue = ((Boolean) zzba.zzc().a(zzbjg.oc)).booleanValue();
        zzaw zzawVar = this.e;
        zzbvu zzbvuVar = this.d;
        String str = this.c;
        if (!booleanValue) {
            return zzawVar.b.zza(context, str, zzbvuVar);
        }
        try {
            IBinder zze = ((zzbr) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", zzao.a)).zze(new ObjectWrapper(context), str, zzbvuVar, ModuleDescriptor.MODULE_VERSION);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof zzbq ? (zzbq) queryLocalInterface : new zzbo(zze);
        } catch (RemoteException e) {
            e = e;
            zzcas c = zzcaq.c(context);
            zzawVar.f = c;
            c.a("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e2) {
            e = e2;
            zzcas c2 = zzcaq.c(context);
            zzawVar.f = c2;
            c2.a("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            zzcas c22 = zzcaq.c(context);
            zzawVar.f = c22;
            c22.a("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final Object zzc(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzc(new ObjectWrapper(this.b), this.c, this.d, ModuleDescriptor.MODULE_VERSION);
    }
}
