package com.bumptech.glide.load.engine;

import B4.n;
import com.bumptech.glide.load.engine.h;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import z4.InterfaceC6925a;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final List f29751a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final List f29752b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.e f29753c;

    /* renamed from: d, reason: collision with root package name */
    public Object f29754d;

    /* renamed from: e, reason: collision with root package name */
    public int f29755e;

    /* renamed from: f, reason: collision with root package name */
    public int f29756f;

    /* renamed from: g, reason: collision with root package name */
    public Class f29757g;

    /* renamed from: h, reason: collision with root package name */
    public h.e f29758h;

    /* renamed from: i, reason: collision with root package name */
    public com.bumptech.glide.load.j f29759i;

    /* renamed from: j, reason: collision with root package name */
    public Map f29760j;

    /* renamed from: k, reason: collision with root package name */
    public Class f29761k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f29762l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f29763m;

    /* renamed from: n, reason: collision with root package name */
    public com.bumptech.glide.load.g f29764n;

    /* renamed from: o, reason: collision with root package name */
    public com.bumptech.glide.h f29765o;

    /* renamed from: p, reason: collision with root package name */
    public j f29766p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f29767q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f29768r;

    public void a() {
        this.f29753c = null;
        this.f29754d = null;
        this.f29764n = null;
        this.f29757g = null;
        this.f29761k = null;
        this.f29759i = null;
        this.f29765o = null;
        this.f29760j = null;
        this.f29766p = null;
        this.f29751a.clear();
        this.f29762l = false;
        this.f29752b.clear();
        this.f29763m = false;
    }

    public com.bumptech.glide.load.engine.bitmap_recycle.b b() {
        return this.f29753c.b();
    }

    public List c() {
        if (!this.f29763m) {
            this.f29763m = true;
            this.f29752b.clear();
            List g10 = g();
            int size = g10.size();
            for (int i10 = 0; i10 < size; i10++) {
                n.a aVar = (n.a) g10.get(i10);
                if (!this.f29752b.contains(aVar.f750a)) {
                    this.f29752b.add(aVar.f750a);
                }
                for (int i11 = 0; i11 < aVar.f751b.size(); i11++) {
                    if (!this.f29752b.contains(aVar.f751b.get(i11))) {
                        this.f29752b.add(aVar.f751b.get(i11));
                    }
                }
            }
        }
        return this.f29752b;
    }

    public InterfaceC6925a d() {
        return this.f29758h.a();
    }

    public j e() {
        return this.f29766p;
    }

    public int f() {
        return this.f29756f;
    }

    public List g() {
        if (!this.f29762l) {
            this.f29762l = true;
            this.f29751a.clear();
            List i10 = this.f29753c.i().i(this.f29754d);
            int size = i10.size();
            for (int i11 = 0; i11 < size; i11++) {
                n.a b10 = ((B4.n) i10.get(i11)).b(this.f29754d, this.f29755e, this.f29756f, this.f29759i);
                if (b10 != null) {
                    this.f29751a.add(b10);
                }
            }
        }
        return this.f29751a;
    }

    public t h(Class cls) {
        return this.f29753c.i().h(cls, this.f29757g, this.f29761k);
    }

    public Class i() {
        return this.f29754d.getClass();
    }

    public List j(File file) {
        return this.f29753c.i().i(file);
    }

    public com.bumptech.glide.load.j k() {
        return this.f29759i;
    }

    public com.bumptech.glide.h l() {
        return this.f29765o;
    }

    public List m() {
        return this.f29753c.i().j(this.f29754d.getClass(), this.f29757g, this.f29761k);
    }

    public com.bumptech.glide.load.m n(v vVar) {
        return this.f29753c.i().k(vVar);
    }

    public com.bumptech.glide.load.data.e o(Object obj) {
        return this.f29753c.i().l(obj);
    }

    public com.bumptech.glide.load.g p() {
        return this.f29764n;
    }

    public com.bumptech.glide.load.d q(Object obj) {
        return this.f29753c.i().m(obj);
    }

    public Class r() {
        return this.f29761k;
    }

    public com.bumptech.glide.load.n s(Class cls) {
        com.bumptech.glide.load.n nVar = (com.bumptech.glide.load.n) this.f29760j.get(cls);
        if (nVar == null) {
            Iterator it = this.f29760j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    nVar = (com.bumptech.glide.load.n) entry.getValue();
                    break;
                }
            }
        }
        if (nVar != null) {
            return nVar;
        }
        if (!this.f29760j.isEmpty() || !this.f29767q) {
            return D4.l.c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    public int t() {
        return this.f29755e;
    }

    public boolean u(Class cls) {
        return h(cls) != null;
    }

    public void v(com.bumptech.glide.e eVar, Object obj, com.bumptech.glide.load.g gVar, int i10, int i11, j jVar, Class cls, Class cls2, com.bumptech.glide.h hVar, com.bumptech.glide.load.j jVar2, Map map, boolean z10, boolean z11, h.e eVar2) {
        this.f29753c = eVar;
        this.f29754d = obj;
        this.f29764n = gVar;
        this.f29755e = i10;
        this.f29756f = i11;
        this.f29766p = jVar;
        this.f29757g = cls;
        this.f29758h = eVar2;
        this.f29761k = cls2;
        this.f29765o = hVar;
        this.f29759i = jVar2;
        this.f29760j = map;
        this.f29767q = z10;
        this.f29768r = z11;
    }

    public boolean w(v vVar) {
        return this.f29753c.i().n(vVar);
    }

    public boolean x() {
        return this.f29768r;
    }

    public boolean y(com.bumptech.glide.load.g gVar) {
        List g10 = g();
        int size = g10.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((n.a) g10.get(i10)).f750a.equals(gVar)) {
                return true;
            }
        }
        return false;
    }
}
