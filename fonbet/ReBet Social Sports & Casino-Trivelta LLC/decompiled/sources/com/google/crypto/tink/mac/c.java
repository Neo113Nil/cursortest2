package com.google.crypto.tink.mac;

import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.internal.l;
import com.google.crypto.tink.l;
import com.google.crypto.tink.proto.C3457a;
import com.google.crypto.tink.proto.C3458b;
import com.google.crypto.tink.proto.C3459c;
import com.google.crypto.tink.proto.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC3476h;
import com.google.crypto.tink.shaded.protobuf.C3484p;
import com.google.crypto.tink.t;
import com.google.crypto.tink.x;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c extends com.google.crypto.tink.internal.d {

    /* renamed from: d, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.l f37116d = com.google.crypto.tink.internal.l.b(new l.b() { // from class: com.google.crypto.tink.mac.b
        @Override // com.google.crypto.tink.internal.l.b
        public final Object a(com.google.crypto.tink.g gVar) {
            return new Za.b((a) gVar);
        }
    }, com.google.crypto.tink.mac.a.class, g.class);

    public class a extends com.google.crypto.tink.internal.m {
        public a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public t a(C3457a c3457a) {
            return new cb.o(new cb.m(c3457a.S().r()), c3457a.T().R());
        }
    }

    public class b extends d.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        public Map c() {
            HashMap hashMap = new HashMap();
            C3458b c3458b = (C3458b) C3458b.T().l(32).m((C3459c) C3459c.S().l(16).c()).c();
            l.b bVar = l.b.TINK;
            hashMap.put("AES_CMAC", new d.a.C0516a(c3458b, bVar));
            hashMap.put("AES256_CMAC", new d.a.C0516a((C3458b) C3458b.T().l(32).m((C3459c) C3459c.S().l(16).c()).c(), bVar));
            hashMap.put("AES256_CMAC_RAW", new d.a.C0516a((C3458b) C3458b.T().l(32).m((C3459c) C3459c.S().l(16).c()).c(), l.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C3457a a(C3458b c3458b) {
            return (C3457a) C3457a.V().n(0).l(AbstractC3476h.f(cb.p.c(c3458b.R()))).m(c3458b.S()).c();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C3458b d(AbstractC3476h abstractC3476h) {
            return C3458b.U(abstractC3476h, C3484p.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(C3458b c3458b) {
            c.q(c3458b.S());
            c.r(c3458b.R());
        }
    }

    public c() {
        super(C3457a.class, new a(t.class));
    }

    public static void o(boolean z10) {
        x.l(new c(), z10);
        f.c();
        com.google.crypto.tink.internal.h.c().d(f37116d);
    }

    public static void q(C3459c c3459c) {
        if (c3459c.R() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (c3459c.R() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    public static void r(int i10) {
        if (i10 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a f() {
        return new b(C3458b.class);
    }

    @Override // com.google.crypto.tink.internal.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int m() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C3457a h(AbstractC3476h abstractC3476h) {
        return C3457a.W(abstractC3476h, C3484p.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void j(C3457a c3457a) {
        cb.r.c(c3457a.U(), m());
        r(c3457a.S().size());
        q(c3457a.T());
    }
}
