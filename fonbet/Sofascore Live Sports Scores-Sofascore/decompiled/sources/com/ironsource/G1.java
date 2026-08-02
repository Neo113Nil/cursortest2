package com.ironsource;

import defpackage.k13;
import defpackage.km5;
import defpackage.llf;
import defpackage.v6a;
import java.util.ArrayList;
import java.util.List;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class G1 {

    @Nullable
    private final String a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final int e;

    @NotNull
    private final String f;

    @NotNull
    private final String g;
    private final int h;
    private final int i;
    private final int j;

    @NotNull
    private final List<Integer> k;

    @NotNull
    private final List<Integer> l;

    @NotNull
    private final List<Integer> m;

    @NotNull
    private final List<Integer> n;

    public G1(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        String optString = jSONObject.optString("abt");
        optString.getClass();
        this.a = optString.length() <= 0 ? null : optString;
        this.b = jSONObject.optBoolean(I1.a, false);
        this.c = jSONObject.optBoolean(I1.b, false);
        this.d = jSONObject.optBoolean(I1.c, false);
        this.e = jSONObject.optInt(I1.d, -1);
        String optString2 = jSONObject.optString(I1.e);
        optString2.getClass();
        this.f = optString2;
        String optString3 = jSONObject.optString(I1.f);
        optString3.getClass();
        this.g = optString3;
        this.h = jSONObject.optInt(I1.g, -1);
        this.i = jSONObject.optInt(I1.h, -1);
        this.j = jSONObject.optInt(I1.i, 5000);
        this.k = a(jSONObject, I1.j);
        this.l = a(jSONObject, I1.k);
        this.m = a(jSONObject, I1.l);
        this.n = a(jSONObject, I1.m);
    }

    private final List<Integer> a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return km5.a;
        }
        IntRange j = llf.j(0, optJSONArray.length());
        ArrayList arrayList = new ArrayList(k13.r(j, 10));
        v6a it = j.iterator();
        while (it.c) {
            arrayList.add(Integer.valueOf(optJSONArray.getInt(it.nextInt())));
        }
        return arrayList;
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

    @NotNull
    public final String e() {
        return this.g;
    }

    public final int f() {
        return this.j;
    }

    public final int g() {
        return this.i;
    }

    @NotNull
    public final List<Integer> h() {
        return this.n;
    }

    @NotNull
    public final List<Integer> i() {
        return this.l;
    }

    @NotNull
    public final List<Integer> j() {
        return this.k;
    }

    public final boolean k() {
        return this.c;
    }

    public final boolean l() {
        return this.b;
    }

    @NotNull
    public final String m() {
        return this.f;
    }

    @NotNull
    public final List<Integer> n() {
        return this.m;
    }

    @Nullable
    public final String a() {
        return this.a;
    }
}
