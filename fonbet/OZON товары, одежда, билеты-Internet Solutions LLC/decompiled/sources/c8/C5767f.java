package c8;

import B3.D;
import S7.r;
import b8.g;
import b8.j;
import com.google.crypto.tink.internal.AbstractC5887f;
import com.google.crypto.tink.internal.AbstractC5889h;
import com.google.crypto.tink.internal.C5883b;
import com.google.crypto.tink.internal.F;
import com.google.crypto.tink.internal.G;
import com.google.crypto.tink.internal.M;
import com.google.crypto.tink.internal.u;
import com.google.crypto.tink.internal.x;
import com.google.crypto.tink.internal.z;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.AbstractC5903i;
import com.google.crypto.tink.shaded.protobuf.C5910p;
import f8.C;
import f8.C6444B;
import f8.D;
import f8.E;
import f8.EnumC6443A;
import f8.G;
import f8.O;
import j8.C7306a;
import j8.C7307b;
import java.security.GeneralSecurityException;

/* renamed from: c8.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5767f {

    /* renamed from: a, reason: collision with root package name */
    private static final C5883b<O, j.c> f56694a;

    /* renamed from: b, reason: collision with root package name */
    private static final C5883b<EnumC6443A, j.b> f56695b;

    /* renamed from: c, reason: collision with root package name */
    private static final z<j, G> f56696c;

    /* renamed from: d, reason: collision with root package name */
    private static final x<G> f56697d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC5889h<b8.g, F> f56698e;

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC5887f<F> f56699f;

    static {
        C7306a c11 = M.c("type.googleapis.com/google.crypto.tink.HmacKey");
        C5883b.a a11 = C5883b.a();
        a11.a(O.RAW, j.c.f55710e);
        a11.a(O.TINK, j.c.f55707b);
        a11.a(O.LEGACY, j.c.f55709d);
        a11.a(O.CRUNCHY, j.c.f55708c);
        f56694a = a11.b();
        C5883b.a a12 = C5883b.a();
        a12.a(EnumC6443A.SHA1, j.b.f55701b);
        a12.a(EnumC6443A.SHA224, j.b.f55702c);
        a12.a(EnumC6443A.SHA256, j.b.f55703d);
        a12.a(EnumC6443A.SHA384, j.b.f55704e);
        a12.a(EnumC6443A.SHA512, j.b.f55705f);
        f56695b = a12.b();
        f56696c = z.a(new C5766e(), j.class);
        f56697d = x.a(new P4.f(), c11);
        f56698e = AbstractC5889h.a(new Ek.a(), b8.g.class);
        f56699f = AbstractC5887f.a(new D(), c11);
    }

    public static G a(j jVar) {
        G.b L11 = f8.G.L();
        L11.j("type.googleapis.com/google.crypto.tink.HmacKey");
        C.b K11 = C.K();
        D.b J11 = f8.D.J();
        J11.j(jVar.c());
        J11.i(f56695b.c(jVar.d()));
        K11.j(J11.b());
        K11.i(jVar.e());
        L11.k(K11.b().toByteString());
        L11.i(f56694a.c(jVar.g()));
        return com.google.crypto.tink.internal.G.b(L11.b());
    }

    public static j b(com.google.crypto.tink.internal.G g10) {
        if (!g10.c().J().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: " + g10.c().J());
        }
        try {
            C L11 = C.L(g10.c().K(), C5910p.b());
            if (L11.J() != 0) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + L11.J());
            }
            j.a b11 = j.b();
            b11.c(L11.H());
            b11.d(L11.I().I());
            b11.b(f56695b.b(L11.I().H()));
            b11.e(f56694a.b(g10.c().I()));
            return b11.a();
        } catch (A e11) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e11);
        }
    }

    public static b8.g c(F f7, r rVar) {
        if (!f7.f().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            C6444B L11 = C6444B.L(f7.g(), C5910p.b());
            if (L11.J() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            j.a b11 = j.b();
            b11.c(L11.H().size());
            b11.d(L11.I().I());
            b11.b(f56695b.b(L11.I().H()));
            b11.e(f56694a.b(f7.e()));
            j a11 = b11.a();
            g.a g10 = b8.g.g();
            g10.d(a11);
            g10.c(C7307b.a(L11.H().n(), rVar));
            g10.b(f7.b());
            return g10.a();
        } catch (A | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static F d(b8.g gVar, r rVar) {
        C6444B.b K11 = C6444B.K();
        j i11 = gVar.i();
        D.b J11 = f8.D.J();
        J11.j(i11.c());
        J11.i(f56695b.c(i11.d()));
        K11.j(J11.b());
        byte[] d11 = gVar.h().d(rVar);
        K11.i(AbstractC5903i.e(0, d11.length, d11));
        return F.a("type.googleapis.com/google.crypto.tink.HmacKey", K11.b().toByteString(), E.c.SYMMETRIC, f56694a.c(gVar.i().g()), gVar.c());
    }

    public static void e() throws GeneralSecurityException {
        u a11 = u.a();
        a11.i(f56696c);
        a11.h(f56697d);
        a11.g(f56698e);
        a11.f(f56699f);
    }
}
