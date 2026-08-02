package Xi;

import org.spongycastle.crypto.params.AbstractC5976c;
import org.spongycastle.crypto.params.AbstractC5977d;
import org.spongycastle.crypto.t;

/* loaded from: classes5.dex */
public class c extends b {
    @Override // Xi.b, org.spongycastle.crypto.i
    public byte[] a() {
        int i10 = this.f62626b;
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (true) {
            this.f62625a.nextBytes(bArr);
            AbstractC5976c.c(bArr);
            i11++;
            if (i11 >= 20 || (!AbstractC5977d.g(bArr, 0, i10) && AbstractC5977d.f(bArr, 0))) {
                break;
            }
        }
        if (AbstractC5977d.g(bArr, 0, i10) || !AbstractC5977d.f(bArr, 0)) {
            throw new IllegalStateException("Unable to generate DES-EDE key");
        }
        return bArr;
    }

    @Override // Xi.b, org.spongycastle.crypto.i
    public void b(t tVar) {
        this.f62625a = tVar.a();
        int b10 = (tVar.b() + 7) / 8;
        this.f62626b = b10;
        if (b10 == 0 || b10 == 21) {
            this.f62626b = 24;
        } else if (b10 == 14) {
            this.f62626b = 16;
        } else if (b10 != 24 && b10 != 16) {
            throw new IllegalArgumentException("DESede key must be 192 or 128 bits long.");
        }
    }
}
