package com.bumptech.glide;

import B4.o;
import B4.p;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.engine.t;
import com.bumptech.glide.load.engine.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import x0.InterfaceC6775d;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final p f29622a;

    /* renamed from: b, reason: collision with root package name */
    public final K4.a f29623b;

    /* renamed from: c, reason: collision with root package name */
    public final K4.e f29624c;

    /* renamed from: d, reason: collision with root package name */
    public final K4.f f29625d;

    /* renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.data.f f29626e;

    /* renamed from: f, reason: collision with root package name */
    public final I4.f f29627f;

    /* renamed from: g, reason: collision with root package name */
    public final K4.b f29628g;

    /* renamed from: h, reason: collision with root package name */
    public final K4.d f29629h = new K4.d();

    /* renamed from: i, reason: collision with root package name */
    public final K4.c f29630i = new K4.c();

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC6775d f29631j;

    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    public static class c extends a {
        public c(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public c(Object obj, List list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
        }

        public c(Class cls, Class cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class d extends a {
        public d(Class cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class e extends a {
        public e(Class cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public j() {
        InterfaceC6775d e10 = P4.a.e();
        this.f29631j = e10;
        this.f29622a = new p(e10);
        this.f29623b = new K4.a();
        this.f29624c = new K4.e();
        this.f29625d = new K4.f();
        this.f29626e = new com.bumptech.glide.load.data.f();
        this.f29627f = new I4.f();
        this.f29628g = new K4.b();
        s(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }

    public j a(Class cls, com.bumptech.glide.load.d dVar) {
        this.f29623b.a(cls, dVar);
        return this;
    }

    public j b(Class cls, com.bumptech.glide.load.m mVar) {
        this.f29625d.a(cls, mVar);
        return this;
    }

    public j c(Class cls, Class cls2, o oVar) {
        this.f29622a.a(cls, cls2, oVar);
        return this;
    }

    public j d(Class cls, Class cls2, com.bumptech.glide.load.l lVar) {
        e("legacy_append", cls, cls2, lVar);
        return this;
    }

    public j e(String str, Class cls, Class cls2, com.bumptech.glide.load.l lVar) {
        this.f29624c.a(str, lVar, cls, cls2);
        return this;
    }

    public final List f(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f29624c.d(cls, cls2)) {
            for (Class cls5 : this.f29627f.b(cls4, cls3)) {
                arrayList.add(new com.bumptech.glide.load.engine.i(cls, cls4, cls5, this.f29624c.b(cls, cls4), this.f29627f.a(cls4, cls5), this.f29631j));
            }
        }
        return arrayList;
    }

    public List g() {
        List b10 = this.f29628g.b();
        if (b10.isEmpty()) {
            throw new b();
        }
        return b10;
    }

    public t h(Class cls, Class cls2, Class cls3) {
        Class cls4;
        Class cls5;
        Class cls6;
        t a10 = this.f29630i.a(cls, cls2, cls3);
        t tVar = null;
        if (this.f29630i.c(a10)) {
            return null;
        }
        if (a10 != null) {
            return a10;
        }
        List f10 = f(cls, cls2, cls3);
        if (f10.isEmpty()) {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
        } else {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
            tVar = new t(cls4, cls5, cls6, f10, this.f29631j);
        }
        this.f29630i.d(cls4, cls5, cls6, tVar);
        return tVar;
    }

    public List i(Object obj) {
        return this.f29622a.d(obj);
    }

    public List j(Class cls, Class cls2, Class cls3) {
        List a10 = this.f29629h.a(cls, cls2, cls3);
        if (a10 == null) {
            a10 = new ArrayList();
            Iterator it = this.f29622a.c(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : this.f29624c.d((Class) it.next(), cls2)) {
                    if (!this.f29627f.b(cls4, cls3).isEmpty() && !a10.contains(cls4)) {
                        a10.add(cls4);
                    }
                }
            }
            this.f29629h.b(cls, cls2, cls3, Collections.unmodifiableList(a10));
        }
        return a10;
    }

    public com.bumptech.glide.load.m k(v vVar) {
        com.bumptech.glide.load.m b10 = this.f29625d.b(vVar.a());
        if (b10 != null) {
            return b10;
        }
        throw new d(vVar.a());
    }

    public com.bumptech.glide.load.data.e l(Object obj) {
        return this.f29626e.a(obj);
    }

    public com.bumptech.glide.load.d m(Object obj) {
        com.bumptech.glide.load.d b10 = this.f29623b.b(obj.getClass());
        if (b10 != null) {
            return b10;
        }
        throw new e(obj.getClass());
    }

    public boolean n(v vVar) {
        return this.f29625d.b(vVar.a()) != null;
    }

    public j o(ImageHeaderParser imageHeaderParser) {
        this.f29628g.a(imageHeaderParser);
        return this;
    }

    public j p(e.a aVar) {
        this.f29626e.b(aVar);
        return this;
    }

    public j q(Class cls, Class cls2, I4.e eVar) {
        this.f29627f.c(cls, cls2, eVar);
        return this;
    }

    public j r(Class cls, Class cls2, o oVar) {
        this.f29622a.f(cls, cls2, oVar);
        return this;
    }

    public final j s(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        this.f29624c.e(arrayList);
        return this;
    }
}
