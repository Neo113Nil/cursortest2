package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.VungleCreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.PersistentConcurrentHashMap;
import com.safedk.android.utils.e;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class t extends d {
    private static final String V = "creative_id";
    private static final String W = "callToActionDest";
    private static final String X = "callToActionUrl";
    private static final String Y = "info";
    private static final String Z = "impression auctioned but unsold";
    private static final String aA = "ad_market_id";
    private static final String aB = "APP_STORE_ID";
    private static final String aC = "CTA_BUTTON_URL";
    private static final String aD = "EC_CTA_URL";
    private static final String aE = "https://privacy.vungle.com/";
    private static final String aF = "vungle.com";
    private static final String aG = "adunit";
    private static final String aH = "AD_SOURCE";
    private static final String aI = "ADVERTISER_DOMAIN";
    private static final String aJ = "ads";
    private static final String aK = "APP_NAME";
    private static final String aL = "APP_DESCRIPTION";
    private static final String aM = "CTA_BUTTON_TEXT";
    private static final String aN = "MAIN_IMAGE";
    private static final String aO = "APP_ICON";
    private static final String aP = "vungle_playable";
    private static final String aQ = "MAIN_STREAM";
    private static final String aR = "STREAM_CHUNK_0";
    private static final String aS = "STREAM_CHUNK_1";
    private static final String aT = "V_";
    private static final String aU = "AD_EXPERIENCE";
    private static final String aV = "components";
    private static final String aW = "v_";
    private static final String aX = "events";
    private static final String aY = "html";
    private static final String aZ = "cta";
    private static final String aa = "request is rejected by filter";
    private static final String ab = "url";
    private static final String ac = "ORIGINAL_VIDEO_URL";
    private static final String ad = "showCloseIncentivized";
    private static final int ae = 9999;
    private static final String af = "placement_reference_id";
    private static final String ag = "cacheable_replacements";
    private static final String ah = "MAIN_VIDEO";
    private static final String ai = "postBundle";
    private static final String aj = "templateURL";
    private static final String ak = "template_type";
    private static final String al = "expiry";
    private static final String am = "adType";
    private static final String an = "ad_type";
    private static final String ao = "banner";
    private static final String ap = "mrec";
    private static final String aq = "native";
    private static final String ar = "fullscreen";
    private static final String as = "placements";
    private static final String at = "reference_id";
    private static final String au = "is_incentivized";
    private static final String av = "tpat";
    private static final String aw = "templateSettings";
    private static final String ax = "template_settings";
    private static final String ay = "normal_replacements";
    private static final String az = "clickUrl";
    public static final String b = "MAIN_VIDEO.mp4";
    private static final String ba = "originalUrl";
    private static PersistentConcurrentHashMap<String, VungleCreativeInfo> bb = null;
    private static PersistentConcurrentHashMap<Integer, VungleCreativeInfo> bc = null;
    private static PersistentConcurrentHashMap<String, VungleCreativeInfo> bd = null;
    private static PersistentConcurrentHashMap<String, Boolean> be = null;
    private static final Map<String, WeakReference<Object>> bf = new HashMap();
    private static final long bg = 259200000;
    public static final String c = "ad_markup";
    public static final String d = "com.vungle.warren.BuildConfig";
    public static final String e = "VERSION_NAME";
    public static final String f = "ADM_HTML";
    public static final String g = "EC_HTML";
    public static final String h = "adx.ads.vungle.com/api/v";
    public static final String i = "api.vungle.com/api/v";
    public static final String j = "adx-stage.ads.vungle.com/api/v";
    public static final String k = "api.vungle.com/config";
    public static final String l = "(function(){var sdkId=\"{{SDK_ID}}\";var address=\"{{ADDRESS}}\";var log=function(message){try{console.log(\"log Vungle privacy policy sdkId : \"+sdkId+\",address = \"+address+\", msg : \"+message);if(typeof window.webkit.messageHandlers.safedkDebug.postMessage===\"function\"){window.webkit.messageHandlers.safedkDebug.postMessage(\"Vungle-Liftoff detect privacy ,address \"+address+\", message : \"+message)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkDebug object missing\")}}catch(error){console.log(\"log : \"+error)}};log(\"script started sdkId = \"+sdkId+\", address = \"+address);var dialogboxElement=null;var addPrivacyObservers=function(){try{log(\"addPrivacyObservers started, trying with DIALOGBOX\");dialogboxElement=document.getElementById(\"DIALOGBOX\");if(!dialogboxElement){log(\"addPrivacyObservers trying again with privacy-dialog\");dialogboxElement=document.getElementById(\"privacy-dialog\")}if(!dialogboxElement){log(\"addPrivacyObservers trying again with privacy-popup\");dialogboxElement=document.getElementById(\"privacy-popup\")}log(\"addPrivacyObservers privacy-popup : \"+dialogboxElement);if(!dialogboxElement){log(\"addPrivacyObservers trying again with privacy-page\");dialogboxElement=document.getElementById(\"privacy-page\")}log(\"privacy-popup : \"+dialogboxElement);if(!dialogboxElement){log(\"addPrivacyObservers trying again with privacy-popup by class \");var elements=document.querySelectorAll(\"div#privacy-popup\");if(elements&&elements.length>0){log(\"found by class : \"+JSON.stringify(elements[0]));dialogboxElement=elements[0]}}log(\"dialogboxElement = \"+dialogboxElement);try{log(\"dialogboxElement (json) = \"+JSON.stringify(dialogboxElement))}catch(error){log(\"dialogboxElement error \"+error)}if(dialogboxElement&&dialogboxElement.hasAttribute(\"id\")){log(\"dialogboxElement.id ? \"+dialogboxElement.id)}if(dialogboxElement&&dialogboxElement.hasAttribute(\"aria-hidden\")){log(\"dialogboxElement.aria-hidden ? \"+dialogboxElement.getAttribute(\"aria-hidden\"))}if(dialogboxElement&&(dialogboxElement.style&&dialogboxElement.style.visibility||dialogboxElement.hasAttribute(\"id\")&&dialogboxElement.id==\"privacy-popup\")){log(\"addPrivacyObservers found element \"+JSON.stringify(dialogboxElement));var element_style_visibility=dialogboxElement.style&&dialogboxElement.style.visibility||dialogboxElement&&dialogboxElement.hasAttribute(\"id\")&&dialogboxElement.id==\"privacy-popup\"&&dialogboxElement.classList.contains(\"ytoTpW_show\");if(element_style_visibility){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}log(\"addPrivacyObservers element is visible\")}else{log(\"addPrivacyObservers element is not visible\");{dialogboxElement.safedkPrivacyDialogObserver=true;try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){switch(mutation.type){case\"attributes\":log(\"addPrivacyObservers Attribute name \"+mutation.attributeName+\" changed to \"+getComputedStyle(mutation.target).visibility+\" (was \"+mutation.oldValue+\")\");if(getComputedStyle(mutation.target).visibility==\"visible\"||mutation.target.classList.contains(\"ytoTpW_show\")){log(\"privacy dialog is visible \");if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}break}})});var config={attributes:true,attributeOldValue:true};observer.observe(dialogboxElement,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSamplingExc object missing\")}}}}}else{var privacyPageElement=document.getElementById(\"privacy-page\");if(privacyPageElement){var privacyPageParentElement=privacyPageElement.parentElement;if(privacyPageParentElement){var computedStyle=getComputedStyle(privacyPageParentElement);if(computedStyle){var displayState=computedStyle.display;if(displayState!=\"none\"){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}else{{privacyPageParentElement.safedkPrivacyDialogObserver=true;try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){switch(mutation.type){case\"attributes\":if(mutation.target.style.display!=\"none\"){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}break}})});var config={attributes:true,attributeOldValue:true,childList:true,subtree:true};observer.observe(privacyPageParentElement,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface Vungle pp object missing\")}}}}}}}}}catch(error){log(\"caught exception with error = \"+error+\", stack : \"+error.stack);if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSamplingExc object missing\")}}return dialogboxElement};var addAdClosureObservers=function(){try{log(\"addAdClosureObservers trying with incentivized-dialog\");var dialogboxElement=document.getElementById(\"incentivized-dialog\");if(dialogboxElement&&dialogboxElement.style&&dialogboxElement.style.visibility){log(\"addAdClosureObservers found element : \"+dialogboxElement);var element_style_visibility=dialogboxElement.style.visibility;if(element_style_visibility==\"visible\"){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface Vungle pp object missing\")}log(\"addAdClosureObservers element is visible\")}else{log(\"addAdClosureObservers element is not visible\");if(dialogboxElement.safedkPrivacyDialogObserver!=true){dialogboxElement.safedkPrivacyDialogObserver=true;try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){switch(mutation.type){case\"attributes\":if(getComputedStyle(mutation.target).visibility==\"visible\"){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}log(\"addAdClosureObservers Attribute name \"+mutation.attributeName+\" changed to \"+getComputedStyle(mutation.target).visibility+\" (was \"+mutation.oldValue+\")\");break}})});var config={attributes:true,attributeOldValue:true,attributeFilter:[\"style\"]};observer.observe(dialogboxElement,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSamplingExc object missing\")}log(\"addAdClosureObservers Error : \"+\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}}}}}catch(error){log(\"caught exception with error = \"+error);if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSamplingExc object missing\")}}};var monitorNotifications=function(){try{var divIds=[\"ad-notification-modal\",\"gdpr-notification-view\"];for(var divId of divIds){var element=document.getElementById(divId);if(element){var className=element.className;if(element.className.endsWith(\"show\")){log(\"element.className = \"+element.className);if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}else{if(element.safedkVisibilityObserver!=true){element.safedkVisibilityObserver=true;try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){if(mutation.type==\"attributes\"){if(mutation.target.className.endsWith(\"show\")){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}}})});var config={attributes:true,attributeOldValue:true,attributeFilter:[\"class\"]};observer.observe(element,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}}}}}}catch(error){log(\"caught exception with error = \"+error);if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}};var counter=0;setTimeout(()=>{if(!dialogboxElement&&counter<4){counter++;log(\"calling addPrivacyObservers() \"+counter);addPrivacyObservers()}},500);try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){for(const mutation of mutations){if(mutation.type===\"childList\"){}else if(mutation.type===\"attributes\"){log(mutation.attributeName+\" attribute was modified to \"+mutation.target.getAttribute(mutation.attributeName))}}mutations.forEach(function(mutation){for(var i=0;i<mutation.addedNodes.length;i++){var node=mutation.addedNodes[i];log(\"node iteration \"+i+\" : \"+JSON.stringify(node));if(node&&node.nodeName!=\"#text\"){addPrivacyObservers();addAdClosureObservers();monitorNotifications()}}})});var config={attributes:true,childList:true,subtree:true};observer.observe(document,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}})();\n";
    public static final String m = "mraid://";
    public static final String n = "url";
    private static final String o = "VungleDiscovery";
    private static final String p = "id";
    private static final String q = "campaign";

    public t() {
        super(com.safedk.android.utils.h.d, o);
        try {
            PersistentConcurrentHashMap<String, VungleCreativeInfo> persistentConcurrentHashMap = new PersistentConcurrentHashMap<>("VungleDiscoverycreativeToIdMap");
            bb = persistentConcurrentHashMap;
            Logger.d(o, "CI to ID map loaded, key set: ", persistentConcurrentHashMap.keySet());
            PersistentConcurrentHashMap<Integer, VungleCreativeInfo> persistentConcurrentHashMap2 = new PersistentConcurrentHashMap<>("VungleDiscoverymediaPlayerIdToCreativeInfo");
            bc = persistentConcurrentHashMap2;
            Logger.d(o, "media player to CI loaded, key set: ", persistentConcurrentHashMap2.keySet());
            PersistentConcurrentHashMap<String, VungleCreativeInfo> persistentConcurrentHashMap3 = new PersistentConcurrentHashMap<>("VungleDiscoveryadToIdMap");
            bd = persistentConcurrentHashMap3;
            Logger.d(o, "ad to ID map loaded, key set: ", persistentConcurrentHashMap3.keySet());
            PersistentConcurrentHashMap<String, Boolean> persistentConcurrentHashMap4 = new PersistentConcurrentHashMap<>("VungleDiscoveryplacementData");
            be = persistentConcurrentHashMap4;
            Logger.d(o, "placement data loaded, key set: ", persistentConcurrentHashMap4.keySet());
        } catch (InvalidParameterException e2) {
            Logger.e(o, "Error initializing ", o, ", caching will not be available", e2);
        }
        this.E.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_FULLSCREEN_ADS, true);
        this.E.b(AdNetworkConfiguration.JS_PRIVACY_BUTTON_CLICK_DETECTION_SCRIPT, l);
        this.E.a(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_MAX_AGE, bg);
        this.E.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, true);
        this.E.b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_PREFETCH_REUSE, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION, true);
        this.E.b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION, true);
        this.E.b(AdNetworkConfiguration.SHOULD_DELAY_BANNER_VIEWS_SCANNER, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_NATIVE_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_NATIVE_BANNERS_USING_BANNER_KEY, true);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<CreativeInfo> a(String str, String str2, Map<String, List<String>> map, c.a aVar, byte[] bArr) throws JSONException {
        JSONObject jSONObject;
        Object[] objArr = new Object[6];
        objArr[0] = "generate info started, url: ";
        objArr[1] = str;
        objArr[2] = ", buffer size: ";
        objArr[3] = str2 == null ? "0" : Integer.valueOf(str2.length());
        objArr[4] = ", maxParams: ";
        objArr[5] = aVar;
        Logger.d(o, objArr);
        List<CreativeInfo> list = null;
        try {
            jSONObject = new JSONObject(str2);
        } catch (Throwable th) {
            Logger.d(o, "Exception parsing prefetch : ", th.getMessage(), th);
        }
        if (str.contains(k)) {
            C(str2);
            return null;
        }
        if (CreativeInfoManager.i(str) || str.equals("@!1:ad_fetch@!")) {
            Logger.d(o, "Url is a mediation url");
            if (jSONObject.has(aG)) {
                Logger.d(o, "content contains an AdUnit field");
                String a = com.safedk.android.utils.c.a(Base64.decode(jSONObject.getString(aG), 0));
                Logger.printFullVerboseLog(o, "decodedAdUnitContent = ", a);
                if (com.safedk.android.utils.n.n(a)) {
                    jSONObject = new JSONObject(a);
                    Logger.d(o, "decodedAdUnitContent new JSONObject created");
                }
            }
        }
        boolean z = aVar != null && aVar.b == BrandSafetyEvent.AdFormatType.NATIVE;
        if (jSONObject.has("id")) {
            list = a(jSONObject, (String) null, z, aVar);
        } else if (jSONObject.has("ads")) {
            JSONArray jSONArray = jSONObject.getJSONArray("ads");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                JSONObject jSONObject3 = jSONObject2.getJSONObject(c);
                String string = jSONObject2.getString(af);
                if (c(jSONObject2)) {
                    list = a(jSONObject3, string, z, aVar);
                }
            }
        }
        if (list != null) {
            for (CreativeInfo creativeInfo : list) {
                if (z) {
                    creativeInfo.h(aVar.a);
                }
                synchronized (bb) {
                    if (!bb.contains(creativeInfo.N())) {
                        bb.put(creativeInfo.N(), (VungleCreativeInfo) creativeInfo);
                        Logger.d(o, "ci to ID map key added ", creativeInfo.N(), ", key set: ", bb.keySet());
                    }
                }
            }
        }
        return list;
    }

    private void C(String str) throws JSONException {
        Logger.printFullVerboseLog(o, "process placements started, buffer = ", str);
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("placements")) {
            JSONArray jSONArray = jSONObject.getJSONArray("placements");
            for (int i2 = 0; i2 < jSONArray.length() - 1; i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                if (jSONObject2.has(at) && jSONObject2.has(au)) {
                    be.put(jSONObject2.getString(at), Boolean.valueOf(jSONObject2.getBoolean(au)));
                    Logger.d(o, "process placements added ", jSONObject2.getString(at), " : ", Boolean.valueOf(jSONObject2.getBoolean(au)));
                } else {
                    Logger.d(o, "process placements placement does not contains ref_id/is_incentivized data : ", jSONObject2);
                }
            }
            return;
        }
        Logger.d(o, "process placements no placements array");
    }

    private void d(CreativeInfo creativeInfo, String str) {
        try {
            Matcher matcher = g.a("externalHtmlURL:\\s*\"([^\"]+)\"").matcher(str);
            if (matcher.find() && matcher.groupCount() > 0) {
                String trim = matcher.group(1).trim();
                Logger.d(o, "found vungle endcard url: ", trim);
                creativeInfo.H(trim);
            }
        } catch (Throwable th) {
            Logger.d(o, "extract vungle endcard url - exception occurred: ", th);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo b(Object obj) {
        Logger.d(o, "match info - started. ad instance= ", obj);
        if (obj instanceof String) {
            String str = (String) obj;
            Logger.d(o, "match info - started. ad id found= ", str);
            if (!TextUtils.isEmpty(str)) {
                VungleCreativeInfo vungleCreativeInfo = bd.get(str);
                Logger.d(o, "match info - FOUND by ad id= ", obj, ",    ci= ", vungleCreativeInfo);
                return vungleCreativeInfo;
            }
            return null;
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean n(String str) {
        VungleCreativeInfo vungleCreativeInfo = bd.get(str);
        WeakReference<Object> remove = bf.remove(str);
        if (vungleCreativeInfo != null && vungleCreativeInfo.K() == BrandSafetyUtils.AdType.NATIVE && remove != null) {
            Logger.d(o, Logger.FeatureTag.CI_MATCHING, "try reverse matching - value= ", str, ",   matching ref= ", remove, ",    ci= ", vungleCreativeInfo.aa());
            CreativeInfoManager.b(com.safedk.android.utils.h.d, str, remove.get());
        }
        return false;
    }

    private String a(JSONObject jSONObject) {
        JSONArray optJSONArray;
        JSONObject optJSONObject;
        try {
            if (jSONObject.has(aG)) {
                String a = com.safedk.android.utils.c.a(Base64.decode(jSONObject.getString(aG), 0));
                if (com.safedk.android.utils.n.n(a) && (optJSONArray = new JSONObject(a).optJSONArray("ads")) != null && optJSONArray.length() > 0 && (optJSONObject = optJSONArray.getJSONObject(0).optJSONObject(c)) != null) {
                    String optString = optJSONObject.optString("id");
                    Logger.d(o, "get ad id from prefetch - ad id found= ", optString);
                    return optString;
                }
            }
        } catch (JSONException e2) {
            Logger.d(o, "get ad id from prefetch - exception: ", e2);
        }
        Logger.d(o, "get ad id from prefetch - could not find ad id");
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(Object obj, Object obj2) {
        Logger.d(o, "save matching object for reverse matching - matching object= ", obj2);
        if (obj instanceof String) {
            String str = (String) obj;
            if (com.safedk.android.utils.n.n(str)) {
                try {
                    String a = a(new JSONObject(str));
                    if (!TextUtils.isEmpty(a) && obj2 != null) {
                        bf.put(a, new WeakReference<>(obj2));
                        Logger.d(o, Logger.FeatureTag.CI_MATCHING, "save matching object for reverse matching - saving ad id= ", a, ",     matching object= ", obj2);
                    }
                } catch (JSONException e2) {
                    Logger.d(o, "match info - exception: ", e2);
                }
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String c(String str, String str2) {
        String D = D(str2);
        if (D == null) {
            D = D(str);
        }
        if (D != null) {
            Logger.d(o, Logger.FeatureTag.CI_MATCHING, "get ad ID from resource returned ad ID: ", D);
            return D;
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public int i(String str) {
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void b(Object obj, Object obj2) {
        try {
            Logger.d(o, "handle media player set data source call, media player: ", obj, ", video file: ", obj2);
            Uri uri = (Uri) obj2;
            Logger.d(o, "handle media player set data source call, uri: ", uri.toString());
            VungleCreativeInfo a = a(new File(uri.getPath()));
            if (a != null && !bc.containsKey(Integer.valueOf(System.identityHashCode(obj)))) {
                Logger.d(o, "handle media player set data source call, adding CI to map");
                synchronized (bc) {
                    bc.put(Integer.valueOf(System.identityHashCode(obj)), a);
                }
            }
        } catch (Exception e2) {
            Logger.e(o, "exception when trying to add mediaPlayer id and VungleCreativeInfo ", e2.getMessage());
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String c(Object obj) {
        VungleCreativeInfo remove;
        VungleCreativeInfo remove2;
        try {
            Logger.d(o, "get CI after media player start call, media player: ", obj);
            synchronized (bc) {
                remove = bc.remove(Integer.valueOf(System.identityHashCode(obj)));
            }
            if (remove != null) {
                synchronized (bb) {
                    remove2 = bb.remove(remove.N());
                }
                if (remove2 == null) {
                    Logger.d(o, "Cannot find ", remove.N(), " in creative to ID map");
                } else {
                    Logger.d(o, "creative to ID map key '", remove.N(), "'removed, key set: ", bb.keySet());
                }
                Logger.d(o, "get CI after media player start call - returning ", remove.L(), " as ad ID");
                return remove.L();
            }
            Logger.d(o, "get CI after media player start call - cannot find creative in media player ID to CI map");
            return null;
        } catch (Exception e2) {
            Logger.e(o, "exception when trying to remove from media player ID to CI map", e2.getMessage());
            return null;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean B(String str) {
        Logger.d(o, "should follow get url: ", str);
        if (str.toLowerCase().endsWith(b.toLowerCase())) {
            Logger.d(o, "should follow get url - returning true for url: ", str);
            return true;
        }
        if (str.equals(aE)) {
            Logger.d(o, "Vungle privacy policy url invoked");
            CreativeInfoManager.b(com.safedk.android.utils.h.d, (String) null);
        }
        String D = D(str);
        if (D != null && D.length() > 0) {
            if (bd.containsKey(D)) {
                Logger.d(o, "ad to ID map contains creative ID: ", D, ", returning true");
                return true;
            }
            Logger.d(o, "ad to ID map does not contain creative ID: ", D, " , key set : ", bd.keySet());
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean b(String str, Bundle bundle) {
        boolean z = str.contains(h) || str.contains(i) || str.contains(j) || str.contains(k);
        if (z) {
            Logger.d(o, "should follow input stream, url: ", str);
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v55, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v90 */
    /* JADX WARN: Type inference failed for: r12v96 */
    /* JADX WARN: Type inference failed for: r12v99 */
    /* JADX WARN: Type inference failed for: r16v26 */
    /* JADX WARN: Type inference failed for: r16v27 */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.util.List<com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo>] */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r39v0, types: [com.safedk.android.analytics.brandsafety.creatives.discoveries.t] */
    private List<CreativeInfo> a(JSONObject jSONObject, String str, boolean z, c.a aVar) {
        String str2;
        char c2;
        ?? r12;
        Throwable th;
        ?? r16;
        char c3;
        String str3;
        ArrayList arrayList;
        ArrayList<String> arrayList2;
        JSONObject jSONObject2;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z2;
        String string;
        String str8;
        String str9;
        String str10;
        String str11;
        JSONObject jSONObject3;
        long j2;
        ArrayList<String> arrayList3;
        BrandSafetyEvent.AdFormatType adFormatType;
        String str12;
        String str13;
        boolean z3;
        String str14;
        String str15;
        Iterator<String> it;
        JSONObject jSONObject4;
        int i2;
        ?? r122;
        boolean z4;
        try {
            ArrayList arrayList4 = new ArrayList();
            String string2 = jSONObject.getString("id");
            Logger.d(o, "get CI from Json ad ID: ", string2);
            if (string2.equals("")) {
                try {
                    if (jSONObject.has(Y) && (jSONObject.getString(Y).equals(Z) || jSONObject.getString(Y).equals(aa))) {
                        Logger.d(o, "get CI from Json No fill, exiting");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    str3 = null;
                    c3 = 2;
                    c2 = 1;
                    r16 = str3;
                    Object[] objArr = new Object[3];
                    objArr[0] = "get CI from Json object exception: ";
                    objArr[c2] = th.getMessage();
                    objArr[c3] = th;
                    Logger.e(o, objArr);
                    return r16;
                }
            }
            ArrayList<String> arrayList5 = new ArrayList<>();
            JSONObject jSONObject5 = jSONObject.has(aw) ? jSONObject.getJSONObject(aw) : jSONObject.has(ax) ? jSONObject.getJSONObject(ax) : null;
            if (jSONObject5 == null || !jSONObject5.has(ay)) {
                arrayList = arrayList4;
                arrayList2 = arrayList5;
                jSONObject2 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                z2 = false;
            } else {
                JSONObject jSONObject6 = jSONObject5.getJSONObject(ay);
                str7 = jSONObject6.has(aH) ? jSONObject6.getString(aH) : null;
                try {
                    str5 = jSONObject6.has(aI) ? jSONObject6.getString(aI) : null;
                    if (jSONObject6.has(g)) {
                        String optString = jSONObject6.optString(g);
                        byte[] decode = !TextUtils.isEmpty(optString) ? Base64.decode(optString, 0) : null;
                        str6 = decode != null ? com.safedk.android.utils.c.a(decode) : null;
                        if (str6 != null) {
                            arrayList = arrayList4;
                            Logger.d(o, "found EC_HTML content");
                            z4 = true;
                        } else {
                            arrayList = arrayList4;
                            z4 = false;
                        }
                    } else {
                        arrayList = arrayList4;
                        if (jSONObject6.has(f)) {
                            String string3 = jSONObject6.getString(f);
                            if (TextUtils.isEmpty(string3)) {
                                str6 = string3;
                                z4 = false;
                            } else {
                                str6 = new String(Base64.decode(string3, 0));
                                z4 = false;
                            }
                        } else {
                            z4 = false;
                            str6 = null;
                        }
                    }
                    boolean z5 = z4;
                    Logger.d(o, "get CI from Json HTML is: ", str6);
                    if (TextUtils.isEmpty(str6)) {
                        arrayList2 = arrayList5;
                        jSONObject2 = jSONObject6;
                        z2 = z5;
                        str4 = null;
                    } else {
                        ArrayList<String> f2 = com.safedk.android.utils.n.f(str6);
                        String F = F(str6);
                        String str16 = str5;
                        Logger.d(o, "get CI from Json HTML clickUrl : ", F);
                        str4 = F;
                        arrayList2 = f2;
                        jSONObject2 = jSONObject6;
                        z2 = z5;
                        str5 = str16;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c3 = 2;
                    c2 = 1;
                    r16 = 0;
                    Object[] objArr2 = new Object[3];
                    objArr2[0] = "get CI from Json object exception: ";
                    objArr2[c2] = th.getMessage();
                    objArr2[c3] = th;
                    Logger.e(o, objArr2);
                    return r16;
                }
            }
            try {
                JSONObject jSONObject7 = jSONObject.has("tpat") ? jSONObject.getJSONObject("tpat") : null;
                if (str4 == null && jSONObject2 != null && jSONObject2.has(aC)) {
                    r122 = null;
                    try {
                        str4 = jSONObject2.optString(aC, null);
                    } catch (Throwable th4) {
                        th = th4;
                        str3 = r122;
                        c3 = 2;
                        c2 = 1;
                        r16 = str3;
                        Object[] objArr22 = new Object[3];
                        objArr22[0] = "get CI from Json object exception: ";
                        objArr22[c2] = th.getMessage();
                        objArr22[c3] = th;
                        Logger.e(o, objArr22);
                        return r16;
                    }
                }
                if (str4 == null && jSONObject2 != null && jSONObject2.has(aD)) {
                    str4 = jSONObject2.optString(aD, null);
                }
                if (str4 == null && jSONObject.has(X)) {
                    str4 = jSONObject.getString(X);
                }
                if (str4 == null && jSONObject7 != null && jSONObject7.has("clickUrl")) {
                    r122 = null;
                    str4 = jSONObject7.optString("clickUrl", null);
                }
                String str17 = str6;
                Logger.d(o, "get CI from Json clickUrl processing ", str4);
                if (com.safedk.android.utils.n.a((Object) str4)) {
                    Logger.d(o, "handle app package name debug url = ", str4, ", packageId = ", com.safedk.android.utils.n.o(str4));
                }
                if (TextUtils.isEmpty(str4) || !com.safedk.android.utils.n.n(str4)) {
                    str4 = str4;
                } else {
                    try {
                        JSONArray jSONArray = new JSONArray(str4);
                        if (jSONArray.length() > 0) {
                            str4 = (String) jSONArray.get(0);
                        }
                        i2 = 2;
                    } catch (Throwable th5) {
                        i2 = 2;
                        Logger.d(o, "get CI from Json clickUrl processing exception :", th5.getMessage(), th5);
                        str4 = str4;
                    }
                    Object[] objArr3 = new Object[i2];
                    objArr3[0] = "get CI from Json clickUrl processing unescaped = ";
                    objArr3[1] = str4;
                    Logger.d(o, objArr3);
                }
                Map<String, String> b2 = b(jSONObject7);
                if (str4 == null && b2.containsKey("clickUrl_0")) {
                    str4 = b2.remove("clickUrl_0");
                }
                if (jSONObject.has("campaign")) {
                    String string4 = jSONObject.getString("campaign");
                    if (string4 != null && !string4.equals(AbstractJsonLexerKt.NULL)) {
                        string = string4.split("\\|")[1];
                    }
                    Logger.d(o, "get CI from Json Campaign is null, exiting");
                    return null;
                }
                string = jSONObject.has("creative_id") ? jSONObject.getString("creative_id") : null;
                JSONObject jSONObject8 = jSONObject7;
                Logger.d(o, "get CI from Json creativeId is ", string);
                if (jSONObject.has("url")) {
                    str9 = jSONObject.getString("url");
                    str8 = str5;
                    Logger.d(o, "get CI from Json, video URL from ", "url", ": ", str9);
                } else {
                    str8 = str5;
                    if (jSONObject2 == null || !jSONObject2.has(ac)) {
                        str9 = null;
                    } else {
                        str9 = jSONObject2.getString(ac);
                        Logger.d(o, "get CI from Json, video URL from ", ac, ": ", str9);
                    }
                }
                if (jSONObject.has(ai)) {
                    str11 = jSONObject.getString(ai);
                    str10 = str7;
                    Logger.d(o, "get CI from Json zip files bundle identified ", str11, " in ", ai);
                } else {
                    str10 = str7;
                    if (jSONObject.has(aj)) {
                        str11 = jSONObject.getString(aj);
                        Logger.d(o, "get CI from Json zip files bundle identified ", str11, " in ", aj);
                    } else {
                        Logger.d(o, "get CI from Json zip files bundle not present in prefetch data");
                        str11 = null;
                    }
                }
                if (jSONObject5 == null || !jSONObject5.has(ag)) {
                    jSONObject3 = null;
                } else {
                    JSONObject jSONObject9 = jSONObject5.getJSONObject(ag);
                    if (TextUtils.isEmpty(str9) && jSONObject9.has("MAIN_VIDEO")) {
                        str9 = jSONObject9.getJSONObject("MAIN_VIDEO").optString("url");
                        Logger.d(o, "get CI from Json, video URL from ", "MAIN_VIDEO", ": ", str9);
                        jSONObject3 = jSONObject9;
                    } else {
                        jSONObject3 = jSONObject9;
                    }
                }
                if (TextUtils.isEmpty(str9) && jSONObject2 != null && jSONObject2.has(aQ)) {
                    str9 = jSONObject2.optString(aQ);
                    Logger.d(o, "get CI from Json, video URL from ", aQ, ": ", str9);
                }
                if (TextUtils.isEmpty(str9) && jSONObject3 != null) {
                    if (jSONObject3.has(aR)) {
                        str9 = jSONObject3.getJSONObject(aR).optString("url");
                        Logger.d(o, "get CI from Json, video URL from ", aR, ": ", str9);
                    } else if (jSONObject3.has(aS)) {
                        str9 = jSONObject3.getJSONObject(aS).optString("url");
                        Logger.d(o, "get CI from Json, video URL from ", aS, ": ", str9);
                    } else if (jSONObject3.has("V__0")) {
                        str9 = jSONObject3.getJSONObject("V__0").optString("url");
                        Logger.d(o, "get CI from Json, video URL from ", aT, "_0: ", str9);
                    }
                }
                JSONObject jSONObject10 = jSONObject2;
                long currentTimeMillis = System.currentTimeMillis() + this.E.e(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_MAX_AGE);
                Logger.d(o, "get CI from Json expiration initial value (now, 1 week) = ", Long.valueOf(currentTimeMillis));
                if (jSONObject.has(al)) {
                    long j3 = jSONObject.getLong(al) * 1000;
                    Logger.d(o, "get CI from Json expiration override, new values is ", Long.valueOf(j3));
                    j2 = j3;
                } else {
                    j2 = currentTimeMillis;
                }
                BrandSafetyUtils.AdType adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                try {
                    String optString2 = jSONObject.optString(ak, null);
                    Logger.d(o, "get CI from Json templateType is ", optString2);
                    BrandSafetyUtils.AdType adType2 = (optString2 == null || !optString2.equals("banner")) ? (optString2 == null || !optString2.equals("mrec")) ? (optString2 == null || !optString2.equals("native")) ? (optString2 == null || !optString2.equals("fullscreen")) ? adType : BrandSafetyUtils.AdType.INTERSTITIAL : BrandSafetyUtils.AdType.NATIVE : BrandSafetyUtils.AdType.MREC : BrandSafetyUtils.AdType.BANNER;
                    if (adType2 != BrandSafetyUtils.AdType.INTERSTITIAL) {
                        arrayList3 = arrayList2;
                        adFormatType = adType2.equals(BrandSafetyUtils.AdType.BANNER) ? BrandSafetyEvent.AdFormatType.BANNER : adType2.equals(BrandSafetyUtils.AdType.MREC) ? BrandSafetyEvent.AdFormatType.MREC : null;
                    } else if (str == null || !be.containsKey(str)) {
                        arrayList3 = arrayList2;
                        Logger.d(o, "get CI from Json process placements data does not contain the placement ", str, ", will try to determine based on REWARDED_VALUE");
                        adFormatType = jSONObject.optInt(ad) == ae ? BrandSafetyEvent.AdFormatType.REWARD : BrandSafetyEvent.AdFormatType.INTER;
                    } else {
                        BrandSafetyEvent.AdFormatType adFormatType2 = be.get(str).booleanValue() ? BrandSafetyEvent.AdFormatType.REWARD : BrandSafetyEvent.AdFormatType.INTER;
                        arrayList3 = arrayList2;
                        Logger.d(o, "get CI from Json process placements placement ", str, " is ", adFormatType2);
                        adFormatType = adFormatType2;
                    }
                    ArrayList<String> f3 = com.safedk.android.utils.n.f(jSONObject.toString());
                    if (jSONObject3 != null) {
                        Iterator<String> keys = jSONObject3.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            if (!next.startsWith(aT) || next.endsWith("_0")) {
                                it = keys;
                                jSONObject4 = jSONObject3;
                            } else {
                                String optString3 = jSONObject3.getJSONObject(next).optString("url");
                                f3.remove(optString3);
                                it = keys;
                                jSONObject4 = jSONObject3;
                                Logger.d(o, "get CI from Json, remove url (", next, ") from prefetch resources list: ", optString3);
                            }
                            keys = it;
                            jSONObject3 = jSONObject4;
                        }
                    }
                    if (TextUtils.isEmpty(str4) || str4.contains(aF)) {
                        Object[] objArr4 = new Object[2];
                        objArr4[0] = "get CI from Json clickUrl discarded : ";
                        str12 = null;
                        try {
                            objArr4[1] = null;
                            Logger.printFullVerboseLog(o, objArr4);
                            str4 = null;
                        } catch (Throwable th6) {
                            th = th6;
                            str2 = str12;
                            r12 = 2;
                            c2 = 1;
                            th = th;
                            c3 = r12;
                            r16 = str2;
                            Object[] objArr222 = new Object[3];
                            objArr222[0] = "get CI from Json object exception: ";
                            objArr222[c2] = th.getMessage();
                            objArr222[c3] = th;
                            Logger.e(o, objArr222);
                            return r16;
                        }
                    } else {
                        Logger.printFullVerboseLog(o, "get CI from Json clickUrl : ", str4);
                        str12 = null;
                    }
                    try {
                        String string5 = jSONObject.has(am) ? jSONObject.getString(am) : jSONObject.has("ad_type") ? jSONObject.getString("ad_type") : str12;
                        if (string5 == null || !"native".equals(optString2)) {
                            str13 = string5;
                        } else {
                            str13 = string5 + "/" + optString2;
                        }
                        Logger.d(o, "get CI from Json struct : ", str13);
                        Object[] objArr5 = new Object[12];
                        objArr5[0] = "get CI from Json adtype = ";
                        objArr5[1] = adType2 != null ? adType2.name() : AbstractJsonLexerKt.NULL;
                        objArr5[2] = ", id: ";
                        objArr5[3] = string2;
                        objArr5[4] = ", click url: ";
                        objArr5[5] = str4;
                        objArr5[6] = ", creative id: ";
                        objArr5[7] = string;
                        objArr5[8] = ", video url: ";
                        objArr5[9] = str9;
                        objArr5[10] = "postBundle = ";
                        objArr5[11] = str11 != null ? str11 : "";
                        Logger.d(o, objArr5);
                        BrandSafetyUtils.AdType adType3 = adType2;
                        str2 = str4;
                        VungleCreativeInfo vungleCreativeInfo = new VungleCreativeInfo(adType2, string2, string, str2, str9, adFormatType, str, this.I, j2, str13);
                        if ("native".equals(optString2)) {
                            z3 = z;
                            a(vungleCreativeInfo, jSONObject, z3);
                        } else {
                            vungleCreativeInfo.b((List<String>) f3);
                            vungleCreativeInfo.b((List<String>) arrayList3);
                            z3 = z;
                        }
                        if (str10 != null) {
                            str14 = str10;
                            vungleCreativeInfo.m(str14);
                        } else {
                            str14 = str10;
                        }
                        if (str8 != null) {
                            str15 = str8;
                            vungleCreativeInfo.i(str15);
                        } else {
                            str15 = str8;
                        }
                        if (z2) {
                            d(vungleCreativeInfo, str17);
                            FileUploadManager.a().a(new FileUploadManager.FileUploadData(aP, str17, vungleCreativeInfo.L()));
                        }
                        r12 = o;
                        c2 = 0;
                        Logger.d(o, "get CI from Json - buyer id is: ", str14, " and ad domain is: ", str15);
                        synchronized (bd) {
                            try {
                                try {
                                    bd.put(string2, vungleCreativeInfo);
                                } catch (Throwable th7) {
                                    th = th7;
                                    while (true) {
                                        try {
                                            throw th;
                                        } catch (Throwable th8) {
                                            th = th8;
                                        }
                                    }
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                th = th;
                                c3 = r12;
                                r16 = str2;
                                Object[] objArr2222 = new Object[3];
                                objArr2222[0] = "get CI from Json object exception: ";
                                objArr2222[c2] = th.getMessage();
                                objArr2222[c3] = th;
                                Logger.e(o, objArr2222);
                                return r16;
                            }
                        }
                        if ("native".equals(optString2) && !z3 && aVar != null) {
                            String str18 = aVar.c + "_" + aVar.a + "_" + com.safedk.android.utils.h.d;
                            Logger.d(o, "get CI from Json - saving native banner ad with id= ", str18);
                            synchronized (bd) {
                                bd.put(str18, vungleCreativeInfo);
                            }
                        }
                        if (str9 != null && !z3) {
                            vungleCreativeInfo.b(Arrays.asList(str9));
                        }
                        if (str11 != null && !z3) {
                            Logger.d(o, "get CI from Json adding zip files bundle ", str11, " to prefetch resources");
                            vungleCreativeInfo.c(Arrays.asList(str11));
                        }
                        if (b2.size() > 0) {
                            for (String str19 : b2.values()) {
                                if (vungleCreativeInfo.v(str19)) {
                                    Logger.d(o, "get CI from Json adding url to CI dsp domains: ", str19);
                                    vungleCreativeInfo.x(str19);
                                }
                            }
                        }
                        a(vungleCreativeInfo, jSONObject, jSONObject10, jSONObject8);
                        ArrayList arrayList6 = arrayList;
                        Map<String, VungleCreativeInfo> a = a(jSONObject10, str, adType3, string2, string, adFormatType, j2, str13);
                        if (a.size() < 2) {
                            arrayList6.add(vungleCreativeInfo);
                        } else {
                            for (String str20 : a.keySet()) {
                                VungleCreativeInfo vungleCreativeInfo2 = a.get(str20);
                                if (str20.endsWith("_0")) {
                                    Logger.d(o, "get CI from Json adding, merge main ad with first multi ad");
                                    vungleCreativeInfo2 = vungleCreativeInfo.a(vungleCreativeInfo2);
                                }
                                vungleCreativeInfo2.u("multiAd:" + str20);
                                vungleCreativeInfo2.e(vungleCreativeInfo2.h() + CreativeInfo.aI + CreativeInfo.aG + a.size());
                                arrayList6.add(vungleCreativeInfo2);
                            }
                        }
                        return arrayList6;
                    } catch (Throwable th10) {
                        th = th10;
                        str3 = str12;
                        c3 = 2;
                        c2 = 1;
                        r16 = str3;
                        Object[] objArr22222 = new Object[3];
                        objArr22222[0] = "get CI from Json object exception: ";
                        objArr22222[c2] = th.getMessage();
                        objArr22222[c3] = th;
                        Logger.e(o, objArr22222);
                        return r16;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    str2 = null;
                }
            } catch (Throwable th12) {
                th = th12;
                r12 = 2;
                c2 = 1;
                str2 = null;
            }
        } catch (Throwable th13) {
            th = th13;
            str2 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0156 A[Catch: all -> 0x01e2, TryCatch #0 {all -> 0x01e2, blocks: (B:3:0x001d, B:5:0x0023, B:7:0x0044, B:8:0x004c, B:10:0x0052, B:12:0x0061, B:19:0x0071, B:22:0x0078, B:24:0x00a1, B:25:0x00bb, B:27:0x00c1, B:28:0x00db, B:30:0x00e1, B:32:0x00eb, B:34:0x00f1, B:35:0x0110, B:37:0x0116, B:39:0x0120, B:40:0x0146, B:42:0x0156, B:43:0x017e, B:45:0x0186, B:47:0x0195, B:49:0x019b, B:50:0x01a3, B:52:0x01a9, B:54:0x01b5, B:59:0x01c7), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0186 A[Catch: all -> 0x01e2, TryCatch #0 {all -> 0x01e2, blocks: (B:3:0x001d, B:5:0x0023, B:7:0x0044, B:8:0x004c, B:10:0x0052, B:12:0x0061, B:19:0x0071, B:22:0x0078, B:24:0x00a1, B:25:0x00bb, B:27:0x00c1, B:28:0x00db, B:30:0x00e1, B:32:0x00eb, B:34:0x00f1, B:35:0x0110, B:37:0x0116, B:39:0x0120, B:40:0x0146, B:42:0x0156, B:43:0x017e, B:45:0x0186, B:47:0x0195, B:49:0x019b, B:50:0x01a3, B:52:0x01a9, B:54:0x01b5, B:59:0x01c7), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a9 A[Catch: all -> 0x01e2, TryCatch #0 {all -> 0x01e2, blocks: (B:3:0x001d, B:5:0x0023, B:7:0x0044, B:8:0x004c, B:10:0x0052, B:12:0x0061, B:19:0x0071, B:22:0x0078, B:24:0x00a1, B:25:0x00bb, B:27:0x00c1, B:28:0x00db, B:30:0x00e1, B:32:0x00eb, B:34:0x00f1, B:35:0x0110, B:37:0x0116, B:39:0x0120, B:40:0x0146, B:42:0x0156, B:43:0x017e, B:45:0x0186, B:47:0x0195, B:49:0x019b, B:50:0x01a3, B:52:0x01a9, B:54:0x01b5, B:59:0x01c7), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Map<String, VungleCreativeInfo> a(JSONObject jSONObject, String str, BrandSafetyUtils.AdType adType, String str2, String str3, BrandSafetyEvent.AdFormatType adFormatType, long j2, String str4) {
        JSONObject jSONObject2;
        String str5;
        String str6;
        String str7;
        Map<String, String> map;
        ArrayList<String> arrayList;
        VungleCreativeInfo vungleCreativeInfo;
        String str8 = "clickUrl_0";
        HashMap hashMap = new HashMap();
        int i2 = 2;
        int i3 = 1;
        char c2 = 0;
        try {
            if (jSONObject.has(aU)) {
                Logger.d(o, "get multi ad CIs, AD_EXPERIENCE element found");
                JSONObject jSONObject3 = new JSONObject(new String(Base64.decode(jSONObject.getString(aU), 0)));
                if (jSONObject3.has(aV)) {
                    JSONObject jSONObject4 = jSONObject3.getJSONObject(aV);
                    Iterator<String> keys = jSONObject4.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (!next.startsWith(aW)) {
                            jSONObject2 = jSONObject4;
                            str5 = str8;
                        } else {
                            Matcher matcher = g.a("(v_\\d).*").matcher(next);
                            if (!matcher.find()) {
                                i2 = 2;
                                i3 = 1;
                                c2 = 0;
                            } else if (matcher.groupCount() != 0) {
                                String group = matcher.group(i3);
                                Object[] objArr = new Object[4];
                                objArr[c2] = "get multi ad CIs, multi ad key: ";
                                objArr[i3] = next;
                                objArr[i2] = ", ad index: ";
                                objArr[3] = group;
                                Logger.d(o, objArr);
                                JSONObject jSONObject5 = jSONObject4.getJSONObject(next);
                                if (!jSONObject5.has("url")) {
                                    str6 = null;
                                } else {
                                    str6 = jSONObject5.getJSONObject("url").optString(ba);
                                    Object[] objArr2 = new Object[i2];
                                    objArr2[c2] = "get multi ad CIs, multi ad video url: ";
                                    objArr2[1] = str6;
                                    Logger.d(o, objArr2);
                                }
                                if (!jSONObject5.has("cta")) {
                                    str7 = null;
                                } else {
                                    str7 = jSONObject5.getJSONObject("cta").optString("url");
                                    Object[] objArr3 = new Object[i2];
                                    objArr3[0] = "get multi ad CIs, multi ad cta click url: ";
                                    objArr3[1] = str7;
                                    Logger.d(o, objArr3);
                                }
                                if (jSONObject5.has("events")) {
                                    map = b(jSONObject5.getJSONObject("events"));
                                    if (str7 != null || !map.containsKey(str8)) {
                                        jSONObject2 = jSONObject4;
                                    } else {
                                        str7 = map.remove(str8);
                                        jSONObject2 = jSONObject4;
                                        Object[] objArr4 = new Object[i2];
                                        objArr4[0] = "get multi ad CIs, multi ad event click url: ";
                                        objArr4[1] = str7;
                                        Logger.d(o, objArr4);
                                    }
                                } else {
                                    jSONObject2 = jSONObject4;
                                    map = null;
                                }
                                if (jSONObject5.has("html")) {
                                    String string = jSONObject5.getString("html");
                                    if (!TextUtils.isEmpty(string)) {
                                        String str9 = new String(Base64.decode(string, 0));
                                        ArrayList<String> f2 = com.safedk.android.utils.n.f(str9);
                                        str7 = F(str9);
                                        Logger.d(o, "get multi ad CIs, multi ad html click url: ", str7);
                                        arrayList = f2;
                                        ArrayList<String> f3 = com.safedk.android.utils.n.f(jSONObject5.toString());
                                        vungleCreativeInfo = (VungleCreativeInfo) hashMap.get(group);
                                        if (vungleCreativeInfo == null) {
                                            str5 = str8;
                                        } else {
                                            str5 = str8;
                                            vungleCreativeInfo = new VungleCreativeInfo(adType, str2, str3, str7, str6, adFormatType, str, this.I, j2, str4);
                                            vungleCreativeInfo.ao();
                                            hashMap.put(group, vungleCreativeInfo);
                                        }
                                        vungleCreativeInfo.b((List<String>) f3);
                                        vungleCreativeInfo.b((List<String>) arrayList);
                                        if (str6 != null) {
                                            vungleCreativeInfo.b(Arrays.asList(str6));
                                        }
                                        if (map != null && map.size() > 0) {
                                            for (String str10 : map.values()) {
                                                if (vungleCreativeInfo.v(str10)) {
                                                    Logger.d(o, "get multi ad CIs, adding url to CI dsp domains: ", str10);
                                                    vungleCreativeInfo.x(str10);
                                                }
                                            }
                                        }
                                        a(vungleCreativeInfo, str7, map);
                                    }
                                }
                                arrayList = null;
                                ArrayList<String> f32 = com.safedk.android.utils.n.f(jSONObject5.toString());
                                vungleCreativeInfo = (VungleCreativeInfo) hashMap.get(group);
                                if (vungleCreativeInfo == null) {
                                }
                                vungleCreativeInfo.b((List<String>) f32);
                                vungleCreativeInfo.b((List<String>) arrayList);
                                if (str6 != null) {
                                }
                                if (map != null) {
                                    while (r0.hasNext()) {
                                    }
                                }
                                a(vungleCreativeInfo, str7, map);
                            }
                        }
                        jSONObject4 = jSONObject2;
                        str8 = str5;
                        i2 = 2;
                        i3 = 1;
                        c2 = 0;
                    }
                }
            }
        } catch (Throwable th) {
            Logger.d(o, "get multi ad CIs exception: ", th);
        }
        return hashMap;
    }

    private void a(VungleCreativeInfo vungleCreativeInfo, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) throws JSONException {
        if (vungleCreativeInfo.p() == null && jSONObject.has(W)) {
            a(jSONObject.getString(W), vungleCreativeInfo, W);
        }
        if (vungleCreativeInfo.p() == null && jSONObject.has(X)) {
            a(jSONObject.getString(X), vungleCreativeInfo, X);
        }
        if (vungleCreativeInfo.p() == null && jSONObject.has(aA)) {
            vungleCreativeInfo.q(jSONObject.getString(aA));
        }
        if (vungleCreativeInfo.p() == null && jSONObject2 != null && jSONObject2.has(aB)) {
            a(jSONObject2.getString(aB), vungleCreativeInfo, aB);
        }
        if (vungleCreativeInfo.p() == null && jSONObject2 != null && jSONObject2.has(aC)) {
            a(jSONObject2.getString(aC), vungleCreativeInfo, aC);
        }
        if (vungleCreativeInfo.p() == null && jSONObject2 != null && jSONObject2.has(aD)) {
            a(jSONObject2.getString(aD), vungleCreativeInfo, aD);
        }
        if (vungleCreativeInfo.p() == null && jSONObject3 != null && jSONObject3.has("clickUrl")) {
            Object obj = jSONObject3.get("clickUrl");
            if (obj instanceof String) {
                a(jSONObject3.getString("clickUrl"), vungleCreativeInfo, "clickUrl");
                return;
            }
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = jSONObject3.getJSONArray("clickUrl");
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    if (vungleCreativeInfo.p() == null) {
                        a(jSONArray.getString(i2), vungleCreativeInfo, "clickUrl_" + i2);
                    }
                }
            }
        }
    }

    private void a(VungleCreativeInfo vungleCreativeInfo, String str, Map<String, String> map) throws JSONException {
        a(str, vungleCreativeInfo, "clickUrl");
        if (map != null) {
            for (String str2 : map.keySet()) {
                if (str2.startsWith("clickUrl")) {
                    a(map.get(str2), vungleCreativeInfo, str2);
                }
            }
        }
    }

    private static void a(CreativeInfo creativeInfo, JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject = jSONObject.optJSONObject(aw);
        if (optJSONObject == null) {
            optJSONObject = jSONObject.optJSONObject(ax);
        }
        if (optJSONObject != null) {
            JSONObject optJSONObject2 = optJSONObject.optJSONObject(ay);
            if (optJSONObject2 != null) {
                String optString = optJSONObject2.optString(aK);
                if (!TextUtils.isEmpty(optString)) {
                    if (z) {
                        creativeInfo.A(CreativeInfo.aK + optString);
                    } else {
                        creativeInfo.z(optString);
                    }
                }
                String optString2 = optJSONObject2.optString(aL);
                if (!TextUtils.isEmpty(optString2)) {
                    if (z) {
                        creativeInfo.A(CreativeInfo.aN + optString2);
                    } else {
                        creativeInfo.z(optString2);
                    }
                }
                String optString3 = optJSONObject2.optString(aM);
                if (!TextUtils.isEmpty(optString3)) {
                    if (z) {
                        creativeInfo.A(CreativeInfo.aO + optString3);
                    } else {
                        creativeInfo.z(optString3);
                    }
                }
            }
            JSONObject optJSONObject3 = optJSONObject.optJSONObject(ag);
            if (optJSONObject3 != null) {
                JSONObject optJSONObject4 = optJSONObject3.optJSONObject("MAIN_IMAGE");
                if (optJSONObject4 != null) {
                    String optString4 = optJSONObject4.optString("url");
                    if (!TextUtils.isEmpty(optString4)) {
                        if (z) {
                            creativeInfo.A(CreativeInfo.aL + optString4);
                        } else {
                            creativeInfo.y(optString4);
                        }
                    }
                }
                JSONObject optJSONObject5 = optJSONObject3.optJSONObject(aO);
                if (optJSONObject5 != null) {
                    String optString5 = optJSONObject5.optString("url");
                    if (!TextUtils.isEmpty(optString5)) {
                        if (!z) {
                            creativeInfo.y(optString5);
                            return;
                        }
                        creativeInfo.A(CreativeInfo.aM + optString5);
                    }
                }
            }
        }
    }

    private void a(String str, VungleCreativeInfo vungleCreativeInfo, String str2) {
        if (str != null) {
            str = com.safedk.android.utils.n.o(str);
        }
        if (str != null) {
            vungleCreativeInfo.q(str);
            Logger.d(o, "app package name will be updated from ", str2, " to ", str);
        }
    }

    private Map<String, String> b(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        try {
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (jSONObject.get(next) instanceof JSONArray) {
                        JSONArray jSONArray = jSONObject.getJSONArray(next);
                        Logger.d(o, "iterating over key '", next, "' , content: ", jSONArray.toString());
                        if (jSONArray.length() > 0) {
                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                if (!hashMap.values().contains(jSONArray.getString(i2))) {
                                    hashMap.put(next + "_" + i2, jSONArray.getString(i2));
                                    Logger.d(o, "collecting additional url: ", jSONArray.getString(i2));
                                } else {
                                    Logger.d(o, "url already in map. skipping: ", jSONArray.getString(i2));
                                }
                            }
                        }
                    } else {
                        Logger.d(o, "key '", next, "' is not a JSONArray, skipping");
                    }
                }
            } else {
                Logger.d(o, "tpat key does not exist, exiting");
            }
        } catch (JSONException e2) {
            Logger.e(o, "Error collecting urls under tpat key", e2);
        }
        return hashMap;
    }

    private VungleCreativeInfo a(File file) {
        if (file == null) {
            Logger.d(o, "get ad ID by video file - file is null");
            return null;
        }
        String D = D(file.getAbsolutePath());
        Logger.d(o, "get ad ID by video file - creative to ID map iteration, looking for '", D, "', key set: ", bb.keySet().toString());
        PersistentConcurrentHashMap<String, VungleCreativeInfo> persistentConcurrentHashMap = bb;
        if (persistentConcurrentHashMap != null && D != null) {
            synchronized (persistentConcurrentHashMap) {
                VungleCreativeInfo remove = bb.remove(D);
                if (remove != null) {
                    Logger.d(o, Logger.FeatureTag.CI_MATCHING, "get ad ID by video file - CI MATCH! creative found: ", D);
                    return remove;
                }
                Iterator<String> it = bb.keySet().iterator();
                while (it.hasNext()) {
                    VungleCreativeInfo vungleCreativeInfo = bb.get(it.next());
                    if (vungleCreativeInfo.N().equals(D)) {
                        Logger.d(o, Logger.FeatureTag.CI_MATCHING, "get ad ID by video file - CI MATCH! creative found: ", D);
                        return vungleCreativeInfo;
                    }
                }
            }
        }
        Logger.d(o, "get ad ID by video file - creative not found");
        return null;
    }

    private String D(String str) {
        if (str != null && str.split("/").length > 1) {
            String str2 = str.split("/")[str.split("/").length - 2];
            Logger.d(o, "ad ID to be searched: ", str2);
            return str2;
        }
        Logger.d(o, "file path is not according to the expected pattern: ", str, ", cannot extract CreativeId");
        return null;
    }

    private boolean c(JSONObject jSONObject) throws JSONException {
        return !((JSONObject) jSONObject.get(c)).has(ak) ? true : true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Set<String> c() {
        return new HashSet();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public void i() {
        super.i();
        e.a(bb, "VungleDiscovery:creativeToIdMap");
        e.a(bc, "VungleDiscovery:mediaPlayerIdToCreativeInfo");
        e.a(bd, "VungleDiscovery:adToIdMap");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public RedirectDetails.RedirectType l(String str) {
        if (str != null && str.startsWith(m)) {
            if (str.contains("open")) {
                return RedirectDetails.RedirectType.REDIRECT;
            }
            return null;
        }
        return RedirectDetails.RedirectType.REDIRECT;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String m(String str) {
        if (str != null && str.contains(m)) {
            return k.d(str, "url");
        }
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String w(String str) {
        try {
            if (str.startsWith("window.vungle.mraidBridge.notifyReadyEvent")) {
                String a = k.a(str, "\"SESSION_ID\":\"", "\"");
                Logger.d(o, "get ad id from evaluate JS - session ID: ", a);
                return a;
            }
            return null;
        } catch (Throwable th) {
            Logger.d(o, "get ad id from evaluate JS exception", th);
            return null;
        }
    }
}
