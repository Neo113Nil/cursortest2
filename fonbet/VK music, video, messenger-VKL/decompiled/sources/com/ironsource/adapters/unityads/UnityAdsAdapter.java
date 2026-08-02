package com.ironsource.adapters.unityads;

import android.content.Context;
import com.ironsource.adapters.unityads.UnityAdsAdapter;
import com.ironsource.adapters.unityads.UnityAdsConstants;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.unity3d.ads.AdFormat;
import com.unity3d.ads.BannerSize;
import com.unity3d.ads.InitializationConfiguration;
import com.unity3d.ads.InitializationListener;
import com.unity3d.ads.LogLevel;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsError;
import com.unity3d.ads.metadata.MetaData;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.asp;
import xsna.cxd0;
import xsna.drm0;
import xsna.s3q0;
import xsna.t11;
import xsna.v11;
import xsna.zcl;
import xsna.zrp;

/* compiled from: UnityAdsAdapter.kt */
/* loaded from: classes13.dex */
public final class UnityAdsAdapter extends LevelPlayBaseAdapter {
    private static final String GitHash = "40ae5a7";
    private final Object unityAdsStorageLock = new Object();
    public static final Companion Companion = new Companion(null);
    private static final MediationInfo mediationInfo = new MediationInfo(UnityAdsConstants.MEDIATION_NAME, LevelPlay.getSdkVersion(), "5.11.0");
    private static final AtomicBoolean wasInitCalled = new AtomicBoolean(false);
    private static Companion.InitState initState = Companion.InitState.INIT_STATE_NONE;
    private static final CopyOnWriteArrayList<NetworkInitializationListener> initCallbackListeners = new CopyOnWriteArrayList<>();

    /* compiled from: UnityAdsAdapter.kt */
    public static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: UnityAdsAdapter.kt */
        public static final class InitState {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ InitState[] $VALUES;
            public static final InitState INIT_STATE_NONE = new InitState("INIT_STATE_NONE", 0);
            public static final InitState INIT_STATE_IN_PROGRESS = new InitState("INIT_STATE_IN_PROGRESS", 1);
            public static final InitState INIT_STATE_SUCCESS = new InitState("INIT_STATE_SUCCESS", 2);
            public static final InitState INIT_STATE_FAILED = new InitState("INIT_STATE_FAILED", 3);

            private static final /* synthetic */ InitState[] $values() {
                return new InitState[]{INIT_STATE_NONE, INIT_STATE_IN_PROGRESS, INIT_STATE_SUCCESS, INIT_STATE_FAILED};
            }

            static {
                InitState[] $values = $values();
                $VALUES = $values;
                $ENTRIES = new asp($values);
            }

            private InitState(String str, int i) {
            }

            public static zrp<InitState> getEntries() {
                return $ENTRIES;
            }

            public static InitState valueOf(String str) {
                return (InitState) Enum.valueOf(InitState.class, str);
            }

            public static InitState[] values() {
                return (InitState[]) $VALUES.clone();
            }
        }

        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final AdapterErrorType getLoadErrorType(UnityAdsError unityAdsError) {
            return (unityAdsError == null || unityAdsError.getCode() != 52100) ? AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL : AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL;
        }

        public final MediationInfo getMediationInfo$unityadsadapter_release() {
            return UnityAdsAdapter.mediationInfo;
        }

