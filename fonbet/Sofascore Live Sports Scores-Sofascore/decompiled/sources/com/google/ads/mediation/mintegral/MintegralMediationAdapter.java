package com.google.ads.mediation.mintegral;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.moloco.MolocoMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
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
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.mbbid.out.BidManager;
import com.mbridge.msdk.newinterstitial.out.MBBidNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.MBNewInterstitialHandler;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBBidNativeHandler;
import com.mbridge.msdk.out.MBBidRewardVideoHandler;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.out.MBNativeHandler;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import com.mbridge.msdk.out.MBSplashHandler;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.system.MBridgeSDKImpl;
import defpackage.bka;
import defpackage.by9;
import defpackage.d4a;
import defpackage.dti;
import defpackage.e3c;
import defpackage.fkc;
import defpackage.gkc;
import defpackage.hkc;
import defpackage.ikc;
import defpackage.jkc;
import defpackage.kdc;
import defpackage.kkc;
import defpackage.lkc;
import defpackage.mkc;
import defpackage.nkc;
import defpackage.tz9;
import defpackage.vha;
import defpackage.yia;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class MintegralMediationAdapter extends RtbAdapter {
    public static final String TAG = "MintegralMediationAdapter";
    public static MBridgeSDKImpl d;
    public static final Map<lkc, WeakReference<Object>> loadedSlotIdentifiers = new ConcurrentHashMap();
    public final ExecutorService a = Executors.newCachedThreadPool();
    public final dti b = new dti(23);
    public final dti c = new dti(27);

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(@NonNull RtbSignalData rtbSignalData, @NonNull SignalCallbacks signalCallbacks) {
        this.b.getClass();
        if (dti.x()) {
            ArrayList arrayList = new ArrayList();
            for (MediationConfiguration mediationConfiguration : rtbSignalData.getConfigurations()) {
                String string = mediationConfiguration.getServerParameters().getString(MolocoMediationAdapter.KEY_AD_UNIT_ID);
                String string2 = mediationConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
                if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                    arrayList.add(new lkc(string, string2));
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                WeakReference<Object> weakReference = loadedSlotIdentifiers.get((lkc) it.next());
                if (weakReference != null && weakReference.get() != null) {
                    signalCallbacks.onFailure(new AdError(106, "An ad for the Mintegral slot is already loaded and is yet to be shown.", "com.google.ads.mediation.mintegral"));
                    return;
                }
            }
        }
        signalCallbacks.onSuccess(BidManager.getBuyerUid(rtbSignalData.getContext()));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        String[] split = MBConfiguration.SDK_VERSION.split("_");
        if (split.length > 1) {
            String[] split2 = split[1].split("\\.");
            if (split2.length >= 3) {
                return new VersionInfo(Integer.parseInt(split2[0]), Integer.parseInt(split2[1]), Integer.parseInt(split2[2]));
            }
        }
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        String[] split = "17.1.61.1".split("\\.");
        if (split.length < 4) {
            return new VersionInfo(0, 0, 0);
        }
        return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[3]) + (Integer.parseInt(split[2]) * 100));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            Bundle serverParameters = it.next().getServerParameters();
            String string = serverParameters.getString(MBridgeConstans.APP_ID);
            String string2 = serverParameters.getString("app_key");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
            if (!TextUtils.isEmpty(string2)) {
                hashSet2.add(string2);
            }
        }
        int size = hashSet.size();
        int size2 = hashSet2.size();
        if (size <= 0 || size2 <= 0) {
            AdError m = vha.m(101, "Missing or invalid App ID or App Key configured for this ad source instance in the AdMob or Ad Manager UI");
            m.toString();
            initializationCompleteCallback.onInitializationFailed(m.toString());
            return;
        }
        String str = (String) hashSet.iterator().next();
        if (size > 1) {
            String.format("Found multiple app IDs in %s. Using %s to initialize Mintegral SDK.", hashSet, str);
        }
        String str2 = (String) hashSet2.iterator().next();
        if (size2 > 1) {
            String.format("Found multiple App Keys in %s. Using %s to initialize Mintegral SDK.", hashSet2, str2);
        }
        MBridgeSDKImpl mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
        d = mBridgeSDK;
        Map<String, String> mBConfigurationMap = mBridgeSDK.getMBConfigurationMap(str, str2);
        try {
            Aa aa = new Aa();
            Method declaredMethod = Aa.class.getDeclaredMethod("b", String.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(aa, "Y+H6DFttYrPQYcIBiQKwJQKQYrN=");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        d.setConsentStatus(context);
        this.a.submit(new kdc(this, mBConfigurationMap, context, initializationCompleteCallback));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadAppOpenAd(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        dti dtiVar = this.b;
        dtiVar.getClass();
        dti.w(serverParameters);
        mkc mkcVar = new mkc(mediationAdLoadCallback, dtiVar);
        Bundle serverParameters2 = mediationAppOpenAdConfiguration.getServerParameters();
        String string = serverParameters2.getString(MolocoMediationAdapter.KEY_AD_UNIT_ID);
        String string2 = serverParameters2.getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        AdError X = tz9.X(string, string2);
        MediationAdLoadCallback mediationAdLoadCallback2 = mkcVar.a;
        if (X != null) {
            mediationAdLoadCallback2.onFailure(X);
            return;
        }
        mkcVar.e.getClass();
        if (dti.x()) {
            lkc lkcVar = new lkc(string, string2);
            mkcVar.b = lkcVar;
            Map<lkc, WeakReference<Object>> map = loadedSlotIdentifiers;
            WeakReference<Object> weakReference = map.get(lkcVar);
            if (weakReference != null && weakReference.get() != null) {
                mediationAdLoadCallback2.onFailure(new AdError(106, "An ad for the Mintegral slot is already loaded and is yet to be shown.", "com.google.ads.mediation.mintegral"));
                return;
            }
            map.put(mkcVar.b, new WeakReference<>(mkcVar));
        }
        by9 by9Var = new by9();
        mkcVar.d = by9Var;
        string2.getClass();
        string.getClass();
        by9Var.a = new MBSplashHandler(string2, string, true, 5);
        MBSplashHandler mBSplashHandler = (MBSplashHandler) mkcVar.d.a;
        if (mBSplashHandler != null) {
            mBSplashHandler.setSplashLoadListener(mkcVar);
        }
        MBSplashHandler mBSplashHandler2 = (MBSplashHandler) mkcVar.d.a;
        if (mBSplashHandler2 != null) {
            mBSplashHandler2.setSplashShowListener(mkcVar);
        }
        MBSplashHandler mBSplashHandler3 = (MBSplashHandler) mkcVar.d.a;
        if (mBSplashHandler3 != null) {
            mBSplashHandler3.preLoad();
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        this.b.getClass();
        dti.w(serverParameters);
        hkc hkcVar = new hkc(mediationAdLoadCallback);
        BannerSize a = hkc.a(mediationBannerAdConfiguration.getAdSize(), mediationBannerAdConfiguration.getContext(), false, this.c);
        MediationAdLoadCallback mediationAdLoadCallback2 = hkcVar.a;
        if (a == null) {
            AdError m = vha.m(102, "The requested banner size: " + mediationBannerAdConfiguration.getAdSize() + " is not supported by Mintegral SDK.");
            m.toString();
            mediationAdLoadCallback2.onFailure(m);
            return;
        }
        String string = mediationBannerAdConfiguration.getServerParameters().getString(MolocoMediationAdapter.KEY_AD_UNIT_ID);
        String string2 = mediationBannerAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        AdError X = tz9.X(string, string2);
        if (X != null) {
            mediationAdLoadCallback2.onFailure(X);
            return;
        }
        MBBannerView mBBannerView = new MBBannerView(mediationBannerAdConfiguration.getContext());
        hkcVar.b = mBBannerView;
        mBBannerView.init(a, string2, string);
        hkcVar.b.setLayoutParams(new FrameLayout.LayoutParams(tz9.z(mediationBannerAdConfiguration.getContext(), a.getWidth()), tz9.z(mediationBannerAdConfiguration.getContext(), a.getHeight())));
        hkcVar.b.setBannerAdListener(hkcVar);
        hkcVar.b.load();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        dti dtiVar = this.b;
        dtiVar.getClass();
        dti.w(serverParameters);
        ikc ikcVar = new ikc(mediationInterstitialAdConfiguration, mediationAdLoadCallback, dtiVar, 1);
        String string = mediationInterstitialAdConfiguration.getServerParameters().getString(MolocoMediationAdapter.KEY_AD_UNIT_ID);
        String string2 = mediationInterstitialAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        AdError X = tz9.X(string, string2);
        MediationAdLoadCallback mediationAdLoadCallback2 = ikcVar.a;
        if (X != null) {
            mediationAdLoadCallback2.onFailure(X);
            return;
        }
        ikcVar.e.getClass();
        if (dti.x()) {
            lkc lkcVar = new lkc(string, string2);
            ikcVar.b = lkcVar;
            Map<lkc, WeakReference<Object>> map = loadedSlotIdentifiers;
            WeakReference<Object> weakReference = map.get(lkcVar);
            if (weakReference != null && weakReference.get() != null) {
                mediationAdLoadCallback2.onFailure(new AdError(106, "An ad for the Mintegral slot is already loaded and is yet to be shown.", "com.google.ads.mediation.mintegral"));
                return;
            }
            map.put(ikcVar.b, new WeakReference<>(ikcVar));
        }
        bka bkaVar = new bka(5, false);
        ikcVar.g = bkaVar;
        Context context = mediationInterstitialAdConfiguration.getContext();
        context.getClass();
        string2.getClass();
        string.getClass();
        bkaVar.b = new MBNewInterstitialHandler(context, string2, string);
        bka bkaVar2 = (bka) ikcVar.g;
        bkaVar2.getClass();
        MBNewInterstitialHandler mBNewInterstitialHandler = (MBNewInterstitialHandler) bkaVar2.b;
        if (mBNewInterstitialHandler != null) {
            mBNewInterstitialHandler.setInterstitialVideoListener(ikcVar);
        }
        MBNewInterstitialHandler mBNewInterstitialHandler2 = (MBNewInterstitialHandler) ((bka) ikcVar.g).b;
        if (mBNewInterstitialHandler2 != null) {
            mBNewInterstitialHandler2.load();
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        Bundle serverParameters = mediationNativeAdConfiguration.getServerParameters();
        this.b.getClass();
        dti.w(serverParameters);
        nkc nkcVar = new nkc(mediationNativeAdConfiguration, mediationAdLoadCallback);
        String string = mediationNativeAdConfiguration.getServerParameters().getString(MolocoMediationAdapter.KEY_AD_UNIT_ID);
        String string2 = mediationNativeAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        AdError X = tz9.X(string, string2);
        MediationAdLoadCallback mediationAdLoadCallback2 = nkcVar.t;
        if (X != null) {
            mediationAdLoadCallback2.onFailure(X);
            return;
        }
        Map<String, Object> nativeProperties = MBBidNativeHandler.getNativeProperties(string2, string);
        nativeProperties.put(MBridgeConstans.NATIVE_VIDEO_SUPPORT, Boolean.TRUE);
        nativeProperties.put("ad_num", 1);
        MBNativeHandler mBNativeHandler = new MBNativeHandler(nativeProperties, mediationNativeAdConfiguration.getContext());
        nkcVar.w = mBNativeHandler;
        mBNativeHandler.setAdListener(new fkc(nkcVar, mediationNativeAdConfiguration.getContext(), mediationAdLoadCallback2));
        nkcVar.w.load();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        dti dtiVar = this.b;
        dtiVar.getClass();
        dti.w(serverParameters);
        kkc kkcVar = new kkc(mediationRewardedAdConfiguration, mediationAdLoadCallback, dtiVar, 1);
        String string = mediationRewardedAdConfiguration.getServerParameters().getString(MolocoMediationAdapter.KEY_AD_UNIT_ID);
        String string2 = mediationRewardedAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        AdError X = tz9.X(string, string2);
        MediationAdLoadCallback mediationAdLoadCallback2 = kkcVar.a;
        if (X != null) {
            mediationAdLoadCallback2.onFailure(X);
            return;
        }
        kkcVar.e.getClass();
        if (dti.x()) {
            lkc lkcVar = new lkc(string, string2);
            kkcVar.b = lkcVar;
            Map<lkc, WeakReference<Object>> map = loadedSlotIdentifiers;
            WeakReference<Object> weakReference = map.get(lkcVar);
            if (weakReference != null && weakReference.get() != null) {
                mediationAdLoadCallback2.onFailure(new AdError(106, "An ad for the Mintegral slot is already loaded and is yet to be shown.", "com.google.ads.mediation.mintegral"));
                return;
            }
            map.put(kkcVar.b, new WeakReference<>(kkcVar));
        }
        e3c e3cVar = new e3c(2);
        kkcVar.g = e3cVar;
        Context context = mediationRewardedAdConfiguration.getContext();
        context.getClass();
        string2.getClass();
        string.getClass();
        e3cVar.b = new MBRewardVideoHandler(context, string2, string);
        e3c e3cVar2 = (e3c) kkcVar.g;
        e3cVar2.getClass();
        MBRewardVideoHandler mBRewardVideoHandler = (MBRewardVideoHandler) e3cVar2.b;
        if (mBRewardVideoHandler != null) {
            mBRewardVideoHandler.setRewardVideoListener(kkcVar);
        }
        MBRewardVideoHandler mBRewardVideoHandler2 = (MBRewardVideoHandler) ((e3c) kkcVar.g).b;
        if (mBRewardVideoHandler2 != null) {
            mBRewardVideoHandler2.load();
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbAppOpenAd(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        dti dtiVar = this.b;
        dtiVar.getClass();
        dti.w(serverParameters);
        gkc gkcVar = new gkc(mediationAdLoadCallback, dtiVar);
        Bundle serverParameters2 = mediationAppOpenAdConfiguration.getServerParameters();
        String string = serverParameters2.getString(MolocoMediationAdapter.KEY_AD_UNIT_ID);
        String string2 = serverParameters2.getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        String bidResponse = mediationAppOpenAdConfiguration.getBidResponse();
        gkcVar.f = bidResponse;
        AdError Y = tz9.Y(string, string2, bidResponse);
        if (Y != null) {
            gkcVar.a.onFailure(Y);
            return;
        }
        gkcVar.e.getClass();
        if (dti.x()) {
            lkc lkcVar = new lkc(string, string2);
            gkcVar.b = lkcVar;
            loadedSlotIdentifiers.put(lkcVar, new WeakReference<>(gkcVar));
        }
        gkcVar.d = new by9();
        String watermark = mediationAppOpenAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, watermark);
                by9 by9Var = gkcVar.d;
                by9Var.getClass();
                MBSplashHandler mBSplashHandler = (MBSplashHandler) by9Var.a;
                if (mBSplashHandler != null) {
                    mBSplashHandler.setExtraInfo(jSONObject);
                }
            } catch (JSONException unused) {
            }
        }
        by9 by9Var2 = gkcVar.d;
        by9Var2.getClass();
        string2.getClass();
        string.getClass();
        by9Var2.a = new MBSplashHandler(string2, string, true, 5);
        MBSplashHandler mBSplashHandler2 = (MBSplashHandler) gkcVar.d.a;
        if (mBSplashHandler2 != null) {
            mBSplashHandler2.setSplashLoadListener(gkcVar);
        }
        MBSplashHandler mBSplashHandler3 = (MBSplashHandler) gkcVar.d.a;
        if (mBSplashHandler3 != null) {
            mBSplashHandler3.setSplashShowListener(gkcVar);
        }
        by9 by9Var3 = gkcVar.d;
        String str = gkcVar.f;
        by9Var3.getClass();
        str.getClass();
        MBSplashHandler mBSplashHandler4 = (MBSplashHandler) by9Var3.a;
        if (mBSplashHandler4 != null) {
            mBSplashHandler4.preLoadByToken(str);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        this.b.getClass();
        dti.w(serverParameters);
        hkc hkcVar = new hkc(mediationAdLoadCallback);
        BannerSize a = hkc.a(mediationBannerAdConfiguration.getAdSize(), mediationBannerAdConfiguration.getContext(), true, this.c);
        MediationAdLoadCallback mediationAdLoadCallback2 = hkcVar.a;
        if (a == null) {
            AdError m = vha.m(102, "The requested banner size: " + mediationBannerAdConfiguration.getAdSize() + " is not supported by Mintegral SDK.");
            m.toString();
            mediationAdLoadCallback2.onFailure(m);
            return;
        }
        String string = mediationBannerAdConfiguration.getServerParameters().getString(MolocoMediationAdapter.KEY_AD_UNIT_ID);
        String string2 = mediationBannerAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        String bidResponse = mediationBannerAdConfiguration.getBidResponse();
        AdError Y = tz9.Y(string, string2, bidResponse);
        if (Y != null) {
            mediationAdLoadCallback2.onFailure(Y);
            return;
        }
        Context context = mediationBannerAdConfiguration.getContext();
        context.getClass();
        MBBannerView mBBannerView = new MBBannerView(context);
        hkcVar.b = mBBannerView;
        mBBannerView.init(a, string2, string);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, mediationBannerAdConfiguration.getWatermark());
            hkcVar.b.setExtraInfo(jSONObject);
        } catch (JSONException unused) {
        }
        hkcVar.b.setLayoutParams(new FrameLayout.LayoutParams(tz9.z(mediationBannerAdConfiguration.getContext(), a.getWidth()), tz9.z(mediationBannerAdConfiguration.getContext(), a.getHeight())));
        hkcVar.b.setBannerAdListener(hkcVar);
        hkcVar.b.loadFromBid(bidResponse);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        dti dtiVar = this.b;
        dtiVar.getClass();
        dti.w(serverParameters);
        ikc ikcVar = new ikc(mediationInterstitialAdConfiguration, mediationAdLoadCallback, dtiVar, 0);
        String string = mediationInterstitialAdConfiguration.getServerParameters().getString(MolocoMediationAdapter.KEY_AD_UNIT_ID);
        String string2 = mediationInterstitialAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        String bidResponse = mediationInterstitialAdConfiguration.getBidResponse();
        AdError Y = tz9.Y(string, string2, bidResponse);
        if (Y != null) {
            ikcVar.a.onFailure(Y);
            return;
        }
        ikcVar.e.getClass();
        if (dti.x()) {
            lkc lkcVar = new lkc(string, string2);
            ikcVar.b = lkcVar;
            loadedSlotIdentifiers.put(lkcVar, new WeakReference<>(ikcVar));
        }
        yia yiaVar = new yia((char) 0, 5);
        ikcVar.g = yiaVar;
        Context context = mediationInterstitialAdConfiguration.getContext();
        context.getClass();
        string2.getClass();
        string.getClass();
        yiaVar.b = new MBBidNewInterstitialHandler(context, string2, string);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, mediationInterstitialAdConfiguration.getWatermark());
            yia yiaVar2 = (yia) ikcVar.g;
            yiaVar2.getClass();
            MBBidNewInterstitialHandler mBBidNewInterstitialHandler = (MBBidNewInterstitialHandler) yiaVar2.b;
            if (mBBidNewInterstitialHandler != null) {
                mBBidNewInterstitialHandler.setExtraInfo(jSONObject);
            }
        } catch (JSONException unused) {
        }
        yia yiaVar3 = (yia) ikcVar.g;
        yiaVar3.getClass();
        MBBidNewInterstitialHandler mBBidNewInterstitialHandler2 = (MBBidNewInterstitialHandler) yiaVar3.b;
        if (mBBidNewInterstitialHandler2 != null) {
            mBBidNewInterstitialHandler2.setInterstitialVideoListener(ikcVar);
        }
        yia yiaVar4 = (yia) ikcVar.g;
        yiaVar4.getClass();
        bidResponse.getClass();
        MBBidNewInterstitialHandler mBBidNewInterstitialHandler3 = (MBBidNewInterstitialHandler) yiaVar4.b;
        if (mBBidNewInterstitialHandler3 != null) {
            mBBidNewInterstitialHandler3.loadFromBid(bidResponse);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        Bundle serverParameters = mediationNativeAdConfiguration.getServerParameters();
        this.b.getClass();
        dti.w(serverParameters);
        jkc jkcVar = new jkc(mediationNativeAdConfiguration, mediationAdLoadCallback);
        String string = mediationNativeAdConfiguration.getServerParameters().getString(MolocoMediationAdapter.KEY_AD_UNIT_ID);
        String string2 = mediationNativeAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        String bidResponse = mediationNativeAdConfiguration.getBidResponse();
        AdError Y = tz9.Y(string, string2, bidResponse);
        MediationAdLoadCallback mediationAdLoadCallback2 = jkcVar.t;
        if (Y != null) {
            mediationAdLoadCallback2.onFailure(Y);
            return;
        }
        Map<String, Object> nativeProperties = MBBidNativeHandler.getNativeProperties(string2, string);
        nativeProperties.put(MBridgeConstans.NATIVE_VIDEO_SUPPORT, Boolean.TRUE);
        nativeProperties.put("ad_num", 1);
        jkcVar.w = new MBBidNativeHandler(nativeProperties, mediationNativeAdConfiguration.getContext());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, mediationNativeAdConfiguration.getWatermark());
            jkcVar.w.setExtraInfo(jSONObject);
        } catch (JSONException unused) {
        }
        jkcVar.w.setAdListener(new fkc(jkcVar, mediationNativeAdConfiguration.getContext(), mediationAdLoadCallback2));
        jkcVar.w.bidLoad(bidResponse);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        dti dtiVar = this.b;
        dtiVar.getClass();
        dti.w(serverParameters);
        kkc kkcVar = new kkc(mediationRewardedAdConfiguration, mediationAdLoadCallback, dtiVar, 0);
        String string = mediationRewardedAdConfiguration.getServerParameters().getString(MolocoMediationAdapter.KEY_AD_UNIT_ID);
        String string2 = mediationRewardedAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        String bidResponse = mediationRewardedAdConfiguration.getBidResponse();
        AdError Y = tz9.Y(string, string2, bidResponse);
        if (Y != null) {
            kkcVar.a.onFailure(Y);
            return;
        }
        kkcVar.e.getClass();
        if (dti.x()) {
            lkc lkcVar = new lkc(string, string2);
            kkcVar.b = lkcVar;
            loadedSlotIdentifiers.put(lkcVar, new WeakReference<>(kkcVar));
        }
        d4a d4aVar = new d4a(8);
        kkcVar.g = d4aVar;
        Context context = mediationRewardedAdConfiguration.getContext();
        context.getClass();
        string2.getClass();
        string.getClass();
        d4aVar.b = new MBBidRewardVideoHandler(context, string2, string);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, mediationRewardedAdConfiguration.getWatermark());
            d4a d4aVar2 = (d4a) kkcVar.g;
            d4aVar2.getClass();
            MBBidRewardVideoHandler mBBidRewardVideoHandler = (MBBidRewardVideoHandler) d4aVar2.b;
            if (mBBidRewardVideoHandler != null) {
                mBBidRewardVideoHandler.setExtraInfo(jSONObject);
            }
        } catch (JSONException unused) {
        }
        d4a d4aVar3 = (d4a) kkcVar.g;
        d4aVar3.getClass();
        MBBidRewardVideoHandler mBBidRewardVideoHandler2 = (MBBidRewardVideoHandler) d4aVar3.b;
        if (mBBidRewardVideoHandler2 != null) {
            mBBidRewardVideoHandler2.setRewardVideoListener(kkcVar);
        }
        d4a d4aVar4 = (d4a) kkcVar.g;
        d4aVar4.getClass();
        bidResponse.getClass();
        MBBidRewardVideoHandler mBBidRewardVideoHandler3 = (MBBidRewardVideoHandler) d4aVar4.b;
        if (mBBidRewardVideoHandler3 != null) {
            mBBidRewardVideoHandler3.loadFromBid(bidResponse);
        }
    }
}
