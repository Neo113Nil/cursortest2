package e8;

import S7.e;
import X7.a;
import com.google.crypto.tink.internal.C5882a;
import d8.C6099a;
import d8.c;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: c, reason: collision with root package name */
    private static final a.EnumC0605a f62036c = a.EnumC0605a.ALGORITHM_NOT_FIPS;

    /* renamed from: a, reason: collision with root package name */
    private final SecretKeySpec f62037a;

    /* renamed from: b, reason: collision with root package name */
    private final Provider f62038b;

    private b(byte[] bArr, Provider provider) throws GeneralSecurityException {
        if (!f62036c.a()) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
        }
        this.f62037a = new SecretKeySpec(bArr, "AES");
        this.f62038b = provider;
    }

    public static b b(C6099a c6099a) throws GeneralSecurityException {
        Provider a11 = C5882a.a();
        if (a11 == null) {
            throw new GeneralSecurityException("Conscrypt not available");
        }
        Mac.getInstance("AESCMAC", a11);
        return new b(c6099a.f().d(e.a()), a11);
    }

    @Override // d8.c
    public final byte[] a(int i11, byte[] bArr) throws GeneralSecurityException {
        if (i11 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength must not be larger than 16");
        }
        Mac mac = Mac.getInstance("AESCMAC", this.f62038b);
        mac.init(this.f62037a);
        byte[] doFinal = mac.doFinal(bArr);
        return i11 == doFinal.length ? doFinal : Arrays.copyOf(doFinal, i11);
    }
}
