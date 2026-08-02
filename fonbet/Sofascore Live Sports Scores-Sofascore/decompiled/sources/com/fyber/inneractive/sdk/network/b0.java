package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Calendar;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b0 {
    public SharedPreferences a = null;

    public static void a(Context context, String str, String str2, com.fyber.inneractive.sdk.flow.x xVar) {
        int i;
        if (context == null || str == null || xVar.b == null) {
            IAlog.a("Invalid report request parameters!", new Object[0]);
            return;
        }
        b0 b0Var = a0.a;
        if (b0Var.a == null) {
            b0Var.a = context.getSharedPreferences("AutoWebActionPrefs", 0);
        }
        IAlog.e("IAautoWebActionReporter: reporting action: %s", str);
        IAlog.e("IAautoWebActionReporter: url: %s", str2);
        IAConfigManager iAConfigManager = IAConfigManager.N;
        if (!iAConfigManager.i.c) {
            IAlog.a("IAautoWebActionReporter: Report of Non user web actions disabled!", new Object[0]);
            return;
        }
        t tVar = t.MRAID_AUTO_ACTION_DETECTED;
        InneractiveAdRequest inneractiveAdRequest = xVar.a;
        com.fyber.inneractive.sdk.response.e eVar = xVar.b;
        JSONArray b = xVar.c.b();
        w wVar = new w(eVar);
        wVar.b = tVar;
        wVar.a = inneractiveAdRequest;
        wVar.d = b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "action", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject.put("url", str2);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "url", str2);
            }
        }
        long j = b0Var.a.getLong("lastReportTS", 0L);
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        Calendar calendar = Calendar.getInstance(timeZone);
        Calendar calendar2 = Calendar.getInstance(timeZone);
        calendar2.setTimeInMillis(j);
        if (j <= 0 || calendar.get(6) != calendar2.get(6)) {
            i = 0;
        } else {
            IAlog.e("IAautoWebActionReporter: encountered same date", new Object[0]);
            i = b0Var.a.getInt("numReportsToday", 0);
        }
        int i2 = iAConfigManager.i.d;
        int i3 = i + 1;
        IAlog.e("IAautoWebActionReporter: day counter: %d max: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        if (i < i2) {
            IAlog.e("IAautoWebActionReporter: adding ad data", new Object[0]);
            wVar.g = true;
        } else {
            IAlog.e("IAautoWebActionReporter: not adding ad data", new Object[0]);
        }
        Integer valueOf = Integer.valueOf(i3);
        try {
            jSONObject.put("daily_count", valueOf);
        } catch (Exception unused3) {
            IAlog.f("Got exception adding param to json object: %s, %s", "daily_count", valueOf);
        }
        wVar.f.put(jSONObject);
        wVar.a((String) null);
        SharedPreferences.Editor edit = b0Var.a.edit();
        edit.putLong("lastReportTS", calendar.getTimeInMillis());
        edit.putInt("numReportsToday", i3);
        edit.apply();
    }
}
