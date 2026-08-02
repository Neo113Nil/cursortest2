package Yi;

import kotlin.UByte;
import org.bouncycastle.math.ec.Tnaf;
import org.spongycastle.crypto.params.B;
import org.spongycastle.crypto.params.w;
import org.spongycastle.crypto.v;

/* loaded from: classes5.dex */
public class e implements v {

    /* renamed from: a, reason: collision with root package name */
    public int f14292a = 8;

    /* renamed from: b, reason: collision with root package name */
    public int f14293b = 4;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14295d = true;
    private int[] workingKey = null;

    /* renamed from: S, reason: collision with root package name */
    private byte[] f14291S = {9, 6, 3, 2, 8, 11, 1, 7, 10, 4, 14, 15, 12, 0, 13, 5, 3, 7, 14, 9, 8, 10, 15, 0, 5, 2, 6, 12, 11, 4, 13, 1, 14, 4, 6, 2, 11, 3, 13, 8, 12, 15, 5, 10, 0, 7, 1, 9, 14, 7, 10, 12, 13, 1, 3, 9, 0, 2, 11, 4, 15, 8, 5, 6, 11, 5, 1, 9, 8, 13, 15, 0, 14, 4, 2, 3, 12, 7, 10, 6, 3, 10, 13, 12, 1, 2, 0, 11, 7, 5, 9, 4, 8, 15, 14, 6, 1, 13, 2, 9, 7, 10, 6, 0, 8, 12, 4, 5, 15, 3, 11, 14, 11, 10, 15, 5, 0, 12, 14, 8, 6, 2, 3, 9, 1, 7, 13, 4};
    private byte[] mac = new byte[8];
    private byte[] buf = new byte[8];

    /* renamed from: c, reason: collision with root package name */
    public int f14294c = 0;

    @Override // org.spongycastle.crypto.v
    public void a(org.spongycastle.crypto.j jVar) {
        reset();
        this.buf = new byte[this.f14292a];
        if (jVar instanceof B) {
            B b10 = (B) jVar;
            System.arraycopy(b10.b(), 0, this.f14291S, 0, b10.b().length);
            if (b10.a() != null) {
                this.workingKey = d(((w) b10.a()).a());
                return;
            }
            return;
        }
        if (jVar instanceof w) {
            this.workingKey = d(((w) jVar).a());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to GOST28147 init - " + jVar.getClass().getName());
    }

    public final byte[] b(byte[] bArr, int i10, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length - i10];
        System.arraycopy(bArr, i10, bArr3, 0, bArr2.length);
        for (int i11 = 0; i11 != bArr2.length; i11++) {
            bArr3[i11] = (byte) (bArr3[i11] ^ bArr2[i11]);
        }
        return bArr3;
    }

