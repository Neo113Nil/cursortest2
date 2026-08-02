package bj;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class h implements InterfaceC2427a {
    @Override // bj.InterfaceC2427a
    public int addPadding(byte[] bArr, int i10) {
        int length = bArr.length - i10;
        while (i10 < bArr.length) {
            bArr[i10] = 0;
            i10++;
        }
        return length;
    }

    @Override // bj.InterfaceC2427a
    public int padCount(byte[] bArr) {
        int length = bArr.length;
        while (length > 0 && bArr[length - 1] == 0) {
            length--;
        }
        return bArr.length - length;
    }

    @Override // bj.InterfaceC2427a
    public void init(SecureRandom secureRandom) {
    }
}
