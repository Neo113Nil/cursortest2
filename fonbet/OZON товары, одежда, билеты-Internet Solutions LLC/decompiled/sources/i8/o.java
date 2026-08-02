package i8;

import d8.C6099a;
import e8.C6318a;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class o implements d8.c {

    /* loaded from: classes9.dex */
    private static class a implements d8.c {

        /* renamed from: a, reason: collision with root package name */
        final C6318a f66121a;

        /* renamed from: b, reason: collision with root package name */
        final e8.b f66122b;

        a(C6318a c6318a, e8.b bVar) {
            this.f66121a = c6318a;
            this.f66122b = bVar;
        }

        @Override // d8.c
        public final byte[] a(int i11, byte[] bArr) throws GeneralSecurityException {
            return bArr.length <= 64 ? this.f66121a.a(i11, bArr) : this.f66122b.a(i11, bArr);
        }
    }

    public static d8.c b(C6099a c6099a) throws GeneralSecurityException {
        C6318a b11 = C6318a.b(c6099a);
        try {
            return new a(b11, e8.b.b(c6099a));
        } catch (GeneralSecurityException unused) {
            return b11;
        }
    }
}
