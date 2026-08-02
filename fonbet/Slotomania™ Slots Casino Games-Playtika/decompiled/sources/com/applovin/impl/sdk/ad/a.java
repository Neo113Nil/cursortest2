package com.applovin.impl.sdk.ad;

import android.net.Uri;
import android.text.TextUtils;
import androidx.core.util.Consumer;
import com.applovin.impl.adview.e;
import com.applovin.impl.i4;
import com.applovin.impl.j5;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.m;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class a extends b implements s4 {
    private final String q;
    private final String r;
    private final String s;
    private final i4 t;

    public a(JSONObject jSONObject, JSONObject jSONObject2, l lVar) {
        super(jSONObject, jSONObject2, lVar);
        this.q = h1();
        this.r = l1();
        this.s = k1();
        this.t = new i4(this);
    }

    private String k1() {
        return getStringFromAdObject("stream_url", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(j5 j5Var) {
        j5Var.b(CreativeInfo.al, this.q);
        j5Var.b("stream_url", this.s);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean D0() {
        return containsKeyForAdObject("stream_url");
    }

    @Override // com.applovin.impl.sdk.ad.b
    public void G0() {
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            j5Var.a(new Consumer() { // from class: com.applovin.impl.sdk.ad.a$$ExternalSyntheticLambda0
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    a.this.o((j5) obj);
                }
            });
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, CreativeInfo.al, this.q);
            JsonUtils.putString(this.adObject, "stream_url", this.s);
        }
    }

    @Override // com.applovin.impl.sdk.ad.b
    public String K() {
        return this.r;
    }

    public void a(Uri uri) {
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            j5Var.b("video", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "video", uri.toString());
        }
    }

    public void b(List list) {
        String h1 = h1();
        if (CollectionUtils.isEmpty(list) || TextUtils.isEmpty(h1)) {
            return;
        }
        Map m = m();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String uri = ((Uri) it.next()).toString();
            String str = (String) m.get(uri);
            if (StringUtils.isValidString(str)) {
                h1 = StringUtils.replace(h1, uri, str);
            }
        }
        d(h1);
    }

    public void d(String str) {
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            j5Var.b(CreativeInfo.al, str);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, CreativeInfo.al, str);
        }
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri e0() {
        String stringFromAdObject = getStringFromAdObject("video_click_url", "");
        return StringUtils.isValidString(stringFromAdObject) ? Uri.parse(stringFromAdObject) : f1();
    }

    public long e1() {
        return getLongFromAdObject("ad_load_timeout_ms", 0L);
    }

    public Uri f1() {
        String stringFromAdObject = getStringFromAdObject(BrandSafetyEvent.a, "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public e.a g1() {
        return a(getIntFromAdObject("expandable_style", e.a.INVISIBLE.b()));
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        JSONObject deepCopy;
        JSONObject jSONObject;
        j5 j5Var = this.synchronizedFullResponse;
        if (j5Var != null) {
            jSONObject = j5Var.a();
        } else {
            synchronized (this.fullResponseLock) {
                deepCopy = JsonUtils.deepCopy(this.fullResponse);
            }
            jSONObject = deepCopy;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, m.S, new JSONArray());
        if (jSONArray.length() > 0) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, 0, new JSONObject());
            JsonUtils.putString(jSONObject2, CreativeInfo.al, this.q);
            JsonUtils.putString(jSONObject2, "video", this.r);
            JsonUtils.putString(jSONObject2, "stream_url", this.s);
        }
        return jSONObject;
    }

    public String h1() {
        return getStringFromAdObject(CreativeInfo.al, "");
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        return n0() != null;
    }

    public float i1() {
        return getFloatFromAdObject("mraid_close_delay_graphic", 0.0f);
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.g4
    public boolean isOpenMeasurementEnabled() {
        if (this.sdk.g0().e()) {
            return true;
        }
        return getBooleanFromAdObject("omsdk_enabled", Boolean.FALSE);
    }

    public String j1() {
        return this.s;
    }

    public String l1() {
        return getStringFromAdObject("video", "");
    }

    public boolean m1() {
        if (this.adObject.has("close_button_expandable_hidden")) {
            return getBooleanFromAdObject("close_button_expandable_hidden", Boolean.FALSE);
        }
        return true;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri n0() {
        String k1 = k1();
        if (StringUtils.isValidString(k1)) {
            return Uri.parse(k1);
        }
        String l1 = l1();
        if (StringUtils.isValidString(l1)) {
            return Uri.parse(l1);
        }
        return null;
    }

    public void n1() {
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            j5Var.c("stream_url");
            return;
        }
        synchronized (this.adObjectLock) {
            this.adObject.remove("stream_url");
        }
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean z0() {
        return getBooleanFromFullResponse("is_persisted_ad", false);
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.g4
    public i4 getAdEventTracker() {
        return this.t;
    }

    public static a a(JSONObject jSONObject, l lVar) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        if (jSONObject == null || (jSONObject2 = JsonUtils.getJSONObject(jSONObject, "full_response", (JSONObject) null)) == null || (jSONObject3 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject2, m.S, new JSONArray()), 0, (JSONObject) null)) == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject3, CreativeInfo.al, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String string2 = JsonUtils.getString(jSONObject3, "video", "");
        JsonUtils.putString(jSONObject3, CreativeInfo.al, JsonUtils.getString(jSONObject, "original_html_source", ""));
        JsonUtils.putString(jSONObject3, "video", JsonUtils.getString(jSONObject, "original_video_uri_string", ""));
        a aVar = new a(jSONObject3, jSONObject2, lVar);
        JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONObject, "cached_ad_html_resources_urls", new JSONObject());
        Iterator<String> keys = jSONObject4.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String string3 = JsonUtils.getString(jSONObject4, next, null);
            if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string3)) {
                aVar.a(next, string3);
            }
        }
        aVar.d(string);
        if (StringUtils.isValidString(string2)) {
            aVar.a(Uri.parse(string2));
        }
        return aVar;
    }

    @Override // com.applovin.impl.s4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "original_html_source", this.q);
        JsonUtils.putString(jSONObject, "original_video_uri_string", this.r);
        JsonUtils.putString(jSONObject, "original_video_stream_uri_string", this.s);
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : m().entrySet()) {
            JsonUtils.putString(jSONObject2, (String) entry.getKey(), (String) entry.getValue());
        }
        JsonUtils.putJSONObject(jSONObject, "cached_ad_html_resources_urls", jSONObject2);
        j5 j5Var = this.synchronizedFullResponse;
        if (j5Var != null) {
            JsonUtils.putJSONObject(jSONObject, "full_response", j5Var.a());
            return jSONObject;
        }
        synchronized (this.fullResponseLock) {
            JsonUtils.putJSONObject(jSONObject, "full_response", this.fullResponse);
        }
        return jSONObject;
    }
}
