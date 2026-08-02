package com.safedk.android.analytics.events;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.brandsafety.q;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import com.safedk.android.utils.n;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class RedirectEvent extends StatsEvent {
    public static final int a = 120000;
    public static final String b = "redirect";
    public static final String c = "redirect_url";
    public static final String d = "redirect_type";
    public static final String e = "foreground_activity";
    public static final String f = "max_events";
    public static final String g = "touch_ts";
    public static final String h = "external";
    public static final String i = "internal";
    public static final String j = "customtab";
    public static final String k = "suspected_store_kit";
    private static final String l = "RedirectEvent";
    private static final long serialVersionUID = 0;
    private String m;
    private String n;
    private String o;
    private String p;
    private MaxEvents q;
    private long r;

    public RedirectEvent() {
        this.q = null;
    }

    public RedirectEvent(String sdk, String redirectUrl, String redirectType, String foregroundActivity, long timestamp, long touchTs) {
        super(sdk, StatsCollector.EventType.redirect);
        this.q = null;
        Logger.d(l, "RedirectEvent ctor started, sdk=", sdk, ", redirectUrl=", redirectUrl, ", redirectType=", redirectType, ", foregroundActivity=", foregroundActivity, " ,timestamp=", Long.valueOf(timestamp), ", touchTs=", Long.valueOf(touchTs));
        Logger.d(l, "RedirectEvent ctor SdksMapping.getSdkNameByPackage()=", SdksMapping.getSdkNameByPackage(sdk));
        Logger.d(l, "RedirectEvent ctor SdksMapping.getSdkPackageByClass()=", SdksMapping.getSdkPackageByClass(sdk));
        String sdkUUIDByPackage = SdksMapping.getSdkUUIDByPackage(sdk);
        if (sdkUUIDByPackage == null || SdksMapping.getAllSdkVersionsMap() == null || SdksMapping.getAllSdkVersionsMap().get(sdkUUIDByPackage) == null) {
            Logger.d(l, "RedirectEvent ctor cannot find version for sdk ", sdk, " , SdkVersionsMap=", SdksMapping.getAllSdkVersionsMap());
        } else {
            String str = SdksMapping.getAllSdkVersionsMap().get(sdkUUIDByPackage);
            this.m = str;
            Logger.d(l, "RedirectEvent ctor sdkVersion=", str);
        }
        this.n = redirectUrl;
        this.o = redirectType;
        this.p = foregroundActivity;
        this.r = n.b(touchTs);
        this.I = false;
    }

    public void a(MaxEvents maxEvents) {
        synchronized (q.a()) {
            MaxEvents maxEvents2 = (MaxEvents) maxEvents.clone();
            this.q = maxEvents2;
            Logger.d(l, "setMaxEvents , added ", Integer.valueOf(maxEvents2.size()), " items. content : ", this.q);
        }
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public StatsCollector.EventType a() {
        return StatsCollector.EventType.redirect;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public String b() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(StatsCollector.EventType.redirect);
        String str = "_";
        sb2.append("_");
        sb.append(sb2.toString());
        if (this.n != null) {
            str = this.n + "_";
        }
        sb.append(str);
        sb.append(this.G);
        Logger.d(l, "Getting key from object : ", sb.toString());
        return sb.toString();
    }

    public static String b(Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append(StatsCollector.EventType.redirect + "_");
        if (bundle.getString("redirect_url") == null) {
            sb.append("_");
        } else {
            sb.append(bundle.getString("redirect_url") + "_");
        }
        sb.append(bundle.getLong("timestamp"));
        Logger.d(l, "Getting key from bundle : ", sb.toString());
        return sb.toString();
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public void a(StatsEvent statsEvent) {
        RedirectEvent redirectEvent = (RedirectEvent) statsEvent;
        if (redirectEvent.I) {
            this.I = true;
        }
        if (redirectEvent.f() != null && f() == null) {
            a(redirectEvent.f());
        }
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public Bundle d() {
        Bundle d2 = super.d();
        d2.putString("sdk_version", this.m);
        d2.putString("redirect_url", this.n);
        d2.putString("redirect_type", this.o);
        d2.putString("foreground_activity", this.p);
        d2.putLong(g, this.r);
        MaxEvents maxEvents = this.q;
        if (maxEvents != null && maxEvents.size() > 0) {
            synchronized (q.a()) {
                d2.putParcelableArrayList(f, this.q.a());
            }
        }
        Logger.d(l, "Redirect Event toBundle : ", d2.toString());
        return d2;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public boolean a_() {
        return System.currentTimeMillis() - this.G > UnityAdsConstants.Timeout.INIT_TIMEOUT_MS || this.n != null || this.I;
    }

    public String f() {
        return this.n;
    }

    public void a(String str) {
        this.n = str;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent, com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("touchTs", this.r);
        if (!TextUtils.isEmpty(this.m)) {
            jSONObject.put("sdkVersion", this.m);
        }
        if (!TextUtils.isEmpty(this.n)) {
            jSONObject.put("redirectUrl", this.n);
        }
        if (!TextUtils.isEmpty(this.o)) {
            jSONObject.put("redirectType", this.o);
        }
        if (!TextUtils.isEmpty(this.p)) {
            jSONObject.put("foregroundActivity", this.p);
        }
        MaxEvents maxEvents = this.q;
        if (maxEvents != null) {
            jSONObject.put("maxEvents", maxEvents.i());
        }
        return jSONObject;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent, com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            this.r = jSONObject.optLong("touchTs", 0L);
            this.m = jSONObject.optString("sdkVersion", "");
            this.n = jSONObject.optString("redirectUrl", "");
            this.o = jSONObject.optString("redirectType", "");
            this.p = jSONObject.optString("foregroundActivity", "");
            JSONObject optJSONObject = jSONObject.optJSONObject("maxEvents");
            if (optJSONObject != null) {
                MaxEvents maxEvents = new MaxEvents();
                this.q = maxEvents;
                maxEvents.a(optJSONObject);
            }
        }
    }
}
