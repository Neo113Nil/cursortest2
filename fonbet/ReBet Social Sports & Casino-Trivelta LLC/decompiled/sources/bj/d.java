package bj;

import java.security.SecureRandom;
import kotlin.UByte;
import org.spongycastle.crypto.r;

/* loaded from: classes5.dex */
public class d implements InterfaceC2427a {
    @Override // bj.InterfaceC2427a
    public int addPadding(byte[] bArr, int i10) {
        byte length = (byte) (bArr.length - i10);
        while (i10 < bArr.length) {
            bArr[i10] = length;
            i10++;
        }
        return length;
    }

    @Override // bj.InterfaceC2427a
    public int padCount(byte[] bArr) {
        int i10 = bArr[bArr.length - 1] & UByte.MAX_VALUE;
        byte b10 = (byte) i10;
        boolean z10 = (i10 > bArr.length) | (i10 == 0);
        for (int i11 = 0; i11 < bArr.length; i11++) {
            z10 |= (bArr.length - i11 <= i10) & (bArr[i11] != b10);
        }
        if (z10) {
            throw new r("pad block corrupted");
        }
        return i10;
    }

    @Override // bj.InterfaceC2427a
    public void init(SecureRandom secureRandom) {
    }
}
