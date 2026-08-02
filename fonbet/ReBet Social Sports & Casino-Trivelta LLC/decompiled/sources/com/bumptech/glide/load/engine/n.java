package com.bumptech.glide.load.engine;

import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes2.dex */
public class n implements com.bumptech.glide.load.g {

    /* renamed from: b, reason: collision with root package name */
    public final Object f29887b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29888c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29889d;

    /* renamed from: e, reason: collision with root package name */
    public final Class f29890e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f29891f;

    /* renamed from: g, reason: collision with root package name */
    public final com.bumptech.glide.load.g f29892g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f29893h;

    /* renamed from: i, reason: collision with root package name */
    public final com.bumptech.glide.load.j f29894i;

    /* renamed from: j, reason: collision with root package name */
    public int f29895j;

    public n(Object obj, com.bumptech.glide.load.g gVar, int i10, int i11, Map map, Class cls, Class cls2, com.bumptech.glide.load.j jVar) {
        this.f29887b = com.bumptech.glide.util.k.d(obj);
        this.f29892g = (com.bumptech.glide.load.g) com.bumptech.glide.util.k.e(gVar, "Signature must not be null");
        this.f29888c = i10;
        this.f29889d = i11;
        this.f29893h = (Map) com.bumptech.glide.util.k.d(map);
        this.f29890e = (Class) com.bumptech.glide.util.k.e(cls, "Resource class must not be null");
        this.f29891f = (Class) com.bumptech.glide.util.k.e(cls2, "Transcode class must not be null");
        this.f29894i = (com.bumptech.glide.load.j) com.bumptech.glide.util.k.d(jVar);
    }

    @Override // com.bumptech.glide.load.g
    public void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f29887b.equals(nVar.f29887b) && this.f29892g.equals(nVar.f29892g) && this.f29889d == nVar.f29889d && this.f29888c == nVar.f29888c && this.f29893h.equals(nVar.f29893h) && this.f29890e.equals(nVar.f29890e) && this.f29891f.equals(nVar.f29891f) && this.f29894i.equals(nVar.f29894i)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        if (this.f29895j == 0) {
            int hashCode = this.f29887b.hashCode();
            this.f29895j = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.f29892g.hashCode()) * 31) + this.f29888c) * 31) + this.f29889d;
            this.f29895j = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.f29893h.hashCode();
            this.f29895j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f29890e.hashCode();
            this.f29895j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f29891f.hashCode();
            this.f29895j = hashCode5;
            this.f29895j = (hashCode5 * 31) + this.f29894i.hashCode();
        }
        return this.f29895j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f29887b + ", width=" + this.f29888c + ", height=" + this.f29889d + ", resourceClass=" + this.f29890e + ", transcodeClass=" + this.f29891f + ", signature=" + this.f29892g + ", hashCode=" + this.f29895j + ", transformations=" + this.f29893h + ", options=" + this.f29894i + '}';
    }
}
