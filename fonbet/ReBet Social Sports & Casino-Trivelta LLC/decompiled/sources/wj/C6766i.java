package wj;

import dj.C4128a;
import java.security.SecureRandom;
import org.spongycastle.crypto.o;
import org.spongycastle.crypto.params.A;
import org.spongycastle.crypto.r;

/* renamed from: wj.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6766i {
    public static final byte[] PUBLIC_CONSTANT = "a predetermined public constant".getBytes();

    /* renamed from: a, reason: collision with root package name */
    public o f67788a;

    /* renamed from: b, reason: collision with root package name */
    public SecureRandom f67789b;

    /* renamed from: c, reason: collision with root package name */
    public int f67790c;

    /* renamed from: d, reason: collision with root package name */
    public int f67791d;

    /* renamed from: e, reason: collision with root package name */
    public int f67792e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f67793f;

    public int a(AbstractC6759b abstractC6759b) {
        throw new IllegalArgumentException("unsupported type");
    }

    public void b(boolean z10, org.spongycastle.crypto.j jVar) {
        this.f67793f = z10;
        if (!z10) {
            android.support.v4.media.session.b.a(jVar);
            c(null);
        } else if (!(jVar instanceof A)) {
            this.f67789b = new SecureRandom();
            android.support.v4.media.session.b.a(jVar);
            d(null);
        } else {
            A a10 = (A) jVar;
            this.f67789b = a10.b();
            android.support.v4.media.session.b.a(a10.a());
            d(null);
        }
    }

    public void c(AbstractC6761d abstractC6761d) {
        throw null;
    }

    public final void d(AbstractC6762e abstractC6762e) {
        throw null;
    }

    public byte[] e(byte[] bArr) {
        byte[] bArr2;
        if (this.f67793f) {
            throw new IllegalStateException("cipher initialised for decryption");
        }
        int i10 = this.f67790c >> 3;
        if (bArr.length < i10) {
            throw new r("Bad Padding: Ciphertext too short.");
        }
        int digestSize = this.f67788a.getDigestSize();
        int i11 = this.f67791d >> 3;
        int length = bArr.length - i10;
        if (length > 0) {
            byte[][] c10 = zj.b.c(bArr, length);
            bArr2 = c10[0];
            bArr = c10[1];
        } else {
            bArr2 = new byte[0];
        }
        zj.d[] a10 = AbstractC6760c.a(null, zj.d.b(this.f67790c, bArr));
        byte[] c11 = a10[0].c();
        zj.d dVar = a10[1];
        if (c11.length > i11) {
            c11 = zj.b.d(c11, 0, i11);
        }
        byte[] a11 = zj.b.a(zj.b.a(bArr2, AbstractC6758a.a(this.f67790c, this.f67792e, dVar)), c11);
        int length2 = a11.length - digestSize;
        byte[][] c12 = zj.b.c(a11, digestSize);
        byte[] bArr3 = c12[0];
        byte[] bArr4 = c12[1];
        byte[] bArr5 = new byte[this.f67788a.getDigestSize()];
        this.f67788a.update(bArr4, 0, bArr4.length);
        this.f67788a.doFinal(bArr5, 0);
        for (int i12 = digestSize - 1; i12 >= 0; i12--) {
            bArr5[i12] = (byte) (bArr5[i12] ^ bArr3[i12]);
        }
        C4128a c4128a = new C4128a(new org.spongycastle.crypto.digests.o());
        c4128a.a(bArr5);
        byte[] bArr6 = new byte[length2];
        c4128a.g(bArr6);
        for (int i13 = length2 - 1; i13 >= 0; i13--) {
            bArr6[i13] = (byte) (bArr6[i13] ^ bArr4[i13]);
        }
        byte[] bArr7 = PUBLIC_CONSTANT;
        byte[][] c13 = zj.b.c(bArr6, length2 - bArr7.length);
        byte[] bArr8 = c13[0];
        if (zj.b.b(c13[1], bArr7)) {
            return bArr8;
        }
        throw new r("Bad Padding: invalid ciphertext");
    }

    public byte[] f(byte[] bArr) {
        if (!this.f67793f) {
            throw new IllegalStateException("cipher initialised for decryption");
        }
        int digestSize = this.f67788a.getDigestSize();
        int i10 = this.f67791d >> 3;
        int bitLength = (zj.g.a(this.f67790c, this.f67792e).bitLength() - 1) >> 3;
        byte[] bArr2 = PUBLIC_CONSTANT;
        int length = ((i10 + bitLength) - digestSize) - bArr2.length;
        if (bArr.length > length) {
            length = bArr.length;
        }
        int length2 = bArr2.length + length;
        int i11 = ((length2 + digestSize) - i10) - bitLength;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, length, bArr2.length);
        byte[] bArr4 = new byte[digestSize];
        this.f67789b.nextBytes(bArr4);
        C4128a c4128a = new C4128a(new org.spongycastle.crypto.digests.o());
        c4128a.a(bArr4);
        byte[] bArr5 = new byte[length2];
        c4128a.g(bArr5);
        for (int i12 = length2 - 1; i12 >= 0; i12--) {
            bArr5[i12] = (byte) (bArr5[i12] ^ bArr3[i12]);
        }
        byte[] bArr6 = new byte[this.f67788a.getDigestSize()];
        this.f67788a.update(bArr5, 0, length2);
        this.f67788a.doFinal(bArr6, 0);
        for (int i13 = digestSize - 1; i13 >= 0; i13--) {
            bArr6[i13] = (byte) (bArr6[i13] ^ bArr4[i13]);
        }
        byte[] a10 = zj.b.a(bArr6, bArr5);
        byte[] bArr7 = new byte[0];
        if (i11 > 0) {
            bArr7 = new byte[i11];
            System.arraycopy(a10, 0, bArr7, 0, i11);
        }
        byte[] bArr8 = new byte[bitLength];
        System.arraycopy(a10, i11, bArr8, 0, bitLength);
        byte[] bArr9 = new byte[i10];
        System.arraycopy(a10, bitLength + i11, bArr9, 0, i10);
        byte[] c10 = AbstractC6760c.b(null, zj.d.b(this.f67791d, bArr9), AbstractC6758a.b(this.f67790c, this.f67792e, bArr8)).c();
        return i11 > 0 ? zj.b.a(bArr7, c10) : c10;
    }
}
