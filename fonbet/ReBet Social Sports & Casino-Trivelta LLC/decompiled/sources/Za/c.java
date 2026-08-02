package Za;

import Xa.b;
import com.google.crypto.tink.mac.g;
import com.google.crypto.tink.mac.i;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class c implements g {

    /* renamed from: b, reason: collision with root package name */
    public static final b.EnumC0280b f14751b = b.EnumC0280b.f13670b;

    /* renamed from: a, reason: collision with root package name */
    public final i f14752a;

    public c(i iVar) {
        if (!f14751b.a()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f14752a = iVar;
    }
}
