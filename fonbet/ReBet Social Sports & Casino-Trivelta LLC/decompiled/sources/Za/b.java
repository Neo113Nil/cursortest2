package Za;

import Xa.b;
import com.google.crypto.tink.mac.g;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class b implements g {

    /* renamed from: b, reason: collision with root package name */
    public static final b.EnumC0280b f14749b = b.EnumC0280b.f13669a;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.crypto.tink.mac.a f14750a;

    public b(com.google.crypto.tink.mac.a aVar) {
        if (!f14749b.a()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        this.f14750a = aVar;
    }
}
