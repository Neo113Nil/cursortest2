package i8;

import b8.C5581a;
import b8.C5584d;
import b8.j;
import d8.C6099a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes9.dex */
public final class q implements S7.p {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f66129e = {0};

    /* renamed from: a, reason: collision with root package name */
    private final d8.c f66130a;

    /* renamed from: b, reason: collision with root package name */
    private final int f66131b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f66132c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f66133d;

    public q(p pVar, int i11) throws GeneralSecurityException {
        this.f66130a = pVar;
        this.f66131b = i11;
        this.f66132c = new byte[0];
        this.f66133d = new byte[0];
        if (i11 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        pVar.a(i11, new byte[0]);
    }

    public static q b(C5581a c5581a) throws GeneralSecurityException {
        return new q(c5581a);
    }

    public static q c(b8.g gVar) throws GeneralSecurityException {
        return new q(gVar);
    }

    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = this.f66133d;
        int length = bArr2.length;
        int i11 = this.f66131b;
        d8.c cVar = this.f66130a;
        byte[] bArr3 = this.f66132c;
        return length > 0 ? h.a(bArr3, cVar.a(i11, h.a(bArr, bArr2))) : h.a(bArr3, cVar.a(i11, bArr));
    }

    private q(C5581a c5581a) throws GeneralSecurityException {
        this.f66130a = o.b(C6099a.e(d8.b.b(c5581a.i().d()), c5581a.h()));
        this.f66131b = c5581a.i().c();
        this.f66132c = c5581a.e().d();
        if (c5581a.i().f().equals(C5584d.b.f55675d)) {
            this.f66133d = Arrays.copyOf(f66129e, 1);
        } else {
            this.f66133d = new byte[0];
        }
    }

    private q(b8.g gVar) throws GeneralSecurityException {
        this.f66130a = new p("HMAC" + gVar.i().d(), new SecretKeySpec(gVar.h().d(S7.e.a()), "HMAC"));
        this.f66131b = gVar.i().c();
        this.f66132c = gVar.e().d();
        if (gVar.i().g().equals(j.c.f55709d)) {
            this.f66133d = Arrays.copyOf(f66129e, 1);
        } else {
            this.f66133d = new byte[0];
        }
    }
}
