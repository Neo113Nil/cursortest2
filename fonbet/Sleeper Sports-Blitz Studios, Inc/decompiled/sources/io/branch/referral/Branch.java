package io.branch.referral;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.View;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import io.branch.indexing.BranchUniversalObject;
import io.branch.referral.BranchStrongMatchHelper;
import io.branch.referral.BranchViewHandler;
import io.branch.referral.DeferredAppLinkDataHandler;
import io.branch.referral.Defines;
import io.branch.referral.GooglePlayStoreAttribution;
import io.branch.referral.ServerRequest;
import io.branch.referral.ServerRequestGetCPID;
import io.branch.referral.ServerRequestGetLATD;
import io.branch.referral.SharingHelper;
import io.branch.referral.SystemObserver;
import io.branch.referral.network.BranchRemoteInterface;
import io.branch.referral.util.BRANCH_STANDARD_EVENT;
import io.branch.referral.util.BranchEvent;
import io.branch.referral.util.CommerceEvent;
import io.branch.referral.util.LinkProperties;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class Branch implements BranchViewHandler.IBranchViewEvents, SystemObserver.AdsParamsFetchEvents, GooglePlayStoreAttribution.IInstallReferrerEvents {
    public static final String ALWAYS_DEEPLINK = "$always_deeplink";
    private static final String AUTO_DEEP_LINKED = "io.branch.sdk.auto_linked";
    private static final String AUTO_DEEP_LINK_DISABLE = "io.branch.sdk.auto_link_disable";
    private static final String AUTO_DEEP_LINK_KEY = "io.branch.sdk.auto_link_keys";
    private static final String AUTO_DEEP_LINK_PATH = "io.branch.sdk.auto_link_path";
    private static final String AUTO_DEEP_LINK_REQ_CODE = "io.branch.sdk.auto_link_request_code";
    private static final String BRANCH_LIBRARY_VERSION = "io.branch.sdk.android:library:4.3.2";
    public static final String DEEPLINK_PATH = "$deeplink_path";
    private static final int DEF_AUTO_DEEP_LINK_REQ_CODE = 1501;
    public static final String FEATURE_TAG_DEAL = "deal";
    public static final String FEATURE_TAG_GIFT = "gift";
    public static final String FEATURE_TAG_INVITE = "invite";
    public static final String FEATURE_TAG_REFERRAL = "referral";
    public static final String FEATURE_TAG_SHARE = "share";
    private static final String GOOGLE_VERSION_TAG = "!SDK-VERSION-STRING!:io.branch.sdk.android:library:4.3.2";
    private static int LATCH_WAIT_UNTIL = 2500;
    public static final int LINK_TYPE_ONE_TIME_USE = 1;
    public static final int LINK_TYPE_UNLIMITED_USE = 0;
    public static final long NO_PLAY_STORE_REFERRER_WAIT = 0;
    public static final String OG_APP_ID = "$og_app_id";
    public static final String OG_DESC = "$og_description";
    public static final String OG_IMAGE_URL = "$og_image_url";
    public static final String OG_TITLE = "$og_title";
    public static final String OG_URL = "$og_url";
    public static final String OG_VIDEO = "$og_video";
    private static final int PREVENT_CLOSE_TIMEOUT = 500;
    public static final String REDEEM_CODE = "$redeem_code";
    public static final String REDIRECT_ANDROID_URL = "$android_url";
    public static final String REDIRECT_BLACKBERRY_URL = "$blackberry_url";
    public static final String REDIRECT_DESKTOP_URL = "$desktop_url";
    public static final String REDIRECT_FIRE_URL = "$fire_url";
    public static final String REDIRECT_IOS_URL = "$ios_url";
    public static final String REDIRECT_IPAD_URL = "$ipad_url";
    public static final String REDIRECT_WINDOWS_PHONE_URL = "$windows_phone_url";
    public static final String REFERRAL_BUCKET_DEFAULT = "default";
    public static final String REFERRAL_CODE = "referral_code";
    public static final int REFERRAL_CODE_AWARD_UNIQUE = 0;
    public static final int REFERRAL_CODE_AWARD_UNLIMITED = 1;
    public static final int REFERRAL_CODE_LOCATION_BOTH = 3;
    public static final int REFERRAL_CODE_LOCATION_REFERREE = 0;
    public static final int REFERRAL_CODE_LOCATION_REFERRING_USER = 2;
    public static final String REFERRAL_CODE_TYPE = "credit";
    public static final int REFERRAL_CREATION_SOURCE_SDK = 2;
    private static final int SESSION_KEEPALIVE = 2000;
    private static Branch branchReferral_ = null;
    private static boolean bypassCurrentActivityIntentState_ = false;
    static boolean checkInstallReferrer_ = true;
    private static String cookieBasedMatchDomain_ = "app.link";
    private static boolean disableDeviceIDFetch_ = false;
    private static boolean isActivityLifeCycleCallbackRegistered_ = false;
    private static boolean isAutoSessionMode_ = false;
    static boolean isForcedSession_ = false;
    private static boolean isSimulatingInstalls_ = false;
    private static long playStoreReferrerWaitTime = 1500;
    private BranchActivityLifecycleObserver activityLifeCycleObserver;
    private BranchRemoteInterface branchRemoteInterface_;
    private Context context_;
    WeakReference<Activity> currentActivityReference_;
    private JSONObject deeplinkDebugParams_;
    private final DeviceInfo deviceInfo_;
    private boolean hasNetwork_;
    private final ConcurrentHashMap<String, String> instrumentationExtraData_;
    private boolean isGAParamsFetchInProgress_;
    private Map<BranchLinkData, String> linkCache_;
    final Object lock;
    private int networkCount_;
    private PrefHelper prefHelper_;
    private final ServerRequestQueue requestQueue_;
    private Semaphore serverSema_;
    private ShareLinkManager shareLinkManager_;
    private final TrackingController trackingController;
    private static final String[] EXTERNAL_INTENT_EXTRA_KEY_WHITE_LIST = {"extra_launch_uri", "branch_intent"};
    private static boolean disableInstantDeepLinking = true;
    private boolean enableFacebookAppLinkCheck_ = false;
    private INTENT_STATE intentState_ = INTENT_STATE.PENDING;
    private SESSION_STATE initState_ = SESSION_STATE.UNINITIALISED;
    private CountDownLatch getFirstReferringParamsLatch = null;
    private CountDownLatch getLatestReferringParamsLatch = null;
    private boolean performCookieBasedStrongMatchingOnGAIDAvailable = false;
    private boolean isInstantDeepLinkPossible = false;

    public interface BranchLinkCreateListener {
        void onLinkCreate(String str, BranchError branchError);
    }

    public interface BranchLinkShareListener {
        void onChannelSelected(String str);

        void onLinkShareResponse(String str, String str2, BranchError branchError);

        void onShareLinkDialogDismissed();

        void onShareLinkDialogLaunched();
    }

    public interface BranchListResponseListener {
        void onReceivingResponse(JSONArray jSONArray, BranchError branchError);
    }

    public interface BranchReferralInitListener {
        void onInitFinished(JSONObject jSONObject, BranchError branchError);
    }

    public interface BranchReferralStateChangedListener {
        void onStateChanged(boolean z, BranchError branchError);
    }

    public interface BranchUniversalReferralInitListener {
        void onInitFinished(BranchUniversalObject branchUniversalObject, LinkProperties linkProperties, BranchError branchError);
    }

    public enum CreditHistoryOrder {
        kMostRecentFirst,
        kLeastRecentFirst
    }

    public interface ExtendedBranchLinkShareListener extends BranchLinkShareListener {
        boolean onChannelSelected(String str, BranchUniversalObject branchUniversalObject, LinkProperties linkProperties);
    }

    public interface IBranchViewControl {
        boolean skipBranchViewsOnThisActivity();
    }

    public interface IChannelProperties {
        String getSharingMessageForChannel(String str);

        String getSharingTitleForChannel(String str);
    }

    enum INTENT_STATE {
        PENDING,
        READY
    }

    public interface LogoutStatusListener {
        void onLogoutFinished(boolean z, BranchError branchError);
    }

    enum SESSION_STATE {
        INITIALISED,
        INITIALISING,
        UNINITIALISED
    }

    public void disableAppList() {
    }

    @Override // io.branch.referral.BranchViewHandler.IBranchViewEvents
    public void onBranchViewVisible(String str, String str2) {
    }

    private Branch(Context context) {
        this.isGAParamsFetchInProgress_ = false;
        this.prefHelper_ = PrefHelper.getInstance(context);
        TrackingController trackingController = new TrackingController(context);
        this.trackingController = trackingController;
        this.branchRemoteInterface_ = BranchRemoteInterface.getDefaultBranchRemoteInterface(context);
        DeviceInfo initialize = DeviceInfo.initialize(context);
        this.deviceInfo_ = initialize;
        this.requestQueue_ = ServerRequestQueue.getInstance(context);
        this.serverSema_ = new Semaphore(1);
        this.lock = new Object();
        this.networkCount_ = 0;
        this.hasNetwork_ = true;
        this.linkCache_ = new HashMap();
        this.instrumentationExtraData_ = new ConcurrentHashMap<>();
        if (trackingController.isTrackingDisabled()) {
            return;
        }
        this.isGAParamsFetchInProgress_ = initialize.getSystemObserver().prefetchAdsParams(context, this);
    }

    public Context getApplicationContext() {
        return this.context_;
    }

    public void setBranchRemoteInterface(BranchRemoteInterface branchRemoteInterface) {
        this.branchRemoteInterface_ = branchRemoteInterface;
    }

    public static void enableTestMode() {
        BranchUtil.setTestMode(true);
        enableDebugMode();
    }

    public static void disableTestMode() {
        BranchUtil.setTestMode(false);
        disableDebugMode();
    }

    public void setDebug() {
        enableDebugMode();
    }

    public static void enableDebugMode() {
        BranchUtil.setDebugMode(true);
        PrefHelper.LogAlways(GOOGLE_VERSION_TAG);
    }

    public static void disableDebugMode() {
        BranchUtil.setDebugMode(false);
    }

    public static void setAPIUrl(String str) {
        PrefHelper.setAPIUrl(str);
    }

    public static void setCDNBaseUrl(String str) {
        PrefHelper.setCDNBaseUrl(str);
    }

    public void disableTracking(boolean z) {
        this.trackingController.disableTracking(this.context_, z);
    }

    public boolean isTrackingDisabled() {
        return this.trackingController.isTrackingDisabled();
    }

    public static void enablePlayStoreReferrer(long j) {
        setPlayStoreReferrerCheckTimeout(j);
    }

    public static void setPlayStoreReferrerCheckTimeout(long j) {
        checkInstallReferrer_ = j > 0;
        playStoreReferrerWaitTime = j;
    }

    public static void disableInstantDeepLinking(boolean z) {
        disableInstantDeepLinking = z;
    }

    public static Branch getInstance() {
        if (branchReferral_ == null) {
            PrefHelper.Debug("Branch instance is not created yet. Make sure you have initialised Branch. [Consider Calling getInstance(Context ctx) if you still have issue.]");
        } else if (isAutoSessionMode_ && !isActivityLifeCycleCallbackRegistered_) {
            PrefHelper.Debug("Branch instance is not properly initialised. Make sure your Application class is extending BranchApp class. If you are not extending BranchApp class make sure you are initialising Branch in your Applications onCreate()");
        }
        return branchReferral_;
    }

    public static Branch getInstance(Context context, String str) {
        if (branchReferral_ == null) {
            branchReferral_ = initInstance(context);
        }
        branchReferral_.context_ = context.getApplicationContext();
        if (branchReferral_.prefHelper_.isValidBranchKey(str)) {
            if (branchReferral_.prefHelper_.setBranchKey(str)) {
                branchReferral_.linkCache_.clear();
                branchReferral_.requestQueue_.clear();
            }
        } else {
            PrefHelper.Debug("Branch Key is invalid. Please check your BranchKey");
        }
        return branchReferral_;
    }

    private static Branch getBranchInstance(Context context, boolean z, String str) {
        boolean branchKey;
        if (branchReferral_ == null) {
            branchReferral_ = initInstance(context);
            boolean checkTestMode = BranchUtil.checkTestMode(context);
            if (z) {
                checkTestMode = false;
            }
            BranchUtil.setTestMode(checkTestMode);
            if (TextUtils.isEmpty(str)) {
                str = BranchUtil.readBranchKey(context);
            }
            if (TextUtils.isEmpty(str)) {
                PrefHelper.Debug("Warning: Please enter your branch_key in your project's Manifest file!");
                branchKey = branchReferral_.prefHelper_.setBranchKey(PrefHelper.NO_STRING_VALUE);
            } else {
                branchKey = branchReferral_.prefHelper_.setBranchKey(str);
            }
            if (branchKey) {
                branchReferral_.linkCache_.clear();
                branchReferral_.requestQueue_.clear();
            }
            branchReferral_.context_ = context.getApplicationContext();
            if (context instanceof Application) {
                isAutoSessionMode_ = true;
                branchReferral_.setActivityLifeCycleObserver((Application) context);
            }
        }
        return branchReferral_;
    }

    public static Branch getInstance(Context context) {
        return getBranchInstance(context, true, null);
    }

    public static Branch getTestInstance(Context context) {
        return getBranchInstance(context, false, null);
    }

    public static Branch getAutoInstance(Context context) {
        isAutoSessionMode_ = true;
        getBranchInstance(context, true ^ BranchUtil.checkTestMode(context), null);
        BranchPreinstall.getPreinstallSystemData(branchReferral_, context);
        return branchReferral_;
    }

    public static Branch getAutoInstance(Context context, boolean z) {
        isAutoSessionMode_ = true;
        getBranchInstance(context, true ^ BranchUtil.checkTestMode(context), null);
        BranchPreinstall.getPreinstallSystemData(branchReferral_, context);
        branchReferral_.setIsReferrable(z);
        return branchReferral_;
    }

    public static Branch getAutoInstance(Context context, String str) {
        isAutoSessionMode_ = true;
        getBranchInstance(context, true ^ BranchUtil.checkTestMode(context), str);
        if (branchReferral_.prefHelper_.isValidBranchKey(str)) {
            if (branchReferral_.prefHelper_.setBranchKey(str)) {
                branchReferral_.linkCache_.clear();
                branchReferral_.requestQueue_.clear();
            }
        } else {
            PrefHelper.Debug("Branch Key is invalid. Please check your BranchKey");
        }
        BranchPreinstall.getPreinstallSystemData(branchReferral_, context);
        return branchReferral_;
    }

    public static Branch getAutoTestInstance(Context context) {
        isAutoSessionMode_ = true;
        getBranchInstance(context, false, null);
        BranchPreinstall.getPreinstallSystemData(branchReferral_, context);
        return branchReferral_;
    }

    public static Branch getAutoTestInstance(Context context, boolean z) {
        isAutoSessionMode_ = true;
        getBranchInstance(context, false, null);
        BranchPreinstall.getPreinstallSystemData(branchReferral_, context);
        branchReferral_.setIsReferrable(z);
        return branchReferral_;
    }

    private static Branch initInstance(Context context) {
        return new Branch(context.getApplicationContext());
    }

    static void shutDown() {
        ServerRequestQueue.shutDown();
        PrefHelper.shutDown();
        BranchUtil.shutDown();
        DeviceInfo.shutDown();
        Branch branch = branchReferral_;
        if (branch != null) {
            branch.context_ = null;
            branch.currentActivityReference_ = null;
        }
        branchReferral_ = null;
        bypassCurrentActivityIntentState_ = false;
        disableInstantDeepLinking = false;
        isActivityLifeCycleCallbackRegistered_ = false;
        isAutoSessionMode_ = false;
        isForcedSession_ = false;
        isSimulatingInstalls_ = false;
        checkInstallReferrer_ = true;
    }

    public void resetUserSession() {
        setInitState(SESSION_STATE.UNINITIALISED);
    }

    public void setRetryCount(int i) {
        PrefHelper prefHelper = this.prefHelper_;
        if (prefHelper == null || i < 0) {
            return;
        }
        prefHelper.setRetryCount(i);
    }

    public void setRetryInterval(int i) {
        PrefHelper prefHelper = this.prefHelper_;
        if (prefHelper == null || i <= 0) {
            return;
        }
        prefHelper.setRetryInterval(i);
    }

    public void setNetworkTimeout(int i) {
        PrefHelper prefHelper = this.prefHelper_;
        if (prefHelper == null || i <= 0) {
            return;
        }
        prefHelper.setTimeout(i);
    }

    public static void disableDeviceIDFetch(Boolean bool) {
        disableDeviceIDFetch_ = bool.booleanValue();
    }

    public static boolean isDeviceIDFetchDisabled() {
        return disableDeviceIDFetch_;
    }

    public void setDeepLinkDebugMode(JSONObject jSONObject) {
        this.deeplinkDebugParams_ = jSONObject;
    }

    public void enableFacebookAppLinkCheck() {
        this.enableFacebookAppLinkCheck_ = true;
    }

    public void setLimitFacebookTracking(boolean z) {
        this.prefHelper_.setLimitFacebookTracking(z);
    }

    public void setRequestMetadata(String str, String str2) {
        this.prefHelper_.setRequestMetadata(str, str2);
    }

    public Branch addInstallMetadata(String str, String str2) {
        this.prefHelper_.addInstallMetadata(str, str2);
        return this;
    }

    public Branch setPreinstallCampaign(String str) {
        addInstallMetadata(Defines.PreinstallKey.campaign.getKey(), str);
        return this;
    }

    public Branch setPreinstallPartner(String str) {
        addInstallMetadata(Defines.PreinstallKey.partner.getKey(), str);
        return this;
    }

    public void addModule(JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.isEmpty(next)) {
                    try {
                        this.prefHelper_.addSecondaryRequestMetadata(next, jSONObject.getString(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
    }

    public boolean initSession(BranchUniversalReferralInitListener branchUniversalReferralInitListener) {
        initUserSessionInternal(branchUniversalReferralInitListener, (Activity) null);
        return true;
    }

    public boolean initSession(BranchReferralInitListener branchReferralInitListener) {
        initUserSessionInternal(branchReferralInitListener, (Activity) null);
        return true;
    }

    public boolean initSession(BranchUniversalReferralInitListener branchUniversalReferralInitListener, Activity activity) {
        initUserSessionInternal(branchUniversalReferralInitListener, activity);
        return true;
    }

    public boolean initSession(BranchReferralInitListener branchReferralInitListener, Activity activity) {
        initUserSessionInternal(branchReferralInitListener, activity);
        return true;
    }

    public boolean initSession(BranchUniversalReferralInitListener branchUniversalReferralInitListener, Uri uri) {
        readAndStripParam(uri, null);
        initUserSessionInternal(branchUniversalReferralInitListener, (Activity) null);
        return true;
    }

    public boolean initSession(BranchReferralInitListener branchReferralInitListener, Uri uri) {
        readAndStripParam(uri, null);
        initUserSessionInternal(branchReferralInitListener, (Activity) null);
        return true;
    }

    public boolean initSession(BranchUniversalReferralInitListener branchUniversalReferralInitListener, Uri uri, Activity activity) {
        readAndStripParam(uri, activity);
        initUserSessionInternal(branchUniversalReferralInitListener, activity);
        return true;
    }

    public boolean initSession(BranchReferralInitListener branchReferralInitListener, Uri uri, Activity activity) {
        readAndStripParam(uri, activity);
        initUserSessionInternal(branchReferralInitListener, activity);
        return true;
    }

    public boolean initSession() {
        initUserSessionInternal((BranchReferralInitListener) null, (Activity) null);
        return true;
    }

    public boolean initSession(Activity activity) {
        initUserSessionInternal((BranchReferralInitListener) null, activity);
        return true;
    }

    public boolean initSessionForced(BranchReferralInitListener branchReferralInitListener) {
        enableForcedSession();
        initUserSessionInternal(branchReferralInitListener, (Activity) null);
        return true;
    }

    public boolean initSessionWithData(Uri uri) {
        return initSessionWithData(uri, null);
    }

    public boolean initSessionWithData(Uri uri, Activity activity) {
        readAndStripParam(uri, activity);
        initUserSessionInternal((BranchReferralInitListener) null, activity);
        return true;
    }

    public boolean initSession(boolean z) {
        setIsReferrable(z);
        initUserSessionInternal((BranchReferralInitListener) null, (Activity) null);
        return true;
    }

    public boolean initSession(boolean z, Activity activity) {
        setIsReferrable(z);
        initUserSessionInternal((BranchReferralInitListener) null, activity);
        return true;
    }

    public boolean initSession(BranchUniversalReferralInitListener branchUniversalReferralInitListener, boolean z, Uri uri) {
        setIsReferrable(z);
        readAndStripParam(uri, null);
        initUserSessionInternal(branchUniversalReferralInitListener, (Activity) null);
        return true;
    }

    public boolean initSession(BranchReferralInitListener branchReferralInitListener, boolean z, Uri uri) {
        setIsReferrable(z);
        readAndStripParam(uri, null);
        initUserSessionInternal(branchReferralInitListener, (Activity) null);
        return true;
    }

    public boolean initSession(BranchUniversalReferralInitListener branchUniversalReferralInitListener, boolean z, Uri uri, Activity activity) {
        setIsReferrable(z);
        readAndStripParam(uri, activity);
        initUserSessionInternal(branchUniversalReferralInitListener, activity);
        return true;
    }

    public boolean initSession(BranchReferralInitListener branchReferralInitListener, boolean z, Uri uri, Activity activity) {
        setIsReferrable(z);
        readAndStripParam(uri, activity);
        initUserSessionInternal(branchReferralInitListener, activity);
        return true;
    }

    public boolean initSession(BranchUniversalReferralInitListener branchUniversalReferralInitListener, boolean z) {
        setIsReferrable(z);
        initUserSessionInternal(branchUniversalReferralInitListener, (Activity) null);
        return true;
    }

    public boolean initSession(BranchReferralInitListener branchReferralInitListener, boolean z) {
        setIsReferrable(z);
        initUserSessionInternal(branchReferralInitListener, (Activity) null);
        return true;
    }

    public boolean initSession(BranchUniversalReferralInitListener branchUniversalReferralInitListener, boolean z, Activity activity) {
        setIsReferrable(z);
        initUserSessionInternal(branchUniversalReferralInitListener, activity);
        return true;
    }

    public boolean initSession(BranchReferralInitListener branchReferralInitListener, boolean z, Activity activity) {
        setIsReferrable(z);
        initUserSessionInternal(branchReferralInitListener, activity);
        return true;
    }

    public boolean reInitSession(Activity activity, BranchUniversalReferralInitListener branchUniversalReferralInitListener) {
        return reInitSession(activity, new BranchUniversalReferralInitWrapper(branchUniversalReferralInitListener));
    }

    public boolean reInitSession(Activity activity, BranchReferralInitListener branchReferralInitListener) {
        if (activity != null && activity.getIntent() != null && branchReferral_.isRestartSessionRequested(activity.getIntent())) {
            Intent intent = activity.getIntent();
            this.currentActivityReference_ = new WeakReference<>(activity);
            Uri data = intent.getData();
            String stringExtra = intent.getStringExtra(Defines.Jsonkey.AndroidPushNotificationKey.getKey());
            if (data == null && !TextUtils.isEmpty(stringExtra)) {
                data = Uri.parse(stringExtra);
            }
            if (data != null) {
                setSessionReferredLink(data.toString());
                this.prefHelper_.setAppLink(data.toString());
                readAndStripParam(data, activity);
                initializeSession(branchReferralInitListener);
                return true;
            }
        }
        if (branchReferralInitListener == null) {
            return false;
        }
        branchReferralInitListener.onInitFinished(null, new BranchError("Warning.", -118));
        return false;
    }

    private void initUserSessionInternal(BranchUniversalReferralInitListener branchUniversalReferralInitListener, Activity activity) {
        initUserSessionInternal(new BranchUniversalReferralInitWrapper(branchUniversalReferralInitListener), activity);
    }

    private void initUserSessionInternal(BranchReferralInitListener branchReferralInitListener, Activity activity) {
        if (activity != null) {
            this.currentActivityReference_ = new WeakReference<>(activity);
        }
        if (this.isInstantDeepLinkPossible) {
            branchReferralInitListener.onInitFinished(getLatestReferringParams(), null);
            addExtraInstrumentationData(Defines.Jsonkey.InstantDeepLinkSession.getKey(), "true");
            this.isInstantDeepLinkPossible = false;
            checkForAutoDeepLinkConfiguration();
            return;
        }
        initializeSession(branchReferralInitListener);
    }

    public void closeSession() {
        PrefHelper.Debug("closeSession() method is deprecated from SDK v1.14.6.Session is  automatically handled by Branch.In case you need to handle sessions manually inorder to support minimum sdk version less than 14 please consider using  SDK version 1.14.5");
    }

    void closeSessionInternal() {
        executeClose();
        resetSessionReferredLink();
        this.trackingController.updateTrackingState(this.context_);
    }

    void clearPendingRequests() {
        this.requestQueue_.clear();
    }

    public static void enableCookieBasedMatching(String str) {
        cookieBasedMatchDomain_ = str;
    }

    public static void enableCookieBasedMatching(String str, int i) {
        cookieBasedMatchDomain_ = str;
        BranchStrongMatchHelper.getInstance().setStrongMatchUrlHitDelay(i);
    }

    private void executeClose() {
        if (this.initState_ != SESSION_STATE.UNINITIALISED) {
            if (!this.hasNetwork_) {
                ServerRequest peek = this.requestQueue_.peek();
                if ((peek != null && (peek instanceof ServerRequestRegisterInstall)) || (peek instanceof ServerRequestRegisterOpen)) {
                    this.requestQueue_.dequeue();
                }
            } else if (!this.requestQueue_.containsClose()) {
                handleNewRequest(new ServerRequestRegisterClose(this.context_));
            }
            setInitState(SESSION_STATE.UNINITIALISED);
        }
    }

    boolean readAndStripParam(Uri uri, Activity activity) {
        String uri2;
        String str;
        if (!disableInstantDeepLinking && ((this.intentState_ == INTENT_STATE.READY || isActivityCreatedAndLaunched()) && activity != null && activity.getIntent() != null && this.initState_ != SESSION_STATE.INITIALISED && !isRestartSessionRequested(activity.getIntent()))) {
            Intent intent = activity.getIntent();
            if (intent.getData() == null || (!isActivityCreatedAndLaunched() && isIntentParamsAlreadyConsumed(activity))) {
                if (!this.prefHelper_.getInstallParams().equals(PrefHelper.NO_STRING_VALUE)) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(Defines.Jsonkey.Clicked_Branch_Link.getKey(), false);
                        jSONObject.put(Defines.Jsonkey.IsFirstSession.getKey(), false);
                        this.prefHelper_.setSessionParams(jSONObject.toString());
                        this.isInstantDeepLinkPossible = true;
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            } else if (!TextUtils.isEmpty(intent.getStringExtra(Defines.Jsonkey.BranchData.getKey()))) {
                try {
                    JSONObject jSONObject2 = new JSONObject(intent.getStringExtra(Defines.Jsonkey.BranchData.getKey()));
                    jSONObject2.put(Defines.Jsonkey.Clicked_Branch_Link.getKey(), true);
                    this.prefHelper_.setSessionParams(jSONObject2.toString());
                    this.isInstantDeepLinkPossible = true;
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                intent.removeExtra(Defines.Jsonkey.BranchData.getKey());
                activity.setIntent(intent);
            } else if (uri.getQueryParameterNames() != null && Boolean.valueOf(uri.getQueryParameter(Defines.Jsonkey.Instant.getKey())).booleanValue()) {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    for (String str2 : uri.getQueryParameterNames()) {
                        jSONObject3.put(str2, uri.getQueryParameter(str2));
                    }
                    jSONObject3.put(Defines.Jsonkey.Clicked_Branch_Link.getKey(), true);
                    this.prefHelper_.setSessionParams(jSONObject3.toString());
                    this.isInstantDeepLinkPossible = true;
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
            }
        }
        if (bypassCurrentActivityIntentState_) {
            this.intentState_ = INTENT_STATE.READY;
        }
        if (this.intentState_ == INTENT_STATE.READY) {
            if (uri != null) {
                try {
                    if (!isIntentParamsAlreadyConsumed(activity)) {
                        String strippedURL = UniversalResourceAnalyser.getInstance(this.context_).getStrippedURL(uri.toString());
                        setSessionReferredLink(strippedURL);
                        if (strippedURL != null && strippedURL.equals(uri.toString()) && activity != null && activity.getIntent() != null && activity.getIntent().getExtras() != null) {
                            Bundle extras = activity.getIntent().getExtras();
                            Set<String> keySet = extras.keySet();
                            if (keySet.size() > 0) {
                                JSONObject jSONObject4 = new JSONObject();
                                for (String str3 : EXTERNAL_INTENT_EXTRA_KEY_WHITE_LIST) {
                                    if (keySet.contains(str3)) {
                                        jSONObject4.put(str3, extras.get(str3));
                                    }
                                }
                                if (jSONObject4.length() > 0) {
                                    this.prefHelper_.setExternalIntentExtra(jSONObject4.toString());
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
            if (activity != null) {
                try {
                    if (activity.getIntent() != null && activity.getIntent().getExtras() != null && !isIntentParamsAlreadyConsumed(activity)) {
                        Object obj = activity.getIntent().getExtras().get(Defines.Jsonkey.AndroidPushNotificationKey.getKey());
                        if (obj instanceof String) {
                            uri2 = (String) obj;
                        } else {
                            uri2 = obj instanceof Uri ? ((Uri) obj).toString() : null;
                        }
                        if (!TextUtils.isEmpty(uri2)) {
                            this.prefHelper_.setPushIdentifier(uri2);
                            Intent intent2 = activity.getIntent();
                            intent2.putExtra(Defines.Jsonkey.BranchLinkUsed.getKey(), true);
                            activity.setIntent(intent2);
                            return false;
                        }
                    }
                } catch (Exception unused2) {
                }
            }
            if (uri != null && uri.isHierarchical() && activity != null && !isActivityLaunchedFromHistory(activity)) {
                try {
                    if (uri.getQueryParameter(Defines.Jsonkey.LinkClickID.getKey()) != null) {
                        this.prefHelper_.setLinkClickIdentifier(uri.getQueryParameter(Defines.Jsonkey.LinkClickID.getKey()));
                        String str4 = "link_click_id=" + uri.getQueryParameter(Defines.Jsonkey.LinkClickID.getKey());
                        String dataString = activity.getIntent() != null ? activity.getIntent().getDataString() : null;
                        if (uri.getQuery().length() == str4.length()) {
                            str = "\\?" + str4;
                        } else if (dataString != null && dataString.length() - str4.length() == dataString.indexOf(str4)) {
                            str = "&" + str4;
                        } else {
                            str = str4 + "&";
                        }
                        if (dataString != null) {
                            activity.getIntent().setData(Uri.parse(dataString.replaceFirst(str, "")));
                            activity.getIntent().putExtra(Defines.Jsonkey.BranchLinkUsed.getKey(), true);
                        } else {
                            PrefHelper.Debug("Warning: URI for the launcher activity is null. Please make sure that intent data is not set to null before calling Branch#InitSession ");
                        }
                        return true;
                    }
                    String scheme = uri.getScheme();
                    Intent intent3 = activity.getIntent();
                    if (scheme != null && intent3 != null && ((scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase("https")) && uri.getHost() != null && uri.getHost().length() > 0 && !isIntentParamsAlreadyConsumed(activity))) {
                        if (uri.toString().equalsIgnoreCase(UniversalResourceAnalyser.getInstance(this.context_).getStrippedURL(uri.toString()))) {
                            this.prefHelper_.setAppLink(uri.toString());
                        }
                        intent3.putExtra(Defines.Jsonkey.BranchLinkUsed.getKey(), true);
                        activity.setIntent(intent3);
                    }
                } catch (Exception unused3) {
                }
            }
        }
        return false;
    }

    void unlockSDKInitWaitLock() {
        ServerRequestQueue serverRequestQueue = this.requestQueue_;
        if (serverRequestQueue == null) {
            return;
        }
        serverRequestQueue.unlockProcessWait(ServerRequest.PROCESS_WAIT_LOCK.SDK_INIT_WAIT_LOCK);
        processNextQueueItem();
    }

    private boolean isActivityCreatedAndLaunched() {
        BranchActivityLifecycleObserver branchActivityLifecycleObserver = this.activityLifeCycleObserver;
        if (branchActivityLifecycleObserver == null) {
            return false;
        }
        return branchActivityLifecycleObserver.isActivityCreatedAndLaunched();
    }

    private boolean isIntentParamsAlreadyConsumed(Activity activity) {
        return (activity == null || activity.getIntent() == null || !activity.getIntent().getBooleanExtra(Defines.Jsonkey.BranchLinkUsed.getKey(), false)) ? false : true;
    }

    private boolean isActivityLaunchedFromHistory(Activity activity) {
        return (activity == null || activity.getIntent() == null || (activity.getIntent().getFlags() & 1048576) == 0) ? false : true;
    }

    String getSessionReferredLink() {
        String externalIntentUri = this.prefHelper_.getExternalIntentUri();
        if (externalIntentUri.equals(PrefHelper.NO_STRING_VALUE)) {
            return null;
        }
        return externalIntentUri;
    }

    private void setSessionReferredLink(String str) {
        this.prefHelper_.setExternalIntentUri(str);
    }

    private void resetSessionReferredLink() {
        setSessionReferredLink(null);
    }

    @Override // io.branch.referral.SystemObserver.AdsParamsFetchEvents
    public void onAdsParamsFetchFinished() {
        this.isGAParamsFetchInProgress_ = false;
        this.requestQueue_.unlockProcessWait(ServerRequest.PROCESS_WAIT_LOCK.GAID_FETCH_WAIT_LOCK);
        if (this.performCookieBasedStrongMatchingOnGAIDAvailable) {
            performCookieBasedStrongMatch();
            this.performCookieBasedStrongMatchingOnGAIDAvailable = false;
        } else {
            processNextQueueItem();
        }
    }

    @Override // io.branch.referral.GooglePlayStoreAttribution.IInstallReferrerEvents
    public void onInstallReferrerEventsFinished() {
        this.requestQueue_.unlockProcessWait(ServerRequest.PROCESS_WAIT_LOCK.INSTALL_REFERRER_FETCH_WAIT_LOCK);
        processNextQueueItem();
    }

    public Branch addWhiteListedScheme(String str) {
        if (str != null) {
            UniversalResourceAnalyser.getInstance(this.context_).addToAcceptURLFormats(str);
        }
        return this;
    }

    public Branch setWhiteListedSchemes(List<String> list) {
        if (list != null) {
            UniversalResourceAnalyser.getInstance(this.context_).addToAcceptURLFormats(list);
        }
        return this;
    }

    public Branch addUriHostsToSkip(String str) {
        if (!TextUtils.isEmpty(str)) {
            UniversalResourceAnalyser.getInstance(this.context_).addToSkipURLFormats(str);
        }
        return this;
    }

    void updateSkipURLFormats() {
        UniversalResourceAnalyser.getInstance(this.context_).checkAndUpdateSkipURLFormats(this.context_);
    }

    public void setIdentity(String str) {
        setIdentity(str, null);
    }

    public void setIdentity(String str, BranchReferralInitListener branchReferralInitListener) {
        ServerRequestIdentifyUserRequest serverRequestIdentifyUserRequest = new ServerRequestIdentifyUserRequest(this.context_, branchReferralInitListener, str);
        if (!serverRequestIdentifyUserRequest.constructError_ && !serverRequestIdentifyUserRequest.handleErrors(this.context_)) {
            handleNewRequest(serverRequestIdentifyUserRequest);
        } else if (serverRequestIdentifyUserRequest.isExistingID()) {
            serverRequestIdentifyUserRequest.handleUserExist(branchReferral_);
        }
    }

    public void getCrossPlatformIds(ServerRequestGetCPID.BranchCrossPlatformIdListener branchCrossPlatformIdListener) {
        if (this.context_ != null) {
            handleNewRequest(new ServerRequestGetCPID(this.context_, Defines.RequestPath.GetCPID.getPath(), branchCrossPlatformIdListener));
        }
    }

    public void getLastAttributedTouchData(ServerRequestGetLATD.BranchLastAttributedTouchDataListener branchLastAttributedTouchDataListener) {
        if (this.context_ != null) {
            handleNewRequest(new ServerRequestGetLATD(this.context_, Defines.RequestPath.GetLATD.getPath(), branchLastAttributedTouchDataListener));
        }
    }

    public void getLastAttributedTouchData(ServerRequestGetLATD.BranchLastAttributedTouchDataListener branchLastAttributedTouchDataListener, int i) {
        if (this.context_ != null) {
            handleNewRequest(new ServerRequestGetLATD(this.context_, Defines.RequestPath.GetLATD.getPath(), branchLastAttributedTouchDataListener, i));
        }
    }

    public boolean isUserIdentified() {
        return !this.prefHelper_.getIdentity().equals(PrefHelper.NO_STRING_VALUE);
    }

    public void logout() {
        logout(null);
    }

    public void logout(LogoutStatusListener logoutStatusListener) {
        ServerRequestLogout serverRequestLogout = new ServerRequestLogout(this.context_, logoutStatusListener);
        if (serverRequestLogout.constructError_ || serverRequestLogout.handleErrors(this.context_)) {
            return;
        }
        handleNewRequest(serverRequestLogout);
    }

    public void loadRewards() {
        loadRewards(null);
    }

    public void loadRewards(BranchReferralStateChangedListener branchReferralStateChangedListener) {
        ServerRequestGetRewards serverRequestGetRewards = new ServerRequestGetRewards(this.context_, branchReferralStateChangedListener);
        if (serverRequestGetRewards.constructError_ || serverRequestGetRewards.handleErrors(this.context_)) {
            return;
        }
        handleNewRequest(serverRequestGetRewards);
    }

    public int getCredits() {
        return this.prefHelper_.getCreditCount();
    }

    public int getCreditsForBucket(String str) {
        return this.prefHelper_.getCreditCount(str);
    }

    public void redeemRewards(int i) {
        redeemRewards(Defines.Jsonkey.DefaultBucket.getKey(), i, null);
    }

    public void redeemRewards(int i, BranchReferralStateChangedListener branchReferralStateChangedListener) {
        redeemRewards(Defines.Jsonkey.DefaultBucket.getKey(), i, branchReferralStateChangedListener);
    }

    public void redeemRewards(String str, int i) {
        redeemRewards(str, i, null);
    }

    public void redeemRewards(String str, int i, BranchReferralStateChangedListener branchReferralStateChangedListener) {
        ServerRequestRedeemRewards serverRequestRedeemRewards = new ServerRequestRedeemRewards(this.context_, str, i, branchReferralStateChangedListener);
        if (serverRequestRedeemRewards.constructError_ || serverRequestRedeemRewards.handleErrors(this.context_)) {
            return;
        }
        handleNewRequest(serverRequestRedeemRewards);
    }

    public void getCreditHistory(BranchListResponseListener branchListResponseListener) {
        getCreditHistory(null, null, 100, CreditHistoryOrder.kMostRecentFirst, branchListResponseListener);
    }

    public void getCreditHistory(String str, BranchListResponseListener branchListResponseListener) {
        getCreditHistory(str, null, 100, CreditHistoryOrder.kMostRecentFirst, branchListResponseListener);
    }

    public void getCreditHistory(String str, int i, CreditHistoryOrder creditHistoryOrder, BranchListResponseListener branchListResponseListener) {
        getCreditHistory(null, str, i, creditHistoryOrder, branchListResponseListener);
    }

    public void getCreditHistory(String str, String str2, int i, CreditHistoryOrder creditHistoryOrder, BranchListResponseListener branchListResponseListener) {
        ServerRequestGetRewardHistory serverRequestGetRewardHistory = new ServerRequestGetRewardHistory(this.context_, str, str2, i, creditHistoryOrder, branchListResponseListener);
        if (serverRequestGetRewardHistory.constructError_ || serverRequestGetRewardHistory.handleErrors(this.context_)) {
            return;
        }
        handleNewRequest(serverRequestGetRewardHistory);
    }

    public void userCompletedAction(String str, JSONObject jSONObject) {
        userCompletedAction(str, jSONObject, null);
    }

    public void userCompletedAction(String str) {
        userCompletedAction(str, null, null);
    }

    public void userCompletedAction(String str, BranchViewHandler.IBranchViewEvents iBranchViewEvents) {
        userCompletedAction(str, null, iBranchViewEvents);
    }

    public void userCompletedAction(String str, JSONObject jSONObject, BranchViewHandler.IBranchViewEvents iBranchViewEvents) {
        ServerRequestActionCompleted serverRequestActionCompleted = new ServerRequestActionCompleted(this.context_, str, null, jSONObject, iBranchViewEvents);
        if (serverRequestActionCompleted.constructError_ || serverRequestActionCompleted.handleErrors(this.context_)) {
            return;
        }
        handleNewRequest(serverRequestActionCompleted);
    }

    public void sendCommerceEvent(CommerceEvent commerceEvent, JSONObject jSONObject, BranchViewHandler.IBranchViewEvents iBranchViewEvents) {
        ServerRequestActionCompleted serverRequestActionCompleted = new ServerRequestActionCompleted(this.context_, BRANCH_STANDARD_EVENT.PURCHASE.getName(), commerceEvent, jSONObject, iBranchViewEvents);
        if (serverRequestActionCompleted.constructError_ || serverRequestActionCompleted.handleErrors(this.context_)) {
            return;
        }
        handleNewRequest(serverRequestActionCompleted);
    }

    public void sendCommerceEvent(CommerceEvent commerceEvent) {
        sendCommerceEvent(commerceEvent, null, null);
    }

    public JSONObject getFirstReferringParams() {
        return appendDebugParams(convertParamsStringToDictionary(this.prefHelper_.getInstallParams()));
    }

    public JSONObject getFirstReferringParamsSync() {
        this.getFirstReferringParamsLatch = new CountDownLatch(1);
        if (this.prefHelper_.getInstallParams().equals(PrefHelper.NO_STRING_VALUE)) {
            try {
                this.getFirstReferringParamsLatch.await(LATCH_WAIT_UNTIL, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
            }
        }
        JSONObject appendDebugParams = appendDebugParams(convertParamsStringToDictionary(this.prefHelper_.getInstallParams()));
        this.getFirstReferringParamsLatch = null;
        return appendDebugParams;
    }

    public JSONObject getLatestReferringParams() {
        return appendDebugParams(convertParamsStringToDictionary(this.prefHelper_.getSessionParams()));
    }

    public JSONObject getLatestReferringParamsSync() {
        this.getLatestReferringParamsLatch = new CountDownLatch(1);
        try {
            if (this.initState_ != SESSION_STATE.INITIALISED) {
                this.getLatestReferringParamsLatch.await(LATCH_WAIT_UNTIL, TimeUnit.MILLISECONDS);
            }
        } catch (InterruptedException unused) {
        }
        JSONObject appendDebugParams = appendDebugParams(convertParamsStringToDictionary(this.prefHelper_.getSessionParams()));
        this.getLatestReferringParamsLatch = null;
        return appendDebugParams;
    }

    private JSONObject appendDebugParams(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = this.deeplinkDebugParams_;
                if (jSONObject2 != null) {
                    if (jSONObject2.length() > 0) {
                        PrefHelper.Debug("You're currently in deep link debug mode. Please comment out 'setDeepLinkDebugMode' to receive the deep link parameters from a real Branch link");
                    }
                    Iterator<String> keys = this.deeplinkDebugParams_.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.put(next, this.deeplinkDebugParams_.get(next));
                    }
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public JSONObject getDeeplinkDebugParams() {
        JSONObject jSONObject = this.deeplinkDebugParams_;
        if (jSONObject != null && jSONObject.length() > 0) {
            PrefHelper.Debug("You're currently in deep link debug mode. Please comment out 'setDeepLinkDebugMode' to receive the deep link parameters from a real Branch link");
        }
        return this.deeplinkDebugParams_;
    }

    String generateShortLinkInternal(ServerRequestCreateUrl serverRequestCreateUrl) {
        if (serverRequestCreateUrl.constructError_ || serverRequestCreateUrl.handleErrors(this.context_)) {
            return null;
        }
        if (this.linkCache_.containsKey(serverRequestCreateUrl.getLinkPost())) {
            String str = this.linkCache_.get(serverRequestCreateUrl.getLinkPost());
            serverRequestCreateUrl.onUrlAvailable(str);
            return str;
        }
        if (serverRequestCreateUrl.isAsync()) {
            generateShortLinkAsync(serverRequestCreateUrl);
            return null;
        }
        return generateShortLinkSync(serverRequestCreateUrl);
    }

    void shareLink(BranchShareSheetBuilder branchShareSheetBuilder) {
        ShareLinkManager shareLinkManager = this.shareLinkManager_;
        if (shareLinkManager != null) {
            shareLinkManager.cancelShareLinkDialog(true);
        }
        ShareLinkManager shareLinkManager2 = new ShareLinkManager();
        this.shareLinkManager_ = shareLinkManager2;
        shareLinkManager2.shareLink(branchShareSheetBuilder);
    }

    public void cancelShareLinkDialog(boolean z) {
        ShareLinkManager shareLinkManager = this.shareLinkManager_;
        if (shareLinkManager != null) {
            shareLinkManager.cancelShareLinkDialog(z);
        }
    }

    private String convertDate(Date date) {
        return DateFormat.format(ConstantsKt.READABLE_DATE_FORMAT, date).toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private String generateShortLinkSync(ServerRequestCreateUrl serverRequestCreateUrl) {
        ServerResponse serverResponse;
        if (this.trackingController.isTrackingDisabled()) {
            return serverRequestCreateUrl.getLongUrl();
        }
        Object[] objArr = 0;
        if (this.initState_ == SESSION_STATE.INITIALISED) {
            try {
                serverResponse = new GetShortLinkTask().execute(serverRequestCreateUrl).get(this.prefHelper_.getTimeout() + 2000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                serverResponse = null;
            }
            String longUrl = serverRequestCreateUrl.isDefaultToLongUrl() ? serverRequestCreateUrl.getLongUrl() : null;
            if (serverResponse != null && serverResponse.getStatusCode() == 200) {
                try {
                    longUrl = serverResponse.getObject().getString("url");
                    if (serverRequestCreateUrl.getLinkPost() != null) {
                        this.linkCache_.put(serverRequestCreateUrl.getLinkPost(), longUrl);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            return longUrl;
        }
        PrefHelper.Debug("Warning: User session has not been initialized");
        return null;
    }

    private void generateShortLinkAsync(ServerRequest serverRequest) {
        handleNewRequest(serverRequest);
    }

    private JSONObject convertParamsStringToDictionary(String str) {
        if (str.equals(PrefHelper.NO_STRING_VALUE)) {
            return new JSONObject();
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            try {
                return new JSONObject(new String(Base64.decode(str.getBytes(), 2)));
            } catch (JSONException e) {
                e.printStackTrace();
                return new JSONObject();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processNextQueueItem() {
        try {
            this.serverSema_.acquire();
            if (this.networkCount_ == 0 && this.requestQueue_.getSize() > 0) {
                this.networkCount_ = 1;
                ServerRequest peek = this.requestQueue_.peek();
                this.serverSema_.release();
                if (peek != null) {
                    if (!peek.isWaitingOnProcessToFinish()) {
                        if (!(peek instanceof ServerRequestRegisterInstall) && !hasUser()) {
                            PrefHelper.Debug("Branch Error: User session has not been initialized!");
                            this.networkCount_ = 0;
                            handleFailure(this.requestQueue_.getSize() - 1, -101);
                            return;
                        } else if (requestNeedsSession(peek) && !isSessionAvailableForRequest()) {
                            this.networkCount_ = 0;
                            handleFailure(this.requestQueue_.getSize() - 1, -101);
                            return;
                        } else {
                            new BranchPostTask(peek).executeTask(new Void[0]);
                            return;
                        }
                    }
                    this.networkCount_ = 0;
                    return;
                }
                this.requestQueue_.remove(null);
                return;
            }
            this.serverSema_.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean requestNeedsSession(ServerRequest serverRequest) {
        return ((serverRequest instanceof ServerRequestInitSession) || (serverRequest instanceof ServerRequestCreateUrl)) ? false : true;
    }

    private boolean isSessionAvailableForRequest() {
        return hasSession() && hasDeviceFingerPrint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleFailure(int i, int i2) {
        ServerRequest peekAt;
        if (i >= this.requestQueue_.getSize()) {
            peekAt = this.requestQueue_.peekAt(r2.getSize() - 1);
        } else {
            peekAt = this.requestQueue_.peekAt(i);
        }
        handleFailure(peekAt, i2);
    }

    private void handleFailure(ServerRequest serverRequest, int i) {
        if (serverRequest == null) {
            return;
        }
        serverRequest.handleFailure(i, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAllRequestsInQueue() {
        JSONObject post;
        for (int i = 0; i < this.requestQueue_.getSize(); i++) {
            try {
                ServerRequest peekAt = this.requestQueue_.peekAt(i);
                if (peekAt != null && (post = peekAt.getPost()) != null) {
                    if (post.has(Defines.Jsonkey.SessionID.getKey())) {
                        peekAt.getPost().put(Defines.Jsonkey.SessionID.getKey(), this.prefHelper_.getSessionID());
                    }
                    if (post.has(Defines.Jsonkey.IdentityID.getKey())) {
                        peekAt.getPost().put(Defines.Jsonkey.IdentityID.getKey(), this.prefHelper_.getIdentityID());
                    }
                    if (post.has(Defines.Jsonkey.DeviceFingerprintID.getKey())) {
                        peekAt.getPost().put(Defines.Jsonkey.DeviceFingerprintID.getKey(), this.prefHelper_.getDeviceFingerPrintID());
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
                return;
            }
        }
    }

    public TrackingController getTrackingController() {
        return this.trackingController;
    }

    public DeviceInfo getDeviceInfo() {
        return this.deviceInfo_;
    }

    PrefHelper getPrefHelper() {
        return this.prefHelper_;
    }

    boolean isGAParamsFetchInProgress() {
        return this.isGAParamsFetchInProgress_;
    }

    void setGAParamsFetchInProgress(boolean z) {
        this.isGAParamsFetchInProgress_ = z;
    }

    ShareLinkManager getShareLinkManager() {
        return this.shareLinkManager_;
    }

    void setIntentState(INTENT_STATE intent_state) {
        this.intentState_ = intent_state;
    }

    void setInitState(SESSION_STATE session_state) {
        this.initState_ = session_state;
    }

    SESSION_STATE getInitState() {
        return this.initState_;
    }

    private boolean hasSession() {
        return !this.prefHelper_.getSessionID().equals(PrefHelper.NO_STRING_VALUE);
    }

    public void setInstantDeepLinkPossible(boolean z) {
        this.isInstantDeepLinkPossible = z;
    }

    public boolean isInstantDeepLinkPossible() {
        return this.isInstantDeepLinkPossible;
    }

    private boolean hasDeviceFingerPrint() {
        return !this.prefHelper_.getDeviceFingerPrintID().equals(PrefHelper.NO_STRING_VALUE);
    }

    private boolean hasUser() {
        return !this.prefHelper_.getIdentityID().equals(PrefHelper.NO_STRING_VALUE);
    }

    private void insertRequestAtFront(ServerRequest serverRequest) {
        if (this.networkCount_ == 0) {
            this.requestQueue_.insert(serverRequest, 0);
        } else {
            this.requestQueue_.insert(serverRequest, 1);
        }
    }

    private void initializeSession(BranchReferralInitListener branchReferralInitListener) {
        if (this.prefHelper_.getBranchKey() == null || this.prefHelper_.getBranchKey().equalsIgnoreCase(PrefHelper.NO_STRING_VALUE)) {
            setInitState(SESSION_STATE.UNINITIALISED);
            if (branchReferralInitListener != null) {
                branchReferralInitListener.onInitFinished(null, new BranchError("Trouble initializing Branch.", -114));
            }
            PrefHelper.Debug("Warning: Please enter your branch_key in your project's res/values/strings.xml!");
            return;
        }
        if (BranchUtil.isTestModeEnabled()) {
            PrefHelper.Debug("Warning: You are using your test app's Branch Key. Remember to change it to live Branch Key during deployment.");
        }
        ServerRequestInitSession installOrOpenRequest = getInstallOrOpenRequest(branchReferralInitListener);
        if (this.initState_ == SESSION_STATE.UNINITIALISED && ((getSessionReferredLink() == null || this.enableFacebookAppLinkCheck_) && DeferredAppLinkDataHandler.fetchDeferredAppLinkData(this.context_, new DeferredAppLinkDataHandler.AppLinkFetchEvents() { // from class: io.branch.referral.Branch.1
            @Override // io.branch.referral.DeferredAppLinkDataHandler.AppLinkFetchEvents
            public void onAppLinkFetchFinished(String str) {
                Branch.this.prefHelper_.setIsAppLinkTriggeredInit(true);
                if (str != null) {
                    String queryParameter = Uri.parse(str).getQueryParameter(Defines.Jsonkey.LinkClickID.getKey());
                    if (!TextUtils.isEmpty(queryParameter)) {
                        Branch.this.prefHelper_.setLinkClickIdentifier(queryParameter);
                    }
                }
                Branch.this.requestQueue_.unlockProcessWait(ServerRequest.PROCESS_WAIT_LOCK.FB_APP_LINK_WAIT_LOCK);
                Branch.this.processNextQueueItem();
            }
        }).booleanValue())) {
            installOrOpenRequest.addProcessWaitLock(ServerRequest.PROCESS_WAIT_LOCK.FB_APP_LINK_WAIT_LOCK);
        }
        WeakReference<Activity> weakReference = this.currentActivityReference_;
        boolean isRestartSessionRequested = isRestartSessionRequested((weakReference == null || weakReference.get() == null) ? null : this.currentActivityReference_.get().getIntent());
        if (getInitState() == SESSION_STATE.UNINITIALISED || isRestartSessionRequested) {
            registerAppInit(installOrOpenRequest, false);
        } else if (branchReferralInitListener != null) {
            branchReferralInitListener.onInitFinished(null, new BranchError("Warning.", -118));
        }
    }

    private void registerAppInit(ServerRequestInitSession serverRequestInitSession, boolean z) {
        setInitState(SESSION_STATE.INITIALISING);
        if (!z) {
            if (this.intentState_ != INTENT_STATE.READY && !isForceSessionEnabled()) {
                serverRequestInitSession.addProcessWaitLock(ServerRequest.PROCESS_WAIT_LOCK.INTENT_PENDING_WAIT_LOCK);
            }
            if (checkInstallReferrer_ && (serverRequestInitSession instanceof ServerRequestRegisterInstall) && !GooglePlayStoreAttribution.hasBeenUsed) {
                serverRequestInitSession.addProcessWaitLock(ServerRequest.PROCESS_WAIT_LOCK.INSTALL_REFERRER_FETCH_WAIT_LOCK);
                new GooglePlayStoreAttribution().captureInstallReferrer(this.context_, playStoreReferrerWaitTime, this);
                if (GooglePlayStoreAttribution.erroredOut) {
                    serverRequestInitSession.removeProcessWaitLock(ServerRequest.PROCESS_WAIT_LOCK.INSTALL_REFERRER_FETCH_WAIT_LOCK);
                }
            }
        }
        if (this.isGAParamsFetchInProgress_) {
            serverRequestInitSession.addProcessWaitLock(ServerRequest.PROCESS_WAIT_LOCK.GAID_FETCH_WAIT_LOCK);
        }
        if (!this.requestQueue_.containsInitRequest()) {
            insertRequestAtFront(serverRequestInitSession);
            processNextQueueItem();
        } else {
            PrefHelper.Debug("Warning! Attempted to queue multiple init session requests");
        }
    }

    void registerAppInitWithoutIntent() {
        registerAppInit(getInstallOrOpenRequest(null), true);
    }

    private ServerRequestInitSession getInstallOrOpenRequest(BranchReferralInitListener branchReferralInitListener) {
        if (hasUser()) {
            return new ServerRequestRegisterOpen(this.context_, branchReferralInitListener);
        }
        return new ServerRequestRegisterInstall(this.context_, branchReferralInitListener);
    }

    void onIntentReady(Activity activity, boolean z) {
        this.requestQueue_.unlockProcessWait(ServerRequest.PROCESS_WAIT_LOCK.INTENT_PENDING_WAIT_LOCK);
        if (z) {
            readAndStripParam(activity.getIntent().getData(), activity);
            if (!isTrackingDisabled() && cookieBasedMatchDomain_ != null && this.prefHelper_.getBranchKey() != null && !this.prefHelper_.getBranchKey().equalsIgnoreCase(PrefHelper.NO_STRING_VALUE)) {
                if (this.isGAParamsFetchInProgress_) {
                    this.performCookieBasedStrongMatchingOnGAIDAvailable = true;
                    return;
                } else {
                    performCookieBasedStrongMatch();
                    return;
                }
            }
            processNextQueueItem();
            return;
        }
        processNextQueueItem();
    }

    private void performCookieBasedStrongMatch() {
        if (this.trackingController.isTrackingDisabled()) {
            return;
        }
        WeakReference<Activity> weakReference = this.currentActivityReference_;
        Activity activity = weakReference != null ? weakReference.get() : null;
        Context applicationContext = activity != null ? activity.getApplicationContext() : null;
        if (applicationContext != null) {
            this.requestQueue_.setStrongMatchWaitLock();
            BranchStrongMatchHelper.getInstance().checkForStrongMatch(applicationContext, cookieBasedMatchDomain_, this.deviceInfo_, this.prefHelper_, new BranchStrongMatchHelper.StrongMatchCheckEvents() { // from class: io.branch.referral.Branch.2
                @Override // io.branch.referral.BranchStrongMatchHelper.StrongMatchCheckEvents
                public void onStrongMatchCheckFinished() {
                    Branch.this.requestQueue_.unlockProcessWait(ServerRequest.PROCESS_WAIT_LOCK.STRONG_MATCH_PENDING_WAIT_LOCK);
                    Branch.this.processNextQueueItem();
                }
            });
        }
    }

    public void handleNewRequest(ServerRequest serverRequest) {
        if (this.trackingController.isTrackingDisabled() && !serverRequest.prepareExecuteWithoutTracking()) {
            serverRequest.reportTrackingDisabledError();
            return;
        }
        if (this.initState_ != SESSION_STATE.INITIALISED && !(serverRequest instanceof ServerRequestInitSession)) {
            if (serverRequest instanceof ServerRequestLogout) {
                serverRequest.handleFailure(-101, "");
                PrefHelper.Debug("Branch is not initialized, cannot logout");
                return;
            } else if (serverRequest instanceof ServerRequestRegisterClose) {
                PrefHelper.Debug("Branch is not initialized, cannot close session");
                return;
            } else if (requestNeedsSession(serverRequest)) {
                serverRequest.addProcessWaitLock(ServerRequest.PROCESS_WAIT_LOCK.SDK_INIT_WAIT_LOCK);
            }
        }
        if (!(serverRequest instanceof ServerRequestPing)) {
            this.requestQueue_.enqueue(serverRequest);
            serverRequest.onRequestQueued();
        }
        processNextQueueItem();
    }

    public void notifyNetworkAvailable() {
        handleNewRequest(new ServerRequestPing(this.context_));
    }

    private void setActivityLifeCycleObserver(Application application) {
        try {
            BranchActivityLifecycleObserver branchActivityLifecycleObserver = new BranchActivityLifecycleObserver();
            this.activityLifeCycleObserver = branchActivityLifecycleObserver;
            application.unregisterActivityLifecycleCallbacks(branchActivityLifecycleObserver);
            application.registerActivityLifecycleCallbacks(this.activityLifeCycleObserver);
            isActivityLifeCycleCallbackRegistered_ = true;
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
            isActivityLifeCycleCallbackRegistered_ = false;
            isAutoSessionMode_ = false;
            PrefHelper.Debug(new BranchError("", -108).getMessage());
        }
    }

    boolean isRestartSessionRequested(Intent intent) {
        if (intent == null) {
            return false;
        }
        if (intent.getBooleanExtra(Defines.Jsonkey.ForceNewBranchSession.getKey(), false)) {
            return true;
        }
        return (intent.getStringExtra(Defines.Jsonkey.AndroidPushNotificationKey.getKey()) == null || intent.getBooleanExtra(Defines.Jsonkey.BranchLinkUsed.getKey(), false)) ? false : true;
    }

    private class GetShortLinkTask extends AsyncTask<ServerRequest, Void, ServerResponse> {
        private GetShortLinkTask() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public ServerResponse doInBackground(ServerRequest... serverRequestArr) {
            return Branch.this.branchRemoteInterface_.make_restful_post(serverRequestArr[0].getPost(), Branch.this.prefHelper_.getAPIBaseUrl() + Defines.RequestPath.GetURL.getPath(), Defines.RequestPath.GetURL.getPath(), Branch.this.prefHelper_.getBranchKey());
        }
    }

    private class BranchPostTask extends BranchAsyncTask<Void, Void, ServerResponse> {
        ServerRequest thisReq_;

        public BranchPostTask(ServerRequest serverRequest) {
            this.thisReq_ = serverRequest;
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            this.thisReq_.onPreExecute();
            this.thisReq_.doFinalUpdateOnMainThread();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public ServerResponse doInBackground(Void... voidArr) {
            Branch.this.addExtraInstrumentationData(this.thisReq_.getRequestPath() + "-" + Defines.Jsonkey.Queue_Wait_Time.getKey(), String.valueOf(this.thisReq_.getQueueWaitTime()));
            this.thisReq_.doFinalUpdateOnBackgroundThread();
            if (!Branch.this.isTrackingDisabled() || this.thisReq_.prepareExecuteWithoutTracking()) {
                return this.thisReq_.isGetRequest() ? Branch.this.branchRemoteInterface_.make_restful_get(this.thisReq_.getRequestUrl(), this.thisReq_.getGetParams(), this.thisReq_.getRequestPath(), Branch.this.prefHelper_.getBranchKey()) : Branch.this.branchRemoteInterface_.make_restful_post(this.thisReq_.getPostWithInstrumentationValues(Branch.this.instrumentationExtraData_), this.thisReq_.getRequestUrl(), this.thisReq_.getRequestPath(), Branch.this.prefHelper_.getBranchKey());
            }
            return new ServerResponse(this.thisReq_.getRequestPath(), -117);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(ServerResponse serverResponse) {
            boolean z;
            super.onPostExecute((BranchPostTask) serverResponse);
            if (serverResponse != null) {
                try {
                    int statusCode = serverResponse.getStatusCode();
                    boolean z2 = true;
                    Branch.this.hasNetwork_ = true;
                    if (serverResponse.getStatusCode() == -117) {
                        this.thisReq_.reportTrackingDisabledError();
                        Branch.this.requestQueue_.remove(this.thisReq_);
                    } else if (statusCode == 200) {
                        Branch.this.hasNetwork_ = true;
                        ServerRequest serverRequest = this.thisReq_;
                        if (serverRequest instanceof ServerRequestCreateUrl) {
                            if (serverResponse.getObject() != null) {
                                Branch.this.linkCache_.put(((ServerRequestCreateUrl) this.thisReq_).getLinkPost(), serverResponse.getObject().getString("url"));
                            }
                        } else if (serverRequest instanceof ServerRequestLogout) {
                            Branch.this.linkCache_.clear();
                            Branch.this.requestQueue_.clear();
                        }
                        Branch.this.requestQueue_.dequeue();
                        ServerRequest serverRequest2 = this.thisReq_;
                        if (!(serverRequest2 instanceof ServerRequestInitSession) && !(serverRequest2 instanceof ServerRequestIdentifyUserRequest)) {
                            serverRequest2.onRequestSucceeded(serverResponse, Branch.branchReferral_);
                        }
                        JSONObject object = serverResponse.getObject();
                        if (object != null) {
                            if (Branch.this.isTrackingDisabled()) {
                                z2 = false;
                            } else {
                                if (object.has(Defines.Jsonkey.SessionID.getKey())) {
                                    Branch.this.prefHelper_.setSessionID(object.getString(Defines.Jsonkey.SessionID.getKey()));
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (object.has(Defines.Jsonkey.IdentityID.getKey())) {
                                    if (!Branch.this.prefHelper_.getIdentityID().equals(object.getString(Defines.Jsonkey.IdentityID.getKey()))) {
                                        Branch.this.linkCache_.clear();
                                        Branch.this.prefHelper_.setIdentityID(object.getString(Defines.Jsonkey.IdentityID.getKey()));
                                        z = true;
                                    }
                                }
                                if (object.has(Defines.Jsonkey.DeviceFingerprintID.getKey())) {
                                    Branch.this.prefHelper_.setDeviceFingerPrintID(object.getString(Defines.Jsonkey.DeviceFingerprintID.getKey()));
                                } else {
                                    z2 = z;
                                }
                            }
                            if (z2) {
                                Branch.this.updateAllRequestsInQueue();
                            }
                            ServerRequest serverRequest3 = this.thisReq_;
                            if (!(serverRequest3 instanceof ServerRequestInitSession)) {
                                serverRequest3.onRequestSucceeded(serverResponse, Branch.branchReferral_);
                            } else {
                                Branch.this.setInitState(SESSION_STATE.INITIALISED);
                                this.thisReq_.onRequestSucceeded(serverResponse, Branch.branchReferral_);
                                if (!((ServerRequestInitSession) this.thisReq_).handleBranchViewIfAvailable(serverResponse)) {
                                    Branch.this.checkForAutoDeepLinkConfiguration();
                                }
                                if (Branch.this.getLatestReferringParamsLatch != null) {
                                    Branch.this.getLatestReferringParamsLatch.countDown();
                                }
                                if (Branch.this.getFirstReferringParamsLatch != null) {
                                    Branch.this.getFirstReferringParamsLatch.countDown();
                                }
                            }
                        }
                    } else {
                        if (this.thisReq_ instanceof ServerRequestInitSession) {
                            Branch.this.setInitState(SESSION_STATE.UNINITIALISED);
                        }
                        if (statusCode != 400 && statusCode != 409) {
                            Branch.this.hasNetwork_ = false;
                            ArrayList arrayList = new ArrayList();
                            for (int i = 0; i < Branch.this.requestQueue_.getSize(); i++) {
                                arrayList.add(Branch.this.requestQueue_.peekAt(i));
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ServerRequest serverRequest4 = (ServerRequest) it.next();
                                if (serverRequest4 == null || !serverRequest4.shouldRetryOnFail()) {
                                    Branch.this.requestQueue_.remove(serverRequest4);
                                }
                            }
                            Branch.this.networkCount_ = 0;
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                ServerRequest serverRequest5 = (ServerRequest) it2.next();
                                if (serverRequest5 != null) {
                                    serverRequest5.handleFailure(statusCode, serverResponse.getFailReason());
                                    if (serverRequest5.shouldRetryOnFail()) {
                                        serverRequest5.clearCallbacks();
                                    }
                                }
                            }
                        }
                        Branch.this.requestQueue_.remove(this.thisReq_);
                        ServerRequest serverRequest6 = this.thisReq_;
                        if (serverRequest6 instanceof ServerRequestCreateUrl) {
                            ((ServerRequestCreateUrl) serverRequest6).handleDuplicateURLError();
                        } else {
                            PrefHelper.LogAlways("Branch API Error: Conflicting resource error code from API");
                            Branch.this.handleFailure(0, statusCode);
                        }
                    }
                    Branch.this.networkCount_ = 0;
                    if (!Branch.this.hasNetwork_ || Branch.this.initState_ == SESSION_STATE.UNINITIALISED) {
                        return;
                    }
                    Branch.this.processNextQueueItem();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static boolean isAutoDeepLinkLaunch(Activity activity) {
        return activity.getIntent().getStringExtra(AUTO_DEEP_LINKED) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkForAutoDeepLinkConfiguration() {
        WeakReference<Activity> weakReference;
        JSONObject latestReferringParams = getLatestReferringParams();
        String str = null;
        try {
            if (latestReferringParams.has(Defines.Jsonkey.Clicked_Branch_Link.getKey()) && latestReferringParams.getBoolean(Defines.Jsonkey.Clicked_Branch_Link.getKey()) && latestReferringParams.length() > 0) {
                ApplicationInfo applicationInfo = this.context_.getPackageManager().getApplicationInfo(this.context_.getPackageName(), 128);
                if (applicationInfo.metaData == null || !applicationInfo.metaData.getBoolean(AUTO_DEEP_LINK_DISABLE, false)) {
                    ActivityInfo[] activityInfoArr = this.context_.getPackageManager().getPackageInfo(this.context_.getPackageName(), 129).activities;
                    int i = DEF_AUTO_DEEP_LINK_REQ_CODE;
                    if (activityInfoArr != null) {
                        for (ActivityInfo activityInfo : activityInfoArr) {
                            if (activityInfo != null && activityInfo.metaData != null && ((activityInfo.metaData.getString(AUTO_DEEP_LINK_KEY) != null || activityInfo.metaData.getString(AUTO_DEEP_LINK_PATH) != null) && (checkForAutoDeepLinkKeys(latestReferringParams, activityInfo) || checkForAutoDeepLinkPath(latestReferringParams, activityInfo)))) {
                                str = activityInfo.name;
                                i = activityInfo.metaData.getInt(AUTO_DEEP_LINK_REQ_CODE, DEF_AUTO_DEEP_LINK_REQ_CODE);
                                break;
                            }
                        }
                    }
                    if (str == null || (weakReference = this.currentActivityReference_) == null) {
                        return;
                    }
                    Activity activity = weakReference.get();
                    if (activity != null) {
                        Intent intent = new Intent(activity, Class.forName(str));
                        intent.putExtra(AUTO_DEEP_LINKED, "true");
                        intent.putExtra(Defines.Jsonkey.ReferringData.getKey(), latestReferringParams.toString());
                        Iterator<String> keys = latestReferringParams.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            intent.putExtra(next, latestReferringParams.getString(next));
                        }
                        activity.startActivityForResult(intent, i);
                        return;
                    }
                    PrefHelper.Debug("No activity reference to launch deep linked activity");
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            PrefHelper.Debug("Warning: Please make sure Activity names set for auto deep link are correct!");
        } catch (ClassNotFoundException unused2) {
            PrefHelper.Debug("Warning: Please make sure Activity names set for auto deep link are correct! Error while looking for activity " + ((String) null));
        } catch (Exception unused3) {
        }
    }

    private boolean checkForAutoDeepLinkKeys(JSONObject jSONObject, ActivityInfo activityInfo) {
        if (activityInfo.metaData.getString(AUTO_DEEP_LINK_KEY) != null) {
            for (String str : activityInfo.metaData.getString(AUTO_DEEP_LINK_KEY).split(",")) {
                if (jSONObject.has(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean checkForAutoDeepLinkPath(JSONObject jSONObject, ActivityInfo activityInfo) {
        String string;
        String str = null;
        if (jSONObject.has(Defines.Jsonkey.AndroidDeepLinkPath.getKey())) {
            string = jSONObject.getString(Defines.Jsonkey.AndroidDeepLinkPath.getKey());
        } else {
            if (jSONObject.has(Defines.Jsonkey.DeepLinkPath.getKey())) {
                string = jSONObject.getString(Defines.Jsonkey.DeepLinkPath.getKey());
            }
            if (activityInfo.metaData.getString(AUTO_DEEP_LINK_PATH) != null && str != null) {
                for (String str2 : activityInfo.metaData.getString(AUTO_DEEP_LINK_PATH).split(",")) {
                    if (pathMatch(str2.trim(), str)) {
                        return true;
                    }
                }
            }
            return false;
        }
        str = string;
        if (activityInfo.metaData.getString(AUTO_DEEP_LINK_PATH) != null) {
            while (r1 < r6) {
            }
        }
        return false;
    }

    private boolean pathMatch(String str, String str2) {
        String[] split = str.split("\\?")[0].split("/");
        String[] split2 = str2.split("\\?")[0].split("/");
        if (split.length != split2.length) {
            return false;
        }
        for (int i = 0; i < split.length && i < split2.length; i++) {
            String str3 = split[i];
            if (!str3.equals(split2[i]) && !str3.contains("*")) {
                return false;
            }
        }
        return true;
    }

    public static void enableSimulateInstalls() {
        isSimulatingInstalls_ = true;
    }

    public static void disableSimulateInstalls() {
        isSimulatingInstalls_ = false;
    }

    static boolean isSimulatingInstalls() {
        return isSimulatingInstalls_;
    }

    public static void enableLogging() {
        PrefHelper.enableLogging(true);
    }

    public static void disableLogging() {
        PrefHelper.enableLogging(false);
    }

    public static void enableForcedSession() {
        isForcedSession_ = true;
    }

    public static void disableForcedSession() {
        isForcedSession_ = false;
    }

    public static boolean isForceSessionEnabled() {
        return isForcedSession_;
    }

    public static void enableBypassCurrentActivityIntentState() {
        bypassCurrentActivityIntentState_ = true;
    }

    public static boolean bypassCurrentActivityIntentState() {
        return bypassCurrentActivityIntentState_;
    }

    void setIsReferrable(boolean z) {
        if (z) {
            this.prefHelper_.setIsReferrable();
        } else {
            this.prefHelper_.clearIsReferrable();
        }
    }

    boolean isReferrable() {
        return this.prefHelper_.getIsReferrable() == 1;
    }

    public void registerView(BranchUniversalObject branchUniversalObject, BranchUniversalObject.RegisterViewStatusListener registerViewStatusListener) {
        if (this.context_ != null) {
            new BranchEvent(BRANCH_STANDARD_EVENT.VIEW_ITEM).addContentItems(branchUniversalObject).logEvent(this.context_);
        }
    }

    public void addExtraInstrumentationData(HashMap<String, String> hashMap) {
        this.instrumentationExtraData_.putAll(hashMap);
    }

    public void addExtraInstrumentationData(String str, String str2) {
        this.instrumentationExtraData_.put(str, str2);
    }

    @Override // io.branch.referral.BranchViewHandler.IBranchViewEvents
    public void onBranchViewAccepted(String str, String str2) {
        if (ServerRequestInitSession.isInitSessionAction(str)) {
            checkForAutoDeepLinkConfiguration();
        }
    }

    @Override // io.branch.referral.BranchViewHandler.IBranchViewEvents
    public void onBranchViewCancelled(String str, String str2) {
        if (ServerRequestInitSession.isInitSessionAction(str)) {
            checkForAutoDeepLinkConfiguration();
        }
    }

    @Override // io.branch.referral.BranchViewHandler.IBranchViewEvents
    public void onBranchViewError(int i, String str, String str2) {
        if (ServerRequestInitSession.isInitSessionAction(str2)) {
            checkForAutoDeepLinkConfiguration();
        }
    }

    public static boolean isInstantApp(Context context) {
        return InstantAppUtil.isInstantApp(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean showInstallPrompt(Activity activity, int i) {
        String str;
        String str2 = "";
        if (getInstance() != null) {
            JSONObject latestReferringParams = getInstance().getLatestReferringParams();
            String str3 = "~" + Defines.Jsonkey.ReferringLink.getKey();
            if (latestReferringParams != null && latestReferringParams.has(str3)) {
                try {
                    str = latestReferringParams.getString(str3);
                    try {
                        str = URLEncoder.encode(str, "UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        e = e;
                        e.printStackTrace();
                        if (!TextUtils.isEmpty(str)) {
                        }
                        return InstantAppUtil.doShowInstallPrompt(activity, i, str2);
                    } catch (JSONException e2) {
                        e = e2;
                        e.printStackTrace();
                        if (!TextUtils.isEmpty(str)) {
                        }
                        return InstantAppUtil.doShowInstallPrompt(activity, i, str2);
                    }
                } catch (UnsupportedEncodingException | JSONException e3) {
                    e = e3;
                    str = "";
                }
                if (!TextUtils.isEmpty(str)) {
                    str2 = Defines.Jsonkey.IsFullAppConv.getKey() + "=true&" + Defines.Jsonkey.ReferringLink.getKey() + "=" + str;
                }
            }
        }
        return InstantAppUtil.doShowInstallPrompt(activity, i, str2);
    }

    public static boolean showInstallPrompt(Activity activity, int i, String str) {
        return InstantAppUtil.doShowInstallPrompt(activity, i, Defines.Jsonkey.IsFullAppConv.getKey() + "=true&" + str);
    }

    public static boolean showInstallPrompt(Activity activity, int i, BranchUniversalObject branchUniversalObject) {
        if (branchUniversalObject == null) {
            return false;
        }
        String str = Defines.Jsonkey.ReferringLink.getKey() + "=" + branchUniversalObject.getShortUrl(activity, new LinkProperties());
        if (!TextUtils.isEmpty(str)) {
            return showInstallPrompt(activity, i, str);
        }
        return showInstallPrompt(activity, i, "");
    }

    @Deprecated
    public static class ShareLinkBuilder extends BranchShareSheetBuilder {
        @Override // io.branch.referral.BranchShareSheetBuilder
        public /* bridge */ /* synthetic */ BranchShareSheetBuilder addPreferredSharingOptions(ArrayList arrayList) {
            return addPreferredSharingOptions((ArrayList<SharingHelper.SHARE_WITH>) arrayList);
        }

        @Override // io.branch.referral.BranchShareSheetBuilder
        public /* bridge */ /* synthetic */ BranchShareSheetBuilder addTags(ArrayList arrayList) {
            return addTags((ArrayList<String>) arrayList);
        }

        @Override // io.branch.referral.BranchShareSheetBuilder
        public /* bridge */ /* synthetic */ BranchShareSheetBuilder excludeFromShareSheet(List list) {
            return excludeFromShareSheet((List<String>) list);
        }

        @Override // io.branch.referral.BranchShareSheetBuilder
        public /* bridge */ /* synthetic */ BranchShareSheetBuilder includeInShareSheet(List list) {
            return includeInShareSheet((List<String>) list);
        }

        @Deprecated
        public ShareLinkBuilder(Activity activity, JSONObject jSONObject) {
            super(activity, jSONObject);
        }

        @Deprecated
        public ShareLinkBuilder(Activity activity, BranchShortLinkBuilder branchShortLinkBuilder) {
            super(activity, branchShortLinkBuilder);
        }

        @Override // io.branch.referral.BranchShareSheetBuilder
        public ShareLinkBuilder setMessage(String str) {
            super.setMessage(str);
            return this;
        }

        @Override // io.branch.referral.BranchShareSheetBuilder
        public ShareLinkBuilder setSubject(String str) {
            super.setSubject(str);
            return this;
        }

        @Override // io.branch.referral.BranchShareSheetBuilder
        public ShareLinkBuilder addTag(String str) {
            super.addTag(str);
            return this;
        }

        @Override // io.branch.referral.BranchShareSheetBuilder
        public ShareLinkBuilder addTags(ArrayList<String> arrayList) {
            super.addTags(arrayList);
            return this;
        }

        @Override // io.branch.referral.BranchShareSheetBuilder
        public ShareLinkBuilder setFeature(String str) {
            super.setFeature(str);
            return this;
        }

        @Override // io.branch.referral.BranchShareSheetBuilder
        public ShareLinkBuilder setStage(String str) {
            super.setStage(str);
            return this;
        }

        @Override // io.branch.referral.BranchShareSheetBuilder
        public ShareLinkBuilder setCallback(BranchLinkShareListener branchLinkShareListener) {
            super.setCallback(branchLinkShareListener);
            return this;
        }

        @Override // io.branch.referral.BranchShareSheetBuilder
        public ShareLinkBuilder setChannelProperties(IChannelProperties iChannelProperties) {
            super.setChannelProperties(iChannelProperties);
            return this;
        }

        @Override // io.branch.referral.BranchShareSheetBuilder
        public ShareLinkBuilder addPreferredSharingOption(SharingHelper.SHARE_WITH share_with) {
            super.addPreferredSharingOption(share_with);
            return this;
        }

        @Override // io.branch.referral.BranchShareSheetBuilder
        public ShareLinkBuilder addPreferredSharingOptions(ArrayList<SharingHelper.SHARE_WITH> arrayList) {
            super.addPreferredSharingOptions(arrayList);
            return this;
        }

        @Override // io.branch.referral.BranchShareSheetBuilder
        public ShareLinkBuilder addParam(String str, String str2) {
            super.addParam(str, str2);
            return this;
        }

        @Override // io.branch.referral.BranchShareSheetBuilder
        public ShareLinkBuilder setDefaultURL(String str) {
            super.setDefaultURL(str);
            return this;
        }

        @Override // io.branch.referral.BranchShareSheetBuilder
        public ShareLinkBuilder setMoreOptionStyle(Drawable drawable, String str) {
            super.setMoreOptionStyle(drawable, str);
            return this;
        }

        @Override // io.branch.referral.BranchShareSheetBuilder
        public ShareLinkBuilder setMoreOptionStyle(int i, int i2) {
            super.setMoreOptionStyle(i, i2);
            return this;
        }

        @Override // io.branch.referral.BranchShareSheetBuilder
        public ShareLinkBuilder setCopyUrlStyle(Drawable drawable, String str, String str2) {
            super.setCopyUrlStyle(drawable, str, str2);
            return this;
        }

        @Override // io.branch.referral.BranchShareSheetBuilder
        public ShareLinkBuilder setCopyUrlStyle(int i, int i2, int i3) {
            super.setCopyUrlStyle(i, i2, i3);
            return this;
        }

        @Override // io.branch.referral.BranchShareSheetBuilder
        public ShareLinkBuilder setAlias(String str) {
            super.setAlias(str);
            return this;
        }

        @Override // io.branch.referral.BranchShareSheetBuilder
        public ShareLinkBuilder setMatchDuration(int i) {
            super.setMatchDuration(i);
            return this;
        }

        @Override // io.branch.referral.BranchShareSheetBuilder
        public ShareLinkBuilder setAsFullWidthStyle(boolean z) {
            super.setAsFullWidthStyle(z);
            return this;
        }

        @Override // io.branch.referral.BranchShareSheetBuilder
        public ShareLinkBuilder setDialogThemeResourceID(int i) {
            super.setDialogThemeResourceID(i);
            return this;
        }

        @Override // io.branch.referral.BranchShareSheetBuilder
        public ShareLinkBuilder setDividerHeight(int i) {
            super.setDividerHeight(i);
            return this;
        }

        @Override // io.branch.referral.BranchShareSheetBuilder
        public ShareLinkBuilder setSharingTitle(String str) {
            super.setSharingTitle(str);
            return this;
        }

        @Override // io.branch.referral.BranchShareSheetBuilder
        public ShareLinkBuilder setSharingTitle(View view) {
            super.setSharingTitle(view);
            return this;
        }

        @Override // io.branch.referral.BranchShareSheetBuilder
        public ShareLinkBuilder setIconSize(int i) {
            super.setIconSize(i);
            return this;
        }

        @Override // io.branch.referral.BranchShareSheetBuilder
        public ShareLinkBuilder excludeFromShareSheet(String str) {
            super.excludeFromShareSheet(str);
            return this;
        }

        @Override // io.branch.referral.BranchShareSheetBuilder
        public ShareLinkBuilder excludeFromShareSheet(String[] strArr) {
            super.excludeFromShareSheet(strArr);
            return this;
        }

        @Override // io.branch.referral.BranchShareSheetBuilder
        public ShareLinkBuilder excludeFromShareSheet(List<String> list) {
            super.excludeFromShareSheet(list);
            return this;
        }

        @Override // io.branch.referral.BranchShareSheetBuilder
        public ShareLinkBuilder includeInShareSheet(String str) {
            super.includeInShareSheet(str);
            return this;
        }

        @Override // io.branch.referral.BranchShareSheetBuilder
        public ShareLinkBuilder includeInShareSheet(String[] strArr) {
            super.includeInShareSheet(strArr);
            return this;
        }

        @Override // io.branch.referral.BranchShareSheetBuilder
        public ShareLinkBuilder includeInShareSheet(List<String> list) {
            super.includeInShareSheet(list);
            return this;
        }
    }
}
