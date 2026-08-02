package Xi;

import org.spongycastle.crypto.o;
import org.spongycastle.crypto.params.w;
import org.spongycastle.crypto.params.z;
import org.spongycastle.crypto.y;

/* loaded from: classes5.dex */
public class k extends y {

    /* renamed from: b, reason: collision with root package name */
    public o f13884b;

    public k(o oVar) {
        this.f13884b = oVar;
    }

    @Override // org.spongycastle.crypto.y
    public org.spongycastle.crypto.j d(int i10) {
        return e(i10);
    }

    @Override // org.spongycastle.crypto.y
    public org.spongycastle.crypto.j e(int i10) {
        int i11 = i10 / 8;
        if (i11 <= this.f13884b.getDigestSize()) {
            return new w(h(), 0, i11);
        }
        throw new IllegalArgumentException("Can't generate a derived key " + i11 + " bytes long.");
    }

    @Override // org.spongycastle.crypto.y
    public org.spongycastle.crypto.j f(int i10, int i11) {
        int i12 = i10 / 8;
        int i13 = i11 / 8;
        int i14 = i12 + i13;
        if (i14 <= this.f13884b.getDigestSize()) {
            byte[] h10 = h();
            return new z(new w(h10, 0, i12), h10, i12, i13);
        }
        throw new IllegalArgumentException("Can't generate a derived key " + i14 + " bytes long.");
    }

    public final byte[] h() {
        int digestSize = this.f13884b.getDigestSize();
        byte[] bArr = new byte[digestSize];
        o oVar = this.f13884b;
        byte[] bArr2 = this.password;
        oVar.update(bArr2, 0, bArr2.length);
        o oVar2 = this.f13884b;
        byte[] bArr3 = this.salt;
        oVar2.update(bArr3, 0, bArr3.length);
        this.f13884b.doFinal(bArr, 0);
        for (int i10 = 1; i10 < this.f62682a; i10++) {
            this.f13884b.update(bArr, 0, digestSize);
            this.f13884b.doFinal(bArr, 0);
        }
        return bArr;
    }
}
