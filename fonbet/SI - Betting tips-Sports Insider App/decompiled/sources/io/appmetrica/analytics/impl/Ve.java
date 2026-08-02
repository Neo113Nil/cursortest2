package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Ve extends AbstractC0630yd {

    /* renamed from: d, reason: collision with root package name */
    public static final Ye f13039d = new Ye("UUID_RESULT", null);

    /* renamed from: e, reason: collision with root package name */
    public static final Ye f13040e = new Ye("DEVICE_ID_RESULT", null);

    /* renamed from: f, reason: collision with root package name */
    public static final Ye f13041f = new Ye("DEVICE_ID_HASH_RESULT", null);

    /* renamed from: g, reason: collision with root package name */
    public static final Ye f13042g = new Ye("AD_URL_GET_RESULT", null);

    /* renamed from: h, reason: collision with root package name */
    public static final Ye f13043h = new Ye("AD_URL_REPORT_RESULT", null);

    /* renamed from: i, reason: collision with root package name */
    public static final Ye f13044i = new Ye("CUSTOM_HOSTS", null);
    public static final Ye j = new Ye("SERVER_TIME_OFFSET", null);

    /* renamed from: k, reason: collision with root package name */
    public static final Ye f13045k = new Ye("RESPONSE_CLIDS_RESULT", null);

    /* renamed from: l, reason: collision with root package name */
    public static final Ye f13046l = new Ye("CUSTOM_SDK_HOSTS", null);

    /* renamed from: m, reason: collision with root package name */
    public static final Ye f13047m = new Ye("CLIENT_CLIDS", null);

    /* renamed from: n, reason: collision with root package name */
    public static final Ye f13048n = new Ye("DEFERRED_DEEP_LINK_WAS_CHECKED", null);

    /* renamed from: o, reason: collision with root package name */
    public static final Ye f13049o = new Ye("API_LEVEL", null);

    /* renamed from: p, reason: collision with root package name */
    public static final Ye f13050p = new Ye("NEXT_STARTUP_TIME", null);
    public static final Ye q = new Ye("GAID", null);

    /* renamed from: r, reason: collision with root package name */
    public static final Ye f13051r = new Ye("HOAID", null);

    /* renamed from: s, reason: collision with root package name */
    public static final Ye f13052s = new Ye("YANDEX_ADV_ID", null);

    /* renamed from: t, reason: collision with root package name */
    public static final Ye f13053t = new Ye("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", null);

    /* renamed from: u, reason: collision with root package name */
    public static final Ye f13054u = new Ye("SCREEN_INFO", null);

    /* renamed from: v, reason: collision with root package name */
    public static final Ye f13055v = new Ye("SCREEN_SIZE_CHECKED_BY_DEPRECATED", null);

    /* renamed from: w, reason: collision with root package name */
    public static final Ye f13056w = new Ye("FEATURES", null);

    /* renamed from: x, reason: collision with root package name */
    public static final Ye f13057x = new Ye("APPMETRICA_CLIENT_CONFIG", null);

    public Ve(Ha ha2) {
        super(ha2);
    }

    public final boolean a(boolean z5) {
        return this.f13187a.getBoolean(f13053t.f13227b, z5);
    }

    public final long b(long j6) {
        return this.f13187a.getLong(j.f13226a, j6);
    }

    @NonNull
    public final Ve c(IdentifiersResult identifiersResult) {
        return a(f13046l.f13227b, identifiersResult);
    }

    @NonNull
    public final IdentifiersResult d() {
        return h(f13042g.f13227b);
    }

    @NonNull
    public final IdentifiersResult e() {
        return h(f13043h.f13227b);
    }

    @NonNull
    public final Ve f(IdentifiersResult identifiersResult) {
        return a(q.f13227b, identifiersResult);
    }

    @NonNull
    public final IdentifiersResult h() {
        return h(f13046l.f13227b);
    }

    @NonNull
    public final IdentifiersResult i() {
        return h(f13041f.f13227b);
    }

    @NonNull
    public final IdentifiersResult j() {
        return h(f13040e.f13227b);
    }

    @NonNull
    public final V9 k() {
        String string = this.f13187a.getString(f13056w.f13227b, null);
        try {
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                return new V9(JsonUtils.optBooleanOrNull(jSONObject, "libSslEnabled"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            }
        } catch (Throwable unused) {
        }
        return new V9(null, IdentifierStatus.UNKNOWN, null);
    }

    @NonNull
    public final IdentifiersResult l() {
        return h(q.f13227b);
    }

    @NonNull
    public final IdentifiersResult m() {
        return h(f13051r.f13227b);
    }

    @NonNull
    public final long n() {
        return this.f13187a.getLong(f13050p.f13227b, 0L);
    }

    @NonNull
    public final IdentifiersResult o() {
        return h(f13045k.f13227b);
    }

    public final ScreenInfo p() {
        return AbstractC0176gb.e(this.f13187a.getString(f13054u.f13227b, null));
    }

    @NonNull
    public final IdentifiersResult q() {
        return h(f13039d.f13227b);
    }

    @NonNull
    public final IdentifiersResult r() {
        return h(f13052s.f13227b);
    }

    public final boolean s() {
        return this.f13187a.getBoolean(f13048n.f13227b, false);
    }

    public final boolean t() {
        return this.f13187a.getBoolean(f13055v.f13227b, false);
    }

    public final Ve u() {
        return (Ve) b(f13048n.f13227b, true);
    }

    public final void v() {
        b(f13055v.f13227b, true);
    }

    public final List<String> g() {
        String string = this.f13187a.getString(f13044i.f13227b, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return AbstractC0176gb.b(string);
    }

    public final long a(long j6) {
        return this.f13187a.getLong(f13049o.f13227b, j6);
    }

    @NonNull
    public final Ve b(IdentifiersResult identifiersResult) {
        return a(f13043h.f13227b, identifiersResult);
    }

    public final Ve c(long j6) {
        return (Ve) b(f13049o.f13227b, j6);
    }

    @NonNull
    public final Ve d(IdentifiersResult identifiersResult) {
        return a(f13041f.f13227b, identifiersResult);
    }

    @NonNull
    public final Ve e(IdentifiersResult identifiersResult) {
        return a(f13040e.f13227b, identifiersResult);
    }

    public final AppMetricaConfig.Builder f() {
        String string = this.f13187a.getString(f13057x.f13227b, null);
        if (string == null) {
            return null;
        }
        return new G3().a(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IdentifiersResult h(String str) {
        IdentifiersResult identifiersResult;
        String string;
        try {
            string = this.f13187a.getString(str, null);
        } catch (Throwable unused) {
        }
        if (string != null) {
            JSONObject jSONObject = new JSONObject(string);
            identifiersResult = new IdentifiersResult(JsonUtils.optStringOrNull(jSONObject, "ID"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            return identifiersResult != null ? new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "no identifier in preferences") : identifiersResult;
        }
        identifiersResult = null;
        if (identifiersResult != null) {
        }
    }

    @NonNull
    public final Ve i(IdentifiersResult identifiersResult) {
        return a(f13039d.f13227b, identifiersResult);
    }

    @NonNull
    public final Ve j(IdentifiersResult identifiersResult) {
        return a(f13052s.f13227b, identifiersResult);
    }

    @NonNull
    public final Ve g(IdentifiersResult identifiersResult) {
        return a(f13051r.f13227b, identifiersResult);
    }

    @NonNull
    public final Ve a(IdentifiersResult identifiersResult) {
        return a(f13042g.f13227b, identifiersResult);
    }

    public final Ve b(boolean z5) {
        return (Ve) b(f13053t.f13227b, z5);
    }

    @NonNull
    public final Ve d(long j6) {
        return (Ve) b(f13050p.f13227b, j6);
    }

    public final Ve e(long j6) {
        return (Ve) b(j.f13227b, j6);
    }

    public final String i(String str) {
        return this.f13187a.getString(f13047m.f13227b, str);
    }

    public final Ve j(String str) {
        return (Ve) b(f13047m.f13227b, str);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0630yd
    @NonNull
    public final String f(@NonNull String str) {
        return new Ye(str, null).f13227b;
    }

    public final Ve a(List<String> list) {
        return (Ve) b(f13044i.f13227b, lo.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
    }

    @NonNull
    public final Ve h(IdentifiersResult identifiersResult) {
        return a(f13045k.f13227b, identifiersResult);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0630yd
    @NonNull
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final Ve g(@NonNull String str) {
        return (Ve) d(new Ye(str, null).f13227b);
    }

    @NonNull
    public final Ve a(@NonNull V9 v92) {
        String str = f13056w.f13227b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", v92.f13030a).put("STATUS", v92.f13031b.getValue()).putOpt("ERROR_EXPLANATION", v92.f13032c);
        } catch (Throwable unused) {
        }
        return (Ve) b(str, jSONObject.toString());
    }

    public final void a(ScreenInfo screenInfo) {
        b(f13054u.f13227b, AbstractC0176gb.a(screenInfo));
    }

    public final void a(@NonNull AppMetricaConfig appMetricaConfig) {
        b(f13057x.f13227b, appMetricaConfig.toJson());
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Ve a(String str, IdentifiersResult identifiersResult) {
        String jSONObject;
        if (identifiersResult != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("ID", identifiersResult.f15009id).put("STATUS", identifiersResult.status.getValue()).put("ERROR_EXPLANATION", identifiersResult.errorExplanation);
                } catch (Throwable unused) {
                }
                jSONObject = jSONObject2.toString();
            } catch (Throwable unused2) {
            }
            if (jSONObject != null) {
                b(str, jSONObject);
            }
            return this;
        }
        jSONObject = null;
        if (jSONObject != null) {
        }
        return this;
    }
}
