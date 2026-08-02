package com.applovin.impl.sdk.ad;

import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.arch.core.util.Function;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.adview.e;
import com.applovin.impl.h1;
import com.applovin.impl.h4;
import com.applovin.impl.j5;
import com.applovin.impl.o8;
import com.applovin.impl.p0;
import com.applovin.impl.q4;
import com.applovin.impl.q7;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.net.HttpHeaders;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public abstract class b extends AppLovinAdImpl implements s4 {
    private final Map d;
    private final AtomicBoolean e;
    private final AtomicBoolean f;
    private final AtomicReference g;
    private final Bundle h;
    private String i;
    private long j;
    private String k;
    private int l;
    private int m;
    private String n;
    private d o;
    private List p;

    /* renamed from: com.applovin.impl.sdk.ad.b$b, reason: collision with other inner class name */
    public enum EnumC0109b {
        UNSPECIFIED,
        DISMISS,
        DO_NOT_DISMISS
    }

    public enum c {
        DEFAULT,
        ACTIVITY_PORTRAIT,
        ACTIVITY_LANDSCAPE
    }

    public class d {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        private d() {
            this.a = AppLovinSdkUtils.dpToPx(l.p(), b.this.p());
            this.b = AppLovinSdkUtils.dpToPx(l.p(), b.this.r());
            this.c = AppLovinSdkUtils.dpToPx(l.p(), b.this.n());
            this.d = AppLovinSdkUtils.dpToPx(l.p(), ((Integer) ((AppLovinAdBase) b.this).sdk.a(z4.n1)).intValue());
            this.e = AppLovinSdkUtils.dpToPx(l.p(), ((Integer) ((AppLovinAdBase) b.this).sdk.a(z4.m1)).intValue());
        }
    }

    public enum e {
        RESIZE_ASPECT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public b(JSONObject jSONObject, JSONObject jSONObject2, l lVar) {
        super(jSONObject, jSONObject2, lVar);
        this.d = Collections.synchronizedMap(new HashMap());
        this.e = new AtomicBoolean();
        this.f = new AtomicBoolean();
        this.g = new AtomicReference();
        this.h = new Bundle();
        this.p = new ArrayList();
    }

    private List G() {
        return getIntegerListFromAdObject("multi_close_style", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List d(j5 j5Var) {
        return q7.a(j5Var.a("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List j(j5 j5Var) {
        return q7.a(j5Var.a("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    private String j0() {
        String stringFromAdObject = getStringFromAdObject("video_end_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map l(j5 j5Var) {
        try {
            return JsonUtils.toStringMap(j5Var.a("http_headers_for_postbacks", new JSONObject()));
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public long A() {
        return this.j;
    }

    public AtomicBoolean A0() {
        return this.e;
    }

    public List B() {
        List a2;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda2
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    List k;
                    k = b.this.k((j5) obj);
                    return k;
                }
            });
        }
        synchronized (this.adObjectLock) {
            a2 = q7.a(getJsonObjectFromAdObject("imp_urls", new JSONObject()), getClCode(), null, null, L(), N0(), this.sdk);
        }
        return a2;
    }

    public boolean B0() {
        return getBooleanFromAdObject("lhs_skip_button", (Boolean) this.sdk.a(z4.c2));
    }

    public int C() {
        return getIntFromAdObject("mdafra", ((Integer) this.sdk.a(z4.T0)).intValue());
    }

    public boolean C0() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE);
    }

    public int D() {
        return getIntFromAdObject("mraorpg", ((Integer) this.sdk.a(z4.a7)).intValue());
    }

    public abstract boolean D0();

    public boolean E() {
        return getBooleanFromAdObject("playback_requires_user_action", Boolean.TRUE);
    }

    public boolean E0() {
        return getBooleanFromAdObject("web_contents_debugging_enabled", Boolean.valueOf(q7.j(l.p()) || q7.h(l.p()) || ((Boolean) this.sdk.a(z4.D6)).booleanValue()));
    }

    public List F() {
        List G = G();
        if (G == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(G.size());
        Iterator it = G.iterator();
        while (it.hasNext()) {
            arrayList.add(a(((Integer) it.next()).intValue()));
        }
        return arrayList;
    }

    public void F0() {
        this.m++;
        s0();
    }

    public abstract void G0();

    public List H() {
        return getIntegerListFromAdObject("multi_close_delay_graphic", null);
    }

    public boolean H0() {
        return getBooleanFromAdObject("aarwdc", (Boolean) this.sdk.a(z4.A2));
    }

    public Uri I() {
        String stringFromAdObject = getStringFromAdObject("mute_image", "https://assets.applovin.com/sound_off.png");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public boolean I0() {
        return getBooleanFromAdObject("always_reward_user", (Boolean) this.sdk.a(z4.k1));
    }

    public List J() {
        String stringFromAdObject = getStringFromAdObject("optional_html_resources", null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : Collections.emptyList();
    }

    public boolean J0() {
        return getBooleanFromAdObject("should_apply_mute_setting_to_poststitial", Boolean.FALSE);
    }

    public abstract String K();

    public boolean K0() {
        return this.f.get();
    }

    public Map L() {
        HashMap hashMap = new HashMap();
        try {
            j5 j5Var = this.synchronizedAdObject;
            hashMap.putAll(j5Var != null ? (Map) j5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda13
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    Map l;
                    l = b.l((j5) obj);
                    return l;
                }
            }) : JsonUtils.toStringMap(getJsonObjectFromAdObject("http_headers_for_postbacks", new JSONObject())));
        } catch (JSONException e2) {
            this.sdk.Q();
            if (p.a()) {
                this.sdk.Q().a("DirectAd", "Failed to retrieve http headers for postbacks", e2);
            }
        }
        if (getBooleanFromAdObject("use_webview_ua_for_postbacks", Boolean.FALSE)) {
            hashMap.put(HttpHeaders.USER_AGENT, o8.a());
        }
        return hashMap;
    }

    public boolean L0() {
        return U0() || S0() || T0();
    }

    public EnumC0109b M() {
        String stringFromAdObject = getStringFromAdObject("poststitial_dismiss_type", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            if ("dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return EnumC0109b.DISMISS;
            }
            if ("no_dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return EnumC0109b.DO_NOT_DISMISS;
            }
        }
        return EnumC0109b.UNSPECIFIED;
    }

    public boolean M0() {
        return getBooleanFromAdObject("serfaad", (Boolean) this.sdk.a(z4.S0));
    }

    public int N() {
        return getColorFromAdObject("postitial_progress_bar_color", -922746881);
    }

    public boolean N0() {
        return getBooleanFromAdObject("fire_postbacks_from_webview", Boolean.FALSE);
    }

    public long O() {
        return getLongFromAdObject("postitial_progress_bar_total_ms", -1L);
    }

    public boolean O0() {
        return getBooleanFromAdObject("should_forward_close_button_tapped_to_poststitial", Boolean.FALSE);
    }

    public List P() {
        return getStringListFromAdObject("pbpn", this.sdk.c(z4.S6));
    }

    public boolean P0() {
        return getBooleanFromAdObject("fmsstwvoar", Boolean.FALSE);
    }

    public long Q() {
        long longFromAdObject = getLongFromAdObject("report_reward_duration", -1L);
        if (longFromAdObject >= 0) {
            return TimeUnit.SECONDS.toMillis(longFromAdObject);
        }
        return -1L;
    }

    public boolean Q0() {
        return getBooleanFromAdObject("sftbpn", Boolean.FALSE);
    }

    public int R() {
        return getIntFromAdObject("report_reward_percent", -1);
    }

    public boolean R0() {
        return getBooleanFromAdObject("fvcetwv", Boolean.FALSE);
    }

    public List S() {
        String stringFromAdObject = getStringFromAdObject("required_html_resources", null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : Collections.emptyList();
    }

    public boolean S0() {
        return getStringListFromAdObject("system_bars_hide_list", this.sdk.c(z4.z2)).contains(NotificationCompat.CATEGORY_NAVIGATION);
    }

    public int T() {
        return this.l;
    }

    public boolean T0() {
        return getStringListFromAdObject("system_bars_hide_list", this.sdk.c(z4.z2)).contains("none");
    }

    public int U() {
        return this.m;
    }

    public boolean U0() {
        return getStringListFromAdObject("system_bars_hide_list", this.sdk.c(z4.z2)).contains("status");
    }

    public List V() {
        String stringFromAdObject = getStringFromAdObject("resource_cache_prefix", null);
        ArrayList arrayList = stringFromAdObject != null ? new ArrayList(CollectionUtils.explode(stringFromAdObject)) : new ArrayList(this.sdk.c(z4.G0));
        if (q7.j(l.p())) {
            arrayList.add("https://p.applov.in/");
        }
        return arrayList;
    }

    public boolean V0() {
        return getBooleanFromAdObject("avoms", Boolean.FALSE);
    }

    public List W() {
        return getStringListFromAdObject("rea", S());
    }

    public boolean W0() {
        return getBooleanFromAdObject("report_reward_percent_include_close_delay", Boolean.TRUE);
    }

    public e.a X() {
        int intFromAdObject = getIntFromAdObject("skip_style", -1);
        return intFromAdObject == -1 ? q() : a(intFromAdObject);
    }

    public boolean X0() {
        return getBooleanFromAdObject("require_interaction_for_click", Boolean.FALSE);
    }

    public List Y() {
        return getStringListFromAdObject("substrings_for_disabled_click_logic", Collections.emptyList());
    }

    public boolean Y0() {
        return getBooleanFromAdObject("sruifwvc", Boolean.FALSE);
    }

    public c Z() {
        c cVar = c.DEFAULT;
        String upperCase = getStringFromAdObject("ad_target", cVar.toString()).toUpperCase(Locale.ENGLISH);
        return "ACTIVITY_PORTRAIT".equalsIgnoreCase(upperCase) ? c.ACTIVITY_PORTRAIT : "ACTIVITY_LANDSCAPE".equalsIgnoreCase(upperCase) ? c.ACTIVITY_LANDSCAPE : cVar;
    }

    public boolean Z0() {
        return g() >= 0;
    }

    public String a0() {
        return this.n;
    }

    public boolean a1() {
        return getBooleanFromAdObject("respect_adview_fully_watched", Boolean.FALSE);
    }

    public String b0() {
        return this.k;
    }

    public boolean b1() {
        return getBooleanFromAdObject("sscomt", Boolean.FALSE);
    }

    public void c(String str) {
        this.k = str;
    }

    public List c0() {
        return this.p;
    }

    public boolean c1() {
        return getBooleanFromAdObject("sudbia", (Boolean) this.sdk.a(z4.R6));
    }

    public Uri d0() {
        String stringFromAdObject = getStringFromAdObject("unmute_image", "https://assets.applovin.com/sound_on.png");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public boolean d1() {
        return getBooleanFromAdObject("upiosp", Boolean.FALSE);
    }

    public List e() {
        List a2;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda17
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    List a3;
                    a3 = b.this.a((j5) obj);
                    return a3;
                }
            });
        }
        synchronized (this.adObjectLock) {
            a2 = q7.a(getJsonObjectFromAdObject("ad_closed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public abstract Uri e0();

    public long f() {
        return getLongFromAdObject("ad_dismiss_delay_on_app_launch_ms", TimeUnit.SECONDS.toMillis(3L));
    }

    public long f0() {
        return getLongFromAdObject("close_delay", 0L);
    }

    public long g() {
        return getLongFromAdObject("ad_reshow_delay_on_app_launch_ms", -1L);
    }

    public long g0() {
        return TimeUnit.SECONDS.toMillis(getLongFromAdObject("close_delay_max_buffering_time_seconds", 5L));
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.g4
    public abstract h4 getAdEventTracker();

    public String getCachePrefix() {
        return getStringFromAdObject("cache_prefix", null);
    }

    public Bundle getCustomTabsHeaders() {
        Map hashMap;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            hashMap = (Map) j5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda16
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    Map c2;
                    c2 = b.this.c((j5) obj);
                    return c2;
                }
            });
        } else {
            try {
                hashMap = JsonUtils.toStringMap(getJsonObjectFromAdObject("custom_tabs_http_headers", new JSONObject()));
            } catch (JSONException e2) {
                this.sdk.Q();
                if (p.a()) {
                    this.sdk.Q().a("DirectAd", "Failed to retrieve http headers for Custom Tabs", e2);
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

    public List getCustomTabsNavigationAbortedPostbacks() {
        List a2;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda3
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    List d2;
                    d2 = b.this.d((j5) obj);
                    return d2;
                }
            });
        }
        synchronized (this.adObjectLock) {
            a2 = q7.a(getJsonObjectFromAdObject("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public List getCustomTabsNavigationFailedPostbacks() {
        List a2;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda7
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    List e2;
                    e2 = b.this.e((j5) obj);
                    return e2;
                }
            });
        }
        synchronized (this.adObjectLock) {
            a2 = q7.a(getJsonObjectFromAdObject("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public List getCustomTabsNavigationFinishedPostbacks() {
        List a2;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda8
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    List f;
                    f = b.this.f((j5) obj);
                    return f;
                }
            });
        }
        synchronized (this.adObjectLock) {
            a2 = q7.a(getJsonObjectFromAdObject("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public List getCustomTabsNavigationStartedPostbacks() {
        List a2;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda5
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    List g;
                    g = b.this.g((j5) obj);
                    return g;
                }
            });
        }
        synchronized (this.adObjectLock) {
            a2 = q7.a(getJsonObjectFromAdObject("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public h1 getCustomTabsSettings() {
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (h1) j5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda12
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    h1 h;
                    h = b.h((j5) obj);
                    return h;
                }
            });
        }
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("custom_tabs_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new h1(jsonObjectFromAdObject);
        }
        return null;
    }

    public List getCustomTabsTabHiddenPostbacks() {
        List a2;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda1
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    List i;
                    i = b.this.i((j5) obj);
                    return i;
                }
            });
        }
        synchronized (this.adObjectLock) {
            a2 = q7.a(getJsonObjectFromAdObject("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public List getCustomTabsTabShownPostbacks() {
        List a2;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda9
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    List j;
                    j = b.this.j((j5) obj);
                    return j;
                }
            });
        }
        synchronized (this.adObjectLock) {
            a2 = q7.a(getJsonObjectFromAdObject("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public List getCustomTabsWarmupUrls() {
        return getStringListFromAdObject("custom_tabs_warmup_urls", Collections.emptyList());
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
    public List getOpenMeasurementVerificationScriptResources() {
        List list;
        final Function function = new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda10
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                List a2;
                a2 = b.this.a((JSONArray) obj);
                return a2;
            }
        };
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda11
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    List a2;
                    a2 = b.a(Function.this, (j5) obj);
                    return a2;
                }
            });
        }
        synchronized (this.adObjectLock) {
            list = (List) function.apply(getJsonArrayFromAdObject("omid_verification_script_resources", null));
        }
        return list;
    }

    public long h() {
        return getLongFromAdObject("ardorpgm", ((Long) this.sdk.a(z4.b7)).longValue());
    }

    public int h0() {
        return q7.c(getIntFromAdObject("video_completion_percent", -1));
    }

    public Bundle i() {
        return this.h;
    }

    public List i0() {
        List a2;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda4
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    List m;
                    m = b.this.m((j5) obj);
                    return m;
                }
            });
        }
        synchronized (this.adObjectLock) {
            a2 = q7.a(getJsonObjectFromAdObject("video_end_urls", new JSONObject()), getClCode(), j0(), this.sdk);
        }
        return a2;
    }

    public boolean isCustomTabsClientWarmupEnabled() {
        return getBooleanFromAdObject("custom_tabs_client_warmup_enabled", Boolean.FALSE);
    }

    public boolean isCustomTabsEnabled() {
        return getBooleanFromAdObject("custom_tabs_enabled", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.g4
    public abstract boolean isOpenMeasurementEnabled();

    public List k() {
        List a2;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda15
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    List b;
                    b = b.this.b((j5) obj);
                    return b;
                }
            });
        }
        synchronized (this.adObjectLock) {
            a2 = q7.a(getJsonObjectFromAdObject("app_killed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public e k0() {
        String stringFromAdObject = getStringFromAdObject("video_gravity", null);
        return "top".equals(stringFromAdObject) ? e.TOP : "bottom".equals(stringFromAdObject) ? e.BOTTOM : "left".equals(stringFromAdObject) ? e.LEFT : TtmlNode.RIGHT.equals(stringFromAdObject) ? e.RIGHT : e.RESIZE_ASPECT;
    }

    public int l0() {
        return getColorFromAdObject("progress_bar_color", -922746881);
    }

    public Map m() {
        return this.d;
    }

    public boolean m0() {
        return getBooleanFromAdObject("progress_bar_enabled", Boolean.FALSE);
    }

    public int n() {
        return getIntFromAdObject("close_button_horizontal_margin", ((Integer) this.sdk.a(z4.Q1)).intValue());
    }

    public abstract Uri n0();

    public d o() {
        if (this.o == null) {
            this.o = new d();
        }
        return this.o;
    }

    public int o0() {
        return getIntFromAdObject("whalt", q7.a(getSize()) ? 1 : ((Boolean) this.sdk.a(z4.g6)).booleanValue() ? 0 : -1);
    }

    public int p() {
        return getIntFromAdObject("close_button_size", ((Integer) this.sdk.a(z4.R1)).intValue());
    }

    public com.applovin.impl.adview.l p0() {
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (com.applovin.impl.adview.l) j5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda0
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    com.applovin.impl.adview.l n;
                    n = b.n((j5) obj);
                    return n;
                }
            });
        }
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("web_view_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new com.applovin.impl.adview.l(jsonObjectFromAdObject);
        }
        return null;
    }

    public e.a q() {
        List G = G();
        int intFromAdObject = getIntFromAdObject("close_style", (G == null || G.size() <= 0) ? -1 : ((Integer) G.get(0)).intValue());
        return intFromAdObject == -1 ? a(hasVideoUrl()) : a(intFromAdObject);
    }

    public List q0() {
        return CollectionUtils.explode(getStringFromAdObject("wlh", null));
    }

    public int r() {
        return getIntFromAdObject("close_button_top_margin", ((Integer) this.sdk.a(z4.S1)).intValue());
    }

    public List r0() {
        return CollectionUtils.explode(getStringFromAdObject("wls", ""));
    }

    public long s() {
        List H = H();
        long longFromAdObject = getLongFromAdObject("close_delay_graphic", (H == null || H.size() <= 0) ? 0L : ((Integer) H.get(0)).intValue());
        if (longFromAdObject == -1 || longFromAdObject == -2) {
            return 0L;
        }
        return longFromAdObject;
    }

    public void s0() {
        this.l++;
    }

    public boolean shouldCustomTabsTrackEvents() {
        return getBooleanFromAdObject("custom_tabs_should_track_events", Boolean.FALSE);
    }

    public int t() {
        return getColorFromAdObject("countdown_color", -922746881);
    }

    public boolean t0() {
        return this.l > 0;
    }

    public int u() {
        return getIntFromAdObject("countdown_length", 0);
    }

    public boolean u0() {
        return getBooleanFromAdObject("bvde", (Boolean) this.sdk.a(z4.n6));
    }

    public boolean v() {
        return getBooleanFromAdObject("dismiss_on_skip", Boolean.FALSE);
    }

    public boolean v0() {
        return getBooleanFromAdObject("lhs_close_button", (Boolean) this.sdk.a(z4.P1));
    }

    public String w() {
        return this.i;
    }

    public boolean w0() {
        return getBooleanFromAdObject("forward_lifecycle_events_to_webview", Boolean.FALSE);
    }

    public int x() {
        return getIntFromAdObject("poststitial_dismiss_forward_delay_millis", -1);
    }

    public boolean x0() {
        return getBooleanFromAdObject("gase", Boolean.FALSE);
    }

    public int y() {
        return getIntFromAdObject("poststitial_shown_forward_delay_millis", -1);
    }

    public boolean y0() {
        return getBooleanFromAdObject("lock_current_orientation", Boolean.FALSE);
    }

    public int z() {
        return q7.a(getIntFromAdObject("graphic_completion_percent", -1), 90);
    }

    public abstract boolean z0();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List f(j5 j5Var) {
        return q7.a(j5Var.a("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List g(j5 j5Var) {
        return q7.a(j5Var.a("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h1 h(j5 j5Var) {
        JSONObject a2 = j5Var.a("custom_tabs_settings", (JSONObject) null);
        if (a2 != null) {
            return new h1(a2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List i(j5 j5Var) {
        return q7.a(j5Var.a("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List m(j5 j5Var) {
        return q7.a(j5Var.a("video_end_urls", new JSONObject()), getClCode(), j0(), this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.impl.adview.l n(j5 j5Var) {
        JSONObject a2 = j5Var.a("web_view_settings", (JSONObject) null);
        if (a2 != null) {
            return new com.applovin.impl.adview.l(a2);
        }
        return null;
    }

    public void a(String str) {
        this.i = str;
    }

    public void b(String str) {
        this.n = str;
    }

    public long c() {
        return getLongFromAdObject("batfort", TimeUnit.SECONDS.toMillis(1L));
    }

    private String c(MotionEvent motionEvent, boolean z) {
        String stringFromAdObject = getStringFromAdObject("click_tracking_url", null);
        Map a2 = a(motionEvent, z);
        if (stringFromAdObject != null) {
            return StringUtils.replace(stringFromAdObject, a2);
        }
        return null;
    }

    public void a(long j) {
        this.j = j;
    }

    public void b(boolean z) {
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            j5Var.a("html_resources_cached", z);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putBoolean(this.adObject, "html_resources_cached", z);
        }
    }

    public void d() {
        this.f.set(true);
    }

    public q4 j() {
        return (q4) this.g.getAndSet(null);
    }

    public void a(List list) {
        this.p = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List a(JSONArray jSONArray) {
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
                    this.sdk.Q().a("DirectAd", "Failed to parse OMID verification script resource", th);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Map c(j5 j5Var) {
        try {
            return JsonUtils.toStringMap(j5Var.a("custom_tabs_http_headers", new JSONObject()));
        } catch (JSONException e2) {
            this.sdk.Q();
            if (p.a()) {
                this.sdk.Q().a("DirectAd", "Failed to retrieve http headers for Custom Tabs", e2);
            }
            return new HashMap();
        }
    }

    public String l() {
        String stringFromAdObject = getStringFromAdObject("base_url", "/");
        if (AbstractJsonLexerKt.NULL.equalsIgnoreCase(stringFromAdObject)) {
            return null;
        }
        return stringFromAdObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List b(j5 j5Var) {
        return q7.a(j5Var.a("app_killed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List e(j5 j5Var) {
        return q7.a(j5Var.a("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List k(j5 j5Var) {
        return q7.a(j5Var.a("imp_urls", new JSONObject()), getClCode(), null, null, L(), N0(), this.sdk);
    }

    private List b(final MotionEvent motionEvent, final boolean z) {
        List a2;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda14
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    List a3;
                    a3 = b.this.a(motionEvent, z, (j5) obj);
                    return a3;
                }
            });
        }
        synchronized (this.adObjectLock) {
            a2 = q7.a(getJsonObjectFromAdObject("click_tracking_urls", new JSONObject()), a(motionEvent, z), c(motionEvent, z), L(), N0(), this.sdk);
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List a(Function function, j5 j5Var) {
        return (List) function.apply(j5Var.a("omid_verification_script_resources", (JSONArray) null));
    }

    public void a(String str, String str2) {
        this.d.put(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List a(j5 j5Var) {
        return q7.a(j5Var.a("ad_closed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public List a(MotionEvent motionEvent) {
        return b(motionEvent, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List a(MotionEvent motionEvent, boolean z, j5 j5Var) {
        return q7.a(j5Var.a("click_tracking_urls", new JSONObject()), a(motionEvent, z), c(motionEvent, z), L(), N0(), this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List a(MotionEvent motionEvent, j5 j5Var) {
        return q7.a(j5Var.a("video_click_tracking_urls", new JSONObject()), a(motionEvent, true), null, L(), N0(), this.sdk);
    }

    public List b(final MotionEvent motionEvent) {
        List a2;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            a2 = (List) j5Var.a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda6
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    List a3;
                    a3 = b.this.a(motionEvent, (j5) obj);
                    return a3;
                }
            });
        } else {
            synchronized (this.adObjectLock) {
                a2 = q7.a(getJsonObjectFromAdObject("video_click_tracking_urls", new JSONObject()), a(motionEvent, true), null, L(), N0(), this.sdk);
            }
        }
        return a2.isEmpty() ? b(motionEvent, true) : a2;
    }

    private Map a(MotionEvent motionEvent, boolean z) {
        Point b = p0.b(l.p());
        HashMap hashMap = new HashMap(7);
        hashMap.put("{CLCODE}", getClCode());
        hashMap.put("{CLICK_X}", String.valueOf(motionEvent != null ? motionEvent.getRawX() : -1.0f));
        hashMap.put("{CLICK_Y}", String.valueOf(motionEvent != null ? motionEvent.getRawY() : -1.0f));
        hashMap.put("{SCREEN_WIDTH}", String.valueOf(b.x));
        hashMap.put("{SCREEN_HEIGHT}", String.valueOf(b.y));
        hashMap.put("{IS_VIDEO_CLICK}", String.valueOf(z));
        return hashMap;
    }

    public void a(q4 q4Var) {
        this.g.set(q4Var);
    }

    private e.a a(boolean z) {
        return z ? e.a.WHITE_ON_TRANSPARENT : e.a.WHITE_ON_BLACK;
    }

    protected e.a a(int i) {
        if (i == 1) {
            return e.a.WHITE_ON_TRANSPARENT;
        }
        if (i == 2) {
            return e.a.INVISIBLE;
        }
        if (i == 3) {
            return e.a.TRANSPARENT_SKIP;
        }
        return e.a.WHITE_ON_BLACK;
    }
}
