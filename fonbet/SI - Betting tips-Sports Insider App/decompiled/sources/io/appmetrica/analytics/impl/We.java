package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class We extends AbstractC0630yd implements Bo {

    /* renamed from: d, reason: collision with root package name */
    public static final long f13093d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f13094e = -1;

    /* renamed from: f, reason: collision with root package name */
    public static final String f13095f = "";

    /* renamed from: g, reason: collision with root package name */
    public static final String f13096g = "";

    /* renamed from: r, reason: collision with root package name */
    public static final String f13105r = "SESSION_";

    /* renamed from: h, reason: collision with root package name */
    public static final Ye f13097h = new Ye("PERMISSIONS_CHECK_TIME", null);

    /* renamed from: i, reason: collision with root package name */
    public static final Ye f13098i = new Ye("PROFILE_ID", null);
    public static final Ye j = new Ye("APP_ENVIRONMENT", null);

    /* renamed from: k, reason: collision with root package name */
    public static final Ye f13099k = new Ye("APP_ENVIRONMENT_REVISION", null);

    /* renamed from: l, reason: collision with root package name */
    public static final Ye f13100l = new Ye("LAST_APP_VERSION_WITH_FEATURES", null);

    /* renamed from: m, reason: collision with root package name */
    public static final Ye f13101m = new Ye("APPLICATION_FEATURES", null);

    /* renamed from: n, reason: collision with root package name */
    public static final Ye f13102n = new Ye("CERTIFICATES_SHA1_FINGERPRINTS", null);

    /* renamed from: o, reason: collision with root package name */
    public static final Ye f13103o = new Ye("VITAL_DATA", null);

    /* renamed from: p, reason: collision with root package name */
    public static final Ye f13104p = new Ye("SENT_EXTERNAL_ATTRIBUTIONS", null);
    public static final Ye q = new Ye("AUTO_COLLECTED_DATA_SUBSCRIBERS", null);

    /* renamed from: s, reason: collision with root package name */
    public static final Ye f13106s = new Ye("MAIN_REPORTER_EVENTS_TRIGGER_CONDITION_MET", null);

    public We(Ha ha2) {
        super(ha2);
    }

    public final We a(C0217i0 c0217i0) {
        synchronized (this) {
            b(j.f13227b, c0217i0.f13914a);
            b(f13099k.f13227b, c0217i0.f13915b);
        }
        return this;
    }

    public final void b(boolean z5) {
        b(f13106s.f13227b, z5);
    }

    @Override // io.appmetrica.analytics.impl.Xe
    @NonNull
    public final Set<String> c() {
        return this.f13187a.a();
    }

    public final C0217i0 d() {
        C0217i0 c0217i0;
        synchronized (this) {
            c0217i0 = new C0217i0(this.f13187a.getString(j.f13227b, "{}"), this.f13187a.getLong(f13099k.f13227b, 0L));
        }
        return c0217i0;
    }

    public final String e() {
        return this.f13187a.getString(f13101m.f13227b, "");
    }

    public final Map<String, Long> f() {
        HashMap hashMap = new HashMap();
        try {
            String string = this.f13187a.getString(q.f13227b, null);
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, Long.valueOf(jSONObject.getLong(next)));
                }
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    @NonNull
    public final List<String> g() {
        String str = f13102n.f13227b;
        List list = Collections.EMPTY_LIST;
        String[] strArr = list == null ? null : (String[]) list.toArray(new String[list.size()]);
        String string = this.f13187a.getString(str, null);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                strArr = new String[jSONArray.length()];
                for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                    strArr[i5] = jSONArray.optString(i5);
                }
            } catch (Throwable unused) {
            }
        }
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    public final int h() {
        return this.f13187a.getInt(f13100l.f13227b, -1);
    }

    public final long i() {
        return this.f13187a.getLong(f13097h.f13227b, 0L);
    }

    public final String j() {
        return this.f13187a.getString(f13098i.f13227b, null);
    }

    @NonNull
    public final Map<Integer, String> k() {
        HashMap hashMap = new HashMap();
        try {
            String string = this.f13187a.getString(f13104p.f13227b, null);
            if (string != null) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(Integer.valueOf(Integer.parseInt(next)), jSONObject.getString(next));
                }
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    public final void b(@NonNull Map<Integer, String> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey().toString(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        b(f13104p.f13227b, jSONObject.toString());
    }

    public final String h(String str) {
        return this.f13187a.getString(new Ye(f13105r, str).f13227b, "");
    }

    public final We i(String str) {
        return (We) b(f13101m.f13227b, str);
    }

    public final We j(String str) {
        return (We) b(f13098i.f13227b, str);
    }

    public final We e(String str, String str2) {
        return (We) b(new Ye(f13105r, str).f13227b, str2);
    }

    public final We a(long j6) {
        return (We) b(f13097h.f13227b, j6);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0630yd
    @NonNull
    public final String f(@NonNull String str) {
        return new Ye(str, null).f13227b;
    }

    public final We a(int i5) {
        return (We) b(f13100l.f13227b, i5);
    }

    public final We a(List<String> list) {
        return (We) a(f13102n.f13227b, list);
    }

    public final boolean a(boolean z5) {
        return this.f13187a.getBoolean(f13106s.f13227b, z5);
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public final String a() {
        return this.f13187a.getString(f13103o.f13227b, null);
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public final void a(@NonNull String str) {
        b(f13103o.f13227b, str);
    }

    public final void a(@NonNull Map<String, Long> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        b(q.f13227b, jSONObject.toString());
    }
}
