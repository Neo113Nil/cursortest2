package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzbzs;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.android.gms.internal.ads.zzcas;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzac extends zzax {
    public final /* synthetic */ Activity b;
    public final /* synthetic */ zzaw c;

    public zzac(zzaw zzawVar, Activity activity) {
        this.b = activity;
        this.c = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.a(this.b, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final Object zzb() throws RemoteException {
        Activity activity = this.b;
        zzbjg.a(activity);
        boolean booleanValue = ((Boolean) zzba.zzc().a(zzbjg.oc)).booleanValue();
        zzaw zzawVar = this.c;
        if (booleanValue) {
            try {
                return zzbzs.zzH(((zzbzw) com.google.android.gms.ads.internal.util.client.zzs.zza(activity, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", zzab.a)).G(new ObjectWrapper(activity)));
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e) {
                zzcas c = zzcaq.c(activity.getApplicationContext());
                zzawVar.f = c;
                c.a("ClientApiBroker.createAdOverlay", e);
                return null;
            }
        }
        zzbzq zzbzqVar = zzawVar.e;
        zzbzqVar.getClass();
        try {
            IBinder G = ((zzbzw) zzbzqVar.b(activity)).G(new ObjectWrapper(activity));
            if (G == null) {
                return null;
            }
            IInterface queryLocalInterface = G.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof zzbzt ? (zzbzt) queryLocalInterface : new zzbzr(G);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create remote AdOverlay.", e2);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create remote AdOverlay.", e3);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final Object zzc(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzf(new ObjectWrapper(this.b));
    }
}
