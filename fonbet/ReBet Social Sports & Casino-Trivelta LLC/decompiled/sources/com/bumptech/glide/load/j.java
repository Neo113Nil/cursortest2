package com.bumptech.glide.load;

import java.security.MessageDigest;
import z.C6900a;

/* loaded from: classes2.dex */
public final class j implements g {

    /* renamed from: b, reason: collision with root package name */
    public final C6900a f29968b = new com.bumptech.glide.util.b();

    public static void f(i iVar, Object obj, MessageDigest messageDigest) {
        iVar.g(obj, messageDigest);
    }

    @Override // com.bumptech.glide.load.g
    public void b(MessageDigest messageDigest) {
        for (int i10 = 0; i10 < this.f29968b.size(); i10++) {
            f((i) this.f29968b.f(i10), this.f29968b.j(i10), messageDigest);
        }
    }

    public Object c(i iVar) {
        return this.f29968b.containsKey(iVar) ? this.f29968b.get(iVar) : iVar.c();
    }

    public void d(j jVar) {
        this.f29968b.g(jVar.f29968b);
    }

    public j e(i iVar, Object obj) {
        this.f29968b.put(iVar, obj);
        return this;
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f29968b.equals(((j) obj).f29968b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return this.f29968b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f29968b + '}';
    }
}
