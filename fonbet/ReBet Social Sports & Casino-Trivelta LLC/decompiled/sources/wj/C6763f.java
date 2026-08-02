package wj;

import java.security.SecureRandom;
import org.spongycastle.crypto.params.A;

/* renamed from: wj.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6763f {

    /* renamed from: a, reason: collision with root package name */
    public SecureRandom f67774a;

    /* renamed from: b, reason: collision with root package name */
    public int f67775b;

    /* renamed from: c, reason: collision with root package name */
    public int f67776c;

    /* renamed from: d, reason: collision with root package name */
    public int f67777d;

    /* renamed from: e, reason: collision with root package name */
    public int f67778e;

    /* renamed from: f, reason: collision with root package name */
    public int f67779f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractC6765h f67780g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f67781h;

    public final zj.d a(byte[] bArr) {
        byte[] bArr2 = new byte[this.f67778e + ((this.f67776c & 7) != 0 ? 1 : 0)];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[bArr.length] = 1;
        return zj.d.b(this.f67776c, bArr2);
    }

    public int b(AbstractC6765h abstractC6765h) {
        if (abstractC6765h instanceof k) {
            return ((k) abstractC6765h).f();
        }
        throw new IllegalArgumentException("unsupported type");
    }

    public void c(boolean z10, org.spongycastle.crypto.j jVar) {
        this.f67781h = z10;
        if (!z10) {
            k kVar = (k) jVar;
            this.f67780g = kVar;
            d(kVar);
        } else {
            if (!(jVar instanceof A)) {
                this.f67774a = new SecureRandom();
                android.support.v4.media.session.b.a(jVar);
                this.f67780g = null;
                android.support.v4.media.session.b.a(null);
                e(null);
                return;
            }
            A a10 = (A) jVar;
            this.f67774a = a10.b();
            android.support.v4.media.session.b.a(a10.a());
            this.f67780g = null;
            android.support.v4.media.session.b.a(null);
            e(null);
        }
    }

    public void d(k kVar) {
        this.f67775b = kVar.f();
        int e10 = kVar.e();
        this.f67776c = e10;
        this.f67778e = e10 >> 3;
        this.f67779f = this.f67775b >> 3;
    }

    public void e(l lVar) {
        SecureRandom secureRandom = this.f67774a;
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
        }
        this.f67774a = secureRandom;
        throw null;
    }

    public byte[] f(byte[] bArr) {
        if (this.f67781h) {
            throw new IllegalStateException("cipher initialised for decryption");
        }
        zj.d.b(this.f67775b, bArr);
        k kVar = (k) this.f67780g;
        kVar.b();
        kVar.c();
        kVar.j();
        kVar.g();
        kVar.h();
        kVar.d();
        kVar.i();
        throw null;
    }

    public byte[] g(byte[] bArr) {
        if (!this.f67781h) {
            throw new IllegalStateException("cipher initialised for decryption");
        }
        a(bArr);
        new zj.d(this.f67775b, this.f67777d, this.f67774a);
        android.support.v4.media.session.b.a(this.f67780g);
        throw null;
    }
}
