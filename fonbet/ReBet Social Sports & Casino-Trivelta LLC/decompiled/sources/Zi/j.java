package Zi;

import com.plaid.internal.EnumC3631g;
import java.util.Vector;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import org.spongycastle.crypto.params.C5974a;
import org.spongycastle.crypto.params.w;
import org.spongycastle.crypto.params.z;
import org.spongycastle.crypto.r;
import org.spongycastle.crypto.x;

/* loaded from: classes5.dex */
public class j implements a {
    private byte[] Checksum;
    private byte[] L_Asterisk;
    private byte[] L_Dollar;
    private byte[] OffsetHASH;
    private byte[] Sum;

    /* renamed from: a, reason: collision with root package name */
    public org.spongycastle.crypto.e f14934a;

    /* renamed from: b, reason: collision with root package name */
    public org.spongycastle.crypto.e f14935b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14936c;

    /* renamed from: d, reason: collision with root package name */
    public int f14937d;

    /* renamed from: e, reason: collision with root package name */
    public Vector f14938e;

    /* renamed from: f, reason: collision with root package name */
    public int f14939f;

    /* renamed from: g, reason: collision with root package name */
    public int f14940g;

    /* renamed from: h, reason: collision with root package name */
    public long f14941h;
    private byte[] hashBlock;

    /* renamed from: i, reason: collision with root package name */
    public long f14942i;
    private byte[] initialAssociatedText;
    private byte[] macBlock;
    private byte[] mainBlock;
    private byte[] KtopInput = null;
    private byte[] Stretch = new byte[24];
    private byte[] OffsetMAIN_0 = new byte[16];
    private byte[] OffsetMAIN = new byte[16];

    public j(org.spongycastle.crypto.e eVar, org.spongycastle.crypto.e eVar2) {
        if (eVar == null) {
            throw new IllegalArgumentException("'hashCipher' cannot be null");
        }
        if (eVar.getBlockSize() != 16) {
            throw new IllegalArgumentException("'hashCipher' must have a block size of 16");
        }
        if (eVar2 == null) {
            throw new IllegalArgumentException("'mainCipher' cannot be null");
        }
        if (eVar2.getBlockSize() != 16) {
            throw new IllegalArgumentException("'mainCipher' must have a block size of 16");
        }
        if (!eVar.getAlgorithmName().equals(eVar2.getAlgorithmName())) {
            throw new IllegalArgumentException("'hashCipher' and 'mainCipher' must be the same algorithm");
        }
        this.f14934a = eVar;
        this.f14935b = eVar2;
    }

    public static byte[] b(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int k10 = k(bArr, bArr2);
        bArr2[15] = (byte) ((EnumC3631g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE >>> ((1 - k10) << 3)) ^ bArr2[15]);
        return bArr2;
    }

    public static void c(byte[] bArr, int i10) {
        bArr[i10] = ByteCompanionObject.MIN_VALUE;
        while (true) {
            i10++;
            if (i10 >= 16) {
                return;
            } else {
                bArr[i10] = 0;
            }
        }
    }

    public static int d(long j10) {
        if (j10 == 0) {
            return 64;
        }
        int i10 = 0;
        while ((1 & j10) == 0) {
            i10++;
            j10 >>>= 1;
        }
        return i10;
    }

    public static int k(byte[] bArr, byte[] bArr2) {
        int i10 = 16;
        int i11 = 0;
        while (true) {
            i10--;
            if (i10 < 0) {
                return i11;
            }
            int i12 = bArr[i10] & UByte.MAX_VALUE;
            bArr2[i10] = (byte) (i11 | (i12 << 1));
            i11 = (i12 >>> 7) & 1;
        }
    }

