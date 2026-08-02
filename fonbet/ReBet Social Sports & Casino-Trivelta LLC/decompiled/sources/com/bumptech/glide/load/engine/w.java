package com.bumptech.glide.load.engine;

import B4.n;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.f;
import java.io.File;
import java.util.List;

/* loaded from: classes2.dex */
public class w implements f, d.a {

    /* renamed from: a, reason: collision with root package name */
    public final f.a f29922a;

    /* renamed from: b, reason: collision with root package name */
    public final g f29923b;

    /* renamed from: c, reason: collision with root package name */
    public int f29924c;

    /* renamed from: d, reason: collision with root package name */
    public int f29925d = -1;

    /* renamed from: e, reason: collision with root package name */
    public com.bumptech.glide.load.g f29926e;

    /* renamed from: f, reason: collision with root package name */
    public List f29927f;

    /* renamed from: g, reason: collision with root package name */
    public int f29928g;

    /* renamed from: h, reason: collision with root package name */
    public volatile n.a f29929h;

    /* renamed from: i, reason: collision with root package name */
    public File f29930i;

    /* renamed from: j, reason: collision with root package name */
    public x f29931j;

    public w(g gVar, f.a aVar) {
        this.f29923b = gVar;
        this.f29922a = aVar;
    }

    private boolean a() {
        return this.f29928g < this.f29927f.size();
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean b() {
        P4.b.a("ResourceCacheGenerator.startNext");
        try {
            List c10 = this.f29923b.c();
            boolean z10 = false;
            if (c10.isEmpty()) {
                P4.b.e();
                return false;
            }
            List m10 = this.f29923b.m();
            if (m10.isEmpty()) {
                if (File.class.equals(this.f29923b.r())) {
                    P4.b.e();
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f29923b.i() + " to " + this.f29923b.r());
            }
            while (true) {
                if (this.f29927f != null && a()) {
                    this.f29929h = null;
                    while (!z10 && a()) {
                        List list = this.f29927f;
                        int i10 = this.f29928g;
                        this.f29928g = i10 + 1;
                        this.f29929h = ((B4.n) list.get(i10)).b(this.f29930i, this.f29923b.t(), this.f29923b.f(), this.f29923b.k());
                        if (this.f29929h != null && this.f29923b.u(this.f29929h.f752c.a())) {
                            this.f29929h.f752c.e(this.f29923b.l(), this);
                            z10 = true;
                        }
                    }
                    P4.b.e();
                    return z10;
                }
                int i11 = this.f29925d + 1;
                this.f29925d = i11;
                if (i11 >= m10.size()) {
                    int i12 = this.f29924c + 1;
                    this.f29924c = i12;
                    if (i12 >= c10.size()) {
                        P4.b.e();
                        return false;
                    }
                    this.f29925d = 0;
                }
                com.bumptech.glide.load.g gVar = (com.bumptech.glide.load.g) c10.get(this.f29924c);
                Class cls = (Class) m10.get(this.f29925d);
                this.f29931j = new x(this.f29923b.b(), gVar, this.f29923b.p(), this.f29923b.t(), this.f29923b.f(), this.f29923b.s(cls), cls, this.f29923b.k());
                File a10 = this.f29923b.d().a(this.f29931j);
                this.f29930i = a10;
                if (a10 != null) {
                    this.f29926e = gVar;
                    this.f29927f = this.f29923b.j(a10);
                    this.f29928g = 0;
                }
            }
        } catch (Throwable th2) {
            P4.b.e();
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f29922a.a(this.f29931j, exc, this.f29929h.f752c, com.bumptech.glide.load.a.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        n.a aVar = this.f29929h;
        if (aVar != null) {
            aVar.f752c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f29922a.e(this.f29926e, obj, this.f29929h.f752c, com.bumptech.glide.load.a.RESOURCE_DISK_CACHE, this.f29931j);
    }
}
