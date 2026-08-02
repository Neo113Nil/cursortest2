package com.ironsource.adapters.yandex;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.adapters.yandex.YandexConstants;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.BidderTokenLoadListener;
import com.yandex.mobile.ads.common.BidderTokenLoader;
import com.yandex.mobile.ads.common.BidderTokenRequestConfiguration;
import com.yandex.mobile.ads.common.MobileAds;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import xsna.bj50;
import xsna.j5g;
import xsna.pn00;
import xsna.t11;
import xsna.zcl;

/* compiled from: YandexAdapter.kt */
/* loaded from: classes13.dex */
public final class YandexAdapter extends LevelPlayBaseAdapter {
    private static final String GitHash = "49721fb";
    public static final Companion Companion = new Companion(null);
    private static final AtomicBoolean wasInitCalled = new AtomicBoolean(false);
    private static Companion.InitState initState = Companion.InitState.INIT_STATE_NONE;
    private static final CopyOnWriteArrayList<NetworkInitializationListener> initCallbackListeners = new CopyOnWriteArrayList<>();

    /* compiled from: YandexAdapter.kt */
    public static final class Companion {

        /* compiled from: YandexAdapter.kt */
        public enum InitState {
            INIT_STATE_NONE,
            INIT_STATE_IN_PROGRESS,
            INIT_STATE_SUCCESS
        }

        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final String buildCreativeIdString$yandexadapter_release(List<String> list) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!TextUtils.isEmpty((String) obj)) {
                    arrayList.add(obj);
                }
            }
            return j5g.g0(arrayList, StringUtils.COMMA, null, null, 0, null, 62);
        }

        public final AdapterErrorType getLoadError(AdRequestError adRequestError) {
            return adRequestError.getCode() == 4 ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL;
        }

        private Companion() {
        }
    }

    public static final AdapterErrorType getLoadError(AdRequestError adRequestError) {
        return Companion.getLoadError(adRequestError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializationSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose();
        initState = Companion.InitState.INIT_STATE_SUCCESS;
        Iterator<NetworkInitializationListener> it = initCallbackListeners.iterator();
        while (it.hasNext()) {
            it.next().onInitSuccess();
        }
        initCallbackListeners.clear();
    }

    private final void setCOPPAValue(boolean z) {
        IronLog.ADAPTER_API.verbose(String.format("isCoppa = %s", Arrays.copyOf(new Object[]{Boolean.valueOf(z)}, 1)));
        MobileAds.setAgeRestrictedUser(z);
    }

    public final void collectBiddingData$yandexadapter_release(Context context, final BiddingDataCallback biddingDataCallback, BidderTokenRequestConfiguration bidderTokenRequestConfiguration) {
        if (initState == Companion.InitState.INIT_STATE_SUCCESS) {
            BidderTokenLoader.loadBidderToken(context.getApplicationContext(), bidderTokenRequestConfiguration, new BidderTokenLoadListener() { // from class: com.ironsource.adapters.yandex.YandexAdapter$collectBiddingData$1
                @Override // com.yandex.mobile.ads.common.BidderTokenLoadListener
                public void onBidderTokenFailedToLoad(String str) {
                    BiddingDataCallback.this.onFailure(String.format(YandexConstants.Logs.TOKEN_FAILURE, Arrays.copyOf(new Object[]{str}, 1)));
                }

                @Override // com.yandex.mobile.ads.common.BidderTokenLoadListener
                public void onBidderTokenLoaded(String str) {
                    HashMap hashMap = new HashMap();
                    t11.c(new Object[]{str}, 1, "token = %s", IronLog.ADAPTER_API);
                    hashMap.put("token", str);
                    BiddingDataCallback.this.onSuccess(hashMap);
                }
            });
        } else {
            IronLog.INTERNAL.verbose("returning null as token since init isn't completed");
            biddingDataCallback.onFailure("returning null as token since init isn't completed");
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public String getAdapterVersion() {
        return "5.8.0";
    }

    public final Map<String, String> getConfigParams$yandexadapter_release() {
        return pn00.k(new Pair(YandexConstants.ADAPTER_VERSION_KEY, "5.8.0"), new Pair(YandexConstants.ADAPTER_NETWORK_NAME_KEY, "ironsource"), new Pair(YandexConstants.ADAPTER_NETWORK_SDK_VERSION_KEY, LevelPlay.getSdkVersion()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public String getNetworkSDKVersion() {
        return MobileAds.getLibraryVersion();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public void init(AdData adData, Context context, NetworkInitializationListener networkInitializationListener) {
        if ((initState == Companion.InitState.INIT_STATE_NONE || initState == Companion.InitState.INIT_STATE_IN_PROGRESS) && networkInitializationListener != null) {
            initCallbackListeners.add(networkInitializationListener);
        }
        if (!wasInitCalled.compareAndSet(false, true)) {
            if (initState != Companion.InitState.INIT_STATE_SUCCESS || networkInitializationListener == null) {
                return;
            }
            networkInitializationListener.onInitSuccess();
            return;
        }
        initState = Companion.InitState.INIT_STATE_IN_PROGRESS;
        String string = adData.getString("appId");
        IronLog ironLog = IronLog.ADAPTER_API;
        if (string == null) {
            string = "";
        }
        ironLog.verbose(String.format("appId = %s", Arrays.copyOf(new Object[]{string}, 1)));
        MobileAds.enableLogging(isAdaptersDebugEnabled());
        MobileAds.initialize(context.getApplicationContext(), new bj50(this, 24));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.BaseAdapter, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface
    public boolean isUsingActivityBeforeImpression(LevelPlay.AdFormat adFormat) {
        return false;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.BaseAdapter, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface
    public void setConsent(boolean z) {
        IronLog.ADAPTER_API.verbose(String.format("consent = %s", Arrays.copyOf(new Object[]{Boolean.valueOf(z)}, 1)));
        MobileAds.setUserConsent(z);
    }

    @Override // com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface
    public void setMetaData(String str, List<String> list) {
        List<String> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        String str2 = list.get(0);
        t11.c(new Object[]{str == null ? "" : str, str2 != null ? str2 : ""}, 2, "key = %s, value = %s", IronLog.ADAPTER_API);
        String formatValueForType = MetaDataUtils.formatValueForType(str2, MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN);
        if (MetaDataUtils.isValidMetaData(str, YandexConstants.META_DATA_YANDEX_COPPA_KEY, formatValueForType)) {
            setCOPPAValue(MetaDataUtils.getMetaDataBooleanValue(formatValueForType));
        }
    }
}
