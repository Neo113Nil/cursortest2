package com.airbnb.lottie;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import z.C6907h;

/* renamed from: com.airbnb.lottie.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2940j {

    /* renamed from: c, reason: collision with root package name */
    public Map f28698c;

    /* renamed from: d, reason: collision with root package name */
    public Map f28699d;

    /* renamed from: e, reason: collision with root package name */
    public float f28700e;

    /* renamed from: f, reason: collision with root package name */
    public Map f28701f;

    /* renamed from: g, reason: collision with root package name */
    public List f28702g;

    /* renamed from: h, reason: collision with root package name */
    public z.s f28703h;

    /* renamed from: i, reason: collision with root package name */
    public C6907h f28704i;

    /* renamed from: j, reason: collision with root package name */
    public List f28705j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f28706k;

    /* renamed from: l, reason: collision with root package name */
    public float f28707l;

    /* renamed from: m, reason: collision with root package name */
    public float f28708m;

    /* renamed from: n, reason: collision with root package name */
    public float f28709n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f28710o;

    /* renamed from: q, reason: collision with root package name */
    public int f28712q;

    /* renamed from: r, reason: collision with root package name */
    public int f28713r;

    /* renamed from: a, reason: collision with root package name */
    public final W f28696a = new W();

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f28697b = new HashSet();

    /* renamed from: p, reason: collision with root package name */
    public int f28711p = 0;

    public void a(String str) {
        com.airbnb.lottie.utils.g.c(str);
        this.f28697b.add(str);
    }

    public Rect b() {
        return this.f28706k;
    }

    public z.s c() {
        return this.f28703h;
    }

    public float d() {
        return (long) ((e() / this.f28709n) * 1000.0f);
    }

    public float e() {
        return this.f28708m - this.f28707l;
    }

    public float f() {
        return this.f28708m;
    }

    public Map g() {
        return this.f28701f;
    }

    public float h(float f10) {
        return com.airbnb.lottie.utils.l.i(this.f28707l, this.f28708m, f10);
    }

    public float i() {
        return this.f28709n;
    }

    public Map j() {
        float e10 = com.airbnb.lottie.utils.z.e();
        if (e10 != this.f28700e) {
            for (Map.Entry entry : this.f28699d.entrySet()) {
                this.f28699d.put((String) entry.getKey(), ((N) entry.getValue()).a(this.f28700e / e10));
            }
        }
        this.f28700e = e10;
        return this.f28699d;
    }

    public List k() {
        return this.f28705j;
    }

    public E3.h l(String str) {
        int size = this.f28702g.size();
        for (int i10 = 0; i10 < size; i10++) {
            E3.h hVar = (E3.h) this.f28702g.get(i10);
            if (hVar.a(str)) {
                return hVar;
            }
        }
        return null;
    }

    public int m() {
        return this.f28711p;
    }

    public W n() {
        return this.f28696a;
    }

    public List o(String str) {
        return (List) this.f28698c.get(str);
    }

    public float p() {
        return this.f28707l;
    }

    public boolean q() {
        return this.f28710o;
    }

    public void r(int i10) {
        this.f28711p += i10;
    }

    public void s(Rect rect, float f10, float f11, float f12, List list, C6907h c6907h, Map map, Map map2, float f13, z.s sVar, Map map3, List list2, int i10, int i11) {
        this.f28706k = rect;
        this.f28707l = f10;
        this.f28708m = f11;
        this.f28709n = f12;
        this.f28705j = list;
        this.f28704i = c6907h;
        this.f28698c = map;
        this.f28699d = map2;
        this.f28700e = f13;
        this.f28703h = sVar;
        this.f28701f = map3;
        this.f28702g = list2;
        this.f28712q = i10;
        this.f28713r = i11;
    }

    public com.airbnb.lottie.model.layer.e t(long j10) {
        return (com.airbnb.lottie.model.layer.e) this.f28704i.d(j10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f28705j.iterator();
        while (it.hasNext()) {
            sb2.append(((com.airbnb.lottie.model.layer.e) it.next()).z("\t"));
        }
        return sb2.toString();
    }

    public void u(boolean z10) {
        this.f28710o = z10;
    }

    public void v(boolean z10) {
        this.f28696a.b(z10);
    }
}
