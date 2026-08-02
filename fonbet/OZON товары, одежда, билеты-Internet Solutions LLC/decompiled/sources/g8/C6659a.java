package g8;

import S7.q;
import j8.C7307b;
import java.security.GeneralSecurityException;

/* renamed from: g8.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6659a extends m {

    /* renamed from: a, reason: collision with root package name */
    private final d f63968a;

    /* renamed from: b, reason: collision with root package name */
    private final C7307b f63969b;

    private C6659a(d dVar, C7307b c7307b) {
        this.f63968a = dVar;
        this.f63969b = c7307b;
    }

    public static C6659a e(d dVar, C7307b c7307b) throws GeneralSecurityException {
        if (dVar.g() == c7307b.c()) {
            return new C6659a(dVar, c7307b);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    @Override // He.g
    public final q d() {
        return this.f63968a;
    }

    public final C7307b f() {
        return this.f63969b;
    }

    public final d g() {
        return this.f63968a;
    }
}
