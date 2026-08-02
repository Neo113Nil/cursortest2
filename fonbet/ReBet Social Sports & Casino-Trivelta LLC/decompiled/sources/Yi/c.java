package Yi;

import com.plaid.internal.EnumC3631g;
import kotlin.UByte;
import org.spongycastle.crypto.params.w;
import org.spongycastle.crypto.v;

/* loaded from: classes5.dex */
public class c implements v {
    private byte[] Lu;
    private byte[] Lu2;
    private byte[] ZEROES;

    /* renamed from: a, reason: collision with root package name */
    public int f14286a;

    /* renamed from: b, reason: collision with root package name */
    public org.spongycastle.crypto.e f14287b;
    private byte[] buf;

    /* renamed from: c, reason: collision with root package name */
    public int f14288c;
    private byte[] mac;
    private byte[] poly;

    public c(org.spongycastle.crypto.e eVar) {
        this(eVar, eVar.getBlockSize() * 8);
    }

    public static byte[] c(int i10) {
        int i11 = i10 * 8;
        int i12 = EnumC3631g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE;
        switch (i11) {
            case 64:
            case SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE:
                i12 = 27;
                break;
            case 128:
            case 192:
                break;
            case SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE:
                i12 = 45;
                break;
            case SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_CONFIRMED_CIRCLE_VALUE:
                i12 = 777;
                break;
            case 256:
                i12 = 1061;
                break;
            case 384:
                i12 = 4109;
                break;
            case 448:
                i12 = 2129;
                break;
            case 512:
                i12 = EnumC3631g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE;
                break;
            case 768:
                i12 = 655377;
                break;
            case 1024:
                i12 = 524355;
                break;
            case 2048:
                i12 = 548865;
                break;
            default:
                throw new IllegalArgumentException("Unknown block size for CMAC: " + i11);
        }
        return Aj.f.f(i12);
    }

    public static int d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i10 = 0;
        while (true) {
            length--;
            if (length < 0) {
                return i10;
            }
            int i11 = bArr[length] & UByte.MAX_VALUE;
            bArr2[length] = (byte) (i10 | (i11 << 1));
            i10 = (i11 >>> 7) & 1;
        }
    }

    @Override // org.spongycastle.crypto.v
    public void a(org.spongycastle.crypto.j jVar) {
        e(jVar);
        this.f14287b.a(true, jVar);
        byte[] bArr = this.ZEROES;
        byte[] bArr2 = new byte[bArr.length];
        this.f14287b.processBlock(bArr, 0, bArr2, 0);
        byte[] b10 = b(bArr2);
        this.Lu = b10;
        this.Lu2 = b(b10);
        reset();
    }

    public final byte[] b(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i10 = (-d(bArr, bArr2)) & 255;
        int length = bArr.length - 3;
        byte b10 = bArr2[length];
        byte[] bArr3 = this.poly;
        bArr2[length] = (byte) (b10 ^ (bArr3[1] & i10));
        int length2 = bArr.length - 2;
        bArr2[length2] = (byte) ((bArr3[2] & i10) ^ bArr2[length2]);
        int length3 = bArr.length - 1;
        bArr2[length3] = (byte) ((i10 & bArr3[3]) ^ bArr2[length3]);
        return bArr2;
    }

    @Override // org.spongycastle.crypto.v
    public int doFinal(byte[] bArr, int i10) {
        byte[] bArr2;
        if (this.f14286a == this.f14287b.getBlockSize()) {
            bArr2 = this.Lu;
        } else {
            new bj.c().addPadding(this.buf, this.f14286a);
            bArr2 = this.Lu2;
        }
        int i11 = 0;
        while (true) {
            byte[] bArr3 = this.mac;
            if (i11 >= bArr3.length) {
                this.f14287b.processBlock(this.buf, 0, bArr3, 0);
                System.arraycopy(this.mac, 0, bArr, i10, this.f14288c);
                reset();
                return this.f14288c;
            }
            byte[] bArr4 = this.buf;
            bArr4[i11] = (byte) (bArr4[i11] ^ bArr2[i11]);
            i11++;
        }
    }

    public void e(org.spongycastle.crypto.j jVar) {
        if (jVar != null && !(jVar instanceof w)) {
            throw new IllegalArgumentException("CMac mode only permits key to be set.");
        }
    }

    @Override // org.spongycastle.crypto.v
    public String getAlgorithmName() {
        return this.f14287b.getAlgorithmName();
    }

    @Override // org.spongycastle.crypto.v
    public int getMacSize() {
        return this.f14288c;
    }

    @Override // org.spongycastle.crypto.v
    public void reset() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.buf;
            if (i10 >= bArr.length) {
                this.f14286a = 0;
                this.f14287b.reset();
                return;
            } else {
                bArr[i10] = 0;
                i10++;
            }
        }
    }

    @Override // org.spongycastle.crypto.v
    public void update(byte b10) {
        int i10 = this.f14286a;
        byte[] bArr = this.buf;
        if (i10 == bArr.length) {
            this.f14287b.processBlock(bArr, 0, this.mac, 0);
            this.f14286a = 0;
        }
        byte[] bArr2 = this.buf;
        int i11 = this.f14286a;
        this.f14286a = i11 + 1;
        bArr2[i11] = b10;
    }

    public c(org.spongycastle.crypto.e eVar, int i10) {
        if (i10 % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        if (i10 > eVar.getBlockSize() * 8) {
            throw new IllegalArgumentException("MAC size must be less or equal to " + (eVar.getBlockSize() * 8));
        }
        this.f14287b = new Zi.b(eVar);
        this.f14288c = i10 / 8;
        this.poly = c(eVar.getBlockSize());
        this.mac = new byte[eVar.getBlockSize()];
        this.buf = new byte[eVar.getBlockSize()];
        this.ZEROES = new byte[eVar.getBlockSize()];
        this.f14286a = 0;
    }

    @Override // org.spongycastle.crypto.v
    public void update(byte[] bArr, int i10, int i11) {
        if (i11 >= 0) {
            int blockSize = this.f14287b.getBlockSize();
            int i12 = this.f14286a;
            int i13 = blockSize - i12;
            if (i11 > i13) {
                System.arraycopy(bArr, i10, this.buf, i12, i13);
                this.f14287b.processBlock(this.buf, 0, this.mac, 0);
                this.f14286a = 0;
                i11 -= i13;
                i10 += i13;
                while (i11 > blockSize) {
                    this.f14287b.processBlock(bArr, i10, this.mac, 0);
                    i11 -= blockSize;
                    i10 += blockSize;
                }
            }
            System.arraycopy(bArr, i10, this.buf, this.f14286a, i11);
            this.f14286a += i11;
            return;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}
