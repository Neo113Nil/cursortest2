package com.bumptech.glide.load.engine;

import B4.n;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.f;
import java.io.File;
import java.util.List;

/* loaded from: classes2.dex */
public class c implements f, d.a {

    /* renamed from: a, reason: collision with root package name */
    public final List f29737a;

    /* renamed from: b, reason: collision with root package name */
    public final g f29738b;

    /* renamed from: c, reason: collision with root package name */
    public final f.a f29739c;

    /* renamed from: d, reason: collision with root package name */
    public int f29740d;

    /* renamed from: e, reason: collision with root package name */
    public com.bumptech.glide.load.g f29741e;

    /* renamed from: f, reason: collision with root package name */
    public List f29742f;

    /* renamed from: g, reason: collision with root package name */
    public int f29743g;

    /* renamed from: h, reason: collision with root package name */
    public volatile n.a f29744h;

    /* renamed from: i, reason: collision with root package name */
    public File f29745i;

    public c(g gVar, f.a aVar) {
        this(gVar.c(), gVar, aVar);
    }

    public final boolean a() {
        return this.f29743g < this.f29742f.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r2 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        if (a() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001d, code lost:
    
        r0 = r7.f29742f;
        r3 = r7.f29743g;
        r7.f29743g = r3 + 1;
        r7.f29744h = ((B4.n) r0.get(r3)).b(r7.f29745i, r7.f29738b.t(), r7.f29738b.f(), r7.f29738b.k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r7.f29744h == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (r7.f29738b.u(r7.f29744h.f752c.a()) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        r7.f29744h.f752c.e(r7.f29738b.l(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
    
        r7.f29744h = null;
     */
    @Override // com.bumptech.glide.load.engine.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b() {
        P4.b.a("DataCacheGenerator.startNext");
        while (true) {
            try {
                boolean z10 = false;
                if (this.f29742f != null && a()) {
                    break;
                }
                int i10 = this.f29740d + 1;
                this.f29740d = i10;
                if (i10 >= this.f29737a.size()) {
                    return false;
                }
                com.bumptech.glide.load.g gVar = (com.bumptech.glide.load.g) this.f29737a.get(this.f29740d);
                File a10 = this.f29738b.d().a(new d(gVar, this.f29738b.p()));
                this.f29745i = a10;
                if (a10 != null) {
                    this.f29741e = gVar;
                    this.f29742f = this.f29738b.j(a10);
                    this.f29743g = 0;
                }
            } finally {
                P4.b.e();
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f29739c.a(this.f29741e, exc, this.f29744h.f752c, com.bumptech.glide.load.a.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        n.a aVar = this.f29744h;
        if (aVar != null) {
            aVar.f752c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f29739c.e(this.f29741e, obj, this.f29744h.f752c, com.bumptech.glide.load.a.DATA_DISK_CACHE, this.f29741e);
    }

    public c(List list, g gVar, f.a aVar) {
        this.f29740d = -1;
        this.f29737a = list;
        this.f29738b = gVar;
        this.f29739c = aVar;
    }
}
