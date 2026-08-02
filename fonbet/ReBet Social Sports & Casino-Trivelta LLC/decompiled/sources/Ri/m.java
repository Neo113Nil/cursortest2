package Ri;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class m {
    public int a(org.spongycastle.math.ec.d dVar) {
        return (dVar.t() + 7) / 8;
    }

    public int b(org.spongycastle.math.ec.e eVar) {
        return (eVar.f() + 7) / 8;
    }

    public byte[] c(BigInteger bigInteger, int i10) {
        byte[] byteArray = bigInteger.toByteArray();
        if (i10 < byteArray.length) {
            byte[] bArr = new byte[i10];
            System.arraycopy(byteArray, byteArray.length - i10, bArr, 0, i10);
            return bArr;
        }
        if (i10 <= byteArray.length) {
            return byteArray;
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(byteArray, 0, bArr2, i10 - byteArray.length, byteArray.length);
        return bArr2;
    }
}
