package com.google.android.gms.ads.h5;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzbrp;
import com.google.android.gms.internal.ads.zzbvq;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class H5AdsRequestHandler {
    public final zzbrp a;

    public H5AdsRequestHandler(@NonNull Context context, @NonNull OnH5AdsEventListener onH5AdsEventListener) {
        this.a = new zzbrp(context, onH5AdsEventListener);
    }

    public void clearAdObjects() {
        zzbrp zzbrpVar = this.a;
        zzbrpVar.getClass();
        if (((Boolean) zzba.zzc().a(zzbjg.Bb)).booleanValue()) {
            zzbrl zzbrlVar = zzbrpVar.c;
            if (zzbrlVar == null) {
                zzbrlVar = zzay.zzb().zzk(zzbrpVar.a, new zzbvq(), zzbrpVar.b);
                zzbrpVar.c = zzbrlVar;
            }
            if (zzbrlVar != null) {
                try {
                    zzbrlVar.zzf();
                } catch (RemoteException e) {
                    zzo.zzl("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public boolean handleH5AdsRequest(@NonNull String str) {
        zzbrp zzbrpVar = this.a;
        zzbrpVar.getClass();
        if (!zzbrp.a(str)) {
            return false;
        }
        zzbrl zzbrlVar = zzbrpVar.c;
        if (zzbrlVar == null) {
            zzbrlVar = zzay.zzb().zzk(zzbrpVar.a, new zzbvq(), zzbrpVar.b);
            zzbrpVar.c = zzbrlVar;
        }
        if (zzbrlVar == null) {
            return false;
        }
        try {
            zzbrlVar.zze(str);
            return true;
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return true;
        }
    }

    public boolean shouldInterceptRequest(@NonNull String str) {
        return zzbrp.a(str);
    }
}
