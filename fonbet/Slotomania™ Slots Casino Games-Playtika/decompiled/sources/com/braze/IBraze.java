package com.braze;

import android.app.Activity;
import android.content.Intent;
import com.braze.events.BrazeNetworkFailureEvent;
import com.braze.events.BrazePushEvent;
import com.braze.events.BrazeSdkAuthenticationErrorEvent;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.events.FeedUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.IValueCallback;
import com.braze.events.InAppMessageEvent;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.events.SessionStateChangedEvent;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.FeatureFlag;
import com.braze.models.IBrazeLocation;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.outgoing.BrazeProperties;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ironsource.X3;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J*\u0010\u0014\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00160\u001aH&J\u0012\u0010\u001b\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007H&J\u001c\u0010\u001b\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\u001e\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010 H&J\u0014\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\u0007H&J\u0014\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010$\u001a\u0004\u0018\u00010%H&J\u0014\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010\u0007H&J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*H&J\u0010\u0010,\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010*H&J\b\u0010-\u001a\u00020.H&J\b\u0010/\u001a\u00020.H&J\b\u00100\u001a\u000201H&J\u0016\u0010\u0004\u001a\u00020\u00152\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000303H&J\u0016\u00104\u001a\u00020\u00152\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000703H&J\u0010\u00105\u001a\u00020+2\u0006\u00106\u001a\u00020\u0007H&J\n\u00107\u001a\u0004\u0018\u00010\u0007H\u0017J\u0012\u00108\u001a\u00020\u00152\b\u00109\u001a\u0004\u0018\u00010\u0007H&J\u001c\u00108\u001a\u00020\u00152\b\u00109\u001a\u0004\u0018\u00010\u00072\b\u0010:\u001a\u0004\u0018\u00010;H&J\u0012\u0010<\u001a\u00020\u00152\b\u0010=\u001a\u0004\u0018\u00010\u0007H'J\u0012\u0010>\u001a\u00020\u00152\b\u0010=\u001a\u0004\u0018\u00010\u0007H'J\b\u0010?\u001a\u00020\u0015H&J&\u0010@\u001a\u00020\u00152\b\u0010A\u001a\u0004\u0018\u00010\u00072\b\u0010B\u001a\u0004\u0018\u00010\u00072\b\u0010C\u001a\u0004\u0018\u00010DH&J0\u0010@\u001a\u00020\u00152\b\u0010A\u001a\u0004\u0018\u00010\u00072\b\u0010B\u001a\u0004\u0018\u00010\u00072\b\u0010C\u001a\u0004\u0018\u00010D2\b\u0010:\u001a\u0004\u0018\u00010;H&J.\u0010@\u001a\u00020\u00152\b\u0010A\u001a\u0004\u0018\u00010\u00072\b\u0010B\u001a\u0004\u0018\u00010\u00072\b\u0010C\u001a\u0004\u0018\u00010D2\u0006\u0010E\u001a\u00020.H&J<\u0010@\u001a\u00020\u00152\b\u0010A\u001a\u0004\u0018\u00010\u00072\b\u0010B\u001a\u0004\u0018\u00010\u00072\b\u0010C\u001a\u0004\u0018\u00010D2\b\b\u0002\u0010E\u001a\u00020.2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;H&J&\u0010F\u001a\u00020\u00152\b\u0010G\u001a\u0004\u0018\u00010\u00072\b\u0010H\u001a\u0004\u0018\u00010\u00072\b\u0010I\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010J\u001a\u00020\u00152\b\u0010K\u001a\u0004\u0018\u00010LH&J\u0012\u0010J\u001a\u00020\u00152\b\u0010G\u001a\u0004\u0018\u00010\u0007H&J\u001c\u0010M\u001a\u00020\u00152\b\u0010G\u001a\u0004\u0018\u00010\u00072\b\u0010N\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010O\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010 H&J\b\u0010P\u001a\u00020\u0015H&J,\u0010Q\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u00162\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u0002H\u0016\u0018\u00010\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00160\u001aH&J\b\u0010R\u001a\u00020\u0015H&J\u0010\u0010R\u001a\u00020\u00152\u0006\u0010S\u001a\u00020TH'J\b\u0010U\u001a\u00020\u0015H&J\b\u0010V\u001a\u00020\u0015H&J\b\u0010W\u001a\u00020\u0015H&J\u0018\u0010X\u001a\u00020\u00152\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020ZH&J\b\u0010\\\u001a\u00020\u0015H&J\b\u0010]\u001a\u00020\u0015H&J\u0018\u0010^\u001a\u00020\u00152\u0006\u0010_\u001a\u00020\u00072\u0006\u0010`\u001a\u00020TH&J\u0010\u0010a\u001a\u00020\u00152\u0006\u0010b\u001a\u00020\u0007H&J\u0016\u0010c\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020d0\u0018H&J\u0016\u0010e\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020f0\u0018H&J\u0016\u0010g\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020h0\u0018H&J\u0016\u0010i\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020j0\u0018H&J\u0016\u0010k\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020l0\u0018H&J\u0016\u0010m\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020n0\u0018H&J\u0016\u0010o\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020p0\u0018H&J\u0016\u0010q\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020r0\u0018H&J\u0016\u0010s\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020t0\u0018H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u00020\u000bX¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006uÀ\u0006\u0001"}, d2 = {"Lcom/braze/IBraze;", "", "currentUser", "Lcom/braze/BrazeUser;", "getCurrentUser", "()Lcom/braze/BrazeUser;", "deviceId", "", "getDeviceId", "()Ljava/lang/String;", "imageLoader", "Lcom/braze/images/IBrazeImageLoader;", "getImageLoader", "()Lcom/braze/images/IBrazeImageLoader;", "setImageLoader", "(Lcom/braze/images/IBrazeImageLoader;)V", "registeredPushToken", "getRegisteredPushToken", "setRegisteredPushToken", "(Ljava/lang/String;)V", "addSingleSynchronousSubscription", "", "T", "subscriber", "Lcom/braze/events/IEventSubscriber;", "eventClass", "Ljava/lang/Class;", "changeUser", "userId", "sdkAuthSignature", "closeSession", "activity", "Landroid/app/Activity;", "deserializeContentCard", "Lcom/braze/models/cards/Card;", "contentCardString", "contentCardJson", "Lorg/json/JSONObject;", "deserializeInAppMessageString", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessageString", "getAllFeatureFlags", "", "Lcom/braze/models/FeatureFlag;", "getCachedContentCards", "getContentCardCount", "", "getContentCardUnviewedCount", "getContentCardsLastUpdatedInSecondsFromEpoch", "", "completionCallback", "Lcom/braze/events/IValueCallback;", "getDeviceIdAsync", "getFeatureFlag", "id", "getInstallTrackingId", "logCustomEvent", X3.i.j0, FeatureFlag.PROPERTIES, "Lcom/braze/models/outgoing/BrazeProperties;", "logFeedCardClick", "cardId", "logFeedCardImpression", "logFeedDisplayed", "logPurchase", InAppPurchaseMetaData.KEY_PRODUCT_ID, "currencyCode", "price", "Ljava/math/BigDecimal;", "quantity", "logPushNotificationActionClicked", "campaignId", "actionId", SDKConstants.PARAM_GAME_REQUESTS_ACTION_TYPE, "logPushNotificationOpened", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "logPushStoryPageClicked", "pageId", "openSession", "refreshFeatureFlags", "removeSingleSubscription", "requestContentCardsRefresh", "fromCache", "", "requestContentCardsRefreshFromCache", "requestFeedRefresh", "requestFeedRefreshFromCache", "requestGeofences", IBrazeLocation.LATITUDE, "", IBrazeLocation.LONGITUDE, "requestImmediateDataFlush", "requestLocationInitialization", "setGoogleAdvertisingId", "googleAdvertisingId", X3.j.M, "setSdkAuthenticationSignature", InAppPurchaseMetaData.KEY_SIGNATURE, "subscribeToContentCardsUpdates", "Lcom/braze/events/ContentCardsUpdatedEvent;", "subscribeToFeatureFlagsUpdates", "Lcom/braze/events/FeatureFlagsUpdatedEvent;", "subscribeToFeedUpdates", "Lcom/braze/events/FeedUpdatedEvent;", "subscribeToNetworkFailures", "Lcom/braze/events/BrazeNetworkFailureEvent;", "subscribeToNewInAppMessages", "Lcom/braze/events/InAppMessageEvent;", "subscribeToNoMatchingTriggerForEvent", "Lcom/braze/events/NoMatchingTriggerEvent;", "subscribeToPushNotificationEvents", "Lcom/braze/events/BrazePushEvent;", "subscribeToSdkAuthenticationFailures", "Lcom/braze/events/BrazeSdkAuthenticationErrorEvent;", "subscribeToSessionUpdates", "Lcom/braze/events/SessionStateChangedEvent;", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface IBraze {
    static /* synthetic */ void logPurchase$default(IBraze iBraze, String str, String str2, BigDecimal bigDecimal, int i, BrazeProperties brazeProperties, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logPurchase");
        }
        if ((i2 & 8) != 0) {
            i = 1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            brazeProperties = null;
        }
        iBraze.logPurchase(str, str2, bigDecimal, i3, brazeProperties);
    }

    <T> void addSingleSynchronousSubscription(IEventSubscriber<T> subscriber, Class<T> eventClass);

    void changeUser(String userId);

    void changeUser(String userId, String sdkAuthSignature);

    void closeSession(Activity activity);

    Card deserializeContentCard(String contentCardString);

    Card deserializeContentCard(JSONObject contentCardJson);

    IInAppMessage deserializeInAppMessageString(String inAppMessageString);

    List<FeatureFlag> getAllFeatureFlags();

    List<Card> getCachedContentCards();

    int getContentCardCount();

    int getContentCardUnviewedCount();

    long getContentCardsLastUpdatedInSecondsFromEpoch();

    BrazeUser getCurrentUser();

    void getCurrentUser(IValueCallback<BrazeUser> completionCallback);

    String getDeviceId();

    void getDeviceIdAsync(IValueCallback<String> completionCallback);

    FeatureFlag getFeatureFlag(String id);

    IBrazeImageLoader getImageLoader();

    @Deprecated(message = "Use {@link #getDeviceId()} for equivalent functionality. Deprecated since May 2021", replaceWith = @ReplaceWith(expression = "deviceId", imports = {}))
    default String getInstallTrackingId() {
        return getDeviceId();
    }

    String getRegisteredPushToken();

    void logCustomEvent(String eventName);

    void logCustomEvent(String eventName, BrazeProperties properties);

    @Deprecated(message = "Please call {@link Card#logClick()} instead to log a click.", replaceWith = @ReplaceWith(expression = "Card.logClick()", imports = {}))
    void logFeedCardClick(String cardId);

    @Deprecated(message = "Please call {@link Card#logImpression()} instead to log an impression.", replaceWith = @ReplaceWith(expression = "Card.logImpression", imports = {}))
    void logFeedCardImpression(String cardId);

    void logFeedDisplayed();

    void logPurchase(String productId, String currencyCode, BigDecimal price);

    void logPurchase(String productId, String currencyCode, BigDecimal price, int quantity);

    void logPurchase(String productId, String currencyCode, BigDecimal price, int quantity, BrazeProperties properties);

    void logPurchase(String productId, String currencyCode, BigDecimal price, BrazeProperties properties);

    void logPushNotificationActionClicked(String campaignId, String actionId, String actionType);

    void logPushNotificationOpened(Intent intent);

    void logPushNotificationOpened(String campaignId);

    void logPushStoryPageClicked(String campaignId, String pageId);

    void openSession(Activity activity);

    void refreshFeatureFlags();

    <T> void removeSingleSubscription(IEventSubscriber<T> subscriber, Class<T> eventClass);

    void requestContentCardsRefresh();

    @Deprecated(message = "Please call {@link IBraze#requestContentCardsRefresh()} or {@link IBraze#requestContentCardsRefreshFromCache()} instead refresh Content Cards", replaceWith = @ReplaceWith(expression = "IBraze.requestContentCardsRefresh", imports = {}))
    void requestContentCardsRefresh(boolean fromCache);

    void requestContentCardsRefreshFromCache();

    void requestFeedRefresh();

    void requestFeedRefreshFromCache();

    void requestGeofences(double latitude, double longitude);

    void requestImmediateDataFlush();

    void requestLocationInitialization();

    void setGoogleAdvertisingId(String googleAdvertisingId, boolean isLimitAdTrackingEnabled);

    void setImageLoader(IBrazeImageLoader iBrazeImageLoader);

    void setRegisteredPushToken(String str);

    void setSdkAuthenticationSignature(String signature);

    void subscribeToContentCardsUpdates(IEventSubscriber<ContentCardsUpdatedEvent> subscriber);

    void subscribeToFeatureFlagsUpdates(IEventSubscriber<FeatureFlagsUpdatedEvent> subscriber);

    void subscribeToFeedUpdates(IEventSubscriber<FeedUpdatedEvent> subscriber);

    void subscribeToNetworkFailures(IEventSubscriber<BrazeNetworkFailureEvent> subscriber);

    void subscribeToNewInAppMessages(IEventSubscriber<InAppMessageEvent> subscriber);

    void subscribeToNoMatchingTriggerForEvent(IEventSubscriber<NoMatchingTriggerEvent> subscriber);

    void subscribeToPushNotificationEvents(IEventSubscriber<BrazePushEvent> subscriber);

    void subscribeToSdkAuthenticationFailures(IEventSubscriber<BrazeSdkAuthenticationErrorEvent> subscriber);

    void subscribeToSessionUpdates(IEventSubscriber<SessionStateChangedEvent> subscriber);
}