    public final int c(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] << 24) & (-16777216)) + ((bArr[i10 + 2] << Tnaf.POW_2_WIDTH) & 16711680) + ((bArr[i10 + 1] << 8) & 65280) + (bArr[i10] & UByte.MAX_VALUE);
    }

    public final int[] d(byte[] bArr) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
        }
        int[] iArr = new int[8];
        for (int i10 = 0; i10 != 8; i10++) {
            iArr[i10] = c(bArr, i10 * 4);
        }
        return iArr;
    }

    @Override // org.spongycastle.crypto.v
    public int doFinal(byte[] bArr, int i10) {
        while (true) {
            int i11 = this.f14294c;
            if (i11 >= this.f14292a) {
                break;
            }
            this.buf[i11] = 0;
            this.f14294c = i11 + 1;
        }
        byte[] bArr2 = this.buf;
        byte[] bArr3 = new byte[bArr2.length];
        System.arraycopy(bArr2, 0, bArr3, 0, this.mac.length);
        if (this.f14295d) {
            this.f14295d = false;
        } else {
            bArr3 = b(this.buf, 0, this.mac);
        }
        e(this.workingKey, bArr3, 0, this.mac, 0);
        byte[] bArr4 = this.mac;
        int length = bArr4.length / 2;
        int i12 = this.f14293b;
        System.arraycopy(bArr4, length - i12, bArr, i10, i12);
        reset();
        return this.f14293b;
    }

    public final void e(int[] iArr, byte[] bArr, int i10, byte[] bArr2, int i11) {
        int c10 = c(bArr, i10);
        int c11 = c(bArr, i10 + 4);
        for (int i12 = 0; i12 < 2; i12++) {
            int i13 = 0;
            while (i13 < 8) {
                int f10 = c11 ^ f(c10, iArr[i13]);
                i13++;
                int i14 = c10;
                c10 = f10;
                c11 = i14;
            }
        }
        g(c10, bArr2, i11);
        g(c11, bArr2, i11 + 4);
    }

    public final int f(int i10, int i11) {
        int i12 = i11 + i10;
        byte[] bArr = this.f14291S;
        int i13 = bArr[i12 & 15] + (bArr[((i12 >> 4) & 15) + 16] << 4) + (bArr[((i12 >> 8) & 15) + 32] << 8) + (bArr[((i12 >> 12) & 15) + 48] << 12) + (bArr[((i12 >> 16) & 15) + 64] << Tnaf.POW_2_WIDTH) + (bArr[((i12 >> 20) & 15) + 80] << 20) + (bArr[((i12 >> 24) & 15) + 96] << 24) + (bArr[((i12 >> 28) & 15) + 112] << 28);
        return (i13 << 11) | (i13 >>> 21);
    }

    public final void g(int i10, byte[] bArr, int i11) {
        bArr[i11 + 3] = (byte) (i10 >>> 24);
        bArr[i11 + 2] = (byte) (i10 >>> 16);
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11] = (byte) i10;
    }

    @Override // org.spongycastle.crypto.v
    public String getAlgorithmName() {
        return "GOST28147Mac";
    }

    @Override // org.spongycastle.crypto.v
    public int getMacSize() {
        return this.f14293b;
    }

    @Override // org.spongycastle.crypto.v
    public void reset() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.buf;
            if (i10 >= bArr.length) {
                this.f14294c = 0;
                this.f14295d = true;
                return;
            } else {
                bArr[i10] = 0;
                i10++;
            }
        }
    }

    @Override // org.spongycastle.crypto.v
    public void update(byte b10) {
        e eVar;
        int i10 = this.f14294c;
        byte[] bArr = this.buf;
        if (i10 == bArr.length) {
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, this.mac.length);
            if (this.f14295d) {
                this.f14295d = false;
            } else {
                bArr2 = b(this.buf, 0, this.mac);
            }
            eVar = this;
            eVar.e(this.workingKey, bArr2, 0, this.mac, 0);
            eVar.f14294c = 0;
        } else {
            eVar = this;
        }
        byte[] bArr3 = eVar.buf;
        int i11 = eVar.f14294c;
        eVar.f14294c = i11 + 1;
        bArr3[i11] = b10;
    }

    @Override // org.spongycastle.crypto.v
    public void update(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        if (i11 >= 0) {
            int i14 = this.f14292a;
            int i15 = this.f14294c;
            int i16 = i14 - i15;
            if (i11 > i16) {
                System.arraycopy(bArr, i10, this.buf, i15, i16);
                byte[] bArr2 = this.buf;
                byte[] bArr3 = new byte[bArr2.length];
                System.arraycopy(bArr2, 0, bArr3, 0, this.mac.length);
                if (this.f14295d) {
                    this.f14295d = false;
                } else {
                    bArr3 = b(this.buf, 0, this.mac);
                }
                e(this.workingKey, bArr3, 0, this.mac, 0);
                this.f14294c = 0;
                i13 = i11 - i16;
                i12 = i10 + i16;
                while (i13 > this.f14292a) {
                    e(this.workingKey, b(bArr, i12, this.mac), 0, this.mac, 0);
                    int i17 = this.f14292a;
                    i13 -= i17;
                    i12 += i17;
                }
            } else {
                i12 = i10;
                i13 = i11;
            }
            System.arraycopy(bArr, i12, this.buf, this.f14294c, i13);
            this.f14294c += i13;
            return;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}
