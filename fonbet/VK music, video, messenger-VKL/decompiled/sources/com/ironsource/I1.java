package com.ironsource;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.c5g;
import xsna.j9x;
import xsna.k9x;
import xsna.swe0;

/* loaded from: classes13.dex */
public final class I1 {
    private final String a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final int e;
    private final String f;
    private final String g;
    private final int h;
    private final int i;
    private final int j;
    private final List<Integer> k;
    private final List<Integer> l;
    private final List<Integer> m;
    private final List<Integer> n;

    public I1(JSONObject jSONObject) {
        String optString = jSONObject.optString("abt");
        this.a = optString.length() <= 0 ? null : optString;
        this.b = jSONObject.optBoolean(K1.a, false);
        this.c = jSONObject.optBoolean(K1.b, false);
        this.d = jSONObject.optBoolean(K1.c, false);
        this.e = jSONObject.optInt(K1.d, -1);
        this.f = jSONObject.optString(K1.e);
        this.g = jSONObject.optString(K1.f);
        this.h = jSONObject.optInt(K1.g, -1);
        this.i = jSONObject.optInt(K1.h, -1);
        this.j = jSONObject.optInt(K1.i, 5000);
        this.k = a(jSONObject, K1.j);
        this.l = a(jSONObject, K1.k);
        this.m = a(jSONObject, K1.l);
        this.n = a(jSONObject, K1.m);
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.h;
    }

    public final boolean c() {
        return this.d;
    }

    public final int d() {
        return this.e;
    }

    public final String e() {
        return this.g;
    }

    public final int f() {
        return this.j;
    }

    public final int g() {
        return this.i;
    }

    public final List<Integer> h() {
        return this.n;
    }

    public final List<Integer> i() {
        return this.l;
    }

    public final List<Integer> j() {
        return this.k;
    }

    public final boolean k() {
        return this.c;
    }

    public final boolean l() {
        return this.b;
    }

    public final String m() {
        return this.f;
    }

    public final List<Integer> n() {
        return this.m;
    }

    private final List<Integer> a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return EmptyList.b;
        }
        k9x q = swe0.q(0, optJSONArray.length());
        ArrayList arrayList = new ArrayList(c5g.u(q, 10));
        j9x it = q.iterator();
        while (it.d) {
            arrayList.add(Integer.valueOf(optJSONArray.getInt(it.nextInt())));
        }
        return arrayList;
    }
}
