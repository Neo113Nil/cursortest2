package Yi;

import bj.InterfaceC2427a;
import org.spongycastle.crypto.v;

/* loaded from: classes5.dex */
public class a implements v {

    /* renamed from: a, reason: collision with root package name */
    public int f14278a;

    /* renamed from: b, reason: collision with root package name */
    public org.spongycastle.crypto.e f14279b;
    private byte[] buf;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC2427a f14280c;

    /* renamed from: d, reason: collision with root package name */
    public int f14281d;
    private byte[] mac;

    public a(org.spongycastle.crypto.e eVar) {
        this(eVar, (eVar.getBlockSize() * 8) / 2, null);
    }

    @Override // org.spongycastle.crypto.v
    public void a(org.spongycastle.crypto.j jVar) {
        reset();
        this.f14279b.a(true, jVar);
    }

    @Override // org.spongycastle.crypto.v
    public int doFinal(byte[] bArr, int i10) {
        int blockSize = this.f14279b.getBlockSize();
        if (this.f14280c == null) {
            while (true) {
                int i11 = this.f14278a;
                if (i11 >= blockSize) {
                    break;
                }
                this.buf[i11] = 0;
                this.f14278a = i11 + 1;
            }
        } else {
            if (this.f14278a == blockSize) {
                this.f14279b.processBlock(this.buf, 0, this.mac, 0);
                this.f14278a = 0;
            }
            this.f14280c.addPadding(this.buf, this.f14278a);
        }
        this.f14279b.processBlock(this.buf, 0, this.mac, 0);
        System.arraycopy(this.mac, 0, bArr, i10, this.f14281d);
        reset();
        return this.f14281d;
    }

    @Override // org.spongycastle.crypto.v
    public String getAlgorithmName() {
        return this.f14279b.getAlgorithmName();
    }

    @Override // org.spongycastle.crypto.v
    public int getMacSize() {
        return this.f14281d;
    }

    @Override // org.spongycastle.crypto.v
    public void reset() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.buf;
            if (i10 >= bArr.length) {
                this.f14278a = 0;
                this.f14279b.reset();
                return;
            } else {
                bArr[i10] = 0;
                i10++;
            }
        }
    }

    @Override // org.spongycastle.crypto.v
    public void update(byte b10) {
        int i10 = this.f14278a;
        byte[] bArr = this.buf;
        if (i10 == bArr.length) {
            this.f14279b.processBlock(bArr, 0, this.mac, 0);
            this.f14278a = 0;
        }
        byte[] bArr2 = this.buf;
        int i11 = this.f14278a;
        this.f14278a = i11 + 1;
        bArr2[i11] = b10;
    }

    public a(org.spongycastle.crypto.e eVar, int i10) {
        this(eVar, i10, null);
    }

    public a(org.spongycastle.crypto.e eVar, int i10, InterfaceC2427a interfaceC2427a) {
        if (i10 % 8 == 0) {
            this.f14279b = new Zi.b(eVar);
            this.f14280c = interfaceC2427a;
            this.f14281d = i10 / 8;
            this.mac = new byte[eVar.getBlockSize()];
            this.buf = new byte[eVar.getBlockSize()];
            this.f14278a = 0;
            return;
        }
        throw new IllegalArgumentException("MAC size must be multiple of 8");
    }

    @Override // org.spongycastle.crypto.v
    public void update(byte[] bArr, int i10, int i11) {
        if (i11 >= 0) {
            int blockSize = this.f14279b.getBlockSize();
            int i12 = this.f14278a;
            int i13 = blockSize - i12;
            if (i11 > i13) {
                System.arraycopy(bArr, i10, this.buf, i12, i13);
                this.f14279b.processBlock(this.buf, 0, this.mac, 0);
                this.f14278a = 0;
                i11 -= i13;
                i10 += i13;
                while (i11 > blockSize) {
                    this.f14279b.processBlock(bArr, i10, this.mac, 0);
                    i11 -= blockSize;
                    i10 += blockSize;
                }
            }
            System.arraycopy(bArr, i10, this.buf, this.f14278a, i11);
            this.f14278a += i11;
            return;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}
