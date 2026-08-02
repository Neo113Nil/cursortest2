package com.safedk.android.analytics.events;

import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.X3;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.RedirectData;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.m;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SimpleConcurrentHashSet;
import com.safedk.android.utils.d;
import com.safedk.android.utils.h;
import com.safedk.android.utils.k;
import com.safedk.android.utils.n;
import com.vungle.ads.internal.Constants;
import io.ktor.sse.ServerSentEventKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class BrandSafetyEvent extends StatsEvent {
    public static final String a = "click_url";
    public static final String aI = "revenue_event";
    public static final String aP = "webview_resource_urls";
    public static final String aQ = "webview_resource_urls_expanded";
    public static final String aR = "ci_matching_method";
    public static final String aS = "vast_versions";
    private static final String a_ = "BrandSafetyEvent";
    public static final String ac = "max_network_name";
    public static final String ad = "network_name";
    public static final String ae = "dsp_name";
    public static final String af = "custom_js_network_name";
    public static final String ag = "is_first_session";
    public static final String ah = "event_id";
    public static final String ao = "max_creative_id";
    public static final String ap = "creative_id";
    public static final String aq = "did_fail_display_received";
    public static final String ar = "will_display_received";
    public static final String as = "is_banner_view_detected";
    public static final String at = "image_slot";
    public static final String au = "interval_between_display_messages";
    public static final String av = "detected_view_proportions";
    public static final String aw = "device_orientation";
    public static final String ay = "multi_ad_uuid";
    public static final String b = "foreground_activity";
    private static final String bf = "REWARD";
    public static final String c = "impression_id";
    public static final String d = "viewing_time";
    public static final String g = "app_package_name";
    public static final String h = "dsp_domains";
    public static final String i = "ad_format";
    public static final String j = "ad_format_type";
    public static final String k = "third_party_ad_placement_id";
    public static final String m = "sdk_version";
    public static final String n = "impression";
    public static final String o = "image_file_size";
    public static final String p = "image_uniformity";
    public static final String q = "image_id";
    public static final String r = "image_orientation";
    public static final String s = "is_animated";
    private static final long serialVersionUID = 2;
    public static final String t = "is_clicked";
    public static final String u = "ad_recommendations";
    public static final String v = "is_next_session";
    private int L;
    private String M;
    private String N;
    private transient Bundle O;
    private String P;
    private String Q;
    private long R;
    private String S;
    private String T;
    private String U;
    private boolean V;
    private String W;
    private boolean X;
    private long Y;
    private float Z;
    private String aA;
    private String aB;
    private String aC;
    private String aD;
    private String aE;
    private boolean aF;
    private boolean aG;
    private boolean aH;
    String aU;
    HashSet<String> aV;
    Boolean aW;
    HashSet<String> aX;
    HashSet<String> aY;
    HashSet<String> aZ;
    private BrandSafetyUtils.ScreenShotOrientation aa;
    private boolean ai;
    private boolean aj;
    private int ak;
    private long al;
    private float am;
    private String an;
    HashSet<String> ba;
    Boolean bb;
    HashSet<String> bc;
    List<String> bd;
    List<String> be;
    private String bh;
    private String bi;
    private String bj;
    private String bk;
    private boolean bl;
    private RedirectData bm;
    private int bn;
    public static final String e = "slot_number";
    public static final String f = "zone_id";
    public static final String l = "max_ad_unit_id";
    private static final Set<String> ab = new HashSet(Arrays.asList("impression_id", StatsEvent.z, "sdk_uuid", e, "ad_format_type", f, l));
    public static final String aJ = "is_cross_origin_iframe_in_webview";
    public static final String aK = "webpage_resource_url_list";
    public static final String aL = "network_resource_url_list";
    public static final String aM = "expanded_webpage_resource_url_list";
    public static final String aN = "expanded_network_resource_url_list";
    public static final String aT = "is_hidden_iframe_in_webview";
    public static final String aO = "webpage_hidden_resource_urls";
    private static final Set<String> bg = new HashSet(Arrays.asList(aJ, aK, aL, aM, aN, aT, aO));

    public enum AdFormatType {
        INTER,
        REWARD,
        BANNER,
        LEADER,
        MREC,
        APPOPEN,
        NATIVE
    }

    public BrandSafetyEvent() {
        this.P = null;
        this.Q = null;
        this.V = false;
        this.W = null;
        this.X = false;
        this.aE = null;
        this.aU = null;
        this.aF = false;
        this.bk = null;
        this.aW = null;
        this.bb = null;
        this.aG = false;
        this.bl = false;
        this.ai = false;
        this.aj = false;
        this.ak = 0;
        this.al = 0L;
        this.am = 0.0f;
        this.an = null;
        this.aH = false;
        this.bm = null;
        this.bn = 0;
        this.bd = Arrays.asList(BrandSafetyUtils.j, bf, BrandSafetyUtils.l);
        this.be = null;
        this.E = StatsCollector.EventType.BrandSafety;
    }

    public BrandSafetyEvent(String sdk, int slotNumber, String hashValue, boolean clicked, String clickUrl, CreativeInfo creativeInfo, long timestamp, String foregroundActivityName, String impressionMd5, String multiAdUuid, long viewingTime, boolean isMature, Bundle applovinData, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, boolean isAnimated, long imageFileSize, float imageUniformity, int imageSlot, boolean isScarAdMobAd, boolean isFirstSession, String eventId, String maxCreativeId, boolean didFailDisplayReceived, String revenueEventValue, String debugInfo, String impressionLog, RedirectData redirectData, int redirectCount, HashSet<String> dspUrlList, Boolean isCrossOriginIframeInWebpage, SimpleConcurrentHashSet<String> webPageResourceUrlList, SimpleConcurrentHashSet<String> networkResourceUrlList, SimpleConcurrentHashSet<String> expandedWebPageResourceUrlList, SimpleConcurrentHashSet<String> expandedNetworkResourceUrlList, Boolean isHiddenIframeInWebpage, SimpleConcurrentHashSet<String> hiddenWebPageResourceUrlList) {
        super(sdk, StatsCollector.EventType.BrandSafety);
        String clickUrl2;
        this.P = null;
        this.Q = null;
        this.V = false;
        this.W = null;
        this.X = false;
        this.aE = null;
        this.aU = null;
        this.aF = false;
        this.bk = null;
        this.aW = null;
        this.bb = null;
        this.aG = false;
        this.bl = false;
        this.ai = false;
        this.aj = false;
        this.ak = 0;
        this.al = 0L;
        this.am = 0.0f;
        this.an = null;
        this.aH = false;
        this.bm = null;
        this.bn = 0;
        this.bd = Arrays.asList(BrandSafetyUtils.j, bf, BrandSafetyUtils.l);
        this.be = null;
        synchronized (this) {
            try {
                try {
                    this.L = slotNumber;
                    if (timestamp > 0) {
                        try {
                            this.G = n.b(timestamp);
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                    Logger.d(a_, "BrandSafetyEvent ctor creative info: ", creativeInfo, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                    this.aV = new HashSet<>();
                    if (creativeInfo != null) {
                        Iterator<String> it = creativeInfo.am().iterator();
                        while (it.hasNext()) {
                            networkResourceUrlList.remove(it.next());
                        }
                        Iterator<String> it2 = creativeInfo.e().iterator();
                        while (it2.hasNext()) {
                            networkResourceUrlList.remove(it2.next());
                        }
                        if (dspUrlList != null) {
                            creativeInfo.a(new ArrayList<>(dspUrlList));
                        }
                        Logger.d(a_, "webview_resource_urls setting dsp urls list = ", dspUrlList);
                        if (creativeInfo.Q().equals(sdk)) {
                            Logger.d(a_, "creative info sdk is equal to event SDK");
                            this.N = creativeInfo.G();
                            Bundle b2 = creativeInfo.b();
                            this.O = b2;
                            Logger.d(a_, "addedCreativeInfoValues ", b2);
                            if (clickUrl == null) {
                                Logger.d(a_, "self click url is null, setting creative info click url");
                                clickUrl2 = creativeInfo.M();
                            } else {
                                clickUrl2 = clickUrl;
                            }
                            try {
                                Logger.d(a_, "webview_resource_urls removing resource urls list and dsp urls list.");
                                this.D = creativeInfo.t();
                                Logger.d(a_, "BrandSeftyEvent ctor , sdk : ", sdk, ", sdk_version set : ", this.D);
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        } else {
                            Logger.d(a_, "creative info sdk != sdk. creative info sdk: ", creativeInfo.Q(), ", actual sdk: ", creativeInfo.R(), ", sdk: ", sdk);
                            clickUrl2 = clickUrl;
                        }
                        List<String> ar2 = creativeInfo.ar();
                        if (ar2 != null && !ar2.isEmpty()) {
                            this.be = ar2;
                        }
                    } else {
                        boolean a2 = CreativeInfoManager.a(sdk, AdNetworkConfiguration.DONT_REPORT_WEBVIEW_RESOURCE_LIST_IF_NO_CI, false);
                        Logger.d(a_, "the don't report webview resource is: ", Boolean.valueOf(a2));
                        if (!a2 && dspUrlList != null) {
                            this.aV.addAll(dspUrlList);
                        }
                        Logger.d(a_, "webview_resource_urls setting dsp urls list = ", dspUrlList);
                        clickUrl2 = clickUrl;
                    }
                    try {
                        this.M = clickUrl2;
                        try {
                            this.V = clicked;
                            try {
                                this.P = foregroundActivityName;
                                this.Q = impressionMd5;
                                this.bh = multiAdUuid;
                                try {
                                    this.R = viewingTime;
                                    this.aB = maxCreativeId;
                                    if (applovinData != null) {
                                        this.S = applovinData.getString(l);
                                        this.aA = applovinData.getString(ad);
                                        this.T = b(applovinData.getString("ad_format"));
                                        this.U = applovinData.getString(k);
                                        this.aC = applovinData.getString("dsp_name");
                                        this.aD = applovinData.getString(af);
                                        if (maxCreativeId == null) {
                                            this.aB = applovinData.getString("creative_id");
                                        }
                                    }
                                    this.I = isMature;
                                    if (creativeInfo != null) {
                                        try {
                                            this.W = hashValue;
                                            this.aa = screenShotOrientation;
                                            this.X = isAnimated;
                                            if (hashValue != null) {
                                                this.Y = imageFileSize;
                                                try {
                                                    this.Z = imageUniformity;
                                                    this.ak = imageSlot;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                    }
                                    this.az = isFirstSession;
                                    if (eventId != null) {
                                        Logger.d(a_, "eventId = ", eventId);
                                        this.aE = eventId;
                                    }
                                    this.aF = didFailDisplayReceived;
                                    this.bi = debugInfo;
                                    this.bj = impressionLog;
                                    Logger.d(a_, "impression log value = ", revenueEventValue);
                                    this.bm = redirectData;
                                    this.bn = redirectCount;
                                    this.aU = revenueEventValue;
                                    this.aH = isScarAdMobAd;
                                    Logger.d(a_, "revenue event value = ", revenueEventValue);
                                    if (creativeInfo != null && creativeInfo.X() != null && this.bk == null) {
                                        if (creativeInfo.Y() == null) {
                                            this.bk = creativeInfo.X();
                                        } else {
                                            this.bk = creativeInfo.X() + "_" + creativeInfo.Y();
                                        }
                                    }
                                    Logger.d(a_, "matching method value = ", revenueEventValue);
                                    if (creativeInfo != null && isMature) {
                                        Logger.d(a_, "setting matching method for mature ci to null. ci = ", creativeInfo);
                                        creativeInfo.U();
                                    }
                                    this.aW = isCrossOriginIframeInWebpage;
                                    this.aX = webPageResourceUrlList != null ? new HashSet<>(webPageResourceUrlList.keySet()) : new HashSet<>();
                                    this.aY = networkResourceUrlList != null ? new HashSet<>(networkResourceUrlList.keySet()) : new HashSet<>();
                                    this.ba = expandedWebPageResourceUrlList != null ? new HashSet<>(expandedWebPageResourceUrlList.keySet()) : new HashSet<>();
                                    this.aZ = expandedNetworkResourceUrlList != null ? new HashSet<>(expandedNetworkResourceUrlList.keySet()) : new HashSet<>();
                                    this.bb = isHiddenIframeInWebpage;
                                    this.bc = hiddenWebPageResourceUrlList != null ? new HashSet<>(hiddenWebPageResourceUrlList.keySet()) : new HashSet<>();
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                throw th;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            throw th;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                    }
                } catch (Throwable th9) {
                    th = th9;
                }
            } catch (Throwable th10) {
                th = th10;
            }
        }
    }

    public BrandSafetyEvent(String sdk, int slotNumber, String hashValue, boolean clicked, String clickUrl, CreativeInfo creativeInfo, long timestamp, String foregroundActivityName, String impressionMd5, String multiAdUuid, boolean isMature, Bundle applovinData, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, long imageFileSize, float imageUniformity, int imageSlot, boolean willDisplayReceived, boolean isBannerViewDetected, long intervalBetweenDisplayMessages, float detectedViewProportions, String deviceOrientation, boolean isScarAdMobAd, boolean isFirstSession, String eventId, String maxCreativeId, boolean didFailDisplayReceived, String revenueEventValue, String debugInfo, String impressionLog, RedirectData redirectData, int redirectCount, HashSet<String> dspUrlList, Boolean isCrossOriginIframeInWebpage, SimpleConcurrentHashSet<String> webPageResourceUrlList, SimpleConcurrentHashSet<String> networkResourceUrlList, SimpleConcurrentHashSet<String> expandedWebPageResourceUrlList, SimpleConcurrentHashSet<String> expandedNetworkResourceUrlList, Boolean isHiddenIframeInWebpage, SimpleConcurrentHashSet<String> hiddenWebPageResourceUrlList) {
        this(sdk, slotNumber, hashValue, clicked, clickUrl, creativeInfo, timestamp, foregroundActivityName, impressionMd5, multiAdUuid, 0L, isMature, applovinData, screenShotOrientation, false, imageFileSize, imageUniformity, imageSlot, isScarAdMobAd, isFirstSession, eventId, maxCreativeId, didFailDisplayReceived, revenueEventValue, debugInfo, impressionLog, redirectData, redirectCount, dspUrlList, isCrossOriginIframeInWebpage, webPageResourceUrlList, networkResourceUrlList, expandedWebPageResourceUrlList, expandedNetworkResourceUrlList, isHiddenIframeInWebpage, hiddenWebPageResourceUrlList);
        this.aG = true;
        this.ai = willDisplayReceived;
        this.aj = isBannerViewDetected;
        this.al = intervalBetweenDisplayMessages;
        this.am = detectedViewProportions;
        this.an = deviceOrientation;
    }

    public BrandSafetyEvent(String sdk, int slotNumber, String hashValue, boolean clicked, String clickUrl, CreativeInfo creativeInfo, long timestamp, String foregroundActivityName, String impressionMd5, String multiAdUuid, boolean isMature, Bundle applovinData, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, long imageFileSize, float imageUniformity, int imageSlot, boolean willDisplayReceived, boolean isAdViewDetected, long intervalBetweenDisplayMessages, float detectedViewProportions, String deviceOrientation, boolean isFirstSession, String eventId, String maxCreativeId, boolean didFailDisplayReceived, String revenueEventValue, String debugInfo, String impressionLog) {
        this(sdk, slotNumber, hashValue, clicked, clickUrl, creativeInfo, timestamp, foregroundActivityName, impressionMd5, multiAdUuid, 0L, isMature, applovinData, screenShotOrientation, false, imageFileSize, imageUniformity, imageSlot, false, isFirstSession, eventId, maxCreativeId, didFailDisplayReceived, revenueEventValue, debugInfo, impressionLog, null, 0, null, false, null, null, null, null, false, null);
        this.bl = true;
        this.ai = willDisplayReceived;
        this.aj = isAdViewDetected;
        this.al = intervalBetweenDisplayMessages;
        this.am = detectedViewProportions;
        this.an = deviceOrientation;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public StatsCollector.EventType a() {
        return StatsCollector.EventType.BrandSafety;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public String b() {
        return this.Q;
    }

    public void c() {
        this.W = null;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public synchronized void a(StatsEvent statsEvent) {
        boolean z;
        BrandSafetyEvent brandSafetyEvent = (BrandSafetyEvent) statsEvent;
        boolean z2 = false;
        Logger.d(a_, "doAggregation removing dsp urls list. local dspUrlList = ", this.aV, ", isOnUiThread = ", Boolean.valueOf(n.c()));
        this.aV = new HashSet<>();
        Bundle bundle = brandSafetyEvent.O;
        if (bundle != null) {
            Logger.d(a_, "Aggregating downstream struct. eventCreativeValues=", bundle);
            this.O = bundle;
            this.N = brandSafetyEvent.N;
        } else {
            Logger.d(a_, "doAggregation setting dsp urls list");
            if (brandSafetyEvent.aV != null) {
                this.aV.addAll(brandSafetyEvent.aV);
            }
        }
        String str = brandSafetyEvent.M;
        if (!TextUtils.isEmpty(str)) {
            this.M = str;
        }
        long l2 = statsEvent.l();
        if (l2 != 0 && l2 < this.G) {
            this.G = l2;
        }
        long j2 = brandSafetyEvent.R;
        if (j2 > 0 && j2 > this.R) {
            this.R = j2;
        }
        if (brandSafetyEvent.W != null) {
            Logger.d(a_, "doAggregation updating screenShotHashValue to '", brandSafetyEvent.W, "' , image_file_size to ", Long.valueOf(brandSafetyEvent.Y), " and image_max_uniform_pixels to ", Float.valueOf(brandSafetyEvent.Z));
            this.W = brandSafetyEvent.W;
            this.Y = brandSafetyEvent.Y;
            this.Z = brandSafetyEvent.Z;
            this.ak = brandSafetyEvent.ak;
            BrandSafetyUtils.ScreenShotOrientation screenShotOrientation = brandSafetyEvent.aa;
            if (screenShotOrientation != null && screenShotOrientation != BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED) {
                Logger.d(a_, "doAggregation updating screenShotOrientation to '", screenShotOrientation, "'");
                this.aa = screenShotOrientation;
            }
        } else {
            Logger.d(a_, "doAggregation updating image hash to null");
            this.W = null;
            this.Y = 0L;
            this.ak = 0;
            this.aa = null;
            this.Z = 0.0f;
        }
        boolean z3 = brandSafetyEvent.V;
        if (z3) {
            this.V = z3 && (brandSafetyEvent.bh == null || (this.T != null && this.bd.contains(this.T) && CreativeInfoManager.a(this.C, AdNetworkConfiguration.ALLOW_FULL_SCREEN_MULTI_CLICK_URL_UPDATES, false)));
        } else if (brandSafetyEvent.bh != null) {
            this.V = false;
            Logger.d(a_, "doAggregation reset clicked due to multi ad");
        }
        this.X = brandSafetyEvent.X;
        this.aB = brandSafetyEvent.aB;
        this.bh = brandSafetyEvent.bh;
        if (this.aE == null && brandSafetyEvent.aE != null) {
            String str2 = brandSafetyEvent.aE;
            this.aE = str2;
            Logger.d(a_, "doAggregation updating eventId to ", str2);
        }
        if (this.C != null && !this.C.equals(brandSafetyEvent.C) && this.O != null) {
            Logger.d(a_, "doAggregation incompatible SDK. current: ", this.C, ", new: ", brandSafetyEvent.C);
            String string = this.O.getString(CreativeInfo.g, "");
            this.O.putString(CreativeInfo.g, string + "|sdk=" + this.C + ";newSdk=" + brandSafetyEvent.C);
        }
        if (this.aU == null && brandSafetyEvent.aU != null) {
            String str3 = brandSafetyEvent.aU;
            this.aU = str3;
            Logger.d(a_, "doAggregation updating revenueEventValue to ", str3);
        }
        if (this.P == null) {
            String str4 = brandSafetyEvent.P;
            this.P = str4;
            Logger.d(a_, "doAggregation updating foregroundActivityName to ", str4);
        }
        this.ai = brandSafetyEvent.ai;
        this.aj = brandSafetyEvent.aj;
        this.al = brandSafetyEvent.al;
        this.bm = brandSafetyEvent.bm;
        this.bn = brandSafetyEvent.bn;
        this.am = brandSafetyEvent.am;
        this.bi = brandSafetyEvent.bi;
        this.bj = brandSafetyEvent.bj;
        this.aF = brandSafetyEvent.aF;
        if (brandSafetyEvent.aX != null) {
            synchronized (this.aX) {
                this.aX.addAll(brandSafetyEvent.aX);
            }
        }
        if (brandSafetyEvent.aY != null) {
            synchronized (this.aY) {
                this.aY.addAll(brandSafetyEvent.aY);
            }
        }
        if (brandSafetyEvent.ba != null) {
            synchronized (this.ba) {
                this.ba.addAll(brandSafetyEvent.ba);
            }
        }
        if (brandSafetyEvent.aZ != null) {
            synchronized (this.aZ) {
                this.aZ.addAll(brandSafetyEvent.aZ);
            }
        }
        if (brandSafetyEvent.bc != null) {
            synchronized (this.bc) {
                this.bc.addAll(brandSafetyEvent.bc);
            }
        }
        if (brandSafetyEvent.aW != null) {
            if (this.aW == null) {
                z = brandSafetyEvent.aW.booleanValue();
            } else {
                if (!this.aW.booleanValue() && !brandSafetyEvent.aW.booleanValue()) {
                    z = false;
                }
                z = true;
            }
            this.aW = Boolean.valueOf(z);
        }
        if (brandSafetyEvent.bb != null) {
            if (this.bb == null) {
                z2 = brandSafetyEvent.bb.booleanValue();
            } else if (this.bb.booleanValue() || brandSafetyEvent.bb.booleanValue()) {
                z2 = true;
            }
            this.bb = Boolean.valueOf(z2);
        }
        if (brandSafetyEvent.bk != null) {
            this.bk = brandSafetyEvent.bk;
        }
        this.aH = brandSafetyEvent.aH;
        if (brandSafetyEvent.be != null) {
            this.be = brandSafetyEvent.be;
        }
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public synchronized Bundle d() {
        Bundle d2;
        d2 = super.d();
        if (this.L > 0) {
            d2.putInt(e, this.L);
        }
        if (!TextUtils.isEmpty(this.M)) {
            d2.putString(a, this.M);
        }
        if (this.O != null && !this.O.isEmpty()) {
            d2.putAll(this.O);
        } else if (this.aH) {
            d2.putString(CreativeInfo.q, "/scar-admob");
        } else if (this.aV != null && !this.aV.isEmpty()) {
            d2.putStringArrayList(h, new ArrayList<>(this.aV));
        }
        if (!TextUtils.isEmpty(this.P)) {
            d2.putString("foreground_activity", this.P);
        }
        d2.putString("impression_id", this.Q);
        if (!TextUtils.isEmpty(this.bh)) {
            d2.putString(ay, this.bh);
        }
        if (this.R > 0) {
            d2.putLong(d, this.R);
        }
        if (!TextUtils.isEmpty(this.S)) {
            d2.putString(l, this.S);
        }
        if (!TextUtils.isEmpty(this.aA)) {
            d2.putString(ac, this.aA);
        }
        if (!TextUtils.isEmpty(this.aB)) {
            d2.putString(ao, this.aB);
        }
        if (!TextUtils.isEmpty(this.aD)) {
            d2.putString(af, this.aD);
        }
        if (!TextUtils.isEmpty(this.aC) && !d2.containsKey(CreativeInfo.L)) {
            d2.putString(CreativeInfo.L, this.aC);
        }
        if (!TextUtils.isEmpty(this.C)) {
            if (d2.getString("ad_format_type") == null || "com.unity3d.ads".equals(this.C) || h.p.equals(this.C)) {
                d2.putString("ad_format_type", this.T);
            }
            if (d2.getString(f) == null || "com.unity3d.ads".equals(this.C) || h.p.equals(this.C)) {
                d2.putString(f, this.U);
            }
        } else {
            Logger.d(a_, "Sdk field value is null.");
        }
        if (d2.getString("ad_format_type") == null && this.bm != null && this.bm.t != null) {
            d2.putString("ad_format_type", this.bm.t.name());
        }
        d2.putString(StatsEvent.z, "impression");
        if (!TextUtils.isEmpty(this.W)) {
            d2.putString("image_id", this.W);
            if (!this.aG && !this.bl) {
                d2.putBoolean(s, this.X);
            }
            if (this.aa != null) {
                d2.putString("image_orientation", this.aa.name().toLowerCase());
            }
            d2.putLong(o, this.Y);
            d2.putFloat(p, this.Z);
            d2.putInt(at, this.ak);
        }
        d2.putBoolean(t, this.V);
        d2.putBoolean(v, this.J);
        if (!TextUtils.isEmpty(this.bi)) {
            String string = d2.getString(CreativeInfo.g);
            if (string != null) {
                d2.putString(CreativeInfo.g, string + m.ac + this.bi);
            } else {
                d2.putString(CreativeInfo.g, this.bi);
            }
        }
        if (!TextUtils.isEmpty(this.bj)) {
            d2.putString(CreativeInfo.f, this.bj);
        }
        Logger.d(a_, "add impression log to bundle: ", this.bj);
        if (this.aG || this.bl) {
            d2.putBoolean(ar, this.ai);
            d2.putBoolean(as, this.aj);
            if (this.aG && this.al != Long.MAX_VALUE) {
                d2.putLong(au, this.al);
            }
            if (this.am > 0.0f) {
                d2.putFloat(av, this.am);
            }
            d2.putString(aw, this.an);
        }
        if (!this.bl && this.bm != null) {
            d2.putAll(this.bm.a());
            this.bm.a("RedirectCount=" + this.bn);
            if (!TextUtils.isEmpty(this.bm.q)) {
                String string2 = d2.getString(CreativeInfo.g);
                if (string2 != null) {
                    d2.putString(CreativeInfo.g, string2 + m.ac + this.bm.q);
                } else {
                    d2.putString(CreativeInfo.g, this.bm.q);
                }
            }
        }
        d2.putBoolean(ag, this.az);
        if (!TextUtils.isEmpty(this.aE)) {
            d2.putString("event_id", this.aE);
        }
        d2.putBoolean(aq, this.aF);
        if (!TextUtils.isEmpty(this.aU)) {
            d2.putString("revenue_event", this.aU);
        }
        if (this.aW != null) {
            d2.putBoolean(aJ, this.aW.booleanValue());
        }
        if (this.bb != null) {
            d2.putBoolean(aT, this.bb.booleanValue());
        }
        if (this.ba != null && !this.ba.isEmpty()) {
            if (this.bm != null && !this.bm.j && !this.bm.k) {
                synchronized (this.aX) {
                    this.aX.addAll(this.ba);
                }
                synchronized (this.ba) {
                    this.ba.clear();
                }
            } else {
                d2.putStringArrayList(aM, new ArrayList<>(this.ba));
            }
        }
        if (this.aX != null && !this.aX.isEmpty()) {
            d2.putStringArrayList(aK, new ArrayList<>(this.aX));
        }
        if (this.aZ != null && !this.aZ.isEmpty()) {
            if (this.bm != null && !this.bm.j && !this.bm.k) {
                synchronized (this.aY) {
                    this.aY.addAll(this.aZ);
                }
                synchronized (this.aZ) {
                    this.aZ.clear();
                }
            } else {
                d2.putStringArrayList(aN, new ArrayList<>(this.aZ));
            }
        }
        if (this.aY != null && !this.aY.isEmpty()) {
            d2.putStringArrayList(aL, new ArrayList<>(this.aY));
        }
        if (this.bc != null && !this.bc.isEmpty()) {
            d2.putStringArrayList(aO, new ArrayList<>(this.bc));
        }
        if (!TextUtils.isEmpty(this.bk)) {
            d2.putString(aR, this.bk);
        }
        Logger.d(a_, "add matching method to bundle: ", this.bk);
        if (this.be != null) {
            d2.putStringArrayList(aS, new ArrayList<>(this.be));
        }
        return d2;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public Set<String> e() {
        HashSet hashSet = new HashSet(ab);
        if (this.C != null && this.C.equals(h.h)) {
            hashSet.add(a);
        }
        return hashSet;
    }

    public static Set<String> f() {
        return bg;
    }

    private static Map<String, Object> b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (bundle.size() == 0) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap(bundle.size());
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                if (obj instanceof Bundle) {
                    hashMap.put(str, b((Bundle) obj));
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (!arrayList.isEmpty() && (arrayList.get(0) instanceof Bundle)) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (next instanceof Bundle) {
                                arrayList2.add(b((Bundle) next));
                            }
                        }
                        hashMap.put(str, arrayList2);
                    } else {
                        hashMap.put(str, arrayList);
                    }
                } else {
                    hashMap.put(str, obj);
                }
            }
        }
        return hashMap;
    }

    private static Bundle a(Map<String, Object> map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof ArrayList) {
                bundle.putStringArrayList(str, (ArrayList) obj);
            }
        }
        return bundle;
    }

    private String b(String str) {
        String adFormatType;
        Logger.d(a_, "getAdFormatTypeFromMaxAdFormType called, input=", str);
        if (BrandSafetyUtils.j.equals(str)) {
            adFormatType = AdFormatType.INTER.toString();
        } else if (BrandSafetyUtils.k.equals(str)) {
            adFormatType = AdFormatType.REWARD.toString();
        } else if ("BANNER".equals(str) || BrandSafetyUtils.n.equals(str)) {
            adFormatType = AdFormatType.BANNER.toString();
        } else if (BrandSafetyUtils.l.equals(str)) {
            adFormatType = AdFormatType.APPOPEN.toString();
        } else if (BrandSafetyUtils.o.equals(str)) {
            adFormatType = AdFormatType.MREC.toString();
        } else if (!"NATIVE".equals(str)) {
            adFormatType = null;
        } else {
            adFormatType = AdFormatType.NATIVE.toString();
        }
        Logger.d(a_, "getAdFormatTypeFromMaxAdFormType returned  ", adFormatType);
        return adFormatType;
    }

    public String g() {
        return this.aU;
    }

    public void a(String str) {
        this.aU = str;
    }

    public String h() {
        return this.W;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0125 A[Catch: Exception -> 0x027e, TryCatch #0 {Exception -> 0x027e, blocks: (B:3:0x000b, B:5:0x0020, B:7:0x0026, B:8:0x002a, B:11:0x0049, B:13:0x0060, B:15:0x0066, B:16:0x0069, B:18:0x0071, B:20:0x0077, B:21:0x007a, B:24:0x0086, B:25:0x0092, B:28:0x009c, B:29:0x00a2, B:34:0x00de, B:37:0x00eb, B:39:0x00fa, B:47:0x010e, B:49:0x0114, B:51:0x0119, B:53:0x011f, B:55:0x0125, B:56:0x012d, B:58:0x0136, B:60:0x013e, B:62:0x0144, B:63:0x0151, B:65:0x0157, B:66:0x0161, B:68:0x01e9, B:69:0x01f0, B:71:0x01f8, B:72:0x0209, B:74:0x0211, B:76:0x0224, B:78:0x0237, B:79:0x0249, B:80:0x025a, B:87:0x025d, B:89:0x0263, B:90:0x0267, B:92:0x026d, B:95:0x0279), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0136 A[Catch: Exception -> 0x027e, TryCatch #0 {Exception -> 0x027e, blocks: (B:3:0x000b, B:5:0x0020, B:7:0x0026, B:8:0x002a, B:11:0x0049, B:13:0x0060, B:15:0x0066, B:16:0x0069, B:18:0x0071, B:20:0x0077, B:21:0x007a, B:24:0x0086, B:25:0x0092, B:28:0x009c, B:29:0x00a2, B:34:0x00de, B:37:0x00eb, B:39:0x00fa, B:47:0x010e, B:49:0x0114, B:51:0x0119, B:53:0x011f, B:55:0x0125, B:56:0x012d, B:58:0x0136, B:60:0x013e, B:62:0x0144, B:63:0x0151, B:65:0x0157, B:66:0x0161, B:68:0x01e9, B:69:0x01f0, B:71:0x01f8, B:72:0x0209, B:74:0x0211, B:76:0x0224, B:78:0x0237, B:79:0x0249, B:80:0x025a, B:87:0x025d, B:89:0x0263, B:90:0x0267, B:92:0x026d, B:95:0x0279), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0157 A[Catch: Exception -> 0x027e, TryCatch #0 {Exception -> 0x027e, blocks: (B:3:0x000b, B:5:0x0020, B:7:0x0026, B:8:0x002a, B:11:0x0049, B:13:0x0060, B:15:0x0066, B:16:0x0069, B:18:0x0071, B:20:0x0077, B:21:0x007a, B:24:0x0086, B:25:0x0092, B:28:0x009c, B:29:0x00a2, B:34:0x00de, B:37:0x00eb, B:39:0x00fa, B:47:0x010e, B:49:0x0114, B:51:0x0119, B:53:0x011f, B:55:0x0125, B:56:0x012d, B:58:0x0136, B:60:0x013e, B:62:0x0144, B:63:0x0151, B:65:0x0157, B:66:0x0161, B:68:0x01e9, B:69:0x01f0, B:71:0x01f8, B:72:0x0209, B:74:0x0211, B:76:0x0224, B:78:0x0237, B:79:0x0249, B:80:0x025a, B:87:0x025d, B:89:0x0263, B:90:0x0267, B:92:0x026d, B:95:0x0279), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e9 A[Catch: Exception -> 0x027e, TryCatch #0 {Exception -> 0x027e, blocks: (B:3:0x000b, B:5:0x0020, B:7:0x0026, B:8:0x002a, B:11:0x0049, B:13:0x0060, B:15:0x0066, B:16:0x0069, B:18:0x0071, B:20:0x0077, B:21:0x007a, B:24:0x0086, B:25:0x0092, B:28:0x009c, B:29:0x00a2, B:34:0x00de, B:37:0x00eb, B:39:0x00fa, B:47:0x010e, B:49:0x0114, B:51:0x0119, B:53:0x011f, B:55:0x0125, B:56:0x012d, B:58:0x0136, B:60:0x013e, B:62:0x0144, B:63:0x0151, B:65:0x0157, B:66:0x0161, B:68:0x01e9, B:69:0x01f0, B:71:0x01f8, B:72:0x0209, B:74:0x0211, B:76:0x0224, B:78:0x0237, B:79:0x0249, B:80:0x025a, B:87:0x025d, B:89:0x0263, B:90:0x0267, B:92:0x026d, B:95:0x0279), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f8 A[Catch: Exception -> 0x027e, TryCatch #0 {Exception -> 0x027e, blocks: (B:3:0x000b, B:5:0x0020, B:7:0x0026, B:8:0x002a, B:11:0x0049, B:13:0x0060, B:15:0x0066, B:16:0x0069, B:18:0x0071, B:20:0x0077, B:21:0x007a, B:24:0x0086, B:25:0x0092, B:28:0x009c, B:29:0x00a2, B:34:0x00de, B:37:0x00eb, B:39:0x00fa, B:47:0x010e, B:49:0x0114, B:51:0x0119, B:53:0x011f, B:55:0x0125, B:56:0x012d, B:58:0x0136, B:60:0x013e, B:62:0x0144, B:63:0x0151, B:65:0x0157, B:66:0x0161, B:68:0x01e9, B:69:0x01f0, B:71:0x01f8, B:72:0x0209, B:74:0x0211, B:76:0x0224, B:78:0x0237, B:79:0x0249, B:80:0x025a, B:87:0x025d, B:89:0x0263, B:90:0x0267, B:92:0x026d, B:95:0x0279), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0211 A[Catch: Exception -> 0x027e, TryCatch #0 {Exception -> 0x027e, blocks: (B:3:0x000b, B:5:0x0020, B:7:0x0026, B:8:0x002a, B:11:0x0049, B:13:0x0060, B:15:0x0066, B:16:0x0069, B:18:0x0071, B:20:0x0077, B:21:0x007a, B:24:0x0086, B:25:0x0092, B:28:0x009c, B:29:0x00a2, B:34:0x00de, B:37:0x00eb, B:39:0x00fa, B:47:0x010e, B:49:0x0114, B:51:0x0119, B:53:0x011f, B:55:0x0125, B:56:0x012d, B:58:0x0136, B:60:0x013e, B:62:0x0144, B:63:0x0151, B:65:0x0157, B:66:0x0161, B:68:0x01e9, B:69:0x01f0, B:71:0x01f8, B:72:0x0209, B:74:0x0211, B:76:0x0224, B:78:0x0237, B:79:0x0249, B:80:0x025a, B:87:0x025d, B:89:0x0263, B:90:0x0267, B:92:0x026d, B:95:0x0279), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0224 A[Catch: Exception -> 0x027e, TryCatch #0 {Exception -> 0x027e, blocks: (B:3:0x000b, B:5:0x0020, B:7:0x0026, B:8:0x002a, B:11:0x0049, B:13:0x0060, B:15:0x0066, B:16:0x0069, B:18:0x0071, B:20:0x0077, B:21:0x007a, B:24:0x0086, B:25:0x0092, B:28:0x009c, B:29:0x00a2, B:34:0x00de, B:37:0x00eb, B:39:0x00fa, B:47:0x010e, B:49:0x0114, B:51:0x0119, B:53:0x011f, B:55:0x0125, B:56:0x012d, B:58:0x0136, B:60:0x013e, B:62:0x0144, B:63:0x0151, B:65:0x0157, B:66:0x0161, B:68:0x01e9, B:69:0x01f0, B:71:0x01f8, B:72:0x0209, B:74:0x0211, B:76:0x0224, B:78:0x0237, B:79:0x0249, B:80:0x025a, B:87:0x025d, B:89:0x0263, B:90:0x0267, B:92:0x026d, B:95:0x0279), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ee  */
    @Override // com.safedk.android.analytics.events.base.StatsEvent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bundle a(Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        try {
            String string = bundle.getString("ad_format_type");
            String string2 = bundle.getString("impression_id");
            String str2 = null;
            String b2 = n.b(bundle, ac);
            if (b2 != null && !b2.isEmpty()) {
                str2 = CreativeInfoManager.c(b2);
            }
            Logger.d(a_, Logger.FeatureTag.RESOURCES, "network name = ", b2, ", sdk package = ", str2, ", ad type = ", string);
            if (str2 != null && string != null) {
                HashSet hashSet = new HashSet();
                HashSet<String> hashSet2 = new HashSet<>();
                HashSet hashSet3 = new HashSet();
                HashSet<String> c2 = n.c(bundle, aK);
                if (c2 != null && !c2.isEmpty()) {
                    hashSet2.addAll(c2);
                }
                HashSet<String> c3 = n.c(bundle, aM);
                if (c3 != null && !c3.isEmpty()) {
                    hashSet3.addAll(c3);
                }
                HashSet<String> c4 = n.c(bundle, aO);
                if (c4 == null) {
                    z = false;
                } else {
                    c4.remove("");
                    z = !c4.isEmpty();
                }
                HashSet<String> c5 = n.c(bundle, aL);
                if (c5 != null && z) {
                    z2 = c5.removeAll(c4);
                } else {
                    z2 = false;
                }
                HashSet<String> c6 = n.c(bundle, aN);
                boolean P = SafeDK.getInstance().P();
                boolean a2 = CreativeInfoManager.a(str2, AdNetworkConfiguration.SUPPORTS_DIFFERENT_ADS_IN_CROSS_ORIGIN_IFRAMES, false);
                Logger.FeatureTag featureTag = Logger.FeatureTag.JS_RESOURCES;
                boolean z4 = z2;
                Object[] objArr = new Object[6];
                objArr[0] = "prepare bundle for reporting, package: ";
                objArr[1] = str2;
                objArr[2] = ", supportMergingWebviewNetworkResources: ";
                String str3 = "YES";
                objArr[3] = P ? "YES" : "NO";
                objArr[4] = ", supportDifferentAdsInCrossOriginIframes: ";
                if (!a2) {
                    str3 = "NO";
                }
                objArr[5] = str3;
                Logger.d(a_, featureTag, objArr);
                if (!Objects.equals(string, BrandSafetyUtils.j) && !Objects.equals(string, bf)) {
                    z3 = false;
                    if (P && (!z3 || !a2)) {
                        if (c5 != null && !c5.isEmpty()) {
                            hashSet2.addAll(c5);
                        }
                        if (c6 != null && !c6.isEmpty()) {
                            hashSet3.addAll(c6);
                        }
                    }
                    if (z3) {
                        hashSet2 = k.a(hashSet2, "text:");
                    }
                    if (!CreativeInfoManager.a(str2, AdNetworkConfiguration.SUPPORT_WEBVIEW_COMMENT_EXTRACTION, false)) {
                        hashSet2 = k.a(hashSet2, CreativeInfo.aS);
                    }
                    if (hashSet2 != null && !hashSet2.isEmpty()) {
                        hashSet.addAll(hashSet2);
                        bundle.putStringArrayList(aP, new ArrayList<>(hashSet));
                    }
                    if (!hashSet3.isEmpty()) {
                        bundle.putStringArrayList(aQ, new ArrayList<>(hashSet3));
                    }
                    Logger.d(a_, Logger.FeatureTag.RESOURCES, "prepare bundle for reporting, type: ", string, ", package: ", str2, ", impression id: ", string2);
                    Logger.printFullVerboseLog(a_, Logger.FeatureTag.JS_RESOURCES, "prepare bundle for reporting, webpage resources: ", c2);
                    Logger.printFullVerboseLog(a_, Logger.FeatureTag.NW_RESOURCES, "prepare bundle for reporting, network resources: ", c5);
                    Logger.printFullVerboseLog(a_, Logger.FeatureTag.RESOURCES, "prepare bundle for reporting, final resources: ", hashSet);
                    Logger.printFullVerboseLog(a_, Logger.FeatureTag.JS_RESOURCES, "prepare bundle for reporting, expanded webpage resources: ", c3);
                    Logger.printFullVerboseLog(a_, Logger.FeatureTag.NW_RESOURCES, "prepare bundle for reporting, expanded network resources: ", c6);
                    Logger.printFullVerboseLog(a_, Logger.FeatureTag.RESOURCES, "prepare bundle for reporting, final expanded resources: ", hashSet3);
                    if (bundle.getString(CreativeInfo.g) == null) {
                        str = bundle.getString(CreativeInfo.g);
                    } else {
                        str = "";
                    }
                    if (bundle.getBoolean(aJ)) {
                        str = str + "|co1";
                    }
                    if (bundle.getBoolean(aT)) {
                        str = str + "|hi1";
                    }
                    if (z) {
                        String str4 = str + "|hr";
                        str = z4 ? str4 + "2" : str4 + "1";
                    }
                    bundle.putString(CreativeInfo.g, str);
                }
                z3 = true;
                if (P) {
                    if (c5 != null) {
                        hashSet2.addAll(c5);
                    }
                    if (c6 != null) {
                        hashSet3.addAll(c6);
                    }
                }
                if (z3) {
                }
                if (!CreativeInfoManager.a(str2, AdNetworkConfiguration.SUPPORT_WEBVIEW_COMMENT_EXTRACTION, false)) {
                }
                if (hashSet2 != null) {
                    hashSet.addAll(hashSet2);
                    bundle.putStringArrayList(aP, new ArrayList<>(hashSet));
                }
                if (!hashSet3.isEmpty()) {
                }
                Logger.d(a_, Logger.FeatureTag.RESOURCES, "prepare bundle for reporting, type: ", string, ", package: ", str2, ", impression id: ", string2);
                Logger.printFullVerboseLog(a_, Logger.FeatureTag.JS_RESOURCES, "prepare bundle for reporting, webpage resources: ", c2);
                Logger.printFullVerboseLog(a_, Logger.FeatureTag.NW_RESOURCES, "prepare bundle for reporting, network resources: ", c5);
                Logger.printFullVerboseLog(a_, Logger.FeatureTag.RESOURCES, "prepare bundle for reporting, final resources: ", hashSet);
                Logger.printFullVerboseLog(a_, Logger.FeatureTag.JS_RESOURCES, "prepare bundle for reporting, expanded webpage resources: ", c3);
                Logger.printFullVerboseLog(a_, Logger.FeatureTag.NW_RESOURCES, "prepare bundle for reporting, expanded network resources: ", c6);
                Logger.printFullVerboseLog(a_, Logger.FeatureTag.RESOURCES, "prepare bundle for reporting, final expanded resources: ", hashSet3);
                if (bundle.getString(CreativeInfo.g) == null) {
                }
                if (bundle.getBoolean(aJ)) {
                }
                if (bundle.getBoolean(aT)) {
                }
                if (z) {
                }
                bundle.putString(CreativeInfo.g, str);
            }
            Set<String> f2 = f();
            if (f2 != null) {
                for (String str5 : f2) {
                    if (bundle.containsKey(str5)) {
                        bundle.remove(str5);
                    }
                }
            }
        } catch (Exception e2) {
            Logger.d(a_, "caught exception: ", e2.getMessage(), ServerSentEventKt.SPACE, e2);
        }
        return bundle;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent, com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject i2 = super.i();
        i2.put("slotNumber", this.L);
        if (!TextUtils.isEmpty(this.M)) {
            i2.put(Constants.CLICK_URL, this.M);
        }
        if (!TextUtils.isEmpty(this.N)) {
            i2.put("addedCreativeInfoKey", this.N);
        }
        if (!TextUtils.isEmpty(this.P)) {
            i2.put("foregroundActivityName", this.P);
        }
        if (!TextUtils.isEmpty(this.Q)) {
            i2.put("impressionId", this.Q);
        }
        if (!TextUtils.isEmpty(this.bh)) {
            i2.put("multiAdUuid", this.bh);
        }
        i2.put("viewingTime", this.R);
        if (!TextUtils.isEmpty(this.S)) {
            i2.put("maxAdUnitId", this.S);
        }
        if (!TextUtils.isEmpty(this.aA)) {
            i2.put("maxNetworkName", this.aA);
        }
        if (!TextUtils.isEmpty(this.T)) {
            i2.put("applovinDataAdFormatType", this.T);
        }
        if (!TextUtils.isEmpty(this.U)) {
            i2.put("applovinData3rdPartyPlacementId", this.U);
        }
        if (!TextUtils.isEmpty(this.aB)) {
            i2.put("maxCreativeId", this.aB);
        }
        if (!TextUtils.isEmpty(this.aC)) {
            i2.put("dspName", this.aC);
        }
        if (!TextUtils.isEmpty(this.aD)) {
            i2.put("customJsNetworkName", this.aD);
        }
        i2.put("clicked", this.V);
        if (!TextUtils.isEmpty(this.W)) {
            i2.put("screenShotHashValue", this.W);
        }
        i2.put("isAnimated", this.X);
        i2.put("imageFileSize", this.Y);
        i2.put("imageUniformity", this.Z);
        if (!TextUtils.isEmpty(this.aE)) {
            i2.put("eventId", this.aE);
        }
        if (!TextUtils.isEmpty(this.aU)) {
            i2.put("revenueEventValue", this.aU);
        }
        BrandSafetyUtils.ScreenShotOrientation screenShotOrientation = this.aa;
        if (screenShotOrientation != null) {
            i2.put("screenShotOrientation", screenShotOrientation.name());
        }
        i2.put("didFailDisplayReceived", this.aF);
        if (!TextUtils.isEmpty(this.bi)) {
            i2.put("debugInfo", this.bi);
        }
        if (!TextUtils.isEmpty(this.bj)) {
            i2.put("impressionLog", this.bj);
        }
        i2.put(X3.w, this.aG);
        i2.put("isNative", this.bl);
        i2.put("willDisplayReceived", this.ai);
        i2.put("isBannerViewDetected", this.aj);
        i2.put("imageSlot", this.ak);
        i2.put("intervalBetweenDisplayMessages", this.al);
        i2.put("detectedViewProportions", this.am);
        if (!TextUtils.isEmpty(this.an)) {
            i2.put(X3.j.A, this.an);
        }
        i2.put("isScarAdMobAd", this.aH);
        RedirectData redirectData = this.bm;
        if (redirectData != null) {
            i2.put("redirectData", redirectData.i());
        }
        i2.put("redirectCount", this.bn);
        HashSet<String> hashSet = this.aV;
        if (hashSet != null) {
            i2.put("dspUrlList", d.a(hashSet));
        }
        Boolean bool = this.aW;
        if (bool != null) {
            i2.put("isCrossOriginIframeInWebpage", bool);
        }
        Boolean bool2 = this.bb;
        if (bool2 != null) {
            i2.put("isHiddenIframeInWebpage", bool2);
        }
        HashSet<String> hashSet2 = this.aX;
        if (hashSet2 != null) {
            i2.put("webPageResourceUrlList", d.a(hashSet2));
        }
        HashSet<String> hashSet3 = this.aY;
        if (hashSet3 != null) {
            i2.put("networkResourceUrlList", d.a(hashSet3));
        }
        HashSet<String> hashSet4 = this.aZ;
        if (hashSet4 != null) {
            i2.put("expandedNetworkResourceUrlList", d.a(hashSet4));
        }
        HashSet<String> hashSet5 = this.ba;
        if (hashSet5 != null) {
            i2.put("expandedWebPageResourceUrlList", d.a(hashSet5));
        }
        HashSet<String> hashSet6 = this.bc;
        if (hashSet6 != null) {
            i2.put("hiddenWebPageResourceUrlList", d.a(hashSet6));
        }
        if (!TextUtils.isEmpty(this.bk)) {
            i2.put("matchingMethod", this.bk);
        }
        Bundle bundle = this.O;
        if (bundle != null) {
            i2.put("addedCreativeInfoValues", d.a(bundle));
        }
        List<String> list = this.be;
        if (list != null) {
            i2.put("vastDocVersionList", d.a(list));
        }
        return i2;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent, com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            super.a(jSONObject);
            this.L = jSONObject.optInt("slotNumber", 0);
            this.M = jSONObject.optString(Constants.CLICK_URL, "");
            this.N = jSONObject.optString("addedCreativeInfoKey", "");
            this.P = jSONObject.optString("foregroundActivityName", "");
            this.Q = jSONObject.optString("impressionId", "");
            this.bh = jSONObject.optString("multiAdUuid", "");
            this.R = jSONObject.optLong("viewingTime", 0L);
            this.S = jSONObject.optString("maxAdUnitId", "");
            this.aA = jSONObject.optString("maxNetworkName", "");
            this.T = jSONObject.optString("applovinDataAdFormatType", "");
            this.U = jSONObject.optString("applovinData3rdPartyPlacementId", "");
            this.aB = jSONObject.optString("maxCreativeId", "");
            this.aC = jSONObject.optString("dspName", "");
            this.aD = jSONObject.optString("customJsNetworkName", "");
            this.V = jSONObject.optBoolean("clicked", false);
            this.W = jSONObject.optString("screenShotHashValue", "");
            this.X = jSONObject.optBoolean("isAnimated", false);
            this.Y = jSONObject.optLong("imageFileSize", 0L);
            this.Z = (float) jSONObject.optDouble("imageUniformity", 0.0d);
            this.aE = jSONObject.optString("eventId", "");
            this.aU = jSONObject.optString("revenueEventValue", "");
            this.aa = BrandSafetyUtils.ScreenShotOrientation.valueOf(jSONObject.optString("screenShotOrientation", BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED.name()));
            this.aF = jSONObject.optBoolean("didFailDisplayReceived", false);
            this.bi = jSONObject.optString("debugInfo", "");
            this.bj = jSONObject.optString("impressionLog", "");
            this.bk = jSONObject.optString("matchingMethod", "");
            this.aG = jSONObject.optBoolean(X3.w, false);
            this.bl = jSONObject.optBoolean("isNative", false);
            this.ai = jSONObject.optBoolean("willDisplayReceived", false);
            this.aj = jSONObject.optBoolean("isBannerViewDetected", false);
            this.ak = jSONObject.optInt("imageSlot", 0);
            this.al = jSONObject.optLong("intervalBetweenDisplayMessages", 0L);
            this.am = (float) jSONObject.optDouble("detectedViewProportions", 0.0d);
            this.an = jSONObject.optString(X3.j.A, "");
            this.aH = jSONObject.optBoolean("isScarAdMobAd", false);
            this.bn = jSONObject.optInt("redirectCount", 0);
            if (jSONObject.has("isCrossOriginIframeInWebpage") && !jSONObject.isNull("isCrossOriginIframeInWebpage")) {
                this.aW = Boolean.valueOf(jSONObject.optBoolean("isCrossOriginIframeInWebpage"));
            }
            if (jSONObject.has("isHiddenIframeInWebpage") && !jSONObject.isNull("isHiddenIframeInWebpage")) {
                this.bb = Boolean.valueOf(jSONObject.optBoolean("isHiddenIframeInWebpage"));
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("dspUrlList");
            if (optJSONArray != null) {
                this.aV = new HashSet<>(d.b(optJSONArray));
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("webPageResourceUrlList");
            if (optJSONArray2 != null) {
                this.aX = new HashSet<>(d.b(optJSONArray2));
            }
            JSONArray optJSONArray3 = jSONObject.optJSONArray("networkResourceUrlList");
            if (optJSONArray3 != null) {
                this.aY = new HashSet<>(d.b(optJSONArray3));
            }
            JSONArray optJSONArray4 = jSONObject.optJSONArray("expandedNetworkResourceUrlList");
            if (optJSONArray4 != null) {
                this.aZ = new HashSet<>(d.b(optJSONArray4));
            }
            JSONArray optJSONArray5 = jSONObject.optJSONArray("expandedWebPageResourceUrlList");
            if (optJSONArray5 != null) {
                this.ba = new HashSet<>(d.b(optJSONArray5));
            }
            JSONArray optJSONArray6 = jSONObject.optJSONArray("hiddenWebageResourceUrlList");
            if (optJSONArray6 != null) {
                this.bc = new HashSet<>(d.b(optJSONArray6));
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("redirectData");
            if (optJSONObject != null) {
                RedirectData redirectData = new RedirectData();
                this.bm = redirectData;
                redirectData.a(optJSONObject);
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("addedCreativeInfoValues");
            if (optJSONObject2 != null) {
                this.O = a(d.b(optJSONObject2));
            }
            JSONArray optJSONArray7 = jSONObject.optJSONArray("vastDocVersionList");
            if (optJSONArray7 != null) {
                this.be = d.b(optJSONArray7);
            }
        }
    }
}
