package org.spongycastle.crypto.digests;

import kotlin.UByte;

/* loaded from: classes5.dex */
public class j extends e {

    /* renamed from: X, reason: collision with root package name */
    private int[] f62351X;

    /* renamed from: c, reason: collision with root package name */
    public int f62352c;

    /* renamed from: d, reason: collision with root package name */
    public int f62353d;

    /* renamed from: e, reason: collision with root package name */
    public int f62354e;

    /* renamed from: f, reason: collision with root package name */
    public int f62355f;

    /* renamed from: g, reason: collision with root package name */
    public int f62356g;

    public j() {
        this.f62351X = new int[16];
        reset();
    }

    private int g(int i10, int i11, int i12) {
        return ((~i10) & i12) | (i11 & i10);
    }

    private int h(int i10, int i11, int i12) {
        return (i10 & i12) | (i11 & (~i12));
    }

    private int i(int i10, int i11, int i12) {
        return (i10 ^ i11) ^ i12;
    }

    private int l(int i10, int i11) {
        return (i10 >>> (32 - i11)) | (i10 << i11);
    }

    private void m(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11 + 2] = (byte) (i10 >>> 16);
        bArr[i11 + 3] = (byte) (i10 >>> 24);
    }

    @Override // Aj.d
    public void a(Aj.d dVar) {
        k((j) dVar);
    }

    @Override // Aj.d
    public Aj.d copy() {
        return new j(this);
    }

    @Override // org.spongycastle.crypto.digests.e
    public void d() {
        int i10 = this.f62352c;
        int i11 = this.f62353d;
        int i12 = this.f62354e;
        int i13 = this.f62355f;
        int l10 = l(((i10 + g(i11, i12, i13)) + this.f62351X[0]) - 680876936, 7) + i11;
        int l11 = l(((i13 + g(l10, i11, i12)) + this.f62351X[1]) - 389564586, 12) + l10;
        int l12 = l(i12 + g(l11, l10, i11) + this.f62351X[2] + 606105819, 17) + l11;
        int l13 = l(((i11 + g(l12, l11, l10)) + this.f62351X[3]) - 1044525330, 22) + l12;
        int l14 = l(((l10 + g(l13, l12, l11)) + this.f62351X[4]) - 176418897, 7) + l13;
        int l15 = l(l11 + g(l14, l13, l12) + this.f62351X[5] + 1200080426, 12) + l14;
        int l16 = l(((l12 + g(l15, l14, l13)) + this.f62351X[6]) - 1473231341, 17) + l15;
        int l17 = l(((l13 + g(l16, l15, l14)) + this.f62351X[7]) - 45705983, 22) + l16;
        int l18 = l(l14 + g(l17, l16, l15) + this.f62351X[8] + 1770035416, 7) + l17;
        int l19 = l(((l15 + g(l18, l17, l16)) + this.f62351X[9]) - 1958414417, 12) + l18;
        int l20 = l(((l16 + g(l19, l18, l17)) + this.f62351X[10]) - 42063, 17) + l19;
        int l21 = l(((l17 + g(l20, l19, l18)) + this.f62351X[11]) - 1990404162, 22) + l20;
        int l22 = l(l18 + g(l21, l20, l19) + this.f62351X[12] + 1804603682, 7) + l21;
        int l23 = l(((l19 + g(l22, l21, l20)) + this.f62351X[13]) - 40341101, 12) + l22;
        int l24 = l(((l20 + g(l23, l22, l21)) + this.f62351X[14]) - 1502002290, 17) + l23;
        int l25 = l(l21 + g(l24, l23, l22) + this.f62351X[15] + 1236535329, 22) + l24;
        int l26 = l(((l22 + h(l25, l24, l23)) + this.f62351X[1]) - 165796510, 5) + l25;
        int l27 = l(((l23 + h(l26, l25, l24)) + this.f62351X[6]) - 1069501632, 9) + l26;
        int l28 = l(l24 + h(l27, l26, l25) + this.f62351X[11] + 643717713, 14) + l27;
        int l29 = l(((l25 + h(l28, l27, l26)) + this.f62351X[0]) - 373897302, 20) + l28;
        int l30 = l(((l26 + h(l29, l28, l27)) + this.f62351X[5]) - 701558691, 5) + l29;
        int l31 = l(l27 + h(l30, l29, l28) + this.f62351X[10] + 38016083, 9) + l30;
        int l32 = l(((l28 + h(l31, l30, l29)) + this.f62351X[15]) - 660478335, 14) + l31;
        int l33 = l(((l29 + h(l32, l31, l30)) + this.f62351X[4]) - 405537848, 20) + l32;
        int l34 = l(l30 + h(l33, l32, l31) + this.f62351X[9] + 568446438, 5) + l33;
        int l35 = l(((l31 + h(l34, l33, l32)) + this.f62351X[14]) - 1019803690, 9) + l34;
        int l36 = l(((l32 + h(l35, l34, l33)) + this.f62351X[3]) - 187363961, 14) + l35;
        int l37 = l(l33 + h(l36, l35, l34) + this.f62351X[8] + 1163531501, 20) + l36;
        int l38 = l(((l34 + h(l37, l36, l35)) + this.f62351X[13]) - 1444681467, 5) + l37;
        int l39 = l(((l35 + h(l38, l37, l36)) + this.f62351X[2]) - 51403784, 9) + l38;
        int l40 = l(l36 + h(l39, l38, l37) + this.f62351X[7] + 1735328473, 14) + l39;
        int l41 = l(((l37 + h(l40, l39, l38)) + this.f62351X[12]) - 1926607734, 20) + l40;
        int l42 = l(((l38 + i(l41, l40, l39)) + this.f62351X[5]) - 378558, 4) + l41;
        int l43 = l(((l39 + i(l42, l41, l40)) + this.f62351X[8]) - 2022574463, 11) + l42;
        int l44 = l(l40 + i(l43, l42, l41) + this.f62351X[11] + 1839030562, 16) + l43;
        int l45 = l(((l41 + i(l44, l43, l42)) + this.f62351X[14]) - 35309556, 23) + l44;
        int l46 = l(((l42 + i(l45, l44, l43)) + this.f62351X[1]) - 1530992060, 4) + l45;
        int l47 = l(l43 + i(l46, l45, l44) + this.f62351X[4] + 1272893353, 11) + l46;
        int l48 = l(((l44 + i(l47, l46, l45)) + this.f62351X[7]) - 155497632, 16) + l47;
        int l49 = l(((l45 + i(l48, l47, l46)) + this.f62351X[10]) - 1094730640, 23) + l48;
        int l50 = l(l46 + i(l49, l48, l47) + this.f62351X[13] + 681279174, 4) + l49;
        int l51 = l(((l47 + i(l50, l49, l48)) + this.f62351X[0]) - 358537222, 11) + l50;
        int l52 = l(((l48 + i(l51, l50, l49)) + this.f62351X[3]) - 722521979, 16) + l51;
        int l53 = l(l49 + i(l52, l51, l50) + this.f62351X[6] + 76029189, 23) + l52;
        int l54 = l(((l50 + i(l53, l52, l51)) + this.f62351X[9]) - 640364487, 4) + l53;
        int l55 = l(((l51 + i(l54, l53, l52)) + this.f62351X[12]) - 421815835, 11) + l54;
        int l56 = l(l52 + i(l55, l54, l53) + this.f62351X[15] + 530742520, 16) + l55;
        int l57 = l(((l53 + i(l56, l55, l54)) + this.f62351X[2]) - 995338651, 23) + l56;
        int l58 = l(((l54 + j(l57, l56, l55)) + this.f62351X[0]) - 198630844, 6) + l57;
        int l59 = l(l55 + j(l58, l57, l56) + this.f62351X[7] + 1126891415, 10) + l58;
        int l60 = l(((l56 + j(l59, l58, l57)) + this.f62351X[14]) - 1416354905, 15) + l59;
        int l61 = l(((l57 + j(l60, l59, l58)) + this.f62351X[5]) - 57434055, 21) + l60;
        int l62 = l(l58 + j(l61, l60, l59) + this.f62351X[12] + 1700485571, 6) + l61;
        int l63 = l(((l59 + j(l62, l61, l60)) + this.f62351X[3]) - 1894986606, 10) + l62;
        int l64 = l(((l60 + j(l63, l62, l61)) + this.f62351X[10]) - 1051523, 15) + l63;
        int l65 = l(((l61 + j(l64, l63, l62)) + this.f62351X[1]) - 2054922799, 21) + l64;
        int l66 = l(l62 + j(l65, l64, l63) + this.f62351X[8] + 1873313359, 6) + l65;
        int l67 = l(((l63 + j(l66, l65, l64)) + this.f62351X[15]) - 30611744, 10) + l66;
        int l68 = l(((l64 + j(l67, l66, l65)) + this.f62351X[6]) - 1560198380, 15) + l67;
        int l69 = l(l65 + j(l68, l67, l66) + this.f62351X[13] + 1309151649, 21) + l68;
        int l70 = l(((l66 + j(l69, l68, l67)) + this.f62351X[4]) - 145523070, 6) + l69;
        int l71 = l(((l67 + j(l70, l69, l68)) + this.f62351X[11]) - 1120210379, 10) + l70;
        int l72 = l(l68 + j(l71, l70, l69) + this.f62351X[2] + 718787259, 15) + l71;
        int l73 = l(((l69 + j(l72, l71, l70)) + this.f62351X[9]) - 343485551, 21) + l72;
        this.f62352c += l70;
        this.f62353d += l73;
        this.f62354e += l72;
        this.f62355f += l71;
        this.f62356g = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = this.f62351X;
            if (i14 == iArr.length) {
                return;
            }
            iArr[i14] = 0;
            i14++;
        }
    }

    @Override // org.spongycastle.crypto.o
    public int doFinal(byte[] bArr, int i10) {
        c();
        m(this.f62352c, bArr, i10);
        m(this.f62353d, bArr, i10 + 4);
        m(this.f62354e, bArr, i10 + 8);
        m(this.f62355f, bArr, i10 + 12);
        reset();
        return 16;
    }

    @Override // org.spongycastle.crypto.digests.e
    public void e(long j10) {
        if (this.f62356g > 14) {
            d();
        }
        int[] iArr = this.f62351X;
        iArr[14] = (int) j10;
        iArr[15] = (int) (j10 >>> 32);
    }

    @Override // org.spongycastle.crypto.digests.e
    public void f(byte[] bArr, int i10) {
        int[] iArr = this.f62351X;
        int i11 = this.f62356g;
        int i12 = i11 + 1;
        this.f62356g = i12;
        iArr[i11] = ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
        if (i12 == 16) {
            d();
        }
    }

    @Override // org.spongycastle.crypto.o
    public String getAlgorithmName() {
        return "MD5";
    }

    @Override // org.spongycastle.crypto.o
    public int getDigestSize() {
        return 16;
    }

    public final int j(int i10, int i11, int i12) {
        return (i10 | (~i12)) ^ i11;
    }

    public final void k(j jVar) {
        super.b(jVar);
        this.f62352c = jVar.f62352c;
        this.f62353d = jVar.f62353d;
        this.f62354e = jVar.f62354e;
        this.f62355f = jVar.f62355f;
        int[] iArr = jVar.f62351X;
        System.arraycopy(iArr, 0, this.f62351X, 0, iArr.length);
        this.f62356g = jVar.f62356g;
    }

    @Override // org.spongycastle.crypto.digests.e, org.spongycastle.crypto.o
    public void reset() {
        super.reset();
        this.f62352c = 1732584193;
        this.f62353d = -271733879;
        this.f62354e = -1732584194;
        this.f62355f = 271733878;
        this.f62356g = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f62351X;
            if (i10 == iArr.length) {
                return;
            }
            iArr[i10] = 0;
            i10++;
        }
    }

    public j(j jVar) {
        super(jVar);
        this.f62351X = new int[16];
        k(jVar);
    }
}
