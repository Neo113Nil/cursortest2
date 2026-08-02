package com.bumptech.glide.load.engine;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class x implements com.bumptech.glide.load.g {

    /* renamed from: j, reason: collision with root package name */
    public static final com.bumptech.glide.util.h f29932j = new com.bumptech.glide.util.h(50);

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.b f29933b;

    /* renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.load.g f29934c;

    /* renamed from: d, reason: collision with root package name */
    public final com.bumptech.glide.load.g f29935d;

    /* renamed from: e, reason: collision with root package name */
    public final int f29936e;

    /* renamed from: f, reason: collision with root package name */
    public final int f29937f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f29938g;

    /* renamed from: h, reason: collision with root package name */
    public final com.bumptech.glide.load.j f29939h;

    /* renamed from: i, reason: collision with root package name */
    public final com.bumptech.glide.load.n f29940i;

    public x(com.bumptech.glide.load.engine.bitmap_recycle.b bVar, com.bumptech.glide.load.g gVar, com.bumptech.glide.load.g gVar2, int i10, int i11, com.bumptech.glide.load.n nVar, Class cls, com.bumptech.glide.load.j jVar) {
        this.f29933b = bVar;
        this.f29934c = gVar;
        this.f29935d = gVar2;
        this.f29936e = i10;
        this.f29937f = i11;
        this.f29940i = nVar;
        this.f29938g = cls;
        this.f29939h = jVar;
    }

    @Override // com.bumptech.glide.load.g
    public void b(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f29933b.d(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f29936e).putInt(this.f29937f).array();
        this.f29935d.b(messageDigest);
        this.f29934c.b(messageDigest);
        messageDigest.update(bArr);
        com.bumptech.glide.load.n nVar = this.f29940i;
        if (nVar != null) {
            nVar.b(messageDigest);
        }
        this.f29939h.b(messageDigest);
        messageDigest.update(c());
        this.f29933b.put(bArr);
    }

    public final byte[] c() {
        com.bumptech.glide.util.h hVar = f29932j;
        byte[] bArr = (byte[]) hVar.g(this.f29938g);
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f29938g.getName().getBytes(com.bumptech.glide.load.g.f29962a);
        hVar.k(this.f29938g, bytes);
        return bytes;
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f29937f == xVar.f29937f && this.f29936e == xVar.f29936e && com.bumptech.glide.util.l.e(this.f29940i, xVar.f29940i) && this.f29938g.equals(xVar.f29938g) && this.f29934c.equals(xVar.f29934c) && this.f29935d.equals(xVar.f29935d) && this.f29939h.equals(xVar.f29939h)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        int hashCode = (((((this.f29934c.hashCode() * 31) + this.f29935d.hashCode()) * 31) + this.f29936e) * 31) + this.f29937f;
        com.bumptech.glide.load.n nVar = this.f29940i;
        if (nVar != null) {
            hashCode = (hashCode * 31) + nVar.hashCode();
        }
        return (((hashCode * 31) + this.f29938g.hashCode()) * 31) + this.f29939h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f29934c + ", signature=" + this.f29935d + ", width=" + this.f29936e + ", height=" + this.f29937f + ", decodedResourceClass=" + this.f29938g + ", transformation='" + this.f29940i + "', options=" + this.f29939h + '}';
    }
}
