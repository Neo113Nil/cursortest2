package com.applovin.cordova;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.MaxSegment;
import com.applovin.mediation.MaxSegmentCollection;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.internal.special.SpecialsBridge;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class AppLovinMAX extends CordovaPlugin implements MaxAdListener, MaxAdViewAdListener, MaxRewardedAdListener {
    private static final String SDK_TAG = "AppLovinSdk";
    private static final String TAG = "AppLovinMAX";
    private boolean isPluginInitialized;
    private boolean isSdkInitialized;
    private AppLovinSdk sdk;
    private AppLovinSdkConfiguration sdkConfiguration;
    private List<String> testDeviceAdvertisingIdsToSet;
    private final MaxSegmentCollection.Builder segmentCollectionBuilder = MaxSegmentCollection.builder();
    private final Map<String, MaxInterstitialAd> mInterstitials = new HashMap(2);
    private final Map<String, MaxRewardedAd> mRewardedAds = new HashMap(2);
    private final Map<String, MaxAdView> mAdViews = new HashMap(2);
    private final Map<String, MaxAdFormat> mAdViewAdFormats = new HashMap(2);
    private final Map<String, String> mAdViewPositions = new HashMap(2);
    private final Map<String, MaxAdFormat> mVerticalAdViewFormats = new HashMap(2);
    private final List<String> mAdUnitIdsToShowAfterCreate = new ArrayList(2);

    private Activity getCurrentActivity() {
        return this.f3354cordova.getActivity();
    }

    @Override // org.apache.cordova.CordovaPlugin
    public void initialize(CordovaInterface cordovaInterface, CordovaWebView cordovaWebView) {
        super.initialize(cordovaInterface, cordovaWebView);
        this.sdk = AppLovinSdk.getInstance(cordovaInterface.getContext());
    }

    private void initialize(String str, String str2, List<String> list, final CallbackContext callbackContext) throws JSONException {
        final Context context = this.f3354cordova.getContext();
        if (getCurrentActivity() == null) {
            throw new IllegalStateException("No Activity found");
        }
        if (this.isPluginInitialized) {
            callbackContext.success(getInitializationMessage(context));
            return;
        }
        this.isPluginInitialized = true;
        d("Initializing AppLovin MAX Cordova v" + str + "...");
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalStateException("Unable to initialize AppLovin SDK - no SDK key provided!");
        }
        AppLovinSdkInitializationConfiguration.Builder builder = AppLovinSdkInitializationConfiguration.builder(str2, context);
        builder.setPluginVersion("Cordova-" + str);
        builder.setMediationProvider("max");
        builder.setSegmentCollection(this.segmentCollectionBuilder.build());
        if (list != null && !list.isEmpty()) {
            builder.setAdUnitIds(list);
        }
        List<String> list2 = this.testDeviceAdvertisingIdsToSet;
        if (list2 != null) {
            builder.setTestDeviceAdvertisingIds(list2);
            this.testDeviceAdvertisingIdsToSet = null;
        }
        this.sdk.initialize(builder.build(), new AppLovinSdk.SdkInitializationListener() { // from class: com.applovin.cordova.AppLovinMAX$$ExternalSyntheticLambda7
            @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
            public final void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
                AppLovinMAX.this.lambda$initialize$0(callbackContext, context, appLovinSdkConfiguration);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initialize$0(CallbackContext callbackContext, Context context, AppLovinSdkConfiguration appLovinSdkConfiguration) {
        d("SDK initialized");
        this.sdkConfiguration = appLovinSdkConfiguration;
        this.isSdkInitialized = true;
        try {
            callbackContext.success(getInitializationMessage(context));
        } catch (Throwable unused) {
        }
    }

    private JSONObject getInitializationMessage(Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        AppLovinSdkConfiguration appLovinSdkConfiguration = this.sdkConfiguration;
        if (appLovinSdkConfiguration != null) {
            jSONObject.put("countryCode", appLovinSdkConfiguration.getCountryCode());
        }
        jSONObject.put("hasUserConsent", AppLovinPrivacySettings.hasUserConsent(context));
        jSONObject.put("isDoNotSell", AppLovinPrivacySettings.isDoNotSell(context));
        jSONObject.put("isTablet", AppLovinSdkUtils.isTablet(context));
        return jSONObject;
    }

    private boolean isInitialized() {
        return this.isPluginInitialized && this.isSdkInitialized;
    }

    public void showMediationDebugger(CallbackContext callbackContext) {
        AppLovinSdk appLovinSdk = this.sdk;
        if (appLovinSdk == null) {
            Log.e("[AppLovinMAX]", "Failed to show mediation debugger - please ensure the AppLovin MAX Cordova Plugin has been initialized by calling 'AppLovinMAX.initialize(...);'!");
        } else {
            appLovinSdk.showMediationDebugger();
            callbackContext.success();
        }
    }

    public void setHasUserConsent(boolean z, CallbackContext callbackContext) {
        AppLovinPrivacySettings.setHasUserConsent(z, getCurrentActivity());
        callbackContext.success();
    }

    public void hasUserConsent(CallbackContext callbackContext) {
        callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, AppLovinPrivacySettings.hasUserConsent(getCurrentActivity())));
    }

    public void setDoNotSell(boolean z, CallbackContext callbackContext) {
        AppLovinPrivacySettings.setDoNotSell(z, getCurrentActivity());
        callbackContext.success();
    }

    public void isDoNotSell(CallbackContext callbackContext) {
        callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, AppLovinPrivacySettings.isDoNotSell(getCurrentActivity())));
    }

    public void setUserId(String str, CallbackContext callbackContext) {
        this.sdk.getSettings().setUserIdentifier(str);
        callbackContext.success();
    }

    public void setMuted(boolean z, CallbackContext callbackContext) {
        this.sdk.getSettings().setMuted(z);
        callbackContext.success();
    }

    public void setVerboseLogging(boolean z, CallbackContext callbackContext) {
        this.sdk.getSettings().setVerboseLogging(z);
        callbackContext.success();
    }

    public void setTestDeviceAdvertisingIds(List<String> list, CallbackContext callbackContext) {
        this.testDeviceAdvertisingIdsToSet = list;
        callbackContext.success();
    }

    public void setCreativeDebuggerEnabled(boolean z, CallbackContext callbackContext) {
        AppLovinSdk appLovinSdk = this.sdk;
        if (appLovinSdk != null) {
            appLovinSdk.getSettings().setCreativeDebuggerEnabled(z);
        }
        callbackContext.success();
    }

    public void addSegment(int i, List<Integer> list, CallbackContext callbackContext) {
        if (this.isPluginInitialized) {
            Log.e("[AppLovinMAX]", "Segment must be added before calling 'AppLovinMAX.initialize(...);'");
            callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.ERROR));
        } else {
            this.segmentCollectionBuilder.addSegment(new MaxSegment(i, list));
            callbackContext.success();
        }
    }

    public void trackEvent(String str, JSONObject jSONObject, CallbackContext callbackContext) throws JSONException {
        Map<String, ?> hashMap = new HashMap<>();
        if (jSONObject != null) {
            hashMap = AppLovinSdkUtils.toMap(jSONObject);
        }
        this.sdk.getEventService().trackEvent(str, hashMap);
        callbackContext.success();
    }

    public void createBanner(String str, String str2, CallbackContext callbackContext) {
        createAdView(str, getDeviceSpecificBannerAdViewAdFormat(), str2, callbackContext);
    }

    public void setBannerBackgroundColor(String str, String str2, CallbackContext callbackContext) {
        setAdViewBackgroundColor(str, getDeviceSpecificBannerAdViewAdFormat(), str2, callbackContext);
    }

    public void setBannerPlacement(String str, String str2, CallbackContext callbackContext) {
        setAdViewPlacement(str, getDeviceSpecificBannerAdViewAdFormat(), str2, callbackContext);
    }

    public void updateBannerPosition(String str, String str2, CallbackContext callbackContext) {
        updateAdViewPosition(str, str2, getDeviceSpecificBannerAdViewAdFormat(), callbackContext);
    }

    public void setBannerExtraParameter(String str, String str2, String str3, CallbackContext callbackContext) {
        setAdViewExtraParameters(str, getDeviceSpecificBannerAdViewAdFormat(), str2, str3, callbackContext);
    }

    public void showBanner(String str, CallbackContext callbackContext) {
        showAdView(str, getDeviceSpecificBannerAdViewAdFormat(), callbackContext);
    }

    public void hideBanner(String str, CallbackContext callbackContext) {
        hideAdView(str, getDeviceSpecificBannerAdViewAdFormat(), callbackContext);
    }

    public void destroyBanner(String str, CallbackContext callbackContext) {
        destroyAdView(str, getDeviceSpecificBannerAdViewAdFormat(), callbackContext);
    }

    public void createMRec(String str, String str2, CallbackContext callbackContext) {
        createAdView(str, MaxAdFormat.MREC, str2, callbackContext);
    }

    public void setMRecPlacement(String str, String str2, CallbackContext callbackContext) {
        setAdViewPlacement(str, MaxAdFormat.MREC, str2, callbackContext);
    }

    public void updateMRecPosition(String str, String str2, CallbackContext callbackContext) {
        updateAdViewPosition(str, str2, MaxAdFormat.MREC, callbackContext);
    }

    public void showMRec(String str, CallbackContext callbackContext) {
        showAdView(str, MaxAdFormat.MREC, callbackContext);
    }

    public void hideMRec(String str, CallbackContext callbackContext) {
        hideAdView(str, MaxAdFormat.MREC, callbackContext);
    }

    public void destroyMRec(String str, CallbackContext callbackContext) {
        destroyAdView(str, MaxAdFormat.MREC, callbackContext);
    }

    public void loadInterstitial(String str, CallbackContext callbackContext) {
        retrieveInterstitial(str).loadAd();
    }

    public void showInterstitial(String str, String str2, String str3, CallbackContext callbackContext) {
        MaxInterstitialAd retrieveInterstitial = retrieveInterstitial(str);
        if (str2 != null || str3 != null) {
            retrieveInterstitial.showAd(str2, str3);
        } else {
            retrieveInterstitial.showAd();
        }
    }

    public void setInterstitialExtraParameter(String str, String str2, String str3, CallbackContext callbackContext) {
        retrieveInterstitial(str).setExtraParameter(str2, str3);
    }

    public void loadRewardedAd(String str, CallbackContext callbackContext) {
        retrieveRewardedAd(str).loadAd();
    }

    public boolean isRewardedAdReady(String str, CallbackContext callbackContext) {
        return retrieveRewardedAd(str).isReady();
    }

    public void showRewardedAd(String str, String str2, String str3, CallbackContext callbackContext) {
        MaxRewardedAd retrieveRewardedAd = retrieveRewardedAd(str);
        if (str2 != null || str3 != null) {
            retrieveRewardedAd.showAd(str2, str3);
        } else {
            retrieveRewardedAd.showAd();
        }
    }

    public void setRewardedAdExtraParameter(String str, String str2, String str3, CallbackContext callbackContext) {
        retrieveRewardedAd(str).setExtraParameter(str2, str3);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (MaxAdFormat.BANNER == format || MaxAdFormat.LEADER == format || MaxAdFormat.MREC == format) {
            String str2 = MaxAdFormat.MREC == format ? "OnMRecAdLoadedEvent" : "OnBannerAdLoadedEvent";
            if (!TextUtils.isEmpty(this.mAdViewPositions.get(maxAd.getAdUnitId()))) {
                positionAdView(maxAd);
            }
            MaxAdView retrieveAdView = retrieveAdView(maxAd.getAdUnitId(), format);
            if (retrieveAdView != null && retrieveAdView.getVisibility() != 0) {
                retrieveAdView.stopAutoRefresh();
            }
            str = str2;
        } else if (MaxAdFormat.INTERSTITIAL == format) {
            str = "OnInterstitialLoadedEvent";
        } else if (MaxAdFormat.REWARDED == format) {
            str = "OnRewardedAdLoadedEvent";
        } else {
            logInvalidAdFormat(format);
            return;
        }
        fireWindowEvent(str, getAdInfo(maxAd));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            logStackTrace(new IllegalArgumentException("adUnitId cannot be null"));
            return;
        }
        if (this.mAdViews.containsKey(str)) {
            str2 = MaxAdFormat.MREC == this.mAdViewAdFormats.get(str) ? "OnMRecAdLoadFailedEvent" : "OnBannerAdLoadFailedEvent";
        } else if (this.mInterstitials.containsKey(str)) {
            str2 = "OnInterstitialLoadFailedEvent";
        } else if (this.mRewardedAds.containsKey(str)) {
            str2 = "OnRewardedAdLoadFailedEvent";
        } else {
            logStackTrace(new IllegalStateException("invalid adUnitId: " + str));
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adUnitId", str);
            jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.toString(maxError.getCode()));
            fireWindowEvent(str2, jSONObject);
        } catch (Throwable unused) {
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (MaxAdFormat.BANNER == format || MaxAdFormat.LEADER == format) {
            str = "OnBannerAdClickedEvent";
        } else if (MaxAdFormat.MREC == format) {
            str = "OnMRecAdClickedEvent";
        } else if (MaxAdFormat.INTERSTITIAL == format) {
            str = "OnInterstitialClickedEvent";
        } else if (MaxAdFormat.REWARDED == format) {
            str = "OnRewardedAdClickedEvent";
        } else {
            logInvalidAdFormat(format);
            return;
        }
        fireWindowEvent(str, getAdInfo(maxAd));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (format == MaxAdFormat.INTERSTITIAL || format == MaxAdFormat.REWARDED) {
            if (MaxAdFormat.INTERSTITIAL == format) {
                str = "OnInterstitialDisplayedEvent";
            } else {
                str = "OnRewardedAdDisplayedEvent";
            }
            fireWindowEvent(str, getAdInfo(maxAd));
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (format == MaxAdFormat.INTERSTITIAL || format == MaxAdFormat.REWARDED) {
            if (MaxAdFormat.INTERSTITIAL == format) {
                str = "OnInterstitialAdFailedToDisplayEvent";
            } else {
                str = "OnRewardedAdFailedToDisplayEvent";
            }
            try {
                JSONObject adInfo = getAdInfo(maxAd);
                adInfo.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.toString(maxError.getCode()));
                fireWindowEvent(str, adInfo);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (format == MaxAdFormat.INTERSTITIAL || format == MaxAdFormat.REWARDED) {
            if (MaxAdFormat.INTERSTITIAL == format) {
                str = "OnInterstitialHiddenEvent";
            } else {
                str = "OnRewardedAdHiddenEvent";
            }
            fireWindowEvent(str, getAdInfo(maxAd));
        }
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(MaxAd maxAd) {
        MaxAdFormat format = maxAd.getFormat();
        if (format != MaxAdFormat.BANNER && format != MaxAdFormat.LEADER && format != MaxAdFormat.MREC) {
            logInvalidAdFormat(format);
        } else {
            fireWindowEvent(MaxAdFormat.MREC == format ? "OnMRecAdExpandedEvent" : "OnBannerAdExpandedEvent", getAdInfo(maxAd));
        }
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(MaxAd maxAd) {
        MaxAdFormat format = maxAd.getFormat();
        if (format != MaxAdFormat.BANNER && format != MaxAdFormat.LEADER && format != MaxAdFormat.MREC) {
            logInvalidAdFormat(format);
        } else {
            fireWindowEvent(MaxAdFormat.MREC == format ? "OnMRecAdCollapsedEvent" : "OnBannerAdCollapsedEvent", getAdInfo(maxAd));
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        MaxAdFormat format = maxAd.getFormat();
        if (format != MaxAdFormat.REWARDED) {
            logInvalidAdFormat(format);
            return;
        }
        String label = maxReward != null ? maxReward.getLabel() : "";
        int amount = maxReward != null ? maxReward.getAmount() : 0;
        try {
            JSONObject adInfo = getAdInfo(maxAd);
            adInfo.put("rewardLabel", label);
            adInfo.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, amount);
            fireWindowEvent("OnRewardedAdReceivedRewardEvent", adInfo);
        } catch (Throwable unused) {
        }
    }

    private void createAdView(final String str, final MaxAdFormat maxAdFormat, final String str2, final CallbackContext callbackContext) {
        getCurrentActivity().runOnUiThread(new Runnable() { // from class: com.applovin.cordova.AppLovinMAX$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                AppLovinMAX.this.lambda$createAdView$1(maxAdFormat, str, str2, callbackContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createAdView$1(MaxAdFormat maxAdFormat, String str, String str2, CallbackContext callbackContext) {
        d("Creating " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\" and position: \"" + str2 + "\"");
        MaxAdView retrieveAdView = retrieveAdView(str, maxAdFormat, str2);
        if (retrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        retrieveAdView.setVisibility(8);
        if (retrieveAdView.getParent() == null) {
            Activity currentActivity = getCurrentActivity();
            RelativeLayout relativeLayout = new RelativeLayout(currentActivity);
            currentActivity.addContentView(relativeLayout, new LinearLayout.LayoutParams(-1, -1));
            relativeLayout.addView(retrieveAdView);
            this.mAdViewAdFormats.put(str, maxAdFormat);
            positionAdView(str, maxAdFormat);
        }
        retrieveAdView.loadAd();
        if (this.mAdUnitIdsToShowAfterCreate.contains(str)) {
            showAdView(str, maxAdFormat, null);
            this.mAdUnitIdsToShowAfterCreate.remove(str);
        }
        callbackContext.success();
    }

    private void setAdViewPlacement(final String str, final MaxAdFormat maxAdFormat, final String str2, final CallbackContext callbackContext) {
        getCurrentActivity().runOnUiThread(new Runnable() { // from class: com.applovin.cordova.AppLovinMAX$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                AppLovinMAX.this.lambda$setAdViewPlacement$2(str2, maxAdFormat, str, callbackContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAdViewPlacement$2(String str, MaxAdFormat maxAdFormat, String str2, CallbackContext callbackContext) {
        d("Setting placement \"" + str + "\" for " + maxAdFormat.getLabel() + " with ad unit id \"" + str2 + "\"");
        MaxAdView retrieveAdView = retrieveAdView(str2, maxAdFormat);
        if (retrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
        } else {
            retrieveAdView.setPlacement(str);
            callbackContext.success();
        }
    }

    private void updateAdViewPosition(final String str, final String str2, final MaxAdFormat maxAdFormat, final CallbackContext callbackContext) {
        getCurrentActivity().runOnUiThread(new Runnable() { // from class: com.applovin.cordova.AppLovinMAX$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AppLovinMAX.this.lambda$updateAdViewPosition$3(maxAdFormat, str2, str, callbackContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateAdViewPosition$3(MaxAdFormat maxAdFormat, String str, String str2, CallbackContext callbackContext) {
        d("Updating " + maxAdFormat.getLabel() + " position to \"" + str + "\" for ad unit id \"" + str2 + "\"");
        if (retrieveAdView(str2, maxAdFormat) == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        String str3 = this.mAdViewPositions.get(str2);
        if (str == null || str.equals(str3)) {
            return;
        }
        this.mAdViewPositions.put(str2, str);
        positionAdView(str2, maxAdFormat);
        callbackContext.success();
    }

    private void showAdView(final String str, final MaxAdFormat maxAdFormat, final CallbackContext callbackContext) {
        getCurrentActivity().runOnUiThread(new Runnable() { // from class: com.applovin.cordova.AppLovinMAX$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                AppLovinMAX.this.lambda$showAdView$4(maxAdFormat, str, callbackContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showAdView$4(MaxAdFormat maxAdFormat, String str, CallbackContext callbackContext) {
        d("Showing " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\"");
        MaxAdView retrieveAdView = retrieveAdView(str, maxAdFormat);
        if (retrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist for ad unit id " + str);
            this.mAdUnitIdsToShowAfterCreate.add(str);
            return;
        }
        retrieveAdView.setVisibility(0);
        retrieveAdView.startAutoRefresh();
        if (callbackContext != null) {
            callbackContext.success();
        }
    }

    private void hideAdView(final String str, final MaxAdFormat maxAdFormat, final CallbackContext callbackContext) {
        getCurrentActivity().runOnUiThread(new Runnable() { // from class: com.applovin.cordova.AppLovinMAX$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AppLovinMAX.this.lambda$hideAdView$5(maxAdFormat, str, callbackContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideAdView$5(MaxAdFormat maxAdFormat, String str, CallbackContext callbackContext) {
        d("Hiding " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\"");
        this.mAdUnitIdsToShowAfterCreate.remove(str);
        MaxAdView retrieveAdView = retrieveAdView(str, maxAdFormat);
        if (retrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        retrieveAdView.setVisibility(8);
        retrieveAdView.stopAutoRefresh();
        callbackContext.success();
    }

    private void destroyAdView(final String str, final MaxAdFormat maxAdFormat, final CallbackContext callbackContext) {
        getCurrentActivity().runOnUiThread(new Runnable() { // from class: com.applovin.cordova.AppLovinMAX$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                AppLovinMAX.this.lambda$destroyAdView$6(maxAdFormat, str, callbackContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$destroyAdView$6(MaxAdFormat maxAdFormat, String str, CallbackContext callbackContext) {
        d("Destroying " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\"");
        MaxAdView retrieveAdView = retrieveAdView(str, maxAdFormat);
        if (retrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        ViewParent parent = retrieveAdView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(retrieveAdView);
        }
        retrieveAdView.setListener(null);
        SpecialsBridge.maxAdViewDestroy(retrieveAdView);
        this.mAdViews.remove(str);
        this.mAdViewAdFormats.remove(str);
        this.mAdViewPositions.remove(str);
        this.mVerticalAdViewFormats.remove(str);
        callbackContext.success();
    }

    private void setAdViewBackgroundColor(final String str, final MaxAdFormat maxAdFormat, final String str2, final CallbackContext callbackContext) {
        getCurrentActivity().runOnUiThread(new Runnable() { // from class: com.applovin.cordova.AppLovinMAX$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                AppLovinMAX.this.lambda$setAdViewBackgroundColor$7(maxAdFormat, str, str2, callbackContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAdViewBackgroundColor$7(MaxAdFormat maxAdFormat, String str, String str2, CallbackContext callbackContext) {
        d("Setting " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\" to color: " + str2);
        MaxAdView retrieveAdView = retrieveAdView(str, maxAdFormat);
        if (retrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
        } else {
            retrieveAdView.setBackgroundColor(Color.parseColor(str2));
            callbackContext.success();
        }
    }

    private void setAdViewExtraParameters(final String str, final MaxAdFormat maxAdFormat, final String str2, final String str3, final CallbackContext callbackContext) {
        getCurrentActivity().runOnUiThread(new Runnable() { // from class: com.applovin.cordova.AppLovinMAX$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                AppLovinMAX.this.lambda$setAdViewExtraParameters$8(maxAdFormat, str2, str3, str, callbackContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAdViewExtraParameters$8(MaxAdFormat maxAdFormat, String str, String str2, String str3, CallbackContext callbackContext) {
        MaxAdFormat deviceSpecificBannerAdViewAdFormat;
        d("Setting " + maxAdFormat.getLabel() + " extra with key: \"" + str + "\" value: " + str2);
        MaxAdView retrieveAdView = retrieveAdView(str3, maxAdFormat);
        if (retrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        retrieveAdView.setExtraParameter(str, str2);
        if ("force_banner".equalsIgnoreCase(str) && MaxAdFormat.MREC != maxAdFormat) {
            if (Boolean.parseBoolean(str2)) {
                deviceSpecificBannerAdViewAdFormat = MaxAdFormat.BANNER;
            } else {
                deviceSpecificBannerAdViewAdFormat = getDeviceSpecificBannerAdViewAdFormat();
            }
            this.mAdViewAdFormats.put(str3, deviceSpecificBannerAdViewAdFormat);
            positionAdView(str3, deviceSpecificBannerAdViewAdFormat);
        }
        callbackContext.success();
    }

    private void logInvalidAdFormat(MaxAdFormat maxAdFormat) {
        logStackTrace(new IllegalStateException("invalid ad format: " + maxAdFormat));
    }

    private void logStackTrace(Exception exc) {
        e(Log.getStackTraceString(exc));
    }

    public static void d(String str) {
        Log.d(SDK_TAG, "[AppLovinMAX] " + str);
    }

    public static void e(String str) {
        Log.e(SDK_TAG, "[AppLovinMAX] " + str);
    }

    private MaxInterstitialAd retrieveInterstitial(String str) {
        MaxInterstitialAd maxInterstitialAd = this.mInterstitials.get(str);
        if (maxInterstitialAd != null) {
            return maxInterstitialAd;
        }
        MaxInterstitialAd maxInterstitialAd2 = new MaxInterstitialAd(str, this.sdk, getCurrentActivity());
        maxInterstitialAd2.setListener(this);
        this.mInterstitials.put(str, maxInterstitialAd2);
        return maxInterstitialAd2;
    }

    private MaxRewardedAd retrieveRewardedAd(String str) {
        MaxRewardedAd maxRewardedAd = this.mRewardedAds.get(str);
        if (maxRewardedAd != null) {
            return maxRewardedAd;
        }
        MaxRewardedAd maxRewardedAd2 = MaxRewardedAd.getInstance(str, this.sdk, getCurrentActivity());
        maxRewardedAd2.setListener(this);
        this.mRewardedAds.put(str, maxRewardedAd2);
        return maxRewardedAd2;
    }

    private MaxAdView retrieveAdView(String str, MaxAdFormat maxAdFormat) {
        return retrieveAdView(str, maxAdFormat, null);
    }

    public MaxAdView retrieveAdView(String str, MaxAdFormat maxAdFormat, String str2) {
        MaxAdView maxAdView = this.mAdViews.get(str);
        if (maxAdView != null || str2 == null) {
            return maxAdView;
        }
        MaxAdView maxAdView2 = new MaxAdView(str, maxAdFormat, this.sdk, getCurrentActivity());
        maxAdView2.setListener(this);
        this.mAdViews.put(str, maxAdView2);
        this.mAdViewPositions.put(str, str2);
        return maxAdView2;
    }

    private void positionAdView(MaxAd maxAd) {
        positionAdView(maxAd.getAdUnitId(), maxAd.getFormat());
    }

    private void positionAdView(String str, MaxAdFormat maxAdFormat) {
        int i;
        int i2;
        MaxAdView retrieveAdView = retrieveAdView(str, maxAdFormat);
        if (retrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        String str2 = this.mAdViewPositions.get(str);
        RelativeLayout relativeLayout = (RelativeLayout) retrieveAdView.getParent();
        if (relativeLayout == null) {
            e(maxAdFormat.getLabel() + "'s parent does not exist");
            return;
        }
        AdViewSize adViewSize = getAdViewSize(maxAdFormat);
        int dpToPx = AppLovinSdkUtils.dpToPx(getCurrentActivity(), adViewSize.widthDp);
        int dpToPx2 = AppLovinSdkUtils.dpToPx(getCurrentActivity(), adViewSize.heightDp);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) retrieveAdView.getLayoutParams();
        layoutParams.height = dpToPx2;
        retrieveAdView.setLayoutParams(layoutParams);
        retrieveAdView.setRotation(0.0f);
        retrieveAdView.setTranslationX(0.0f);
        layoutParams.setMargins(0, 0, 0, 0);
        this.mVerticalAdViewFormats.remove(str);
        if ("centered".equalsIgnoreCase(str2)) {
            i2 = 17;
        } else {
            if (str2.contains("top")) {
                i = 48;
            } else {
                i = str2.contains("bottom") ? 80 : 0;
            }
            if (str2.contains(TtmlNode.CENTER)) {
                int i3 = i | 1;
                if (MaxAdFormat.MREC != maxAdFormat) {
                    dpToPx = -1;
                }
                layoutParams.width = dpToPx;
                boolean contains = str2.contains("left");
                boolean contains2 = str2.contains(TtmlNode.RIGHT);
                if (contains || contains2) {
                    i |= 17;
                    if (MaxAdFormat.MREC == maxAdFormat) {
                        i |= str2.contains("left") ? 3 : 5;
                    } else {
                        Rect rect = new Rect();
                        relativeLayout.getWindowVisibleDisplayFrame(rect);
                        int width = rect.width();
                        int height = rect.height();
                        int i4 = -((Math.max(width, height) - Math.min(width, height)) / 2);
                        layoutParams.setMargins(i4, 0, i4, 0);
                        int i5 = (width / 2) - (dpToPx2 / 2);
                        if (contains) {
                            i5 = -i5;
                        }
                        retrieveAdView.setTranslationX(i5);
                        retrieveAdView.setRotation(270.0f);
                        this.mVerticalAdViewFormats.put(str, maxAdFormat);
                    }
                    relativeLayout.setBackgroundColor(0);
                    i2 = i;
                } else {
                    i2 = i3;
                }
            } else {
                layoutParams.width = dpToPx;
                if (str2.contains("left")) {
                    i2 = i | 3;
                } else {
                    if (str2.contains(TtmlNode.RIGHT)) {
                        i2 = i | 5;
                    }
                    i2 = i;
                }
            }
        }
        relativeLayout.setGravity(i2);
    }

    private MaxAdFormat getDeviceSpecificBannerAdViewAdFormat() {
        return getDeviceSpecificBannerAdViewAdFormat(getCurrentActivity());
    }

    public static MaxAdFormat getDeviceSpecificBannerAdViewAdFormat(Context context) {
        return AppLovinSdkUtils.isTablet(context) ? MaxAdFormat.LEADER : MaxAdFormat.BANNER;
    }

    protected static class AdViewSize {
        public final int heightDp;
        public final int widthDp;

        private AdViewSize(int i, int i2) {
            this.widthDp = i;
            this.heightDp = i2;
        }
    }

    public static AdViewSize getAdViewSize(MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.LEADER == maxAdFormat) {
            return new AdViewSize(728, 90);
        }
        if (MaxAdFormat.BANNER == maxAdFormat) {
            return new AdViewSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);
        }
        if (MaxAdFormat.MREC == maxAdFormat) {
            return new AdViewSize(300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
        }
        throw new IllegalArgumentException("Invalid ad format");
    }

    private JSONObject getAdInfo(MaxAd maxAd) {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("adUnitId", maxAd.getAdUnitId());
                jSONObject.put("creativeId", !TextUtils.isEmpty(maxAd.getCreativeId()) ? maxAd.getCreativeId() : "");
                jSONObject.put("networkName", maxAd.getNetworkName());
                jSONObject.put("placement", TextUtils.isEmpty(maxAd.getPlacement()) ? "" : maxAd.getPlacement());
                jSONObject.put("revenue", maxAd.getRevenue());
                return jSONObject;
            } catch (JSONException unused) {
                return jSONObject;
            }
        } catch (JSONException unused2) {
            return null;
        }
    }

    private void fireWindowEvent(final String str, final JSONObject jSONObject) {
        getCurrentActivity().runOnUiThread(new Runnable() { // from class: com.applovin.cordova.AppLovinMAX$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AppLovinMAX.this.lambda$fireWindowEvent$9(str, jSONObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fireWindowEvent$9(String str, JSONObject jSONObject) {
        this.webView.loadUrl("javascript:cordova.fireWindowEvent('" + str + "', " + jSONObject.toString() + ");");
    }

    @Override // org.apache.cordova.CordovaPlugin
    public boolean execute(String str, JSONArray jSONArray, CallbackContext callbackContext) throws JSONException {
        String str2 = null;
        r1 = null;
        ArrayList arrayList = null;
        r1 = null;
        String str3 = null;
        str2 = null;
        int i = 0;
        if (MobileAdsBridgeBase.initializeMethodName.equalsIgnoreCase(str)) {
            String string = jSONArray.getString(0);
            String string2 = jSONArray.getString(1);
            if (jSONArray.length() > 2 && !jSONArray.isNull(2)) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(2);
                arrayList = new ArrayList(jSONArray2.length());
                while (i < jSONArray2.length()) {
                    arrayList.add(jSONArray2.getString(i));
                    i++;
                }
            }
            initialize(string, string2, arrayList, callbackContext);
        } else if ("showMediationDebugger".equalsIgnoreCase(str)) {
            showMediationDebugger(callbackContext);
        } else if ("setHasUserConsent".equalsIgnoreCase(str)) {
            setHasUserConsent(jSONArray.getBoolean(0), callbackContext);
        } else if ("hasUserConsent".equalsIgnoreCase(str)) {
            hasUserConsent(callbackContext);
        } else if ("setDoNotSell".equalsIgnoreCase(str)) {
            setDoNotSell(jSONArray.getBoolean(0), callbackContext);
        } else if ("isDoNotSell".equalsIgnoreCase(str)) {
            isDoNotSell(callbackContext);
        } else if ("setUserId".equalsIgnoreCase(str)) {
            setUserId(jSONArray.getString(0), callbackContext);
        } else if ("setMuted".equalsIgnoreCase(str)) {
            setMuted(jSONArray.getBoolean(0), callbackContext);
        } else if ("setVerboseLogging".equalsIgnoreCase(str)) {
            setVerboseLogging(jSONArray.getBoolean(0), callbackContext);
        } else if ("setTestDeviceAdvertisingIds".equalsIgnoreCase(str)) {
            JSONArray jSONArray3 = jSONArray.getJSONArray(0);
            ArrayList arrayList2 = new ArrayList(jSONArray3.length());
            for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
                arrayList2.add(jSONArray3.getString(0));
            }
            setTestDeviceAdvertisingIds(arrayList2, callbackContext);
        } else if ("setCreativeDebuggerEnabled".equalsIgnoreCase(str)) {
            setCreativeDebuggerEnabled(jSONArray.getBoolean(0), callbackContext);
        } else if ("addSegment".equalsIgnoreCase(str)) {
            int i3 = jSONArray.getInt(0);
            JSONArray jSONArray4 = jSONArray.getJSONArray(1);
            ArrayList arrayList3 = new ArrayList(jSONArray4.length());
            while (i < jSONArray4.length()) {
                arrayList3.add(Integer.valueOf(jSONArray4.getInt(i)));
                i++;
            }
            addSegment(i3, arrayList3, callbackContext);
        } else if ("trackEvent".equalsIgnoreCase(str)) {
            trackEvent(jSONArray.getString(0), jSONArray.getJSONObject(1), callbackContext);
        } else if ("createBanner".equalsIgnoreCase(str)) {
            createBanner(jSONArray.getString(0), jSONArray.getString(1), callbackContext);
        } else if ("setBannerBackgroundColor".equalsIgnoreCase(str)) {
            setBannerBackgroundColor(jSONArray.getString(0), jSONArray.getString(1), callbackContext);
        } else if ("setBannerPlacement".equalsIgnoreCase(str)) {
            setBannerPlacement(jSONArray.getString(0), jSONArray.getString(1), callbackContext);
        } else if ("updateBannerPosition".equalsIgnoreCase(str)) {
            updateBannerPosition(jSONArray.getString(0), jSONArray.getString(1), callbackContext);
        } else if ("setBannerExtraParameter".equalsIgnoreCase(str)) {
            setBannerExtraParameter(jSONArray.getString(0), jSONArray.getString(1), jSONArray.getString(2), callbackContext);
        } else if ("showBanner".equalsIgnoreCase(str)) {
            showBanner(jSONArray.getString(0), callbackContext);
        } else if ("hideBanner".equalsIgnoreCase(str)) {
            hideBanner(jSONArray.getString(0), callbackContext);
        } else if (X3.h.S.equalsIgnoreCase(str)) {
            destroyBanner(jSONArray.getString(0), callbackContext);
        } else if ("createMRec".equalsIgnoreCase(str)) {
            createMRec(jSONArray.getString(0), jSONArray.getString(1), callbackContext);
        } else if ("setMRecPlacement".equalsIgnoreCase(str)) {
            setMRecPlacement(jSONArray.getString(0), jSONArray.getString(1), callbackContext);
        } else if ("updateMRecPosition".equalsIgnoreCase(str)) {
            updateMRecPosition(jSONArray.getString(0), jSONArray.getString(1), callbackContext);
        } else if ("showMRec".equalsIgnoreCase(str)) {
            showMRec(jSONArray.getString(0), callbackContext);
        } else if ("hideMRec".equalsIgnoreCase(str)) {
            hideMRec(jSONArray.getString(0), callbackContext);
        } else if ("destroyMRec".equalsIgnoreCase(str)) {
            destroyMRec(jSONArray.getString(0), callbackContext);
        } else if (X3.h.E.equalsIgnoreCase(str)) {
            loadInterstitial(jSONArray.getString(0), callbackContext);
        } else if (X3.h.H.equalsIgnoreCase(str)) {
            String string3 = jSONArray.getString(0);
            String optString = jSONArray.isNull(1) ? null : jSONArray.optString(1, null);
            if (jSONArray.length() > 2 && !jSONArray.isNull(2)) {
                str3 = jSONArray.getString(2);
            }
            showInterstitial(string3, optString, str3, callbackContext);
        } else if ("setInterstitialExtraParameter".equalsIgnoreCase(str)) {
            setInterstitialExtraParameter(jSONArray.getString(0), jSONArray.getString(1), jSONArray.getString(2), callbackContext);
        } else if ("loadRewardedAd".equalsIgnoreCase(str)) {
            loadRewardedAd(jSONArray.getString(0), callbackContext);
        } else if ("showRewardedAd".equalsIgnoreCase(str)) {
            String string4 = jSONArray.getString(0);
            String optString2 = jSONArray.isNull(1) ? null : jSONArray.optString(1, null);
            if (jSONArray.length() > 2 && !jSONArray.isNull(2)) {
                str2 = jSONArray.getString(2);
            }
            showRewardedAd(string4, optString2, str2, callbackContext);
        } else {
            if (!"setRewardedAdExtraParameter".equalsIgnoreCase(str)) {
                return false;
            }
            setRewardedAdExtraParameter(jSONArray.getString(0), jSONArray.getString(1), jSONArray.getString(2), callbackContext);
        }
        return true;
    }
}
