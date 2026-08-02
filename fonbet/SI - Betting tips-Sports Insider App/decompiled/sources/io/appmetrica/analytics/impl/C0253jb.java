package io.appmetrica.analytics.impl;

import android.util.Base64;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.jb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0253jb {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f14021a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14022b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14023c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f14024d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14025e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f14026f;

    /* renamed from: g, reason: collision with root package name */
    public final String f14027g;

    /* renamed from: h, reason: collision with root package name */
    public final String f14028h;

    /* renamed from: i, reason: collision with root package name */
    public final CounterConfigurationReporterType f14029i;
    public final String j;

    public C0253jb(@NonNull String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("event");
        this.f14021a = Base64.decode(jSONObject2.getString("jvm_crash"), 0);
        this.f14022b = jSONObject2.getString("name");
        this.f14023c = jSONObject2.getInt("bytes_truncated");
        this.j = JsonUtils.optStringOrNull(jSONObject2, "environment");
        String optString = jSONObject2.optString("trimmed_fields");
        this.f14024d = new HashMap();
        if (optString != null) {
            try {
                HashMap c2 = AbstractC0176gb.c(optString);
                if (c2 != null) {
                    for (Map.Entry entry : c2.entrySet()) {
                        this.f14024d.put(L3.valueOf((String) entry.getKey()), Integer.valueOf(Integer.parseInt((String) entry.getValue())));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("process_configuration");
        this.f14025e = jSONObject3.getString("package_name");
        this.f14026f = Integer.valueOf(jSONObject3.getInt("pid"));
        this.f14027g = jSONObject3.getString("psid");
        JSONObject jSONObject4 = jSONObject.getJSONObject("reporter_configuration");
        this.f14028h = jSONObject4.getString("api_key");
        this.f14029i = a(jSONObject4);
    }

    public final String a() {
        return this.f14028h;
    }

    public final int b() {
        return this.f14023c;
    }

    public final byte[] c() {
        return this.f14021a;
    }

    public final String d() {
        return this.j;
    }

    public final String e() {
        return this.f14022b;
    }

    public final String f() {
        return this.f14025e;
    }

    public final Integer g() {
        return this.f14026f;
    }

    public final String h() {
        return this.f14027g;
    }

    @NonNull
    public final CounterConfigurationReporterType i() {
        return this.f14029i;
    }

    @NonNull
    public final HashMap<L3, Integer> j() {
        return this.f14024d;
    }

    public final String k() throws JSONException {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f14024d.entrySet()) {
            hashMap.put(((L3) entry.getKey()).name(), (Integer) entry.getValue());
        }
        return new JSONObject().put("process_configuration", new JSONObject().put("pid", this.f14026f).put("psid", this.f14027g).put("package_name", this.f14025e)).put("reporter_configuration", new JSONObject().put("api_key", this.f14028h).put("reporter_type", this.f14029i.getStringValue())).put("event", new JSONObject().put("jvm_crash", Base64.encodeToString(this.f14021a, 0)).put("name", this.f14022b).put("bytes_truncated", this.f14023c).put("trimmed_fields", AbstractC0176gb.b(hashMap)).putOpt("environment", this.j)).toString();
    }

    public static CounterConfigurationReporterType a(JSONObject jSONObject) {
        return jSONObject.has("reporter_type") ? CounterConfigurationReporterType.fromStringValue(jSONObject.getString("reporter_type")) : CounterConfigurationReporterType.MAIN;
    }

    public C0253jb(@NonNull P5 p52, @NonNull H3 h32, HashMap<L3, Integer> hashMap) {
        this.f14021a = p52.getValueBytes();
        this.f14022b = p52.getName();
        this.f14023c = p52.getBytesTruncated();
        if (hashMap != null) {
            this.f14024d = hashMap;
        } else {
            this.f14024d = new HashMap();
        }
        Bf a7 = h32.a();
        this.f14025e = a7.e();
        this.f14026f = a7.f();
        this.f14027g = a7.g();
        CounterConfiguration b10 = h32.b();
        this.f14028h = b10.getApiKey();
        this.f14029i = b10.getReporterType();
        this.j = p52.f();
    }
}
