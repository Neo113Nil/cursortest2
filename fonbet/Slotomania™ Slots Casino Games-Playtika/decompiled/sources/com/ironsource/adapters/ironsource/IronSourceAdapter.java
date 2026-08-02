package com.ironsource.adapters.ironsource;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.ironsource.C2381d8;
import com.ironsource.C2409f0;
import com.ironsource.C2546mc;
import com.ironsource.C2556n4;
import com.ironsource.C2564nc;
import com.ironsource.C2596p8;
import com.ironsource.C2736x5;
import com.ironsource.EnumC2754y5;
import com.ironsource.J9;
import com.ironsource.Jb;
import com.ironsource.K9;
import com.ironsource.L8;
import com.ironsource.Lc;
import com.ironsource.adapters.ironsource.IronSourceLoadParameters;
import com.ironsource.adapters.ironsource.nativeAd.IronSourceNativeAdAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.j;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.p;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.utils.SDKUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.unity3d.ironsourceads.IronSourceAds;
import com.unity3d.mediation.LevelPlay;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class IronSourceAdapter extends AbstractAdapter {
    public static final String IRONSOURCE_BIDDING_TOKEN_KEY = "token";
    public static final String IRONSOURCE_ONE_FLOW_KEY = "isOneFlow";
    private static final int IS_LOAD_EXCEPTION = 1000;
    private static final int IS_SHOW_EXCEPTION = 1001;
    private static final int RV_LOAD_EXCEPTION = 1002;
    private static final int RV_SHOW_EXCEPTION = 1003;
    private static final String VERSION = "9.4.0";
    public final String ADM_KEY;
    private final String DEMAND_SOURCE_NAME;
    private final String DYNAMIC_CONTROLLER_CONFIG;
    private final String DYNAMIC_CONTROLLER_DEBUG_MODE;
    private final String DYNAMIC_CONTROLLER_URL;
    private final String LWS_SUPPORT_STATE;
    private final String SDK_PLUGIN_TYPE;
    private final String SESSION_ID;
    private long initDuration;
    ConcurrentHashMap<String, ArrayList<J9>> mDemandSourceToBnAd;
    ConcurrentHashMap<String, J9> mDemandSourceToISAd;
    ConcurrentHashMap<String, J9> mDemandSourceToRvAd;
    private final C2564nc mNetworkGlobalDataWriter;
    private final L8 sessionDepthService;
    private static AtomicBoolean mDidInitSdk = new AtomicBoolean(false);
    private static C2409f0 mBaseAdPlayerExtraParams = new C2409f0();

    private IronSourceAdapter(String str) {
        super(str);
        this.DYNAMIC_CONTROLLER_URL = "controllerUrl";
        this.DYNAMIC_CONTROLLER_DEBUG_MODE = "debugMode";
        this.DYNAMIC_CONTROLLER_CONFIG = "controllerConfig";
        this.SESSION_ID = "sessionid";
        this.SDK_PLUGIN_TYPE = C2546mc.a.b;
        this.ADM_KEY = "adm";
        this.DEMAND_SOURCE_NAME = "demandSourceName";
        this.LWS_SUPPORT_STATE = "isSupportedLWS";
        this.mNetworkGlobalDataWriter = new C2564nc();
        this.initDuration = 0L;
        this.sessionDepthService = Jb.Y().s();
        this.mDemandSourceToRvAd = new ConcurrentHashMap<>();
        this.mDemandSourceToISAd = new ConcurrentHashMap<>();
        this.mDemandSourceToBnAd = new ConcurrentHashMap<>();
        setNativeAdAdapter(new IronSourceNativeAdAdapter(this));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
    
        if (r8 != false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C2381d8 convertBannerSize(Context context, ISBannerSize iSBannerSize) {
        String description = iSBannerSize.getDescription();
        description.hashCode();
        description.hashCode();
        char c = 65535;
        switch (description.hashCode()) {
            case -387072689:
                if (description.equals(j.c)) {
                    c = 0;
                    break;
                }
                break;
            case 72205083:
                if (description.equals(j.b)) {
                    c = 1;
                    break;
                }
                break;
            case 79011241:
                if (description.equals(j.e)) {
                    c = 2;
                    break;
                }
                break;
            case 1951953708:
                if (description.equals("BANNER")) {
                    c = 3;
                    break;
                }
                break;
            case 1999208305:
                if (description.equals("CUSTOM")) {
                    c = 4;
                    break;
                }
                break;
        }
        int i = 50;
        int i2 = Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
        switch (c) {
            case 0:
                i2 = 300;
                i = ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
                break;
            case 1:
                i = 90;
                break;
            case 2:
                boolean isLargeScreen = AdapterUtils.isLargeScreen(context);
                if (isLargeScreen) {
                    i2 = 728;
                    break;
                }
                break;
            case 4:
                int height = iSBannerSize.getHeight();
                if (height == 50 || height == 90) {
                    i = height;
                    break;
                }
        }
        return null;
    }

    private J9 createBannerAdInstance(String str, C2381d8 c2381d8, JSONObject jSONObject, LoadAdData loadAdData, BannerSmashListener bannerSmashListener) {
        IronLog.ADAPTER_API.verbose("creating banner ad instance for " + str);
        return new K9(str, new IronSourceBannerListener(this, bannerSmashListener, str)).a(mBaseAdPlayerExtraParams.get()).a(jSONObject.optInt("instanceType", 2) == 2).c(jSONObject.optBoolean("isOneFlow")).a(c2381d8).b(loadAdData.isMultipleAdObjectsFlow()).b(loadAdData.adUnitId()).a();
    }

    private J9 createInterstitialAdInstance(String str, JSONObject jSONObject, LoadAdData loadAdData, InterstitialSmashListener interstitialSmashListener) {
        boolean optBoolean = jSONObject.optBoolean("isOneFlow");
        boolean z = jSONObject.optInt("instanceType", 2) == 2;
        IronLog.ADAPTER_API.verbose("creating ad instance for " + str + " isBidder=" + z);
        return new K9(str, new IronSourceInterstitialListener(interstitialSmashListener, str)).a(mBaseAdPlayerExtraParams.get()).c(optBoolean).a(z).b(loadAdData.isMultipleAdObjectsFlow()).b(loadAdData.adUnitId()).a();
    }

    private J9 createRewardedVideoAdInstance(String str, boolean z, JSONObject jSONObject, LoadAdData loadAdData, RewardedVideoSmashListener rewardedVideoSmashListener) {
        boolean optBoolean = jSONObject.optBoolean("isOneFlow");
        boolean z2 = jSONObject.optInt("instanceType", 2) == 2;
        IronLog.ADAPTER_API.verbose("creating ad instance for " + str + " isDemandOnly=" + z + " isBidder=" + z2);
        return new K9(str, new IronSourceRewardedVideoListener(rewardedVideoSmashListener, str, z)).a(mBaseAdPlayerExtraParams.get()).c().c(optBoolean).b(loadAdData.isMultipleAdObjectsFlow()).a(z2).b(loadAdData.adUnitId()).a();
    }

    public static String getAdapterSDKVersion() {
        return SDKUtils.getSDKVersion();
    }

    public static IntegrationData getIntegrationData(Context context) {
        return new IntegrationData("IronSource", "9.4.0");
    }

    private void initInterstitialInternal(String str, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener, String str2) {
        initSDK(str, jSONObject);
        interstitialSmashListener.onInterstitialInitSuccess();
    }

    private void initRewardedVideoInternal(String str, JSONObject jSONObject) {
        initSDK(str, jSONObject);
    }

    private boolean isMultipleAdObjectsFlow(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.optBoolean("isMultipleAdUnits", false);
    }

    private void loadBannerInternal(Activity activity, ISBannerSize iSBannerSize, JSONObject jSONObject, BannerSmashListener bannerSmashListener, String str, LoadAdData loadAdData) {
        BannerSmashListener bannerSmashListener2;
        Exception exc;
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            C2381d8 convertBannerSize = convertBannerSize(ContextProvider.getInstance().getApplicationContext(), iSBannerSize);
            if (convertBannerSize == null) {
                try {
                    bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(getProviderName()));
                    return;
                } catch (Exception e) {
                    exc = e;
                    bannerSmashListener2 = bannerSmashListener;
                    C2556n4.d().a(exc);
                    bannerSmashListener2.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("Banner Load Fail, " + getProviderName() + " - " + exc.getMessage()));
                }
            }
            bannerSmashListener2 = bannerSmashListener;
            try {
                IronSourceNetwork.loadAdView(activity, createBannerAdInstance(demandSourceName, convertBannerSize, jSONObject, loadAdData, bannerSmashListener2), new IronSourceLoadParameters.WithLog(new IronSourceLoadParameters.Base(jSONObject, str)).value());
            } catch (Exception e2) {
                e = e2;
                exc = e;
                C2556n4.d().a(exc);
                bannerSmashListener2.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("Banner Load Fail, " + getProviderName() + " - " + exc.getMessage()));
            }
        } catch (Exception e3) {
            e = e3;
            bannerSmashListener2 = bannerSmashListener;
        }
    }

    private void loadInterstitialAdInternal(String str, String str2, JSONObject jSONObject, LoadAdData loadAdData, InterstitialSmashListener interstitialSmashListener) throws Exception {
        IronSourceLoadParameters.WithLog withLog = new IronSourceLoadParameters.WithLog(new IronSourceLoadParameters.Base(jSONObject, str2));
        J9 j9 = this.mDemandSourceToISAd.get(str);
        if (j9 == null) {
            j9 = createInterstitialAdInstance(str, jSONObject, loadAdData, interstitialSmashListener);
            this.mDemandSourceToISAd.put(str, j9);
        }
        IronSourceNetwork.loadAd(j9, withLog.value());
    }

    private void loadRewardedVideoAdInternal(JSONObject jSONObject, String str, String str2, LoadAdData loadAdData, RewardedVideoSmashListener rewardedVideoSmashListener) throws Exception {
        IronSourceLoadParameters.WithLog withLog = new IronSourceLoadParameters.WithLog(new IronSourceLoadParameters.Base(jSONObject, str2));
        J9 j9 = this.mDemandSourceToRvAd.get(str);
        if (j9 == null) {
            j9 = createRewardedVideoAdInstance(str, withLog.demandOnly(), jSONObject, loadAdData, rewardedVideoSmashListener);
            this.mDemandSourceToRvAd.put(str, j9);
        }
        IronSourceNetwork.loadAd(j9, withLog.value());
    }

    private void showAdInternal(J9 j9, IronSource.a aVar) throws Exception {
        int a = this.sessionDepthService.a(aVar);
        HashMap hashMap = new HashMap();
        hashMap.put("sessionDepth", String.valueOf(a));
        IronLog.ADAPTER_API.verbose("demandSourceName=" + j9.g() + " showParams=" + hashMap);
        IronSourceNetwork.showAd(ContextProvider.getInstance().getCurrentActiveActivity(), j9, hashMap);
    }

    public static IronSourceAdapter startAdapter(String str) {
        return new IronSourceAdapter(str);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void destroyBanner(JSONObject jSONObject) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose(demandSourceName + ": destroyBanner()");
        ArrayList<J9> arrayList = this.mDemandSourceToBnAd.get(demandSourceName);
        if (arrayList != null) {
            try {
                Iterator<J9> it = arrayList.iterator();
                while (it.hasNext()) {
                    IronSourceNetwork.destroyAd(it.next());
                }
                this.mDemandSourceToBnAd.remove(demandSourceName);
            } catch (Exception e) {
                C2556n4.d().a(e);
                IronLog.ADAPTER_API.verbose("destroyBanner failed: " + e.getMessage());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void earlyInit(String str, String str2, JSONObject jSONObject) {
        if (p.h().i() == null) {
            IronLog.ADAPTER_API.error("Appkey is null for early init");
        } else {
            IronSourceUtils.i(getDemandSourceName(jSONObject) + ": earlyInit");
            initSDK(p.h().i(), jSONObject);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public Map<String, Object> getBannerBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        return new HashMap();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getCoreSDKVersion() {
        return SDKUtils.getSDKVersion();
    }

    public String getDemandSourceName(JSONObject jSONObject) {
        return !TextUtils.isEmpty(jSONObject.optString("demandSourceName")) ? jSONObject.optString("demandSourceName") : getProviderName();
    }

    public HashMap<String, String> getInitParams() {
        HashMap<String, String> hashMap = new HashMap<>();
        String pluginType = getPluginType();
        if (!TextUtils.isEmpty(pluginType)) {
            hashMap.put(C2546mc.a.b, pluginType);
        }
        if (!TextUtils.isEmpty(p.h().o())) {
            hashMap.put("sessionid", p.h().o());
        }
        return hashMap;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public Map<String, Object> getInterstitialBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        return new HashMap();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public LoadWhileShowSupportState getLoadWhileShowSupportState(JSONObject jSONObject) {
        return (jSONObject == null || !jSONObject.optBoolean("isSupportedLWS")) ? this.mLWSSupportState : LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public Map<String, Object> getRewardedVideoBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        return new HashMap();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getVersion() {
        return "9.4.0";
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initAndLoadRewardedVideo(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog.INTERNAL.verbose("demandSourceName: " + getDemandSourceName(jSONObject));
        initRewardedVideoInternal(str, jSONObject);
        loadRewardedVideo(jSONObject, jSONObject2, rewardedVideoSmashListener);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBannerForBidding(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        IronLog.ADAPTER_API.verbose("demandSourceName: " + getDemandSourceName(jSONObject));
        initSDK(str, jSONObject);
        bannerSmashListener.onBannerInitSuccess();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitial(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.INTERNAL.verbose("demandSourceName: " + demandSourceName);
        initInterstitialInternal(str, jSONObject, interstitialSmashListener, demandSourceName);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitialForBidding(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.INTERNAL.verbose("demandSourceName: " + demandSourceName);
        initInterstitialInternal(str, jSONObject, interstitialSmashListener, demandSourceName);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoForDemandOnly(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog.INTERNAL.verbose("demandSourceName: " + getDemandSourceName(jSONObject));
        initRewardedVideoInternal(str, jSONObject);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoWithCallback(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog.INTERNAL.verbose("demandSourceName: " + getDemandSourceName(jSONObject));
        initRewardedVideoInternal(str, jSONObject);
        rewardedVideoSmashListener.onRewardedVideoInitSuccess();
    }

    public void initSDK(String str, JSONObject jSONObject) {
        if (mDidInitSdk.compareAndSet(false, true)) {
            String c = IronSourceUtils.c();
            int optInt = jSONObject.optInt("debugMode", 0);
            if (isAdaptersDebugEnabled()) {
                optInt = 3;
            }
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("setting debug mode to " + optInt);
            SDKUtils.setDebugMode(optInt);
            String a = Jb.Y().h().a();
            if (TextUtils.isEmpty(a)) {
                a = jSONObject.optString("controllerUrl");
            }
            SDKUtils.setControllerUrl(a);
            ironLog.verbose("IronSourceNetwork setting controller url to " + a);
            JSONObject optJSONObject = jSONObject.optJSONObject("controllerConfig");
            String jSONObject2 = optJSONObject != null ? optJSONObject.toString() : "";
            SDKUtils.setControllerConfig(jSONObject2);
            ironLog.verbose("IronSourceNetwork setting controller config to " + jSONObject2);
            HashMap<String, String> initParams = getInitParams();
            mBaseAdPlayerExtraParams.a(initParams);
            String i = p.h().i();
            ironLog.verbose("with appKey=" + i + " userId=" + c + " parameters " + initParams);
            IronSourceNetwork.addInitListener(new Lc() { // from class: com.ironsource.adapters.ironsource.IronSourceAdapter.1
                @Override // com.ironsource.Lc
                public void onFail(C2596p8 c2596p8) {
                    IronLog.ADAPTER_API.verbose("OnNetworkSDKInitListener fail - code:" + c2596p8.a() + " message:" + c2596p8.b());
                    try {
                        IronSourceAdapter.this.initDuration = System.currentTimeMillis() - IronSourceAdapter.this.initDuration;
                        Jb.Y().q().a(new C2736x5(EnumC2754y5.IADS_INIT_FAIL, IronSourceNetworkBridge.jsonObjectInit().put("reason", c2596p8.b()).put("duration", IronSourceAdapter.this.initDuration)));
                    } catch (Exception e) {
                        IronLog.INTERNAL.error(e.getMessage());
                    }
                }

                @Override // com.ironsource.Lc
                public void onSuccess() {
                    IronLog.ADAPTER_API.verbose("OnNetworkSDKInitListener success");
                    try {
                        IronSourceAdapter.this.initDuration = System.currentTimeMillis() - IronSourceAdapter.this.initDuration;
                        Jb.Y().q().a(new C2736x5(EnumC2754y5.IADS_INIT_SUCCESS, IronSourceNetworkBridge.jsonObjectInit().put("duration", IronSourceAdapter.this.initDuration)));
                    } catch (Exception unused) {
                    }
                }
            });
            try {
                this.initDuration = System.currentTimeMillis();
                Jb.Y().q().a(new C2736x5(EnumC2754y5.IADS_INIT, IronSourceNetworkBridge.jsonObjectInit()));
            } catch (Exception unused) {
            }
            IronSourceNetwork.initSDK(ContextProvider.getInstance().getApplicationContext(), i, c, initParams);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public boolean isInterstitialReady(JSONObject jSONObject) {
        J9 j9 = this.mDemandSourceToISAd.get(getDemandSourceName(jSONObject));
        return j9 != null && IronSourceNetwork.isAdAvailableForInstance(j9);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public boolean isRewardedVideoAvailable(JSONObject jSONObject) {
        J9 j9 = this.mDemandSourceToRvAd.get(getDemandSourceName(jSONObject));
        return j9 != null && IronSourceNetwork.isAdAvailableForInstance(j9);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public boolean isUsingActivityBeforeImpression(LevelPlay.AdFormat adFormat) {
        return false;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, ISBannerSize iSBannerSize, BannerSmashListener bannerSmashListener) {
        if (iSBannerSize != null) {
            loadBannerInternal(ContextProvider.getInstance().getCurrentActiveActivity(), iSBannerSize, jSONObject, bannerSmashListener, str, new LoadAdData(jSONObject2));
        } else {
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("Banner Load Fail, " + getProviderName() + " - banner size is null"));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForDemandOnlyForBidding(JSONObject jSONObject, String str, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, BannerSmashListener bannerSmashListener) {
        if (iSDemandOnlyBannerLayout != null) {
            loadBannerInternal(iSDemandOnlyBannerLayout.getActivity(), iSDemandOnlyBannerLayout.getSize(), jSONObject, bannerSmashListener, str, new LoadAdData());
        } else {
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("Banner Load Fail, " + getProviderName() + " - banner is null"));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitial(JSONObject jSONObject, JSONObject jSONObject2, InterstitialSmashListener interstitialSmashListener) {
        InterstitialSmashListener interstitialSmashListener2;
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            interstitialSmashListener2 = interstitialSmashListener;
        } catch (Exception e) {
            e = e;
            interstitialSmashListener2 = interstitialSmashListener;
        }
        try {
            loadInterstitialAdInternal(demandSourceName, null, jSONObject, new LoadAdData(jSONObject2), interstitialSmashListener2);
        } catch (Exception e2) {
            e = e2;
            Exception exc = e;
            C2556n4.d().a(exc);
            IronLog.ADAPTER_API.error("exception " + exc.getMessage());
            interstitialSmashListener2.onInterstitialAdLoadFailed(new IronSourceError(1000, exc.getMessage()));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitialForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, InterstitialSmashListener interstitialSmashListener) {
        InterstitialSmashListener interstitialSmashListener2;
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            interstitialSmashListener2 = interstitialSmashListener;
        } catch (Exception e) {
            e = e;
            interstitialSmashListener2 = interstitialSmashListener;
        }
        try {
            loadInterstitialAdInternal(demandSourceName, str, jSONObject, new LoadAdData(jSONObject2), interstitialSmashListener2);
        } catch (Exception e2) {
            e = e2;
            Exception exc = e;
            C2556n4.d().a(exc);
            IronLog.ADAPTER_API.error("for bidding exception " + exc.getMessage());
            interstitialSmashListener2.onInterstitialAdLoadFailed(new IronSourceError(1000, exc.getMessage()));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideo(JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        RewardedVideoSmashListener rewardedVideoSmashListener2;
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            rewardedVideoSmashListener2 = rewardedVideoSmashListener;
        } catch (Exception e) {
            e = e;
            rewardedVideoSmashListener2 = rewardedVideoSmashListener;
        }
        try {
            loadRewardedVideoAdInternal(jSONObject, demandSourceName, null, new LoadAdData(jSONObject2), rewardedVideoSmashListener2);
        } catch (Exception e2) {
            e = e2;
            Exception exc = e;
            C2556n4.d().a(exc);
            IronLog.ADAPTER_API.error("exception " + exc.getMessage());
            rewardedVideoSmashListener2.onRewardedVideoAvailabilityChanged(false);
            rewardedVideoSmashListener2.onRewardedVideoLoadFailed(new IronSourceError(1002, exc.getMessage()));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideoForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, RewardedVideoSmashListener rewardedVideoSmashListener) {
        RewardedVideoSmashListener rewardedVideoSmashListener2;
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            rewardedVideoSmashListener2 = rewardedVideoSmashListener;
        } catch (Exception e) {
            e = e;
            rewardedVideoSmashListener2 = rewardedVideoSmashListener;
        }
        try {
            loadRewardedVideoAdInternal(jSONObject, demandSourceName, str, new LoadAdData(jSONObject2), rewardedVideoSmashListener2);
        } catch (Exception e2) {
            e = e2;
            Exception exc = e;
            C2556n4.d().a(exc);
            IronLog.ADAPTER_API.error("exception " + exc.getMessage());
            rewardedVideoSmashListener2.onRewardedVideoAvailabilityChanged(false);
            rewardedVideoSmashListener2.onRewardedVideoLoadFailed(new IronSourceError(1002, exc.getMessage()));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    protected void setConsent(boolean z) {
        IronLog.ADAPTER_API.verbose("(" + (z ? "true" : "false") + ")");
        IronSourceAds.setConsent(z);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    protected void setMetaData(String str, List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        mBaseAdPlayerExtraParams.b(str, list.get(0));
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void showInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            showAdInternal(this.mDemandSourceToISAd.get(demandSourceName), IronSource.a.INTERSTITIAL);
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.ADAPTER_API.error("exception " + e.getMessage());
            interstitialSmashListener.onInterstitialAdShowFailed(new IronSourceError(1001, e.getMessage()));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void showRewardedVideo(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        try {
            showAdInternal(this.mDemandSourceToRvAd.get(getDemandSourceName(jSONObject)), IronSource.a.REWARDED_VIDEO);
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.ADAPTER_API.error("exception " + e.getMessage());
            rewardedVideoSmashListener.onRewardedVideoAdShowFailed(new IronSourceError(1003, e.getMessage()));
        }
    }
}
