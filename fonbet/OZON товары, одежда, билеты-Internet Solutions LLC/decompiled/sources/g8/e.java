package g8;

import S7.q;
import j8.C7307b;
import java.security.GeneralSecurityException;

/* loaded from: classes9.dex */
public final class e extends m {

    /* renamed from: a, reason: collision with root package name */
    private final h f63989a;

    /* renamed from: b, reason: collision with root package name */
    private final C7307b f63990b;

    private e(h hVar, C7307b c7307b) {
        this.f63989a = hVar;
        this.f63990b = c7307b;
    }

    public static e e(h hVar, C7307b c7307b) throws GeneralSecurityException {
        if (hVar.e() == c7307b.c()) {
            return new e(hVar, c7307b);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    @Override // He.g
    public final q d() {
        return this.f63989a;
    }

    public final C7307b f() {
        return this.f63990b;
    }

    public final h g() {
        return this.f63989a;
    }
}
