package com.ironsource.adapters.mintegral;

import android.content.Context;
import com.ironsource.adapters.mintegral.MintegralConstants;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.mbbid.out.BidConstants;
import com.mbridge.msdk.mbbid.out.BidManager;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.out.SDKInitStatusListener;
import com.mbridge.msdk.system.MBridgeSDKImpl;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.t11;
import xsna.v11;
import xsna.zcl;

/* compiled from: MintegralAdapter.kt */
/* loaded from: classes13.dex */
public final class MintegralAdapter extends LevelPlayBaseAdapter implements SDKInitStatusListener {
    private static final String GitHash = "9994e2b";
    private static Boolean consentCollectingUserData;
    private static Boolean coppaUserData;
    private static Boolean doNotSellCollectingUserData;
    public static final Companion Companion = new Companion(null);
    private static final AtomicBoolean wasInitCalled = new AtomicBoolean(false);
    private static Companion.InitState initState = Companion.InitState.INIT_STATE_NONE;
    private static final CopyOnWriteArrayList<NetworkInitializationListener> initListeners = new CopyOnWriteArrayList<>();

    /* compiled from: MintegralAdapter.kt */
    public static final class Companion {

        /* compiled from: MintegralAdapter.kt */
        public enum InitState {
            INIT_STATE_NONE,
            INIT_STATE_IN_PROGRESS,
            INIT_STATE_SUCCESS,
            INIT_STATE_FAILED
        }

        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: MintegralAdapter.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Companion.InitState.values().length];
            try {
                iArr[Companion.InitState.INIT_STATE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Companion.InitState.INIT_STATE_IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Companion.InitState.INIT_STATE_SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void setCCPAValue(boolean z) {
        t11.c(new Object[]{Boolean.valueOf(z)}, 1, MintegralConstants.Logs.DO_NOT_TRACK_STATUS, IronLog.ADAPTER_API);
        int i = WhenMappings.$EnumSwitchMapping$0[initState.ordinal()];
        if (i == 1) {
            doNotSellCollectingUserData = Boolean.valueOf(z);
        } else {
            if (i != 2) {
                return;
            }
            MBridgeSDKFactory.getMBridgeSDK().setDoNotTrackStatus(ContextProvider.getInstance().getApplicationContext(), z);
        }
    }

    private final void setCOPPAValue(boolean z) {
        t11.c(new Object[]{Boolean.valueOf(z)}, 1, MintegralConstants.Logs.COPPA_VALUE, IronLog.ADAPTER_API);
        if (WhenMappings.$EnumSwitchMapping$0[initState.ordinal()] == 3) {
            MBridgeSDKFactory.getMBridgeSDK().setCoppaStatus(ContextProvider.getInstance().getApplicationContext(), z);
        } else {
            coppaUserData = Boolean.valueOf(z);
        }
    }

    private final void setChannelCode() {
        try {
            Method declaredMethod = Aa.class.getDeclaredMethod("b", String.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(Aa.class, MintegralConstants.CHANNEL_CODE_VALUE);
        } catch (Throwable th) {
            th.printStackTrace();
            v11.d(new Object[]{th}, 1, MintegralConstants.Logs.CHANNEL_CODE_ERROR, IronLog.INTERNAL);
        }
    }

    public final void collectBiddingData$mintegraladapter_release(Context context, String str, String str2, String str3, BiddingDataCallback biddingDataCallback) {
        if (initState != Companion.InitState.INIT_STATE_SUCCESS) {
            IronLog.INTERNAL.verbose("returning null as token since init isn't completed");
            biddingDataCallback.onFailure(MintegralConstants.Logs.INIT_NOT_COMPLETED_TOKEN);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str2 != null) {
            linkedHashMap.put(BidConstants.BID_FILTER_KEY_PLACEMENT_ID, str2);
        }
        if (str3 != null) {
            linkedHashMap.put(BidConstants.BID_FILTER_KEY_UNIT_ID, str3);
        }
        linkedHashMap.put(BidConstants.BID_FILTER_KEY_AD_TYPE, str);
        String buyerUid = BidManager.getBuyerUid(context.getApplicationContext(), linkedHashMap);
        if (buyerUid == null) {
            buyerUid = "";
        }
        IronLog.ADAPTER_API.verbose(String.format("token = %s", Arrays.copyOf(new Object[]{buyerUid}, 1)));
        HashMap hashMap = new HashMap();
        hashMap.put("token", buyerUid);
        biddingDataCallback.onSuccess(hashMap);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public String getAdapterVersion() {
        return "5.16.0";
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public String getNetworkSDKVersion() {
        return MBConfiguration.SDK_VERSION;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public void init(AdData adData, Context context, NetworkInitializationListener networkInitializationListener) {
        String string = adData.getString("appId");
        String string2 = adData.getString("appKey");
        String string3 = adData.getString("placementId");
        if (string == null || string.length() == 0) {
            String format = String.format(MintegralConstants.Logs.MISSING_PARAM, Arrays.copyOf(new Object[]{"appId"}, 1));
            IronLog.INTERNAL.error(format);
            if (networkInitializationListener != null) {
                networkInitializationListener.onInitFailed(1002, format);
                return;
            }
            return;
        }
        if (string2 == null || string2.length() == 0) {
            String format2 = String.format(MintegralConstants.Logs.MISSING_PARAM, Arrays.copyOf(new Object[]{"appKey"}, 1));
            IronLog.INTERNAL.error(format2);
            if (networkInitializationListener != null) {
                networkInitializationListener.onInitFailed(1002, format2);
                return;
            }
            return;
        }
        if (string3 == null || string3.length() == 0) {
            String format3 = String.format(MintegralConstants.Logs.MISSING_PARAM, Arrays.copyOf(new Object[]{"placementId"}, 1));
            IronLog.INTERNAL.error(format3);
            if (networkInitializationListener != null) {
                networkInitializationListener.onInitFailed(1002, format3);
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
            initListeners.add(networkInitializationListener);
        }
        if (wasInitCalled.compareAndSet(false, true)) {
            initState = Companion.InitState.INIT_STATE_IN_PROGRESS;
            IronLog.ADAPTER_API.verbose(String.format(MintegralConstants.Logs.APP_ID_AND_APP_KEY, Arrays.copyOf(new Object[]{string, string2}, 2)));
            if (isAdaptersDebugEnabled()) {
                MBridgeConstans.DEBUG = true;
            }
            MBridgeSDKImpl mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
            Map<String, String> mBConfigurationMap = mBridgeSDK.getMBConfigurationMap(string, string2);
            setChannelCode();
            Boolean bool = consentCollectingUserData;
            if (bool != null) {
                setConsent(bool.booleanValue());
            }
            Boolean bool2 = doNotSellCollectingUserData;
            if (bool2 != null) {
                setCCPAValue(bool2.booleanValue());
            }
            mBridgeSDK.init(mBConfigurationMap, context.getApplicationContext(), this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.BaseAdapter, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface
    public boolean isUsingActivityBeforeImpression(LevelPlay.AdFormat adFormat) {
        return false;
    }

    @Override // com.mbridge.msdk.out.SDKInitStatusListener
    public void onInitFail(String str) {
        v11.d(new Object[]{str}, 1, MintegralConstants.Logs.INIT_FAILED, IronLog.ADAPTER_CALLBACK);
        initState = Companion.InitState.INIT_STATE_FAILED;
        Iterator<NetworkInitializationListener> it = initListeners.iterator();
        while (it.hasNext()) {
            it.next().onInitFailed(1000, str);
        }
        initListeners.clear();
    }

    @Override // com.mbridge.msdk.out.SDKInitStatusListener
    public void onInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose();
        initState = Companion.InitState.INIT_STATE_SUCCESS;
        Boolean bool = coppaUserData;
        if (bool != null) {
            setCOPPAValue(bool.booleanValue());
        }
        Iterator<NetworkInitializationListener> it = initListeners.iterator();
        while (it.hasNext()) {
            it.next().onInitSuccess();
        }
        initListeners.clear();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.BaseAdapter, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface
    public void setConsent(boolean z) {
        IronLog ironLog = IronLog.ADAPTER_API;
        t11.c(new Object[]{Boolean.valueOf(z)}, 1, "consent = %s", ironLog);
        int i = WhenMappings.$EnumSwitchMapping$0[initState.ordinal()];
        if (i == 1) {
            consentCollectingUserData = Boolean.valueOf(z);
        } else {
            if (i != 2) {
                return;
            }
            MBridgeSDKImpl mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
            ironLog.verbose(String.format(MintegralConstants.Logs.CONSENT_STATUS, Arrays.copyOf(new Object[]{Integer.valueOf(z ? 1 : 0)}, 1)));
            mBridgeSDK.setConsentStatus(ContextProvider.getInstance().getApplicationContext(), z ? 1 : 0);
        }
    }

    @Override // com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface
    public void setMetaData(String str, List<String> list) {
        List<String> list2;
        String str2;
        if (str == null || str.length() == 0 || (list2 = list) == null || list2.isEmpty() || (str2 = list.get(0)) == null) {
            return;
        }
        t11.c(new Object[]{str, str2}, 2, "key = %s, value = %s", IronLog.ADAPTER_API);
        String formatValueForType = MetaDataUtils.formatValueForType(str2, MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN);
        if (MetaDataUtils.isValidCCPAMetaData(str, str2)) {
            setCCPAValue(MetaDataUtils.getMetaDataBooleanValue(str2));
        } else if (MetaDataUtils.isValidMetaData(str, MintegralConstants.META_DATA_MINTEGRAL_COPPA_KEY, formatValueForType)) {
            setCOPPAValue(MetaDataUtils.getMetaDataBooleanValue(formatValueForType));
        }
    }
}
