package c8;

import X7.a;
import java.security.GeneralSecurityException;

/* renamed from: c8.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5765d implements b8.e {

    /* renamed from: a, reason: collision with root package name */
    private static final a.EnumC0605a f56693a = a.EnumC0605a.ALGORITHM_REQUIRES_BORINGCRYPTO;

    public C5765d() throws GeneralSecurityException {
        if (!f56693a.a()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
    }
}
