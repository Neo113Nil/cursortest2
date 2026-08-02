package defpackage;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.internal.ads.zzbwa;
import com.google.android.gms.internal.ads.zzbwl;
import com.google.android.gms.internal.ads.zzbwv;
import com.google.android.gms.internal.ads.zzcdq;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zpn implements MediationAdLoadCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzbwa b;
    public final /* synthetic */ zzbwv c;

    public /* synthetic */ zpn(zzbwv zzbwvVar, zzbwa zzbwaVar, int i) {
        this.a = i;
        this.b = zzbwaVar;
        this.c = zzbwvVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        int i = this.a;
        zzbwa zzbwaVar = this.b;
        zzbwv zzbwvVar = this.c;
        switch (i) {
            case 0:
                try {
                    String canonicalName = zzbwvVar.a.getClass().getCanonicalName();
                    int code = adError.getCode();
                    String message = adError.getMessage();
                    String domain = adError.getDomain();
                    StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 43 + String.valueOf(code).length() + 17 + String.valueOf(message).length() + 16 + String.valueOf(domain).length());
                    sb.append(canonicalName);
                    sb.append("failed to loaded mediation ad: ErrorCode = ");
                    sb.append(code);
                    sb.append(". ErrorMessage = ");
                    sb.append(message);
                    sb.append(". ErrorDomain = ");
                    sb.append(domain);
                    zzo.zzd(sb.toString());
                    zzbwaVar.S(adError.zza());
                    zzbwaVar.A4(adError.getCode(), adError.getMessage());
                    zzbwaVar.f(adError.getCode());
                    break;
                } catch (RemoteException e) {
                    zzo.zzg("", e);
                    return;
                }
            case 1:
                try {
                    String canonicalName2 = zzbwvVar.a.getClass().getCanonicalName();
                    int code2 = adError.getCode();
                    String message2 = adError.getMessage();
                    String domain2 = adError.getDomain();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName2).length() + 43 + String.valueOf(code2).length() + 17 + String.valueOf(message2).length() + 16 + String.valueOf(domain2).length());
                    sb2.append(canonicalName2);
                    sb2.append("failed to loaded mediation ad: ErrorCode = ");
                    sb2.append(code2);
                    sb2.append(". ErrorMessage = ");
                    sb2.append(message2);
                    sb2.append(". ErrorDomain = ");
                    sb2.append(domain2);
                    zzo.zzd(sb2.toString());
                    zzbwaVar.S(adError.zza());
                    zzbwaVar.A4(adError.getCode(), adError.getMessage());
                    zzbwaVar.f(adError.getCode());
                    break;
                } catch (RemoteException e2) {
                    zzo.zzg("", e2);
                    return;
                }
            case 2:
                try {
                    String canonicalName3 = zzbwvVar.a.getClass().getCanonicalName();
                    int code3 = adError.getCode();
                    String message3 = adError.getMessage();
                    String domain3 = adError.getDomain();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(canonicalName3).length() + 41 + String.valueOf(code3).length() + 17 + String.valueOf(message3).length() + 16 + String.valueOf(domain3).length());
                    sb3.append(canonicalName3);
                    sb3.append("failed to load mediation ad: ErrorCode = ");
                    sb3.append(code3);
                    sb3.append(". ErrorMessage = ");
                    sb3.append(message3);
                    sb3.append(". ErrorDomain = ");
                    sb3.append(domain3);
                    zzo.zzd(sb3.toString());
                    zzbwaVar.S(adError.zza());
                    zzbwaVar.A4(adError.getCode(), adError.getMessage());
                    zzbwaVar.f(adError.getCode());
                    break;
                } catch (RemoteException e3) {
                    zzo.zzg("", e3);
                    return;
                }
            case 3:
                try {
                    String canonicalName4 = zzbwvVar.a.getClass().getCanonicalName();
                    int code4 = adError.getCode();
                    String message4 = adError.getMessage();
                    String domain4 = adError.getDomain();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(canonicalName4).length() + 41 + String.valueOf(code4).length() + 17 + String.valueOf(message4).length() + 16 + String.valueOf(domain4).length());
                    sb4.append(canonicalName4);
                    sb4.append("failed to load mediation ad: ErrorCode = ");
                    sb4.append(code4);
                    sb4.append(". ErrorMessage = ");
                    sb4.append(message4);
                    sb4.append(". ErrorDomain = ");
                    sb4.append(domain4);
                    zzo.zzd(sb4.toString());
                    zzbwaVar.S(adError.zza());
                    zzbwaVar.A4(adError.getCode(), adError.getMessage());
                    zzbwaVar.f(adError.getCode());
                    break;
                } catch (RemoteException e4) {
                    zzo.zzg("", e4);
                    return;
                }
            case 4:
                try {
                    String canonicalName5 = zzbwvVar.a.getClass().getCanonicalName();
                    int code5 = adError.getCode();
                    String message5 = adError.getMessage();
                    String domain5 = adError.getDomain();
                    StringBuilder sb5 = new StringBuilder(String.valueOf(canonicalName5).length() + 41 + String.valueOf(code5).length() + 17 + String.valueOf(message5).length() + 16 + String.valueOf(domain5).length());
                    sb5.append(canonicalName5);
                    sb5.append("failed to load mediation ad: ErrorCode = ");
                    sb5.append(code5);
                    sb5.append(". ErrorMessage = ");
                    sb5.append(message5);
                    sb5.append(". ErrorDomain = ");
                    sb5.append(domain5);
                    zzo.zzd(sb5.toString());
                    zzbwaVar.S(adError.zza());
                    zzbwaVar.A4(adError.getCode(), adError.getMessage());
                    zzbwaVar.f(adError.getCode());
                    break;
                } catch (RemoteException e5) {
                    zzo.zzg("", e5);
                    return;
                }
            default:
                try {
                    String canonicalName6 = zzbwvVar.a.getClass().getCanonicalName();
                    int code6 = adError.getCode();
                    String message6 = adError.getMessage();
                    String domain6 = adError.getDomain();
                    StringBuilder sb6 = new StringBuilder(String.valueOf(canonicalName6).length() + 41 + String.valueOf(code6).length() + 17 + String.valueOf(message6).length() + 16 + String.valueOf(domain6).length());
                    sb6.append(canonicalName6);
                    sb6.append("failed to load mediation ad: ErrorCode = ");
                    sb6.append(code6);
                    sb6.append(". ErrorMessage = ");
                    sb6.append(message6);
                    sb6.append(". ErrorDomain = ");
                    sb6.append(domain6);
                    zzo.zzd(sb6.toString());
                    zzbwaVar.S(adError.zza());
                    zzbwaVar.A4(adError.getCode(), adError.getMessage());
                    zzbwaVar.f(adError.getCode());
                    break;
                } catch (RemoteException e6) {
                    zzo.zzg("", e6);
                }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* synthetic */ Object onSuccess(Object obj) {
        int i = this.a;
        zzbwv zzbwvVar = this.c;
        zzbwa zzbwaVar = this.b;
        switch (i) {
            case 0:
                try {
                    zzbwvVar.e = ((MediationBannerAd) obj).getView();
                    zzbwaVar.zzj();
                } catch (RemoteException e) {
                    zzo.zzg("", e);
                }
                return new zzbwl(zzbwaVar);
            case 1:
                try {
                    zzbwvVar.f = (MediationInterstitialAd) obj;
                    zzbwaVar.zzj();
                } catch (RemoteException e2) {
                    zzo.zzg("", e2);
                }
                return new zzbwl(zzbwaVar);
            case 2:
                try {
                    zzbwvVar.g = (UnifiedNativeAdMapper) obj;
                    zzbwaVar.zzj();
                } catch (RemoteException e3) {
                    zzo.zzg("", e3);
                }
                return new zzbwl(zzbwaVar);
            case 3:
                try {
                    zzbwvVar.h = (NativeAdMapper) obj;
                    zzbwaVar.zzj();
                } catch (RemoteException e4) {
                    zzo.zzg("", e4);
                }
                return new zzbwl(zzbwaVar);
            case 4:
                try {
                    zzbwvVar.i = (MediationRewardedAd) obj;
                    zzbwaVar.zzj();
                } catch (RemoteException e5) {
                    zzo.zzg("", e5);
                }
                return new zzcdq(zzbwaVar);
            default:
                try {
                    zzbwvVar.k = (MediationAppOpenAd) obj;
                    zzbwaVar.zzj();
                } catch (RemoteException e6) {
                    zzo.zzg("", e6);
                }
                return new zzbwl(zzbwaVar);
        }
    }
}
