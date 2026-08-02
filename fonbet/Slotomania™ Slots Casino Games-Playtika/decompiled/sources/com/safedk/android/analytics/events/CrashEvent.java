package com.safedk.android.analytics.events;

import android.os.Build;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.analytics.events.base.StatsEventWithBundle;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.n;
import java.io.IOException;
import java.io.Serializable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class CrashEvent extends StatsEventWithBundle implements Serializable {
    protected static final String a = "is_caught";
    protected static final String b = "is_emulator";
    protected static final String c = "is_debug";
    protected static final String d = "generic";
    public static final String e = "report";
    public static final String f = "events";
    public static final String g = "sdk_versions_map";
    public static final String h = "sdk_key";
    private static final String j = "CrashEvent";
    private static final long serialVersionUID = 0;

    public CrashEvent(JSONObject report) {
        super(null, StatsCollector.EventType.crash, report);
    }

    public CrashEvent(String sdk, StatsCollector.EventType eventType, JSONObject report) {
        super(sdk, eventType, report);
    }

    @Override // com.safedk.android.analytics.events.base.StatsEventWithBundle
    public JSONObject f() throws JSONException, IOException {
        String str;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put(e, jSONObject2);
        JSONArray jSONArray = new JSONArray();
        jSONObject2.put("events", jSONArray);
        JSONObject f2 = super.f();
        f2.put(StatsEvent.z, a().toString());
        f2.put("timestamp", this.G);
        f2.put(a, c());
        f2.put(b, Build.FINGERPRINT.contains(d));
        f2.put(c, SafeDK.getInstance().o());
        JSONObject R = SafeDK.getInstance().R();
        if (R != null) {
            str = R.toString();
            Logger.d(j, "sdkVersionsJSON=", R.toString());
        } else {
            Logger.d(j, "sdkVersionsJSON is null");
            str = JsonUtils.EMPTY_JSON;
        }
        f2.put(g, str);
        jSONArray.put(f2);
        jSONObject2.put(TtmlNode.TAG_METADATA, n.a(SafeDK.getInstance().x().c()));
        jSONObject.put("sdk_key", SafeDK.getInstance().x().a());
        return jSONObject;
    }

    protected boolean c() {
        return false;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public StatsCollector.EventType a() {
        return StatsCollector.EventType.crash;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public String b() {
        return "";
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public void a(StatsEvent statsEvent) {
    }
}
