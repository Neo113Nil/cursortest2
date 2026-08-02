package com.google.crypto.tink;

import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.proto.A;
import com.google.crypto.tink.shaded.protobuf.AbstractC3476h;
import com.google.crypto.tink.shaded.protobuf.O;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f37508a = Logger.getLogger(x.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f37509b = new AtomicReference(new j());

    /* renamed from: c, reason: collision with root package name */
    public static final ConcurrentMap f37510c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentMap f37511d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentMap f37512e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final ConcurrentMap f37513f = new ConcurrentHashMap();

    public class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.crypto.tink.internal.d f37514a;

        public a(com.google.crypto.tink.internal.d dVar) {
            this.f37514a = dVar;
        }
    }

    public interface b {
    }

    public static b a(com.google.crypto.tink.internal.d dVar) {
        return new a(dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0052, code lost:
    
        r5 = (java.util.Map.Entry) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        if (com.google.crypto.tink.x.f37513f.containsKey(r5.getKey()) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0089, code lost:
    
        throw new java.security.GeneralSecurityException("Attempted to register a new key template " + ((java.lang.String) r5.getKey()) + " from an existing key manager of type " + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        r3 = r4.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0096, code lost:
    
        if (r3.hasNext() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0098, code lost:
    
        r4 = (java.util.Map.Entry) r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
    
        if (com.google.crypto.tink.x.f37513f.containsKey(r4.getKey()) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c7, code lost:
    
        throw new java.security.GeneralSecurityException("Attempted overwrite of a registered key template " + ((java.lang.String) r4.getKey()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0042, code lost:
    
        if (((com.google.crypto.tink.j) com.google.crypto.tink.x.f37509b.get()).j(r3) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0044, code lost:
    
        r4 = r4.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
    
        if (r4.hasNext() == false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized void b(String str, Map map, boolean z10) {
        synchronized (x.class) {
            if (z10) {
                try {
                    ConcurrentMap concurrentMap = f37511d;
                    if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
                        throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                    }
                } finally {
                }
            }
        }
    }

    public static Object c(g gVar, Class cls) {
        return com.google.crypto.tink.internal.h.c().b(gVar, cls);
    }

    public static Class d(Class cls) {
        try {
            return com.google.crypto.tink.internal.h.c().a(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static Object e(com.google.crypto.tink.proto.y yVar, Class cls) {
        return f(yVar.U(), yVar.V(), cls);
    }

    public static Object f(String str, AbstractC3476h abstractC3476h, Class cls) {
        return ((j) f37509b.get()).c(str, cls).c(abstractC3476h);
    }

    public static Object g(String str, byte[] bArr, Class cls) {
        return f(str, AbstractC3476h.f(bArr), cls);
    }

    public static h h(String str) {
        return ((j) f37509b.get()).f(str);
    }

    public static synchronized Map i() {
        Map unmodifiableMap;
        synchronized (x.class) {
            unmodifiableMap = Collections.unmodifiableMap(f37513f);
        }
        return unmodifiableMap;
    }

    public static synchronized O j(A a10) {
        O d10;
        synchronized (x.class) {
            h h10 = h(a10.U());
            if (!((Boolean) f37511d.get(a10.U())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + a10.U());
            }
            d10 = h10.d(a10.V());
        }
        return d10;
    }

    public static synchronized com.google.crypto.tink.proto.y k(A a10) {
        com.google.crypto.tink.proto.y a11;
        synchronized (x.class) {
            h h10 = h(a10.U());
            if (!((Boolean) f37511d.get(a10.U())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + a10.U());
            }
            a11 = h10.a(a10.V());
        }
        return a11;
    }

    public static synchronized void l(com.google.crypto.tink.internal.d dVar, boolean z10) {
        synchronized (x.class) {
            try {
                if (dVar == null) {
                    throw new IllegalArgumentException("key manager must be non-null.");
                }
                AtomicReference atomicReference = f37509b;
                j jVar = new j((j) atomicReference.get());
                jVar.g(dVar);
                String d10 = dVar.d();
                b(d10, z10 ? dVar.f().c() : Collections.EMPTY_MAP, z10);
                if (!((j) atomicReference.get()).j(d10)) {
                    f37510c.put(d10, a(dVar));
                    if (z10) {
                        m(d10, dVar.f().c());
                    }
                }
                f37511d.put(d10, Boolean.valueOf(z10));
                atomicReference.set(jVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void m(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            f37513f.put((String) entry.getKey(), l.a(str, ((O) ((d.a.C0516a) entry.getValue()).f37051a).toByteArray(), ((d.a.C0516a) entry.getValue()).f37052b));
        }
    }

    public static synchronized void n(w wVar) {
        synchronized (x.class) {
            com.google.crypto.tink.internal.h.c().e(wVar);
        }
    }

    public static Object o(v vVar, Class cls) {
        return com.google.crypto.tink.internal.h.c().f(vVar, cls);
    }
}
