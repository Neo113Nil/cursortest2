package h8;

import Kk.c;
import Kk.d;
import S7.r;
import Tz.C4055a;
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
import f8.C6459o;
import f8.C6460p;
import f8.C6461q;
import f8.E;
import f8.EnumC6443A;
import f8.G;
import f8.O;
import g8.e;
import g8.h;
import j8.C7306a;
import j8.C7307b;
import java.security.GeneralSecurityException;

/* renamed from: h8.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6874b {

    /* renamed from: a, reason: collision with root package name */
    private static final z<h, G> f65075a;

    /* renamed from: b, reason: collision with root package name */
    private static final x<G> f65076b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC5889h<e, F> f65077c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC5887f<F> f65078d;

    /* renamed from: h8.b$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f65079a;

        static {
            int[] iArr = new int[EnumC6443A.values().length];
            f65079a = iArr;
            try {
                iArr[EnumC6443A.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65079a[EnumC6443A.SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65079a[EnumC6443A.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        C7306a c11 = M.c("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey");
        f65075a = z.a(new c(), h.class);
        f65076b = x.a(new Co.a(), c11);
        f65077c = AbstractC5889h.a(new d(), e.class);
        f65078d = AbstractC5887f.a(new C4055a(), c11);
    }

    public static e a(F f7, r rVar) {
        if (!f7.f().equals("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmHkdfStreamingParameters.parseParameters");
        }
        try {
            C6459o K11 = C6459o.K(f7.g(), C5910p.b());
            if (K11.I() == 0) {
                return e.e(f(K11.H(), K11.G().size()), C7307b.a(K11.G().n(), rVar));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (A unused) {
            throw new GeneralSecurityException("Parsing AesGcmHkdfStreamingKey failed");
        }
    }

    public static F b(e eVar, r rVar) {
        C6459o.b J11 = C6459o.J();
        byte[] d11 = eVar.f().d(rVar);
        J11.i(AbstractC5903i.e(0, d11.length, d11));
        J11.j(g(eVar.g()));
        return F.a("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey", J11.b().toByteString(), E.c.SYMMETRIC, O.RAW, null);
    }

    public static h c(G g10) {
        if (!g10.c().J().equals("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmHkdfStreamingParameters.parseParameters: " + g10.c().J());
        }
        try {
            C6460p K11 = C6460p.K(g10.c().K(), C5910p.b());
            if (K11.I() == 0) {
                return f(K11.H(), K11.G());
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (A e11) {
            throw new GeneralSecurityException("Parsing AesGcmHkdfStreamingParameters failed: ", e11);
        }
    }

    public static G d(h hVar) {
        G.b L11 = f8.G.L();
        L11.j("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey");
        C6460p.b J11 = C6460p.J();
        J11.i(hVar.e());
        J11.j(g(hVar));
        L11.k(J11.b().toByteString());
        L11.i(O.RAW);
        return com.google.crypto.tink.internal.G.b(L11.b());
    }

    public static void e() throws GeneralSecurityException {
        u a11 = u.a();
        a11.i(f65075a);
        a11.h(f65076b);
        a11.g(f65077c);
        a11.f(f65078d);
    }

    private static h f(C6461q c6461q, int i11) throws GeneralSecurityException {
        h.b bVar;
        h.a aVar = new h.a();
        aVar.e(i11);
        aVar.c(c6461q.J());
        aVar.b(c6461q.H());
        EnumC6443A K11 = c6461q.K();
        int i12 = a.f65079a[K11.ordinal()];
        if (i12 == 1) {
            bVar = h.b.f64003b;
        } else if (i12 == 2) {
            bVar = h.b.f64004c;
        } else {
            if (i12 != 3) {
                throw new GeneralSecurityException("Unable to parse HashType: " + K11.getNumber());
            }
            bVar = h.b.f64005d;
        }
        aVar.d(bVar);
        return aVar.a();
    }

    private static C6461q g(h hVar) throws GeneralSecurityException {
        EnumC6443A enumC6443A;
        C6461q.b L11 = C6461q.L();
        L11.i(hVar.b());
        L11.j(hVar.c());
        h.b d11 = hVar.d();
        if (h.b.f64003b.equals(d11)) {
            enumC6443A = EnumC6443A.SHA1;
        } else if (h.b.f64004c.equals(d11)) {
            enumC6443A = EnumC6443A.SHA256;
        } else {
            if (!h.b.f64005d.equals(d11)) {
                throw new GeneralSecurityException("Unable to serialize HashType " + d11);
            }
            enumC6443A = EnumC6443A.SHA512;
        }
        L11.k(enumC6443A);
        return L11.b();
    }
}
