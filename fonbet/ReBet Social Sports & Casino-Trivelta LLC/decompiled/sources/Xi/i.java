package Xi;

import ej.AbstractC4217a;
import org.spongycastle.crypto.o;
import org.spongycastle.crypto.params.w;
import org.spongycastle.crypto.params.z;
import org.spongycastle.crypto.y;

/* loaded from: classes5.dex */
public class i extends y {

    /* renamed from: b, reason: collision with root package name */
    public o f13880b = AbstractC4217a.a();

    @Override // org.spongycastle.crypto.y
    public org.spongycastle.crypto.j d(int i10) {
        return e(i10);
    }

    @Override // org.spongycastle.crypto.y
    public org.spongycastle.crypto.j e(int i10) {
        int i11 = i10 / 8;
        return new w(h(i11), 0, i11);
    }

    @Override // org.spongycastle.crypto.y
    public org.spongycastle.crypto.j f(int i10, int i11) {
        int i12 = i10 / 8;
        int i13 = i11 / 8;
        byte[] h10 = h(i12 + i13);
        return new z(new w(h10, 0, i12), h10, i12, i13);
    }

    public final byte[] h(int i10) {
        int digestSize = this.f13880b.getDigestSize();
        byte[] bArr = new byte[digestSize];
        byte[] bArr2 = new byte[i10];
        int i11 = 0;
        while (true) {
            o oVar = this.f13880b;
            byte[] bArr3 = this.password;
            oVar.update(bArr3, 0, bArr3.length);
            o oVar2 = this.f13880b;
            byte[] bArr4 = this.salt;
            oVar2.update(bArr4, 0, bArr4.length);
            this.f13880b.doFinal(bArr, 0);
            int i12 = i10 > digestSize ? digestSize : i10;
            System.arraycopy(bArr, 0, bArr2, i11, i12);
            i11 += i12;
            i10 -= i12;
            if (i10 == 0) {
                return bArr2;
            }
            this.f13880b.reset();
            this.f13880b.update(bArr, 0, digestSize);
        }
    }

    public void i(byte[] bArr, byte[] bArr2) {
        super.g(bArr, bArr2, 1);
    }
}
