package Wi;

import java.math.BigInteger;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import org.spongycastle.crypto.InterfaceC5948a;
import org.spongycastle.crypto.j;
import org.spongycastle.crypto.params.A;
import org.spongycastle.crypto.params.E;
import org.spongycastle.crypto.r;

/* loaded from: classes5.dex */
public class a implements InterfaceC5948a {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC5948a f13315a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13316b;

    /* renamed from: c, reason: collision with root package name */
    public int f13317c;

    /* renamed from: d, reason: collision with root package name */
    public int f13318d = 0;

    /* renamed from: e, reason: collision with root package name */
    public BigInteger f13319e;

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f13313f = BigInteger.valueOf(16);

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f13314g = BigInteger.valueOf(6);
    private static byte[] shadows = {14, 3, 5, 8, 9, 4, 2, 15, 0, 13, 11, 6, 7, 10, 12, 1};
    private static byte[] inverse = {8, 15, 6, 1, 5, 2, 11, 12, 3, 4, 13, 10, 14, 9, 0, 7};

    public a(InterfaceC5948a interfaceC5948a) {
        this.f13315a = interfaceC5948a;
    }

    public static byte[] b(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] != 0) {
            return byteArray;
        }
        int length = byteArray.length - 1;
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 1, bArr, 0, length);
        return bArr;
    }

    private byte[] c(byte[] bArr, int i10, int i11) {
        byte[] processBlock = this.f13315a.processBlock(bArr, i10, i11);
        int i12 = (this.f13317c + 13) / 16;
        BigInteger bigInteger = new BigInteger(1, processBlock);
        BigInteger bigInteger2 = f13313f;
        BigInteger mod = bigInteger.mod(bigInteger2);
        BigInteger bigInteger3 = f13314g;
        if (!mod.equals(bigInteger3)) {
            if (!this.f13319e.subtract(bigInteger).mod(bigInteger2).equals(bigInteger3)) {
                throw new r("resulting integer iS or (modulus - iS) is not congruent to 6 mod 16");
            }
            bigInteger = this.f13319e.subtract(bigInteger);
        }
        byte[] b10 = b(bigInteger);
        if ((b10[b10.length - 1] & 15) != 6) {
            throw new r("invalid forcing byte in block");
        }
        b10[b10.length - 1] = (byte) (((b10[b10.length - 1] & UByte.MAX_VALUE) >>> 4) | (inverse[(b10[b10.length - 2] & UByte.MAX_VALUE) >> 4] << 4));
        byte[] bArr2 = shadows;
        byte b11 = b10[1];
        byte b12 = (byte) (bArr2[b11 & 15] | (bArr2[(b11 & UByte.MAX_VALUE) >>> 4] << 4));
        b10[0] = b12;
        int i13 = 1;
        int i14 = 0;
        boolean z10 = false;
        for (int length = b10.length - 1; length >= b10.length - (i12 * 2); length -= 2) {
            byte[] bArr3 = shadows;
            byte b13 = b10[length];
            int i15 = bArr3[b13 & 15] | (bArr3[(b13 & UByte.MAX_VALUE) >>> 4] << 4);
            int i16 = length - 1;
            byte b14 = b10[i16];
            if (((b14 ^ i15) & 255) != 0) {
                if (z10) {
                    throw new r("invalid tsums in block");
                }
                i13 = (b14 ^ i15) & 255;
                z10 = true;
                i14 = i16;
            }
        }
        b10[i14] = 0;
        int length2 = (b10.length - i14) / 2;
        byte[] bArr4 = new byte[length2];
        for (int i17 = 0; i17 < length2; i17++) {
            bArr4[i17] = b10[(i17 * 2) + i14 + 1];
        }
        this.f13318d = i13 - 1;
        return bArr4;
    }

    private byte[] d(byte[] bArr, int i10, int i11) {
        int i12 = this.f13317c;
        int i13 = (i12 + 7) / 8;
        byte[] bArr2 = new byte[i13];
        int i14 = 1;
        int i15 = this.f13318d + 1;
        int i16 = (i12 + 13) / 16;
        int i17 = 0;
        while (i17 < i16) {
            if (i17 > i16 - i11) {
                int i18 = i16 - i17;
                System.arraycopy(bArr, (i10 + i11) - i18, bArr2, i13 - i16, i18);
            } else {
                System.arraycopy(bArr, i10, bArr2, i13 - (i17 + i11), i11);
            }
            i17 += i11;
        }
        for (int i19 = i13 - (i16 * 2); i19 != i13; i19 += 2) {
            byte b10 = bArr2[(i13 - i16) + (i19 / 2)];
            byte[] bArr3 = shadows;
            bArr2[i19] = (byte) (bArr3[b10 & 15] | (bArr3[(b10 & UByte.MAX_VALUE) >>> 4] << 4));
            bArr2[i19 + 1] = b10;
        }
        int i20 = i13 - (i11 * 2);
        bArr2[i20] = (byte) (bArr2[i20] ^ i15);
        int i21 = i13 - 1;
        bArr2[i21] = (byte) ((bArr2[i21] << 4) | 6);
        int i22 = 8 - ((this.f13317c - 1) % 8);
        if (i22 != 8) {
            byte b11 = (byte) (bArr2[0] & (255 >>> i22));
            bArr2[0] = b11;
            bArr2[0] = (byte) ((128 >>> i22) | b11);
            i14 = 0;
        } else {
            bArr2[0] = 0;
            bArr2[1] = (byte) (bArr2[1] | ByteCompanionObject.MIN_VALUE);
        }
        return this.f13315a.processBlock(bArr2, i14, i13 - i14);
    }

    @Override // org.spongycastle.crypto.InterfaceC5948a
    public void a(boolean z10, j jVar) {
        E e10 = jVar instanceof A ? (E) ((A) jVar).a() : (E) jVar;
        this.f13315a.a(z10, jVar);
        BigInteger c10 = e10.c();
        this.f13319e = c10;
        this.f13317c = c10.bitLength();
        this.f13316b = z10;
    }

    @Override // org.spongycastle.crypto.InterfaceC5948a
    public int getInputBlockSize() {
        int inputBlockSize = this.f13315a.getInputBlockSize();
        return this.f13316b ? (inputBlockSize + 1) / 2 : inputBlockSize;
    }

    @Override // org.spongycastle.crypto.InterfaceC5948a
    public int getOutputBlockSize() {
        int outputBlockSize = this.f13315a.getOutputBlockSize();
        return this.f13316b ? outputBlockSize : (outputBlockSize + 1) / 2;
    }

    @Override // org.spongycastle.crypto.InterfaceC5948a
    public byte[] processBlock(byte[] bArr, int i10, int i11) {
        return this.f13316b ? d(bArr, i10, i11) : c(bArr, i10, i11);
    }
}
