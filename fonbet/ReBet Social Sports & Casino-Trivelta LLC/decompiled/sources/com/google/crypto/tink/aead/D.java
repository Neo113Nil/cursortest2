package com.google.crypto.tink.aead;

import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.proto.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC3476h;
import com.google.crypto.tink.shaded.protobuf.C3484p;

/* loaded from: classes3.dex */
public class D extends com.google.crypto.tink.internal.d {

    public class a extends com.google.crypto.tink.internal.m {
        public a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public com.google.crypto.tink.a a(com.google.crypto.tink.proto.E e10) {
            String Q10 = e10.R().Q();
            return com.google.crypto.tink.s.a(Q10).b(Q10);
        }
    }

    public class b extends d.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public com.google.crypto.tink.proto.E a(com.google.crypto.tink.proto.F f10) {
            return (com.google.crypto.tink.proto.E) com.google.crypto.tink.proto.E.T().l(f10).m(D.this.k()).c();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public com.google.crypto.tink.proto.F d(AbstractC3476h abstractC3476h) {
            return com.google.crypto.tink.proto.F.R(abstractC3476h, C3484p.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(com.google.crypto.tink.proto.F f10) {
        }
    }

    public D() {
        super(com.google.crypto.tink.proto.E.class, new a(com.google.crypto.tink.a.class));
    }

    public static void m(boolean z10) {
        com.google.crypto.tink.x.l(new D(), z10);
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a f() {
        return new b(com.google.crypto.tink.proto.F.class);
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
    public com.google.crypto.tink.proto.E h(AbstractC3476h abstractC3476h) {
        return com.google.crypto.tink.proto.E.U(abstractC3476h, C3484p.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(com.google.crypto.tink.proto.E e10) {
        cb.r.c(e10.S(), k());
    }
}
