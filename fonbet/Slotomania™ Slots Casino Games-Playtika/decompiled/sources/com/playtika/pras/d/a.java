package com.playtika.pras.d;

import android.os.Build;
import com.playtika.pras.sdk.network.models.DeviceInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.events.base.StatsEvent;
import io.sentry.ProfilingTraceData;
import java.util.Iterator;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class a {
    public static a k;
    public final String a = UUID.randomUUID().toString();
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public boolean h;
    public DeviceInfo i;
    public final g j;

    public a(DeviceInfo deviceInfo, boolean z, String str, int i, String str2, String str3, String str4, String str5) {
        this.h = z;
        this.b = str;
        this.g = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.i = deviceInfo;
        this.f = str5;
        String concat = (com.safedk.android.analytics.brandsafety.creatives.discoveries.d.u + str.toLowerCase() + "-api-epayments.playtika.com").concat("/event-stream/events");
        g gVar = new g(concat);
        this.j = gVar;
        gVar.a.a = concat;
    }

    public final void a(String str, String str2, b bVar, JSONObject jSONObject) {
        JSONObject a = a(str, str2, bVar.a);
        if (a != null) {
            if (jSONObject != null) {
                try {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        a.put(next, jSONObject.get(next));
                    }
                } catch (JSONException e) {
                    com.playtika.pras.c.d.a("Error adding additional fields to ES event: ", e);
                }
            }
            a(a, false);
        }
    }

    public final void a(String str, String str2, String str3, b bVar, JSONObject jSONObject) {
        JSONObject a = a(str, str2, bVar.a);
        if (a != null) {
            try {
                a.put("error_message", str3);
                if (jSONObject != null) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        a.put(next, jSONObject.get(next));
                    }
                }
            } catch (JSONException e) {
                com.playtika.pras.c.d.a("Error adding fields to ES error event: ", e);
            }
            a(a, false);
        }
    }

    public final void a(String str, String str2, String str3, b bVar, boolean z) {
        JSONObject a = a(str, str2, bVar.a);
        if (a != null) {
            try {
                a.put("error_message", str3);
            } catch (JSONException unused) {
            }
            a(a, z);
        }
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            aVar = k;
        }
        return aVar;
    }

    public final JSONObject a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("runtime_guid", this.a);
            jSONObject.put("app_session_id", this.e);
            jSONObject.put(BrandSafetyEvent.g, this.c);
            jSONObject.put(ProfilingTraceData.JsonKeys.DEVICE_OS_VERSION, "Android " + Build.VERSION.RELEASE);
            jSONObject.put("environment", this.b);
            jSONObject.put("event_timestamp", String.valueOf(System.currentTimeMillis()));
            jSONObject.put("app_target", this.h ? "QA" : "PROD");
            jSONObject.put("device_os_api", String.valueOf(Build.VERSION.SDK_INT));
            jSONObject.put(ProfilingTraceData.JsonKeys.DEVICE_MODEL, Build.MODEL);
            jSONObject.put("app_user_id", this.d);
            jSONObject.put("event_group", "PRAS");
            jSONObject.put("sdk_version", String.valueOf(this.g));
            jSONObject.put("platform", this.f);
            DeviceInfo deviceInfo = this.i;
            if (deviceInfo != null) {
                jSONObject.put(ProfilingTraceData.JsonKeys.DEVICE_MANUFACTURER, deviceInfo.getVendor());
                jSONObject.put("device_id", this.i.getSdkAndroidId());
                if (this.i.getScreenSizeInches() != null) {
                    jSONObject.put("device_screen_size", this.i.getScreenSizeInches());
                }
                if (this.i.getUiMode() != null) {
                    jSONObject.put("device_ui_mode", this.i.getUiMode());
                }
                if (this.i.getDeviceMemory() != null) {
                    jSONObject.put("device_memory", this.i.getDeviceMemory());
                }
                if (this.i.getRefreshRate() != null) {
                    jSONObject.put("device_refresh_rate", this.i.getRefreshRate());
                }
                if (this.i.getBatteryStatus() != null) {
                    jSONObject.put("device_battery_status", this.i.getBatteryStatus());
                }
                if (this.i.getAccessibilityEnabled() != null) {
                    jSONObject.put("device_accessibility_enabled", this.i.getAccessibilityEnabled());
                }
            }
        } catch (JSONException e) {
            com.playtika.pras.c.d.a("Error generating ES params: ", e);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            jSONObject.put("context", str2);
            jSONObject.put("event_sub_group", str3);
            jSONObject.put(StatsEvent.z, str);
            jSONObject.put("msg_short", str2 + "/" + str);
        } catch (JSONException e2) {
            com.playtika.pras.c.d.a("Error generating ES params: ", e2);
        }
        return jSONObject;
    }

    public final void a(JSONObject jSONObject, boolean z) {
        g gVar = this.j;
        synchronized (gVar) {
            gVar.b.put(jSONObject);
            if (!z && gVar.b.length() < gVar.l) {
                if (gVar.f) {
                    return;
                }
                gVar.f = true;
                gVar.d.postDelayed(gVar.e, gVar.m);
                return;
            }
            gVar.f = false;
            gVar.d.removeCallbacksAndMessages(null);
            c a = gVar.a();
            if (a != null) {
                gVar.b = new JSONArray();
                i iVar = gVar.a;
                iVar.b.execute(new h(iVar, a, gVar.c));
            }
        }
    }
}
