package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private Excluder f59803a = Excluder.f59818c;

    /* renamed from: b, reason: collision with root package name */
    private o f59804b = o.DEFAULT;

    /* renamed from: c, reason: collision with root package name */
    private c f59805c = c.IDENTITY;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f59806d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList f59807e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList f59808f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private int f59809g;

    /* renamed from: h, reason: collision with root package name */
    private int f59810h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f59811i;

    /* renamed from: j, reason: collision with root package name */
    private e f59812j;

    /* renamed from: k, reason: collision with root package name */
    private q f59813k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f59814l;

    /* renamed from: m, reason: collision with root package name */
    private r f59815m;

    /* renamed from: n, reason: collision with root package name */
    private r f59816n;

    /* renamed from: o, reason: collision with root package name */
    private final ArrayDeque<p> f59817o;

    public f() {
        e eVar = Gson.f59777m;
        this.f59809g = 2;
        this.f59810h = 2;
        this.f59811i = true;
        this.f59812j = Gson.f59777m;
        this.f59813k = null;
        this.f59814l = true;
        this.f59815m = Gson.f59779o;
        this.f59816n = Gson.f59780p;
        this.f59817o = new ArrayDeque<>();
    }

    public final Gson a() {
        t tVar;
        t tVar2;
        ArrayList arrayList = this.f59807e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f59808f;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z11 = com.google.gson.internal.sql.a.f60009a;
        DefaultDateTypeAdapter.a<Date> aVar = DefaultDateTypeAdapter.a.f59838b;
        int i11 = this.f59809g;
        int i12 = this.f59810h;
        if (i11 != 2 || i12 != 2) {
            t a11 = aVar.a(i11, i12);
            if (z11) {
                tVar = com.google.gson.internal.sql.a.f60011c.a(i11, i12);
                tVar2 = com.google.gson.internal.sql.a.f60010b.a(i11, i12);
            } else {
                tVar = null;
                tVar2 = null;
            }
            arrayList3.add(a11);
            if (z11) {
                arrayList3.add(tVar);
                arrayList3.add(tVar2);
            }
        }
        return new Gson(this.f59803a, this.f59805c, new HashMap(this.f59806d), this.f59811i, this.f59812j, this.f59813k, this.f59814l, this.f59804b, new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, this.f59815m, this.f59816n, new ArrayList(this.f59817o));
    }

    public final void b() {
        this.f59811i = false;
    }

    public final void c(Class cls, Object obj) {
        boolean z11 = obj instanceof m;
        if (!z11 && !(obj instanceof i) && !(obj instanceof g) && !(obj instanceof TypeAdapter)) {
            throw new IllegalArgumentException("Class " + obj.getClass().getName() + " does not implement any supported type adapter class or interface");
        }
        if (cls == Object.class) {
            throw new IllegalArgumentException(U7.m.a(cls, "Cannot override built-in adapter for "));
        }
        if (obj instanceof g) {
            this.f59806d.put(cls, (g) obj);
        }
        ArrayList arrayList = this.f59807e;
        if (z11 || (obj instanceof i)) {
            arrayList.add(TreeTypeAdapter.b(com.google.gson.reflect.a.get((Type) cls), obj));
        }
        if (obj instanceof TypeAdapter) {
            arrayList.add(TypeAdapters.a(com.google.gson.reflect.a.get((Type) cls), (TypeAdapter) obj));
        }
    }

    public final void d(t tVar) {
        Objects.requireNonNull(tVar);
        this.f59807e.add(tVar);
    }

    @Deprecated
    public final void e() {
        q qVar = q.LENIENT;
        Objects.requireNonNull(qVar);
        this.f59813k = qVar;
    }

    public final void f(r rVar) {
        Objects.requireNonNull(rVar);
        this.f59815m = rVar;
    }
}
