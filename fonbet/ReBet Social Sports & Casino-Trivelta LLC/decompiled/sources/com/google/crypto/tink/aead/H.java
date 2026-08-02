package com.google.crypto.tink.aead;

import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.l;
import com.google.crypto.tink.proto.L;
import com.google.crypto.tink.proto.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC3476h;
import com.google.crypto.tink.shaded.protobuf.C3484p;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class H extends com.google.crypto.tink.internal.d {

    public class a extends com.google.crypto.tink.internal.m {
        public a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public com.google.crypto.tink.a a(com.google.crypto.tink.proto.K k10) {
            return new cb.s(k10.R().r());
        }
    }

    public class b extends d.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        public Map c() {
            HashMap hashMap = new HashMap();
            hashMap.put("XCHACHA20_POLY1305", new d.a.C0516a(L.P(), l.b.TINK));
            hashMap.put("XCHACHA20_POLY1305_RAW", new d.a.C0516a(L.P(), l.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public com.google.crypto.tink.proto.K a(L l10) {
            return (com.google.crypto.tink.proto.K) com.google.crypto.tink.proto.K.T().m(H.this.k()).l(AbstractC3476h.f(cb.p.c(32))).c();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public L d(AbstractC3476h abstractC3476h) {
            return L.Q(abstractC3476h, C3484p.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(L l10) {
        }
    }

    public H() {
        super(com.google.crypto.tink.proto.K.class, new a(com.google.crypto.tink.a.class));
    }

    public static void m(boolean z10) {
        com.google.crypto.tink.x.l(new H(), z10);
        K.c();
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a f() {
        return new b(L.class);
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
    public com.google.crypto.tink.proto.K h(AbstractC3476h abstractC3476h) {
        return com.google.crypto.tink.proto.K.U(abstractC3476h, C3484p.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(com.google.crypto.tink.proto.K k10) {
        cb.r.c(k10.S(), k());
        if (k10.R().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
