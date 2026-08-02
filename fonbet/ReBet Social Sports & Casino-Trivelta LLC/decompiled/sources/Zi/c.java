package Zi;

import java.io.ByteArrayOutputStream;
import org.spongycastle.crypto.params.C5974a;
import org.spongycastle.crypto.params.z;
import org.spongycastle.crypto.r;
import org.spongycastle.crypto.x;

/* loaded from: classes5.dex */
public class c implements Zi.a {

    /* renamed from: a, reason: collision with root package name */
    public org.spongycastle.crypto.e f14889a;

    /* renamed from: b, reason: collision with root package name */
    public int f14890b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14891c;

    /* renamed from: d, reason: collision with root package name */
    public int f14892d;

    /* renamed from: e, reason: collision with root package name */
    public org.spongycastle.crypto.j f14893e;

    /* renamed from: f, reason: collision with root package name */
    public a f14894f = new a();

    /* renamed from: g, reason: collision with root package name */
    public a f14895g = new a();
    private byte[] initialAssociatedText;
    private byte[] macBlock;
    private byte[] nonce;

    public class a extends ByteArrayOutputStream {
        public a() {
        }

        public byte[] d() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public c(org.spongycastle.crypto.e eVar) {
        this.f14889a = eVar;
        int blockSize = eVar.getBlockSize();
        this.f14890b = blockSize;
        this.macBlock = new byte[blockSize];
        if (blockSize != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
    }

    @Override // Zi.a
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        org.spongycastle.crypto.j b10;
        this.f14891c = z10;
        if (jVar instanceof C5974a) {
            C5974a c5974a = (C5974a) jVar;
            this.nonce = c5974a.d();
            this.initialAssociatedText = c5974a.a();
            this.f14892d = c5974a.c() / 8;
            b10 = c5974a.b();
        } else {
            if (!(jVar instanceof z)) {
                throw new IllegalArgumentException("invalid parameters passed to CCM: " + jVar.getClass().getName());
            }
            z zVar = (z) jVar;
            this.nonce = zVar.a();
            this.initialAssociatedText = null;
            this.f14892d = this.macBlock.length / 2;
            b10 = zVar.b();
        }
        if (b10 != null) {
            this.f14893e = b10;
        }
        byte[] bArr = this.nonce;
        if (bArr == null || bArr.length < 7 || bArr.length > 13) {
            throw new IllegalArgumentException("nonce must have length from 7 to 13 octets");
        }
        h();
    }

    public final int b(byte[] bArr, int i10, int i11, byte[] bArr2) {
        Yi.a aVar = new Yi.a(this.f14889a, this.f14892d * 8);
        aVar.a(this.f14893e);
        byte[] bArr3 = new byte[16];
        if (e()) {
            bArr3[0] = (byte) (bArr3[0] | 64);
        }
        int i12 = 2;
        byte macSize = (byte) (bArr3[0] | ((((aVar.getMacSize() - 2) / 2) & 7) << 3));
        bArr3[0] = macSize;
        byte[] bArr4 = this.nonce;
        bArr3[0] = (byte) (macSize | ((14 - bArr4.length) & 7));
        System.arraycopy(bArr4, 0, bArr3, 1, bArr4.length);
        int i13 = i11;
        int i14 = 1;
        while (i13 > 0) {
            bArr3[16 - i14] = (byte) (i13 & 255);
            i13 >>>= 8;
            i14++;
        }
        aVar.update(bArr3, 0, 16);
        if (e()) {
            int d10 = d();
            if (d10 < 65280) {
                aVar.update((byte) (d10 >> 8));
                aVar.update((byte) d10);
            } else {
                aVar.update((byte) -1);
                aVar.update((byte) -2);
                aVar.update((byte) (d10 >> 24));
                aVar.update((byte) (d10 >> 16));
                aVar.update((byte) (d10 >> 8));
                aVar.update((byte) d10);
                i12 = 6;
            }
            byte[] bArr5 = this.initialAssociatedText;
            if (bArr5 != null) {
                aVar.update(bArr5, 0, bArr5.length);
            }
            if (this.f14894f.size() > 0) {
                aVar.update(this.f14894f.d(), 0, this.f14894f.size());
            }
            int i15 = (i12 + d10) % 16;
            if (i15 != 0) {
                while (i15 != 16) {
                    aVar.update((byte) 0);
                    i15++;
                }
            }
        }
        aVar.update(bArr, i10, i11);
        return aVar.doFinal(bArr2, 0);
    }

    public String c() {
        return this.f14889a.getAlgorithmName() + "/CCM";
    }

    public final int d() {
        int size = this.f14894f.size();
        byte[] bArr = this.initialAssociatedText;
        return size + (bArr == null ? 0 : bArr.length);
    }

    @Override // Zi.a
    public int doFinal(byte[] bArr, int i10) {
        int g10 = g(this.f14895g.d(), 0, this.f14895g.size(), bArr, i10);
        h();
        return g10;
    }

