package com.bumptech.glide.load.engine;

import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class d implements com.bumptech.glide.load.g {

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.g f29746b;

    /* renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.load.g f29747c;

    public d(com.bumptech.glide.load.g gVar, com.bumptech.glide.load.g gVar2) {
        this.f29746b = gVar;
        this.f29747c = gVar2;
    }

    @Override // com.bumptech.glide.load.g
    public void b(MessageDigest messageDigest) {
        this.f29746b.b(messageDigest);
        this.f29747c.b(messageDigest);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f29746b.equals(dVar.f29746b) && this.f29747c.equals(dVar.f29747c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return (this.f29746b.hashCode() * 31) + this.f29747c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f29746b + ", signature=" + this.f29747c + '}';
    }
}
