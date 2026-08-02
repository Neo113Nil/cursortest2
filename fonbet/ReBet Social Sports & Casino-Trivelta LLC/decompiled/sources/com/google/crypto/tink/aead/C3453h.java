package com.google.crypto.tink.aead;

import cb.C2908b;
import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.l;
import com.google.crypto.tink.proto.C3465i;
import com.google.crypto.tink.proto.C3466j;
import com.google.crypto.tink.proto.C3467k;
import com.google.crypto.tink.proto.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC3476h;
import com.google.crypto.tink.shaded.protobuf.C3484p;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.crypto.tink.aead.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3453h extends com.google.crypto.tink.internal.d {

    /* renamed from: com.google.crypto.tink.aead.h$a */
    public class a extends com.google.crypto.tink.internal.m {
        public a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public com.google.crypto.tink.a a(C3465i c3465i) {
            return new C2908b(c3465i.S().r(), c3465i.T().R());
        }
    }

    /* renamed from: com.google.crypto.tink.aead.h$b */
    public class b extends d.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        public Map c() {
            HashMap hashMap = new HashMap();
            l.b bVar = l.b.TINK;
            hashMap.put("AES128_EAX", C3453h.l(16, 16, bVar));
            l.b bVar2 = l.b.RAW;
            hashMap.put("AES128_EAX_RAW", C3453h.l(16, 16, bVar2));
            hashMap.put("AES256_EAX", C3453h.l(32, 16, bVar));
            hashMap.put("AES256_EAX_RAW", C3453h.l(32, 16, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C3465i a(C3466j c3466j) {
            return (C3465i) C3465i.V().l(AbstractC3476h.f(cb.p.c(c3466j.R()))).m(c3466j.S()).n(C3453h.this.m()).c();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C3466j d(AbstractC3476h abstractC3476h) {
            return C3466j.U(abstractC3476h, C3484p.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(C3466j c3466j) {
            cb.r.a(c3466j.R());
            if (c3466j.S().R() != 12 && c3466j.S().R() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    public C3453h() {
        super(C3465i.class, new a(com.google.crypto.tink.a.class));
    }

    public static d.a.C0516a l(int i10, int i11, l.b bVar) {
        return new d.a.C0516a((C3466j) C3466j.T().l(i10).m((C3467k) C3467k.S().l(i11).c()).c(), bVar);
    }

    public static void o(boolean z10) {
        com.google.crypto.tink.x.l(new C3453h(), z10);
        n.c();
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a f() {
        return new b(C3466j.class);
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
    public C3465i h(AbstractC3476h abstractC3476h) {
        return C3465i.W(abstractC3476h, C3484p.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void j(C3465i c3465i) {
        cb.r.c(c3465i.U(), m());
        cb.r.a(c3465i.S().size());
        if (c3465i.T().R() != 12 && c3465i.T().R() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
