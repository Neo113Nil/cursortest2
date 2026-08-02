package com.ironsource.adapters.fyber;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.fyber.inneractive.sdk.external.BidTokenProvider;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.ironsource.adapters.fyber.FyberAdapter;
import com.ironsource.adapters.fyber.FyberConstants;
import com.ironsource.mediationsdk.AdapterNetworkData;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import xsna.a1t;
import xsna.h7;
import xsna.pn00;
import xsna.t11;
import xsna.zcl;

/* compiled from: FyberAdapter.kt */
/* loaded from: classes13.dex */
public final class FyberAdapter extends LevelPlayBaseAdapter implements AdapterNetworkDataInterface {
    private static final String GitHash = "9b1b2b6";
    private static Boolean ccpa;
    private static Boolean consent;
    private static Boolean coppa;
    private static boolean isChild;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    public static final Companion Companion = new Companion(null);
    private static final AtomicBoolean wasInitCalled = new AtomicBoolean(false);
    private static Companion.InitState initState = Companion.InitState.INIT_STATE_NONE;
    private static final CopyOnWriteArrayList<NetworkInitializationListener> initCallbackListeners = new CopyOnWriteArrayList<>();

    /* compiled from: FyberAdapter.kt */
    public static final class Companion {

        /* compiled from: FyberAdapter.kt */
        public enum InitState {
            INIT_STATE_NONE,
            INIT_STATE_IN_PROGRESS,
            INIT_STATE_SUCCESS,
            INIT_STATE_FAILED
        }

        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final AdapterErrorType getLoadErrorType(InneractiveErrorCode inneractiveErrorCode) {
            return inneractiveErrorCode == InneractiveErrorCode.NO_FILL ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL;
        }

        private Companion() {
        }
    }

