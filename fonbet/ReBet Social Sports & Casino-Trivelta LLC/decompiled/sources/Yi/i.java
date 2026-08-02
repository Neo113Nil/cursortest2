package Yi;

import org.spongycastle.crypto.o;
import org.spongycastle.crypto.params.w;
import org.spongycastle.crypto.v;

/* loaded from: classes5.dex */
public class i implements v {

    /* renamed from: a, reason: collision with root package name */
    public o f14310a;

    /* renamed from: b, reason: collision with root package name */
    public int f14311b;
    private byte[] inputPad = new byte[64];
    private byte[] outputPad = new byte[64];

    public i(o oVar) {
        this.f14310a = oVar;
        this.f14311b = oVar.getDigestSize();
    }

    @Override // org.spongycastle.crypto.v
    public void a(org.spongycastle.crypto.j jVar) {
        this.f14310a.reset();
        byte[] a10 = ((w) jVar).a();
        if (a10.length <= 64) {
            System.arraycopy(a10, 0, this.inputPad, 0, a10.length);
            int length = a10.length;
            while (true) {
                byte[] bArr = this.inputPad;
                if (length >= bArr.length) {
                    break;
                }
                bArr[length] = 0;
                length++;
            }
        } else {
            this.f14310a.update(a10, 0, a10.length);
            this.f14310a.doFinal(this.inputPad, 0);
            int i10 = this.f14311b;
            while (true) {
                byte[] bArr2 = this.inputPad;
                if (i10 >= bArr2.length) {
                    break;
                }
                bArr2[i10] = 0;
                i10++;
            }
        }
        byte[] bArr3 = this.inputPad;
        byte[] bArr4 = new byte[bArr3.length];
        this.outputPad = bArr4;
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        int i11 = 0;
        while (true) {
            byte[] bArr5 = this.inputPad;
            if (i11 >= bArr5.length) {
                break;
            }
            bArr5[i11] = (byte) (bArr5[i11] ^ 54);
            i11++;
        }
        int i12 = 0;
        while (true) {
            byte[] bArr6 = this.outputPad;
            if (i12 >= bArr6.length) {
                o oVar = this.f14310a;
                byte[] bArr7 = this.inputPad;
                oVar.update(bArr7, 0, bArr7.length);
                return;
            }
            bArr6[i12] = (byte) (bArr6[i12] ^ 92);
            i12++;
        }
    }

    @Override // org.spongycastle.crypto.v
    public int doFinal(byte[] bArr, int i10) {
        int i11 = this.f14311b;
        byte[] bArr2 = new byte[i11];
        this.f14310a.doFinal(bArr2, 0);
        o oVar = this.f14310a;
        byte[] bArr3 = this.outputPad;
        oVar.update(bArr3, 0, bArr3.length);
        this.f14310a.update(bArr2, 0, i11);
        int doFinal = this.f14310a.doFinal(bArr, i10);
        reset();
        return doFinal;
    }

    @Override // org.spongycastle.crypto.v
    public String getAlgorithmName() {
        return this.f14310a.getAlgorithmName() + "/HMAC";
    }

    @Override // org.spongycastle.crypto.v
    public int getMacSize() {
        return this.f14311b;
    }

    @Override // org.spongycastle.crypto.v
    public void reset() {
        this.f14310a.reset();
        o oVar = this.f14310a;
        byte[] bArr = this.inputPad;
        oVar.update(bArr, 0, bArr.length);
    }

    @Override // org.spongycastle.crypto.v
    public void update(byte b10) {
        this.f14310a.update(b10);
    }

    @Override // org.spongycastle.crypto.v
    public void update(byte[] bArr, int i10, int i11) {
        this.f14310a.update(bArr, i10, i11);
    }
}
