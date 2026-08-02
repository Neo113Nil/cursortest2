package wj;

import dj.C4128a;
import java.security.SecureRandom;
import org.spongycastle.crypto.o;
import org.spongycastle.crypto.params.A;
import org.spongycastle.crypto.r;

/* renamed from: wj.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6764g {

    /* renamed from: a, reason: collision with root package name */
    public o f67782a;

    /* renamed from: b, reason: collision with root package name */
    public SecureRandom f67783b;

    /* renamed from: c, reason: collision with root package name */
    public int f67784c;

    /* renamed from: d, reason: collision with root package name */
    public int f67785d;

    /* renamed from: e, reason: collision with root package name */
    public int f67786e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f67787f;

    public int a(AbstractC6759b abstractC6759b) {
        throw new IllegalArgumentException("unsupported type");
    }

    public void b(boolean z10, org.spongycastle.crypto.j jVar) {
        this.f67787f = z10;
        if (!z10) {
            android.support.v4.media.session.b.a(jVar);
            c(null);
        } else if (!(jVar instanceof A)) {
            this.f67783b = new SecureRandom();
            android.support.v4.media.session.b.a(jVar);
            d(null);
        } else {
            A a10 = (A) jVar;
            this.f67783b = a10.b();
            android.support.v4.media.session.b.a(a10.a());
            d(null);
        }
    }

    public void c(AbstractC6761d abstractC6761d) {
        throw null;
    }

    public final void d(AbstractC6762e abstractC6762e) {
        SecureRandom secureRandom = this.f67783b;
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
        }
        this.f67783b = secureRandom;
        throw null;
    }

    public byte[] e(byte[] bArr) {
        if (this.f67787f) {
            throw new IllegalStateException("cipher initialised for decryption");
        }
        int i10 = (this.f67784c + 7) >> 3;
        int length = bArr.length - i10;
        byte[][] c10 = zj.b.c(bArr, i10);
        byte[] bArr2 = c10[0];
        byte[] bArr3 = c10[1];
        zj.d[] a10 = AbstractC6760c.a(null, zj.d.b(this.f67784c, bArr2));
        byte[] c11 = a10[0].c();
        zj.d dVar = a10[1];
        C4128a c4128a = new C4128a(new org.spongycastle.crypto.digests.o());
        c4128a.a(c11);
        byte[] bArr4 = new byte[length];
        c4128a.g(bArr4);
        for (int i11 = 0; i11 < length; i11++) {
            bArr4[i11] = (byte) (bArr4[i11] ^ bArr3[i11]);
        }
        byte[] a11 = zj.b.a(c11, bArr4);
        byte[] bArr5 = new byte[this.f67782a.getDigestSize()];
        this.f67782a.update(a11, 0, a11.length);
        this.f67782a.doFinal(bArr5, 0);
        if (AbstractC6758a.b(this.f67784c, this.f67786e, bArr5).equals(dVar)) {
            return bArr4;
        }
        throw new r("Bad Padding: invalid ciphertext");
    }

    public byte[] f(byte[] bArr) {
        if (!this.f67787f) {
            throw new IllegalStateException("cipher initialised for decryption");
        }
        zj.d dVar = new zj.d(this.f67785d, this.f67783b);
        byte[] c10 = dVar.c();
        byte[] a10 = zj.b.a(c10, bArr);
        this.f67782a.update(a10, 0, a10.length);
        byte[] bArr2 = new byte[this.f67782a.getDigestSize()];
        this.f67782a.doFinal(bArr2, 0);
        byte[] c11 = AbstractC6760c.b(null, dVar, AbstractC6758a.b(this.f67784c, this.f67786e, bArr2)).c();
        C4128a c4128a = new C4128a(new org.spongycastle.crypto.digests.o());
        c4128a.a(c10);
        byte[] bArr3 = new byte[bArr.length];
        c4128a.g(bArr3);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr3[i10] = (byte) (bArr3[i10] ^ bArr[i10]);
        }
        return zj.b.a(c11, bArr3);
    }
}
