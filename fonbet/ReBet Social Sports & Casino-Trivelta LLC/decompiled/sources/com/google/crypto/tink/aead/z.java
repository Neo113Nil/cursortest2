package com.google.crypto.tink.aead;

import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.l;
import com.google.crypto.tink.proto.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC3476h;
import com.google.crypto.tink.shaded.protobuf.C3484p;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class z extends com.google.crypto.tink.internal.d {

    public class a extends com.google.crypto.tink.internal.m {
        public a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public com.google.crypto.tink.a a(com.google.crypto.tink.proto.r rVar) {
            return new cb.g(rVar.R().r());
        }
    }

    public class b extends d.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        public Map c() {
            HashMap hashMap = new HashMap();
            hashMap.put("CHACHA20_POLY1305", new d.a.C0516a(com.google.crypto.tink.proto.s.P(), l.b.TINK));
            hashMap.put("CHACHA20_POLY1305_RAW", new d.a.C0516a(com.google.crypto.tink.proto.s.P(), l.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public com.google.crypto.tink.proto.r a(com.google.crypto.tink.proto.s sVar) {
            return (com.google.crypto.tink.proto.r) com.google.crypto.tink.proto.r.T().m(z.this.k()).l(AbstractC3476h.f(cb.p.c(32))).c();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public com.google.crypto.tink.proto.s d(AbstractC3476h abstractC3476h) {
            return com.google.crypto.tink.proto.s.Q(abstractC3476h, C3484p.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(com.google.crypto.tink.proto.s sVar) {
        }
    }

    public z() {
        super(com.google.crypto.tink.proto.r.class, new a(com.google.crypto.tink.a.class));
    }

    public static void m(boolean z10) {
        com.google.crypto.tink.x.l(new z(), z10);
        C.c();
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a f() {
        return new b(com.google.crypto.tink.proto.s.class);
    }

    @Override // com.google.crypto.tink.internal.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public com.google.crypto.tink.proto.r h(AbstractC3476h abstractC3476h) {
        return com.google.crypto.tink.proto.r.U(abstractC3476h, C3484p.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(com.google.crypto.tink.proto.r rVar) {
        cb.r.c(rVar.S(), k());
        if (rVar.R().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
