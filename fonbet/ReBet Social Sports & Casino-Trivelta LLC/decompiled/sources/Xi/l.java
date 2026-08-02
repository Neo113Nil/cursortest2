package Xi;

import org.spongycastle.crypto.o;
import org.spongycastle.crypto.params.w;
import org.spongycastle.crypto.params.z;
import org.spongycastle.crypto.v;
import org.spongycastle.crypto.y;

/* loaded from: classes5.dex */
public class l extends y {

    /* renamed from: b, reason: collision with root package name */
    public v f13885b;
    private byte[] state;

    public l(o oVar) {
        Yi.f fVar = new Yi.f(oVar);
        this.f13885b = fVar;
        this.state = new byte[fVar.getMacSize()];
    }

    private byte[] i(int i10) {
        int i11;
        int macSize = this.f13885b.getMacSize();
        int i12 = ((i10 + macSize) - 1) / macSize;
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[i12 * macSize];
        this.f13885b.a(new w(this.password));
        int i13 = 0;
        for (int i14 = 1; i14 <= i12; i14++) {
            while (true) {
                byte b10 = (byte) (bArr[i11] + 1);
                bArr[i11] = b10;
                i11 = b10 == 0 ? i11 - 1 : 3;
            }
            h(this.salt, this.f62682a, bArr, bArr2, i13);
            i13 += macSize;
        }
        return bArr2;
    }

    @Override // org.spongycastle.crypto.y
    public org.spongycastle.crypto.j d(int i10) {
        return e(i10);
    }

    @Override // org.spongycastle.crypto.y
    public org.spongycastle.crypto.j e(int i10) {
        int i11 = i10 / 8;
        return new w(Aj.a.l(i(i11), 0, i11), 0, i11);
    }

    @Override // org.spongycastle.crypto.y
    public org.spongycastle.crypto.j f(int i10, int i11) {
        int i12 = i10 / 8;
        int i13 = i11 / 8;
        byte[] i14 = i(i12 + i13);
        return new z(new w(i14, 0, i12), i14, i12, i13);
    }

    public final void h(byte[] bArr, int i10, byte[] bArr2, byte[] bArr3, int i11) {
        if (i10 == 0) {
            throw new IllegalArgumentException("iteration count must be at least 1.");
        }
        if (bArr != null) {
            this.f13885b.update(bArr, 0, bArr.length);
        }
        this.f13885b.update(bArr2, 0, bArr2.length);
        this.f13885b.doFinal(this.state, 0);
        byte[] bArr4 = this.state;
        System.arraycopy(bArr4, 0, bArr3, i11, bArr4.length);
        for (int i12 = 1; i12 < i10; i12++) {
            v vVar = this.f13885b;
            byte[] bArr5 = this.state;
            vVar.update(bArr5, 0, bArr5.length);
            this.f13885b.doFinal(this.state, 0);
            int i13 = 0;
            while (true) {
                byte[] bArr6 = this.state;
                if (i13 != bArr6.length) {
                    int i14 = i11 + i13;
                    bArr3[i14] = (byte) (bArr6[i13] ^ bArr3[i14]);
                    i13++;
                }
            }
        }
    }
}
