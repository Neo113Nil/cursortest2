package org.spongycastle.crypto.engines;

import kotlin.UByte;

/* renamed from: org.spongycastle.crypto.engines.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5967q implements org.spongycastle.crypto.B {

    /* renamed from: b, reason: collision with root package name */
    public boolean f62583b;
    private byte[] iv;
    private byte[] key;

    /* renamed from: p, reason: collision with root package name */
    private int[] f62585p = new int[512];

    /* renamed from: q, reason: collision with root package name */
    private int[] f62586q = new int[512];

    /* renamed from: a, reason: collision with root package name */
    public int f62582a = 0;
    private byte[] buf = new byte[4];

    /* renamed from: c, reason: collision with root package name */
    public int f62584c = 0;

    public static int b(int i10, int i11) {
        return l(i10 - i11);
    }

    public static int c(int i10) {
        return (i10 >>> 3) ^ (n(i10, 7) ^ n(i10, 18));
    }

    public static int d(int i10) {
        return (i10 >>> 10) ^ (n(i10, 17) ^ n(i10, 19));
    }

    public static int k(int i10) {
        return i10 & 1023;
    }

    public static int l(int i10) {
        return i10 & 511;
    }

    private static int m(int i10, int i11) {
        return (i10 >>> (-i11)) | (i10 << i11);
    }

    private static int n(int i10, int i11) {
        return (i10 << (-i11)) | (i10 >>> i11);
    }

    @Override // org.spongycastle.crypto.B
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        org.spongycastle.crypto.j jVar2;
        if (jVar instanceof org.spongycastle.crypto.params.z) {
            org.spongycastle.crypto.params.z zVar = (org.spongycastle.crypto.params.z) jVar;
            this.iv = zVar.a();
            jVar2 = zVar.b();
        } else {
            this.iv = new byte[0];
            jVar2 = jVar;
        }
        if (jVar2 instanceof org.spongycastle.crypto.params.w) {
            this.key = ((org.spongycastle.crypto.params.w) jVar2).a();
            j();
            this.f62583b = true;
        } else {
            throw new IllegalArgumentException("Invalid parameter passed to HC128 init - " + jVar.getClass().getName());
        }
    }

    public final int e(int i10, int i11, int i12) {
        return (n(i10, 10) ^ n(i12, 23)) + n(i11, 8);
    }

    public final int f(int i10, int i11, int i12) {
        return (m(i10, 10) ^ m(i12, 23)) + m(i11, 8);
    }

    public final byte g() {
        if (this.f62584c == 0) {
            int o10 = o();
            byte[] bArr = this.buf;
            bArr[0] = (byte) (o10 & 255);
            bArr[1] = (byte) ((o10 >> 8) & 255);
            bArr[2] = (byte) ((o10 >> 16) & 255);
            bArr[3] = (byte) ((o10 >> 24) & 255);
        }
        byte[] bArr2 = this.buf;
        int i10 = this.f62584c;
        byte b10 = bArr2[i10];
        this.f62584c = 3 & (i10 + 1);
        return b10;
    }

    @Override // org.spongycastle.crypto.B
    public String getAlgorithmName() {
        return "HC-128";
    }

    public final int h(int i10) {
        int[] iArr = this.f62586q;
        return iArr[i10 & 255] + iArr[((i10 >> 16) & 255) + 256];
    }

    public final int i(int i10) {
        int[] iArr = this.f62585p;
        return iArr[i10 & 255] + iArr[((i10 >> 16) & 255) + 256];
    }

    public final void j() {
        if (this.key.length != 16) {
            throw new IllegalArgumentException("The key must be 128 bits long");
        }
        this.f62584c = 0;
        this.f62582a = 0;
        int[] iArr = new int[1280];
        for (int i10 = 0; i10 < 16; i10++) {
            int i11 = i10 >> 2;
            iArr[i11] = ((this.key[i10] & UByte.MAX_VALUE) << ((i10 & 3) * 8)) | iArr[i11];
        }
        System.arraycopy(iArr, 0, iArr, 4, 4);
        int i12 = 0;
        while (true) {
            byte[] bArr = this.iv;
            if (i12 >= bArr.length || i12 >= 16) {
                break;
            }
            int i13 = (i12 >> 2) + 8;
            iArr[i13] = ((bArr[i12] & UByte.MAX_VALUE) << ((i12 & 3) * 8)) | iArr[i13];
            i12++;
        }
        System.arraycopy(iArr, 8, iArr, 12, 4);
        for (int i14 = 16; i14 < 1280; i14++) {
            iArr[i14] = d(iArr[i14 - 2]) + iArr[i14 - 7] + c(iArr[i14 - 15]) + iArr[i14 - 16] + i14;
        }
        System.arraycopy(iArr, 256, this.f62585p, 0, 512);
        System.arraycopy(iArr, 768, this.f62586q, 0, 512);
        for (int i15 = 0; i15 < 512; i15++) {
            this.f62585p[i15] = o();
        }
        for (int i16 = 0; i16 < 512; i16++) {
            this.f62586q[i16] = o();
        }
        this.f62582a = 0;
    }

    public final int o() {
        int i10;
        int i11;
        int l10 = l(this.f62582a);
        if (this.f62582a < 512) {
            int[] iArr = this.f62585p;
            iArr[l10] = iArr[l10] + e(iArr[b(l10, 3)], this.f62585p[b(l10, 10)], this.f62585p[b(l10, 511)]);
            i10 = h(this.f62585p[b(l10, 12)]);
            i11 = this.f62585p[l10];
        } else {
            int[] iArr2 = this.f62586q;
            iArr2[l10] = iArr2[l10] + f(iArr2[b(l10, 3)], this.f62586q[b(l10, 10)], this.f62586q[b(l10, 511)]);
            i10 = i(this.f62586q[b(l10, 12)]);
            i11 = this.f62586q[l10];
        }
        int i12 = i11 ^ i10;
        this.f62582a = k(this.f62582a + 1);
        return i12;
    }

    @Override // org.spongycastle.crypto.B
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (!this.f62583b) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i10 + i11 > bArr.length) {
            throw new org.spongycastle.crypto.l("input buffer too short");
        }
        if (i12 + i11 > bArr2.length) {
            throw new org.spongycastle.crypto.x("output buffer too short");
        }
        for (int i13 = 0; i13 < i11; i13++) {
            bArr2[i12 + i13] = (byte) (bArr[i10 + i13] ^ g());
        }
        return i11;
    }

    @Override // org.spongycastle.crypto.B
    public void reset() {
        j();
    }
}
