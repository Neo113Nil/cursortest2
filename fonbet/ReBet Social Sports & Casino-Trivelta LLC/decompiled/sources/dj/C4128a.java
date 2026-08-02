package dj;

import org.spongycastle.crypto.o;

/* renamed from: dj.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C4128a {

    /* renamed from: d, reason: collision with root package name */
    public static long f45444d = 10;

    /* renamed from: c, reason: collision with root package name */
    public o f45447c;
    private byte[] seed;
    private byte[] state;

    /* renamed from: b, reason: collision with root package name */
    public long f45446b = 1;

    /* renamed from: a, reason: collision with root package name */
    public long f45445a = 1;

    public C4128a(o oVar) {
        this.f45447c = oVar;
        this.seed = new byte[oVar.getDigestSize()];
        this.state = new byte[oVar.getDigestSize()];
    }

    public void a(byte[] bArr) {
        synchronized (this) {
            e(bArr);
            e(this.seed);
            d(this.seed);
        }
    }

    public final void b() {
        e(this.seed);
        long j10 = this.f45446b;
        this.f45446b = 1 + j10;
        c(j10);
        d(this.seed);
    }

    public final void c(long j10) {
        for (int i10 = 0; i10 != 8; i10++) {
            this.f45447c.update((byte) j10);
            j10 >>>= 8;
        }
    }

    public final void d(byte[] bArr) {
        this.f45447c.doFinal(bArr, 0);
    }

    public final void e(byte[] bArr) {
        this.f45447c.update(bArr, 0, bArr.length);
    }

    public final void f() {
        long j10 = this.f45445a;
        this.f45445a = 1 + j10;
        c(j10);
        e(this.state);
        e(this.seed);
        d(this.state);
        if (this.f45445a % f45444d == 0) {
            b();
        }
    }

    public void g(byte[] bArr) {
        h(bArr, 0, bArr.length);
    }

    public void h(byte[] bArr, int i10, int i11) {
        synchronized (this) {
            try {
                f();
                int i12 = i11 + i10;
                int i13 = 0;
                while (i10 != i12) {
                    if (i13 == this.state.length) {
                        f();
                        i13 = 0;
                    }
                    bArr[i10] = this.state[i13];
                    i10++;
                    i13++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
