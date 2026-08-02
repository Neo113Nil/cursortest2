package c8;

import X7.a;
import b8.C5581a;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: c8.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5763b implements b8.e {

    /* renamed from: a, reason: collision with root package name */
    private static final a.EnumC0605a f56691a = a.EnumC0605a.ALGORITHM_NOT_FIPS;

    public static C5763b a(C5581a c5581a, Provider provider) throws GeneralSecurityException {
        C5763b c5763b = new C5763b();
        if (!f56691a.a()) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            c5581a.e().d();
            new SecretKeySpec(c5581a.h().d(S7.e.a()), "AES");
            return c5763b;
        } catch (NoSuchAlgorithmException e11) {
            throw new GeneralSecurityException("AES-CMAC not available.", e11);
        }
    }
}
