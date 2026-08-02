package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import com.appsflyer.AdRevenueScheme;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Yl {

    /* renamed from: a, reason: collision with root package name */
    public final C0602xa f13239a;

    /* renamed from: b, reason: collision with root package name */
    public final W9 f13240b;

    /* renamed from: c, reason: collision with root package name */
    public final Fi f13241c;

    /* renamed from: d, reason: collision with root package name */
    public final C0656ze f13242d;

    /* renamed from: e, reason: collision with root package name */
    public final Hm f13243e;

    /* renamed from: f, reason: collision with root package name */
    public final C0168g3 f13244f;

    /* renamed from: g, reason: collision with root package name */
    public final C0370o2 f13245g;

    /* renamed from: h, reason: collision with root package name */
    public final C0202hb f13246h;

    /* renamed from: i, reason: collision with root package name */
    public final Em f13247i;
    public final C0455rd j;

    /* renamed from: k, reason: collision with root package name */
    public final D9 f13248k;

    public Yl() {
        this(new C0202hb(), new C0602xa(), new W9(), new Fi(), new C0656ze(), new Hm(), new C0168g3(), new C0370o2(), new Em(), new C0455rd(), new D9());
    }

    public final void a(C0110dm c0110dm, C0150fb c0150fb) {
        long j;
        long j6;
        String str;
        ArrayList a7;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4 = c0150fb.optJSONObject("queries");
        if (optJSONObject4 != null && (optJSONObject2 = optJSONObject4.optJSONObject("list")) != null && (optJSONObject3 = optJSONObject2.optJSONObject("host")) != null) {
            c0110dm.f13605g = optJSONObject3.optString("url", null);
        }
        Object jSONObject = new JSONObject();
        try {
            jSONObject = c0150fb.get("distribution_customization");
        } catch (Throwable unused) {
        }
        JSONObject optJSONObject5 = ((JSONObject) jSONObject).optJSONObject("clids");
        if (optJSONObject5 != null) {
            HashMap hashMap = new HashMap();
            Iterator<String> keys = optJSONObject5.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject6 = optJSONObject5.optJSONObject(next);
                if (optJSONObject6 != null && optJSONObject6.has("value")) {
                    hashMap.put(next, optJSONObject6.getString("value"));
                }
            }
            c0110dm.j = Fm.a((Map) hashMap);
        }
        JSONObject optJSONObject7 = c0150fb.optJSONObject(CommonUrlParts.LOCALE);
        String str2 = "";
        c0110dm.f13610m = (optJSONObject7 == null || (optJSONObject = optJSONObject7.optJSONObject(AdRevenueScheme.COUNTRY)) == null || !optJSONObject.optBoolean("reliable", false)) ? "" : optJSONObject.optString("value", "");
        JSONObject optJSONObject8 = c0150fb.optJSONObject("time");
        if (optJSONObject8 != null) {
            try {
                c0110dm.f13609l = Long.valueOf(optJSONObject8.getLong("max_valid_difference_seconds"));
            } catch (Throwable unused2) {
            }
        }
        C0564vm c0564vm = new C0564vm();
        JSONObject optJSONObject9 = c0150fb.optJSONObject("stat_sending");
        if (optJSONObject9 != null) {
            c0564vm.f14805a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject9, "disabled_reporting_interval_seconds", c0564vm.f14805a);
        }
        this.f13243e.getClass();
        c0110dm.f13613p = new Gm(c0564vm.f14805a);
        this.f13240b.getClass();
        C0464rm c0464rm = new C0464rm();
        try {
            Object jSONObject2 = new JSONObject();
            try {
                jSONObject2 = c0150fb.get("features");
            } catch (Throwable unused3) {
            }
            JSONObject optJSONObject10 = ((JSONObject) jSONObject2).optJSONObject("list");
            if (optJSONObject10 != null) {
                C0246j4 c0246j4 = new C0246j4();
                c0246j4.f13999a = W9.a(optJSONObject10, "permissions_collecting", c0464rm.f14582a);
                c0246j4.f14000b = W9.a(optJSONObject10, "features_collecting", c0464rm.f14583b);
                c0246j4.f14001c = W9.a(optJSONObject10, "google_aid", c0464rm.f14584c);
                c0246j4.f14002d = W9.a(optJSONObject10, "sim_info", c0464rm.f14585d);
                c0246j4.f14003e = W9.a(optJSONObject10, "huawei_oaid", c0464rm.f14586e);
                c0246j4.f14004f = optJSONObject10.has("ssl_pinning") ? Boolean.valueOf(optJSONObject10.getJSONObject("ssl_pinning").getBoolean("enabled")) : null;
                c0110dm.f13600b = new C0297l4(c0246j4);
            }
        } catch (Throwable unused4) {
        }
        this.f13239a.getClass();
        try {
            Object jSONObject3 = new JSONObject();
            try {
                jSONObject3 = c0150fb.get("query_hosts");
            } catch (Throwable unused5) {
            }
            JSONObject optJSONObject11 = ((JSONObject) jSONObject3).optJSONObject("list");
            if (optJSONObject11 != null) {
                try {
                    str = optJSONObject11.getJSONObject("get_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused6) {
                    str = "";
                }
                if (!TextUtils.isEmpty(str)) {
                    c0110dm.f13602d = str;
                }
                ArrayList a10 = C0602xa.a(optJSONObject11, "report");
                if (!lo.a((Collection) a10)) {
                    c0110dm.f13603e = a10;
                }
                try {
                    str2 = optJSONObject11.getJSONObject("report_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused7) {
                }
                if (!TextUtils.isEmpty(str2)) {
                    c0110dm.f13604f = str2;
                }
                ArrayList a11 = C0602xa.a(optJSONObject11, "startup");
                if (!lo.a((Collection) a11)) {
                    c0110dm.f13601c = a11;
                }
                ArrayList a12 = C0602xa.a(optJSONObject11, "diagnostic");
                if (!lo.a((Collection) a12)) {
                    c0110dm.f13611n = a12;
                }
                HashMap hashMap2 = new HashMap();
                Iterator<String> keys2 = optJSONObject11.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    if (!C0602xa.f14916a.contains(next2) && (a7 = C0602xa.a(optJSONObject11, next2)) != null) {
                        hashMap2.put(next2, a7);
                    }
                }
                c0110dm.f13612o = hashMap2;
            }
        } catch (Throwable unused8) {
        }
        this.f13241c.getClass();
        C0589wm c0589wm = new C0589wm();
        JSONObject optJSONObject12 = c0150fb.optJSONObject("retry_policy");
        int i5 = c0589wm.f14872w;
        int i10 = c0589wm.f14873x;
        if (optJSONObject12 != null) {
            i5 = optJSONObject12.optInt("max_interval_seconds", i5);
            i10 = optJSONObject12.optInt("exponential_multiplier", c0589wm.f14873x);
        }
        c0110dm.q = new RetryPolicyConfig(i5, i10);
        this.f13242d.getClass();
        if (c0110dm.f13600b.f14164a) {
            JSONObject optJSONObject13 = c0150fb.optJSONObject("permissions_collecting");
            C0514tm c0514tm = new C0514tm();
            if (optJSONObject13 != null) {
                j = optJSONObject13.optLong("check_interval_seconds", c0514tm.f14688a);
                j6 = optJSONObject13.optLong("force_send_interval_seconds", c0514tm.f14689b);
            } else {
                j = c0514tm.f14688a;
                j6 = c0514tm.f14689b;
            }
            c0110dm.f13608k = new C0606xe(j, j6);
        }
        C0168g3 c0168g3 = this.f13244f;
        c0168g3.getClass();
        C0390om c0390om = new C0390om();
        JSONObject optJSONObject14 = c0150fb.optJSONObject("cache_control");
        if (optJSONObject14 != null) {
            c0390om.f14431a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject14, "last_known_location_ttl", c0390om.f14431a);
        }
        c0168g3.f13804a.getClass();
        c0110dm.f13614r = new C0091d3(c0390om.f14431a);
        this.f13245g.getClass();
        C0370o2.a(c0110dm, c0150fb);
        Em em = this.f13247i;
        em.getClass();
        JSONObject optJSONObject15 = c0150fb.optJSONObject("startup_update");
        C0539um c0539um = new C0539um();
        Integer a13 = AbstractC0176gb.a(optJSONObject15, "interval_seconds", null);
        if (a13 != null) {
            c0539um.f14755a = a13.intValue();
        }
        em.f12207a.getClass();
        c0110dm.f13616t = new Cm(c0539um.f14755a);
        Map<String, Yc> c2 = this.j.f14554a.c();
        C0431qd c0431qd = new C0431qd(c0150fb);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Yc> entry : c2.entrySet()) {
            Object invoke = c0431qd.invoke(entry);
            if (invoke != null) {
                linkedHashMap.put(entry.getKey(), invoke);
            }
        }
        c0110dm.f13617u = linkedHashMap;
        C9 c92 = this.f13248k.f12138a;
        C0440qm c0440qm = new C0440qm();
        JSONObject optJSONObject16 = c0150fb.optJSONObject("external_attribution");
        if (optJSONObject16 != null) {
            c0440qm.f14526a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject16, "collecting_interval_seconds", c0440qm.f14526a);
        }
        c92.getClass();
        c0110dm.f13618v = new B9(c0440qm.f14526a);
    }

    public Yl(C0202hb c0202hb, C0602xa c0602xa, W9 w92, Fi fi2, C0656ze c0656ze, Hm hm, C0168g3 c0168g3, C0370o2 c0370o2, Em em, C0455rd c0455rd, D9 d92) {
        this.f13239a = c0602xa;
        this.f13240b = w92;
        this.f13241c = fi2;
        this.f13242d = c0656ze;
        this.f13243e = hm;
        this.f13244f = c0168g3;
        this.f13245g = c0370o2;
        this.f13246h = c0202hb;
        this.f13247i = em;
        this.j = c0455rd;
        this.f13248k = d92;
    }
}
