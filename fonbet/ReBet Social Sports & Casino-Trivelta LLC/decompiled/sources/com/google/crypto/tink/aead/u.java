package com.google.crypto.tink.aead;

import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.l;
import com.google.crypto.tink.proto.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC3476h;
import com.google.crypto.tink.shaded.protobuf.C3484p;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes3.dex */
public final class u extends com.google.crypto.tink.internal.d {

    public class a extends com.google.crypto.tink.internal.m {
        public a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public com.google.crypto.tink.a a(com.google.crypto.tink.proto.n nVar) {
            return new Va.a(nVar.R().r());
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
            hashMap.put("AES128_GCM_SIV", u.m(16, bVar));
            l.b bVar2 = l.b.RAW;
            hashMap.put("AES128_GCM_SIV_RAW", u.m(16, bVar2));
            hashMap.put("AES256_GCM_SIV", u.m(32, bVar));
            hashMap.put("AES256_GCM_SIV_RAW", u.m(32, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public com.google.crypto.tink.proto.n a(com.google.crypto.tink.proto.o oVar) {
            return (com.google.crypto.tink.proto.n) com.google.crypto.tink.proto.n.T().l(AbstractC3476h.f(cb.p.c(oVar.Q()))).m(u.this.n()).c();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public com.google.crypto.tink.proto.o d(AbstractC3476h abstractC3476h) {
            return com.google.crypto.tink.proto.o.S(abstractC3476h, C3484p.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(com.google.crypto.tink.proto.o oVar) {
            cb.r.a(oVar.Q());
        }
    }

    public u() {
        super(com.google.crypto.tink.proto.n.class, new a(com.google.crypto.tink.a.class));
    }

    public static boolean l() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d.a.C0516a m(int i10, l.b bVar) {
        return new d.a.C0516a((com.google.crypto.tink.proto.o) com.google.crypto.tink.proto.o.R().l(i10).c(), bVar);
    }

    public static void p(boolean z10) {
        if (l()) {
            com.google.crypto.tink.x.l(new u(), z10);
            x.c();
        }
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a f() {
        return new b(com.google.crypto.tink.proto.o.class);
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
    public com.google.crypto.tink.proto.n h(AbstractC3476h abstractC3476h) {
        return com.google.crypto.tink.proto.n.U(abstractC3476h, C3484p.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void j(com.google.crypto.tink.proto.n nVar) {
        cb.r.c(nVar.S(), n());
        cb.r.a(nVar.R().size());
    }
}
