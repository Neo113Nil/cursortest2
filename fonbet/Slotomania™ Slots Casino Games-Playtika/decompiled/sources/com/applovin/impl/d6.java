package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class d6 extends k5 {
    private final String g;
    private final List h;
    private final m3 i;
    private final Map j;
    private final Map k;
    private final Map l;
    private final MaxError m;

    public d6(String str, List list, Map map, Map map2, MaxError maxError, m3 m3Var, com.applovin.impl.sdk.l lVar, boolean z) {
        super("TaskFireMediationPostbacks", lVar);
        this.g = str + "_urls";
        this.h = list;
        this.j = q7.a(map, lVar);
        this.k = map2 == null ? new HashMap() : map2;
        this.m = maxError != null ? maxError : new MaxErrorImpl(-1);
        this.i = m3Var;
        HashMap hashMap = new HashMap(7);
        hashMap.put("AppLovin-Event-Type", str);
        if (z && m3Var != null) {
            hashMap.put("AppLovin-Ad-Network-Name", m3Var.c());
        }
        if (m3Var instanceof a3) {
            a3 a3Var = (a3) m3Var;
            hashMap.put("AppLovin-Ad-Unit-Id", a3Var.getAdUnitId());
            hashMap.put("AppLovin-Ad-Format", a3Var.getFormat().getLabel());
            if (z) {
                hashMap.put("AppLovin-Third-Party-Ad-Placement-Id", a3Var.U());
            }
        }
        if (maxError != null) {
            hashMap.put("AppLovin-Error-Code", String.valueOf(maxError.getCode()));
            hashMap.put("AppLovin-Error-Message", maxError.getMessage());
        }
        this.l = hashMap;
    }

    private void a(String str, Map map) {
        b().h0().e(com.applovin.impl.sdk.network.d.b().d(str).c("POST").a(this.l).a(false).c(map).c(((Boolean) this.a.a(t3.M8)).booleanValue()).a());
    }

    private String b(String str, Map map) {
        for (String str2 : map.keySet()) {
            str = str.replace(str2, StringUtils.emptyIfNull((String) map.get(str2)));
        }
        return str;
    }

    private Map e() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) this.a.a(t3.G7)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    private List f() {
        List list = this.h;
        if (list != null) {
            return list;
        }
        m3 m3Var = this.i;
        if (m3Var != null) {
            return m3Var.b(this.g);
        }
        return null;
    }

    private h g() {
        m3 m3Var = this.i;
        if (m3Var instanceof a3) {
            return ((a3) m3Var).Q().f();
        }
        if (m3Var instanceof f5) {
            return ((f5) m3Var).u().f();
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        h g;
        List f = f();
        if (CollectionUtils.isEmpty(f)) {
            return;
        }
        Map e = e();
        Iterator it = f.iterator();
        while (it.hasNext()) {
            Uri parse = Uri.parse(a(b((String) it.next(), this.j), this.m));
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            HashMap hashMap = new HashMap(this.k);
            for (String str : parse.getQueryParameterNames()) {
                String queryParameter = parse.getQueryParameter(str);
                if (e.containsKey(queryParameter)) {
                    m3 m3Var = this.i;
                    if (m3Var != null) {
                        hashMap.put(str, m3Var.a((String) e.get(queryParameter)));
                    }
                } else {
                    clearQuery.appendQueryParameter(str, queryParameter);
                }
            }
            Map e2 = this.a.B().e();
            for (String str2 : e2.keySet()) {
                if (hashMap.containsKey(str2)) {
                    hashMap.put(str2, e2.get(str2));
                }
            }
            if (((Boolean) this.a.a(t3.E8)).booleanValue() && (g = g()) != null) {
                hashMap.put("arn_info", g.e());
            }
            a(clearQuery.build().toString(), hashMap);
        }
    }

    private String a(String str, MaxError maxError) {
        int i;
        String str2;
        if (!(maxError instanceof MaxAdapterError)) {
            i = 0;
            str2 = "";
        } else {
            MaxAdapterError maxAdapterError = (MaxAdapterError) maxError;
            i = maxAdapterError.getMediatedNetworkErrorCode();
            str2 = maxAdapterError.getMediatedNetworkErrorMessage();
        }
        return str.replace("{ERROR_CODE}", String.valueOf(maxError.getCode())).replace("{ERROR_MESSAGE}", StringUtils.encodeUriString(maxError.getMessage())).replace("{THIRD_PARTY_SDK_ERROR_CODE}", String.valueOf(i)).replace("{THIRD_PARTY_SDK_ERROR_MESSAGE}", StringUtils.encodeUriString(str2));
    }
}
