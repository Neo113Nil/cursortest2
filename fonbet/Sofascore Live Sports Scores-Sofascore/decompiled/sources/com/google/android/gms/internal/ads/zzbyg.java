package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.c0l;
import defpackage.eqn;
import defpackage.ewm;
import defpackage.hbo;
import defpackage.hcc;
import defpackage.l2a;
import defpackage.m5o;
import defpackage.sx2;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbyg extends zzbxs {
    public final RtbAdapter b;
    public MediationInterstitialAd c;
    public MediationRewardedAd d;
    public MediationAppOpenAd e;
    public String f = "";

    public zzbyg(RtbAdapter rtbAdapter) {
        this.b = rtbAdapter;
    }

    public static final Bundle F4(String str) {
        zzo.zzi("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e) {
            zzo.zzg("", e);
            hbo.n();
            return null;
        }
    }

    public static final boolean G4(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (zzmVar.zzf) {
            return true;
        }
        com.google.android.gms.ads.internal.client.zzay.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzy();
    }

    public static final String H4(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) {
        String str2 = zzmVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    public final Bundle E4(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle;
        Bundle bundle2 = zzmVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.b.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final void G1(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxe zzbxeVar, zzbwa zzbwaVar) {
        try {
            this.b.loadRtbAppOpenAd(new MediationAppOpenAdConfiguration((Context) ObjectWrapper.Z1(iObjectWrapper), str, F4(str2), E4(zzmVar), G4(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, H4(zzmVar, str2), this.f), new l2a(this, zzbxeVar, zzbwaVar, false, 28));
        } catch (Throwable th) {
            zzo.zzg("Adapter failed to render app open ad.", th);
            zzbvr.a(iObjectWrapper, th, "adapter.loadRtbAppOpenAd");
            hbo.n();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final void H3(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxh zzbxhVar, zzbwa zzbwaVar, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        try {
            this.b.loadRtbBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.Z1(iObjectWrapper), str, F4(str2), E4(zzmVar), G4(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, H4(zzmVar, str2), com.google.android.gms.ads.zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza), this.f), new c0l(20, this, zzbxhVar, zzbwaVar));
        } catch (Throwable th) {
            zzo.zzg("Adapter failed to render banner ad.", th);
            zzbvr.a(iObjectWrapper, th, "adapter.loadRtbBannerAd");
            hbo.n();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final void j2(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxn zzbxnVar, zzbwa zzbwaVar, zzbmk zzbmkVar) {
        RtbAdapter rtbAdapter = this.b;
        try {
            rtbAdapter.loadRtbNativeAdMapper(new MediationNativeAdConfiguration((Context) ObjectWrapper.Z1(iObjectWrapper), str, F4(str2), E4(zzmVar), G4(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, H4(zzmVar, str2), this.f, zzbmkVar), new eqn(this, zzbxnVar, zzbwaVar, 0));
        } catch (Throwable th) {
            zzo.zzg("Adapter failed to render native ad.", th);
            zzbvr.a(iObjectWrapper, th, "adapter.loadRtbNativeAdMapper");
            String message = th.getMessage();
            if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                hbo.n();
                return;
            }
            try {
                rtbAdapter.loadRtbNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.Z1(iObjectWrapper), str, F4(str2), E4(zzmVar), G4(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, H4(zzmVar, str2), this.f, zzbmkVar), new eqn(this, zzbxnVar, zzbwaVar, 1));
            } catch (Throwable th2) {
                zzo.zzg("Adapter failed to render native ad.", th2);
                zzbvr.a(iObjectWrapper, th2, "adapter.loadRtbNativeAd");
                hbo.n();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final void j3(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, ObjectWrapper objectWrapper, m5o m5oVar, zzbwa zzbwaVar) {
        j2(str, str2, zzmVar, objectWrapper, m5oVar, zzbwaVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final void q3(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxk zzbxkVar, zzbwa zzbwaVar) {
        try {
            this.b.loadRtbInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.Z1(iObjectWrapper), str, F4(str2), E4(zzmVar), G4(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, H4(zzmVar, str2), this.f), new sx2(false, this, zzbxkVar, zzbwaVar));
        } catch (Throwable th) {
            zzo.zzg("Adapter failed to render interstitial ad.", th);
            zzbvr.a(iObjectWrapper, th, "adapter.loadRtbInterstitialAd");
            hbo.n();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final boolean r(IObjectWrapper iObjectWrapper) {
        MediationAppOpenAd mediationAppOpenAd = this.e;
        if (mediationAppOpenAd == null) {
            return false;
        }
        try {
            mediationAppOpenAd.showAd((Context) ObjectWrapper.Z1(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            zzo.zzg("", th);
            zzbvr.a(iObjectWrapper, th, "adapter.showRtbAppOpenAd");
            return true;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzbxt
    public final void r1(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzr zzrVar, zzbxw zzbxwVar) {
        AdFormat adFormat;
        try {
            ewm ewmVar = new ewm(this, zzbxwVar);
            RtbAdapter rtbAdapter = this.b;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        adFormat = AdFormat.BANNER;
                        MediationConfiguration mediationConfiguration = new MediationConfiguration(adFormat, bundle2);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(mediationConfiguration);
                        rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.Z1(iObjectWrapper), arrayList, bundle, com.google.android.gms.ads.zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza)), ewmVar);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case -1052618729:
                    if (str.equals(IronSourceConstants.EVENTS_NATIVE)) {
                        adFormat = AdFormat.NATIVE;
                        MediationConfiguration mediationConfiguration2 = new MediationConfiguration(adFormat, bundle2);
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(mediationConfiguration2);
                        rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.Z1(iObjectWrapper), arrayList2, bundle, com.google.android.gms.ads.zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza)), ewmVar);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case -239580146:
                    if (str.equals("rewarded")) {
                        adFormat = AdFormat.REWARDED;
                        MediationConfiguration mediationConfiguration22 = new MediationConfiguration(adFormat, bundle2);
                        ArrayList arrayList22 = new ArrayList();
                        arrayList22.add(mediationConfiguration22);
                        rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.Z1(iObjectWrapper), arrayList22, bundle, com.google.android.gms.ads.zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza)), ewmVar);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case 604727084:
                    if (str.equals("interstitial")) {
                        adFormat = AdFormat.INTERSTITIAL;
                        MediationConfiguration mediationConfiguration222 = new MediationConfiguration(adFormat, bundle2);
                        ArrayList arrayList222 = new ArrayList();
                        arrayList222.add(mediationConfiguration222);
                        rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.Z1(iObjectWrapper), arrayList222, bundle, com.google.android.gms.ads.zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza)), ewmVar);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case 1167692200:
                    if (str.equals("app_open")) {
                        adFormat = AdFormat.APP_OPEN_AD;
                        MediationConfiguration mediationConfiguration2222 = new MediationConfiguration(adFormat, bundle2);
                        ArrayList arrayList2222 = new ArrayList();
                        arrayList2222.add(mediationConfiguration2222);
                        rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.Z1(iObjectWrapper), arrayList2222, bundle, com.google.android.gms.ads.zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza)), ewmVar);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case 1778294298:
                    if (str.equals("app_open_ad")) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.zd)).booleanValue()) {
                            adFormat = AdFormat.APP_OPEN_AD;
                            MediationConfiguration mediationConfiguration22222 = new MediationConfiguration(adFormat, bundle2);
                            ArrayList arrayList22222 = new ArrayList();
                            arrayList22222.add(mediationConfiguration22222);
                            rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.Z1(iObjectWrapper), arrayList22222, bundle, com.google.android.gms.ads.zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza)), ewmVar);
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Internal Error");
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        adFormat = AdFormat.REWARDED_INTERSTITIAL;
                        MediationConfiguration mediationConfiguration222222 = new MediationConfiguration(adFormat, bundle2);
                        ArrayList arrayList222222 = new ArrayList();
                        arrayList222222.add(mediationConfiguration222222);
                        rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.Z1(iObjectWrapper), arrayList222222, bundle, com.google.android.gms.ads.zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza)), ewmVar);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                default:
                    throw new IllegalArgumentException("Internal Error");
            }
        } catch (Throwable th) {
            zzo.zzg("Error generating signals for RTB", th);
            zzbvr.a(iObjectWrapper, th, "adapter.collectSignals");
            hbo.n();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final void r2(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxq zzbxqVar, zzbwa zzbwaVar) {
        try {
            this.b.loadRtbRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.Z1(iObjectWrapper), str, F4(str2), E4(zzmVar), G4(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, H4(zzmVar, str2), this.f), new hcc(this, zzbxqVar, zzbwaVar, false, 28));
        } catch (Throwable th) {
            zzo.zzg("Adapter failed to render rewarded interstitial ad.", th);
            zzbvr.a(iObjectWrapper, th, "adapter.loadRtbRewardedInterstitialAd");
            hbo.n();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final boolean t3(IObjectWrapper iObjectWrapper) {
        MediationInterstitialAd mediationInterstitialAd = this.c;
        if (mediationInterstitialAd == null) {
            return false;
        }
        try {
            mediationInterstitialAd.showAd((Context) ObjectWrapper.Z1(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            zzo.zzg("", th);
            zzbvr.a(iObjectWrapper, th, "adapter.showRtbInterstitialAd");
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final void w1(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxh zzbxhVar, zzbwa zzbwaVar, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        try {
            RtbAdapter rtbAdapter = this.b;
            F4(str2);
            E4(zzmVar);
            G4(zzmVar);
            H4(zzmVar, str2);
            com.google.android.gms.ads.zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza);
            try {
                zzbxhVar.a(new AdError(7, rtbAdapter.getClass().getSimpleName().concat(" does not support interscroller ads."), MobileAds.ERROR_DOMAIN).zza());
            } catch (RemoteException e) {
                zzo.zzg("", e);
            }
        } catch (Throwable th) {
            zzo.zzg("Adapter failed to render interscroller ad.", th);
            zzbvr.a(iObjectWrapper, th, "adapter.loadRtbInterscrollerAd");
            hbo.n();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final void z3(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxq zzbxqVar, zzbwa zzbwaVar) {
        try {
            this.b.loadRtbRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.Z1(iObjectWrapper), str, F4(str2), E4(zzmVar), G4(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, H4(zzmVar, str2), this.f), new hcc(this, zzbxqVar, zzbwaVar, false, 28));
        } catch (Throwable th) {
            zzo.zzg("Adapter failed to render rewarded ad.", th);
            zzbvr.a(iObjectWrapper, th, "adapter.loadRtbRewardedAd");
            hbo.n();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final zzbyi zzf() {
        return zzbyi.Y0(this.b.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final zzbyi zzg() {
        return zzbyi.Y0(this.b.getSDKVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final com.google.android.gms.ads.internal.client.zzea zzh() {
        MediationExtrasReceiver mediationExtrasReceiver = this.b;
        if (mediationExtrasReceiver instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) mediationExtrasReceiver).getVideoController();
            } catch (Throwable th) {
                zzo.zzg("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final boolean zzm(IObjectWrapper iObjectWrapper) {
        MediationRewardedAd mediationRewardedAd = this.d;
        if (mediationRewardedAd == null) {
            return false;
        }
        try {
            mediationRewardedAd.showAd((Context) ObjectWrapper.Z1(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            zzo.zzg("", th);
            zzbvr.a(iObjectWrapper, th, "adapter.showRtbRewardedAd");
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final void zzo(String str) {
        this.f = str;
    }
}
