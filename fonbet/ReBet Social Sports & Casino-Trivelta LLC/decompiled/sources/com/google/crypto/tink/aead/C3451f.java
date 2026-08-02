package com.google.crypto.tink.aead;

import cb.C2907a;
import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.proto.C3462f;
import com.google.crypto.tink.proto.C3463g;
import com.google.crypto.tink.proto.C3464h;
import com.google.crypto.tink.proto.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC3476h;
import com.google.crypto.tink.shaded.protobuf.C3484p;
import java.security.GeneralSecurityException;

/* renamed from: com.google.crypto.tink.aead.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3451f extends com.google.crypto.tink.internal.d {

    /* renamed from: com.google.crypto.tink.aead.f$a */
    public class a extends com.google.crypto.tink.internal.m {
        public a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public cb.l a(C3462f c3462f) {
            return new C2907a(c3462f.T().r(), c3462f.U().R());
        }
    }

    /* renamed from: com.google.crypto.tink.aead.f$b */
    public class b extends d.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C3462f a(C3463g c3463g) {
            return (C3462f) C3462f.W().m(c3463g.T()).l(AbstractC3476h.f(cb.p.c(c3463g.S()))).n(C3451f.this.l()).c();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C3463g d(AbstractC3476h abstractC3476h) {
            return C3463g.V(abstractC3476h, C3484p.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(C3463g c3463g) {
            cb.r.a(c3463g.S());
            C3451f.this.o(c3463g.T());
        }
    }

    public C3451f() {
        super(C3462f.class, new a(cb.l.class));
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a f() {
        return new b(C3463g.class);
    }

    @Override // com.google.crypto.tink.internal.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int l() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C3462f h(AbstractC3476h abstractC3476h) {
        return C3462f.X(abstractC3476h, C3484p.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(C3462f c3462f) {
        cb.r.c(c3462f.V(), l());
        cb.r.a(c3462f.T().size());
        o(c3462f.U());
    }

    public final void o(C3464h c3464h) {
        if (c3464h.R() < 12 || c3464h.R() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }
}
