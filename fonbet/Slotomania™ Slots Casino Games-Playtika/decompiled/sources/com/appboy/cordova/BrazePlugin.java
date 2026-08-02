package com.appboy.cordova;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.appboy.cordova.CordovaInAppMessageViewWrapper;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.configuration.BrazeConfig;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.CardCategory;
import com.braze.enums.Gender;
import com.braze.enums.Month;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.enums.SdkFlavor;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.FeedUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.models.cards.Card;
import com.braze.models.outgoing.AttributionData;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.ui.activities.BrazeFeedActivity;
import com.braze.ui.activities.ContentCardsActivity;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaPreferences;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class BrazePlugin extends CordovaPlugin {
    private static final String APPBOY_API_KEY_PREFERENCE = "com.appboy.api_key";
    private static final String APPBOY_LOG_LEVEL_PREFERENCE = "com.appboy.android_log_level";
    private static final String AUTOMATIC_FIREBASE_PUSH_REGISTRATION_ENABLED_PREFERENCE = "com.appboy.firebase_cloud_messaging_registration_enabled";
    private static final String CUSTOM_API_ENDPOINT_PREFERENCE = "com.appboy.android_api_endpoint";
    private static final String DEFAULT_NOTIFICATION_ACCENT_COLOR_PREFERENCE = "com.appboy.android_notification_accent_color";
    private static final String DEFAULT_SESSION_TIMEOUT_PREFERENCE = "com.appboy.android_default_session_timeout";
    private static final String DISABLE_AUTO_START_SESSIONS_PREFERENCE = "com.appboy.android_disable_auto_session_tracking";
    private static final String ENABLE_CORDOVA_WEBVIEW_REQUEST_FOCUS_FIX_PREFERENCE = "com.braze.android_apply_cordova_webview_focus_request_fix";
    private static final String ENABLE_GEOFENCES_PREFERENCE = "com.appboy.geofences_enabled";
    private static final String ENABLE_LOCATION_PREFERENCE = "com.appboy.enable_location_collection";
    private static final String FCM_SENDER_ID_PREFERENCE = "com.appboy.android_fcm_sender_id";
    private static final String GET_CARD_COUNT_FOR_CATEGORIES_METHOD = "getCardCountForCategories";
    private static final String GET_CONTENT_CARDS_FROM_CACHE_METHOD = "getContentCardsFromCache";
    private static final String GET_CONTENT_CARDS_FROM_SERVER_METHOD = "getContentCardsFromServer";
    private static final String GET_NEWS_FEED_METHOD = "getNewsFeed";
    private static final String GET_UNREAD_CARD_COUNT_FOR_CATEGORIES_METHOD = "getUnreadCardCountForCategories";
    private static final String LARGE_NOTIFICATION_ICON_PREFERENCE = "com.appboy.android_large_notification_icon";
    private static final String LOG_CONTENT_CARDS_CLICKED_METHOD = "logContentCardClicked";
    private static final String LOG_CONTENT_CARDS_DISMISSED_METHOD = "logContentCardDismissed";
    private static final String LOG_CONTENT_CARDS_IMPRESSION_METHOD = "logContentCardImpression";
    private static final String NOTIFICATION_CHANNEL_DESCRIPTION_PREFERENCE = "com.appboy.android_notification_channel_description";
    private static final String NOTIFICATION_CHANNEL_ID_PREFERENCE = "com.appboy.android_notification_channel_id";
    private static final String NOTIFICATION_CHANNEL_NAME_PREFERENCE = "com.appboy.android_notification_channel_name";
    private static final String NUMERIC_PREFERENCE_PREFIX = "str_";
    private static final int POST_NOTIFICATIONS_REQUEST_CODE = 33;
    private static final String SET_HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY_PREFERENCE = "com.appboy.android_handle_push_deep_links_automatically";
    private static final String SMALL_NOTIFICATION_ICON_PREFERENCE = "com.appboy.android_small_notification_icon";
    private static final String TAG = "BrazeCordova";
    private static final String USE_CUSTOM_LAYOUT = "com.appboy.android_use_custom_layout";
    private static final String VIBRATION_PATTERN_PREFERENCE = "com.appboy.android_vibration_pattern";
    private static CallbackContext broadcastContextListener;
    private static ArrayList<HashMap<String, String>> broadcastMessages = new ArrayList<>();
    private Context mApplicationContext;
    private boolean mPluginInitializationFinished = false;
    private boolean mDisableAutoStartSessions = false;
    private final Map<String, IEventSubscriber<FeedUpdatedEvent>> mFeedSubscriberMap = new ConcurrentHashMap();

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.appboy");
        p0.startActivity(p1);
    }

    @Override // org.apache.cordova.CordovaPlugin
    protected void pluginInitialize() {
        this.mApplicationContext = this.f3354cordova.getActivity().getApplicationContext();
        configureFromCordovaPreferences(this.preferences);
        BrazeInAppMessageManager.getInstance().registerInAppMessageManager(this.f3354cordova.getActivity());
        this.mPluginInitializationFinished = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0418, code lost:
    
        if (r1.equals("unsubscribed") == false) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01ff, code lost:
    
        if (r20.equals("setIntCustomUserAttribute") == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x04d1, code lost:
    
        if (r20.equals(com.appboy.cordova.BrazePlugin.LOG_CONTENT_CARDS_CLICKED_METHOD) == false) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x02d6, code lost:
    
        if (r1.equals("unsubscribed") == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0368, code lost:
    
        if (r1.equals("u") == false) goto L222;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // org.apache.cordova.CordovaPlugin
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean execute(String str, JSONArray jSONArray, CallbackContext callbackContext) throws JSONException {
        char c;
        char c2;
        char c3;
        char c4;
        String str2;
        initializePluginIfAppropriate();
        Log.i(TAG, "Received " + str + " with the following arguments: " + jSONArray);
        str.hashCode();
        c = '\t';
        c2 = 5;
        c3 = 4;
        c4 = 2;
        switch (str) {
            case "changeUser":
                Braze.getInstance(this.mApplicationContext).changeUser(jSONArray.getString(0));
                break;
            case "disableSdk":
                Braze.disableSdk(this.mApplicationContext);
                this.mPluginInitializationFinished = false;
                break;
            case "startSessionTracking":
                this.mDisableAutoStartSessions = false;
                break;
            case "getDeviceId":
                callbackContext.success(Braze.getInstance(this.mApplicationContext).getDeviceId());
                break;
            case "wipeData":
                Braze.wipeData(this.mApplicationContext);
                this.mPluginInitializationFinished = false;
                break;
            case "requestPostNotificationPermission":
                requestPostNotificationPermission();
                break;
            case "requestContentCardsRefresh":
                Braze.getInstance(this.mApplicationContext).requestContentCardsRefresh(false);
                break;
            case "logCustomEvent":
                Braze.getInstance(this.mApplicationContext).logCustomEvent(jSONArray.getString(0), jSONArray.get(1) != JSONObject.NULL ? new BrazeProperties(jSONArray.getJSONObject(1)) : null);
                break;
            case "logPurchase":
                if (jSONArray.get(2) == JSONObject.NULL) {
                    str2 = "USD";
                } else {
                    str2 = jSONArray.getString(2);
                }
                Braze.getInstance(this.mApplicationContext).logPurchase(jSONArray.getString(0), str2, new BigDecimal(jSONArray.getDouble(1)), jSONArray.get(3) != JSONObject.NULL ? jSONArray.getInt(3) : 1, jSONArray.get(4) != JSONObject.NULL ? new BrazeProperties(jSONArray.getJSONObject(4)) : null);
                break;
            case "requestImmediateDataFlush":
                Braze.getInstance(this.mApplicationContext).requestImmediateDataFlush();
                break;
            case "enableSdk":
                Braze.enableSdk(this.mApplicationContext);
                break;
            case "testCustomNotification":
                NotificationTest.test(this.mApplicationContext, jSONArray.getInt(0), jSONArray.getString(1), jSONArray.getString(2), jSONArray.getString(3));
                break;
            case "registerAppboyPushMessages":
            case "setRegisteredPushToken":
                Braze.getInstance(this.mApplicationContext).setRegisteredPushToken(jSONArray.getString(0));
                break;
            case "addBroadcastListener":
                broadcastContextListener = callbackContext;
                sendBroadcastMessages();
                break;
            default:
                BrazeUser currentUser = Braze.getInstance(this.mApplicationContext).getCurrentUser();
                if (currentUser != null) {
                    str.hashCode();
                    switch (str.hashCode()) {
                        case -1284111084:
                            if (str.equals("setBoolCustomUserAttribute")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1263769041:
                            if (str.equals("addAlias")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1146185036:
                            if (str.equals("removeFromSubscriptionGroup")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1010461252:
                            if (str.equals("setUserAttributionData")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -721841540:
                            if (str.equals("setEmailNotificationSubscriptionType")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -703008304:
                            if (str.equals("setDateCustomUserAttribute")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -363470636:
                            if (str.equals("setCountry")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -208022518:
                            if (str.equals("addToCustomAttributeArray")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 30334285:
                            if (str.equals("setDoubleCustomUserAttribute")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case 195984819:
                            break;
                        case 231885251:
                            if (str.equals("setGender")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case 375730650:
                            if (str.equals("setLanguage")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case 529720515:
                            if (str.equals("setLastName")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case 689992853:
                            if (str.equals("setPhoneNumber")) {
                                c = '\r';
                                break;
                            }
                            c = 65535;
                            break;
                        case 837802395:
                            if (str.equals("setCustomUserAttributeArray")) {
                                c = 14;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1206161350:
                            if (str.equals("addToSubscriptionGroup")) {
                                c = 15;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1299921207:
                            if (str.equals("unsetCustomUserAttribute")) {
                                c = 16;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1391332442:
                            if (str.equals("setEmail")) {
                                c = 17;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1415563057:
                            if (str.equals("incrementCustomUserAttribute")) {
                                c = 18;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1482968510:
                            if (str.equals("setPushNotificationSubscriptionType")) {
                                c = 19;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1496090584:
                            if (str.equals("setDateOfBirth")) {
                                c = 20;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1502615916:
                            if (str.equals("setHomeCity")) {
                                c = 21;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1672223513:
                            if (str.equals("setFirstName")) {
                                c = 22;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1681133837:
                            if (str.equals("setStringCustomUserAttribute")) {
                                c = 23;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2022160988:
                            if (str.equals("removeFromCustomAttributeArray")) {
                                c = 24;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            currentUser.setCustomUserAttribute(jSONArray.getString(0), jSONArray.getBoolean(1));
                            break;
                        case 1:
                            currentUser.addAlias(jSONArray.getString(0), jSONArray.getString(1));
                            break;
                        case 2:
                            currentUser.removeFromSubscriptionGroup(jSONArray.getString(0));
                            break;
                        case 3:
                            currentUser.setAttributionData(new AttributionData(jSONArray.getString(0), jSONArray.getString(1), jSONArray.getString(2), jSONArray.getString(3)));
                            break;
                        case 4:
                            String string = jSONArray.getString(0);
                            string.hashCode();
                            switch (string.hashCode()) {
                                case -1219769254:
                                    if (string.equals("subscribed")) {
                                        c4 = 0;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case -83053070:
                                    if (string.equals("opted_in")) {
                                        c4 = 1;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 901853107:
                                    break;
                                default:
                                    c4 = 65535;
                                    break;
                            }
                            switch (c4) {
                                case 0:
                                    currentUser.setEmailNotificationSubscriptionType(NotificationSubscriptionType.SUBSCRIBED);
                                    break;
                                case 1:
                                    currentUser.setEmailNotificationSubscriptionType(NotificationSubscriptionType.OPTED_IN);
                                    break;
                                case 2:
                                    currentUser.setEmailNotificationSubscriptionType(NotificationSubscriptionType.UNSUBSCRIBED);
                                    break;
                            }
                        case 5:
                            currentUser.setCustomUserAttributeToSecondsFromEpoch(jSONArray.getString(0), jSONArray.getLong(1));
                            break;
                        case 6:
                            currentUser.setCountry(jSONArray.getString(0));
                            break;
                        case 7:
                            currentUser.addToCustomAttributeArray(jSONArray.getString(0), jSONArray.getString(1));
                            break;
                        case '\b':
                            currentUser.setCustomUserAttribute(jSONArray.getString(0), (float) jSONArray.getDouble(1));
                            break;
                        case '\t':
                            currentUser.setCustomUserAttribute(jSONArray.getString(0), jSONArray.getInt(1));
                            break;
                        case '\n':
                            String lowerCase = jSONArray.getString(0).toLowerCase();
                            lowerCase.hashCode();
                            switch (lowerCase.hashCode()) {
                                case 102:
                                    if (lowerCase.equals("f")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 109:
                                    if (lowerCase.equals("m")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 110:
                                    if (lowerCase.equals("n")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 111:
                                    if (lowerCase.equals("o")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 112:
                                    if (lowerCase.equals("p")) {
                                        c2 = 4;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case ASSET_FAILED_STATUS_CODE_VALUE:
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            switch (c2) {
                                case 0:
                                    currentUser.setGender(Gender.FEMALE);
                                    break;
                                case 1:
                                    currentUser.setGender(Gender.MALE);
                                    break;
                                case 2:
                                    currentUser.setGender(Gender.NOT_APPLICABLE);
                                    break;
                                case 3:
                                    currentUser.setGender(Gender.OTHER);
                                    break;
                                case 4:
                                    currentUser.setGender(Gender.PREFER_NOT_TO_SAY);
                                    break;
                                case 5:
                                    currentUser.setGender(Gender.UNKNOWN);
                                    break;
                            }
                        case 11:
                            currentUser.setLanguage(jSONArray.getString(0));
                            break;
                        case '\f':
                            currentUser.setLastName(jSONArray.getString(0));
                            break;
                        case '\r':
                            currentUser.setPhoneNumber(jSONArray.getString(0));
                            break;
                        case 14:
                            currentUser.setCustomAttributeArray(jSONArray.getString(0), parseJSONArrayToStringArray(jSONArray.getJSONArray(1)));
                            break;
                        case 15:
                            currentUser.addToSubscriptionGroup(jSONArray.getString(0));
                            break;
                        case 16:
                            currentUser.unsetCustomUserAttribute(jSONArray.getString(0));
                            break;
                        case 17:
                            currentUser.setEmail(jSONArray.getString(0));
                            break;
                        case 18:
                            currentUser.incrementCustomUserAttribute(jSONArray.getString(0), jSONArray.getInt(1));
                            break;
                        case 19:
                            String string2 = jSONArray.getString(0);
                            string2.hashCode();
                            switch (string2.hashCode()) {
                                case -1219769254:
                                    if (string2.equals("subscribed")) {
                                        c4 = 0;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case -83053070:
                                    if (string2.equals("opted_in")) {
                                        c4 = 1;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 901853107:
                                    break;
                                default:
                                    c4 = 65535;
                                    break;
                            }
                            switch (c4) {
                                case 0:
                                    currentUser.setPushNotificationSubscriptionType(NotificationSubscriptionType.SUBSCRIBED);
                                    break;
                                case 1:
                                    currentUser.setPushNotificationSubscriptionType(NotificationSubscriptionType.OPTED_IN);
                                    break;
                                case 2:
                                    currentUser.setPushNotificationSubscriptionType(NotificationSubscriptionType.UNSUBSCRIBED);
                                    break;
                            }
                        case 20:
                            currentUser.setDateOfBirth(jSONArray.getInt(0), Month.getMonth(jSONArray.getInt(1) - 1), jSONArray.getInt(2));
                            break;
                        case 21:
                            currentUser.setHomeCity(jSONArray.getString(0));
                            break;
                        case 22:
                            currentUser.setFirstName(jSONArray.getString(0));
                            break;
                        case 23:
                            currentUser.setCustomUserAttribute(jSONArray.getString(0), jSONArray.getString(1));
                            break;
                        case 24:
                            currentUser.removeFromCustomAttributeArray(jSONArray.getString(0), jSONArray.getString(1));
                            break;
                    }
                }
                str.hashCode();
                if (!str.equals("launchContentCards")) {
                    if (str.equals("launchNewsFeed")) {
                        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(this.f3354cordova.getActivity(), new Intent(this.mApplicationContext, (Class<?>) BrazeFeedActivity.class));
                        break;
                    } else {
                        str.hashCode();
                        switch (str) {
                            case "getCardCountForCategories":
                            case "getNewsFeed":
                            case "getUnreadCardCountForCategories":
                                break;
                            default:
                                str.hashCode();
                                switch (str.hashCode()) {
                                    case -1925462792:
                                        if (str.equals(GET_CONTENT_CARDS_FROM_CACHE_METHOD)) {
                                            c3 = 0;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -792744658:
                                        if (str.equals(LOG_CONTENT_CARDS_IMPRESSION_METHOD)) {
                                            c3 = 1;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 130003172:
                                        if (str.equals(LOG_CONTENT_CARDS_DISMISSED_METHOD)) {
                                            c3 = 2;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 902416525:
                                        if (str.equals(GET_CONTENT_CARDS_FROM_SERVER_METHOD)) {
                                            c3 = 3;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1562169122:
                                        break;
                                    default:
                                        c3 = 65535;
                                        break;
                                }
                                switch (c3) {
                                    case 0:
                                    case 3:
                                        break;
                                    case 1:
                                    case 2:
                                    case 4:
                                        break;
                                    default:
                                        Log.d(TAG, "Failed to execute for action: " + str);
                                        break;
                                }
                        }
                    }
                } else {
                    safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(this.f3354cordova.getActivity(), new Intent(this.mApplicationContext, (Class<?>) ContentCardsActivity.class));
                    break;
                }
                break;
        }
        return true;
    }

    @Override // org.apache.cordova.CordovaPlugin
    public void onPause(boolean z) {
        super.onPause(z);
        initializePluginIfAppropriate();
        BrazeInAppMessageManager.getInstance().unregisterInAppMessageManager(this.f3354cordova.getActivity());
    }

    @Override // org.apache.cordova.CordovaPlugin
    public void onResume(boolean z) {
        super.onResume(z);
        initializePluginIfAppropriate();
        BrazeInAppMessageManager.getInstance().registerInAppMessageManager(this.f3354cordova.getActivity());
    }

    @Override // org.apache.cordova.CordovaPlugin
    public void onStart() {
        super.onStart();
        initializePluginIfAppropriate();
        if (this.mDisableAutoStartSessions) {
            return;
        }
        Braze.getInstance(this.mApplicationContext).openSession(this.f3354cordova.getActivity());
    }

    @Override // org.apache.cordova.CordovaPlugin
    public void onStop() {
        super.onStop();
        initializePluginIfAppropriate();
        if (this.mDisableAutoStartSessions) {
            return;
        }
        Braze.getInstance(this.mApplicationContext).closeSession(this.f3354cordova.getActivity());
    }

    static void sendBroadcastMessage(HashMap<String, String> hashMap) {
        if (broadcastContextListener != null) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                try {
                    jSONObject.put(entry.getKey(), entry.getValue());
                } catch (JSONException e) {
                    Log.e(TAG, e.getMessage());
                }
            }
            PluginResult pluginResult = new PluginResult(PluginResult.Status.OK, jSONObject);
            pluginResult.setKeepCallback(true);
            broadcastContextListener.sendPluginResult(pluginResult);
            return;
        }
        broadcastMessages.add(hashMap);
    }

    private static void sendBroadcastMessages() {
        if (broadcastContextListener != null) {
            Iterator<HashMap<String, String>> it = broadcastMessages.iterator();
            while (it.hasNext()) {
                sendBroadcastMessage(it.next());
            }
            broadcastMessages.clear();
        }
    }

    private void initializePluginIfAppropriate() {
        if (this.mPluginInitializationFinished) {
            return;
        }
        pluginInitialize();
    }

    private void configureFromCordovaPreferences(CordovaPreferences cordovaPreferences) {
        BrazeLogger.d(TAG, "Setting Cordova preferences: " + cordovaPreferences.getAll());
        if (cordovaPreferences.contains(APPBOY_LOG_LEVEL_PREFERENCE)) {
            BrazeLogger.setLogLevel(cordovaPreferences.getInteger(APPBOY_LOG_LEVEL_PREFERENCE, 4));
        }
        if (cordovaPreferences.getBoolean(DISABLE_AUTO_START_SESSIONS_PREFERENCE, false)) {
            BrazeLogger.d(TAG, "Disabling session auto starts");
            this.mDisableAutoStartSessions = true;
        }
        initializeNotificationStyleAndChannel(this.mApplicationContext, cordovaPreferences);
        BrazeConfig.Builder builder = new BrazeConfig.Builder();
        builder.setSdkFlavor(SdkFlavor.CORDOVA).setSdkMetadata(EnumSet.of(BrazeSdkMetadata.CORDOVA));
        builder.setDefaultNotificationChannelName(NotificationChannelProvider.getChannelName());
        builder.setDefaultNotificationChannelDescription(NotificationChannelProvider.getChannelDescription());
        if (cordovaPreferences.contains(APPBOY_API_KEY_PREFERENCE)) {
            builder.setApiKey(cordovaPreferences.getString(APPBOY_API_KEY_PREFERENCE, null));
        }
        if (cordovaPreferences.contains(SMALL_NOTIFICATION_ICON_PREFERENCE)) {
            builder.setSmallNotificationIcon(cordovaPreferences.getString(SMALL_NOTIFICATION_ICON_PREFERENCE, null));
        }
        if (cordovaPreferences.contains(LARGE_NOTIFICATION_ICON_PREFERENCE)) {
            builder.setLargeNotificationIcon(cordovaPreferences.getString(LARGE_NOTIFICATION_ICON_PREFERENCE, null));
        }
        if (cordovaPreferences.contains(DEFAULT_NOTIFICATION_ACCENT_COLOR_PREFERENCE)) {
            builder.setDefaultNotificationAccentColor(parseNumericPreferenceAsInteger(cordovaPreferences.getString(DEFAULT_NOTIFICATION_ACCENT_COLOR_PREFERENCE, "0")));
        }
        if (cordovaPreferences.contains(DEFAULT_SESSION_TIMEOUT_PREFERENCE)) {
            builder.setSessionTimeout(parseNumericPreferenceAsInteger(cordovaPreferences.getString(DEFAULT_SESSION_TIMEOUT_PREFERENCE, "10")));
        }
        if (cordovaPreferences.contains(SET_HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY_PREFERENCE)) {
            builder.setHandlePushDeepLinksAutomatically(cordovaPreferences.getBoolean(SET_HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY_PREFERENCE, true));
        }
        if (cordovaPreferences.contains(AUTOMATIC_FIREBASE_PUSH_REGISTRATION_ENABLED_PREFERENCE)) {
            builder.setIsFirebaseCloudMessagingRegistrationEnabled(cordovaPreferences.getBoolean(AUTOMATIC_FIREBASE_PUSH_REGISTRATION_ENABLED_PREFERENCE, true));
        }
        if (cordovaPreferences.contains(FCM_SENDER_ID_PREFERENCE)) {
            builder.setFirebaseCloudMessagingSenderIdKey(parseNumericPreferenceAsString(cordovaPreferences.getString(FCM_SENDER_ID_PREFERENCE, null)));
        }
        if (cordovaPreferences.contains(ENABLE_LOCATION_PREFERENCE)) {
            builder.setIsLocationCollectionEnabled(cordovaPreferences.getBoolean(ENABLE_LOCATION_PREFERENCE, false));
        }
        if (cordovaPreferences.contains(ENABLE_GEOFENCES_PREFERENCE)) {
            builder.setGeofencesEnabled(cordovaPreferences.getBoolean(ENABLE_GEOFENCES_PREFERENCE, false));
        }
        if (cordovaPreferences.contains(CUSTOM_API_ENDPOINT_PREFERENCE)) {
            String string = cordovaPreferences.getString(CUSTOM_API_ENDPOINT_PREFERENCE, "");
            if (!string.equals("")) {
                builder.setCustomEndpoint(string);
            }
        }
        boolean z = cordovaPreferences.getBoolean(ENABLE_CORDOVA_WEBVIEW_REQUEST_FOCUS_FIX_PREFERENCE, true);
        if (Build.VERSION.SDK_INT < 28 && z) {
            BrazeInAppMessageManager.getInstance().setCustomInAppMessageViewWrapperFactory(new CordovaInAppMessageViewWrapper.CordovaInAppMessageViewWrapperFactory());
        }
        Braze.configure(this.mApplicationContext, builder.build());
    }

    public static void initializeNotificationStyleAndChannel(Context context, CordovaPreferences cordovaPreferences) {
        if (cordovaPreferences.contains(USE_CUSTOM_LAYOUT) && cordovaPreferences.getBoolean(USE_CUSTOM_LAYOUT, false)) {
            LayoutsChecker.check(context);
            Braze.setCustomBrazeNotificationFactory(new NotificationFactory());
        }
        NotificationChannelProvider.createDefaultNotificationChannelIfNeeded(context, cordovaPreferences.getString(NOTIFICATION_CHANNEL_ID_PREFERENCE, null), cordovaPreferences.getString(NOTIFICATION_CHANNEL_NAME_PREFERENCE, null), cordovaPreferences.getString(NOTIFICATION_CHANNEL_DESCRIPTION_PREFERENCE, null), cordovaPreferences.getString(VIBRATION_PATTERN_PREFERENCE, null));
    }

    private boolean handleNewsFeedGetters(String str, JSONArray jSONArray, final CallbackContext callbackContext) throws JSONException {
        final Braze braze;
        final String callbackId;
        boolean z;
        IEventSubscriber<FeedUpdatedEvent> iEventSubscriber;
        final BrazePlugin brazePlugin;
        IEventSubscriber<FeedUpdatedEvent> iEventSubscriber2;
        braze = Braze.getInstance(this.mApplicationContext);
        callbackId = callbackContext.getCallbackId();
        str.hashCode();
        z = false;
        switch (str) {
            case "getCardCountForCategories":
                final EnumSet<CardCategory> categoriesFromJSONArray = getCategoriesFromJSONArray(jSONArray);
                brazePlugin = this;
                iEventSubscriber = new IEventSubscriber() { // from class: com.appboy.cordova.BrazePlugin$$ExternalSyntheticLambda0
                    @Override // com.braze.events.IEventSubscriber
                    public final void trigger(Object obj) {
                        BrazePlugin.this.lambda$handleNewsFeedGetters$0(callbackContext, categoriesFromJSONArray, braze, callbackId, (FeedUpdatedEvent) obj);
                    }
                };
                iEventSubscriber2 = iEventSubscriber;
                z = true;
                break;
            case "getNewsFeed":
                final EnumSet<CardCategory> categoriesFromJSONArray2 = getCategoriesFromJSONArray(jSONArray);
                brazePlugin = this;
                iEventSubscriber2 = new IEventSubscriber() { // from class: com.appboy.cordova.BrazePlugin$$ExternalSyntheticLambda2
                    @Override // com.braze.events.IEventSubscriber
                    public final void trigger(Object obj) {
                        BrazePlugin.this.lambda$handleNewsFeedGetters$2(callbackContext, categoriesFromJSONArray2, braze, callbackId, (FeedUpdatedEvent) obj);
                    }
                };
                break;
            case "getUnreadCardCountForCategories":
                final EnumSet<CardCategory> categoriesFromJSONArray3 = getCategoriesFromJSONArray(jSONArray);
                brazePlugin = this;
                iEventSubscriber = new IEventSubscriber() { // from class: com.appboy.cordova.BrazePlugin$$ExternalSyntheticLambda1
                    @Override // com.braze.events.IEventSubscriber
                    public final void trigger(Object obj) {
                        BrazePlugin.this.lambda$handleNewsFeedGetters$1(callbackContext, categoriesFromJSONArray3, braze, callbackId, (FeedUpdatedEvent) obj);
                    }
                };
                iEventSubscriber2 = iEventSubscriber;
                z = true;
                break;
            default:
                iEventSubscriber2 = null;
                brazePlugin = this;
                break;
        }
        if (iEventSubscriber2 != null) {
            brazePlugin.mFeedSubscriberMap.put(callbackId, iEventSubscriber2);
            braze.subscribeToFeedUpdates(iEventSubscriber2);
            if (z) {
                braze.requestFeedRefreshFromCache();
            } else {
                braze.requestFeedRefresh();
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleNewsFeedGetters$0(CallbackContext callbackContext, EnumSet enumSet, Braze braze, String str, FeedUpdatedEvent feedUpdatedEvent) {
        if (!callbackContext.isFinished()) {
            callbackContext.success(feedUpdatedEvent.getCardCount((EnumSet<CardCategory>) enumSet));
        }
        braze.removeSingleSubscription(this.mFeedSubscriberMap.get(str), FeedUpdatedEvent.class);
        this.mFeedSubscriberMap.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleNewsFeedGetters$1(CallbackContext callbackContext, EnumSet enumSet, Braze braze, String str, FeedUpdatedEvent feedUpdatedEvent) {
        if (!callbackContext.isFinished()) {
            callbackContext.success(feedUpdatedEvent.getUnreadCardCount((EnumSet<CardCategory>) enumSet));
        }
        braze.removeSingleSubscription(this.mFeedSubscriberMap.get(str), FeedUpdatedEvent.class);
        this.mFeedSubscriberMap.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleNewsFeedGetters$2(CallbackContext callbackContext, EnumSet enumSet, Braze braze, String str, FeedUpdatedEvent feedUpdatedEvent) {
        if (!callbackContext.isFinished()) {
            List<Card> feedCards = feedUpdatedEvent.getFeedCards((EnumSet<CardCategory>) enumSet);
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < feedCards.size(); i++) {
                jSONArray.put(feedCards.get(i).getKey());
            }
            callbackContext.success(jSONArray);
        }
        braze.removeSingleSubscription(this.mFeedSubscriberMap.get(str), FeedUpdatedEvent.class);
        this.mFeedSubscriberMap.remove(str);
    }

    private boolean handleContentCardsUpdateGetters(String str, final CallbackContext callbackContext) {
        Braze.getInstance(this.mApplicationContext).subscribeToContentCardsUpdates(new IEventSubscriber<ContentCardsUpdatedEvent>() { // from class: com.appboy.cordova.BrazePlugin.1
            @Override // com.braze.events.IEventSubscriber
            public void trigger(ContentCardsUpdatedEvent contentCardsUpdatedEvent) {
                Braze.getInstance(BrazePlugin.this.mApplicationContext).removeSingleSubscription(this, ContentCardsUpdatedEvent.class);
                callbackContext.success(ContentCardUtils.mapContentCards(contentCardsUpdatedEvent.getAllCards()));
            }
        });
        Braze.getInstance(this.mApplicationContext).requestContentCardsRefresh(str.equals(GET_CONTENT_CARDS_FROM_CACHE_METHOD));
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        if (r7.equals(com.appboy.cordova.BrazePlugin.LOG_CONTENT_CARDS_IMPRESSION_METHOD) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean handleContentCardsLogMethods(String str, JSONArray jSONArray, CallbackContext callbackContext) {
        Braze braze = Braze.getInstance(this.mApplicationContext);
        char c = 0;
        if (jSONArray.length() != 1) {
            Log.d(TAG, "Cannot handle logging method for " + str + " due to improper number of arguments. Args: " + jSONArray);
            callbackContext.error("Failed for action " + str);
            return false;
        }
        try {
            Card cardById = ContentCardUtils.getCardById(braze.getCachedContentCards(), jSONArray.getString(0));
            if (cardById == null) {
                Log.w(TAG, "Couldn't find card in list of cached cards");
                callbackContext.error("Failed for action " + str);
                return false;
            }
            str.hashCode();
            switch (str.hashCode()) {
                case -792744658:
                    break;
                case 130003172:
                    if (str.equals(LOG_CONTENT_CARDS_DISMISSED_METHOD)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1562169122:
                    if (str.equals(LOG_CONTENT_CARDS_CLICKED_METHOD)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    cardById.logImpression();
                    break;
                case 1:
                    cardById.setDismissed(true);
                    break;
                case 2:
                    cardById.logClick();
                    break;
            }
            callbackContext.success();
            return true;
        } catch (JSONException e) {
            Log.e(TAG, "Failed to parse card id from args: " + jSONArray, e);
            callbackContext.error("Failed for action " + str);
            return false;
        }
    }

    private static EnumSet<CardCategory> getCategoriesFromJSONArray(JSONArray jSONArray) throws JSONException {
        EnumSet<CardCategory> noneOf = EnumSet.noneOf(CardCategory.class);
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            if (string.equals(TtmlNode.COMBINE_ALL)) {
                return CardCategory.getAllCategories();
            }
            CardCategory cardCategory = CardCategory.get(string);
            if (cardCategory != null) {
                noneOf.add(cardCategory);
            } else {
                Log.w(TAG, "Tried to add unknown card category: " + string);
            }
        }
        return noneOf;
    }

    private static String[] parseJSONArrayToStringArray(JSONArray jSONArray) throws JSONException {
        int length = jSONArray.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArray.getString(i);
        }
        return strArr;
    }

    private static String parseNumericPreferenceAsString(String str) {
        if (str == null || !str.startsWith(NUMERIC_PREFERENCE_PREFIX)) {
            return str;
        }
        String substring = str.substring(NUMERIC_PREFERENCE_PREFIX.length(), str.length());
        BrazeLogger.d(TAG, "Parsed numeric preference " + str + " into value: " + substring);
        return substring;
    }

    private static int parseNumericPreferenceAsInteger(String str) {
        if (str != null && str.startsWith(NUMERIC_PREFERENCE_PREFIX)) {
            String substring = str.substring(NUMERIC_PREFERENCE_PREFIX.length(), str.length());
            BrazeLogger.d(TAG, "Parsed numeric preference " + str + " into value: " + substring);
            str = substring;
        }
        return (int) Long.decode(str).longValue();
    }

    private void requestPostNotificationPermission() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f3354cordova.requestPermission(this, 33, "android.permission.POST_NOTIFICATIONS");
        }
    }
}
