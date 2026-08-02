package com.google.crypto.tink.internal;

import com.google.crypto.tink.v;
import com.google.crypto.tink.w;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final Map f37072a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f37073b;

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Class f37076a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f37077b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f37076a.equals(this.f37076a) && cVar.f37077b.equals(this.f37077b);
        }

        public int hashCode() {
            return Objects.hash(this.f37076a, this.f37077b);
        }

        public String toString() {
            return this.f37076a.getSimpleName() + " with primitive type: " + this.f37077b.getSimpleName();
        }

        public c(Class cls, Class cls2) {
            this.f37076a = cls;
            this.f37077b = cls2;
        }
    }

    public Class c(Class cls) {
        if (this.f37073b.containsKey(cls)) {
            return ((w) this.f37073b.get(cls)).b();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    public Object d(com.google.crypto.tink.g gVar, Class cls) {
        c cVar = new c(gVar.getClass(), cls);
        if (this.f37072a.containsKey(cVar)) {
            return ((l) this.f37072a.get(cVar)).a(gVar);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + cVar + " available");
    }

    public Object e(v vVar, Class cls) {
        if (!this.f37073b.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for " + cls);
        }
        w wVar = (w) this.f37073b.get(cls);
        if (vVar.g().equals(wVar.b()) && wVar.b().equals(vVar.g())) {
            return wVar.a(vVar);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }

    public n(b bVar) {
        this.f37072a = new HashMap(bVar.f37074a);
        this.f37073b = new HashMap(bVar.f37075b);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Map f37074a;

        /* renamed from: b, reason: collision with root package name */
        public final Map f37075b;

        public b() {
            this.f37074a = new HashMap();
            this.f37075b = new HashMap();
        }

        public n c() {
            return new n(this);
        }

        public b d(l lVar) {
            if (lVar == null) {
                throw new NullPointerException("primitive constructor must be non-null");
            }
            c cVar = new c(lVar.c(), lVar.d());
            if (!this.f37074a.containsKey(cVar)) {
                this.f37074a.put(cVar, lVar);
                return this;
            }
            l lVar2 = (l) this.f37074a.get(cVar);
            if (lVar2.equals(lVar) && lVar.equals(lVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + cVar);
        }

        public b e(w wVar) {
            if (wVar == null) {
                throw new NullPointerException("wrapper must be non-null");
            }
            Class c10 = wVar.c();
            if (!this.f37075b.containsKey(c10)) {
                this.f37075b.put(c10, wVar);
                return this;
            }
            w wVar2 = (w) this.f37075b.get(c10);
            if (wVar2.equals(wVar) && wVar.equals(wVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + c10);
        }

        public b(n nVar) {
            this.f37074a = new HashMap(nVar.f37072a);
            this.f37075b = new HashMap(nVar.f37073b);
        }
    }
}
