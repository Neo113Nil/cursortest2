package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f59221a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f59222b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f59223c = false;

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Class<?> f59226a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<?> f59227b;

        private b() {
            throw null;
        }

        b(Class cls, Class cls2) {
            this.f59226a = cls;
            this.f59227b = cls2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.f59226a.equals(this.f59226a) && bVar.f59227b.equals(this.f59227b);
        }

        public final int hashCode() {
            return Objects.hash(this.f59226a, this.f59227b);
        }

        public final String toString() {
            return this.f59226a.getSimpleName() + " with primitive type: " + this.f59227b.getSimpleName();
        }
    }

    D(a aVar) {
        this.f59221a = new HashMap(aVar.f59224a);
        this.f59222b = new HashMap(aVar.f59225b);
    }

    private <KeyT extends He.g, PrimitiveT> PrimitiveT d(KeyT keyt, Class<PrimitiveT> cls) throws GeneralSecurityException {
        b bVar = new b(keyt.getClass(), cls);
        HashMap hashMap = this.f59221a;
        if (hashMap.containsKey(bVar)) {
            return (PrimitiveT) ((B) hashMap.get(bVar)).a(keyt);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + bVar + " available, see https://developers.google.com/tink/faq/registration_errors");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <KeyT extends He.g, PrimitiveT> PrimitiveT c(KeyT keyt, Class<PrimitiveT> cls) throws GeneralSecurityException {
        return (this.f59223c && (keyt instanceof C5891j)) ? (PrimitiveT) d(u.a().b(((C5891j) keyt).f(S7.e.a()), S7.e.a()), cls) : (PrimitiveT) d(keyt, cls);
    }

    public final Object e(S7.j jVar, C5893l c5893l, Class cls) throws GeneralSecurityException {
        HashMap hashMap = this.f59222b;
        if (!hashMap.containsKey(cls)) {
            throw new GeneralSecurityException(U7.m.a(cls, "No wrapper found for "));
        }
        E e11 = (E) hashMap.get(cls);
        return e11.c(jVar, c5893l, new C(this, e11));
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f59224a;

        /* renamed from: b, reason: collision with root package name */
        private final HashMap f59225b;

        a() {
            this.f59224a = new HashMap();
            this.f59225b = new HashMap();
        }

        public final void c(B b11) throws GeneralSecurityException {
            if (b11 == null) {
                throw new NullPointerException("primitive constructor must be non-null");
            }
            b bVar = new b(b11.c(), b11.d());
            HashMap hashMap = this.f59224a;
            if (!hashMap.containsKey(bVar)) {
                hashMap.put(bVar, b11);
                return;
            }
            B b12 = (B) hashMap.get(bVar);
            if (b12.equals(b11) && b11.equals(b12)) {
                return;
            }
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + bVar);
        }

        public final void d(E e11) throws GeneralSecurityException {
            Class a11 = e11.a();
            HashMap hashMap = this.f59225b;
            if (!hashMap.containsKey(a11)) {
                hashMap.put(a11, e11);
                return;
            }
            E e12 = (E) hashMap.get(a11);
            if (!e12.equals(e11) || !e11.equals(e12)) {
                throw new GeneralSecurityException(U7.m.a(a11, "Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type"));
            }
        }

        a(D d11) {
            this.f59224a = new HashMap(d11.f59221a);
            this.f59225b = new HashMap(d11.f59222b);
        }
    }
}
