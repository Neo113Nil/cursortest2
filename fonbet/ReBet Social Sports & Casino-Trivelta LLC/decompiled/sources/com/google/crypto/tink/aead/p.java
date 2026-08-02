package com.google.crypto.tink.aead;

import Xa.b;
import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.l;
import com.google.crypto.tink.proto.C3468l;
import com.google.crypto.tink.proto.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC3476h;
import com.google.crypto.tink.shaded.protobuf.C3484p;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class p extends com.google.crypto.tink.internal.d {

    public class a extends com.google.crypto.tink.internal.m {
        public a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public com.google.crypto.tink.a a(C3468l c3468l) {
            return new cb.c(c3468l.R().r());
        }
    }

    public class b extends d.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        public Map c() {
            HashMap hashMap = new HashMap();
            l.b bVar = l.b.TINK;
            hashMap.put("AES128_GCM", p.l(16, bVar));
            l.b bVar2 = l.b.RAW;
            hashMap.put("AES128_GCM_RAW", p.l(16, bVar2));
            hashMap.put("AES256_GCM", p.l(32, bVar));
            hashMap.put("AES256_GCM_RAW", p.l(32, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C3468l a(com.google.crypto.tink.proto.m mVar) {
            return (C3468l) C3468l.T().l(AbstractC3476h.f(cb.p.c(mVar.Q()))).m(p.this.m()).c();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public com.google.crypto.tink.proto.m d(AbstractC3476h abstractC3476h) {
            return com.google.crypto.tink.proto.m.S(abstractC3476h, C3484p.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(com.google.crypto.tink.proto.m mVar) {
            cb.r.a(mVar.Q());
        }
    }

    public p() {
        super(C3468l.class, new a(com.google.crypto.tink.a.class));
    }

    public static d.a.C0516a l(int i10, l.b bVar) {
        return new d.a.C0516a((com.google.crypto.tink.proto.m) com.google.crypto.tink.proto.m.R().l(i10).c(), bVar);
    }

    public static void o(boolean z10) {
        com.google.crypto.tink.x.l(new p(), z10);
        s.c();
    }

    @Override // com.google.crypto.tink.internal.d
    public b.EnumC0280b a() {
        return b.EnumC0280b.f13670b;
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a f() {
        return new b(com.google.crypto.tink.proto.m.class);
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
    public C3468l h(AbstractC3476h abstractC3476h) {
        return C3468l.U(abstractC3476h, C3484p.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void j(C3468l c3468l) {
        cb.r.c(c3468l.S(), m());
        cb.r.a(c3468l.R().size());
    }
}
