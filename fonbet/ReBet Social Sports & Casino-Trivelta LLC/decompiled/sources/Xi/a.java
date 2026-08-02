package Xi;

import org.spongycastle.crypto.n;
import org.spongycastle.crypto.o;
import org.spongycastle.crypto.params.v;

/* loaded from: classes5.dex */
public abstract class a implements org.spongycastle.crypto.m {

    /* renamed from: a, reason: collision with root package name */
    public int f13870a;

    /* renamed from: b, reason: collision with root package name */
    public o f13871b;
    private byte[] iv;
    private byte[] shared;

    public a(int i10, o oVar) {
        this.f13870a = i10;
        this.f13871b = oVar;
    }

    @Override // org.spongycastle.crypto.m
    public void a(n nVar) {
        if (!(nVar instanceof v)) {
            throw new IllegalArgumentException("KDF parameters required for generator");
        }
        v vVar = (v) nVar;
        this.shared = vVar.b();
        this.iv = vVar.a();
    }

    @Override // org.spongycastle.crypto.m
    public int generateBytes(byte[] bArr, int i10, int i11) {
        int i12 = i11;
        int i13 = i10;
        if (bArr.length - i12 < i13) {
            throw new org.spongycastle.crypto.l("output buffer too small");
        }
        long j10 = i12;
        int digestSize = this.f13871b.getDigestSize();
        if (j10 > 8589934591L) {
            throw new IllegalArgumentException("Output length too large");
        }
        long j11 = digestSize;
        int i14 = (int) (((j10 + j11) - 1) / j11);
        byte[] bArr2 = new byte[this.f13871b.getDigestSize()];
        byte[] bArr3 = new byte[4];
        Aj.f.d(this.f13870a, bArr3, 0);
        int i15 = this.f13870a & (-256);
        for (int i16 = 0; i16 < i14; i16++) {
            o oVar = this.f13871b;
            byte[] bArr4 = this.shared;
            oVar.update(bArr4, 0, bArr4.length);
            this.f13871b.update(bArr3, 0, 4);
            byte[] bArr5 = this.iv;
            if (bArr5 != null) {
                this.f13871b.update(bArr5, 0, bArr5.length);
            }
            this.f13871b.doFinal(bArr2, 0);
            if (i12 > digestSize) {
                System.arraycopy(bArr2, 0, bArr, i13, digestSize);
                i13 += digestSize;
                i12 -= digestSize;
            } else {
                System.arraycopy(bArr2, 0, bArr, i13, i12);
            }
            byte b10 = (byte) (bArr3[3] + 1);
            bArr3[3] = b10;
            if (b10 == 0) {
                i15 += 256;
                Aj.f.d(i15, bArr3, 0);
            }
        }
        this.f13871b.reset();
        return (int) j10;
    }
}