    public static final AdapterErrorType getLoadErrorType(InneractiveErrorCode inneractiveErrorCode) {
        return Companion.getLoadErrorType(inneractiveErrorCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$2(FyberAdapter fyberAdapter, Context context, String str) {
        fyberAdapter.setIsChildValue(isChild);
        InneractiveAdManager.initialize(context.getApplicationContext(), str, new h7(fyberAdapter, 22));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$2$lambda$1(FyberAdapter fyberAdapter, OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
        if (fyberInitStatus == OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
            fyberAdapter.initializationSuccess();
        } else {
            fyberAdapter.initializationFailure();
        }
    }

    private final void initializationFailure() {
        IronLog.ADAPTER_CALLBACK.error(FyberConstants.Logs.INIT_FAILED);
        initState = Companion.InitState.INIT_STATE_FAILED;
        Iterator<NetworkInitializationListener> it = initCallbackListeners.iterator();
        while (it.hasNext()) {
            it.next().onInitFailed(1000, FyberConstants.Logs.SDK_INIT_FAILED);
        }
        initCallbackListeners.clear();
    }

    private final void initializationSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose("Succeeded to initialize SDK");
        initState = Companion.InitState.INIT_STATE_SUCCESS;
        Boolean bool = consent;
        if (bool != null) {
            setConsent(bool.booleanValue());
        }
        Boolean bool2 = ccpa;
        if (bool2 != null) {
            setCCPAValue(bool2.booleanValue());
        }
        Boolean bool3 = coppa;
        if (bool3 != null) {
            setCOPPAValue(bool3.booleanValue());
        }
        Iterator<NetworkInitializationListener> it = initCallbackListeners.iterator();
        while (it.hasNext()) {
            it.next().onInitSuccess();
        }
        initCallbackListeners.clear();
    }

    private final void setCCPAValue(final boolean z) {
        this.mainHandler.post(new Runnable() { // from class: xsna.c1t
            @Override // java.lang.Runnable
            public final void run() {
                FyberAdapter.setCCPAValue$lambda$8(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCCPAValue$lambda$8(boolean z) {
        if (!wasInitCalled.get()) {
            ccpa = Boolean.valueOf(z);
            return;
        }
        String str = z ? FyberConstants.CCPA_OPT_IN_STRING : FyberConstants.CCPA_OPT_OUT_STRING;
        IronLog.ADAPTER_API.verbose(String.format("ccpa = %s", Arrays.copyOf(new Object[]{str}, 1)));
        InneractiveAdManager.setUSPrivacyString(str);
    }

    private final void setCOPPAValue(boolean z) {
        if (z) {
            if (initState != Companion.InitState.INIT_STATE_SUCCESS) {
                coppa = Boolean.valueOf(z);
            } else {
                IronLog.ADAPTER_API.verbose(FyberConstants.Logs.COPPA);
                InneractiveAdManager.currentAudienceAppliesToCoppa();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setConsent$lambda$6(boolean z) {
        if (!wasInitCalled.get()) {
            consent = Boolean.valueOf(z);
        } else {
            IronLog.ADAPTER_API.verbose(String.format("consent = %s", Arrays.copyOf(new Object[]{Boolean.valueOf(z)}, 1)));
            InneractiveAdManager.setGdprConsent(z);
        }
    }

    private final void setIsChildValue(boolean z) {
        if (initState == Companion.InitState.INIT_STATE_NONE) {
            isChild = z;
        } else if (initState == Companion.InitState.INIT_STATE_IN_PROGRESS && z) {
            IronLog.ADAPTER_API.verbose(FyberConstants.Logs.IS_CHILD);
            InneractiveAdManager.currentAudienceIsAChild();
        }
    }

    public final void collectBiddingData$fyberadapter_release(BiddingDataCallback biddingDataCallback) {
        if (initState != Companion.InitState.INIT_STATE_SUCCESS) {
            IronLog.INTERNAL.verbose(FyberConstants.Logs.TOKEN_NOT_READY);
            biddingDataCallback.onFailure(FyberConstants.Logs.TOKEN_NOT_READY);
            return;
        }
        String bidderToken = BidTokenProvider.getBidderToken();
        if (bidderToken == null) {
            bidderToken = "";
        }
        IronLog.ADAPTER_API.verbose(String.format("token = %s", Arrays.copyOf(new Object[]{bidderToken}, 1)));
        biddingDataCallback.onSuccess(pn00.m(new Pair("token", bidderToken)));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public String getAdapterVersion() {
        return "5.8.0";
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public String getNetworkSDKVersion() {
        return InneractiveAdManager.getVersion();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public void init(AdData adData, Context context, NetworkInitializationListener networkInitializationListener) {
        String string = adData.getString("appId");
        if (string == null || string.length() == 0) {
            String format = String.format("Missing params - %s", Arrays.copyOf(new Object[]{"appId"}, 1));
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
            IronLog.INTERNAL.error(FyberConstants.Logs.SDK_INIT_FAILED);
            if (networkInitializationListener != null) {
                networkInitializationListener.onInitFailed(1000, FyberConstants.Logs.SDK_INIT_FAILED);
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
            this.mainHandler.post(new a1t(this, context, string, 0));
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.BaseAdapter, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface
    public boolean isUsingActivityBeforeImpression(LevelPlay.AdFormat adFormat) {
        return false;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.BaseAdapter, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface
    public void setConsent(final boolean z) {
        this.mainHandler.post(new Runnable() { // from class: xsna.b1t
            @Override // java.lang.Runnable
            public final void run() {
                FyberAdapter.setConsent$lambda$6(z);
            }
        });
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
        if (MetaDataUtils.isValidMetaData(str, FyberConstants.META_DATA_DT_IS_CHILD_KEY, formatValueForType)) {
            setIsChildValue(MetaDataUtils.getMetaDataBooleanValue(formatValueForType));
        } else if (MetaDataUtils.isValidMetaData(str, FyberConstants.META_DATA_DT_COPPA_KEY, formatValueForType)) {
            setCOPPAValue(MetaDataUtils.getMetaDataBooleanValue(formatValueForType));
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.BaseAdapter, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface
    public void setNetworkData(AdapterNetworkData adapterNetworkData) {
        Boolean bool = (Boolean) adapterNetworkData.dataByKeyIgnoreCase(FyberConstants.NETWORK_DATA_IS_CHILD_KEY, Boolean.class);
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            t11.c(new Object[]{FyberConstants.NETWORK_DATA_IS_CHILD_KEY, bool}, 2, "key = %s, value = %s", IronLog.ADAPTER_API);
            setIsChildValue(booleanValue);
        }
    }
}
