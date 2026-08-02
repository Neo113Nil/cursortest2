package com.google.crypto.tink;

import ab.C1928a;
import com.google.crypto.tink.proto.C;
import com.google.crypto.tink.proto.I;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentMap f37492a;

    /* renamed from: b, reason: collision with root package name */
    public c f37493b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f37494c;

    /* renamed from: d, reason: collision with root package name */
    public final C1928a f37495d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f37496e;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Class f37497a;

        /* renamed from: b, reason: collision with root package name */
        public ConcurrentMap f37498b;

        /* renamed from: c, reason: collision with root package name */
        public c f37499c;

        /* renamed from: d, reason: collision with root package name */
        public C1928a f37500d;

        public b a(Object obj, Object obj2, C.c cVar) {
            return c(obj, obj2, cVar, false);
        }

        public b b(Object obj, Object obj2, C.c cVar) {
            return c(obj, obj2, cVar, true);
        }

        public final b c(Object obj, Object obj2, C.c cVar, boolean z10) {
            if (this.f37498b == null) {
                throw new IllegalStateException("addPrimitive cannot be called after build");
            }
            if (obj == null && obj2 == null) {
                throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
            }
            if (cVar.W() != com.google.crypto.tink.proto.z.ENABLED) {
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
            c b10 = v.b(obj, obj2, cVar, this.f37498b);
            if (!z10) {
                return this;
            }
            if (this.f37499c != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.f37499c = b10;
            return this;
        }

        public v d() {
            ConcurrentMap concurrentMap = this.f37498b;
            if (concurrentMap == null) {
                throw new IllegalStateException("build cannot be called twice");
            }
            v vVar = new v(concurrentMap, this.f37499c, this.f37500d, this.f37497a);
            this.f37498b = null;
            return vVar;
        }

        public b e(C1928a c1928a) {
            if (this.f37498b == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build");
            }
            this.f37500d = c1928a;
            return this;
        }

        public b(Class cls) {
            this.f37498b = new ConcurrentHashMap();
            this.f37497a = cls;
            this.f37500d = C1928a.f15108b;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Object f37501a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f37502b;

        /* renamed from: c, reason: collision with root package name */
        public final com.google.crypto.tink.proto.z f37503c;

        /* renamed from: d, reason: collision with root package name */
        public final I f37504d;

        /* renamed from: e, reason: collision with root package name */
        public final int f37505e;

        /* renamed from: f, reason: collision with root package name */
        public final String f37506f;

        /* renamed from: g, reason: collision with root package name */
        public final g f37507g;
        private final byte[] identifier;

        public c(Object obj, Object obj2, byte[] bArr, com.google.crypto.tink.proto.z zVar, I i10, int i11, String str, g gVar) {
            this.f37501a = obj;
            this.f37502b = obj2;
            this.identifier = Arrays.copyOf(bArr, bArr.length);
            this.f37503c = zVar;
            this.f37504d = i10;
            this.f37505e = i11;
            this.f37506f = str;
            this.f37507g = gVar;
        }

        public Object a() {
            return this.f37501a;
        }

        public final byte[] b() {
            byte[] bArr = this.identifier;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }

        public g c() {
            return this.f37507g;
        }

        public int d() {
            return this.f37505e;
        }

        public String e() {
            return this.f37506f;
        }

        public I f() {
            return this.f37504d;
        }

        public Object g() {
            return this.f37502b;
        }

        public com.google.crypto.tink.proto.z h() {
            return this.f37503c;
        }
    }

    public static class d implements Comparable {
        private final byte[] prefix;

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            byte[] bArr = this.prefix;
            int length = bArr.length;
            byte[] bArr2 = dVar.prefix;
            if (length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            int i10 = 0;
            while (true) {
                byte[] bArr3 = this.prefix;
                if (i10 >= bArr3.length) {
                    return 0;
                }
                byte b10 = bArr3[i10];
                byte b11 = dVar.prefix[i10];
                if (b10 != b11) {
                    return b10 - b11;
                }
                i10++;
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return Arrays.equals(this.prefix, ((d) obj).prefix);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.prefix);
        }

        public String toString() {
            return cb.k.b(this.prefix);
        }

        public d(byte[] bArr) {
            this.prefix = Arrays.copyOf(bArr, bArr.length);
        }
    }

    public static c b(Object obj, Object obj2, C.c cVar, ConcurrentMap concurrentMap) {
        Integer valueOf = Integer.valueOf(cVar.U());
        if (cVar.V() == I.RAW) {
            valueOf = null;
        }
        c cVar2 = new c(obj, obj2, com.google.crypto.tink.d.a(cVar), cVar.W(), cVar.V(), cVar.U(), cVar.T().U(), com.google.crypto.tink.internal.i.a().d(com.google.crypto.tink.internal.o.b(cVar.T().U(), cVar.T().V(), cVar.T().T(), cVar.V(), valueOf), f.a()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar2);
        d dVar = new d(cVar2.b());
        List list = (List) concurrentMap.put(dVar, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(cVar2);
            concurrentMap.put(dVar, Collections.unmodifiableList(arrayList2));
        }
        return cVar2;
    }

    public static b j(Class cls) {
        return new b(cls);
    }

    public Collection c() {
        return this.f37492a.values();
    }

    public C1928a d() {
        return this.f37495d;
    }

    public c e() {
        return this.f37493b;
    }

    public List f(byte[] bArr) {
        List list = (List) this.f37492a.get(new d(bArr));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public Class g() {
        return this.f37494c;
    }

    public List h() {
        return f(com.google.crypto.tink.d.RAW_PREFIX);
    }

    public boolean i() {
        return !this.f37495d.b().isEmpty();
    }

    public v(ConcurrentMap concurrentMap, c cVar, C1928a c1928a, Class cls) {
        this.f37492a = concurrentMap;
        this.f37493b = cVar;
        this.f37494c = cls;
        this.f37495d = c1928a;
        this.f37496e = false;
    }
}
