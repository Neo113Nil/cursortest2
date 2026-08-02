package com.bumptech.glide.load.engine;

import P4.a;
import x0.InterfaceC6775d;

/* loaded from: classes2.dex */
public final class u implements v, a.f {

    /* renamed from: e, reason: collision with root package name */
    public static final InterfaceC6775d f29917e = P4.a.d(20, new a());

    /* renamed from: a, reason: collision with root package name */
    public final P4.c f29918a = P4.c.a();

    /* renamed from: b, reason: collision with root package name */
    public v f29919b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f29920c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f29921d;

    public class a implements a.d {
        @Override // P4.a.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u create() {
            return new u();
        }
    }

    public static u c(v vVar) {
        u uVar = (u) com.bumptech.glide.util.k.d((u) f29917e.acquire());
        uVar.b(vVar);
        return uVar;
    }

    private void e() {
        this.f29919b = null;
        f29917e.release(this);
    }

    @Override // com.bumptech.glide.load.engine.v
    public Class a() {
        return this.f29919b.a();
    }

    public final void b(v vVar) {
        this.f29921d = false;
        this.f29920c = true;
        this.f29919b = vVar;
    }

    @Override // P4.a.f
    public P4.c d() {
        return this.f29918a;
    }

    public synchronized void f() {
        this.f29918a.c();
        if (!this.f29920c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f29920c = false;
        if (this.f29921d) {
            recycle();
        }
    }

    @Override // com.bumptech.glide.load.engine.v
    public Object get() {
        return this.f29919b.get();
    }

    @Override // com.bumptech.glide.load.engine.v
    public int getSize() {
        return this.f29919b.getSize();
    }

    @Override // com.bumptech.glide.load.engine.v
    public synchronized void recycle() {
        this.f29918a.c();
        this.f29921d = true;
        if (!this.f29920c) {
            this.f29919b.recycle();
            e();
        }
    }
}
