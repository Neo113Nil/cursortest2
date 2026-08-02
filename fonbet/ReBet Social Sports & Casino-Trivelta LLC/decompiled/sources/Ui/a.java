package Ui;

import org.spongycastle.crypto.l;
import org.spongycastle.crypto.m;
import org.spongycastle.crypto.n;
import org.spongycastle.crypto.o;
import org.spongycastle.crypto.params.v;

/* loaded from: classes5.dex */
public class a implements m {

    /* renamed from: a, reason: collision with root package name */
    public o f12302a;

    /* renamed from: b, reason: collision with root package name */
    public int f12303b;
    private byte[] otherInfo;
    private byte[] shared;

    public a(o oVar) {
        this.f12302a = oVar;
        this.f12303b = oVar.getDigestSize();
    }

    @Override // org.spongycastle.crypto.m
    public void a(n nVar) {
        if (!(nVar instanceof v)) {
            throw new IllegalArgumentException("KDF parameters required for generator");
        }
        v vVar = (v) nVar;
        this.shared = vVar.b();
        this.otherInfo = vVar.a();
    }

    public final void b(int i10, byte[] bArr) {
        bArr[0] = (byte) (i10 >>> 24);
        bArr[1] = (byte) (i10 >>> 16);
        bArr[2] = (byte) (i10 >>> 8);
        bArr[3] = (byte) i10;
    }

    @Override // org.spongycastle.crypto.m
    public int generateBytes(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        if (bArr.length - i11 < i10) {
            throw new l("output buffer too small");
        }
        byte[] bArr2 = new byte[this.f12303b];
        byte[] bArr3 = new byte[4];
        this.f12302a.reset();
        int i14 = 1;
        if (i11 > this.f12303b) {
            i12 = 0;
            while (true) {
                b(i14, bArr3);
                this.f12302a.update(bArr3, 0, 4);
                o oVar = this.f12302a;
                byte[] bArr4 = this.shared;
                oVar.update(bArr4, 0, bArr4.length);
                o oVar2 = this.f12302a;
                byte[] bArr5 = this.otherInfo;
                oVar2.update(bArr5, 0, bArr5.length);
                this.f12302a.doFinal(bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i10 + i12, this.f12303b);
                int i15 = this.f12303b;
                i12 += i15;
                i13 = i14 + 1;
                if (i14 >= i11 / i15) {
                    break;
                }
                i14 = i13;
            }
            i14 = i13;
        } else {
            i12 = 0;
        }
        if (i12 < i11) {
            b(i14, bArr3);
            this.f12302a.update(bArr3, 0, 4);
            o oVar3 = this.f12302a;
            byte[] bArr6 = this.shared;
            oVar3.update(bArr6, 0, bArr6.length);
            o oVar4 = this.f12302a;
            byte[] bArr7 = this.otherInfo;
            oVar4.update(bArr7, 0, bArr7.length);
            this.f12302a.doFinal(bArr2, 0);
            System.arraycopy(bArr2, 0, bArr, i10 + i12, i11 - i12);
        }
        return i11;
    }
}
