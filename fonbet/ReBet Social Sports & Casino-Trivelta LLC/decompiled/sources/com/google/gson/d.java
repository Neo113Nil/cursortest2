package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public Excluder f38077a = Excluder.f38098g;

    /* renamed from: b, reason: collision with root package name */
    public r f38078b = r.f38331a;

    /* renamed from: c, reason: collision with root package name */
    public c f38079c = b.f38070a;

    /* renamed from: d, reason: collision with root package name */
    public final Map f38080d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final List f38081e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final List f38082f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public boolean f38083g = false;

    /* renamed from: h, reason: collision with root package name */
    public String f38084h = Gson.f38037z;

    /* renamed from: i, reason: collision with root package name */
    public int f38085i = 2;

    /* renamed from: j, reason: collision with root package name */
    public int f38086j = 2;

    /* renamed from: k, reason: collision with root package name */
    public boolean f38087k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f38088l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f38089m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f38090n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f38091o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f38092p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f38093q = true;

    /* renamed from: r, reason: collision with root package name */
    public u f38094r = Gson.f38035B;

    /* renamed from: s, reason: collision with root package name */
    public u f38095s = Gson.f38036C;

    /* renamed from: t, reason: collision with root package name */
    public final LinkedList f38096t = new LinkedList();

    public final void a(String str, int i10, int i11, List list) {
        v vVar;
        v vVar2;
        boolean z10 = com.google.gson.internal.sql.a.f38322a;
        v vVar3 = null;
        if (str != null && !str.trim().isEmpty()) {
            vVar = DefaultDateTypeAdapter.b.f38126b.b(str);
            if (z10) {
                vVar3 = com.google.gson.internal.sql.a.f38324c.b(str);
                vVar2 = com.google.gson.internal.sql.a.f38323b.b(str);
            }
            vVar2 = null;
        } else {
            if (i10 == 2 || i11 == 2) {
                return;
            }
            v a10 = DefaultDateTypeAdapter.b.f38126b.a(i10, i11);
            if (z10) {
                vVar3 = com.google.gson.internal.sql.a.f38324c.a(i10, i11);
                v a11 = com.google.gson.internal.sql.a.f38323b.a(i10, i11);
                vVar = a10;
                vVar2 = a11;
            } else {
                vVar = a10;
                vVar2 = null;
            }
        }
        list.add(vVar);
        if (z10) {
            list.add(vVar3);
            list.add(vVar2);
        }
    }

    public Gson b() {
        ArrayList arrayList = new ArrayList(this.f38081e.size() + this.f38082f.size() + 3);
        arrayList.addAll(this.f38081e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f38082f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        a(this.f38084h, this.f38085i, this.f38086j, arrayList);
        return new Gson(this.f38077a, this.f38079c, new HashMap(this.f38080d), this.f38083g, this.f38087k, this.f38091o, this.f38089m, this.f38090n, this.f38092p, this.f38088l, this.f38093q, this.f38078b, this.f38084h, this.f38085i, this.f38086j, new ArrayList(this.f38081e), new ArrayList(this.f38082f), arrayList, this.f38094r, this.f38095s, new ArrayList(this.f38096t));
    }

    public d c() {
        this.f38089m = false;
        return this;
    }

    public d d() {
        this.f38087k = true;
        return this;
    }

    public d e(int... iArr) {
        Objects.requireNonNull(iArr);
        this.f38077a = this.f38077a.l(iArr);
        return this;
    }

    public d f(Type type, Object obj) {
        Objects.requireNonNull(type);
        boolean z10 = obj instanceof p;
        com.google.gson.internal.a.a(z10 || (obj instanceof g) || (obj instanceof TypeAdapter));
        if (z10 || (obj instanceof g)) {
            this.f38081e.add(TreeTypeAdapter.c(TypeToken.get(type), obj));
        }
        if (obj instanceof TypeAdapter) {
            this.f38081e.add(TypeAdapters.a(TypeToken.get(type), (TypeAdapter) obj));
        }
        return this;
    }

    public d g(v vVar) {
        Objects.requireNonNull(vVar);
        this.f38081e.add(vVar);
        return this;
    }

    public d h(Class cls, Object obj) {
        Objects.requireNonNull(cls);
        boolean z10 = obj instanceof p;
        com.google.gson.internal.a.a(z10 || (obj instanceof g) || (obj instanceof TypeAdapter));
        if ((obj instanceof g) || z10) {
            this.f38082f.add(TreeTypeAdapter.d(cls, obj));
        }
        if (obj instanceof TypeAdapter) {
            this.f38081e.add(TypeAdapters.e(cls, (TypeAdapter) obj));
        }
        return this;
    }

    public d i(String str) {
        this.f38084h = str;
        return this;
    }

    public d j(b bVar) {
        return k(bVar);
    }

    public d k(c cVar) {
        Objects.requireNonNull(cVar);
        this.f38079c = cVar;
        return this;
    }
}
