package defpackage;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.internal.ads.zzbwa;
import com.google.android.gms.internal.ads.zzbwz;
import com.google.android.gms.internal.ads.zzbxb;
import com.google.android.gms.internal.ads.zzbxn;
import com.google.android.gms.internal.ads.zzbyg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class eqn implements MediationAdLoadCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzbxn b;
    public final /* synthetic */ zzbwa c;

    public /* synthetic */ eqn(zzbyg zzbygVar, zzbxn zzbxnVar, zzbwa zzbwaVar, int i) {
        this.a = i;
        this.b = zzbxnVar;
        this.c = zzbwaVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        int i = this.a;
        zzbxn zzbxnVar = this.b;
        switch (i) {
            case 0:
                try {
                    zzbxnVar.a(adError.zza());
                    break;
                } catch (RemoteException e) {
                    zzo.zzg("", e);
                    return;
                }
            default:
                try {
                    zzbxnVar.a(adError.zza());
                    break;
                } catch (RemoteException e2) {
                    zzo.zzg("", e2);
                }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        int i = this.a;
        zzbwa zzbwaVar = this.c;
        zzbxn zzbxnVar = this.b;
        switch (i) {
            case 0:
                NativeAdMapper nativeAdMapper = (NativeAdMapper) obj;
                if (nativeAdMapper != null) {
                    try {
                        zzbxnVar.s2(new zzbwz(nativeAdMapper));
                    } catch (RemoteException e) {
                        zzo.zzg("", e);
                    }
                    break;
                } else {
                    zzo.zzi("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                    try {
                        zzbxnVar.zzf("Adapter returned null.");
                        break;
                    } catch (RemoteException e2) {
                        zzo.zzg("", e2);
                        return null;
                    }
                }
            default:
                UnifiedNativeAdMapper unifiedNativeAdMapper = (UnifiedNativeAdMapper) obj;
                if (unifiedNativeAdMapper != null) {
                    try {
                        zzbxnVar.s2(new zzbxb(unifiedNativeAdMapper));
                    } catch (RemoteException e3) {
                        zzo.zzg("", e3);
                    }
                    break;
                } else {
                    zzo.zzi("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                    try {
                        zzbxnVar.zzf("Adapter returned null.");
                        break;
                    } catch (RemoteException e4) {
                        zzo.zzg("", e4);
                        return null;
                    }
                }
        }
        return new fqn(zzbwaVar);
    }
}
