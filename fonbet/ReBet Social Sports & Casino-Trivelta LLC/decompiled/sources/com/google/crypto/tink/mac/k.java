package com.google.crypto.tink.mac;

import Xa.b;
import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.internal.l;
import com.google.crypto.tink.l;
import com.google.crypto.tink.proto.u;
import com.google.crypto.tink.proto.v;
import com.google.crypto.tink.proto.w;
import com.google.crypto.tink.proto.x;
import com.google.crypto.tink.proto.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC3476h;
import com.google.crypto.tink.shaded.protobuf.C3484p;
import com.google.crypto.tink.t;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class k extends com.google.crypto.tink.internal.d {

    /* renamed from: d, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.l f37143d = com.google.crypto.tink.internal.l.b(new l.b() { // from class: com.google.crypto.tink.mac.j
        @Override // com.google.crypto.tink.internal.l.b
        public final Object a(com.google.crypto.tink.g gVar) {
            return new Za.c((i) gVar);
        }
    }, i.class, g.class);

    public class a extends com.google.crypto.tink.internal.m {
        public a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public t a(v vVar) {
            u S10 = vVar.U().S();
            SecretKeySpec secretKeySpec = new SecretKeySpec(vVar.T().r(), "HMAC");
            int T10 = vVar.U().T();
            int i10 = c.$SwitchMap$com$google$crypto$tink$proto$HashType[S10.ordinal()];
            if (i10 == 1) {
                return new cb.o(new cb.n("HMACSHA1", secretKeySpec), T10);
            }
            if (i10 == 2) {
                return new cb.o(new cb.n("HMACSHA224", secretKeySpec), T10);
            }
            if (i10 == 3) {
                return new cb.o(new cb.n("HMACSHA256", secretKeySpec), T10);
            }
            if (i10 == 4) {
                return new cb.o(new cb.n("HMACSHA384", secretKeySpec), T10);
            }
            if (i10 == 5) {
                return new cb.o(new cb.n("HMACSHA512", secretKeySpec), T10);
            }
            throw new GeneralSecurityException("unknown hash");
        }
    }

    public class b extends d.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        public Map c() {
            HashMap hashMap = new HashMap();
            u uVar = u.SHA256;
            l.b bVar = l.b.TINK;
            hashMap.put("HMAC_SHA256_128BITTAG", k.m(32, 16, uVar, bVar));
            l.b bVar2 = l.b.RAW;
            hashMap.put("HMAC_SHA256_128BITTAG_RAW", k.m(32, 16, uVar, bVar2));
            hashMap.put("HMAC_SHA256_256BITTAG", k.m(32, 32, uVar, bVar));
            hashMap.put("HMAC_SHA256_256BITTAG_RAW", k.m(32, 32, uVar, bVar2));
            u uVar2 = u.SHA512;
            hashMap.put("HMAC_SHA512_128BITTAG", k.m(64, 16, uVar2, bVar));
            hashMap.put("HMAC_SHA512_128BITTAG_RAW", k.m(64, 16, uVar2, bVar2));
            hashMap.put("HMAC_SHA512_256BITTAG", k.m(64, 32, uVar2, bVar));
            hashMap.put("HMAC_SHA512_256BITTAG_RAW", k.m(64, 32, uVar2, bVar2));
            hashMap.put("HMAC_SHA512_512BITTAG", k.m(64, 64, uVar2, bVar));
            hashMap.put("HMAC_SHA512_512BITTAG_RAW", k.m(64, 64, uVar2, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public v a(w wVar) {
            return (v) v.W().n(k.this.n()).m(wVar.T()).l(AbstractC3476h.f(cb.p.c(wVar.S()))).c();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public w d(AbstractC3476h abstractC3476h) {
            return w.V(abstractC3476h, C3484p.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(w wVar) {
            if (wVar.S() < 16) {
                throw new GeneralSecurityException("key too short");
            }
            k.r(wVar.T());
        }
    }

    public static /* synthetic */ class c {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType;

        static {
            int[] iArr = new int[u.values().length];
            $SwitchMap$com$google$crypto$tink$proto$HashType = iArr;
            try {
                iArr[u.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[u.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[u.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[u.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[u.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public k() {
        super(v.class, new a(t.class));
    }

    public static d.a.C0516a m(int i10, int i11, u uVar, l.b bVar) {
        return new d.a.C0516a((w) w.U().m((x) x.U().l(uVar).m(i11).c()).l(i10).c(), bVar);
    }

    public static void p(boolean z10) {
        com.google.crypto.tink.x.l(new k(), z10);
        n.c();
        com.google.crypto.tink.internal.h.c().d(f37143d);
    }

    public static void r(x xVar) {
        if (xVar.T() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i10 = c.$SwitchMap$com$google$crypto$tink$proto$HashType[xVar.S().ordinal()];
        if (i10 == 1) {
            if (xVar.T() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (i10 == 2) {
            if (xVar.T() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (i10 == 3) {
            if (xVar.T() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i10 == 4) {
            if (xVar.T() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (i10 != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (xVar.T() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // com.google.crypto.tink.internal.d
    public b.EnumC0280b a() {
        return b.EnumC0280b.f13670b;
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a f() {
        return new b(w.class);
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
    public v h(AbstractC3476h abstractC3476h) {
        return v.X(abstractC3476h, C3484p.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void j(v vVar) {
        cb.r.c(vVar.V(), n());
        if (vVar.T().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        r(vVar.U());
    }
}
