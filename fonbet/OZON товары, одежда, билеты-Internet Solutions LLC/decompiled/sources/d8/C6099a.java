package d8;

import He.g;
import S7.q;
import j8.C7307b;
import java.security.GeneralSecurityException;

/* renamed from: d8.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6099a extends g {

    /* renamed from: a, reason: collision with root package name */
    private final b f61272a;

    /* renamed from: b, reason: collision with root package name */
    private final C7307b f61273b;

    private C6099a(b bVar, C7307b c7307b) {
        this.f61272a = bVar;
        this.f61273b = c7307b;
    }

    public static C6099a e(b bVar, C7307b c7307b) throws GeneralSecurityException {
        if (bVar.c() == c7307b.c()) {
            return new C6099a(bVar, c7307b);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    @Override // He.g
    public final Integer c() {
        return null;
    }

    @Override // He.g
    public final q d() {
        return this.f61272a;
    }

    public final C7307b f() {
        return this.f61273b;
    }
}
