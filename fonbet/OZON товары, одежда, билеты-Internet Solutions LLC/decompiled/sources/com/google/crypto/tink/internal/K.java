package com.google.crypto.tink.internal;

import j8.C7306a;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f59240a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f59241b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f59242c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f59243d;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Class<? extends J> f59248a;

        /* renamed from: b, reason: collision with root package name */
        private final C7306a f59249b;

        private b() {
            throw null;
        }

        b(Class cls, C7306a c7306a) {
            this.f59248a = cls;
            this.f59249b = c7306a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.f59248a.equals(this.f59248a) && bVar.f59249b.equals(this.f59249b);
        }

        public final int hashCode() {
            return Objects.hash(this.f59248a, this.f59249b);
        }

        public final String toString() {
            return this.f59248a.getSimpleName() + ", object identifier: " + this.f59249b;
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private final Class<?> f59250a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<? extends J> f59251b;

        private c() {
            throw null;
        }

        c(Class cls, Class cls2) {
            this.f59250a = cls;
            this.f59251b = cls2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f59250a.equals(this.f59250a) && cVar.f59251b.equals(this.f59251b);
        }

        public final int hashCode() {
            return Objects.hash(this.f59250a, this.f59251b);
        }

        public final String toString() {
            return this.f59250a.getSimpleName() + " with serialization type: " + this.f59251b.getSimpleName();
        }
    }

    K(a aVar) {
        this.f59240a = new HashMap(aVar.f59244a);
        this.f59241b = new HashMap(aVar.f59245b);
        this.f59242c = new HashMap(aVar.f59246c);
        this.f59243d = new HashMap(aVar.f59247d);
    }

    public final boolean e(F f7) {
        return this.f59241b.containsKey(new b(F.class, f7.d()));
    }

    public final boolean f(G g10) {
        return this.f59243d.containsKey(new b(G.class, g10.d()));
    }

    public final He.g g(F f7, S7.r rVar) throws GeneralSecurityException {
        b bVar = new b(f7.getClass(), f7.d());
        HashMap hashMap = this.f59241b;
        if (hashMap.containsKey(bVar)) {
            return ((AbstractC5887f) hashMap.get(bVar)).d(f7, rVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + bVar + " available");
    }

    public final S7.q h(G g10) throws GeneralSecurityException {
        b bVar = new b(G.class, g10.d());
        HashMap hashMap = this.f59243d;
        if (hashMap.containsKey(bVar)) {
            return ((x) hashMap.get(bVar)).d(g10);
        }
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + bVar + " available");
    }

    public final J i(He.g gVar, S7.r rVar) throws GeneralSecurityException {
        c cVar = new c(gVar.getClass(), F.class);
        HashMap hashMap = this.f59240a;
        if (hashMap.containsKey(cVar)) {
            return ((AbstractC5889h) hashMap.get(cVar)).d(gVar, rVar);
        }
        throw new GeneralSecurityException("No Key serializer for " + cVar + " available");
    }

    public final J j(S7.q qVar) throws GeneralSecurityException {
        c cVar = new c(qVar.getClass(), G.class);
        HashMap hashMap = this.f59242c;
        if (hashMap.containsKey(cVar)) {
            return ((z) hashMap.get(cVar)).d(qVar);
        }
        throw new GeneralSecurityException("No Key Format serializer for " + cVar + " available");
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f59244a;

        /* renamed from: b, reason: collision with root package name */
        private final HashMap f59245b;

        /* renamed from: c, reason: collision with root package name */
        private final HashMap f59246c;

        /* renamed from: d, reason: collision with root package name */
        private final HashMap f59247d;

        public a() {
            this.f59244a = new HashMap();
            this.f59245b = new HashMap();
            this.f59246c = new HashMap();
            this.f59247d = new HashMap();
        }

        public final void e(AbstractC5887f abstractC5887f) throws GeneralSecurityException {
            b bVar = new b(abstractC5887f.c(), abstractC5887f.b());
            HashMap hashMap = this.f59245b;
            if (!hashMap.containsKey(bVar)) {
                hashMap.put(bVar, abstractC5887f);
                return;
            }
            AbstractC5887f abstractC5887f2 = (AbstractC5887f) hashMap.get(bVar);
            if (abstractC5887f2.equals(abstractC5887f) && abstractC5887f.equals(abstractC5887f2)) {
                return;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + bVar);
        }

        public final void f(AbstractC5889h abstractC5889h) throws GeneralSecurityException {
            c cVar = new c(abstractC5889h.b(), abstractC5889h.c());
            HashMap hashMap = this.f59244a;
            if (!hashMap.containsKey(cVar)) {
                hashMap.put(cVar, abstractC5889h);
                return;
            }
            AbstractC5889h abstractC5889h2 = (AbstractC5889h) hashMap.get(cVar);
            if (abstractC5889h2.equals(abstractC5889h) && abstractC5889h.equals(abstractC5889h2)) {
                return;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + cVar);
        }

        public final void g(x xVar) throws GeneralSecurityException {
            b bVar = new b(xVar.c(), xVar.b());
            HashMap hashMap = this.f59247d;
            if (!hashMap.containsKey(bVar)) {
                hashMap.put(bVar, xVar);
                return;
            }
            x xVar2 = (x) hashMap.get(bVar);
            if (xVar2.equals(xVar) && xVar.equals(xVar2)) {
                return;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + bVar);
        }

        public final void h(z zVar) throws GeneralSecurityException {
            c cVar = new c(zVar.b(), zVar.c());
            HashMap hashMap = this.f59246c;
            if (!hashMap.containsKey(cVar)) {
                hashMap.put(cVar, zVar);
                return;
            }
            z zVar2 = (z) hashMap.get(cVar);
            if (zVar2.equals(zVar) && zVar.equals(zVar2)) {
                return;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + cVar);
        }

        public a(K k11) {
            this.f59244a = new HashMap(k11.f59240a);
            this.f59245b = new HashMap(k11.f59241b);
            this.f59246c = new HashMap(k11.f59242c);
            this.f59247d = new HashMap(k11.f59243d);
        }
    }
}
