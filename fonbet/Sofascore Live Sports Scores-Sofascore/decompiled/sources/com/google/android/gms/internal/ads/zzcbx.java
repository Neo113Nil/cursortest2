package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcbx {
    public final List a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final int g;
    public final JSONObject h;
    public final String i;
    public final long j;
    public final long k;
    public final boolean l;
    public final String m;

    /* JADX WARN: Removed duplicated region for block: B:18:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzcbx(JSONObject jSONObject) {
        Long valueOf;
        String optString;
        Long l = -1L;
        this.f = jSONObject.optString("url");
        this.b = jSONObject.optString("base_uri");
        this.c = jSONObject.optString("post_parameters");
        this.d = a(jSONObject.optString("drt_include"));
        this.m = jSONObject.optString("content_type");
        this.l = a(jSONObject.optString("use_compression"));
        this.e = a(jSONObject.optString("cookies_include", "true"));
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        String optString2 = jSONObject.optString("errors");
        this.a = optString2 == null ? null : Arrays.asList(optString2.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR));
        this.g = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.h = optJSONObject == null ? new JSONObject() : optJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.i = jSONObject.optString("pool_key");
        String optString3 = jSONObject.optString("start_time");
        if (!TextUtils.isEmpty(optString3)) {
            try {
                valueOf = Long.valueOf(optString3);
            } catch (NumberFormatException unused) {
            }
            this.j = valueOf.longValue();
            optString = jSONObject.optString("end_time");
            if (!TextUtils.isEmpty(optString)) {
                try {
                    l = Long.valueOf(optString);
                } catch (NumberFormatException unused2) {
                }
            }
            this.k = l.longValue();
        }
        valueOf = l;
        this.j = valueOf.longValue();
        optString = jSONObject.optString("end_time");
        if (!TextUtils.isEmpty(optString)) {
        }
        this.k = l.longValue();
    }

    public static boolean a(String str) {
        if (str != null) {
            return str.equals("1") || str.equals("true");
        }
        return false;
    }
}
