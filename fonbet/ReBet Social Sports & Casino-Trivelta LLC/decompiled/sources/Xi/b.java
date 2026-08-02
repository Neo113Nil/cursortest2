package Xi;

import org.spongycastle.crypto.params.AbstractC5976c;
import org.spongycastle.crypto.t;

/* loaded from: classes5.dex */
public class b extends org.spongycastle.crypto.i {
    @Override // org.spongycastle.crypto.i
    public byte[] a() {
        byte[] bArr = new byte[8];
        do {
            this.f62625a.nextBytes(bArr);
            AbstractC5976c.c(bArr);
        } while (AbstractC5976c.b(bArr, 0));
        return bArr;
    }

    @Override // org.spongycastle.crypto.i
    public void b(t tVar) {
        super.b(tVar);
        int i10 = this.f62626b;
        if (i10 == 0 || i10 == 7) {
            this.f62626b = 8;
        } else if (i10 != 8) {
            throw new IllegalArgumentException("DES key must be 64 bits long.");
        }
    }
}
