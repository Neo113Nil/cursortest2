package com.google.crypto.tink.internal;

import com.google.crypto.tink.y;
import db.C4049a;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Map f37084a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f37085b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f37086c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f37087d;

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final Class f37092a;

        /* renamed from: b, reason: collision with root package name */
        public final C4049a f37093b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f37092a.equals(this.f37092a) && cVar.f37093b.equals(this.f37093b);
        }

        public int hashCode() {
            return Objects.hash(this.f37092a, this.f37093b);
        }

        public String toString() {
            return this.f37092a.getSimpleName() + ", object identifier: " + this.f37093b;
        }

        public c(Class cls, C4049a c4049a) {
            this.f37092a = cls;
            this.f37093b = c4049a;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final Class f37094a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f37095b;

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.f37094a.equals(this.f37094a) && dVar.f37095b.equals(this.f37095b);
        }

        public int hashCode() {
            return Objects.hash(this.f37094a, this.f37095b);
        }

        public String toString() {
            return this.f37094a.getSimpleName() + " with serialization type: " + this.f37095b.getSimpleName();
        }

        public d(Class cls, Class cls2) {
            this.f37094a = cls;
            this.f37095b = cls2;
        }
    }

    public boolean e(q qVar) {
        return this.f37085b.containsKey(new c(qVar.getClass(), qVar.a()));
    }

    public com.google.crypto.tink.g f(q qVar, y yVar) {
        c cVar = new c(qVar.getClass(), qVar.a());
        if (this.f37085b.containsKey(cVar)) {
            return ((com.google.crypto.tink.internal.b) this.f37085b.get(cVar)).d(qVar, yVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + cVar + " available");
    }

    public r(b bVar) {
        this.f37084a = new HashMap(bVar.f37088a);
        this.f37085b = new HashMap(bVar.f37089b);
        this.f37086c = new HashMap(bVar.f37090c);
        this.f37087d = new HashMap(bVar.f37091d);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Map f37088a;

        /* renamed from: b, reason: collision with root package name */
        public final Map f37089b;

        /* renamed from: c, reason: collision with root package name */
        public final Map f37090c;

        /* renamed from: d, reason: collision with root package name */
        public final Map f37091d;

        public b() {
            this.f37088a = new HashMap();
            this.f37089b = new HashMap();
            this.f37090c = new HashMap();
            this.f37091d = new HashMap();
        }

        public r e() {
            return new r(this);
        }

        public b f(com.google.crypto.tink.internal.b bVar) {
            c cVar = new c(bVar.c(), bVar.b());
            if (!this.f37089b.containsKey(cVar)) {
                this.f37089b.put(cVar, bVar);
                return this;
            }
            com.google.crypto.tink.internal.b bVar2 = (com.google.crypto.tink.internal.b) this.f37089b.get(cVar);
            if (bVar2.equals(bVar) && bVar.equals(bVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
        }

        public b g(com.google.crypto.tink.internal.c cVar) {
            d dVar = new d(cVar.b(), cVar.c());
            if (!this.f37088a.containsKey(dVar)) {
                this.f37088a.put(dVar, cVar);
                return this;
            }
            com.google.crypto.tink.internal.c cVar2 = (com.google.crypto.tink.internal.c) this.f37088a.get(dVar);
            if (cVar2.equals(cVar) && cVar.equals(cVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
        }

        public b h(j jVar) {
            c cVar = new c(jVar.c(), jVar.b());
            if (!this.f37091d.containsKey(cVar)) {
                this.f37091d.put(cVar, jVar);
                return this;
            }
            j jVar2 = (j) this.f37091d.get(cVar);
            if (jVar2.equals(jVar) && jVar.equals(jVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
        }

        public b i(k kVar) {
            d dVar = new d(kVar.b(), kVar.c());
            if (!this.f37090c.containsKey(dVar)) {
                this.f37090c.put(dVar, kVar);
                return this;
            }
            k kVar2 = (k) this.f37090c.get(dVar);
            if (kVar2.equals(kVar) && kVar.equals(kVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
        }

        public b(r rVar) {
            this.f37088a = new HashMap(rVar.f37084a);
            this.f37089b = new HashMap(rVar.f37085b);
            this.f37090c = new HashMap(rVar.f37086c);
            this.f37091d = new HashMap(rVar.f37087d);
        }
    }
}