        private Companion() {
        }
    }

    private final Map<String, String> buildInitExtras(AdData adData) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = adData.getString(UnityAdsConstants.UADS_INIT_BLOB);
        if (string != null && string.length() > 0) {
            linkedHashMap.put(UnityAdsConstants.UADS_INIT_BLOB, string);
        }
        Object obj = adData.getConfiguration().get("traits");
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                String str = key instanceof String ? (String) key : null;
                String str2 = value instanceof String ? (String) value : null;
                if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
                    linkedHashMap.put(str, str2);
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void collectBiddingData$lambda$10(BiddingDataCallback biddingDataCallback, String str) {
        if (str == null || str.length() == 0) {
            IronLog.ADAPTER_API.verbose(UnityAdsConstants.Logs.TOKEN_FAILURE);
            biddingDataCallback.onFailure(UnityAdsConstants.Logs.TOKEN_FAILURE);
        } else {
            IronLog.ADAPTER_API.verbose(String.format("token = %s", Arrays.copyOf(new Object[]{str}, 1)));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("token", str);
            biddingDataCallback.onSuccess(linkedHashMap);
        }
    }

    public static /* synthetic */ void collectBiddingData$unityadsadapter_release$default(UnityAdsAdapter unityAdsAdapter, AdData adData, BiddingDataCallback biddingDataCallback, AdFormat adFormat, BannerSize bannerSize, int i, Object obj) {
        if ((i & 8) != 0) {
            bannerSize = null;
        }
        unityAdsAdapter.collectBiddingData$unityadsadapter_release(adData, biddingDataCallback, adFormat, bannerSize);
    }

    public static final AdapterErrorType getLoadErrorType(UnityAdsError unityAdsError) {
        return Companion.getLoadErrorType(unityAdsError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$2(UnityAdsAdapter unityAdsAdapter, UnityAdsError unityAdsError) {
        if (unityAdsError == null) {
            unityAdsAdapter.initializationSuccess();
            return;
        }
        int code = unityAdsError.getCode();
        String message = unityAdsError.getMessage();
        if (message == null) {
            message = "";
        }
        unityAdsAdapter.initializationFailure(code, message);
    }

    private final void initializationFailure(int i, String str) {
        v11.d(new Object[]{Integer.valueOf(i), str}, 2, UnityAdsConstants.Logs.INIT_FAILED, IronLog.ADAPTER_CALLBACK);
        initState = Companion.InitState.INIT_STATE_FAILED;
        Iterator<NetworkInitializationListener> it = initCallbackListeners.iterator();
        while (it.hasNext()) {
            it.next().onInitFailed(i, str);
        }
        initCallbackListeners.clear();
    }

    private final void initializationSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose();
        initState = Companion.InitState.INIT_STATE_SUCCESS;
        Iterator<NetworkInitializationListener> it = initCallbackListeners.iterator();
        while (it.hasNext()) {
            it.next().onInitSuccess();
        }
        initCallbackListeners.clear();
    }

    private final void setCCPAValue(boolean z) {
        t11.c(new Object[]{Boolean.valueOf(z)}, 1, "ccpa = %s", IronLog.ADAPTER_API);
        setUnityAdsMetaData(UnityAdsConstants.CONSENT_CCPA, !z);
        UnityAds.setUserOptOut(Boolean.valueOf(z));
    }

    private final void setCOPPAValue(boolean z) {
        t11.c(new Object[]{Boolean.valueOf(z)}, 1, "coppa = %s", IronLog.ADAPTER_API);
        setUnityAdsMetaData(UnityAdsConstants.UNITYADS_COPPA, z);
        UnityAds.setNonBehavioral(Boolean.valueOf(z));
    }

    private final void setUnityAdsMetaData(String str, boolean z) {
        t11.c(new Object[]{str, Boolean.valueOf(z)}, 2, "key = %s, value = %s", IronLog.INTERNAL);
        synchronized (this.unityAdsStorageLock) {
            MetaData metaData = new MetaData(ContextProvider.getInstance().getApplicationContext());
            metaData.set(str, Boolean.valueOf(z));
            metaData.commit();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void collectBiddingData$unityadsadapter_release(AdData adData, BiddingDataCallback biddingDataCallback, AdFormat adFormat, BannerSize bannerSize) {
        Map<String, Object> adUnitData;
        String string;
        TokenConfiguration.Builder withMediationInfo = new TokenConfiguration.Builder(adFormat).withMediationInfo(mediationInfo);
        if (adData != null && (string = adData.getString(UnityAdsConstants.ZONE_ID_KEY)) != null && !drm0.N(string)) {
            withMediationInfo.withPlacementId(string);
        }
        Object obj = (adData == null || (adUnitData = adData.getAdUnitData()) == null) ? null : adUnitData.get("adUnitId");
        String str = obj instanceof String ? (String) obj : null;
        if (str != null && !drm0.N(str)) {
            withMediationInfo.withMediationAdUnitId(str);
        }
        if (bannerSize != null) {
            withMediationInfo.withBannerSize(bannerSize);
        }
        UnityAds.getToken(withMediationInfo.build(), new cxd0(biddingDataCallback, 10));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public String getAdapterVersion() {
        return "5.11.0";
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public String getNetworkSDKVersion() {
        return UnityAds.getVersion();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public void init(AdData adData, Context context, NetworkInitializationListener networkInitializationListener) {
        String string = adData.getString(UnityAdsConstants.SOURCE_ID_KEY);
        if (string == null || string.length() == 0) {
            String format = String.format("Missing params - %s", Arrays.copyOf(new Object[]{UnityAdsConstants.SOURCE_ID_KEY}, 1));
            IronLog.INTERNAL.error(format);
            if (networkInitializationListener != null) {
                networkInitializationListener.onInitFailed(1002, format);
                return;
            }
            return;
        }
        if (initState == Companion.InitState.INIT_STATE_SUCCESS) {
            if (networkInitializationListener != null) {
                networkInitializationListener.onInitSuccess();
                return;
            }
            return;
        }
        if (initState == Companion.InitState.INIT_STATE_FAILED) {
            IronLog.INTERNAL.error(UnityAdsConstants.Logs.SDK_INIT_FAILED);
            if (networkInitializationListener != null) {
                networkInitializationListener.onInitFailed(1000, UnityAdsConstants.Logs.SDK_INIT_FAILED);
                return;
            }
            return;
        }
        if ((initState == Companion.InitState.INIT_STATE_NONE || initState == Companion.InitState.INIT_STATE_IN_PROGRESS) && networkInitializationListener != null) {
            initCallbackListeners.add(networkInitializationListener);
        }
        if (wasInitCalled.compareAndSet(false, true)) {
            initState = Companion.InitState.INIT_STATE_IN_PROGRESS;
            IronLog.ADAPTER_API.verbose(String.format(UnityAdsConstants.Logs.SOURCE_ID, Arrays.copyOf(new Object[]{string}, 1)));
            InitializationConfiguration.Builder withMediationInfo = new InitializationConfiguration.Builder(string).withTestMode(false).withMediationInfo(mediationInfo);
            if (isAdaptersDebugEnabled()) {
                withMediationInfo.withLogLevel(LogLevel.DEBUG);
            }
            Map<String, String> buildInitExtras = buildInitExtras(adData);
            if (!buildInitExtras.isEmpty()) {
                withMediationInfo.withExtras(buildInitExtras);
            }
            UnityAds.initialize(withMediationInfo.build(), new InitializationListener() { // from class: xsna.a4q0
                @Override // com.unity3d.ads.InitializationListener
                public final void onInitializationComplete(UnityAdsError unityAdsError) {
                    UnityAdsAdapter.init$lambda$2(UnityAdsAdapter.this, unityAdsError);
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.BaseAdapter, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface
    public boolean isUsingActivityBeforeImpression(LevelPlay.AdFormat adFormat) {
        return false;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.BaseAdapter, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface
    public void setConsent(boolean z) {
        t11.c(new Object[]{Boolean.valueOf(z)}, 1, "consent = %s", IronLog.ADAPTER_API);
        setUnityAdsMetaData(UnityAdsConstants.CONSENT_GDPR, z);
        UnityAds.setUserConsent(Boolean.valueOf(z));
    }

    @Override // com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface
    public void setMetaData(String str, List<String> list) {
        String str2;
        List<String> list2 = list;
        if (list2 == null || list2.isEmpty() || (str2 = list.get(0)) == null) {
            return;
        }
        t11.c(new Object[]{str == null ? "" : str, str2}, 2, "key = %s, value = %s", IronLog.ADAPTER_API);
        if (MetaDataUtils.isValidCCPAMetaData(str, str2)) {
            setCCPAValue(MetaDataUtils.getMetaDataBooleanValue(str2));
            return;
        }
        String formatValueForType = MetaDataUtils.formatValueForType(str2, MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN);
        if (MetaDataUtils.isValidMetaData(str, UnityAdsConstants.UNITYADS_METADATA_COPPA_KEY, formatValueForType)) {
            setCOPPAValue(MetaDataUtils.getMetaDataBooleanValue(formatValueForType));
        }
    }
}