    public final boolean e() {
        return d() > 0;
    }

    public void f(byte b10) {
        this.f14894f.write(b10);
    }

    public int g(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int i13;
        if (this.f14893e == null) {
            throw new IllegalStateException("CCM cipher unitialized.");
        }
        byte[] bArr3 = this.nonce;
        int length = bArr3.length;
        int i14 = 15 - length;
        if (i14 < 4 && i11 >= (1 << (i14 * 8))) {
            throw new IllegalStateException("CCM packet too large for choice of q.");
        }
        byte[] bArr4 = new byte[this.f14890b];
        bArr4[0] = (byte) ((14 - length) & 7);
        System.arraycopy(bArr3, 0, bArr4, 1, bArr3.length);
        n nVar = new n(this.f14889a);
        nVar.a(this.f14891c, new z(this.f14893e, bArr4));
        if (!this.f14891c) {
            int i15 = this.f14892d;
            if (i11 < i15) {
                throw new r("data too short");
            }
            int i16 = i11 - i15;
            if (bArr2.length < i16 + i12) {
                throw new x("Output buffer too short.");
            }
            int i17 = i10 + i16;
            System.arraycopy(bArr, i17, this.macBlock, 0, i15);
            byte[] bArr5 = this.macBlock;
            nVar.processBlock(bArr5, 0, bArr5, 0);
            int i18 = this.f14892d;
            while (true) {
                byte[] bArr6 = this.macBlock;
                if (i18 == bArr6.length) {
                    break;
                }
                bArr6[i18] = 0;
                i18++;
            }
            int i19 = i10;
            int i20 = i12;
            while (true) {
                i13 = this.f14890b;
                if (i19 >= i17 - i13) {
                    break;
                }
                nVar.processBlock(bArr, i19, bArr2, i20);
                int i21 = this.f14890b;
                i20 += i21;
                i19 += i21;
            }
            byte[] bArr7 = new byte[i13];
            int i22 = i16 - (i19 - i10);
            System.arraycopy(bArr, i19, bArr7, 0, i22);
            nVar.processBlock(bArr7, 0, bArr7, 0);
            System.arraycopy(bArr7, 0, bArr2, i20, i22);
            byte[] bArr8 = new byte[this.f14890b];
            b(bArr2, i12, i16, bArr8);
            if (Aj.a.k(this.macBlock, bArr8)) {
                return i16;
            }
            throw new r("mac check in CCM failed");
        }
        int i23 = this.f14892d + i11;
        if (bArr2.length < i23 + i12) {
            throw new x("Output buffer too short.");
        }
        b(bArr, i10, i11, this.macBlock);
        byte[] bArr9 = new byte[this.f14890b];
        nVar.processBlock(this.macBlock, 0, bArr9, 0);
        int i24 = i10;
        int i25 = i12;
        while (true) {
            int i26 = i10 + i11;
            int i27 = this.f14890b;
            if (i24 >= i26 - i27) {
                byte[] bArr10 = new byte[i27];
                int i28 = i26 - i24;
                System.arraycopy(bArr, i24, bArr10, 0, i28);
                nVar.processBlock(bArr10, 0, bArr10, 0);
                System.arraycopy(bArr10, 0, bArr2, i25, i28);
                System.arraycopy(bArr9, 0, bArr2, i12 + i11, this.f14892d);
                return i23;
            }
            nVar.processBlock(bArr, i24, bArr2, i25);
            int i29 = this.f14890b;
            i25 += i29;
            i24 += i29;
        }
    }

    @Override // Zi.a
    public byte[] getMac() {
        int i10 = this.f14892d;
        byte[] bArr = new byte[i10];
        System.arraycopy(this.macBlock, 0, bArr, 0, i10);
        return bArr;
    }

    @Override // Zi.a
    public int getOutputSize(int i10) {
        int size = i10 + this.f14895g.size();
        if (this.f14891c) {
            return size + this.f14892d;
        }
        int i11 = this.f14892d;
        if (size < i11) {
            return 0;
        }
        return size - i11;
    }

    @Override // Zi.a
    public org.spongycastle.crypto.e getUnderlyingCipher() {
        return this.f14889a;
    }

    @Override // Zi.a
    public int getUpdateOutputSize(int i10) {
        return 0;
    }

    public void h() {
        this.f14889a.reset();
        this.f14894f.reset();
        this.f14895g.reset();
    }

    @Override // Zi.a
    public void processAADBytes(byte[] bArr, int i10, int i11) {
        this.f14894f.write(bArr, i10, i11);
    }

    @Override // Zi.a
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (bArr.length < i10 + i11) {
            throw new org.spongycastle.crypto.l("Input buffer too short");
        }
        this.f14895g.write(bArr, i10, i11);
        return 0;
    }
}
