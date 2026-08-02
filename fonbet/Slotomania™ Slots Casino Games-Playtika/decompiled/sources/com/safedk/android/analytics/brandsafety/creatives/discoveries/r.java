package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.webkit.WebView;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.Objects;
import com.ironsource.X3;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.InterstitialFinder;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.ProtobufMessageParser;
import com.safedk.android.analytics.brandsafety.creatives.c;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.e;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.UnityAdsCreativeInfo;
import com.safedk.android.analytics.brandsafety.o;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.internal.b;
import com.safedk.android.utils.LimitedConcurrentHashMap;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SimpleConcurrentHashSet;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class r extends d {
    private static final String V = "campaign";
    private static final String W = "scar-admob";
    private static final String X = "programmatic/mraid";
    private static final String Y = "programmatic/mraid-url";
    private static final String Z = "programmatic/vast";
    private static final String aA = "datapts";
    private static final String aB = "hbMeta";
    private static final String aC = "pbDiagnosticEvent";
    private static final String aD = "pbCampaignData";
    private static final String aE = "pbFileCached";
    private static final String aF = "pbHbMeta";
    private static final String aG = "trailerPortraitStreaming";
    private static final String aH = "trailerStreaming";
    private static final String aI = "width";
    private static final String aJ = "height";
    private static final String aM = "/events/v2/";
    private static final String aN = "/v1/events/";
    private static final String aO = "unity3d.com/brands";
    private static final String aP = "unity3d.com/operative";
    private static final String aQ = "unity3d.com/impression";
    private static final String aR = "com.unity3d.ads";
    private static final String aS = "{\"1\":[\"adData\",\"string\"]}";
    private static final String aT = "{\"1\":{\"4\":{\"1\":[\"adData\",\"string\"]}}}";
    private static final String aU = "{\"1\":[\"contentId\",\"string\"]}";
    private static final String aV = "JS";
    private static final String aW = "IC";
    private static final String aX = "(function(){var sdkId=\"{{SDK_ID}}\";var address=\"{{ADDRESS}}\";var log=function(message){try{if(typeof window.webkit.messageHandlers.safedkDebug.postMessage===\"function\"){window.webkit.messageHandlers.safedkDebug.postMessage(message)}else{console.log(\"SafeDKWebApInterface safedkDebug object missing\")}}catch(error){}};var printError=function(error){try{if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface safedkNoSamplingExc object missing\")}}catch(error){}};var addPrivacyWindowObserver=function(){try{var privacyElement=document.getElementById(\"privacy\");var protobufPrivacyElement=null;if(!privacyElement){privacyElement=document.getElementById(\"privacy-settings\");if(!privacyElement){var protobufPrivacyScreens=document.querySelectorAll(\"[aria-label='privacy:screen']\");if(protobufPrivacyScreens&&protobufPrivacyScreens.length>0){log(\"requestNoSampling protobufPrivacyScreens found\");protobufPrivacyElement=protobufPrivacyScreens[0]}else{privacyElement=document.querySelector('button[aria-label=\"Privacy\"]')}}}if(privacyElement){if(privacyElement.style&&privacyElement.style.visibility){var element_style_visibility=privacyElement.style.visibility;if(element_style_visibility==\"visible\"){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){log(\"requestNoSampling addPrivacyWindowObserver\");window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,0,0)}else{console.log(\"SafeDKWebApInterface safedkNoSampling object missing\")}}else{if(privacyElement.safedkPrivacyDialogObserver!=true){privacyElement.safedkPrivacyDialogObserver=true;try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){try{mutations.forEach(function(mutation){try{switch(mutation.type){case\"attributes\":if(getComputedStyle(mutation.target).visibility==\"visible\"){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){log(\"requestNoSampling addPrivacyWindowObserver MutationObserver\");window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,0,0)}else{console.log(\"SafeDKWebApInterface safedkNoSampling object missing\")}}break}}catch(error){printError(error)}})}catch(error){printError(error)}});var config={attributes:true,attributeOldValue:true,attributeFilter:[\"style\"]};observer.observe(privacyElement,config)}catch(error){printError(error)}}}}}else if(protobufPrivacyElement){if(protobufPrivacyElement.hasAttribute(\"open\")){log(\"requestNoSampling protobufPrivacyElement opened\");if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){log(\"requestNoSampling addPrivacyWindowObserver protobuf\");window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,0,0)}else{console.log(\"SafeDKWebApInterface safedkNoSampling object missing\")}}else{log(\"requestNoSampling protobufPrivacyElement hidden\");if(protobufPrivacyElement.safedkPrivacyDialogObserver!=true){protobufPrivacyElement.safedkPrivacyDialogObserver=true;try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){try{mutations.forEach(function(mutation){try{switch(mutation.type){case\"attributes\":if(mutation.target.hasAttribute(\"open\")){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){log(\"requestNoSampling addPrivacyWindowObserver MutationObserver protobuf\");window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,0,0)}else{console.log(\"SafeDKWebApInterface safedkNoSampling object missing\")}}break}}catch(error){printError(error)}})}catch(error){printError(error)}});var config={attributes:true,attributeOldValue:true,attributeFilter:[\"open\"]};observer.observe(protobufPrivacyElement,config)}catch(error){printError(error)}}}}}catch(error){printError(error)}};var processVideoButtons=function(){try{var buttons=document.getElementsByTagName(\"BUTTON\");var closeVideoButton=null;var resumeVideoButton=null;if(buttons&&buttons.length>0){for(let i=0;i<buttons.length;i++){let buttonText=buttons[i].textContent;if(buttonText===\"CLOSE VIDEO\"){closeVideoButton=buttons[i]}else if(buttonText===\"RESUME VIDEO\"){resumeVideoButton=buttons[i]}if(closeVideoButton&&resumeVideoButton)break}}if(closeVideoButton&&resumeVideoButton&&closeVideoButton.parentElement===resumeVideoButton.parentElement){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){log(\"requestNoSampling processVideoButtons\");window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,0,0)}else{console.log(\"SafeDKWebApInterface safedkNoSampling object missing\")}}}catch(error){printError(error)}};var addCloseThisAdObserver=function(){try{var closeAdDialogElement=null;var rewardedDefaultViewElement=document.getElementById(\"rewarded-default-view\");if(rewardedDefaultViewElement){var rewardedSpeedBumpCollection=rewardedDefaultViewElement.getElementsByClassName(\"rewarded-speed-bump\");if(rewardedSpeedBumpCollection&&rewardedSpeedBumpCollection.length==1){closeAdDialogElement=rewardedSpeedBumpCollection[0]}}else{closeAdDialogElement=document.getElementById(\"dialog_wrapper\")}if(closeAdDialogElement){var closeAdDialogElementStyle=getComputedStyle(closeAdDialogElement);if(closeAdDialogElementStyle&&closeAdDialogElementStyle.visibility==\"visible\"&&closeAdDialogElementStyle.opacity>0){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){log(\"requestNoSampling addCloseThisAdObserver\");window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,0,0)}else{console.log(\"SafeDKWebApInterface safedkNoSampling object missing\")}}else{if(closeAdDialogElement.safedkCloseThisAdDialogObserver!=true){closeAdDialogElement.safedkCloseThisAdDialogObserver=true;try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){switch(mutation.type){case\"attributes\":if(mutation.target.className==\"visible\"){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){log(\"requestNoSampling addCloseThisAdObserver MutationObserver\");window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,0,0)}else{console.log(\"SafeDKWebApInterface safedkNoSampling object missing\")}}break}})});var config={attributes:true,attributeOldValue:true,attributeFilter:[\"class\"]};observer.observe(closeAdDialogElement,config)}catch(error){printError(error)}}}}}catch(error){printError(error)}};var detectAgeVerificationPage=function(){try{if(document.getElementById(\"age-gate\")){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,0,0)}else{console.log(\"SafeDKWebApInterface safedkNoSampling object missing\")}}else{}}catch(error){printError(error)}};addPrivacyWindowObserver();addCloseThisAdObserver();detectAgeVerificationPage();processVideoButtons();try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){for(var i=0;i<mutation.addedNodes.length;i++){var node=mutation.addedNodes[i];if(node&&node.nodeName!=\"#text\"){addPrivacyWindowObserver();detectAgeVerificationPage();processVideoButtons()}}if(mutation.type===\"attributes\"){addPrivacyWindowObserver();detectAgeVerificationPage();processVideoButtons()}addCloseThisAdObserver()})});var config={childList:true,subtree:true,attributes:true};observer.observe(document,config)}catch(error){printError(error)}})();\n";
    private static final int aZ = 30;
    private static final String aa = "programmatic/vast-vpaid";
    private static final String ab = "programmatic/banner-html";
    private static final String ac = "protobuf";
    private static final String ad = "placements";
    private static final String ae = "placementsV2";
    private static final String af = "mediaId";
    private static final String ag = "placementMeta";
    private static final String ah = "rs";
    private static final String ai = "id";
    private static final String aj = "allowSkip";
    private static final String ak = "auctionId";
    private static final String al = "creativeId";
    private static final String am = "bundleId";
    private static final String an = "placementId";
    private static final String ao = "unityCreativeId";
    private static final String ap = "endScreenUrl";
    private static final String aq = "data";
    private static final String ar = "tracking";
    private static final String as = "trackingTemplates";
    private static final String at = "buyerID";
    private static final String au = "dspId";
    private static final String av = "advertiserDomain";
    private static final String aw = "events";
    private static final String ay = "urlIndices";
    private static final String az = "params";
    public static final String b = "admob-video";
    private static String bk = null;
    private static WeakReference<WebView> bl = null;
    public static final String c = "admob-display";
    public static final String d = "admob-banner";
    public static final String e = "com.unity3d.services.core.webview.bridge.WebViewBridgeInterface";
    public static final String f = "com.unity3d.ads.adplayer.model.WebViewBridgeInterface";
    private static final String g = "UnityAdsDiscovery";
    private static final String h = "media";
    private static final String i = "content";
    private static final String j = "appStoreId";
    private static final String k = "clickUrl";
    private static final String l = "appDownloadUrl";
    private static final String m = "contentType";
    private static final String n = "portraitCreativeId";
    private static final String o = "trailerDownloadable";
    private static final String p = "trailerPortraitDownloadable";
    private static final String q = "mraidUrl";
    private final ConcurrentHashMap<String, Boolean> aY;
    private static final String[] ax = {TtmlNode.START, "impression"};
    private static final String aK = "gateway.unityads.unity3d.com/v";
    private static final Set<String> aL = new HashSet(Arrays.asList("auction.unityads.unity3d.com/v", "auction.unityads.unity.cn/v", "auction-load.unityads.unity3d.com/v", "auction-load.unityads.unity.cn/v", "auction-banner.unityads.unity3d.com/v", "auction-load-tpsc.unityads.unity3d.com/v", aK));
    private static final ConcurrentHashMap<String, CreativeInfo> ba = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, CreativeInfo> bb = new LimitedConcurrentHashMap(30);
    private static final ConcurrentHashMap<String, CreativeInfo> bc = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, CreativeInfo> bd = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, CreativeInfo> be = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, CreativeInfo> bf = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, a> bg = new LimitedConcurrentHashMap(30);
    private static final ConcurrentHashMap<String, String> bh = new LimitedConcurrentHashMap(30);
    private static final ConcurrentHashMap<String, WeakReference<WebView>> bi = new LimitedConcurrentHashMap(30);
    private static final SimpleConcurrentHashSet<String> bj = new SimpleConcurrentHashSet<>();
    private static String bm = null;
    private static final Set<String> bn = new HashSet();

    public r() {
        super("com.unity3d.ads", g);
        this.aY = new ConcurrentHashMap<>();
        this.E.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_FULLSCREEN_ADS, true);
        this.E.b(AdNetworkConfiguration.JS_PRIVACY_BUTTON_CLICK_DETECTION_SCRIPT, aX);
        this.E.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_BIDDING_INTERSTITIAL_IMPRESSION_MATCHING_BY_MAX, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION, false);
        this.E.b(AdNetworkConfiguration.SHOULD_INJECT_JS_TO_WEBVIEWS_NOT_YET_ATTACHED_TO_ACTIVITY, true);
        this.E.b(AdNetworkConfiguration.DONT_REPORT_WEBVIEW_RESOURCE_LIST_IF_NO_CI, true);
        this.E.b(AdNetworkConfiguration.SHOULD_DECODE_AD_TAG_TWICE, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_MRECS, true);
        this.E.b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_PREFETCH_REUSE, true);
        this.E.b(AdNetworkConfiguration.SHOULD_USE_RESOURCES_COLLECTION_SCRIPT_FULLSCREEN, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_DIFFERENT_ADS_IN_CROSS_ORIGIN_IFRAMES, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION, true);
        this.E.b(AdNetworkConfiguration.CLEAR_FULLSCREEN_PENDING_CANDIDATES_ON_DID_FAIL_DISPLAY, true);
        this.E.b(AdNetworkConfiguration.STORE_DECODED_QUESTION_MARK_IN_VIV_URL_LIST, true);
        this.E.b(AdNetworkConfiguration.SHOULD_VIDEO_OBSERVER_TRAVERSE_IFRAMES, true);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<CreativeInfo> a(String str, String str2, Map<String, List<String>> map, c.a aVar, byte[] bArr) throws JSONException {
        String str3;
        IllegalArgumentException illegalArgumentException;
        boolean z;
        String str4;
        byte[] decode;
        boolean z2;
        String str5;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str6;
        String str7;
        String str8;
        String str9;
        char c2;
        char c3;
        String next;
        JSONObject jSONObject3;
        String optString;
        String optString2;
        String str10;
        String b2;
        int i2;
        JSONArray jSONArray;
        r rVar = this;
        c.a aVar2 = aVar;
        String str11 = af;
        Object[] objArr = new Object[6];
        char c4 = 0;
        objArr[0] = "generate info started, url: ";
        char c5 = 1;
        objArr[1] = str;
        int i3 = 2;
        objArr[2] = ", content size: ";
        objArr[3] = str2 == null ? AbstractJsonLexerKt.NULL : Integer.valueOf(str2.length());
        objArr[4] = ", headers: ";
        objArr[5] = map;
        String str12 = g;
        Logger.d(g, objArr);
        String str13 = null;
        if (com.safedk.android.utils.n.u(str)) {
            Logger.d(g, "generate info - bufferValue is binary for url ", str, ", skipping");
            return null;
        }
        if (com.safedk.android.utils.n.n(str2)) {
            str5 = str2;
            z2 = false;
        } else {
            try {
                str3 = new String(Base64.decode(str2, 0));
            } catch (IllegalArgumentException e2) {
                Logger.d(g, "generate info - failed to decode Base64 buffer: ", e2.getMessage());
                str3 = str2;
            }
            String z3 = (str3 == null || !com.safedk.android.utils.n.n(str3)) ? com.safedk.android.utils.n.z(str3) : str3;
            if (z3 != null && !com.safedk.android.utils.n.n(z3)) {
                try {
                    z3 = new String(Base64.decode(z3, 0));
                } catch (IllegalArgumentException e3) {
                    Logger.d(g, "generate info - failed to decode Base64 buffer (decoded): ", e3.getMessage());
                }
            }
            if (z3 == null || !com.safedk.android.utils.n.n(z3)) {
                try {
                    if (str.contains(aK)) {
                        str4 = aT;
                        decode = bArr;
                    } else {
                        str4 = aS;
                        decode = Base64.decode(str2, 0);
                    }
                    JSONObject a2 = ProtobufMessageParser.a(decode, str4);
                    if (!a2.has("adData")) {
                        z = false;
                    } else {
                        Logger.printFullVerboseLog(g, "generate info - protobuf: ", a2);
                        try {
                            z3 = a2.getString("adData");
                            z = true;
                        } catch (IllegalArgumentException e4) {
                            illegalArgumentException = e4;
                            z = true;
                            Logger.d(g, "generate info - failed to decode protobuf buffer: ", illegalArgumentException.getMessage());
                            if (z3 != null) {
                            }
                            Logger.d(g, "generate info - not a valid JSON string, skipping");
                            return null;
                        }
                    }
                } catch (IllegalArgumentException e5) {
                    illegalArgumentException = e5;
                    z = false;
                }
            } else {
                z = false;
            }
            if (z3 != null || !com.safedk.android.utils.n.n(z3)) {
                Logger.d(g, "generate info - not a valid JSON string, skipping");
                return null;
            }
            Logger.printFullVerboseLog(g, "generate info - Base64 decoded json : ", z3);
            z2 = z;
            str5 = z3;
        }
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject4 = new JSONObject(str5);
        JSONObject optJSONObject = jSONObject4.optJSONObject("media");
        if (optJSONObject == null) {
            Logger.d(g, "generate info - can't find media block");
            return null;
        }
        JSONObject optJSONObject2 = jSONObject4.optJSONObject("placements");
        if (optJSONObject2 != null) {
            jSONObject = optJSONObject2;
        } else {
            jSONObject = jSONObject4.optJSONObject(ae);
        }
        if (jSONObject == null) {
            Logger.d(g, "generate info - can't find placements block");
            return null;
        }
        ArrayList<String> a3 = rVar.a(jSONObject4);
        Iterator<String> keys = jSONObject.keys();
        Logger.d(g, "generate info - placements: ", jSONObject);
        while (keys.hasNext()) {
            try {
                next = keys.next();
                jSONObject3 = jSONObject.getJSONObject(next);
                optString = jSONObject3.optString(aB, str13);
                optString2 = jSONObject3.optString(ah, str13);
                Object[] objArr2 = new Object[i3];
                objArr2[c4] = "generate info - rs: ";
                objArr2[c5] = optString2;
                Logger.d(str12, objArr2);
                JSONArray optJSONArray = jSONObject3.optJSONArray(ar);
                if (optJSONArray != null) {
                    b2 = str13;
                    str10 = b2;
                    int i4 = 0;
                    while (i4 < optJSONArray.length()) {
                        try {
                            JSONObject optJSONObject3 = optJSONArray.optJSONObject(i4);
                            b2 = rVar.b(optJSONObject3);
                            i4++;
                            str10 = optJSONObject3;
                        } catch (IllegalArgumentException e6) {
                            e = e6;
                            jSONObject2 = jSONObject;
                            str7 = str12;
                            str8 = str5;
                            str9 = str11;
                            str6 = null;
                            c2 = 1;
                            c3 = 0;
                            Object[] objArr3 = new Object[5];
                            objArr3[c3] = "generate info - error decoding url: ";
                            objArr3[c2] = str8;
                            objArr3[2] = ", error: ";
                            objArr3[3] = e.getMessage();
                            objArr3[4] = e;
                            Logger.d(str7, objArr3);
                            str12 = str7;
                            str11 = str9;
                            str5 = str8;
                            jSONObject = jSONObject2;
                            str13 = str6;
                            i3 = 2;
                            c5 = 1;
                            c4 = 0;
                            rVar = this;
                            aVar2 = aVar;
                        } catch (Throwable th) {
                            th = th;
                            jSONObject2 = jSONObject;
                            str7 = str12;
                            str8 = str5;
                            str9 = str11;
                            str6 = null;
                            c2 = 1;
                            c3 = 0;
                            Object[] objArr4 = new Object[3];
                            objArr4[c3] = "generate info - error parsing ";
                            objArr4[c2] = th.getMessage();
                            objArr4[2] = th;
                            Logger.d(str7, objArr4);
                            str12 = str7;
                            str11 = str9;
                            str5 = str8;
                            jSONObject = jSONObject2;
                            str13 = str6;
                            i3 = 2;
                            c5 = 1;
                            c4 = 0;
                            rVar = this;
                            aVar2 = aVar;
                        }
                    }
                } else {
                    JSONObject optJSONObject4 = jSONObject3.optJSONObject(ar);
                    str10 = optJSONObject4;
                    b2 = rVar.b(optJSONObject4);
                }
                Object[] objArr5 = new Object[i3];
                objArr5[c4] = "generate info - processing start/import tracking events, datapts: ";
                objArr5[c5] = b2;
                Logger.d(str12, objArr5);
            } catch (IllegalArgumentException e7) {
                e = e7;
                jSONObject2 = jSONObject;
                str6 = str13;
                str7 = str12;
                str8 = str5;
                str9 = str11;
            } catch (Throwable th2) {
                th = th2;
                jSONObject2 = jSONObject;
                str6 = str13;
                str7 = str12;
                str8 = str5;
                str9 = str11;
            }
            if (!jSONObject3.has(str11)) {
                jSONObject2 = jSONObject;
                str7 = str12;
                str8 = str5;
                str9 = str11;
                str6 = null;
            } else {
                BrandSafetyEvent.AdFormatType adFormatType = aVar2 != null ? aVar2.b : null;
                if (jSONObject3.get(str11).getClass().getName().equals(String.class.getName())) {
                    String string = jSONObject3.getString(str11);
                    Object[] objArr6 = new Object[i3];
                    objArr6[c4] = "generate info - media ID (single value): ";
                    objArr6[c5] = string;
                    Logger.d(str12, objArr6);
                    if (TextUtils.isEmpty(string) || TextUtils.isEmpty(optString2)) {
                        str12 = str12;
                        str11 = str11;
                        str5 = str5;
                        jSONObject = jSONObject;
                        str13 = null;
                        i3 = 2;
                        c5 = 1;
                        c4 = 0;
                        rVar = this;
                        aVar2 = aVar;
                    } else {
                        jSONObject2 = jSONObject;
                        str6 = null;
                        str7 = str12;
                        str8 = str5;
                        c2 = 1;
                        c3 = 0;
                        str9 = str11;
                        try {
                            a(arrayList, optJSONObject, next, string, optString2, b2, optString, adFormatType, str10, a3, z2);
                        } catch (IllegalArgumentException e8) {
                            e = e8;
                            Object[] objArr32 = new Object[5];
                            objArr32[c3] = "generate info - error decoding url: ";
                            objArr32[c2] = str8;
                            objArr32[2] = ", error: ";
                            objArr32[3] = e.getMessage();
                            objArr32[4] = e;
                            Logger.d(str7, objArr32);
                            str12 = str7;
                            str11 = str9;
                            str5 = str8;
                            jSONObject = jSONObject2;
                            str13 = str6;
                            i3 = 2;
                            c5 = 1;
                            c4 = 0;
                            rVar = this;
                            aVar2 = aVar;
                        } catch (Throwable th3) {
                            th = th3;
                            Object[] objArr42 = new Object[3];
                            objArr42[c3] = "generate info - error parsing ";
                            objArr42[c2] = th.getMessage();
                            objArr42[2] = th;
                            Logger.d(str7, objArr42);
                            str12 = str7;
                            str11 = str9;
                            str5 = str8;
                            jSONObject = jSONObject2;
                            str13 = str6;
                            i3 = 2;
                            c5 = 1;
                            c4 = 0;
                            rVar = this;
                            aVar2 = aVar;
                        }
                    }
                } else {
                    jSONObject2 = jSONObject;
                    str7 = str12;
                    str8 = str5;
                    str9 = str11;
                    str6 = null;
                    JSONArray optJSONArray2 = jSONObject3.optJSONArray(str9);
                    Logger.d(str7, "generate info - media ID (array): ", optJSONArray2);
                    if (optJSONArray2 != null) {
                        int i5 = 0;
                        while (i5 < optJSONArray2.length()) {
                            String string2 = optJSONArray2.getString(i5);
                            Logger.d(str7, "generate info - processing media ID: ", string2);
                            if (TextUtils.isEmpty(string2)) {
                                i2 = i5;
                                jSONArray = optJSONArray2;
                            } else {
                                i2 = i5;
                                jSONArray = optJSONArray2;
                                a(arrayList, optJSONObject, next, string2, optString2, b2, optString, adFormatType, str10, a3, z2);
                            }
                            i5 = i2 + 1;
                            optJSONArray2 = jSONArray;
                        }
                    }
                }
            }
            str12 = str7;
            str11 = str9;
            str5 = str8;
            jSONObject = jSONObject2;
            str13 = str6;
            i3 = 2;
            c5 = 1;
            c4 = 0;
            rVar = this;
            aVar2 = aVar;
        }
        return arrayList;
    }

    private ArrayList<String> a(JSONObject jSONObject) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (jSONObject == null) {
            Logger.d(g, "unity - extract tracking templates - json root is null");
            return arrayList;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(as);
        if (optJSONArray == null) {
            Logger.d(g, "unity - extract tracking templates - tracking templates are null");
            return arrayList;
        }
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            try {
                arrayList.add(optJSONArray.getString(i2));
            } catch (JSONException e2) {
                Logger.d(g, "unity - extract tracking templates - exception occurred: with message\n", e2);
            }
        }
        return arrayList;
    }

    private String b(JSONObject jSONObject) {
        JSONObject optJSONObject;
        String optString;
        if (jSONObject == null) {
            Logger.d(g, "unity - extractDataPts - tracking is null");
            return null;
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("events");
        if (optJSONObject2 == null) {
            Logger.d(g, "unity - extractDataPts - events is null");
            return null;
        }
        for (String str : ax) {
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject(str);
            if (optJSONObject3 != null && (optJSONObject = optJSONObject3.optJSONObject("params")) != null && (optString = optJSONObject.optString(aA, null)) != null) {
                return optString;
            }
        }
        Logger.d(g, "unity - extractDataPts - did not find datapts");
        return null;
    }

    private ArrayList<Integer> a(JSONObject jSONObject, String str) {
        HashSet hashSet = new HashSet();
        if (jSONObject == null) {
            Logger.d(g, "unity - extract tracking template indices - tracking is null for media id: ", str);
            return new ArrayList<>();
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("events");
        if (optJSONObject == null) {
            Logger.d(g, "unity - extract tracking template indices - events are null for media id: ", str);
            return new ArrayList<>();
        }
        try {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (optJSONObject.get(next) instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) optJSONObject.get(next);
                    if (jSONObject2.has(ay)) {
                        JSONArray optJSONArray = jSONObject2.optJSONArray(ay);
                        for (int i2 = 0; optJSONArray != null && i2 < optJSONArray.length(); i2++) {
                            hashSet.add(Integer.valueOf(optJSONArray.getInt(i2)));
                        }
                    }
                }
            }
            return new ArrayList<>(hashSet);
        } catch (JSONException e2) {
            Logger.d(g, "unity - extract tracking template indices - exception occurred for media: ", str, " with message\n", e2);
            return new ArrayList<>(hashSet);
        }
    }

    private ArrayList<String> a(ArrayList<String> arrayList, ArrayList<Integer> arrayList2) {
        ArrayList<String> arrayList3 = new ArrayList<>();
        Iterator<Integer> it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(arrayList.get(it.next().intValue()));
        }
        return arrayList3;
    }

    private void a(List<CreativeInfo> list, JSONObject jSONObject, String str, String str2, String str3, String str4, String str5, BrandSafetyEvent.AdFormatType adFormatType, JSONObject jSONObject2, ArrayList<String> arrayList, boolean z) throws JSONException {
        BrandSafetyEvent.AdFormatType adFormatType2;
        String str6;
        String str7;
        String str8;
        char c2;
        int i2;
        JSONObject jSONObject3 = jSONObject.getJSONObject(str2);
        String string = jSONObject3.getString(m);
        if (string.equals(ab) || string.equals(d)) {
            adFormatType2 = com.safedk.android.utils.n.b((float) jSONObject3.optInt("width"), (float) jSONObject3.optInt("height")) ? BrandSafetyEvent.AdFormatType.MREC : BrandSafetyEvent.AdFormatType.BANNER;
        } else if (this.aY.containsKey(str)) {
            adFormatType2 = this.aY.remove(str).booleanValue() ? BrandSafetyEvent.AdFormatType.INTER : BrandSafetyEvent.AdFormatType.REWARD;
        } else {
            adFormatType2 = adFormatType != null ? adFormatType : BrandSafetyEvent.AdFormatType.INTER;
        }
        String string2 = jSONObject3.getString("content");
        String optString = jSONObject3.optString("creativeId");
        Logger.d(g, "generate info - ad format: ", adFormatType2, ", media ID: ", str2, ", ad ID: ", str3);
        if (!jSONObject3.has("bundleId")) {
            str6 = null;
        } else {
            str6 = jSONObject3.getString("bundleId");
        }
        if (!jSONObject3.has(CreativeInfo.L)) {
            str7 = null;
        } else {
            str7 = jSONObject3.getString(CreativeInfo.L);
        }
        int size = list.size();
        Logger.d(g, "generate info - content type is ", string);
        if (string.endsWith("campaign")) {
            if (z) {
                string = string + "/" + ac;
            }
            String str9 = string;
            String str10 = str6;
            str8 = str10;
            c2 = 2;
            a(list, str, str3, adFormatType2, str9, string2, str10, str7, str4);
            string = str9;
            i2 = 1;
        } else {
            str8 = str6;
            c2 = 2;
            if (string.endsWith(b) || string.endsWith(c)) {
                i2 = 1;
            } else if (string.endsWith(d)) {
                i2 = 1;
            } else {
                if (string.equals(Z)) {
                    i2 = 1;
                } else if (string.equals(aa)) {
                    i2 = 1;
                } else if (string.equals(X)) {
                    i2 = 1;
                    Logger.printFullVerboseLog(g, "generate info - content type is programmatic mraid: ", jSONObject3);
                    if (z) {
                        string = string + "/" + ac;
                    }
                    String str11 = string;
                    list.add(a(new com.safedk.android.analytics.brandsafety.creatives.c(jSONObject3), str, str3, adFormatType2, str11, str7));
                    string = str11;
                } else {
                    i2 = 1;
                    if (string.equals(Y)) {
                        if (z) {
                            string = string + "/" + ac;
                        }
                        String str12 = string;
                        list.add(a(new com.safedk.android.analytics.brandsafety.creatives.d(jSONObject3), str, str3, adFormatType2, str12, str7));
                        string = str12;
                    } else if (string.equals(ab)) {
                        if (z) {
                            string = string + "/" + ac;
                        }
                        String str13 = string;
                        UnityAdsCreativeInfo a2 = a(str, optString, str3, adFormatType2, str13, string2, str7);
                        list.add(a2);
                        Logger.d(g, "generate info - add ci to adId map for banners, ad id: ", str3, " datapts: ", str4, ", ci: ", a2.aa());
                        if (z && str5 != null) {
                            Logger.d(g, "generate info - add ci to hbMeta map, hbMeta: ", str5, ", ci: ", a2.aa());
                            bd.put(str5, a2);
                        }
                        string = str13;
                    }
                }
                if (z) {
                    string = string + "/" + ac;
                }
                String str14 = string;
                a(list, str, optString, str3, adFormatType2, str14, string2, str7);
                string = str14;
            }
            if (z) {
                string = string + "/" + ac;
            }
            String str15 = string;
            b(list, str, optString, str3, adFormatType2, str15, string2, str7);
            string = str15;
        }
        if (!string.equals(ab) && !string.contains(b) && !string.contains(c)) {
            int i3 = size;
            while (i3 < list.size()) {
                CreativeInfo creativeInfo = list.get(i3);
                if (str4 != null) {
                    Object[] objArr = new Object[4];
                    objArr[0] = "generate info - add ci to datapts map, datapts: ";
                    objArr[i2] = str4;
                    objArr[c2] = ", ci: ";
                    objArr[3] = creativeInfo.aa();
                    Logger.d(g, objArr);
                    synchronized (bc) {
                        bc.put(str4, creativeInfo);
                    }
                }
                if (str5 != null) {
                    Object[] objArr2 = new Object[4];
                    objArr2[0] = "generate info - add ci to hbMeta map, hbMeta: ";
                    objArr2[i2] = str5;
                    objArr2[c2] = ", ci: ";
                    objArr2[3] = creativeInfo.aa();
                    Logger.d(g, objArr2);
                    bd.put(str5, creativeInfo);
                }
                String str16 = str8;
                if (str16 != null) {
                    ((UnityAdsCreativeInfo) creativeInfo).K(str16);
                }
                i3++;
                str8 = str16;
            }
            if (list.size() - size > i2) {
                Object[] objArr3 = new Object[3];
                objArr3[0] = "generate info - found more than one CI - there are ";
                objArr3[i2] = Integer.valueOf(list.size() - size);
                objArr3[c2] = " cis";
                Logger.d(g, objArr3);
            }
        }
        a(list, str2, size, jSONObject2, arrayList);
    }

    private void a(List<CreativeInfo> list, String str, int i2, JSONObject jSONObject, ArrayList<String> arrayList) {
        if (list.size() != 0) {
            ArrayList<Integer> a2 = a(jSONObject, str);
            Logger.d(g, "generate info - for media id: ", str, " url indices are: ", a2);
            ArrayList<String> a3 = a(arrayList, a2);
            String str2 = null;
            String str3 = null;
            String str4 = null;
            for (int i3 = i2; i3 < list.size(); i3++) {
                CreativeInfo creativeInfo = list.get(i3);
                creativeInfo.b((List<String>) a3);
                if (str3 == null) {
                    str3 = creativeInfo.P();
                }
                if (str4 == null) {
                    str4 = creativeInfo.o();
                }
            }
            if (str3 == null || str4 == null) {
                Iterator<String> it = a3.iterator();
                while (it.hasNext()) {
                    Map<String, String> a4 = k.a(k.g(it.next()), false);
                    if (a4 != null) {
                        for (String str5 : a4.keySet()) {
                            if (str3 != null && str4 != null) {
                                break;
                            }
                            if (str5.equals(au) && str3 == null) {
                                str3 = a4.get(str5);
                            }
                            if (str5.equals(av) && str4 == null) {
                                str4 = a4.get(str5);
                            }
                            if (str5.equals(at) && str2 == null) {
                                str2 = a4.get(str5);
                            }
                        }
                        if (str3 != null && str4 != null) {
                            break;
                        }
                    }
                }
            }
            if (str3 != null) {
                str2 = str3;
            }
            for (int i4 = i2; i4 < list.size(); i4++) {
                CreativeInfo creativeInfo2 = list.get(i4);
                if (str2 != null) {
                    creativeInfo2.m(str2);
                }
                if (str4 != null) {
                    creativeInfo2.i(str4);
                }
            }
            Logger.d(g, "generate info - for media id: ", str, " dsps are: ", list.get(list.size() - 1).q());
        }
    }

    private UnityAdsCreativeInfo a(String str, String str2, String str3, BrandSafetyEvent.AdFormatType adFormatType, String str4, String str5, String str6) {
        String F;
        UnityAdsCreativeInfo unityAdsCreativeInfo = new UnityAdsCreativeInfo(str3, str2, null, null, null, str4, null, adFormatType, str, this.I, null, str6, null);
        String g2 = k.g(str5);
        Matcher matcher = e.b().matcher(g2);
        boolean find = matcher.find();
        if (find) {
            g2 = g2.substring(matcher.start(), matcher.end());
        }
        Logger.d(g, "generate info - get html and is matched? ", Boolean.valueOf(find));
        Logger.d(g, "generate info - ad content added for ad id: ", str3);
        bh.put(str3, g2.replaceAll("\\s+", ""));
        synchronized (bf) {
            bf.put(str3, unityAdsCreativeInfo);
        }
        unityAdsCreativeInfo.b((List<String>) com.safedk.android.utils.n.f(g2));
        if (unityAdsCreativeInfo.M() == null && (F = F(g2)) != null) {
            unityAdsCreativeInfo.a(F, true);
        }
        return unityAdsCreativeInfo;
    }

    private void a(List<CreativeInfo> list, String str, String str2, String str3, BrandSafetyEvent.AdFormatType adFormatType, String str4, String str5, String str6) {
        UnityAdsCreativeInfo unityAdsCreativeInfo = new UnityAdsCreativeInfo(str3, str2, null, null, null, str4, null, adFormatType, str, this.I, null, str6, null);
        if (a((CreativeInfo) unityAdsCreativeInfo, (String) null, str5, true) != null) {
            list.add(unityAdsCreativeInfo);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        return null;
    }

    private void a(List<CreativeInfo> list, String str, String str2, BrandSafetyEvent.AdFormatType adFormatType, String str3, String str4, String str5, String str6, String str7) throws JSONException {
        String str8;
        String str9;
        String optString;
        UnityAdsCreativeInfo unityAdsCreativeInfo;
        String str10;
        JSONObject jSONObject = new JSONObject(str4);
        Logger.d(g, "parse comet campaign prefetch - ad info: ", jSONObject);
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.optString(j);
        String optString4 = jSONObject.has(l) ? jSONObject.optString(l) : jSONObject.getString("clickUrl");
        if (jSONObject.has("creativeId")) {
            str8 = jSONObject.getString("creativeId");
        } else {
            Logger.d(g, "parse comet campaign prefetch - cannot find value for key '", "creativeId", "'");
            str8 = null;
        }
        String optString5 = jSONObject.optString(q, "");
        String optString6 = jSONObject.optString(ap, "");
        if (!TextUtils.isEmpty(optString6)) {
            str9 = optString6;
        } else {
            str9 = optString5;
        }
        if (!TextUtils.isEmpty(optString5)) {
            Logger.d(g, "parse comet campaign prefetch - playable ad creative ID: ", str8, ", playable url: ", optString5, ", click url: ", optString4);
            unityAdsCreativeInfo = new UnityAdsCreativeInfo(str2, str8, optString4, null, optString5, str3, null, adFormatType, str, this.I, str5, str6, str9);
            unityAdsCreativeInfo.b(Arrays.asList(optString5));
            optString = null;
            str10 = null;
        } else {
            optString = jSONObject.optString(p, "");
            String optString7 = jSONObject.optString(o, "");
            String optString8 = jSONObject.optString(aG, "");
            Logger.d(g, "parse comet campaign prefetch - streaming portrait video url: ", optString8);
            Logger.d(g, "parse comet campaign prefetch - streaming video url: ", jSONObject.optString(aH, null));
            Logger.d(g, "parse comet campaign prefetch - generate info video url: ", optString7, ", portrait video url:", optString);
            String optString9 = jSONObject.optString(n, null);
            Logger.d(g, "parse comet campaign prefetch - creative ID: ", str8, " click URL: ", optString4, " video URL: ", optString7);
            UnityAdsCreativeInfo unityAdsCreativeInfo2 = new UnityAdsCreativeInfo(str2, str8, optString4, optString7, null, str3, null, adFormatType, str, this.I, str5, str6, str9);
            unityAdsCreativeInfo2.c(optString9, optString);
            if (!TextUtils.isEmpty(optString)) {
                unityAdsCreativeInfo2.b(Arrays.asList(optString));
            }
            unityAdsCreativeInfo2.a(optString8);
            unityAdsCreativeInfo = unityAdsCreativeInfo2;
            str10 = optString7;
        }
        if (optString3 != null) {
            unityAdsCreativeInfo.q(optString3);
        }
        if (!TextUtils.isEmpty(optString2)) {
            Logger.d(g, "parse comet campaign prefetch - add mapping for content ID: ", optString2);
            be.put(optString2, unityAdsCreativeInfo);
        }
        if (!TextUtils.isEmpty(str10)) {
            Logger.d(g, "parse comet campaign prefetch - add mapping for video URL: ", str10);
        }
        if (!TextUtils.isEmpty(optString)) {
            Logger.d(g, "parse comet campaign prefetch - add mapping for portrait video URL: ", optString);
        }
        if (!TextUtils.isEmpty(str9)) {
            Logger.d(g, "parse comet campaign prefetch - add mapping for end-card URL: ", str9);
        }
        unityAdsCreativeInfo.b((List<String>) com.safedk.android.utils.n.f(str4.replace("\\/", "/")));
        if (unityAdsCreativeInfo.r() != null) {
            Iterator<String> it = unityAdsCreativeInfo.r().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next != null && next.length() > 0) {
                    unityAdsCreativeInfo.B(k.p(next));
                }
            }
        }
        list.add(unityAdsCreativeInfo);
        if (str7 == null) {
            Logger.d(g, "parse comet campaign prefetch - no datapts found in prefetch, ad id is: ", str2);
        }
    }

    private UnityAdsCreativeInfo a(com.safedk.android.analytics.brandsafety.creatives.c cVar, String str, String str2, BrandSafetyEvent.AdFormatType adFormatType, String str3, String str4) {
        UnityAdsCreativeInfo unityAdsCreativeInfo;
        String F;
        c.a a2 = cVar.a();
        UnityAdsCreativeInfo unityAdsCreativeInfo2 = new UnityAdsCreativeInfo(str2, a2.a, a2.b, null, null, str3, a2.c, adFormatType, str, this.I, null, str4, null);
        if (!TextUtils.isEmpty(a2.d)) {
            unityAdsCreativeInfo2.a(a2.d.hashCode());
        }
        ArrayList<String> f2 = com.safedk.android.utils.n.f(a2.d);
        Logger.d(g, "parse mraid prefetch - prefetch resources list: ", f2);
        unityAdsCreativeInfo2.b((List<String>) f2);
        Iterator<String> it = f2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (com.safedk.android.utils.n.s(next) && unityAdsCreativeInfo2.H() == null) {
                unityAdsCreativeInfo2.p(next);
                Logger.d(g, "parse mraid prefetch - video url set to ", next);
                break;
            }
        }
        if (unityAdsCreativeInfo2.H() == null && a2.e != null && a2.e.length() > 0) {
            unityAdsCreativeInfo2.p(a2.e);
            Logger.d(g, "parse mraid prefetch - video url set to ", a2.e);
        }
        if (unityAdsCreativeInfo2.M() == null && (F = F(a2.d)) != null) {
            unityAdsCreativeInfo2.a(F, true);
        }
        if (unityAdsCreativeInfo2.p() != null) {
            unityAdsCreativeInfo = unityAdsCreativeInfo2;
        } else {
            unityAdsCreativeInfo = unityAdsCreativeInfo2;
            String G = G(a2.d);
            if (G != null) {
                unityAdsCreativeInfo.q(G);
            }
        }
        Logger.d(g, "parse mraid prefetch - CI: ", unityAdsCreativeInfo);
        return unityAdsCreativeInfo;
    }

    private void b(List<CreativeInfo> list, String str, String str2, String str3, BrandSafetyEvent.AdFormatType adFormatType, String str4, String str5, String str6) {
        boolean z;
        ArrayList<String> arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        String str7;
        List<String> list2;
        UnityAdsCreativeInfo unityAdsCreativeInfo;
        List<String> list3;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        ArrayList arrayList12;
        ArrayList arrayList13;
        String str8 = str5;
        Logger.d(g, "parsing admob video prefetch - ad ID: ", str3);
        String g2 = k.g(str5);
        List<String> b2 = com.safedk.android.utils.n.b(g.a("destination_url(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;):[\\s]*(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)([\\s\\S]*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)", 2), g2, 1);
        int size = (b2 == null || b2.size() <= 0) ? 1 : b2.size();
        if (b2.size() <= 1) {
            z = false;
        } else {
            Logger.d(g, "parsing admob video prefetch - identified multi ad, ad count: ", Integer.valueOf(b2.size()));
            z = true;
        }
        List<String> i2 = i(g2, str8);
        if (i2.isEmpty() && !TextUtils.isEmpty(str2)) {
            i2.add(str2);
        }
        List<String> D = com.safedk.android.analytics.brandsafety.creatives.discoveries.a.D(str5);
        String e2 = com.safedk.android.utils.n.e(g.a("video_id(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;):[\\s]*(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)([\\s\\S]*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)", 2), str8);
        ArrayList arrayList14 = null;
        if (!TextUtils.isEmpty(e2)) {
            arrayList14.add("element:ytId:" + e2);
        }
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        com.safedk.android.analytics.brandsafety.creatives.discoveries.a.a(g2, arrayList15, arrayList16);
        if (z) {
            arrayList = null;
        } else {
            Iterator it = arrayList15.iterator();
            while (it.hasNext()) {
                str8 = str8.replace((String) it.next(), "");
            }
            arrayList = com.safedk.android.utils.n.f(str8);
        }
        ArrayList arrayList17 = new ArrayList();
        ArrayList arrayList18 = new ArrayList();
        ArrayList arrayList19 = new ArrayList();
        ArrayList arrayList20 = new ArrayList();
        ArrayList arrayList21 = new ArrayList();
        if (!z) {
            arrayList2 = arrayList19;
            arrayList3 = arrayList18;
            arrayList4 = arrayList17;
            arrayList5 = arrayList16;
            arrayList6 = arrayList15;
            str7 = str4;
        } else {
            arrayList2 = arrayList19;
            arrayList3 = arrayList18;
            arrayList4 = arrayList17;
            arrayList5 = arrayList16;
            arrayList6 = arrayList15;
            str7 = str4 + com.safedk.android.analytics.brandsafety.creatives.discoveries.a.a(size, g2, arrayList17, arrayList3, arrayList2, arrayList20, arrayList21) + CreativeInfo.aG + size + CreativeInfo.aI;
        }
        Logger.d(g, "parsing admob video prefetch - admob creative ID: ", i2, ", click URLs: ", b2, ", video id: ", e2, ", ad Id: ", str3);
        int i3 = 0;
        while (i3 < size) {
            List<String> list4 = D;
            int i4 = i3;
            List<String> list5 = i2;
            int i5 = size;
            List<String> list6 = b2;
            ArrayList arrayList22 = arrayList21;
            ArrayList<String> arrayList23 = arrayList;
            ArrayList arrayList24 = arrayList20;
            UnityAdsCreativeInfo unityAdsCreativeInfo2 = new UnityAdsCreativeInfo(str3, i2.size() > i3 ? i2.get(i3) : null, b2.size() == 0 ? null : b2.get(i3), null, null, str7, null, adFormatType, str, this.I, null, str6, null);
            if (list6.size() <= 1) {
                list2 = list6;
                unityAdsCreativeInfo = unityAdsCreativeInfo2;
            } else {
                list2 = list6;
                Logger.d(g, "parsing admob video prefetch - add click urls to debugInfo: ", list2);
                unityAdsCreativeInfo = unityAdsCreativeInfo2;
                unityAdsCreativeInfo.u("clickUrls=" + list2);
            }
            if (i4 < list4.size()) {
                list3 = list4;
                unityAdsCreativeInfo.J(list3.get(i4));
                synchronized (ba) {
                    ba.put(list3.get(i4), unityAdsCreativeInfo);
                }
                Logger.d(g, "parsing admob video prefetch - admob click string: ", list3.get(i4));
            } else {
                list3 = list4;
                Logger.d(g, "parsing admob video prefetch - click string is empty");
            }
            if (i4 >= arrayList6.size()) {
                arrayList7 = arrayList6;
            } else {
                arrayList7 = arrayList6;
                String str9 = (String) arrayList7.get(i4);
                if (str9 != null) {
                    Logger.d(g, "parsing admob video prefetch - calling vast ad parser on ad content: ", str9);
                    a((CreativeInfo) unityAdsCreativeInfo, (String) null, str9, true);
                    if (TextUtils.isEmpty(unityAdsCreativeInfo.N())) {
                        unityAdsCreativeInfo.k(unityAdsCreativeInfo.O());
                    }
                } else {
                    Logger.d(g, "parsing admob video prefetch - ad content is not vast ");
                }
            }
            if (!z) {
                arrayList8 = arrayList2;
                arrayList9 = arrayList3;
                arrayList10 = arrayList24;
                arrayList11 = arrayList4;
                arrayList12 = arrayList22;
            } else {
                unityAdsCreativeInfo.ao();
                if (i4 < arrayList4.size()) {
                    arrayList11 = arrayList4;
                    if (arrayList11.get(i4) != null) {
                        unityAdsCreativeInfo.A(com.safedk.android.analytics.brandsafety.creatives.discoveries.a.b + ((String) arrayList11.get(i4)));
                    }
                } else {
                    arrayList11 = arrayList4;
                }
                if (i4 < arrayList3.size()) {
                    arrayList9 = arrayList3;
                    if (arrayList9.get(i4) != null) {
                        unityAdsCreativeInfo.A(com.safedk.android.analytics.brandsafety.creatives.discoveries.a.c + ((String) arrayList9.get(i4)));
                    }
                } else {
                    arrayList9 = arrayList3;
                }
                if (i4 < arrayList2.size()) {
                    arrayList8 = arrayList2;
                    if (arrayList8.get(i4) != null) {
                        unityAdsCreativeInfo.A(com.safedk.android.analytics.brandsafety.creatives.discoveries.a.d + ((String) arrayList8.get(i4)));
                    }
                } else {
                    arrayList8 = arrayList2;
                }
                if (i4 < arrayList24.size()) {
                    arrayList10 = arrayList24;
                    if (arrayList10.get(i4) != null) {
                        unityAdsCreativeInfo.A(com.safedk.android.analytics.brandsafety.creatives.discoveries.a.e + ((String) arrayList10.get(i4)));
                    }
                } else {
                    arrayList10 = arrayList24;
                }
                if (i4 < arrayList22.size()) {
                    arrayList12 = arrayList22;
                    if (arrayList12.get(i4) != null) {
                        unityAdsCreativeInfo.A(com.safedk.android.analytics.brandsafety.creatives.discoveries.a.f + ((String) arrayList12.get(i4)));
                    }
                } else {
                    arrayList12 = arrayList22;
                }
            }
            if (i4 < arrayList5.size()) {
                arrayList13 = arrayList5;
                if (arrayList13.get(i4) != null) {
                    unityAdsCreativeInfo.A(com.safedk.android.analytics.brandsafety.creatives.discoveries.a.g + ((String) arrayList13.get(i4)));
                }
            } else {
                arrayList13 = arrayList5;
            }
            arrayList = arrayList23;
            unityAdsCreativeInfo.b((List<String>) arrayList);
            list.add(unityAdsCreativeInfo);
            D = list3;
            arrayList6 = arrayList7;
            arrayList4 = arrayList11;
            arrayList3 = arrayList9;
            arrayList2 = arrayList8;
            arrayList20 = arrayList10;
            arrayList5 = arrayList13;
            i2 = list5;
            size = i5;
            i3 = i4 + 1;
            arrayList21 = arrayList12;
            b2 = list2;
        }
    }

    private List<String> i(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        String e2 = com.safedk.android.utils.n.e(g.a("creative_id(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;):[\\s]*(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)([\\s\\S]*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)", 2), str);
        if (!TextUtils.isEmpty(e2)) {
            arrayList.add(e2);
            return arrayList;
        }
        return com.safedk.android.analytics.brandsafety.creatives.discoveries.a.a(str2, true);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo b(Object obj) {
        CreativeInfo remove;
        if (!(obj instanceof String)) {
            Logger.d(g, "match info, adInstance is not a String");
            return null;
        }
        String str = (String) obj;
        Logger.d(g, "match info, string: ", str);
        synchronized (ba) {
            remove = ba.remove(str);
        }
        if (remove != null) {
            Logger.d(g, "match info, click url is: ", remove.M());
            synchronized (bb) {
                bb.put(str, remove);
            }
        } else {
            remove = bb.get(str);
            if (remove != null) {
                Logger.d(g, "match info, multi match to already matched ci, click url is: ", remove.M());
                remove.u("mmci|" + str);
            }
        }
        return remove;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean b(String str, Bundle bundle) {
        boolean C = C(str);
        if (C) {
            Logger.d(g, "should follow input stream started, url: ", str);
        }
        return C;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean g(String str) {
        return C(str) || D(str);
    }

    private boolean C(String str) {
        Iterator<String> it = aL.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean D(String str) {
        return str.toLowerCase().contains(aM) || str.toLowerCase().contains(aN) || str.toLowerCase().contains(aO) || str.toLowerCase().contains(aP) || str.toLowerCase().contains(aQ);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean B(String str) {
        Logger.d(g, "should follow get url started, url: ", str);
        return com.safedk.android.utils.n.i(str) && this.G.contains(com.safedk.android.utils.n.j(str));
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Set<String> c() {
        return new HashSet();
    }

    private String O(String str) {
        for (String str2 : bh.keySet()) {
            String str3 = bh.get(str2);
            if (str3 != null && str != null) {
                Logger.printFullVerboseLog(g, "find inner ad content, prefetch content: ", str3);
                Logger.printFullVerboseLog(g, "find inner ad content, webview resource value: ", str);
                if (str.contains(str3)) {
                    bh.get(str2);
                    return str2;
                }
            }
        }
        Logger.d(g, "find inner ad content, did not find any adId for the webview - ad id to prefetch map keys: ", bh.keySet());
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(String str, String str2, WeakReference<WebView> weakReference) {
        if (str == null) {
            return null;
        }
        Logger.d(g, "get ad id from resource started, webview: ", weakReference, ", value size: ", Integer.valueOf(str.length()));
        String O = O(k.g(str).replaceAll("\\s+", ""));
        if (O == null) {
            return null;
        }
        Logger.d(g, Logger.FeatureTag.CI_MATCHING, "get ad id from resource, matching found via inner prefetch, adId=", O);
        if (com.safedk.android.utils.n.a((Reference<?>) weakReference)) {
            bi.put(O, weakReference);
        } else {
            Logger.d(g, "get ad id from resource - webview is null, not storing ad ID in adIdToWebviewRef");
        }
        return O;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public long a(CreativeInfo creativeInfo) {
        AdNetworkDiscovery j2;
        if (creativeInfo != null && creativeInfo.h() != null && ((creativeInfo.h().contains(b) || creativeInfo.h().contains(c) || creativeInfo.h().contains(d) || creativeInfo.h().contains(W)) && (j2 = CreativeInfoManager.j(com.safedk.android.utils.h.h)) != null)) {
            return j2.a(creativeInfo);
        }
        return super.a(creativeInfo);
    }

    public HashSet<String> a(String str, String str2, String str3, int i2, int i3, HashMap<String, String> hashMap) {
        HashSet<String> hashSet = new HashSet<>();
        try {
            Matcher matcher = g.a(str3).matcher(str);
            while (matcher.find()) {
                if (matcher.groupCount() >= i2 && !TextUtils.isEmpty(matcher.group(i2))) {
                    String group = matcher.group(i2);
                    hashSet.add(group);
                    if (matcher.groupCount() > i3 && !TextUtils.isEmpty(matcher.group(i3))) {
                        hashMap.put(group, matcher.group(i3));
                    }
                }
            }
        } catch (Throwable th) {
            Logger.d(g, "getPatternFromData: exception occurred with message: ", th.getMessage());
        }
        return hashSet;
    }

    private class a {
        String a;
        String b;
        String c;
        CreativeInfo d;
        String e;

        private a(String str, String str2, String str3, CreativeInfo creativeInfo, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = creativeInfo;
            this.e = str4;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(String str, Object obj) {
        WebView webView;
        String str2;
        Pair pair;
        String str3;
        boolean z;
        String str4;
        String str5;
        char c2 = 1;
        if (!str.startsWith("[[\"com.unity3d.services.core.api.") && !str.startsWith("[[\"com.unity3d.services.ads.api.")) {
            Logger.d(g, "handle invocation, data starts with ", str.substring(0, 25));
            return false;
        }
        String a2 = BrandSafetyUtils.a(obj);
        WebView K = K(a2);
        if (K == null) {
            WebView Q = Q(a2);
            if (Q == null) {
                webView = Q;
                str2 = "NA";
            } else {
                Logger.d(g, "handle invocation, found webview using interface construction");
                webView = Q;
                str2 = aW;
            }
        } else {
            webView = K;
            str2 = aV;
        }
        String a3 = BrandSafetyUtils.a((Object) webView);
        boolean f2 = f(obj);
        Object[] objArr = new Object[6];
        objArr[0] = "handle invocation, interface type: ";
        objArr[1] = f2 ? ac : "legacy";
        objArr[2] = ", interface: ";
        objArr[3] = a2;
        objArr[4] = ", webview: ";
        objArr[5] = a3;
        Logger.d(g, objArr);
        HashMap hashMap = new HashMap();
        if (f2) {
            hashMap.put(aC, new Pair("sendDiagnosticEvent\"\\,\\[\"(.*?)\"", 1));
            hashMap.put(aD, new Pair("updateCampaignState.*\"data\":\"(.*?)\"", 1));
            hashMap.put(aF, new Pair("\"get\".*[\\?&\"]hbMeta=(.*?)[\"&\\s]", 1));
            pair = new Pair("sendDiagnosticEvent\".*\"type\":\"openUrlAttempt\"", "openUrl\"\\,\\[\"(.*?)\"");
        } else {
            hashMap.put(aA, new Pair("sending (.*?) (start|impression) event to (.*?)[\\?&\"]data=(.*?)[\"&\\s]", 4));
            hashMap.put(aB, new Pair("sending (.*?) (start|impression|resume) event to (.*?)[\\?&\"]hbMeta=(.*?)[\"&\\s]", 4));
            pair = null;
        }
        if (pair != null && a3 != null) {
            if (g.a((String) pair.first).matcher(str).find()) {
                Logger.d(g, "handle invocation, redirect attempt for: ", a3);
                bj.a((SimpleConcurrentHashSet<String>) a3);
            }
            Matcher matcher = g.a((String) pair.second).matcher(str);
            if (matcher.find() && bj.remove(a3).booleanValue()) {
                String group = matcher.group(1);
                Logger.d(g, "handle invocation, redirect attempt for: ", a3, ", url: ", group);
                BrandSafetyUtils.a("com.unity3d.ads", webView, group, RedirectDetails.RedirectType.REDIRECT, "openUrlAttempt");
            }
        }
        for (String str6 : hashMap.keySet()) {
            Pair pair2 = (Pair) hashMap.get(str6);
            HashMap<String, String> hashMap2 = new HashMap<>();
            HashMap hashMap3 = hashMap;
            String str7 = str6;
            int i2 = 4;
            boolean z2 = f2;
            String str8 = a3;
            Iterator<String> it = a(str, str6, (String) pair2.first, ((Integer) pair2.second).intValue(), 2, hashMap2).iterator();
            CreativeInfo creativeInfo = null;
            while (it.hasNext()) {
                String next = it.next();
                HashMap<String, String> hashMap4 = hashMap2;
                String str9 = hashMap4.get(next);
                Object[] objArr2 = new Object[i2];
                objArr2[0] = "handle invocation, dataEvent=";
                objArr2[c2] = str9;
                objArr2[2] = ", dataFound=";
                objArr2[3] = next;
                Logger.d(g, objArr2);
                if (TextUtils.isEmpty(next)) {
                    str3 = str7;
                    z = z2;
                } else {
                    if (str7.equals(aA)) {
                        creativeInfo = bc.get(next);
                        str5 = next;
                        str4 = str8;
                    } else {
                        if (str7.equals(aB)) {
                            str4 = str8;
                        } else if (str7.equals(aF)) {
                            str4 = str8;
                        } else {
                            if (str7.equals(aC)) {
                                if (!"ad_viewer_campaign_start".equals(next)) {
                                    str4 = str8;
                                } else {
                                    Object[] objArr3 = new Object[2];
                                    objArr3[0] = "handle invocation, protobuf campaign started: ";
                                    str4 = str8;
                                    objArr3[c2] = str4;
                                    Logger.d(g, objArr3);
                                    synchronized (bn) {
                                        bn.add(str4);
                                    }
                                }
                                if ("ad_viewer_campaign_finish".equals(next)) {
                                    Object[] objArr4 = new Object[2];
                                    objArr4[0] = "handle invocation, protobuf campaign finished: ";
                                    objArr4[c2] = str4;
                                    Logger.d(g, objArr4);
                                    synchronized (bn) {
                                        bn.remove(str4);
                                    }
                                }
                            } else {
                                str4 = str8;
                                if (str7.equals(aD) && bn.contains(str4)) {
                                    String optString = ProtobufMessageParser.a(Base64.decode(next, 0), aU).optString("contentId");
                                    if (!TextUtils.isEmpty(optString)) {
                                        Object[] objArr5 = new Object[2];
                                        objArr5[0] = "handle invocation, try to match with content ID: ";
                                        objArr5[c2] = optString;
                                        Logger.d(g, objArr5);
                                        Iterator<String> it2 = be.keySet().iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                break;
                                            }
                                            String next2 = it2.next();
                                            Logger.d(g, "handle invocation, try to match to cid: ", next2);
                                            if (next2 != null && next2.endsWith(optString)) {
                                                creativeInfo = be.get(next2);
                                                break;
                                            }
                                        }
                                        if (creativeInfo != null) {
                                            creativeInfo.u("pbcid=" + optString);
                                        }
                                    }
                                }
                            }
                            str5 = next;
                        }
                        try {
                            next = URLDecoder.decode(next, C.UTF8_NAME);
                        } catch (Throwable th) {
                            Logger.d(g, "handle invocation, decoding exception, ", th.getMessage());
                        }
                        creativeInfo = bd.get(next);
                        str5 = next;
                    }
                    if (creativeInfo != null) {
                        String str10 = str4;
                        String str11 = str7;
                        a aVar = new a(str7, str5, str9, creativeInfo, str);
                        Logger.d(g, "handle invocation, interface address: ", a2, ", webview: ", webView);
                        if (webView != null) {
                            Logger.d(g, Logger.FeatureTag.CI_MATCHING, "handle invocation, match found by ", str11, ", webview: ", str10, ", ad id: ", creativeInfo.L(), " with event: ", str9);
                            if (!b.getInstance().isInBackground()) {
                                a(webView, aVar, z2, str2);
                                return true;
                            }
                            Logger.d(g, Logger.FeatureTag.CI_MATCHING, "handle invocation, application is in background, no match will be made");
                            return false;
                        }
                        Logger.d(g, Logger.FeatureTag.CI_MATCHING, "handle invocation, no webview mapping found, adding to pending ");
                        bg.put(a2, aVar);
                        return false;
                    }
                    str8 = str4;
                    str3 = str7;
                    z = z2;
                    Logger.d(g, "handle invocation, no CI found in map, patternName: ", str3, ", data: ", str5);
                }
                z2 = z;
                hashMap2 = hashMap4;
                str7 = str3;
                i2 = 4;
                c2 = 1;
            }
            f2 = z2;
            hashMap = hashMap3;
            a3 = str8;
            c2 = 1;
        }
        Logger.d(g, "handle invocation, did not find relevant data, interface: ", a2, ", webview: ", a3);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x019c, code lost:
    
        if (r3.W().contains("IO=" + r21) == false) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(WebView webView, a aVar, boolean z, String str) {
        CreativeInfo creativeInfo;
        List<CreativeInfo> v = aVar.d.an() ? v(aVar.d.L()) : null;
        if (v == null) {
            v = new ArrayList<>();
            v.add(aVar.d);
        }
        BrandSafetyUtils.AdType K = v.isEmpty() ? null : v.get(0).K();
        char c2 = 3;
        char c3 = 2;
        if (K == BrandSafetyUtils.AdType.INTERSTITIAL) {
            InterstitialFinder z2 = SafeDK.getInstance().z();
            if (z2 == null) {
                Logger.d(g, "handle invocation - interstitial finder is null, cannot match interstitial info");
                return;
            }
            o r = z2.r("com.unity3d.ads");
            if (!z && r == null) {
                Logger.d(g, "handle invocation - found a message that has an ad associated to it which isn't active");
                bm = "NAIIDM,pattern=" + aVar.a + ",type=" + aVar.c;
                return;
            }
            if (!z && aVar.a.equals(aB)) {
                String a2 = k.a(aVar.e, "bidBundle=", X3.j.c);
                String str2 = aVar.b;
                Iterator<CreativeInfo> it = v.iterator();
                while (it.hasNext()) {
                    String ax2 = ((UnityAdsCreativeInfo) it.next()).ax();
                    boolean z3 = Objects.equal(ax2, a2) || (TextUtils.isEmpty(ax2) && TextUtils.isEmpty(a2));
                    StringBuilder sb = new StringBuilder();
                    sb.append("PMBHB,type=");
                    sb.append(aVar.c);
                    sb.append(",ISE=");
                    sb.append(z3 ? "T" : "F");
                    String sb2 = sb.toString();
                    if (r.B() == null || !r.B().contains(sb2)) {
                        Logger.d(g, "handle invocation - ci bundle id: ", ax2, " data bundle id: ", a2, " is equal: ", Boolean.valueOf(z3));
                        r.d(sb2);
                    }
                }
                CreativeInfo creativeInfo2 = str2 != null ? bd.get(str2) : null;
                Logger.d(g, "handle invocation - not matching, just debug for ad id: ", creativeInfo2 != null ? creativeInfo2.L() : null, ", meta: ", str2);
                return;
            }
        }
        Iterator<CreativeInfo> it2 = v.iterator();
        while (it2.hasNext()) {
            CreativeInfo next = it2.next();
            if (K == BrandSafetyUtils.AdType.INTERSTITIAL && bm != null) {
                if (next.W() == null || !next.W().contains(bm)) {
                    next.u(bm);
                }
                bm = null;
            }
            if (next.W() != null) {
            }
            next.u("IO=" + str);
            String a3 = k.a(aVar.e, "hbMeta=", X3.j.c);
            if (a3 != null && bd.get(a3) != null && (creativeInfo = bd.get(a3)) != null && creativeInfo.L() != null && !creativeInfo.L().equals(next.L())) {
                Object[] objArr = new Object[4];
                objArr[0] = "handle invocation - found hbMeta different ci with id: ";
                objArr[1] = creativeInfo.L();
                objArr[c3] = " vs current: ";
                objArr[c2] = next.L();
                Logger.d(g, objArr);
                if (next.W() != null) {
                    if (next.W().contains("BHBDF,type=" + aVar.c)) {
                    }
                }
                next.u("BHBDF,type=" + aVar.c);
            }
            next.a((Object) webView);
            CreativeInfoManager.a(next, CreativeInfo.j, aVar.a.toLowerCase(), "type=" + aVar.c + ",data=" + aVar.b.substring(0, 50));
            c2 = 3;
            c3 = 2;
        }
    }

    private boolean f(Object obj) {
        return !obj.getClass().getName().equals(e);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(WebView webView, Object obj) {
        String a2 = BrandSafetyUtils.a(obj);
        boolean f2 = f(obj);
        this.R.put(a2, new WeakReference<>(webView));
        Logger.d(g, "map webview: ", webView, " to interface: ", obj);
        a remove = bg.remove(a2);
        if (remove != null) {
            Logger.d(g, Logger.FeatureTag.CI_MATCHING, "handle invocation, match found by ", remove.a, ", webview: ", BrandSafetyUtils.a((Object) webView), ", ad id: ", remove.d.L(), " with event: ", remove.c);
            if (!b.getInstance().isInBackground()) {
                a(webView, remove, f2, aV);
            } else {
                Logger.d(g, Logger.FeatureTag.CI_MATCHING, "handle invocation, application is in background, no match will be made");
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public void i() {
        Logger.d(g, "clear old CIs started");
        super.i();
        com.safedk.android.utils.e.a(bc, "UnityAdsDiscovery:dataptsToCreativeInfo");
        com.safedk.android.utils.e.a(bd, "UnityAdsDiscovery:hbMetaToCreativeInfo");
        com.safedk.android.utils.e.a(be, "UnityAdsDiscovery:contentIdToCreativeInfo");
        com.safedk.android.utils.e.a(ba, "UnityAdsDiscovery:scarAdmobKeyToCreativeInfo");
        com.safedk.android.utils.e.a(bf, "UnityAdsDiscovery:contentToCreativeInfo");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public boolean b(com.safedk.android.analytics.brandsafety.creatives.i iVar) {
        if (super.b(iVar)) {
            return true;
        }
        com.safedk.android.analytics.brandsafety.creatives.i iVar2 = new com.safedk.android.analytics.brandsafety.creatives.i(com.safedk.android.utils.n.A(iVar.toString()));
        if (super.b(iVar2)) {
            Logger.d(g, "VastAdTagUri - is vast in vast is true after decoding the url received from network call: ", iVar2);
            return true;
        }
        if (iVar.toString().contains("%3A")) {
            iVar = new com.safedk.android.analytics.brandsafety.creatives.i(iVar.toString().replace("%3A", ":"));
        }
        return super.b(iVar);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean n(String str) {
        return a(str, "com.unity3d.ads", bi, bf, d.s);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void o(String str) {
        String remove = bh.remove(str);
        Logger.d(g, "clean resources started with ad id: ", str, ", and source is: ", remove);
        if (remove != null) {
            bi.remove(remove);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void x(String str) {
        Logger.d(g, "handle webview interface invoke, interface address: ", str);
        if (str != null) {
            bk = str;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(WebView webView) {
        if (webView instanceof com.unity3d.services.core.webview.WebView) {
            bl = new WeakReference<>(webView);
            Logger.d(g, "store webview on data loaded, adding webview: ", webView);
        } else {
            Logger.d(g, "store webview on data loaded, skipping non inter webView: ", webView);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo a(SimpleConcurrentHashSet<String> simpleConcurrentHashSet) {
        CreativeInfo creativeInfo = null;
        if (simpleConcurrentHashSet == null || simpleConcurrentHashSet.isEmpty()) {
            return null;
        }
        for (String str : simpleConcurrentHashSet.keySet()) {
            if (com.safedk.android.utils.n.x(str) && (creativeInfo = P(str)) != null) {
                break;
            }
        }
        return creativeInfo;
    }

    private CreativeInfo P(String str) {
        ArrayList<CreativeInfo> arrayList;
        Logger.d(g, "try matching by loaded resource, check for url: ", str);
        String substring = str.substring(str.lastIndexOf(47) + 1);
        int lastIndexOf = substring.lastIndexOf(46);
        if (lastIndexOf != -1) {
            substring = substring.substring(0, lastIndexOf);
        }
        if (substring.length() < 64) {
            return null;
        }
        String substring2 = substring.substring(substring.length() - 64);
        synchronized (this.J) {
            arrayList = new ArrayList(this.J.values());
        }
        for (CreativeInfo creativeInfo : arrayList) {
            HashSet<String> s = creativeInfo.s();
            if (s != null && !s.isEmpty() && s.contains(substring2)) {
                Logger.d(g, Logger.FeatureTag.CI_MATCHING, "try matching by loaded resource, ci matched with webpage url: ", str);
                return creativeInfo;
            }
        }
        return null;
    }

    private WebView Q(String str) {
        if (str == null || !str.equals(bk)) {
            Logger.d(g, "get webview, mismatch with last bridge address: ", bk, " vs ", str);
            return null;
        }
        if (com.safedk.android.utils.n.a((Reference<?>) bl)) {
            return bl.get();
        }
        return null;
    }
}
