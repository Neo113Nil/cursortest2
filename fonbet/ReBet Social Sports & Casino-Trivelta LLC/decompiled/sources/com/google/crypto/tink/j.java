package com.google.crypto.tink;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f37097b = Logger.getLogger(j.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentMap f37098a;

    public class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.crypto.tink.internal.d f37099a;

        public a(com.google.crypto.tink.internal.d dVar) {
            this.f37099a = dVar;
        }

        @Override // com.google.crypto.tink.j.b
        public Class a() {
            return this.f37099a.getClass();
        }

        @Override // com.google.crypto.tink.j.b
        public Set b() {
            return this.f37099a.i();
        }

        @Override // com.google.crypto.tink.j.b
        public h c(Class cls) {
            try {
                return new i(this.f37099a, cls);
            } catch (IllegalArgumentException e10) {
                throw new GeneralSecurityException("Primitive type not supported", e10);
            }
        }

        @Override // com.google.crypto.tink.j.b
        public h d() {
            com.google.crypto.tink.internal.d dVar = this.f37099a;
            return new i(dVar, dVar.b());
        }
    }

    public interface b {
        Class a();

        Set b();

        h c(Class cls);

        h d();
    }

    public j(j jVar) {
        this.f37098a = new ConcurrentHashMap(jVar.f37098a);
    }

    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    public static b b(com.google.crypto.tink.internal.d dVar) {
        return new a(dVar);
    }

    public static String i(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(cls.getCanonicalName());
            z10 = false;
        }
        return sb2.toString();
    }

    public h c(String str, Class cls) {
        return e(str, (Class) a(cls));
    }

    public final synchronized b d(String str) {
        if (!this.f37098a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (b) this.f37098a.get(str);
    }

    public final h e(String str, Class cls) {
        b d10 = d(str);
        if (cls == null) {
            return d10.d();
        }
        if (d10.b().contains(cls)) {
            return d10.c(cls);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + d10.a() + ", supported primitives: " + i(d10.b()));
    }

    public h f(String str) {
        return d(str).d();
    }

    public synchronized void g(com.google.crypto.tink.internal.d dVar) {
        if (!dVar.a().a()) {
            throw new GeneralSecurityException("failed to register key manager " + dVar.getClass() + " as it is not FIPS compatible.");
        }
        h(b(dVar), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005c, code lost:
    
        r4.f37098a.putIfAbsent(r0, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void h(b bVar, boolean z10) {
        try {
            String b10 = bVar.d().b();
            b bVar2 = (b) this.f37098a.get(b10);
            if (bVar2 != null && !bVar2.a().equals(bVar.a())) {
                f37097b.warning("Attempted overwrite of a registered key manager for key type " + b10);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", b10, bVar2.a().getName(), bVar.a().getName()));
            }
            this.f37098a.put(b10, bVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public boolean j(String str) {
        return this.f37098a.containsKey(str);
    }

    public j() {
        this.f37098a = new ConcurrentHashMap();
    }
}
