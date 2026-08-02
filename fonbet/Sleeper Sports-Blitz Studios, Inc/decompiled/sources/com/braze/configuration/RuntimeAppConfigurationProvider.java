package com.braze.configuration;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.braze.BrazeInternal;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.h0;
import com.braze.storage.i0;
import com.braze.storage.o0;
import com.braze.storage.p0;
import com.braze.storage.r2;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.i;
import com.braze.support.k;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J9\u0010\r\u001a\u00020\f\"\u0010\b\u0000\u0010\u0007*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000b\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001f2\u0006\u0010\u000b\u001a\u00020\u0015¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\u0015¢\u0006\u0004\b\"\u0010#J%\u0010%\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010$\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0007¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00152\b\u0010$\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b'\u0010(J5\u0010*\u001a\u00020\f\"\u0010\b\u0000\u0010\u0007*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R \u0010.\u001a\u00020-8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b.\u0010/\u0012\u0004\b2\u0010\u0014\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/braze/configuration/RuntimeAppConfigurationProvider;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/EnumSet;", "enumSet", "Lcom/braze/enums/DataStoreKey;", SDKConstants.PARAM_KEY, "", "putEnumSet", "(Ljava/util/EnumSet;Lcom/braze/enums/DataStoreKey;)V", "Lcom/braze/configuration/BrazeConfig;", AnalyticsConstantsKt.KEY_CONFIG, "setConfiguration", "(Lcom/braze/configuration/BrazeConfig;)V", "clearAllConfigurationValues", "()V", "", "defaultValue", "getStringValue", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "getIntValue", "(Ljava/lang/String;I)I", "", "getBooleanValue", "(Ljava/lang/String;Z)Z", "", "getStringSetValue", "(Ljava/lang/String;)Ljava/util/Set;", "containsKey", "(Ljava/lang/String;)Z", "value", "putEnumAsString", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/Enum;)V", "writeString", "(Ljava/lang/String;Ljava/lang/String;)V", "updateValue", "updateEnumSetData", "(Lcom/braze/enums/DataStoreKey;Ljava/util/EnumSet;)V", "Landroid/content/Context;", "Lcom/braze/storage/r2;", "configDataStoreProvider", "Lcom/braze/storage/r2;", "getConfigDataStoreProvider$android_sdk_base_release", "()Lcom/braze/storage/r2;", "getConfigDataStoreProvider$android_sdk_base_release$annotations", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RuntimeAppConfigurationProvider {
    private final r2 configDataStoreProvider;
    private final Context context;

    public RuntimeAppConfigurationProvider(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.configDataStoreProvider = new r2(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String clearAllConfigurationValues$lambda$44() {
        return "Clearing Braze Override configuration cache";
    }

    public static /* synthetic */ void getConfigDataStoreProvider$android_sdk_base_release$annotations() {
    }

    private final <T extends Enum<T>> void putEnumSet(EnumSet<T> enumSet, DataStoreKey key) {
        String str;
        if (enumSet == null) {
            return;
        }
        Set a2 = k.a(enumSet);
        r2 r2Var = this.configDataStoreProvider;
        List list = CollectionsKt.toList(a2);
        if (key.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new o0(key), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Companion companion = Json.INSTANCE;
                companion.getSerializersModule();
                str = companion.encodeToString(new ArrayListSerializer(StringSerializer.INSTANCE), list);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) i.f781a, 4, (Object) null);
                str = (!(list instanceof Map) && (list instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
            }
            r2Var.writeData(key, str);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new p0(key), 8, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setConfiguration$lambda$0(BrazeConfig brazeConfig) {
        return "Setting Braze Override configuration with config: " + brazeConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String writeString$lambda$52(String str, String str2) {
        return "DataStoreKey:" + str + " not found. Not storing value:" + str2;
    }

    public final void clearAllConfigurationValues() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.configuration.RuntimeAppConfigurationProvider$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String clearAllConfigurationValues$lambda$44;
                clearAllConfigurationValues$lambda$44 = RuntimeAppConfigurationProvider.clearAllConfigurationValues$lambda$44();
                return clearAllConfigurationValues$lambda$44;
            }
        }, 7, (Object) null);
        this.configDataStoreProvider.clearAllData();
    }

    public final boolean containsKey(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        DataStoreKey a2 = DataStoreKey.Companion.a(key);
        if (a2 != null) {
            return this.configDataStoreProvider.contains(a2);
        }
        return false;
    }

    public final boolean getBooleanValue(String key, boolean defaultValue) {
        Boolean readBoolean;
        Intrinsics.checkNotNullParameter(key, "key");
        DataStoreKey a2 = DataStoreKey.Companion.a(key);
        return (a2 == null || (readBoolean = this.configDataStoreProvider.readBoolean(a2, Boolean.valueOf(defaultValue))) == null) ? defaultValue : readBoolean.booleanValue();
    }

    /* renamed from: getConfigDataStoreProvider$android_sdk_base_release, reason: from getter */
    public final r2 getConfigDataStoreProvider() {
        return this.configDataStoreProvider;
    }

    public final int getIntValue(String key, int defaultValue) {
        Integer readInt;
        Intrinsics.checkNotNullParameter(key, "key");
        DataStoreKey a2 = DataStoreKey.Companion.a(key);
        return (a2 == null || (readInt = this.configDataStoreProvider.readInt(a2, Integer.valueOf(defaultValue))) == null) ? defaultValue : readInt.intValue();
    }

    public final Set<String> getStringSetValue(String key) {
        Iterable arrayList;
        List emptyList;
        Intrinsics.checkNotNullParameter(key, "key");
        DataStoreKey a2 = DataStoreKey.Companion.a(key);
        if (a2 != null) {
            r2 r2Var = this.configDataStoreProvider;
            if (a2.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new h0(a2), 12, (Object) null);
                arrayList = new ArrayList();
            } else {
                try {
                    Object readData = r2Var.readData(a2, "");
                    Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) readData;
                    if (StringsKt.isBlank(str)) {
                        arrayList = new ArrayList();
                    } else {
                        DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                        if (StringsKt.isBlank(str)) {
                            emptyList = CollectionsKt.emptyList();
                        } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str).toString(), AbstractJsonLexerKt.NULL)) {
                            emptyList = CollectionsKt.emptyList();
                        } else {
                            try {
                                Json.Companion companion = Json.INSTANCE;
                                companion.getSerializersModule();
                                emptyList = (List) companion.decodeFromString(new ArrayListSerializer(StringSerializer.INSTANCE), str);
                            } catch (Exception e) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new com.braze.support.e(str), 4, (Object) null);
                                emptyList = CollectionsKt.emptyList();
                            }
                        }
                        arrayList = CollectionsKt.toMutableList((Collection) emptyList);
                    }
                } catch (Exception e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new i0(a2), 8, (Object) null);
                    arrayList = new ArrayList();
                }
            }
            if (arrayList != null) {
                return CollectionsKt.toMutableSet(arrayList);
            }
        }
        return null;
    }

    public final String getStringValue(String key, String defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        DataStoreKey a2 = DataStoreKey.Companion.a(key);
        if (a2 != null) {
            return this.configDataStoreProvider.readString(a2, defaultValue);
        }
        return null;
    }

    public final void putEnumAsString(DataStoreKey key, Enum<?> value) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (value != null) {
            this.configDataStoreProvider.writeData(key, value.toString());
        }
    }

    public final void setConfiguration(final BrazeConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.configuration.RuntimeAppConfigurationProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String configuration$lambda$0;
                configuration$lambda$0 = RuntimeAppConfigurationProvider.setConfiguration$lambda$0(BrazeConfig.this);
                return configuration$lambda$0;
            }
        }, 6, (Object) null);
        String str = config.apiKey;
        if (str != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.API_KEY, str);
        }
        String str2 = config.serverTarget;
        if (str2 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.SERVER_TARGET, str2);
        }
        putEnumAsString(DataStoreKey.SDK_FLAVOR, config.sdkFlavor);
        String str3 = config.customEndpoint;
        if (str3 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.CUSTOM_ENDPOINT, str3);
        }
        String str4 = config.smallNotificationIcon;
        if (str4 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.SMALL_NOTIFICATION_ICON, str4);
        }
        String str5 = config.largeNotificationIcon;
        if (str5 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.LARGE_NOTIFICATION_ICON, str5);
        }
        Integer num = config.sessionTimeout;
        if (num != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.SESSION_TIMEOUT, Integer.valueOf(num.intValue()));
        }
        Integer num2 = config.defaultNotificationAccentColor;
        if (num2 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.DEFAULT_NOTIFICATION_ACCENT_COLOR, Integer.valueOf(num2.intValue()));
        }
        Integer num3 = config.triggerActionMinimumTimeIntervalSeconds;
        if (num3 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_SECONDS, Integer.valueOf(num3.intValue()));
        }
        Boolean bool = config.isAdmMessagingRegistrationEnabled;
        if (bool != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.ADM_MESSAGING_REGISTRATION_ENABLED, bool);
        }
        Boolean bool2 = config.willHandlePushDeepLinksAutomatically;
        if (bool2 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY, bool2);
        }
        Boolean bool3 = config.isAutomaticLocationCollectionEnabled;
        if (bool3 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.AUTOMATIC_LOCATION_COLLECTION, bool3);
        }
        Integer num4 = config.badNetworkInterval;
        if (num4 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.DATA_SYNC_BAD_NETWORK_INTERVAL, Integer.valueOf(num4.intValue()));
        }
        Integer num5 = config.goodNetworkInterval;
        if (num5 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.DATA_SYNC_GOOD_NETWORK_INTERVAL, Integer.valueOf(num5.intValue()));
        }
        Integer num6 = config.greatNetworkInterval;
        if (num6 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.DATA_SYNC_GREAT_NETWORK_INTERVAL, Integer.valueOf(num6.intValue()));
        }
        String str6 = config.defaultNotificationChannelName;
        if (str6 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.DEFAULT_NOTIFICATION_CHANNEL_NAME, str6);
        }
        String str7 = config.defaultNotificationChannelDescription;
        if (str7 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION, str7);
        }
        Boolean bool4 = config.isPushDeepLinkBackStackActivityEnabled;
        if (bool4 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED, bool4);
        }
        String str8 = config.pushDeepLinkBackStackActivityClassName;
        if (str8 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME, str8);
        }
        Boolean bool5 = config.isSessionStartBasedTimeoutEnabled;
        if (bool5 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.SESSION_START_BASED_TIMEOUT_ENABLED, bool5);
        }
        Boolean bool6 = config.isFirebaseCloudMessagingRegistrationEnabled;
        if (bool6 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED, bool6);
        }
        String str9 = config.firebaseCloudMessagingSenderIdKey;
        if (str9 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.FIREBASE_CLOUD_MESSAGING_SENDER_ID, str9);
        }
        Boolean bool7 = config.isContentCardsUnreadVisualIndicatorEnabled;
        if (bool7 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED, bool7);
        }
        Boolean bool8 = config.isDeviceObjectAllowlistEnabled;
        if (bool8 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.DEVICE_OBJECT_ALLOWLISTING_ENABLED, bool8);
        }
        Boolean bool9 = config.isInAppMessageAccessibilityExclusiveModeEnabled;
        if (bool9 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED, bool9);
        }
        Boolean bool10 = config.isPushWakeScreenForNotificationEnabled;
        if (bool10 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED, bool10);
        }
        Boolean bool11 = config.isPushHtmlRenderingEnabled;
        if (bool11 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.PUSH_NOTIFICATION_HTML_RENDERING_ENABLED, bool11);
        }
        Boolean bool12 = config.doesPushStoryDismissOnClick;
        if (bool12 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.DOES_PUSH_STORY_DISMISS_ON_CLICK, bool12);
        }
        Boolean bool13 = config.areGeofencesEnabled;
        if (bool13 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.GEOFENCES_ENABLED_CONFIG, bool13);
        }
        Boolean bool14 = config.isInAppMessageTestPushEagerDisplayEnabled;
        if (bool14 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY, bool14);
        }
        String str10 = config.customHtmlWebViewActivityClassName;
        if (str10 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME, str10);
        }
        Boolean bool15 = config.areAutomaticGeofenceRequestsEnabled;
        if (bool15 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.GEOFENCES_AUTOMATIC_REQUESTS_ENABLED, bool15);
        }
        Integer num7 = config.inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
        if (num7 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT, Integer.valueOf(num7.intValue()));
        }
        Boolean bool16 = config.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
        if (bool16 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.FIREBASE_MESSAGING_SERVICE_AUTOMATICALLY_REGISTER_ON_NEW_TOKEN, bool16);
        }
        Boolean bool17 = config.isSdkAuthEnabled;
        if (bool17 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.SDK_AUTH_ENABLED, bool17);
        }
        Boolean bool18 = config.isTouchModeRequiredForHtmlInAppMessages;
        if (bool18 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.REQUIRE_TOUCH_MODE_FOR_HTML_IAMS, bool18);
        }
        Boolean bool19 = config.isHtmlInAppMessageHtmlLinkTargetEnabled;
        if (bool19 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.HTML_IN_APP_MESSAGE_ENABLE_HTML_LINK_TARGET, bool19);
        }
        putEnumSet(config.deviceObjectAllowlist, DataStoreKey.DEVICE_OBJECT_ALLOWLIST);
        putEnumSet(config.customLocationProviderNames, DataStoreKey.CUSTOM_LOCATION_PROVIDERS_LIST);
        EnumSet<BrazeSdkMetadata> enumSet = config.brazeSdkMetadata;
        if (enumSet != null) {
            updateEnumSetData(DataStoreKey.SDK_METADATA_CONFIG, enumSet);
        }
        Boolean bool20 = config.isFallbackFirebaseMessagingServiceEnabled;
        if (bool20 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.FALLBACK_FCM_SERVICE_ENABLED, bool20);
        }
        String str11 = config.fallbackFirebaseMessagingServiceClasspath;
        if (str11 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.FALLBACK_FCM_SERVICE_CLASSPATH, str11);
        }
        Boolean bool21 = config.shouldOptInWhenPushAuthorized;
        if (bool21 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.OPTIN_WHEN_PUSH_AUTHORIZED, bool21);
        }
        Boolean bool22 = config.shouldUseWindowFlagSecureInActivities;
        if (bool22 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.USE_WINDOW_FLAG_SECURE_IN_ACTIVITIES, bool22);
        }
        Boolean bool23 = config.shouldPersistWebViewWhenBackgroundingApp;
        if (bool23 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.PERSIST_IAM_WEBVIEW_WHEN_BACKGROUNDING_APP, bool23);
        }
        Boolean bool24 = config.shouldAddStatusBarPaddingToInAppMessages;
        if (bool24 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.IN_APP_MESSAGE_ADD_STATUS_BAR_PADDING, bool24);
        }
        BrazeInternal.INSTANCE.getConfigurationProvider(this.context).resetCache$android_sdk_base_release();
    }

    public final <T extends Enum<T>> void updateEnumSetData(DataStoreKey key, EnumSet<T> updateValue) {
        Iterable arrayList;
        List emptyList;
        String str;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(updateValue, "updateValue");
        r2 r2Var = this.configDataStoreProvider;
        if (key.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new h0(key), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object readData = r2Var.readData(key, "");
                Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
                String str2 = (String) readData;
                if (StringsKt.isBlank(str2)) {
                    arrayList = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (StringsKt.isBlank(str2)) {
                        emptyList = CollectionsKt.emptyList();
                    } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str2).toString(), AbstractJsonLexerKt.NULL)) {
                        emptyList = CollectionsKt.emptyList();
                    } else {
                        try {
                            Json.Companion companion = Json.INSTANCE;
                            companion.getSerializersModule();
                            emptyList = (List) companion.decodeFromString(new ArrayListSerializer(StringSerializer.INSTANCE), str2);
                        } catch (Exception e) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new com.braze.support.e(str2), 4, (Object) null);
                            emptyList = CollectionsKt.emptyList();
                        }
                    }
                    arrayList = CollectionsKt.toMutableList((Collection) emptyList);
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new i0(key), 8, (Object) null);
                arrayList = new ArrayList();
            }
        }
        Set mutableSet = CollectionsKt.toMutableSet(arrayList);
        mutableSet.addAll(k.a(updateValue));
        r2 r2Var2 = this.configDataStoreProvider;
        List list = CollectionsKt.toList(mutableSet);
        if (key.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new o0(key), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
            try {
                Json.Companion companion2 = Json.INSTANCE;
                companion2.getSerializersModule();
                str = companion2.encodeToString(new ArrayListSerializer(StringSerializer.INSTANCE), list);
            } catch (Exception e3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) i.f781a, 4, (Object) null);
                str = (!(list instanceof Map) && (list instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
            }
            r2Var2.writeData(key, str);
        } catch (Exception e4) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) new p0(key), 8, (Object) null);
        }
    }

    public final void writeString(final String key, final String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        DataStoreKey a2 = DataStoreKey.Companion.a(key);
        if (a2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.configuration.RuntimeAppConfigurationProvider$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String writeString$lambda$52;
                    writeString$lambda$52 = RuntimeAppConfigurationProvider.writeString$lambda$52(key, value);
                    return writeString$lambda$52;
                }
            }, 6, (Object) null);
        } else if (value != null) {
            this.configDataStoreProvider.writeData(a2, value);
        }
    }
}
