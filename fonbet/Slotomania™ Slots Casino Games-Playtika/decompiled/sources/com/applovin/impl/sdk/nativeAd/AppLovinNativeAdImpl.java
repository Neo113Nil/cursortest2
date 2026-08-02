package com.applovin.impl.sdk.nativeAd;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.arch.core.util.Function;
import androidx.browser.customtabs.CustomTabsSession;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.g8;
import com.applovin.impl.h1;
import com.applovin.impl.i8;
import com.applovin.impl.j5;
import com.applovin.impl.k4;
import com.applovin.impl.m4;
import com.applovin.impl.n7;
import com.applovin.impl.o8;
import com.applovin.impl.q7;
import com.applovin.impl.r7;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.network.e;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v2;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.common.net.HttpHeaders;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class AppLovinNativeAdImpl extends AppLovinAdBase implements AppLovinNativeAd, View.OnClickListener, AppLovinTouchToClickListener.OnClickListener {
    private static final String AD_RESPONSE_TYPE_APPLOVIN = "applovin";
    private static final String AD_RESPONSE_TYPE_ORTB = "ortb";
    private static final String AD_RESPONSE_TYPE_UNDEFINED = "undefined";
    private static final String DEFAULT_APPLOVIN_PRIVACY_URL = "https://www.applovin.com/privacy/";
    private static final float MINIMUM_STARS_TO_RENDER = 3.0f;
    private static final String TAG = "AppLovinNativeAd";
    private static final int VIEWABLE_MRC100_PERCENTAGE = 100;
    private static final int VIEWABLE_MRC50_PERCENTAGE = 50;
    private static final int VIEWABLE_MRC_REQUIRED_SECONDS = 1;
    private static final int VIEWABLE_VIDEO_MRC_REQUIRED_SECONDS = 2;
    private final k4 adEventTracker;
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final Uri clickDestinationBackupUri;
    private final Uri clickDestinationUri;
    private final List<e> clickTrackingRequests;
    private final List<String> clickTrackingUrls;
    private CustomTabsSession customTabsSession;
    private AppLovinNativeAdEventListener eventListener;
    private Uri iconUri;
    private final List<e> impressionRequests;
    private final AtomicBoolean impressionTracked;
    private final List<String> jsTrackers;
    private float mainImageAspectRatio;
    private Uri mainImageUri;
    private AppLovinMediaView mediaView;
    private ViewGroup nativeAdView;
    private final b onAttachStateChangeHandler;
    private AppLovinOptionsView optionsView;
    private Uri privacyDestinationUri;
    private Uri privacyIconUri;
    private final List<View> registeredViews;
    private final Double starRating;
    private final String tag;
    private final String title;
    private final r7 vastAd;
    private View videoView;
    private final c viewableMRC100Callback;
    private i8 viewableMRC100Tracker;
    private final c viewableMRC50Callback;
    private i8 viewableMRC50Tracker;
    private c viewableVideoMRC50Callback;
    private i8 viewableVideoMRC50Tracker;

    public static class Builder {
        private final JSONObject adObject;
        private String advertiser;
        private String body;
        private String callToAction;
        private Uri clickDestinationBackupUri;
        private Uri clickDestinationUri;
        private List<e> clickTrackingRequests;
        private List<String> clickTrackingUrls;
        private final JSONObject fullResponse;
        private Uri iconUri;
        private List<e> impressionRequests;
        private List<String> jsTrackers;
        private float mainImageAspectRatio;
        private Uri mainImageUri;
        private Uri privacyDestinationUri;
        private Uri privacyIconUri;
        private final l sdk;
        private Double starRating;
        private String title;
        private r7 vastAd;
        private List<e> viewableMRC100Requests;
        private List<e> viewableMRC50Requests;
        private List<e> viewableVideo50Requests;

        public Builder(JSONObject jSONObject, JSONObject jSONObject2, l lVar) {
            this.adObject = jSONObject;
            this.fullResponse = jSONObject2;
            this.sdk = lVar;
        }

        public AppLovinNativeAdImpl build() {
            return new AppLovinNativeAdImpl(this);
        }

        public Builder setAdvertiser(String str) {
            this.advertiser = str;
            return this;
        }

        public Builder setBody(String str) {
            this.body = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.callToAction = str;
            return this;
        }

        public Builder setClickDestinationBackupUri(Uri uri) {
            this.clickDestinationBackupUri = uri;
            return this;
        }

        public Builder setClickDestinationUri(Uri uri) {
            this.clickDestinationUri = uri;
            return this;
        }

        public Builder setClickTrackingRequests(List<e> list) {
            this.clickTrackingRequests = list;
            return this;
        }

        public Builder setClickTrackingUrls(List<String> list) {
            this.clickTrackingUrls = list;
            return this;
        }

        public Builder setIconUri(Uri uri) {
            this.iconUri = uri;
            return this;
        }

        public Builder setImpressionRequests(List<e> list) {
            this.impressionRequests = list;
            return this;
        }

        public Builder setJsTrackers(List<String> list) {
            this.jsTrackers = list;
            return this;
        }

        public Builder setMainImageUri(Uri uri) {
            this.mainImageUri = uri;
            return this;
        }

        public Builder setPrivacyDestinationUri(Uri uri) {
            this.privacyDestinationUri = uri;
            return this;
        }

        public Builder setPrivacyIconUri(Uri uri) {
            this.privacyIconUri = uri;
            return this;
        }

        public Builder setStarRating(Double d) {
            this.starRating = d;
            return this;
        }

        public Builder setTitle(String str) {
            this.title = str;
            return this;
        }

        public Builder setVastAd(r7 r7Var) {
            this.vastAd = r7Var;
            return this;
        }

        public Builder setViewableMRC100Requests(List<e> list) {
            this.viewableMRC100Requests = list;
            return this;
        }

        public Builder setViewableMRC50Requests(List<e> list) {
            this.viewableMRC50Requests = list;
            return this;
        }

        public Builder setViewableVideo50Requests(List<e> list) {
            this.viewableVideo50Requests = list;
            return this;
        }
    }

    private static class b implements View.OnAttachStateChangeListener {
        private final AppLovinNativeAdImpl a;

        public b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.a = appLovinNativeAdImpl;
        }

        protected boolean a(Object obj) {
            return obj instanceof b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!bVar.a(this)) {
                return false;
            }
            AppLovinNativeAdImpl a = a();
            AppLovinNativeAdImpl a2 = bVar.a();
            return a != null ? a.equals(a2) : a2 == null;
        }

        public int hashCode() {
            AppLovinNativeAdImpl a = a();
            return (a == null ? 43 : a.hashCode()) + 59;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.a.maybeHandleOnAttachedToWindow(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }

        public String toString() {
            return "AppLovinNativeAdImpl.OnAttachStateChangeHandler(ad=" + a() + ")";
        }

        public AppLovinNativeAdImpl a() {
            return this.a;
        }
    }

    private class c implements i8.a {
        private final List a;

        public c(List list) {
            this.a = list;
        }

        protected boolean a(Object obj) {
            return obj instanceof c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a(this)) {
                return false;
            }
            List a = a();
            List a2 = cVar.a();
            return a != null ? a.equals(a2) : a2 == null;
        }

        public int hashCode() {
            List a = a();
            return (a == null ? 43 : a.hashCode()) + 59;
        }

        @Override // com.applovin.impl.i8.a
        public void onLogVisibilityImpression() {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((AppLovinAdBase) AppLovinNativeAdImpl.this).sdk.i0().dispatchPostbackRequest((e) it.next(), null);
            }
        }

        public String toString() {
            return "AppLovinNativeAdImpl.VisibilityCallback(requests=" + a() + ")";
        }

        public List a() {
            return this.a;
        }
    }

    private List<com.applovin.impl.e> getDirectClickTrackingPostbacks() {
        List<com.applovin.impl.e> a2;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new Function() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$$ExternalSyntheticLambda3
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return AppLovinNativeAdImpl.this.m4953xc24c558e((j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            a2 = q7.a(getJsonObjectFromAdObject("click_tracking_urls", new JSONObject()), getClCode(), getStringFromAdObject("click_tracking_url", null), this.sdk);
        }
        return a2;
    }

    private boolean isDspAd() {
        return AD_RESPONSE_TYPE_ORTB.equalsIgnoreCase(getType());
    }

    static /* synthetic */ h1 lambda$getCustomTabsSettings$1(j5 j5Var) {
        JSONObject a2 = j5Var.a("custom_tabs_settings", (JSONObject) null);
        if (a2 != null) {
            return new h1(a2);
        }
        return null;
    }

    static /* synthetic */ List lambda$getOpenMeasurementVerificationScriptResources$11(Function function, j5 j5Var) {
        return (List) function.apply(j5Var.a("omid_verification_script_resources", (JSONArray) null));
    }

    private void launchUri(Uri uri, Uri uri2, Context context) {
        if (isCustomTabsEnabled() && this.sdk.A().a(uri, this, this.sdk.w0())) {
            this.sdk.Q();
            if (p.a()) {
                this.sdk.Q().a(this.tag, "Opening URL in Custom Tab: " + uri);
                return;
            }
            return;
        }
        if (isCustomTabsEnabled() && uri2 != null && this.sdk.A().a(uri2, this, this.sdk.w0())) {
            this.sdk.Q();
            if (p.a()) {
                this.sdk.Q().a(this.tag, "Opening backup URL in Custom Tab: " + uri2);
                return;
            }
            return;
        }
        if (n7.a(uri, context, this.sdk)) {
            this.sdk.Q();
            if (p.a()) {
                this.sdk.Q().a(this.tag, "Opening URL: " + uri);
                return;
            }
            return;
        }
        if (uri2 == null || !n7.a(uri2, context, this.sdk)) {
            return;
        }
        this.sdk.Q();
        if (p.a()) {
            this.sdk.Q().a(this.tag, "Opening backup URL: " + uri2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeHandleOnAttachedToWindow(View view) {
        if (this.impressionTracked.compareAndSet(false, true)) {
            i8 i8Var = new i8(this.nativeAdView, this.sdk, this.viewableMRC50Callback);
            this.viewableMRC50Tracker = i8Var;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            i8Var.a(0, 50.0f, 50.0f, timeUnit.toMillis(1L), this.nativeAdView);
            i8 i8Var2 = new i8(this.nativeAdView, this.sdk, this.viewableMRC100Callback);
            this.viewableMRC100Tracker = i8Var2;
            i8Var2.a(0, 100.0f, 100.0f, timeUnit.toMillis(1L), this.nativeAdView);
            r7 r7Var = this.vastAd;
            if (r7Var != null && r7Var.hasVideoUrl()) {
                i8 i8Var3 = new i8(this.nativeAdView, this.sdk, this.viewableVideoMRC50Callback);
                this.viewableVideoMRC50Tracker = i8Var3;
                i8Var3.a(0, 50.0f, 50.0f, timeUnit.toMillis(2L), this.videoView);
            }
            List<String> list = this.jsTrackers;
            if (list != null) {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    this.sdk.z0().b(it.next());
                }
            }
            Iterator<e> it2 = this.impressionRequests.iterator();
            while (it2.hasNext()) {
                this.sdk.i0().dispatchPostbackRequest(it2.next(), null);
            }
            this.adEventTracker.a(view);
            this.adEventTracker.g();
        }
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public void destroy() {
        unregisterViewsForInteraction();
        this.eventListener = null;
        this.adEventTracker.f();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getAdIdNumber() {
        return getLongFromAdObject(CreativeInfo.c, -1L);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getAdvertiser() {
        return this.advertiser;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getBody() {
        return this.body;
    }

    public String getCachePrefix() {
        return getStringFromAdObject("cache_prefix", null);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getCallToAction() {
        return this.callToAction;
    }

    public Bundle getCustomTabsHeaders() {
        Map hashMap;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            hashMap = (Map) j5Var.a(new Function() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$$ExternalSyntheticLambda7
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return AppLovinNativeAdImpl.this.m4946x5006e8b6((j5) obj);
                }
            });
        } else {
            try {
                hashMap = JsonUtils.toStringMap(getJsonObjectFromAdObject("custom_tabs_http_headers", new JSONObject()));
            } catch (JSONException e) {
                this.sdk.Q();
                if (p.a()) {
                    this.sdk.Q().a(TAG, "Failed to retrieve http headers for Custom Tabs", e);
                }
                hashMap = new HashMap();
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : hashMap.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        if (getBooleanFromAdObject("custom_tabs_should_use_webview_ua", Boolean.FALSE)) {
            bundle.putString(HttpHeaders.USER_AGENT, o8.a());
        }
        return bundle;
    }

    public List<com.applovin.impl.e> getCustomTabsNavigationAbortedPostbacks() {
        List<com.applovin.impl.e> a2;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new Function() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$$ExternalSyntheticLambda0
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return AppLovinNativeAdImpl.this.m4947x9aa0bf5((j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            a2 = q7.a(getJsonObjectFromAdObject("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public List<com.applovin.impl.e> getCustomTabsNavigationFailedPostbacks() {
        List<com.applovin.impl.e> a2;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new Function() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$$ExternalSyntheticLambda6
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return AppLovinNativeAdImpl.this.m4948x9d7e354e((j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            a2 = q7.a(getJsonObjectFromAdObject("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public List<com.applovin.impl.e> getCustomTabsNavigationFinishedPostbacks() {
        List<com.applovin.impl.e> a2;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new Function() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$$ExternalSyntheticLambda4
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return AppLovinNativeAdImpl.this.m4949xff2d83f8((j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            a2 = q7.a(getJsonObjectFromAdObject("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public List<com.applovin.impl.e> getCustomTabsNavigationStartedPostbacks() {
        List<com.applovin.impl.e> a2;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new Function() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$$ExternalSyntheticLambda10
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return AppLovinNativeAdImpl.this.m4950xcb790c80((j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            a2 = q7.a(getJsonObjectFromAdObject("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public CustomTabsSession getCustomTabsSession() {
        return this.customTabsSession;
    }

    public h1 getCustomTabsSettings() {
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (h1) j5Var.a(new Function() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$$ExternalSyntheticLambda11
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return AppLovinNativeAdImpl.lambda$getCustomTabsSettings$1((j5) obj);
                }
            });
        }
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("custom_tabs_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new h1(jsonObjectFromAdObject);
        }
        return null;
    }

    public List<com.applovin.impl.e> getCustomTabsTabHiddenPostbacks() {
        List<com.applovin.impl.e> a2;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new Function() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$$ExternalSyntheticLambda9
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return AppLovinNativeAdImpl.this.m4951xe255a3f3((j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            a2 = q7.a(getJsonObjectFromAdObject("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public List<com.applovin.impl.e> getCustomTabsTabShownPostbacks() {
        List<com.applovin.impl.e> a2;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new Function() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$$ExternalSyntheticLambda8
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return AppLovinNativeAdImpl.this.m4952xae013be5((j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            a2 = q7.a(getJsonObjectFromAdObject("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public List<String> getCustomTabsWarmupUrls() {
        return getStringListFromAdObject("custom_tabs_warmup_urls", Collections.emptyList());
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public Uri getIconUri() {
        return this.iconUri;
    }

    public float getMainImageAspectRatio() {
        return this.mainImageAspectRatio;
    }

    public Uri getMainImageUri() {
        return this.mainImageUri;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public AppLovinMediaView getMediaView() {
        return this.mediaView;
    }

    public String getMediationServeId() {
        return getStringFromFullResponse("event_id", null);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.g4
    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", null);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.g4
    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.g4
    public List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources() {
        List<VerificationScriptResource> list;
        if (this.sdk.g0().e()) {
            return Collections.singletonList(VerificationScriptResource.createVerificationScriptResourceWithParameters(m4.c(), m4.b(), m4.a()));
        }
        final Function function = new Function() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$$ExternalSyntheticLambda1
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return AppLovinNativeAdImpl.this.m4954x4e578947((JSONArray) obj);
            }
        };
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new Function() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$$ExternalSyntheticLambda2
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return AppLovinNativeAdImpl.lambda$getOpenMeasurementVerificationScriptResources$11(Function.this, (j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            list = (List) function.apply(getJsonArrayFromAdObject("omid_verification_script_resources", null));
        }
        return list;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public AppLovinOptionsView getOptionsView() {
        return this.optionsView;
    }

    public Uri getPrivacyDestinationUri() {
        return this.privacyDestinationUri;
    }

    public Uri getPrivacyIconUri() {
        return this.privacyIconUri;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public Double getStarRating() {
        return this.starRating;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return getStringFromAdObject("type", "undefined");
    }

    public r7 getVastAd() {
        return this.vastAd;
    }

    protected void handleNativeAdClick(Uri uri, Uri uri2, Context context) {
        if (this.clickTrackingRequests.size() > 0) {
            Iterator<e> it = this.clickTrackingRequests.iterator();
            while (it.hasNext()) {
                this.sdk.i0().dispatchPostbackRequest(it.next(), null);
            }
        } else {
            Iterator<String> it2 = this.clickTrackingUrls.iterator();
            while (it2.hasNext()) {
                this.sdk.i0().dispatchPostbackAsync(it2.next(), null);
            }
        }
        v2.b(this.eventListener, this);
        launchUri(uri, uri2, context);
    }

    public boolean isCustomTabsClientWarmupEnabled() {
        return getBooleanFromAdObject("custom_tabs_client_warmup_enabled", Boolean.FALSE);
    }

    public boolean isCustomTabsEnabled() {
        return getBooleanFromAdObject("custom_tabs_enabled", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.g4
    public boolean isOpenMeasurementEnabled() {
        if (this.sdk.g0().e()) {
            return true;
        }
        return getBooleanFromAdObject("omsdk_enabled", Boolean.FALSE);
    }

    /* renamed from: lambda$getCustomTabsHeaders$2$com-applovin-impl-sdk-nativeAd-AppLovinNativeAdImpl, reason: not valid java name */
    /* synthetic */ Map m4946x5006e8b6(j5 j5Var) {
        try {
            return JsonUtils.toStringMap(j5Var.a("custom_tabs_http_headers", new JSONObject()));
        } catch (JSONException e) {
            this.sdk.Q();
            if (p.a()) {
                this.sdk.Q().a(TAG, "Failed to retrieve http headers for Custom Tabs", e);
            }
            return new HashMap();
        }
    }

    /* renamed from: lambda$getCustomTabsNavigationAbortedPostbacks$6$com-applovin-impl-sdk-nativeAd-AppLovinNativeAdImpl, reason: not valid java name */
    /* synthetic */ List m4947x9aa0bf5(j5 j5Var) {
        return q7.a(j5Var.a("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* renamed from: lambda$getCustomTabsNavigationFailedPostbacks$5$com-applovin-impl-sdk-nativeAd-AppLovinNativeAdImpl, reason: not valid java name */
    /* synthetic */ List m4948x9d7e354e(j5 j5Var) {
        return q7.a(j5Var.a("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* renamed from: lambda$getCustomTabsNavigationFinishedPostbacks$4$com-applovin-impl-sdk-nativeAd-AppLovinNativeAdImpl, reason: not valid java name */
    /* synthetic */ List m4949xff2d83f8(j5 j5Var) {
        return q7.a(j5Var.a("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* renamed from: lambda$getCustomTabsNavigationStartedPostbacks$3$com-applovin-impl-sdk-nativeAd-AppLovinNativeAdImpl, reason: not valid java name */
    /* synthetic */ List m4950xcb790c80(j5 j5Var) {
        return q7.a(j5Var.a("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* renamed from: lambda$getCustomTabsTabHiddenPostbacks$8$com-applovin-impl-sdk-nativeAd-AppLovinNativeAdImpl, reason: not valid java name */
    /* synthetic */ List m4951xe255a3f3(j5 j5Var) {
        return q7.a(j5Var.a("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* renamed from: lambda$getCustomTabsTabShownPostbacks$7$com-applovin-impl-sdk-nativeAd-AppLovinNativeAdImpl, reason: not valid java name */
    /* synthetic */ List m4952xae013be5(j5 j5Var) {
        return q7.a(j5Var.a("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* renamed from: lambda$getDirectClickTrackingPostbacks$9$com-applovin-impl-sdk-nativeAd-AppLovinNativeAdImpl, reason: not valid java name */
    /* synthetic */ List m4953xc24c558e(j5 j5Var) {
        return q7.a(j5Var.a("click_tracking_urls", new JSONObject()), getClCode(), j5Var.a("click_tracking_url", (String) null), this.sdk);
    }

    /* renamed from: lambda$getOpenMeasurementVerificationScriptResources$10$com-applovin-impl-sdk-nativeAd-AppLovinNativeAdImpl, reason: not valid java name */
    /* synthetic */ List m4954x4e578947(JSONArray jSONArray) {
        if (jSONArray == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            try {
                URL url = new URL(JsonUtils.getString(jSONObject, "url", null));
                String string = JsonUtils.getString(jSONObject, "vendor_key", null);
                String string2 = JsonUtils.getString(jSONObject, "parameters", null);
                if (StringUtils.isValidString(string) && StringUtils.isValidString(string2)) {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(string, url, string2));
                } else {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                }
            } catch (Throwable th) {
                this.sdk.Q();
                if (p.a()) {
                    this.sdk.Q().a(this.tag, "Failed to parse OMID verification script resource", th);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: lambda$unregisterViewsForInteraction$0$com-applovin-impl-sdk-nativeAd-AppLovinNativeAdImpl, reason: not valid java name */
    /* synthetic */ void m4955xfd413d54() {
        for (View view : this.registeredViews) {
            view.setOnTouchListener(null);
            view.setOnClickListener(null);
        }
        this.sdk.Q();
        if (p.a()) {
            this.sdk.Q().a(this.tag, "Unregistered views: " + this.registeredViews);
        }
        this.registeredViews.clear();
        i8 i8Var = this.viewableMRC50Tracker;
        if (i8Var != null) {
            i8Var.b();
        }
        i8 i8Var2 = this.viewableMRC100Tracker;
        if (i8Var2 != null) {
            i8Var2.b();
        }
        i8 i8Var3 = this.viewableVideoMRC50Tracker;
        if (i8Var3 != null) {
            i8Var3.b();
        }
        ViewGroup viewGroup = this.nativeAdView;
        if (viewGroup != null) {
            viewGroup.removeOnAttachStateChangeListener(this.onAttachStateChangeHandler);
            this.nativeAdView = null;
        }
        AppLovinMediaView appLovinMediaView = this.mediaView;
        if (appLovinMediaView != null) {
            appLovinMediaView.destroy();
        }
        AppLovinOptionsView appLovinOptionsView = this.optionsView;
        if (appLovinOptionsView != null) {
            appLovinOptionsView.destroy();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Context context;
        this.sdk.Q();
        if (p.a()) {
            this.sdk.Q().a(this.tag, "Handle view clicked");
        }
        this.sdk.l().maybeSubmitPersistentPostbacks(getDirectClickTrackingPostbacks());
        if (((Boolean) this.sdk.a(z4.w)).booleanValue()) {
            context = g8.b(this.nativeAdView, this.sdk);
            if (context == null) {
                context = view.getContext();
            }
        } else {
            context = view.getContext();
        }
        handleNativeAdClick(this.clickDestinationUri, this.clickDestinationBackupUri, context);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public void registerViewsForInteraction(List<View> list, ViewGroup viewGroup) {
        this.nativeAdView = viewGroup;
        if (viewGroup.isAttachedToWindow()) {
            maybeHandleOnAttachedToWindow(this.nativeAdView);
        } else {
            this.nativeAdView.addOnAttachStateChangeListener(this.onAttachStateChangeHandler);
        }
        this.sdk.Q();
        if (p.a()) {
            this.sdk.Q().a(this.tag, "Registered ad view for impressions: " + this.nativeAdView);
        }
        if (this.clickDestinationUri == null && this.clickDestinationBackupUri == null) {
            this.sdk.Q();
            if (p.a()) {
                this.sdk.Q().a(this.tag, "Skipping click registration - no click URLs provided");
                return;
            }
            return;
        }
        for (View view : list) {
            if (view.hasOnClickListeners()) {
                this.sdk.Q();
                if (p.a()) {
                    this.sdk.Q().k(this.tag, "View has an onClickListener already - " + view);
                }
            }
            if (!view.isClickable()) {
                this.sdk.Q();
                if (p.a()) {
                    this.sdk.Q().k(this.tag, "View is not clickable - " + view);
                }
            }
            if (!view.isEnabled()) {
                this.sdk.Q();
                if (p.a()) {
                    this.sdk.Q().b(this.tag, "View is not enabled - " + view);
                }
            }
            if (view instanceof Button) {
                this.sdk.Q();
                if (p.a()) {
                    this.sdk.Q().a(this.tag, "Registering click for button: " + view);
                }
            } else {
                this.sdk.Q();
                if (p.a()) {
                    this.sdk.Q().a(this.tag, "Registering click for view: " + view);
                }
            }
            if (((Boolean) this.sdk.a(z4.J2)).booleanValue()) {
                view.setOnTouchListener(new AppLovinTouchToClickListener(this.sdk, z4.g0, viewGroup.getContext(), this));
            } else {
                view.setOnClickListener(this);
            }
            this.registeredViews.add(view);
        }
        this.sdk.Q();
        if (p.a()) {
            this.sdk.Q().a(this.tag, "Registered views: " + this.registeredViews);
        }
    }

    public void setEventListener(AppLovinNativeAdEventListener appLovinNativeAdEventListener) {
        this.eventListener = appLovinNativeAdEventListener;
    }

    public void setIconUri(Uri uri) {
        this.iconUri = uri;
    }

    public void setMainImageAspectRatio(float f) {
        this.mainImageAspectRatio = f;
    }

    public void setMainImageUri(Uri uri) {
        this.mainImageUri = uri;
    }

    public void setPrivacyIconUri(Uri uri) {
        this.privacyIconUri = uri;
    }

    public void setUpNativeAdViewComponents() {
        r7 r7Var = this.vastAd;
        if (r7Var == null || !r7Var.hasVideoUrl()) {
            this.mediaView = new AppLovinMediaView(this, this.sdk, l.p());
        } else {
            try {
                this.mediaView = new AppLovinVastMediaView(this, this.sdk, l.p());
            } catch (Throwable th) {
                this.sdk.Q();
                if (p.a()) {
                    this.sdk.Q().d(this.tag, "Failed to create MediaPlayer VAST media view. Falling back to static image for media view.", th);
                }
                this.sdk.E().a(TAG, "createMediaPlayerVASTMediaView", th);
                this.mediaView = new AppLovinMediaView(this, this.sdk, l.p());
            }
        }
        if (this.privacyDestinationUri != null) {
            this.optionsView = new AppLovinOptionsView(this, this.sdk, l.p());
            return;
        }
        this.sdk.Q();
        if (p.a()) {
            this.sdk.Q().a(this.tag, "Privacy icon will not render because no native ad privacy URL is provided.");
        }
    }

    public void setVideoView(View view) {
        this.videoView = view;
    }

    public boolean shouldCustomTabsTrackEvents() {
        return getBooleanFromAdObject("custom_tabs_should_track_events", Boolean.FALSE);
    }

    public String toString() {
        return "AppLovinNativeAd{adIdNumber=" + getAdIdNumber() + " - " + getTitle() + "}";
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public void unregisterViewsForInteraction() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                AppLovinNativeAdImpl.this.m4955xfd413d54();
            }
        });
    }

    private AppLovinNativeAdImpl(Builder builder) {
        super(builder.adObject, builder.fullResponse, builder.sdk);
        this.impressionTracked = new AtomicBoolean();
        this.registeredViews = new ArrayList();
        this.onAttachStateChangeHandler = new b(this);
        this.adEventTracker = new k4(this);
        this.title = builder.title;
        this.advertiser = builder.advertiser;
        this.body = builder.body;
        this.callToAction = builder.callToAction;
        this.iconUri = builder.iconUri;
        this.mainImageUri = builder.mainImageUri;
        this.mainImageAspectRatio = builder.mainImageAspectRatio;
        this.privacyIconUri = builder.privacyIconUri;
        r7 r7Var = builder.vastAd;
        this.vastAd = r7Var;
        this.clickDestinationUri = builder.clickDestinationUri;
        this.clickDestinationBackupUri = builder.clickDestinationBackupUri;
        this.clickTrackingUrls = builder.clickTrackingUrls;
        this.jsTrackers = builder.jsTrackers;
        this.clickTrackingRequests = builder.clickTrackingRequests;
        this.impressionRequests = builder.impressionRequests;
        Double d = builder.starRating;
        this.starRating = (d == null || d.doubleValue() < 3.0d) ? null : d;
        if (builder.privacyDestinationUri != null) {
            this.privacyDestinationUri = builder.privacyDestinationUri;
        } else if (!isDspAd() || getSdk().u0().c()) {
            this.privacyDestinationUri = Uri.parse(DEFAULT_APPLOVIN_PRIVACY_URL);
        }
        this.viewableMRC50Callback = new c(builder.viewableMRC50Requests);
        this.viewableMRC100Callback = new c(builder.viewableMRC100Requests);
        if (isCustomTabsEnabled()) {
            this.customTabsSession = this.sdk.A().a(this);
            this.sdk.A().b(getCustomTabsWarmupUrls(), this.customTabsSession);
        }
        if (r7Var != null && r7Var.hasVideoUrl()) {
            this.viewableVideoMRC50Callback = new c(builder.viewableVideo50Requests);
        }
        this.tag = "AppLovinNativeAd:" + getAdIdNumber();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.g4
    public k4 getAdEventTracker() {
        return this.adEventTracker;
    }

    @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
    public void onClick(View view, MotionEvent motionEvent) {
        Context context;
        this.sdk.Q();
        if (p.a()) {
            this.sdk.Q().a(this.tag, "Handle view clicked");
        }
        this.sdk.l().maybeSubmitPersistentPostbacks(getDirectClickTrackingPostbacks());
        if (((Boolean) this.sdk.a(z4.w)).booleanValue()) {
            context = g8.b(this.nativeAdView, this.sdk);
            if (context == null) {
                context = view.getContext();
            }
        } else {
            context = view.getContext();
        }
        handleNativeAdClick(this.clickDestinationUri, this.clickDestinationBackupUri, context);
    }
}
