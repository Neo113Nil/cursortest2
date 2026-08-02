package com.bumptech.glide.load.engine;

/* loaded from: classes2.dex */
public class p implements v {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f29896a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f29897b;

    /* renamed from: c, reason: collision with root package name */
    public final v f29898c;

    /* renamed from: d, reason: collision with root package name */
    public final a f29899d;

    /* renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.g f29900e;

    /* renamed from: f, reason: collision with root package name */
    public int f29901f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f29902g;

    public interface a {
        void d(com.bumptech.glide.load.g gVar, p pVar);
    }

    public p(v vVar, boolean z10, boolean z11, com.bumptech.glide.load.g gVar, a aVar) {
        this.f29898c = (v) com.bumptech.glide.util.k.d(vVar);
        this.f29896a = z10;
        this.f29897b = z11;
        this.f29900e = gVar;
        this.f29899d = (a) com.bumptech.glide.util.k.d(aVar);
    }

    @Override // com.bumptech.glide.load.engine.v
    public Class a() {
        return this.f29898c.a();
    }

    public synchronized void b() {
        if (this.f29902g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f29901f++;
    }

    public v c() {
        return this.f29898c;
    }

    public boolean d() {
        return this.f29896a;
    }

    public void e() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f29901f;
            if (i10 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z10 = true;
            int i11 = i10 - 1;
            this.f29901f = i11;
            if (i11 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            this.f29899d.d(this.f29900e, this);
        }
    }

    @Override // com.bumptech.glide.load.engine.v
    public Object get() {
        return this.f29898c.get();
    }

    @Override // com.bumptech.glide.load.engine.v
    public int getSize() {
        return this.f29898c.getSize();
    }

    @Override // com.bumptech.glide.load.engine.v
    public synchronized void recycle() {
        if (this.f29901f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f29902g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f29902g = true;
        if (this.f29897b) {
            this.f29898c.recycle();
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f29896a + ", listener=" + this.f29899d + ", key=" + this.f29900e + ", acquired=" + this.f29901f + ", isRecycled=" + this.f29902g + ", resource=" + this.f29898c + '}';
    }
}
