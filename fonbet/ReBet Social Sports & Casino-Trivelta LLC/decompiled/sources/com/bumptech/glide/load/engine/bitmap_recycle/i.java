package com.bumptech.glide.load.engine.bitmap_recycle;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class i implements com.bumptech.glide.load.engine.bitmap_recycle.b {

    /* renamed from: a, reason: collision with root package name */
    public final g f29711a = new g();

    /* renamed from: b, reason: collision with root package name */
    public final b f29712b = new b();

    /* renamed from: c, reason: collision with root package name */
    public final Map f29713c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Map f29714d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final int f29715e;

    /* renamed from: f, reason: collision with root package name */
    public int f29716f;

    public static final class a implements m {

        /* renamed from: a, reason: collision with root package name */
        public final b f29717a;

        /* renamed from: b, reason: collision with root package name */
        public int f29718b;

        /* renamed from: c, reason: collision with root package name */
        public Class f29719c;

        public a(b bVar) {
            this.f29717a = bVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
        public void a() {
            this.f29717a.c(this);
        }

        public void b(int i10, Class cls) {
            this.f29718b = i10;
            this.f29719c = cls;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f29718b == aVar.f29718b && this.f29719c == aVar.f29719c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f29718b * 31;
            Class cls = this.f29719c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f29718b + "array=" + this.f29719c + '}';
        }
    }

    public static final class b extends c {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        public a e(int i10, Class cls) {
            a aVar = (a) b();
            aVar.b(i10, cls);
            return aVar;
        }
    }

    public i(int i10) {
        this.f29715e = i10;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized void a(int i10) {
        try {
            if (i10 >= 40) {
                b();
            } else if (i10 >= 20 || i10 == 15) {
                g(this.f29715e / 2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized void b() {
        g(0);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized Object c(int i10, Class cls) {
        Integer num;
        try {
            num = (Integer) l(cls).ceilingKey(Integer.valueOf(i10));
        } catch (Throwable th2) {
            throw th2;
        }
        return k(o(i10, num) ? this.f29712b.e(num.intValue(), cls) : this.f29712b.e(i10, cls), cls);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized Object d(int i10, Class cls) {
        return k(this.f29712b.e(i10, cls), cls);
    }

    public final void e(int i10, Class cls) {
        NavigableMap l10 = l(cls);
        Integer num = (Integer) l10.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                l10.remove(Integer.valueOf(i10));
                return;
            } else {
                l10.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    public final void f() {
        g(this.f29715e);
    }

    public final void g(int i10) {
        while (this.f29716f > i10) {
            Object f10 = this.f29711a.f();
            com.bumptech.glide.util.k.d(f10);
            com.bumptech.glide.load.engine.bitmap_recycle.a h10 = h(f10);
            this.f29716f -= h10.b(f10) * h10.a();
            e(h10.b(f10), f10.getClass());
            if (Log.isLoggable(h10.getTag(), 2)) {
                h10.getTag();
                h10.b(f10);
            }
        }
    }

    public final com.bumptech.glide.load.engine.bitmap_recycle.a h(Object obj) {
        return i(obj.getClass());
    }

    public final com.bumptech.glide.load.engine.bitmap_recycle.a i(Class cls) {
        com.bumptech.glide.load.engine.bitmap_recycle.a fVar;
        com.bumptech.glide.load.engine.bitmap_recycle.a aVar = (com.bumptech.glide.load.engine.bitmap_recycle.a) this.f29714d.get(cls);
        if (aVar != null) {
            return aVar;
        }
        if (cls.equals(int[].class)) {
            fVar = new h();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            fVar = new f();
        }
        this.f29714d.put(cls, fVar);
        return fVar;
    }

    public final Object j(a aVar) {
        return this.f29711a.a(aVar);
    }

    public final Object k(a aVar, Class cls) {
        com.bumptech.glide.load.engine.bitmap_recycle.a i10 = i(cls);
        Object j10 = j(aVar);
        if (j10 != null) {
            this.f29716f -= i10.b(j10) * i10.a();
            e(i10.b(j10), cls);
        }
        if (j10 != null) {
            return j10;
        }
        if (Log.isLoggable(i10.getTag(), 2)) {
            i10.getTag();
            int i11 = aVar.f29718b;
        }
        return i10.newArray(aVar.f29718b);
    }

    public final NavigableMap l(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.f29713c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f29713c.put(cls, treeMap);
        return treeMap;
    }

    public final boolean m() {
        int i10 = this.f29716f;
        return i10 == 0 || this.f29715e / i10 >= 2;
    }

    public final boolean n(int i10) {
        return i10 <= this.f29715e / 2;
    }

    public final boolean o(int i10, Integer num) {
        if (num != null) {
            return m() || num.intValue() <= i10 * 8;
        }
        return false;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized void put(Object obj) {
        Class<?> cls = obj.getClass();
        com.bumptech.glide.load.engine.bitmap_recycle.a i10 = i(cls);
        int b10 = i10.b(obj);
        int a10 = i10.a() * b10;
        if (n(a10)) {
            a e10 = this.f29712b.e(b10, cls);
            this.f29711a.d(e10, obj);
            NavigableMap l10 = l(cls);
            Integer num = (Integer) l10.get(Integer.valueOf(e10.f29718b));
            Integer valueOf = Integer.valueOf(e10.f29718b);
            int i11 = 1;
            if (num != null) {
                i11 = 1 + num.intValue();
            }
            l10.put(valueOf, Integer.valueOf(i11));
            this.f29716f += a10;
            f();
        }
    }
}
