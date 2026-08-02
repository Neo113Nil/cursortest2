package com.ironsource.adapters.bigo;

import android.content.Context;
import com.ironsource.adapters.bigo.BigoAdapter;
import com.ironsource.adapters.bigo.BigoConstants;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.ConsentOptions;
import sg.bigo.ads.api.AdConfig;
import xsna.t11;
import xsna.yq;
import xsna.zcl;

/* compiled from: BigoAdapter.kt */
/* loaded from: classes13.dex */
public final class BigoAdapter extends LevelPlayBaseAdapter {
    private static final String GitHash = "9ae28c5";
    public static final Companion Companion = new Companion(null);
    private static final AtomicBoolean wasInitCalled = new AtomicBoolean(false);
    private static Companion.InitState initState = Companion.InitState.INIT_STATE_NONE;
    private static final CopyOnWriteArrayList<NetworkInitializationListener> initCallbackListeners = new CopyOnWriteArrayList<>();

    /* compiled from: BigoAdapter.kt */
    public static final class Companion {

        /* compiled from: BigoAdapter.kt */
        public enum InitState {
            INIT_STATE_NONE,
            INIT_STATE_IN_PROGRESS,
            INIT_STATE_SUCCESS
        }

        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final String getMediationInfo() {
            JSONObject d = yq.d(BigoConstants.MEDIATION_INFO_MEDIATION_NAME, BigoConstants.MEDIATION_NAME);
            d.put(BigoConstants.MEDIATION_INFO_MEDIATION_VERSION, LevelPlay.getSdkVersion());
            d.put("adapterVersion", "5.8.0");
            return d.toString();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInitializationSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(BigoConstants.Logs.SDK_INITIALIZED);
        initState = Companion.InitState.INIT_STATE_SUCCESS;
        Iterator<NetworkInitializationListener> it = initCallbackListeners.iterator();
        while (it.hasNext()) {
            it.next().onInitSuccess();
        }
        initCallbackListeners.clear();
    }

    private final void setCCPAValue(boolean z) {
        IronLog.ADAPTER_API.verbose(String.format("ccpa = %s", Arrays.copyOf(new Object[]{Boolean.valueOf(z)}, 1)));
        BigoAdSdk.setUserConsent(ContextProvider.getInstance().getApplicationContext(), ConsentOptions.CCPA, !z);
    }

    private final void setCOPPAValue(boolean z) {
        IronLog.ADAPTER_API.verbose(String.format("isCoppa = %s", Arrays.copyOf(new Object[]{Boolean.valueOf(z)}, 1)));
        BigoAdSdk.setUserConsent(ContextProvider.getInstance().getApplicationContext(), ConsentOptions.COPPA, !z);
    }

    public final void collectBiddingData$bigoadapter_release(BiddingDataCallback biddingDataCallback) {
        if (initState != Companion.InitState.INIT_STATE_SUCCESS) {
            IronLog.INTERNAL.error("returning null as token since init isn't completed");
            biddingDataCallback.onFailure("returning null as token since init isn't completed");
            return;
        }
        String bidderToken = BigoAdSdk.getBidderToken();
        IronLog.ADAPTER_API.verbose(String.format("token = %s", Arrays.copyOf(new Object[]{bidderToken}, 1)));
        HashMap hashMap = new HashMap();
        hashMap.put("token", bidderToken);
        biddingDataCallback.onSuccess(hashMap);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public String getAdapterVersion() {
        return "5.8.0";
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public String getNetworkSDKVersion() {
        return BigoAdSdk.getSDKVersionName();
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
        if ((initState == Companion.InitState.INIT_STATE_NONE || initState == Companion.InitState.INIT_STATE_IN_PROGRESS) && networkInitializationListener != null) {
            initCallbackListeners.add(networkInitializationListener);
        }
        if (wasInitCalled.compareAndSet(false, true)) {
            initState = Companion.InitState.INIT_STATE_IN_PROGRESS;
            IronLog.ADAPTER_API.verbose(String.format("appId = %s", Arrays.copyOf(new Object[]{string}, 1)));
            BigoAdSdk.initialize(context.getApplicationContext(), new AdConfig.Builder().setDebug(isAdaptersDebugEnabled()).setAppId(string).build(), new BigoAdSdk.InitListener() { // from class: xsna.h27
                @Override // sg.bigo.ads.BigoAdSdk.InitListener
                public final void onInitialized() {
                    BigoAdapter.this.onInitializationSuccess();
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
        IronLog.ADAPTER_API.verbose(String.format("consent = %s", Arrays.copyOf(new Object[]{Boolean.valueOf(z)}, 1)));
        BigoAdSdk.setUserConsent(ContextProvider.getInstance().getApplicationContext(), ConsentOptions.GDPR, z);
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
        if (MetaDataUtils.isValidCCPAMetaData(str, str2)) {
            setCCPAValue(MetaDataUtils.getMetaDataBooleanValue(str2));
        } else if (MetaDataUtils.isValidMetaData(str, BigoConstants.META_DATA_BIGO_COPPA_KEY, formatValueForType)) {
            setCOPPAValue(MetaDataUtils.getMetaDataBooleanValue(formatValueForType));
        }
    }
}
