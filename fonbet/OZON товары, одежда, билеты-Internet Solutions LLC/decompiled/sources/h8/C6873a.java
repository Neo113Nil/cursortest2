package h8;

import C.J;
import De.C2859b;
import De.C2860c;
import Kk.C3531a;
import S7.r;
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
import f8.C6450f;
import f8.C6451g;
import f8.C6452h;
import f8.D;
import f8.E;
import f8.EnumC6443A;
import f8.G;
import f8.O;
import g8.C6659a;
import g8.d;
import j8.C7306a;
import j8.C7307b;
import java.security.GeneralSecurityException;

/* renamed from: h8.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6873a {

    /* renamed from: a, reason: collision with root package name */
    private static final z<d, G> f65070a;

    /* renamed from: b, reason: collision with root package name */
    private static final x<G> f65071b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC5889h<C6659a, F> f65072c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC5887f<F> f65073d;

    /* renamed from: h8.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C1056a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f65074a;

        static {
            int[] iArr = new int[EnumC6443A.values().length];
            f65074a = iArr;
            try {
                iArr[EnumC6443A.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65074a[EnumC6443A.SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65074a[EnumC6443A.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        C7306a c11 = M.c("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey");
        f65070a = z.a(new C3531a(), d.class);
        f65071b = x.a(new J(), c11);
        f65072c = AbstractC5889h.a(new C2859b(), C6659a.class);
        f65073d = AbstractC5887f.a(new C2860c(), c11);
    }

    public static d a(G g10) {
        if (!g10.c().J().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacStreamingParameters.parseParameters: " + g10.c().J());
        }
        try {
            C6451g J11 = C6451g.J(g10.c().K(), C5910p.b());
            return g(J11.H(), J11.G());
        } catch (A e11) {
            throw new GeneralSecurityException("Parsing AesCtrHmacStreamingParameters failed: ", e11);
        }
    }

    public static C6659a b(F f7, r rVar) {
        if (!f7.f().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacStreamingParameters.parseParameters");
        }
        try {
            C6450f K11 = C6450f.K(f7.g(), C5910p.b());
            if (K11.I() == 0) {
                return C6659a.e(g(K11.H(), K11.G().size()), C7307b.a(K11.G().n(), rVar));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (A unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacStreamingKey failed");
        }
    }

    public static G c(d dVar) {
        G.b L11 = f8.G.L();
        L11.j("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey");
        C6451g.b I11 = C6451g.I();
        I11.i(dVar.g());
        I11.j(i(dVar));
        L11.k(I11.b().toByteString());
        L11.i(O.RAW);
        return com.google.crypto.tink.internal.G.b(L11.b());
    }

    public static F d(C6659a c6659a, r rVar) {
        C6450f.b J11 = C6450f.J();
        byte[] d11 = c6659a.f().d(rVar);
        J11.i(AbstractC5903i.e(0, d11.length, d11));
        J11.j(i(c6659a.g()));
        return F.a("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey", J11.b().toByteString(), E.c.SYMMETRIC, O.RAW, null);
    }

    public static void e() throws GeneralSecurityException {
        u a11 = u.a();
        a11.i(f65070a);
        a11.h(f65071b);
        a11.g(f65072c);
        a11.f(f65073d);
    }

    private static d.b f(EnumC6443A enumC6443A) throws GeneralSecurityException {
        int i11 = C1056a.f65074a[enumC6443A.ordinal()];
        if (i11 == 1) {
            return d.b.f63985b;
        }
        if (i11 == 2) {
            return d.b.f63986c;
        }
        if (i11 == 3) {
            return d.b.f63987d;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + enumC6443A.getNumber());
    }

    private static d g(C6452h c6452h, int i11) throws GeneralSecurityException {
        d.a aVar = new d.a();
        aVar.g(i11);
        aVar.c(c6452h.K());
        aVar.b(c6452h.I());
        aVar.d(f(c6452h.L()));
        aVar.e(f(c6452h.M().H()));
        aVar.f(Integer.valueOf(c6452h.M().I()));
        return aVar.a();
    }

    private static EnumC6443A h(d.b bVar) throws GeneralSecurityException {
        if (d.b.f63985b.equals(bVar)) {
            return EnumC6443A.SHA1;
        }
        if (d.b.f63986c.equals(bVar)) {
            return EnumC6443A.SHA256;
        }
        if (d.b.f63987d.equals(bVar)) {
            return EnumC6443A.SHA512;
        }
        throw new GeneralSecurityException("Unable to serialize HashType " + bVar);
    }

    private static C6452h i(d dVar) throws GeneralSecurityException {
        C6452h.b N11 = C6452h.N();
        N11.i(dVar.b());
        N11.j(dVar.c());
        N11.k(h(dVar.d()));
        D.b J11 = D.J();
        J11.i(h(dVar.e()));
        J11.j(dVar.f());
        N11.l(J11);
        return N11.b();
    }
}
