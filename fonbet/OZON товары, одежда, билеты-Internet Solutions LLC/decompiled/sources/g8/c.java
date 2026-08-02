package g8;

import S7.s;
import X7.a;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.C5885d;
import com.google.crypto.tink.internal.C5890i;
import com.google.crypto.tink.internal.p;
import com.google.crypto.tink.internal.t;
import f8.C6450f;
import f8.E;
import h8.C6873a;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final B<C6659a, s> f63970a = B.b(new D40.a(), C6659a.class, s.class);

    /* renamed from: b, reason: collision with root package name */
    private static final C6660b f63971b = new C6660b();

    /* renamed from: c, reason: collision with root package name */
    private static final C5890i f63972c = C5890i.d("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey", s.class, E.c.SYMMETRIC, C6450f.L());

    public static void a() throws GeneralSecurityException {
        if (!a.EnumC0605a.ALGORITHM_NOT_FIPS.a()) {
            throw new GeneralSecurityException("Registering AES CTR HMAC Streaming AEAD is not supported in FIPS mode");
        }
        C6873a.e();
        com.google.crypto.tink.internal.s b11 = com.google.crypto.tink.internal.s.b();
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256_4KB", j.f64012a);
        hashMap.put("AES128_CTR_HMAC_SHA256_1MB", j.f64013b);
        hashMap.put("AES256_CTR_HMAC_SHA256_4KB", j.f64014c);
        hashMap.put("AES256_CTR_HMAC_SHA256_1MB", j.f64015d);
        b11.d(Collections.unmodifiableMap(hashMap));
        p.c().a(f63971b, d.class);
        t.b().c(f63970a);
        C5885d.d().g(f63972c);
    }
}
