package com.google.crypto.tink.aead;

import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.proto.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC3476h;
import com.google.crypto.tink.shaded.protobuf.C3484p;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public class F extends com.google.crypto.tink.internal.d {

    public class a extends com.google.crypto.tink.internal.m {
        public a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public com.google.crypto.tink.a a(com.google.crypto.tink.proto.G g10) {
            String R10 = g10.R().R();
            return new E(g10.R().Q(), com.google.crypto.tink.s.a(R10).b(R10));
        }
    }

    public class b extends d.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public com.google.crypto.tink.proto.G a(com.google.crypto.tink.proto.H h10) {
            return (com.google.crypto.tink.proto.G) com.google.crypto.tink.proto.G.T().l(h10).m(F.this.k()).c();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public com.google.crypto.tink.proto.H d(AbstractC3476h abstractC3476h) {
            return com.google.crypto.tink.proto.H.T(abstractC3476h, C3484p.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(com.google.crypto.tink.proto.H h10) {
            if (h10.R().isEmpty() || !h10.S()) {
                throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
            }
        }
    }

    public F() {
        super(com.google.crypto.tink.proto.G.class, new a(com.google.crypto.tink.a.class));
    }

    public static void m(boolean z10) {
        com.google.crypto.tink.x.l(new F(), z10);
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a f() {
        return new b(com.google.crypto.tink.proto.H.class);
    }

    @Override // com.google.crypto.tink.internal.d
    public y.c g() {
        return y.c.REMOTE;
    }

    public int k() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public com.google.crypto.tink.proto.G h(AbstractC3476h abstractC3476h) {
        return com.google.crypto.tink.proto.G.U(abstractC3476h, C3484p.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(com.google.crypto.tink.proto.G g10) {
        cb.r.c(g10.S(), k());
    }
}
