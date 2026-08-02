package com.ironsource.adapters.vungle;

import android.content.Context;
import com.ironsource.adapters.vungle.VungleConstants;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import com.vungle.ads.BidTokenCallback;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.VungleAds;
import com.vungle.ads.VungleError;
import com.vungle.ads.VunglePrivacySettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.t11;
import xsna.v11;
import xsna.zcl;

/* compiled from: VungleAdapter.kt */
/* loaded from: classes13.dex */
public final class VungleAdapter extends LevelPlayBaseAdapter {
    private static final String GitHash = "a4ad187";
    public static final Companion Companion = new Companion(null);
    private static final AtomicBoolean wasInitCalled = new AtomicBoolean(false);
    private static Companion.InitState initState = Companion.InitState.INIT_STATE_NONE;
    private static final CopyOnWriteArrayList<NetworkInitializationListener> initCallbackListeners = new CopyOnWriteArrayList<>();

    /* compiled from: VungleAdapter.kt */
    public static final class Companion {

        /* compiled from: VungleAdapter.kt */
        public enum InitState {
            INIT_STATE_NONE,
            INIT_STATE_IN_PROGRESS,
            INIT_STATE_SUCCESS,
            INIT_STATE_FAILED
        }

        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final AdapterErrorType getLoadErrorType(VungleError vungleError) {
            return vungleError.getCode() == 10001 ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL;
        }

        private Companion() {
        }
    }

    public static final AdapterErrorType getLoadErrorType(VungleError vungleError) {
        return Companion.getLoadErrorType(vungleError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializationFailure(int i, String str) {
        v11.d(new Object[]{Integer.valueOf(i), str}, 2, VungleConstants.Logs.INIT_FAILED, IronLog.ADAPTER_CALLBACK);
        initState = Companion.InitState.INIT_STATE_FAILED;
        Iterator<NetworkInitializationListener> it = initCallbackListeners.iterator();
        while (it.hasNext()) {
            it.next().onInitFailed(i, str);
        }
        initCallbackListeners.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializationSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose("Succeeded to initialize SDK");
        initState = Companion.InitState.INIT_STATE_SUCCESS;
        Iterator<NetworkInitializationListener> it = initCallbackListeners.iterator();
        while (it.hasNext()) {
            it.next().onInitSuccess();
        }
        initCallbackListeners.clear();
    }

    private final void setCCPAValue(boolean z) {
        boolean z2 = !z;
        IronLog.ADAPTER_API.verbose(String.format("ccpa = %s", Arrays.copyOf(new Object[]{Boolean.valueOf(z2)}, 1)));
        VunglePrivacySettings.setCCPAStatus(z2);
    }

    private final void setCOPPAValue(boolean z) {
        IronLog.ADAPTER_API.verbose(String.format("coppa = %s", Arrays.copyOf(new Object[]{Boolean.valueOf(z)}, 1)));
        VunglePrivacySettings.setCOPPAStatus(z);
    }

    public final void collectBiddingData$vungleadapter_release(Context context, final BiddingDataCallback biddingDataCallback) {
        VungleAds.Companion.getBiddingToken(context.getApplicationContext(), new BidTokenCallback() { // from class: com.ironsource.adapters.vungle.VungleAdapter$collectBiddingData$1
            @Override // com.vungle.ads.BidTokenCallback
            public void onBidTokenCollected(String str) {
                HashMap hashMap = new HashMap();
                String networkSDKVersion = VungleAdapter.this.getNetworkSDKVersion();
                t11.c(new Object[]{networkSDKVersion, str}, 2, VungleConstants.Logs.TOKEN, IronLog.ADAPTER_API);
                hashMap.put("sdkVersion", networkSDKVersion);
                hashMap.put("token", str);
                biddingDataCallback.onSuccess(hashMap);
            }

            @Override // com.vungle.ads.BidTokenCallback
            public void onBidTokenError(String str) {
                biddingDataCallback.onFailure(String.format(VungleConstants.Logs.TOKEN_FAILURE, Arrays.copyOf(new Object[]{str}, 1)));
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public String getAdapterVersion() {
        return "5.10.0";
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public String getNetworkSDKVersion() {
        return VungleAds.Companion.getSdkVersion();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public void init(AdData adData, Context context, NetworkInitializationListener networkInitializationListener) {
        String string = adData.getString(VungleConstants.APP_ID_KEY);
        if (string == null || string.length() == 0) {
            String format = String.format("Missing params - %s", Arrays.copyOf(new Object[]{VungleConstants.APP_ID_KEY}, 1));
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
            IronLog.INTERNAL.error("SDK initialization failed");
            if (networkInitializationListener != null) {
                networkInitializationListener.onInitFailed(1000, "SDK initialization failed");
                return;
            }
            return;
        }
        if ((initState == Companion.InitState.INIT_STATE_NONE || initState == Companion.InitState.INIT_STATE_IN_PROGRESS) && networkInitializationListener != null) {
            initCallbackListeners.add(networkInitializationListener);
        }
        if (wasInitCalled.compareAndSet(false, true)) {
            initState = Companion.InitState.INIT_STATE_IN_PROGRESS;
            t11.c(new Object[]{string}, 1, "appId = %s", IronLog.ADAPTER_API);
            VungleAds.Companion companion = VungleAds.Companion;
            companion.setIntegrationName("ironsource", "5.10.0");
            companion.init(context.getApplicationContext(), string, new InitializationListener() { // from class: com.ironsource.adapters.vungle.VungleAdapter$init$2
                @Override // com.vungle.ads.InitializationListener
                public void onError(VungleError vungleError) {
                    VungleAdapter.this.initializationFailure(vungleError.getCode(), vungleError.getErrorMessage());
                }

                @Override // com.vungle.ads.InitializationListener
                public void onSuccess() {
                    VungleAdapter.this.initializationSuccess();
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
        t11.c(new Object[]{Boolean.valueOf(z)}, 1, VungleConstants.Logs.CONSENT, IronLog.ADAPTER_API);
        VunglePrivacySettings.setGDPRStatus(z, VungleConstants.META_DATA_VUNGLE_CONSENT_MESSAGE_VERSION);
    }

    @Override // com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface
    public void setMetaData(String str, List<String> list) {
        String str2;
        List<String> list2 = list;
        if (list2 == null || list2.isEmpty() || (str2 = list.get(0)) == null) {
            return;
        }
        t11.c(new Object[]{str == null ? "" : str, str2}, 2, "key = %s, value = %s", IronLog.ADAPTER_API);
        String formatValueForType = MetaDataUtils.formatValueForType(str2, MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN);
        if (MetaDataUtils.isValidCCPAMetaData(str, str2)) {
            setCCPAValue(MetaDataUtils.getMetaDataBooleanValue(str2));
        } else if (MetaDataUtils.isValidMetaData(str, VungleConstants.META_DATA_VUNGLE_COPPA_KEY, formatValueForType)) {
            setCOPPAValue(MetaDataUtils.getMetaDataBooleanValue(formatValueForType));
        }
    }
}
