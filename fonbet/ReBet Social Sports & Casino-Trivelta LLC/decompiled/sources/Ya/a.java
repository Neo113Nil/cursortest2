package Ya;

import cb.r;
import com.google.crypto.tink.e;
import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.internal.m;
import com.google.crypto.tink.l;
import com.google.crypto.tink.proto.p;
import com.google.crypto.tink.proto.q;
import com.google.crypto.tink.proto.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC3476h;
import com.google.crypto.tink.shaded.protobuf.C3484p;
import com.google.crypto.tink.x;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class a extends d {

    /* renamed from: Ya.a$a, reason: collision with other inner class name */
    public class C0290a extends m {
        public C0290a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e a(p pVar) {
            return new cb.d(pVar.R().r());
        }
    }

    public class b extends d.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        public Map c() {
            HashMap hashMap = new HashMap();
            hashMap.put("AES256_SIV", new d.a.C0516a((q) q.R().l(64).c(), l.b.TINK));
            hashMap.put("AES256_SIV_RAW", new d.a.C0516a((q) q.R().l(64).c(), l.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public p a(q qVar) {
            return (p) p.T().l(AbstractC3476h.f(cb.p.c(qVar.Q()))).m(a.this.k()).c();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public q d(AbstractC3476h abstractC3476h) {
            return q.S(abstractC3476h, C3484p.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(q qVar) {
            if (qVar.Q() == 64) {
                return;
            }
            throw new InvalidAlgorithmParameterException("invalid key size: " + qVar.Q() + ". Valid keys must have 64 bytes.");
        }
    }

    public a() {
        super(p.class, new C0290a(e.class));
    }

    public static void m(boolean z10) {
        x.l(new a(), z10);
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a f() {
        return new b(q.class);
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
    public p h(AbstractC3476h abstractC3476h) {
        return p.U(abstractC3476h, C3484p.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(p pVar) {
        r.c(pVar.S(), k());
        if (pVar.R().size() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + pVar.R().size() + ". Valid keys must have 64 bytes.");
    }
}
