package com.google.crypto.tink.aead;

import Xa.b;
import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.l;
import com.google.crypto.tink.proto.C3460d;
import com.google.crypto.tink.proto.C3461e;
import com.google.crypto.tink.proto.C3462f;
import com.google.crypto.tink.proto.C3463g;
import com.google.crypto.tink.proto.C3464h;
import com.google.crypto.tink.proto.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC3476h;
import com.google.crypto.tink.shaded.protobuf.C3484p;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.crypto.tink.aead.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3450e extends com.google.crypto.tink.internal.d {

    /* renamed from: com.google.crypto.tink.aead.e$a */
    public class a extends com.google.crypto.tink.internal.m {
        public a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public com.google.crypto.tink.a a(C3460d c3460d) {
            return new cb.h((cb.l) new C3451f().e(c3460d.S(), cb.l.class), (com.google.crypto.tink.t) new com.google.crypto.tink.mac.k().e(c3460d.T(), com.google.crypto.tink.t.class), c3460d.T().U().T());
        }
    }

    /* renamed from: com.google.crypto.tink.aead.e$b */
    public class b extends d.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        public Map c() {
            HashMap hashMap = new HashMap();
            com.google.crypto.tink.proto.u uVar = com.google.crypto.tink.proto.u.SHA256;
            l.b bVar = l.b.TINK;
            hashMap.put("AES128_CTR_HMAC_SHA256", C3450e.l(16, 16, 32, 16, uVar, bVar));
            l.b bVar2 = l.b.RAW;
            hashMap.put("AES128_CTR_HMAC_SHA256_RAW", C3450e.l(16, 16, 32, 16, uVar, bVar2));
            hashMap.put("AES256_CTR_HMAC_SHA256", C3450e.l(32, 16, 32, 32, uVar, bVar));
            hashMap.put("AES256_CTR_HMAC_SHA256_RAW", C3450e.l(32, 16, 32, 32, uVar, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C3460d a(C3461e c3461e) {
            C3462f c3462f = (C3462f) new C3451f().f().a(c3461e.R());
            return (C3460d) C3460d.V().l(c3462f).m((com.google.crypto.tink.proto.v) new com.google.crypto.tink.mac.k().f().a(c3461e.S())).n(C3450e.this.n()).c();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C3461e d(AbstractC3476h abstractC3476h) {
            return C3461e.U(abstractC3476h, C3484p.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(C3461e c3461e) {
            new C3451f().f().e(c3461e.R());
            new com.google.crypto.tink.mac.k().f().e(c3461e.S());
            cb.r.a(c3461e.R().S());
        }
    }

    public C3450e() {
        super(C3460d.class, new a(com.google.crypto.tink.a.class));
    }

    public static d.a.C0516a l(int i10, int i11, int i12, int i13, com.google.crypto.tink.proto.u uVar, l.b bVar) {
        return new d.a.C0516a(m(i10, i11, i12, i13, uVar), bVar);
    }

    public static C3461e m(int i10, int i11, int i12, int i13, com.google.crypto.tink.proto.u uVar) {
        C3463g c3463g = (C3463g) C3463g.U().m((C3464h) C3464h.S().l(i11).c()).l(i10).c();
        return (C3461e) C3461e.T().l(c3463g).m((com.google.crypto.tink.proto.w) com.google.crypto.tink.proto.w.U().m((com.google.crypto.tink.proto.x) com.google.crypto.tink.proto.x.U().l(uVar).m(i13).c()).l(i12).c()).c();
    }

    public static void p(boolean z10) {
        com.google.crypto.tink.x.l(new C3450e(), z10);
    }

    @Override // com.google.crypto.tink.internal.d
    public b.EnumC0280b a() {
        return b.EnumC0280b.f13670b;
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a f() {
        return new b(C3461e.class);
    }

    @Override // com.google.crypto.tink.internal.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int n() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C3460d h(AbstractC3476h abstractC3476h) {
        return C3460d.W(abstractC3476h, C3484p.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void j(C3460d c3460d) {
        cb.r.c(c3460d.U(), n());
        new C3451f().j(c3460d.S());
        new com.google.crypto.tink.mac.k().j(c3460d.T());
    }
}
