package wj;

import dj.C4128a;
import java.security.SecureRandom;
import org.spongycastle.crypto.o;
import org.spongycastle.crypto.params.A;
import org.spongycastle.crypto.r;

/* renamed from: wj.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6767j {

    /* renamed from: a, reason: collision with root package name */
    public o f67794a;

    /* renamed from: b, reason: collision with root package name */
    public SecureRandom f67795b;

    /* renamed from: c, reason: collision with root package name */
    public int f67796c;

    /* renamed from: d, reason: collision with root package name */
    public int f67797d;

    /* renamed from: e, reason: collision with root package name */
    public int f67798e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f67799f;

    public int a(AbstractC6759b abstractC6759b) {
        throw new IllegalArgumentException("unsupported type");
    }

    public void b(boolean z10, org.spongycastle.crypto.j jVar) {
        this.f67799f = z10;
        if (!z10) {
            android.support.v4.media.session.b.a(jVar);
            c(null);
        } else if (!(jVar instanceof A)) {
            this.f67795b = new SecureRandom();
            android.support.v4.media.session.b.a(jVar);
            d(null);
        } else {
            A a10 = (A) jVar;
            this.f67795b = a10.b();
            android.support.v4.media.session.b.a(a10.a());
            d(null);
        }
    }

    public void c(AbstractC6761d abstractC6761d) {
        throw null;
    }

    public void d(AbstractC6762e abstractC6762e) {
        SecureRandom secureRandom = this.f67795b;
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
        }
        this.f67795b = secureRandom;
        throw null;
    }

    public byte[] e(byte[] bArr) {
        if (this.f67799f) {
            throw new IllegalStateException("cipher initialised for decryption");
        }
        int i10 = (this.f67796c + 7) >> 3;
        int length = bArr.length - i10;
        byte[][] c10 = zj.b.c(bArr, i10);
        byte[] bArr2 = c10[0];
        byte[] bArr3 = c10[1];
        zj.d[] a10 = AbstractC6760c.a(null, zj.d.b(this.f67796c, bArr2));
        byte[] c11 = a10[0].c();
        zj.d dVar = a10[1];
        C4128a c4128a = new C4128a(new org.spongycastle.crypto.digests.o());
        c4128a.a(c11);
        byte[] bArr4 = new byte[length];
        c4128a.g(bArr4);
        for (int i11 = 0; i11 < length; i11++) {
            bArr4[i11] = (byte) (bArr4[i11] ^ bArr3[i11]);
        }
        this.f67794a.update(bArr4, 0, length);
        byte[] bArr5 = new byte[this.f67794a.getDigestSize()];
        this.f67794a.doFinal(bArr5, 0);
        if (AbstractC6758a.b(this.f67796c, this.f67798e, bArr5).equals(dVar)) {
            return zj.b.c(bArr4, length - (this.f67797d >> 3))[0];
        }
        throw new r("Bad Padding: Invalid ciphertext.");
    }

    public byte[] f(byte[] bArr) {
        if (!this.f67799f) {
            throw new IllegalStateException("cipher initialised for decryption");
        }
        int i10 = this.f67797d >> 3;
        byte[] bArr2 = new byte[i10];
        this.f67795b.nextBytes(bArr2);
        zj.d dVar = new zj.d(this.f67797d, this.f67795b);
        byte[] c10 = dVar.c();
        byte[] a10 = zj.b.a(bArr, bArr2);
        this.f67794a.update(a10, 0, a10.length);
        byte[] bArr3 = new byte[this.f67794a.getDigestSize()];
        this.f67794a.doFinal(bArr3, 0);
        byte[] c11 = AbstractC6760c.b(null, dVar, AbstractC6758a.b(this.f67796c, this.f67798e, bArr3)).c();
        C4128a c4128a = new C4128a(new org.spongycastle.crypto.digests.o());
        c4128a.a(c10);
        byte[] bArr4 = new byte[bArr.length + i10];
        c4128a.g(bArr4);
        for (int i11 = 0; i11 < bArr.length; i11++) {
            bArr4[i11] = (byte) (bArr4[i11] ^ bArr[i11]);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            int length = bArr.length + i12;
            bArr4[length] = (byte) (bArr4[length] ^ bArr2[i12]);
        }
        return zj.b.a(c11, bArr4);
    }
}
