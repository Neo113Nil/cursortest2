package io.radar.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import io.radar.sdk.Radar;
import io.radar.sdk.RadarTrackingOptions;
import io.radar.sdk.model.RadarSdkConfiguration;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: RadarSettings.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b3\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000407H\u0000¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020;2\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0002\b<J\u0015\u0010=\u001a\u00020;2\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0002\b>J\u000e\u0010?\u001a\u00020@2\u0006\u00104\u001a\u000205J\u0017\u0010A\u001a\u0004\u0018\u00010\u00042\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0002\bBJ\u0015\u0010C\u001a\u00020D2\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0002\bEJ\u0015\u0010F\u001a\u00020;2\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0002\bGJ\u0015\u0010H\u001a\u00020\u00042\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0002\bIJ\u0017\u0010J\u001a\u0004\u0018\u00010\u00042\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0002\bKJ\u0015\u0010L\u001a\u00020\u00042\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0002\bMJ\u0015\u0010N\u001a\u00020O2\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0002\bPJ\u0015\u0010Q\u001a\u00020O2\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0002\bRJ\u0017\u0010S\u001a\u0004\u0018\u00010\u00042\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0002\bTJ\u0015\u0010U\u001a\u00020V2\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0002\bWJ\u0017\u0010X\u001a\u0004\u0018\u00010@2\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0002\bYJ\u0017\u0010Z\u001a\u0004\u0018\u00010[2\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0002\b\\J\u0015\u0010]\u001a\u00020;2\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0002\b^J\u0017\u0010_\u001a\u0004\u0018\u00010`2\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0002\baJ\u0017\u0010b\u001a\u0004\u0018\u00010\u00042\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0002\bcJ\u0017\u0010d\u001a\u0004\u0018\u00010\u00042\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0002\beJ\u0017\u0010f\u001a\u0004\u0018\u00010`2\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0002\bgJ\u000e\u0010h\u001a\u00020i2\u0006\u00104\u001a\u000205J\u0015\u0010j\u001a\u00020\u00042\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0002\bkJ\u0010\u0010l\u001a\u0002012\u0006\u00104\u001a\u000205H\u0002J\u0015\u0010m\u001a\u00020;2\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0002\bnJ\u001f\u0010o\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001072\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0004\bp\u0010qJ\u0015\u0010r\u001a\u00020;2\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0002\bsJ\u0015\u0010t\u001a\u00020`2\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0002\buJ\u0018\u0010v\u001a\u00020`2\u0006\u00104\u001a\u0002052\u0006\u0010w\u001a\u00020\u0004H\u0002J\u0017\u0010x\u001a\u0004\u0018\u00010y2\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0002\bzJ\u0015\u0010{\u001a\u00020;2\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0002\b|J\u0017\u0010}\u001a\u0004\u0018\u00010\u00042\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0002\b~J\u0016\u0010\u007f\u001a\u00020\u00042\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0003\b\u0080\u0001J\u0019\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00042\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0003\b\u0082\u0001J\u0019\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00042\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0003\b\u0084\u0001J\u0017\u0010\u0085\u0001\u001a\u00020;2\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0003\b\u0086\u0001J\u0017\u0010\u0087\u0001\u001a\u0002032\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0003\b\u0088\u0001J\u0017\u0010\u0089\u0001\u001a\u0002032\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0003\b\u008a\u0001J'\u0010\u008b\u0001\u001a\u0002032\u0006\u00104\u001a\u0002052\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000407H\u0000¢\u0006\u0005\b\u008c\u0001\u00109J \u0010\u008d\u0001\u001a\u0002032\u0006\u00104\u001a\u0002052\u0007\u0010\u008e\u0001\u001a\u00020;H\u0000¢\u0006\u0003\b\u008f\u0001J \u0010\u0090\u0001\u001a\u0002032\u0006\u00104\u001a\u0002052\u0007\u0010\u008e\u0001\u001a\u00020;H\u0000¢\u0006\u0003\b\u0091\u0001J\u001a\u0010\u0092\u0001\u001a\u0002032\u0006\u00104\u001a\u0002052\t\u0010\u0093\u0001\u001a\u0004\u0018\u00010@J\u000f\u0010\u0094\u0001\u001a\u0002032\u0006\u00104\u001a\u000205J\"\u0010\u0095\u0001\u001a\u0002032\u0006\u00104\u001a\u0002052\t\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0003\b\u0097\u0001J \u0010\u0098\u0001\u001a\u0002032\u0006\u00104\u001a\u0002052\u0007\u0010\u0099\u0001\u001a\u00020DH\u0000¢\u0006\u0003\b\u009a\u0001J \u0010\u009b\u0001\u001a\u0002032\u0006\u00104\u001a\u0002052\u0007\u0010\u008e\u0001\u001a\u00020;H\u0000¢\u0006\u0003\b\u009c\u0001J\"\u0010\u009d\u0001\u001a\u0002032\u0006\u00104\u001a\u0002052\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0003\b\u009f\u0001J!\u0010 \u0001\u001a\u0002032\u0006\u00104\u001a\u0002052\b\u0010¡\u0001\u001a\u00030¢\u0001H\u0000¢\u0006\u0003\b£\u0001J \u0010¤\u0001\u001a\u0002032\u0006\u00104\u001a\u0002052\u0007\u0010¥\u0001\u001a\u00020VH\u0000¢\u0006\u0003\b¦\u0001J\"\u0010§\u0001\u001a\u0002032\u0006\u00104\u001a\u0002052\t\u0010¨\u0001\u001a\u0004\u0018\u00010@H\u0000¢\u0006\u0003\b©\u0001J \u0010ª\u0001\u001a\u0002032\u0006\u00104\u001a\u0002052\u0007\u0010«\u0001\u001a\u00020[H\u0000¢\u0006\u0003\b¬\u0001J \u0010\u00ad\u0001\u001a\u0002032\u0006\u00104\u001a\u0002052\u0007\u0010®\u0001\u001a\u00020;H\u0000¢\u0006\u0003\b¯\u0001J \u0010°\u0001\u001a\u0002032\u0006\u00104\u001a\u0002052\u0007\u0010±\u0001\u001a\u00020`H\u0000¢\u0006\u0003\b²\u0001J\"\u0010³\u0001\u001a\u0002032\u0006\u00104\u001a\u0002052\t\u0010´\u0001\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0003\bµ\u0001J\"\u0010¶\u0001\u001a\u0002032\u0006\u00104\u001a\u0002052\t\u0010·\u0001\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0003\b¸\u0001J \u0010¹\u0001\u001a\u0002032\u0006\u00104\u001a\u0002052\u0007\u0010±\u0001\u001a\u00020`H\u0000¢\u0006\u0003\bº\u0001J\u001a\u0010»\u0001\u001a\u0002032\u0006\u00104\u001a\u0002052\t\u0010¼\u0001\u001a\u0004\u0018\u00010iJ \u0010½\u0001\u001a\u0002032\u0006\u00104\u001a\u0002052\u0007\u0010¾\u0001\u001a\u00020;H\u0000¢\u0006\u0003\b¿\u0001J'\u0010À\u0001\u001a\u0002032\u0006\u00104\u001a\u0002052\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000407H\u0000¢\u0006\u0005\bÁ\u0001\u00109J \u0010Â\u0001\u001a\u0002032\u0006\u00104\u001a\u0002052\u0007\u0010Ã\u0001\u001a\u00020;H\u0000¢\u0006\u0003\bÄ\u0001J \u0010Å\u0001\u001a\u0002032\u0006\u00104\u001a\u0002052\u0007\u0010±\u0001\u001a\u00020`H\u0000¢\u0006\u0003\bÆ\u0001J\"\u0010Ç\u0001\u001a\u0002032\u0006\u00104\u001a\u0002052\t\u0010±\u0001\u001a\u0004\u0018\u00010yH\u0000¢\u0006\u0003\bÈ\u0001J \u0010É\u0001\u001a\u0002032\u0006\u00104\u001a\u0002052\u0007\u0010Ê\u0001\u001a\u00020;H\u0000¢\u0006\u0003\bË\u0001J\"\u0010Ì\u0001\u001a\u0002032\u0006\u00104\u001a\u0002052\t\u0010Í\u0001\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0003\bÎ\u0001J\u0017\u0010Ï\u0001\u001a\u0002032\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0003\bÐ\u0001J\u0017\u0010Ñ\u0001\u001a\u0002032\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0003\bÒ\u0001J\u0017\u0010Ó\u0001\u001a\u00020;2\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0003\bÔ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R(\u0010+\u001a\u0004\u0018\u00010\u00042\b\u0010*\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u000e\u00100\u001a\u000201X\u0082.¢\u0006\u0002\n\u0000¨\u0006Õ\u0001"}, d2 = {"Lio/radar/sdk/RadarSettings;", "", "()V", "KEY_AD_ID_ENABLED", "", "KEY_ANONYMOUS", "KEY_CLIENT_SDK_CONFIGURATION", "KEY_DESCRIPTION", "KEY_FOREGROUND_SERVICE", "KEY_FRAUD_ENABLED", "KEY_HOST", "KEY_ID", "KEY_INSTALL_ID", "KEY_LAST_APP_OPEN_TIME", "KEY_LAST_TRACKED_TIME", "KEY_LOCATION_SERVICES_PROVIDER", "KEY_LOG_LEVEL", "KEY_METADATA", "KEY_NOTIFICATION_OPTIONS", "KEY_OLD_OFFLINE_MODE", "KEY_OLD_SYNC_MODE", "KEY_OLD_UPDATE_INTERVAL", "KEY_OLD_UPDATE_INTERVAL_RESPONSIVE", "", "KEY_PERMISSIONS_DENIED", "KEY_PREVIOUS_TRACKING_OPTIONS", "KEY_PRODUCT", "KEY_PUBLISHABLE_KEY", "KEY_PUSH_NOTIFICATION_TOKEN", "KEY_REMOTE_TRACKING_OPTIONS", "KEY_SDK_CONFIGURATION", "KEY_SESSION_ID", "KEY_SHARING", "KEY_TRACKING", "KEY_TRACKING_OPTIONS", "KEY_TRIP_OPTIONS", "KEY_USER_DEBUG", "KEY_USER_ID", "KEY_USER_TAGS", "KEY_VERIFIED_HOST", "KEY_X_PLATFORM_SDK_TYPE", "KEY_X_PLATFORM_SDK_VERSION", "value", RadarSettings.KEY_PUSH_NOTIFICATION_TOKEN, "getPushNotificationToken", "()Ljava/lang/String;", "setPushNotificationToken", "(Ljava/lang/String;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "addTags", "", "context", "Landroid/content/Context;", "tags", "", "addTags$sdk_release", "(Landroid/content/Context;[Ljava/lang/String;)V", "getAdIdEnabled", "", "getAdIdEnabled$sdk_release", "getAnonymousTrackingEnabled", "getAnonymousTrackingEnabled$sdk_release", "getClientSdkConfiguration", "Lorg/json/JSONObject;", "getDescription", "getDescription$sdk_release", "getForegroundService", "Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsForegroundService;", "getForegroundService$sdk_release", "getFraudEnabled", "getFraudEnabled$sdk_release", "getHost", "getHost$sdk_release", "getId", "getId$sdk_release", "getInstallId", "getInstallId$sdk_release", "getLastAppOpenTimeMillis", "", "getLastAppOpenTimeMillis$sdk_release", "getLastTrackedTime", "getLastTrackedTime$sdk_release", "getLocationServicesProvider", "getLocationServicesProvider$sdk_release", "getLogLevel", "Lio/radar/sdk/Radar$RadarLogLevel;", "getLogLevel$sdk_release", "getMetadata", "getMetadata$sdk_release", "getNotificationOptions", "Lio/radar/sdk/RadarNotificationOptions;", "getNotificationOptions$sdk_release", "getPermissionsDenied", "getPermissionsDenied$sdk_release", "getPreviousTrackingOptions", "Lio/radar/sdk/RadarTrackingOptions;", "getPreviousTrackingOptions$sdk_release", "getProduct", "getProduct$sdk_release", "getPublishableKey", "getPublishableKey$sdk_release", "getRemoteTrackingOptions", "getRemoteTrackingOptions$sdk_release", "getSdkConfiguration", "Lio/radar/sdk/model/RadarSdkConfiguration;", "getSessionId", "getSessionId$sdk_release", "getSharedPreferences", "getSharing", "getSharing$sdk_release", "getTags", "getTags$sdk_release", "(Landroid/content/Context;)[Ljava/lang/String;", "getTracking", "getTracking$sdk_release", "getTrackingOptions", "getTrackingOptions$sdk_release", "getTrackingOptionsByKey", SDKConstants.PARAM_KEY, "getTripOptions", "Lio/radar/sdk/RadarTripOptions;", "getTripOptions$sdk_release", "getUserDebug", "getUserDebug$sdk_release", "getUserId", "getUserId$sdk_release", "getVerifiedHost", "getVerifiedHost$sdk_release", "getXPlatformSDKType", "getXPlatformSDKType$sdk_release", "getXPlatformSDKVersion", "getXPlatformSDKVersion$sdk_release", "isXPlatform", "isXPlatform$sdk_release", "removePreviousTrackingOptions", "removePreviousTrackingOptions$sdk_release", "removeRemoteTrackingOptions", "removeRemoteTrackingOptions$sdk_release", "removeTags", "removeTags$sdk_release", "setAdIdEnabled", "enabled", "setAdIdEnabled$sdk_release", "setAnonymousTrackingEnabled", "setAnonymousTrackingEnabled$sdk_release", "setClientSdkConfiguration", "sdkConfiguration", "setContext", "setDescription", "description", "setDescription$sdk_release", "setForegroundService", "foregroundService", "setForegroundService$sdk_release", "setFraudEnabled", "setFraudEnabled$sdk_release", "setId", "_id", "setId$sdk_release", "setLocationServicesProvider", RadarSettings.KEY_LOCATION_SERVICES_PROVIDER, "Lio/radar/sdk/Radar$RadarLocationServicesProvider;", "setLocationServicesProvider$sdk_release", "setLogLevel", "level", "setLogLevel$sdk_release", "setMetadata", "metadata", "setMetadata$sdk_release", "setNotificationOptions", "notificationOptions", "setNotificationOptions$sdk_release", "setPermissionsDenied", "denied", "setPermissionsDenied$sdk_release", "setPreviousTrackingOptions", "options", "setPreviousTrackingOptions$sdk_release", "setProduct", RadarSettings.KEY_PRODUCT, "setProduct$sdk_release", "setPublishableKey", "publishableKey", "setPublishableKey$sdk_release", "setRemoteTrackingOptions", "setRemoteTrackingOptions$sdk_release", "setSdkConfiguration", "configuration", "setSharing", RadarSettings.KEY_SHARING, "setSharing$sdk_release", "setTags", "setTags$sdk_release", "setTracking", "tracking", "setTracking$sdk_release", "setTrackingOptions", "setTrackingOptions$sdk_release", "setTripOptions", "setTripOptions$sdk_release", "setUserDebug", "userDebug", "setUserDebug$sdk_release", "setUserId", "userId", "setUserId$sdk_release", "updateLastAppOpenTimeMillis", "updateLastAppOpenTimeMillis$sdk_release", "updateLastTrackedTime", "updateLastTrackedTime$sdk_release", "updateSessionId", "updateSessionId$sdk_release", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarSettings {
    public static final RadarSettings INSTANCE = new RadarSettings();
    private static final String KEY_AD_ID_ENABLED = "ad_id_enabled";
    private static final String KEY_ANONYMOUS = "anonymous";
    private static final String KEY_CLIENT_SDK_CONFIGURATION = "client_sdk_configuration";
    private static final String KEY_DESCRIPTION = "user_description";
    private static final String KEY_FOREGROUND_SERVICE = "foreground_service";
    private static final String KEY_FRAUD_ENABLED = "fraudEnabled";
    private static final String KEY_HOST = "host";
    private static final String KEY_ID = "radar_user_id";
    private static final String KEY_INSTALL_ID = "install_id";
    private static final String KEY_LAST_APP_OPEN_TIME = "last_app_open_time";
    private static final String KEY_LAST_TRACKED_TIME = "last_tracked_time";
    private static final String KEY_LOCATION_SERVICES_PROVIDER = "provider";
    private static final String KEY_LOG_LEVEL = "log_level";
    private static final String KEY_METADATA = "user_metadata";
    private static final String KEY_NOTIFICATION_OPTIONS = "notification_options";
    private static final String KEY_OLD_OFFLINE_MODE = "offline_mode";
    private static final String KEY_OLD_SYNC_MODE = "sync_mode";
    private static final String KEY_OLD_UPDATE_INTERVAL = "dwell_delay";
    private static final int KEY_OLD_UPDATE_INTERVAL_RESPONSIVE = 60000;
    private static final String KEY_PERMISSIONS_DENIED = "permissions_denied";
    private static final String KEY_PREVIOUS_TRACKING_OPTIONS = "previous_tracking_options";
    private static final String KEY_PRODUCT = "product";
    private static final String KEY_PUBLISHABLE_KEY = "publishable_key";
    private static final String KEY_PUSH_NOTIFICATION_TOKEN = "pushNotificationToken";
    private static final String KEY_REMOTE_TRACKING_OPTIONS = "remote_tracking_options";
    private static final String KEY_SDK_CONFIGURATION = "sdk_configuration";
    private static final String KEY_SESSION_ID = "session_id";
    private static final String KEY_SHARING = "sharing";
    private static final String KEY_TRACKING = "background_tracking";
    private static final String KEY_TRACKING_OPTIONS = "tracking_options";
    private static final String KEY_TRIP_OPTIONS = "trip_options";
    private static final String KEY_USER_DEBUG = "user_debug";
    private static final String KEY_USER_ID = "user_id";
    private static final String KEY_USER_TAGS = "user_tags";
    private static final String KEY_VERIFIED_HOST = "verified_host";
    private static final String KEY_X_PLATFORM_SDK_TYPE = "x_platform_sdk_type";
    private static final String KEY_X_PLATFORM_SDK_VERSION = "x_platform_sdk_version";
    private static SharedPreferences sharedPreferences;

    private RadarSettings() {
    }

    private final SharedPreferences getSharedPreferences(Context context) {
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("RadarSDK", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "getSharedPreferences(...)");
        return sharedPreferences2;
    }

    public final String getPublishableKey$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getSharedPreferences(context).getString(KEY_PUBLISHABLE_KEY, null);
    }

    public final void setPublishableKey$sdk_release(Context context, String publishableKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString(KEY_PUBLISHABLE_KEY, publishableKey);
        editor.apply();
    }

    public final String getLocationServicesProvider$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getSharedPreferences(context).getString(KEY_LOCATION_SERVICES_PROVIDER, null);
    }

    public final void setLocationServicesProvider$sdk_release(Context context, Radar.RadarLocationServicesProvider provider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(provider, "provider");
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString(KEY_LOCATION_SERVICES_PROVIDER, provider.name());
        editor.apply();
    }

    public final String getInstallId$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = getSharedPreferences(context).getString(KEY_INSTALL_ID, null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString(KEY_INSTALL_ID, uuid);
        editor.apply();
        return uuid;
    }

    public final String getSessionId$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String format = new DecimalFormat("#").format(getSharedPreferences(context).getLong("session_id", 0L));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public final boolean updateSessionId$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        long j = getSharedPreferences(context).getLong("session_id", 0L);
        if (getSdkConfiguration(context).getExtendFlushReplays()) {
            RadarLogger.d$default(Radar.INSTANCE.getLogger$sdk_release(), "Flushing replays from updateSessionId()", null, null, 6, null);
            Radar.flushReplays$sdk_release$default(null, null, 3, null);
        }
        if (currentTimeMillis - j <= 300) {
            return false;
        }
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putLong("session_id", currentTimeMillis);
        editor.apply();
        Radar.INSTANCE.logOpenedAppConversion$sdk_release();
        RadarLogger.d$default(Radar.INSTANCE.getLogger$sdk_release(), "New session | sessionId = " + getSessionId$sdk_release(context), null, null, 6, null);
        setSharing$sdk_release(context, false);
        return true;
    }

    public final String getId$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getSharedPreferences(context).getString(KEY_ID, null);
    }

    public final void setId$sdk_release(Context context, String _id) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString(KEY_ID, _id);
        editor.apply();
    }

    public final String getUserId$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getSharedPreferences(context).getString("user_id", null);
    }

    public final void setUserId$sdk_release(Context context, String userId) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString("user_id", userId);
        editor.apply();
    }

    public final String getDescription$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getSharedPreferences(context).getString(KEY_DESCRIPTION, null);
    }

    public final void setDescription$sdk_release(Context context, String description) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString(KEY_DESCRIPTION, description);
        editor.apply();
    }

    public final String getProduct$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getSharedPreferences(context).getString(KEY_PRODUCT, null);
    }

    public final void setProduct$sdk_release(Context context, String product) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString(KEY_PRODUCT, product);
        editor.apply();
    }

    public final JSONObject getMetadata$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = getSharedPreferences(context).getString(KEY_METADATA, null);
        if (string == null) {
            return null;
        }
        return new JSONObject(string);
    }

    public final void setMetadata$sdk_release(Context context, JSONObject metadata) {
        Intrinsics.checkNotNullParameter(context, "context");
        String jSONObject = metadata != null ? metadata.toString() : null;
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString(KEY_METADATA, jSONObject);
        editor.apply();
    }

    public final boolean getAnonymousTrackingEnabled$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getSharedPreferences(context).getBoolean(KEY_ANONYMOUS, false);
    }

    public final void setAnonymousTrackingEnabled$sdk_release(Context context, boolean enabled) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putBoolean(KEY_ANONYMOUS, enabled);
        editor.apply();
    }

    public final boolean getAdIdEnabled$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getSharedPreferences(context).getBoolean(KEY_AD_ID_ENABLED, false);
    }

    public final void setAdIdEnabled$sdk_release(Context context, boolean enabled) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putBoolean(KEY_AD_ID_ENABLED, enabled);
        editor.apply();
    }

    public final boolean getFraudEnabled$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getSharedPreferences(context).getBoolean(KEY_FRAUD_ENABLED, false);
    }

    public final void setFraudEnabled$sdk_release(Context context, boolean enabled) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putBoolean(KEY_FRAUD_ENABLED, enabled);
        editor.apply();
    }

    public final boolean getTracking$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getSharedPreferences(context).getBoolean(KEY_TRACKING, false);
    }

    public final void setTracking$sdk_release(Context context, boolean tracking) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putBoolean(KEY_TRACKING, tracking);
        editor.apply();
    }

    public final RadarTrackingOptions getTrackingOptions$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getTrackingOptionsByKey(context, KEY_TRACKING_OPTIONS);
    }

    private final RadarTrackingOptions getTrackingOptionsByKey(Context context, String key) {
        RadarTrackingOptions radarTrackingOptions;
        String string = getSharedPreferences(context).getString(key, null);
        if (string != null) {
            return RadarTrackingOptions.INSTANCE.fromJson(new JSONObject(string));
        }
        int i = getSharedPreferences(context).getInt(KEY_OLD_UPDATE_INTERVAL, 0);
        if (i > 0) {
            if (i == KEY_OLD_UPDATE_INTERVAL_RESPONSIVE) {
                radarTrackingOptions = RadarTrackingOptions.RESPONSIVE;
            } else {
                radarTrackingOptions = RadarTrackingOptions.EFFICIENT;
            }
            if (getSharedPreferences(context).getInt(KEY_OLD_SYNC_MODE, 0) == -1) {
                radarTrackingOptions.setSync(RadarTrackingOptions.RadarTrackingOptionsSync.ALL);
            }
            if (getSharedPreferences(context).getInt(KEY_OLD_OFFLINE_MODE, 0) == -1) {
                radarTrackingOptions.setReplay(RadarTrackingOptions.RadarTrackingOptionsReplay.NONE);
            }
            return radarTrackingOptions;
        }
        return RadarTrackingOptions.EFFICIENT;
    }

    public final void setTrackingOptions$sdk_release(Context context, RadarTrackingOptions options) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(options, "options");
        String jSONObject = options.toJson().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString(KEY_TRACKING_OPTIONS, jSONObject);
        editor.apply();
    }

    public final RadarTrackingOptions getPreviousTrackingOptions$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (getSharedPreferences(context).contains(KEY_PREVIOUS_TRACKING_OPTIONS)) {
            return getTrackingOptionsByKey(context, KEY_PREVIOUS_TRACKING_OPTIONS);
        }
        return null;
    }

    public final void setPreviousTrackingOptions$sdk_release(Context context, RadarTrackingOptions options) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(options, "options");
        String jSONObject = options.toJson().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString(KEY_PREVIOUS_TRACKING_OPTIONS, jSONObject);
        editor.apply();
    }

    public final void removePreviousTrackingOptions$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.remove(KEY_PREVIOUS_TRACKING_OPTIONS);
        editor.apply();
    }

    public final RadarTrackingOptions getRemoteTrackingOptions$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (getSharedPreferences(context).contains(KEY_REMOTE_TRACKING_OPTIONS)) {
            return getTrackingOptionsByKey(context, KEY_REMOTE_TRACKING_OPTIONS);
        }
        return null;
    }

    public final void setRemoteTrackingOptions$sdk_release(Context context, RadarTrackingOptions options) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(options, "options");
        String jSONObject = options.toJson().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString(KEY_REMOTE_TRACKING_OPTIONS, jSONObject);
        editor.apply();
    }

    public final void removeRemoteTrackingOptions$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.remove(KEY_REMOTE_TRACKING_OPTIONS);
        editor.apply();
    }

    public final void setNotificationOptions$sdk_release(Context context, RadarNotificationOptions notificationOptions) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notificationOptions, "notificationOptions");
        String jSONObject = notificationOptions.toJson().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString(KEY_NOTIFICATION_OPTIONS, jSONObject);
        editor.apply();
        RadarTrackingOptions.RadarTrackingOptionsForegroundService foregroundService$sdk_release = getForegroundService$sdk_release(context);
        String text = foregroundService$sdk_release.getText();
        String title = foregroundService$sdk_release.getTitle();
        Integer icon = foregroundService$sdk_release.getIcon();
        boolean updatesOnly = foregroundService$sdk_release.getUpdatesOnly();
        String activity = foregroundService$sdk_release.getActivity();
        Integer importance = foregroundService$sdk_release.getImportance();
        Integer id = foregroundService$sdk_release.getId();
        String channelName = foregroundService$sdk_release.getChannelName();
        String foregroundServiceIcon = notificationOptions.getForegroundServiceIcon();
        if (foregroundServiceIcon == null) {
            foregroundServiceIcon = foregroundService$sdk_release.getIconString();
        }
        String foregroundServiceColor = notificationOptions.getForegroundServiceColor();
        if (foregroundServiceColor == null) {
            foregroundServiceColor = foregroundService$sdk_release.getIconColor();
        }
        setForegroundService$sdk_release(context, new RadarTrackingOptions.RadarTrackingOptionsForegroundService(text, title, icon, updatesOnly, activity, importance, id, channelName, foregroundServiceIcon, foregroundServiceColor, notificationOptions.getDeepLink()));
    }

    public final RadarNotificationOptions getNotificationOptions$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = getSharedPreferences(context).getString(KEY_NOTIFICATION_OPTIONS, null);
        if (string == null) {
            return null;
        }
        return RadarNotificationOptions.INSTANCE.fromJson(new JSONObject(string));
    }

    public final RadarTrackingOptions.RadarTrackingOptionsForegroundService getForegroundService$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        RadarTrackingOptions.RadarTrackingOptionsForegroundService radarTrackingOptionsForegroundService = null;
        String string = getSharedPreferences(context).getString(KEY_FOREGROUND_SERVICE, null);
        if (string != null) {
            radarTrackingOptionsForegroundService = RadarTrackingOptions.RadarTrackingOptionsForegroundService.INSTANCE.fromJson(new JSONObject(string));
        }
        if (radarTrackingOptionsForegroundService != null) {
            return radarTrackingOptionsForegroundService;
        }
        return new RadarTrackingOptions.RadarTrackingOptionsForegroundService(null, null, null, false, null, null, null, null, null, null, null, 2047, null);
    }

    public final void setForegroundService$sdk_release(Context context, RadarTrackingOptions.RadarTrackingOptionsForegroundService foregroundService) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(foregroundService, "foregroundService");
        RadarTrackingOptions.RadarTrackingOptionsForegroundService foregroundService$sdk_release = getForegroundService$sdk_release(context);
        if (foregroundService.getIconString() == null) {
            foregroundService.setIconString(foregroundService$sdk_release.getIconString());
        }
        if (foregroundService.getIconColor() == null) {
            foregroundService.setIconColor(foregroundService$sdk_release.getIconColor());
        }
        String jSONObject = foregroundService.toJson().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString(KEY_FOREGROUND_SERVICE, jSONObject);
        editor.apply();
    }

    public final RadarTripOptions getTripOptions$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = getSharedPreferences(context).getString(KEY_TRIP_OPTIONS, null);
        if (string == null) {
            return null;
        }
        return RadarTripOptions.INSTANCE.fromJson(new JSONObject(string));
    }

    public final void setTripOptions$sdk_release(Context context, RadarTripOptions options) {
        Intrinsics.checkNotNullParameter(context, "context");
        JSONObject json = options != null ? options.toJson() : null;
        String jSONObject = json != null ? json.toString() : null;
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString(KEY_TRIP_OPTIONS, jSONObject);
        editor.apply();
    }

    public final void setSdkConfiguration(Context context, RadarSdkConfiguration configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        RadarLogger.d$default(Radar.INSTANCE.getLogger$sdk_release(), "Setting SDK configuration | sdkConfiguration = " + configuration, null, null, 6, null);
        if (configuration != null) {
            Radar.INSTANCE.setLogPersistenceFeatureFlag$sdk_release(configuration.getUseLogPersistence());
            setLogLevel$sdk_release(context, configuration.getLogLevel());
            String jSONObject = configuration.toJson().toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
            SharedPreferences.Editor editor = getSharedPreferences(context).edit();
            Intrinsics.checkNotNullExpressionValue(editor, "editor");
            editor.putString(KEY_SDK_CONFIGURATION, jSONObject);
            editor.apply();
            return;
        }
        SharedPreferences.Editor editor2 = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor2, "editor");
        editor2.remove(KEY_SDK_CONFIGURATION);
        editor2.apply();
    }

    public final RadarSdkConfiguration getSdkConfiguration(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = getSharedPreferences(context).getString(KEY_SDK_CONFIGURATION, null);
        return RadarSdkConfiguration.INSTANCE.fromJson(string != null ? new JSONObject(string) : null);
    }

    public final JSONObject getClientSdkConfiguration(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = getSharedPreferences(context).getString(KEY_CLIENT_SDK_CONFIGURATION, null);
        if (string != null) {
            return new JSONObject(string);
        }
        return new JSONObject();
    }

    public final void setClientSdkConfiguration(Context context, JSONObject sdkConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        String jSONObject = sdkConfiguration != null ? sdkConfiguration.toString() : null;
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString(KEY_CLIENT_SDK_CONFIGURATION, jSONObject);
        editor.apply();
    }

    public final Radar.RadarLogLevel getLogLevel$sdk_release(Context context) {
        int value;
        Intrinsics.checkNotNullParameter(context, "context");
        if (getUserDebug$sdk_release(context)) {
            value = Radar.RadarLogLevel.DEBUG.getValue();
        } else {
            value = Radar.RadarLogLevel.NONE.getValue();
        }
        return Radar.RadarLogLevel.INSTANCE.fromInt(getSharedPreferences(context).getInt(KEY_LOG_LEVEL, value));
    }

    public final void setLogLevel$sdk_release(Context context, Radar.RadarLogLevel level) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(level, "level");
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putInt(KEY_LOG_LEVEL, level.getValue());
        editor.apply();
    }

    public final String getHost$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = getSharedPreferences(context).getString(KEY_HOST, null);
        return string == null ? "https://api.radar.io" : string;
    }

    public final void setPermissionsDenied$sdk_release(Context context, boolean denied) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putBoolean(KEY_PERMISSIONS_DENIED, denied);
        editor.apply();
    }

    public final boolean getPermissionsDenied$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getSharedPreferences(context).getBoolean(KEY_PERMISSIONS_DENIED, false);
    }

    public final void updateLastTrackedTime$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putLong(KEY_LAST_TRACKED_TIME, currentTimeMillis);
        editor.apply();
    }

    public final long getLastTrackedTime$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getSharedPreferences(context).getLong(KEY_LAST_TRACKED_TIME, 0L);
    }

    public final String getVerifiedHost$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = getSharedPreferences(context).getString(KEY_VERIFIED_HOST, null);
        return string == null ? "https://api-verified.radar.io" : string;
    }

    public final boolean getUserDebug$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getSharedPreferences(context).getBoolean(KEY_USER_DEBUG, false);
    }

    public final void setUserDebug$sdk_release(Context context, boolean userDebug) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putBoolean(KEY_USER_DEBUG, userDebug);
        editor.apply();
    }

    public final long getLastAppOpenTimeMillis$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getSharedPreferences(context).getLong(KEY_LAST_APP_OPEN_TIME, 0L);
    }

    public final void updateLastAppOpenTimeMillis$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putLong(KEY_LAST_APP_OPEN_TIME, currentTimeMillis);
        editor.apply();
    }

    public final boolean getSharing$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getSharedPreferences(context).getBoolean(KEY_SHARING, false);
    }

    public final void setSharing$sdk_release(Context context, boolean sharing) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putBoolean(KEY_SHARING, sharing);
        editor.apply();
    }

    public final boolean isXPlatform$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getSharedPreferences(context).contains(KEY_X_PLATFORM_SDK_TYPE) && getSharedPreferences(context).contains(KEY_X_PLATFORM_SDK_VERSION);
    }

    public final String getXPlatformSDKType$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getSharedPreferences(context).getString(KEY_X_PLATFORM_SDK_TYPE, null);
    }

    public final String getXPlatformSDKVersion$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getSharedPreferences(context).getString(KEY_X_PLATFORM_SDK_VERSION, null);
    }

    public final String[] getTags$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = getSharedPreferences(context).getString(KEY_USER_TAGS, null);
        if (string == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray(string);
        int length = jSONArray.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            String string2 = jSONArray.getString(i);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            strArr[i] = string2;
        }
        return strArr;
    }

    public final void addTags$sdk_release(Context context, String[] tags) {
        LinkedHashSet linkedHashSet;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tags, "tags");
        String[] tags$sdk_release = getTags$sdk_release(context);
        if (tags$sdk_release == null || (linkedHashSet = ArraysKt.toMutableSet(tags$sdk_release)) == null) {
            linkedHashSet = new LinkedHashSet();
        }
        CollectionsKt.addAll(linkedHashSet, tags);
        String jSONArray = new JSONArray((Collection) CollectionsKt.toList(linkedHashSet)).toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray, "toString(...)");
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString(KEY_USER_TAGS, jSONArray);
        editor.apply();
    }

    public final void setTags$sdk_release(Context context, String[] tags) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tags, "tags");
        List list = CollectionsKt.toList(ArraysKt.toSet(tags));
        if (!list.isEmpty()) {
            String jSONArray = new JSONArray((Collection) list).toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray, "toString(...)");
            SharedPreferences.Editor editor = getSharedPreferences(context).edit();
            Intrinsics.checkNotNullExpressionValue(editor, "editor");
            editor.putString(KEY_USER_TAGS, jSONArray);
            editor.apply();
            return;
        }
        SharedPreferences.Editor editor2 = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor2, "editor");
        editor2.remove(KEY_USER_TAGS);
        editor2.apply();
    }

    public final void removeTags$sdk_release(Context context, String[] tags) {
        LinkedHashSet linkedHashSet;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tags, "tags");
        String[] tags$sdk_release = getTags$sdk_release(context);
        if (tags$sdk_release == null || (linkedHashSet = ArraysKt.toMutableSet(tags$sdk_release)) == null) {
            linkedHashSet = new LinkedHashSet();
        }
        linkedHashSet.removeAll(ArraysKt.toSet(tags));
        if (!linkedHashSet.isEmpty()) {
            String jSONArray = new JSONArray((Collection) CollectionsKt.toList(linkedHashSet)).toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray, "toString(...)");
            SharedPreferences.Editor editor = getSharedPreferences(context).edit();
            Intrinsics.checkNotNullExpressionValue(editor, "editor");
            editor.putString(KEY_USER_TAGS, jSONArray);
            editor.apply();
            return;
        }
        SharedPreferences.Editor editor2 = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor2, "editor");
        editor2.remove(KEY_USER_TAGS);
        editor2.apply();
    }

    public final void setContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        sharedPreferences = getSharedPreferences(context);
    }

    public final String getPushNotificationToken() {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        if (sharedPreferences2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            sharedPreferences2 = null;
        }
        return sharedPreferences2.getString(KEY_PUSH_NOTIFICATION_TOKEN, null);
    }

    public final void setPushNotificationToken(String str) {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        if (sharedPreferences2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            sharedPreferences2 = null;
        }
        SharedPreferences.Editor editor = sharedPreferences2.edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString(KEY_PUSH_NOTIFICATION_TOKEN, str);
        editor.apply();
    }
}
