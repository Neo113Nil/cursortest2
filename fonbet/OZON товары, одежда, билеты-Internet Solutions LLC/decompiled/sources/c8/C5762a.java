package c8;

import Bk.C2638a;
import Ij.C3261b;
import J0.C3354v2;
import S7.r;
import Ve.C4598rp;
import b8.C5581a;
import b8.C5584d;
import com.google.crypto.tink.internal.AbstractC5887f;
import com.google.crypto.tink.internal.AbstractC5889h;
import com.google.crypto.tink.internal.F;
import com.google.crypto.tink.internal.G;
import com.google.crypto.tink.internal.M;
import com.google.crypto.tink.internal.u;
import com.google.crypto.tink.internal.x;
import com.google.crypto.tink.internal.z;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.AbstractC5903i;
import com.google.crypto.tink.shaded.protobuf.C5910p;
import f8.C6445a;
import f8.C6446b;
import f8.C6447c;
import f8.E;
import f8.G;
import f8.O;
import j8.C7306a;
import j8.C7307b;
import java.security.GeneralSecurityException;

/* renamed from: c8.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5762a {

    /* renamed from: a, reason: collision with root package name */
    private static final z<C5584d, G> f56686a;

    /* renamed from: b, reason: collision with root package name */
    private static final x<G> f56687b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC5889h<C5581a, F> f56688c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC5887f<F> f56689d;

    /* renamed from: c8.a$a, reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    static /* synthetic */ class C0854a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f56690a;

        static {
            int[] iArr = new int[O.values().length];
            f56690a = iArr;
            try {
                iArr[O.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56690a[O.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56690a[O.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56690a[O.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C7306a c11 = M.c("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f56686a = z.a(new C2638a(), C5584d.class);
        f56687b = x.a(new C3261b(), c11);
        f56688c = AbstractC5889h.a(new C3354v2(), C5581a.class);
        f56689d = AbstractC5887f.a(new C4598rp(), c11);
    }

    public static G a(C5584d c5584d) {
        G.b L11 = f8.G.L();
        L11.j("type.googleapis.com/google.crypto.tink.AesCmacKey");
        C6446b.C1005b I11 = C6446b.I();
        C6447c.b H11 = C6447c.H();
        H11.i(c5584d.c());
        I11.j(H11.b());
        I11.i(c5584d.d());
        L11.k(I11.b().toByteString());
        L11.i(f(c5584d.f()));
        return com.google.crypto.tink.internal.G.b(L11.b());
    }

    public static F b(C5581a c5581a, r rVar) {
        C6445a.b J11 = C6445a.J();
        C5584d i11 = c5581a.i();
        C6447c.b H11 = C6447c.H();
        H11.i(i11.c());
        J11.j(H11.b());
        byte[] d11 = c5581a.h().d(rVar);
        J11.i(AbstractC5903i.e(0, d11.length, d11));
        return F.a("type.googleapis.com/google.crypto.tink.AesCmacKey", J11.b().toByteString(), E.c.SYMMETRIC, f(c5581a.i().f()), c5581a.c());
    }

    public static C5581a c(F f7, r rVar) {
        if (!f7.f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            C6445a K11 = C6445a.K(f7.g(), C5910p.b());
            if (K11.I() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            C5584d.a b11 = C5584d.b();
            b11.b(K11.G().size());
            b11.c(K11.H().G());
            b11.d(g(f7.e()));
            C5584d a11 = b11.a();
            C5581a.C0831a g10 = C5581a.g();
            g10.d(a11);
            g10.b(C7307b.a(K11.G().n(), rVar));
            g10.c(f7.b());
            return g10.a();
        } catch (A | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static C5584d d(com.google.crypto.tink.internal.G g10) {
        if (!g10.c().J().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: " + g10.c().J());
        }
        try {
            C6446b J11 = C6446b.J(g10.c().K(), C5910p.b());
            C5584d.a b11 = C5584d.b();
            b11.b(J11.G());
            b11.c(J11.H().G());
            b11.d(g(g10.c().I()));
            return b11.a();
        } catch (A e11) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e11);
        }
    }

    public static void e() throws GeneralSecurityException {
        u a11 = u.a();
        a11.i(f56686a);
        a11.h(f56687b);
        a11.g(f56688c);
        a11.f(f56689d);
    }

    private static O f(C5584d.b bVar) throws GeneralSecurityException {
        if (C5584d.b.f55673b.equals(bVar)) {
            return O.TINK;
        }
        if (C5584d.b.f55674c.equals(bVar)) {
            return O.CRUNCHY;
        }
        if (C5584d.b.f55676e.equals(bVar)) {
            return O.RAW;
        }
        if (C5584d.b.f55675d.equals(bVar)) {
            return O.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + bVar);
    }

    private static C5584d.b g(O o11) throws GeneralSecurityException {
        int i11 = C0854a.f56690a[o11.ordinal()];
        if (i11 == 1) {
            return C5584d.b.f55673b;
        }
        if (i11 == 2) {
            return C5584d.b.f55674c;
        }
        if (i11 == 3) {
            return C5584d.b.f55675d;
        }
        if (i11 == 4) {
            return C5584d.b.f55676e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o11.getNumber());
    }
}
