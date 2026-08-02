package c8;

import X7.a;
import b8.C5581a;
import com.google.crypto.tink.internal.C5882a;
import java.security.GeneralSecurityException;
import java.security.Provider;

/* renamed from: c8.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5764c implements b8.e {

    /* renamed from: a, reason: collision with root package name */
    private static final a.EnumC0605a f56692a = a.EnumC0605a.ALGORITHM_NOT_FIPS;

    public static b8.e a(C5581a c5581a) throws GeneralSecurityException {
        if (!f56692a.a()) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        Provider a11 = C5882a.a();
        if (a11 != null) {
            try {
                return C5763b.a(c5581a, a11);
            } catch (GeneralSecurityException unused) {
            }
        }
        return new C5764c();
    }
}