    public static void m(byte[] bArr, byte[] bArr2) {
        for (int i10 = 15; i10 >= 0; i10--) {
            bArr[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
    }

    @Override // Zi.a
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        byte[] a10;
        w wVar;
        boolean z11 = this.f14936c;
        this.f14936c = z10;
        this.macBlock = null;
        if (jVar instanceof C5974a) {
            C5974a c5974a = (C5974a) jVar;
            a10 = c5974a.d();
            this.initialAssociatedText = c5974a.a();
            int c10 = c5974a.c();
            if (c10 < 64 || c10 > 128 || c10 % 8 != 0) {
                throw new IllegalArgumentException("Invalid value for MAC size: " + c10);
            }
            this.f14937d = c10 / 8;
            wVar = c5974a.b();
        } else {
            if (!(jVar instanceof z)) {
                throw new IllegalArgumentException("invalid parameters passed to OCB");
            }
            z zVar = (z) jVar;
            a10 = zVar.a();
            this.initialAssociatedText = null;
            this.f14937d = 16;
            wVar = (w) zVar.b();
        }
        this.hashBlock = new byte[16];
        this.mainBlock = new byte[z10 ? 16 : this.f14937d + 16];
        if (a10 == null) {
            a10 = new byte[0];
        }
        if (a10.length > 15) {
            throw new IllegalArgumentException("IV must be no more than 15 bytes");
        }
        if (wVar != null) {
            this.f14934a.a(true, wVar);
            this.f14935b.a(z10, wVar);
            this.KtopInput = null;
        } else if (z11 != z10) {
            throw new IllegalArgumentException("cannot change encrypting state without providing key.");
        }
        byte[] bArr = new byte[16];
        this.L_Asterisk = bArr;
        this.f14934a.processBlock(bArr, 0, bArr, 0);
        this.L_Dollar = b(this.L_Asterisk);
        Vector vector = new Vector();
        this.f14938e = vector;
        vector.addElement(b(this.L_Dollar));
        int i10 = i(a10);
        int i11 = i10 % 8;
        int i12 = i10 / 8;
        if (i11 == 0) {
            System.arraycopy(this.Stretch, i12, this.OffsetMAIN_0, 0, 16);
        } else {
            for (int i13 = 0; i13 < 16; i13++) {
                byte[] bArr2 = this.Stretch;
                int i14 = bArr2[i12] & UByte.MAX_VALUE;
                i12++;
                this.OffsetMAIN_0[i13] = (byte) (((bArr2[i12] & UByte.MAX_VALUE) >>> (8 - i11)) | (i14 << i11));
            }
        }
        this.f14939f = 0;
        this.f14940g = 0;
        this.f14941h = 0L;
        this.f14942i = 0L;
        this.OffsetHASH = new byte[16];
        this.Sum = new byte[16];
        System.arraycopy(this.OffsetMAIN_0, 0, this.OffsetMAIN, 0, 16);
        this.Checksum = new byte[16];
        byte[] bArr3 = this.initialAssociatedText;
        if (bArr3 != null) {
            processAADBytes(bArr3, 0, bArr3.length);
        }
    }

    @Override // Zi.a
    public int doFinal(byte[] bArr, int i10) {
        byte[] bArr2;
        if (this.f14936c) {
            bArr2 = null;
        } else {
            int i11 = this.f14940g;
            int i12 = this.f14937d;
            if (i11 < i12) {
                throw new r("data too short");
            }
            int i13 = i11 - i12;
            this.f14940g = i13;
            bArr2 = new byte[i12];
            System.arraycopy(this.mainBlock, i13, bArr2, 0, i12);
        }
        int i14 = this.f14939f;
        if (i14 > 0) {
            c(this.hashBlock, i14);
            l(this.L_Asterisk);
        }
        int i15 = this.f14940g;
        if (i15 > 0) {
            if (this.f14936c) {
                c(this.mainBlock, i15);
                m(this.Checksum, this.mainBlock);
            }
            m(this.OffsetMAIN, this.L_Asterisk);
            byte[] bArr3 = new byte[16];
            this.f14934a.processBlock(this.OffsetMAIN, 0, bArr3, 0);
            m(this.mainBlock, bArr3);
            int length = bArr.length;
            int i16 = this.f14940g;
            if (length < i10 + i16) {
                throw new x("Output buffer too short");
            }
            System.arraycopy(this.mainBlock, 0, bArr, i10, i16);
            if (!this.f14936c) {
                c(this.mainBlock, this.f14940g);
                m(this.Checksum, this.mainBlock);
            }
        }
        m(this.Checksum, this.OffsetMAIN);
        m(this.Checksum, this.L_Dollar);
        org.spongycastle.crypto.e eVar = this.f14934a;
        byte[] bArr4 = this.Checksum;
        eVar.processBlock(bArr4, 0, bArr4, 0);
        m(this.Checksum, this.Sum);
        int i17 = this.f14937d;
        byte[] bArr5 = new byte[i17];
        this.macBlock = bArr5;
        System.arraycopy(this.Checksum, 0, bArr5, 0, i17);
        int i18 = this.f14940g;
        if (this.f14936c) {
            int length2 = bArr.length;
            int i19 = i10 + i18;
            int i20 = this.f14937d;
            if (length2 < i19 + i20) {
                throw new x("Output buffer too short");
            }
            System.arraycopy(this.macBlock, 0, bArr, i19, i20);
            i18 += this.f14937d;
        } else if (!Aj.a.k(this.macBlock, bArr2)) {
            throw new r("mac check in OCB failed");
        }
        j(false);
        return i18;
    }

    public void e(byte[] bArr) {
        if (bArr != null) {
            Aj.a.m(bArr, (byte) 0);
        }
    }

    public byte[] f(int i10) {
        while (i10 >= this.f14938e.size()) {
            Vector vector = this.f14938e;
            vector.addElement(b((byte[]) vector.lastElement()));
        }
        return (byte[]) this.f14938e.elementAt(i10);
    }

    public void g() {
        long j10 = this.f14941h + 1;
        this.f14941h = j10;
        l(f(d(j10)));
        this.f14939f = 0;
    }

    @Override // Zi.a
    public byte[] getMac() {
        byte[] bArr = this.macBlock;
        return bArr == null ? new byte[this.f14937d] : Aj.a.d(bArr);
    }

    @Override // Zi.a
    public int getOutputSize(int i10) {
        int i11 = i10 + this.f14940g;
        if (this.f14936c) {
            return i11 + this.f14937d;
        }
        int i12 = this.f14937d;
        if (i11 < i12) {
            return 0;
        }
        return i11 - i12;
    }

    @Override // Zi.a
    public org.spongycastle.crypto.e getUnderlyingCipher() {
        return this.f14935b;
    }

    @Override // Zi.a
    public int getUpdateOutputSize(int i10) {
        int i11 = i10 + this.f14940g;
        if (!this.f14936c) {
            int i12 = this.f14937d;
            if (i11 < i12) {
                return 0;
            }
            i11 -= i12;
        }
        return i11 - (i11 % 16);
    }

    public void h(byte[] bArr, int i10) {
        if (bArr.length < i10 + 16) {
            throw new x("Output buffer too short");
        }
        if (this.f14936c) {
            m(this.Checksum, this.mainBlock);
            this.f14940g = 0;
        }
        byte[] bArr2 = this.OffsetMAIN;
        long j10 = this.f14942i + 1;
        this.f14942i = j10;
        m(bArr2, f(d(j10)));
        m(this.mainBlock, this.OffsetMAIN);
        org.spongycastle.crypto.e eVar = this.f14935b;
        byte[] bArr3 = this.mainBlock;
        eVar.processBlock(bArr3, 0, bArr3, 0);
        m(this.mainBlock, this.OffsetMAIN);
        System.arraycopy(this.mainBlock, 0, bArr, i10, 16);
        if (this.f14936c) {
            return;
        }
        m(this.Checksum, this.mainBlock);
        byte[] bArr4 = this.mainBlock;
        System.arraycopy(bArr4, 16, bArr4, 0, this.f14937d);
        this.f14940g = this.f14937d;
    }

    public int i(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i10 = 0;
        System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
        bArr2[0] = (byte) (this.f14937d << 4);
        int length = 15 - bArr.length;
        bArr2[length] = (byte) (bArr2[length] | 1);
        byte b10 = bArr2[15];
        int i11 = b10 & 63;
        bArr2[15] = (byte) (b10 & 192);
        byte[] bArr3 = this.KtopInput;
        if (bArr3 == null || !Aj.a.a(bArr2, bArr3)) {
            byte[] bArr4 = new byte[16];
            this.KtopInput = bArr2;
            this.f14934a.processBlock(bArr2, 0, bArr4, 0);
            System.arraycopy(bArr4, 0, this.Stretch, 0, 16);
            while (i10 < 8) {
                byte[] bArr5 = this.Stretch;
                int i12 = i10 + 16;
                byte b11 = bArr4[i10];
                i10++;
                bArr5[i12] = (byte) (b11 ^ bArr4[i10]);
            }
        }
        return i11;
    }

    public void j(boolean z10) {
        this.f14934a.reset();
        this.f14935b.reset();
        e(this.hashBlock);
        e(this.mainBlock);
        this.f14939f = 0;
        this.f14940g = 0;
        this.f14941h = 0L;
        this.f14942i = 0L;
        e(this.OffsetHASH);
        e(this.Sum);
        System.arraycopy(this.OffsetMAIN_0, 0, this.OffsetMAIN, 0, 16);
        e(this.Checksum);
        if (z10) {
            this.macBlock = null;
        }
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }

    public void l(byte[] bArr) {
        m(this.OffsetHASH, bArr);
        m(this.hashBlock, this.OffsetHASH);
        org.spongycastle.crypto.e eVar = this.f14934a;
        byte[] bArr2 = this.hashBlock;
        eVar.processBlock(bArr2, 0, bArr2, 0);
        m(this.Sum, this.hashBlock);
    }

    @Override // Zi.a
    public void processAADBytes(byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = this.hashBlock;
            int i13 = this.f14939f;
            bArr2[i13] = bArr[i10 + i12];
            int i14 = i13 + 1;
            this.f14939f = i14;
            if (i14 == bArr2.length) {
                g();
            }
        }
    }

    @Override // Zi.a
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (bArr.length < i10 + i11) {
            throw new org.spongycastle.crypto.l("Input buffer too short");
        }
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            byte[] bArr3 = this.mainBlock;
            int i15 = this.f14940g;
            bArr3[i15] = bArr[i10 + i14];
            int i16 = i15 + 1;
            this.f14940g = i16;
            if (i16 == bArr3.length) {
                h(bArr2, i12 + i13);
                i13 += 16;
            }
        }
        return i13;
    }
}
