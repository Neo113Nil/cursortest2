package bj;

import java.security.SecureRandom;
import kotlin.UByte;
import org.spongycastle.crypto.r;

/* loaded from: classes5.dex */
public class g implements InterfaceC2427a {

    /* renamed from: a, reason: collision with root package name */
    public SecureRandom f25236a = null;

    @Override // bj.InterfaceC2427a
    public int addPadding(byte[] bArr, int i10) {
        byte length = (byte) (bArr.length - i10);
        while (i10 < bArr.length - 1) {
            SecureRandom secureRandom = this.f25236a;
            if (secureRandom == null) {
                bArr[i10] = 0;
            } else {
                bArr[i10] = (byte) secureRandom.nextInt();
            }
            i10++;
        }
        bArr[i10] = length;
        return length;
    }

    @Override // bj.InterfaceC2427a
    public void init(SecureRandom secureRandom) {
        this.f25236a = secureRandom;
    }

    @Override // bj.InterfaceC2427a
    public int padCount(byte[] bArr) {
        int i10 = bArr[bArr.length - 1] & UByte.MAX_VALUE;
        if (i10 <= bArr.length) {
            return i10;
        }
        throw new r("pad block corrupted");
    }
}
