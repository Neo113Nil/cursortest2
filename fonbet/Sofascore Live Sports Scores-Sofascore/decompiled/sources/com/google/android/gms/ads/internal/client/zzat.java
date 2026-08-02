package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.android.gms.internal.ads.zzcas;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzat extends zzax {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zzaw c;

    public zzat(zzaw zzawVar, Context context) {
        this.b = context;
        Objects.requireNonNull(zzawVar);
        this.c = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.a(this.b, "mobile_ads_settings");
        return new zzfj();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final Object zzb() throws RemoteException {
        Context context = this.b;
        zzbjg.a(context);
        boolean booleanValue = ((Boolean) zzba.zzc().a(zzbjg.oc)).booleanValue();
        zzaw zzawVar = this.c;
        if (!booleanValue) {
            return zzawVar.c.zza(context);
        }
        try {
            IBinder zze = ((zzcz) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", zzas.a)).zze(new ObjectWrapper(context), ModuleDescriptor.MODULE_VERSION);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof zzcy ? (zzcy) queryLocalInterface : new zzcw(zze);
        } catch (RemoteException e) {
            e = e;
            zzcas c = zzcaq.c(context);
            zzawVar.f = c;
            c.a("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e2) {
            e = e2;
            zzcas c2 = zzcaq.c(context);
            zzawVar.f = c2;
            c2.a("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            zzcas c22 = zzcaq.c(context);
            zzawVar.f = c22;
            c22.a("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final Object zzc(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzh(new ObjectWrapper(this.b), ModuleDescriptor.MODULE_VERSION);
    }
}
