package com.bumptech.glide.util;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public Class f30155a;

    /* renamed from: b, reason: collision with root package name */
    public Class f30156b;

    /* renamed from: c, reason: collision with root package name */
    public Class f30157c;

    public j() {
    }

    public void a(Class cls, Class cls2, Class cls3) {
        this.f30155a = cls;
        this.f30156b = cls2;
        this.f30157c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f30155a.equals(jVar.f30155a) && this.f30156b.equals(jVar.f30156b) && l.e(this.f30157c, jVar.f30157c);
    }

    public int hashCode() {
        int hashCode = ((this.f30155a.hashCode() * 31) + this.f30156b.hashCode()) * 31;
        Class cls = this.f30157c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f30155a + ", second=" + this.f30156b + '}';
    }

    public j(Class cls, Class cls2, Class cls3) {
        a(cls, cls2, cls3);
    }
}
