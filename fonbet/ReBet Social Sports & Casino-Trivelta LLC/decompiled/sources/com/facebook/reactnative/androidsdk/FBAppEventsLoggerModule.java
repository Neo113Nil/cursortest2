package com.facebook.reactnative.androidsdk;

import T7.C1662b;
import com.appsflyer.AdRevenueScheme;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import h6.p;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@ReactModule(name = FBAppEventsLoggerModule.NAME)
/* loaded from: classes2.dex */
public class FBAppEventsLoggerModule extends ReactContextBaseJavaModule {
    public static final String NAME = "FBAppEventsLogger";
    private p mAppEventLogger;
    private C1662b mAttributionIdentifiers;
    private ReactApplicationContext mReactContext;

    public FBAppEventsLoggerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mReactContext = reactApplicationContext;
    }

    private String getNullableString(ReadableMap readableMap, String str) {
        if (readableMap.hasKey(str)) {
            return readableMap.getString(str);
        }
        return null;
    }

    @ReactMethod
    public void clearUserID() {
        p.a();
    }

    @ReactMethod
    public void flush() {
        this.mAppEventLogger.b();
    }

    @ReactMethod
    public void getAdvertiserID(Promise promise) {
        try {
            promise.resolve(this.mAttributionIdentifiers.h());
        } catch (Exception e10) {
            promise.reject("E_ADVERTISER_ID_ERROR", "Can not get advertiserID", e10);
        }
    }

    @ReactMethod
    public void getAnonymousID(Promise promise) {
        try {
            promise.resolve(p.c(this.mReactContext));
        } catch (Exception e10) {
            promise.reject("E_ANONYMOUS_ID_ERROR", "Can not get anonymousID", e10);
        }
    }

    @ReactMethod
    public void getAttributionID(Promise promise) {
        try {
            promise.resolve(this.mAttributionIdentifiers.j());
        } catch (Exception e10) {
            promise.reject("E_ATTRIBUTION_ID_ERROR", "Can not get attributionID", e10);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("AchievedLevel", "fb_mobile_level_achieved");
        hashMap2.put("AdClick", "AdClick");
        hashMap2.put("AdImpression", "AdImpression");
        hashMap2.put("AddedPaymentInfo", "fb_mobile_add_payment_info");
        hashMap2.put("AddedToCart", "fb_mobile_add_to_cart");
        hashMap2.put("AddedToWishlist", "fb_mobile_add_to_wishlist");
        hashMap2.put("CompletedRegistration", "fb_mobile_complete_registration");
        hashMap2.put("CompletedTutorial", "fb_mobile_tutorial_completion");
        hashMap2.put("Contact", "Contact");
        hashMap2.put("CustomizeProduct", "CustomizeProduct");
        hashMap2.put("Donate", "Donate");
        hashMap2.put("FindLocation", "FindLocation");
        hashMap2.put("InitiatedCheckout", "fb_mobile_initiated_checkout");
        hashMap2.put("Purchased", "fb_mobile_purchase");
        hashMap2.put("Rated", "fb_mobile_rate");
        hashMap2.put("Searched", "fb_mobile_search");
        hashMap2.put("SpentCredits", "fb_mobile_spent_credits");
        hashMap2.put("Schedule", "Schedule");
        hashMap2.put("StartTrial", "StartTrial");
        hashMap2.put("SubmitApplication", "SubmitApplication");
        hashMap2.put("Subscribe", "Subscribe");
        hashMap2.put("UnlockedAchievement", "fb_mobile_achievement_unlocked");
        hashMap2.put("ViewedContent", "fb_mobile_content_view");
        hashMap.put("AppEvents", hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("AddType", AdRevenueScheme.AD_TYPE);
        hashMap3.put("Content", "fb_content");
        hashMap3.put("ContentID", "fb_content_id");
        hashMap3.put("ContentType", "fb_content_type");
        hashMap3.put("Currency", "fb_currency");
        hashMap3.put("Description", "fb_description");
        hashMap3.put("Level", "fb_level");
        hashMap3.put("NumItems", "fb_num_items");
        hashMap3.put("MaxRatingValue", "fb_max_rating_value");
        hashMap3.put("OrderId", "fb_order_id");
        hashMap3.put("PaymentInfoAvailable", "fb_payment_info_available");
        hashMap3.put("RegistrationMethod", "fb_registration_method");
        hashMap3.put("SearchString", "fb_search_string");
        hashMap3.put("Success", "fb_success");
        hashMap3.put("ValueNo", "0");
        hashMap3.put("ValueYes", "1");
        hashMap.put("AppEventParams", hashMap3);
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getUserID() {
        return p.d();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        this.mAppEventLogger = p.j(this.mReactContext);
        this.mAttributionIdentifiers = C1662b.k(this.mReactContext);
    }

    @ReactMethod
    public void logEvent(String str, double d10, ReadableMap readableMap) {
        this.mAppEventLogger.e(str, d10, Arguments.toBundle(readableMap));
    }

    @ReactMethod
    public void logProductItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, double d10, String str8, String str9, String str10, String str11, ReadableMap readableMap) {
        p pVar = this.mAppEventLogger;
        Locale locale = Locale.ROOT;
        pVar.g(str, p.c.valueOf(str2.toUpperCase(locale)), p.d.valueOf(str3.toUpperCase(locale)), str4, str5, str6, str7, BigDecimal.valueOf(d10), Currency.getInstance(str8), str9, str10, str11, Arguments.toBundle(readableMap));
    }

    @ReactMethod
    public void logPurchase(double d10, String str, ReadableMap readableMap) {
        this.mAppEventLogger.h(BigDecimal.valueOf(d10), Currency.getInstance(str), Arguments.toBundle(readableMap));
    }

    @ReactMethod
    public void logPushNotificationOpen(ReadableMap readableMap) {
        this.mAppEventLogger.i(Arguments.toBundle(readableMap));
    }

    @ReactMethod
    public void setFlushBehavior(String str) {
        p.k(p.b.valueOf(str.toUpperCase(Locale.ROOT)));
    }

    @ReactMethod
    public void setPushNotificationsRegistrationId(String str) {
        p.l(str);
    }

    @ReactMethod
    public void setUserData(ReadableMap readableMap) {
        p.m(getNullableString(readableMap, "email"), getNullableString(readableMap, "firstName"), getNullableString(readableMap, "lastName"), getNullableString(readableMap, "phone"), getNullableString(readableMap, "dateOfBirth"), getNullableString(readableMap, "gender"), getNullableString(readableMap, "city"), getNullableString(readableMap, "state"), getNullableString(readableMap, "zip"), getNullableString(readableMap, AdRevenueScheme.COUNTRY));
    }

    @ReactMethod
    public void setUserID(String str) {
        p.n(str);
    }
}
