package g8;

import S7.s;
import T7.C4024f;
import X7.a;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.C5885d;
import com.google.crypto.tink.internal.C5890i;
import com.google.crypto.tink.internal.p;
import com.google.crypto.tink.internal.q;
import com.google.crypto.tink.internal.t;
import f8.C6459o;
import f8.E;
import h8.C6874b;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final B<e, s> f63991a = B.b(new Ak.b(), e.class, s.class);

    /* renamed from: b, reason: collision with root package name */
    private static final C5890i f63992b = C5890i.d("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey", s.class, E.c.SYMMETRIC, C6459o.L());

    /* renamed from: c, reason: collision with root package name */
    private static final f f63993c = new f();

    /* renamed from: d, reason: collision with root package name */
    private static final C4024f f63994d = new C4024f();

    public static void a() throws GeneralSecurityException {
        if (!a.EnumC0605a.ALGORITHM_NOT_FIPS.a()) {
            throw new GeneralSecurityException("Registering AES-GCM HKDF Streaming AEAD is not supported in FIPS mode");
        }
        C6874b.e();
        com.google.crypto.tink.internal.s b11 = com.google.crypto.tink.internal.s.b();
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_HKDF_4KB", j.f64016e);
        hashMap.put("AES128_GCM_HKDF_1MB", j.f64017f);
        hashMap.put("AES256_GCM_HKDF_4KB", j.f64018g);
        hashMap.put("AES256_GCM_HKDF_1MB", j.f64019h);
        b11.d(Collections.unmodifiableMap(hashMap));
        q.b().a(f63994d, h.class);
        p.c().a(f63993c, h.class);
        t.b().c(f63991a);
        C5885d.d().g(f63992b);
    }
}
