package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class wo {

    /* renamed from: a, reason: collision with root package name */
    public final yo f14882a;

    public wo(Ze ze2, C0046ba c0046ba) {
        this.f14882a = new yo(ze2, c0046ba, new ap(8));
    }

    public static final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("device_id", JsonUtils.optStringOrNullable(jSONObject2, "device_id", JsonUtils.optStringOrNull(jSONObject, "device_id")));
        jSONObject3.put("device_id_hash", JsonUtils.optStringOrNullable(jSONObject2, "device_id_hash", JsonUtils.optStringOrNull(jSONObject, "device_id_hash")));
        jSONObject3.put("referrer", JsonUtils.optStringOrNullable(jSONObject2, "referrer", JsonUtils.optStringOrNull(jSONObject, "referrer")));
        jSONObject3.put("referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_checked", Boolean.FALSE)));
        jSONObject3.put("last_migration_api_level", AbstractC0176gb.a(jSONObject2, "last_migration_api_level", AbstractC0176gb.a(jSONObject, "last_migration_api_level", -1)));
        return jSONObject3;
    }

    public final synchronized void b(String str) {
        yo yoVar = this.f14882a;
        yoVar.a(yoVar.a().put("device_id_hash", str));
    }

    public final synchronized boolean c() {
        return this.f14882a.a().optBoolean("referrer_checked", false);
    }

    public final synchronized void d() {
        yo yoVar = this.f14882a;
        yoVar.a(yoVar.a().put("referrer_checked", true));
    }

    public final synchronized C0359ng b() {
        byte[] decode;
        C0359ng c0359ng;
        String optStringOrNull = JsonUtils.optStringOrNull(this.f14882a.a(), "referrer");
        if (optStringOrNull != null) {
            try {
                decode = Base64.decode(optStringOrNull.getBytes(Charsets.UTF_8), 0);
            } catch (Throwable unused) {
            }
            c0359ng = (decode == null || decode.length == 0) ? null : new C0359ng(decode);
        }
        return c0359ng;
    }

    public final synchronized void a(String str) {
        yo yoVar = this.f14882a;
        yoVar.a(yoVar.a().put("device_id", str));
    }

    public final synchronized String a() {
        return JsonUtils.optStringOrNull(this.f14882a.a(), "device_id_hash");
    }

    public final synchronized void a(C0359ng c0359ng) {
        try {
            yo yoVar = this.f14882a;
            yoVar.a(yoVar.a().put("referrer", c0359ng != null ? new String(Base64.encode(c0359ng.a(), 0), Charsets.UTF_8) : null));
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
