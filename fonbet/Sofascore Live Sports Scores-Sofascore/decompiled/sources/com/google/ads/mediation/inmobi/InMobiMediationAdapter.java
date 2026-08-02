package com.google.ads.mediation.inmobi;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.inmobi.sdk.InMobiSdk;
import defpackage.cy9;
import defpackage.f5p;
import defpackage.iy9;
import defpackage.jec;
import defpackage.jy9;
import defpackage.ky9;
import defpackage.ly9;
import defpackage.my9;
import defpackage.py9;
import defpackage.qy9;
import defpackage.ry9;
import defpackage.sx9;
import defpackage.sy9;
import defpackage.ty9;
import defpackage.ux9;
import defpackage.uy9;
import defpackage.uz2;
import defpackage.vy9;
import defpackage.yso;
import defpackage.zx9;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class InMobiMediationAdapter extends RtbAdapter {
    public static final String ERROR_MESSAGE_FOR_INVALID_ACCOUNTID = "Missing or invalid Account ID, configured for this ad source instance in the AdMob or Ad Manager UI";
    public static final String TAG = "InMobiMediationAdapter";
    private sx9 inMobiAdFactory;
    private zx9 inMobiInitializer;
    private iy9 inMobiRtbBannerAd;
    private jy9 inMobiRtbInterstitialAd;
    private ky9 inMobiRtbNativeAd;
    private ly9 inMobiRtbRewardedAd;
    private ly9 inMobiRtbRewardedInterstitialAd;
    private my9 inMobiSdkWrapper;
    private qy9 inMobiWaterfallBannerAd;
    private sy9 inMobiWaterfallInterstitialAd;
    private uy9 inMobiWaterfallNativeAd;
    private vy9 inMobiWaterfallRewardedAd;
    private vy9 inMobiWaterfallRewardedInterstitialAd;
    private jec mediationUtils;

    public InMobiMediationAdapter() {
        zx9 zx9Var = zx9.c;
        if (zx9Var == null) {
            zx9Var = new zx9();
            zx9.c = zx9Var;
        }
        this.inMobiInitializer = zx9Var;
        this.inMobiAdFactory = new sx9();
        this.inMobiSdkWrapper = new my9();
        this.mediationUtils = new jec();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(@NonNull RtbSignalData rtbSignalData, @NonNull SignalCallbacks signalCallbacks) {
        uz2 t = f5p.t(rtbSignalData.getContext(), "c_google", rtbSignalData.getNetworkExtras());
        my9 my9Var = this.inMobiSdkWrapper;
        HashMap hashMap = t.a;
        my9Var.getClass();
        signalCallbacks.onSuccess(InMobiSdk.getToken(hashMap, ""));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        this.inMobiSdkWrapper.getClass();
        String version = InMobiSdk.getVersion();
        String[] split = version.split("\\.");
        if (split.length >= 3) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        }
        StringBuilder sb = new StringBuilder("Unexpected SDK version format: ");
        sb.append(version);
        sb.append(". Returning 0.0.0 for SDK version.");
        return new VersionInfo(0, 0, 0);
    }

    @NonNull
    public VersionInfo getVersionInfo(String str) {
        String[] split = str.split("\\.");
        if (split.length >= 4) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[3]) + (Integer.parseInt(split[2]) * 100));
        }
        StringBuilder sb = new StringBuilder("Unexpected adapter version format: ");
        sb.append(str);
        sb.append(". Returning 0.0.0 for adapter version.");
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        this.inMobiSdkWrapper.getClass();
        if (InMobiSdk.isSDKInitialized()) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().getServerParameters().getString("accountid");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size <= 0) {
            initializationCompleteCallback.onInitializationFailed(yso.u(100, ERROR_MESSAGE_FOR_INVALID_ACCOUNTID).toString());
            return;
        }
        String str = (String) hashSet.iterator().next();
        if (size > 1) {
            String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the InMobi SDK", "accountid", hashSet, str);
        }
        this.inMobiInitializer.a(context, str, new cy9(initializationCompleteCallback));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        qy9 qy9Var = new qy9(mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiWaterfallBannerAd = qy9Var;
        jec jecVar = this.mediationUtils;
        Context context = mediationBannerAdConfiguration.getContext();
        AdSize b = ux9.b(context, mediationBannerAdConfiguration.getAdSize(), jecVar);
        MediationAdLoadCallback mediationAdLoadCallback2 = qy9Var.a;
        if (b == null) {
            AdError u = yso.u(102, "The requested banner size: " + mediationBannerAdConfiguration.getAdSize() + " is not supported by InMobi SDK.");
            u.toString();
            mediationAdLoadCallback2.onFailure(u);
            return;
        }
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        String string = serverParameters.getString("accountid");
        AdError f = ux9.f(ux9.d(serverParameters), string);
        if (f != null) {
            mediationAdLoadCallback2.onFailure(f);
        } else {
            qy9Var.b.a(context, string, new py9(qy9Var, context, b, mediationBannerAdConfiguration));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        sy9 sy9Var = new sy9(mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiWaterfallInterstitialAd = sy9Var;
        Context context = mediationInterstitialAdConfiguration.getContext();
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString("accountid");
        AdError f = ux9.f(ux9.d(serverParameters), string);
        if (f != null) {
            sy9Var.b.onFailure(f);
        } else {
            sy9Var.c.a(context, string, new ry9(sy9Var, context, mediationInterstitialAdConfiguration, 0));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        uy9 uy9Var = new uy9(mediationNativeAdConfiguration, mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiWaterfallNativeAd = uy9Var;
        MediationNativeAdConfiguration mediationNativeAdConfiguration2 = uy9Var.a;
        Context context = mediationNativeAdConfiguration2.getContext();
        Bundle serverParameters = mediationNativeAdConfiguration2.getServerParameters();
        String string = serverParameters.getString("accountid");
        long d = ux9.d(serverParameters);
        AdError f = ux9.f(d, string);
        if (f != null) {
            uy9Var.b.onFailure(f);
        } else {
            uy9Var.e.a(context, string, new ty9(uy9Var, context, d));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        vy9 vy9Var = new vy9(mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiWaterfallRewardedAd = vy9Var;
        vy9Var.c(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedInterstitialAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        vy9 vy9Var = new vy9(mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiWaterfallRewardedInterstitialAd = vy9Var;
        vy9Var.c(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        iy9 iy9Var = new iy9(mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiRtbBannerAd = iy9Var;
        jec jecVar = this.mediationUtils;
        Context context = mediationBannerAdConfiguration.getContext();
        AdSize b = ux9.b(context, mediationBannerAdConfiguration.getAdSize(), jecVar);
        if (b == null) {
            b = mediationBannerAdConfiguration.getAdSize();
        }
        iy9Var.a(context, b, mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        jy9 jy9Var = new jy9(mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiRtbInterstitialAd = jy9Var;
        jy9Var.a(mediationInterstitialAdConfiguration.getContext(), mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        ky9 ky9Var = new ky9(mediationNativeAdConfiguration, mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiRtbNativeAd = ky9Var;
        MediationNativeAdConfiguration mediationNativeAdConfiguration2 = ky9Var.a;
        ky9Var.a(ux9.d(mediationNativeAdConfiguration2.getServerParameters()), mediationNativeAdConfiguration2.getContext());
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        ly9 ly9Var = new ly9(mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiRtbRewardedAd = ly9Var;
        ly9Var.a(mediationRewardedAdConfiguration.getContext(), mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedInterstitialAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        ly9 ly9Var = new ly9(mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiRtbRewardedInterstitialAd = ly9Var;
        ly9Var.a(mediationRewardedAdConfiguration.getContext(), mediationRewardedAdConfiguration);
    }

    public InMobiMediationAdapter(zx9 zx9Var, sx9 sx9Var, my9 my9Var, jec jecVar) {
        this.inMobiInitializer = zx9Var;
        this.inMobiAdFactory = sx9Var;
        this.inMobiSdkWrapper = my9Var;
        this.mediationUtils = jecVar;
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        return getVersionInfo("11.3.0.1");
    }
}
