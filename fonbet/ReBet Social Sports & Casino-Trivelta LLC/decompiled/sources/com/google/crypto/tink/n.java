package com.google.crypto.tink;

import ab.C1928a;
import com.google.crypto.tink.proto.C;
import com.google.crypto.tink.proto.D;
import com.google.crypto.tink.proto.I;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.AbstractC3476h;
import com.google.crypto.tink.shaded.protobuf.C3484p;
import com.google.crypto.tink.v;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final C f37178a;

    /* renamed from: b, reason: collision with root package name */
    public final List f37179b;

    /* renamed from: c, reason: collision with root package name */
    public final C1928a f37180c = C1928a.f15108b;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$KeyStatusType;

        static {
            int[] iArr = new int[com.google.crypto.tink.proto.z.values().length];
            $SwitchMap$com$google$crypto$tink$proto$KeyStatusType = iArr;
            try {
                iArr[com.google.crypto.tink.proto.z.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$KeyStatusType[com.google.crypto.tink.proto.z.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$KeyStatusType[com.google.crypto.tink.proto.z.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final g f37181a;

        /* renamed from: b, reason: collision with root package name */
        public final k f37182b;

        /* renamed from: c, reason: collision with root package name */
        public final int f37183c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f37184d;

        public /* synthetic */ b(g gVar, k kVar, int i10, boolean z10, a aVar) {
            this(gVar, kVar, i10, z10);
        }

        public g a() {
            return this.f37181a;
        }

        public b(g gVar, k kVar, int i10, boolean z10) {
            this.f37181a = gVar;
            this.f37182b = kVar;
            this.f37183c = i10;
            this.f37184d = z10;
        }
    }

    public n(C c10, List list) {
        this.f37178a = c10;
        this.f37179b = list;
    }

    public static void a(com.google.crypto.tink.proto.t tVar) {
        if (tVar == null || tVar.R().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public static void b(C c10) {
        if (c10 == null || c10.U() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public static C c(com.google.crypto.tink.proto.t tVar, com.google.crypto.tink.a aVar, byte[] bArr) {
        try {
            C Z10 = C.Z(aVar.b(tVar.R().r(), bArr), C3484p.b());
            b(Z10);
            return Z10;
        } catch (A unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public static com.google.crypto.tink.proto.t d(C c10, com.google.crypto.tink.a aVar, byte[] bArr) {
        byte[] a10 = aVar.a(c10.toByteArray(), bArr);
        try {
            if (C.Z(aVar.b(a10, bArr), C3484p.b()).equals(c10)) {
                return (com.google.crypto.tink.proto.t) com.google.crypto.tink.proto.t.S().l(AbstractC3476h.f(a10)).m(z.b(c10)).c();
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (A unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public static final n e(C c10) {
        b(c10);
        return new n(c10, f(c10));
    }

    public static List f(C c10) {
        ArrayList arrayList = new ArrayList(c10.U());
        for (C.c cVar : c10.V()) {
            int U10 = cVar.U();
            try {
                arrayList.add(new b(com.google.crypto.tink.internal.i.a().d(q(cVar), f.a()), m(cVar.W()), U10, U10 == c10.W(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static Object j(C.c cVar, Class cls) {
        try {
            return x.e(cVar.T(), cls);
        } catch (GeneralSecurityException e10) {
            if (e10.getMessage().contains("No key manager found for key type ") || e10.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e10;
        }
    }

    public static k m(com.google.crypto.tink.proto.z zVar) {
        int i10 = a.$SwitchMap$com$google$crypto$tink$proto$KeyStatusType[zVar.ordinal()];
        if (i10 == 1) {
            return k.f37100b;
        }
        if (i10 == 2) {
            return k.f37101c;
        }
        if (i10 == 3) {
            return k.f37102d;
        }
        throw new GeneralSecurityException("Unknown key status");
    }

    public static final n n(p pVar, com.google.crypto.tink.a aVar) {
        return o(pVar, aVar, new byte[0]);
    }

    public static final n o(p pVar, com.google.crypto.tink.a aVar, byte[] bArr) {
        com.google.crypto.tink.proto.t a10 = pVar.a();
        a(a10);
        return e(c(a10, aVar, bArr));
    }

    public static com.google.crypto.tink.internal.o q(C.c cVar) {
        try {
            return com.google.crypto.tink.internal.o.b(cVar.T().U(), cVar.T().V(), cVar.T().T(), cVar.V(), cVar.V() == I.RAW ? null : Integer.valueOf(cVar.U()));
        } catch (GeneralSecurityException e10) {
            throw new com.google.crypto.tink.internal.s("Creating a protokey serialization failed", e10);
        }
    }

    public final Object g(g gVar, Class cls) {
        try {
            return x.c(gVar, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public C h() {
        return this.f37178a;
    }

    public D i() {
        return z.b(this.f37178a);
    }

    public Object k(Class cls) {
        Class d10 = x.d(cls);
        if (d10 != null) {
            return l(cls, d10);
        }
        throw new GeneralSecurityException("No wrapper found for " + cls.getName());
    }

    public final Object l(Class cls, Class cls2) {
        z.d(this.f37178a);
        v.b j10 = v.j(cls2);
        j10.e(this.f37180c);
        for (int i10 = 0; i10 < p(); i10++) {
            C.c T10 = this.f37178a.T(i10);
            if (T10.W().equals(com.google.crypto.tink.proto.z.ENABLED)) {
                Object j11 = j(T10, cls2);
                Object g10 = this.f37179b.get(i10) != null ? g(((b) this.f37179b.get(i10)).a(), cls2) : null;
                if (T10.U() == this.f37178a.W()) {
                    j10.b(g10, j11, T10);
                } else {
                    j10.a(g10, j11, T10);
                }
            }
        }
        return x.o(j10.d(), cls);
    }

    public int p() {
        return this.f37178a.U();
    }

    public void r(q qVar, com.google.crypto.tink.a aVar) {
        s(qVar, aVar, new byte[0]);
    }

    public void s(q qVar, com.google.crypto.tink.a aVar, byte[] bArr) {
        qVar.b(d(this.f37178a, aVar, bArr));
    }

    public String toString() {
        return i().toString();
    }
}
