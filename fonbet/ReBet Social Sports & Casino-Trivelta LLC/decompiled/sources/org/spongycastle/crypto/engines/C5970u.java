package org.spongycastle.crypto.engines;

import com.plaid.internal.EnumC3631g;
import kotlin.UByte;

/* renamed from: org.spongycastle.crypto.engines.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5970u implements org.spongycastle.crypto.e {
    private static final int[] nullVector = {0, 0, 0, 0};
    private static final int[] roundConstants = {128, 27, 54, 108, 216, EnumC3631g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE, 77, EnumC3631g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE, 47, 94, 188, 99, EnumC3631g.SDK_ASSET_ICON_ARROW_UP_VALUE, 151, 53, 106, EnumC3631g.SDK_ASSET_ICON_OVERRIDE_VALUE};

    /* renamed from: b, reason: collision with root package name */
    public boolean f62604b;
    private int[] state = new int[4];
    private int[] subKeys = new int[4];
    private int[] decryptKeys = new int[4];

    /* renamed from: a, reason: collision with root package name */
    public boolean f62603a = false;

    private int c(byte[] bArr, int i10, byte[] bArr2, int i11) {
        this.state[0] = b(bArr, i10);
        this.state[1] = b(bArr, i10 + 4);
        this.state[2] = b(bArr, i10 + 8);
        this.state[3] = b(bArr, i10 + 12);
        int[] iArr = this.subKeys;
        System.arraycopy(iArr, 0, this.decryptKeys, 0, iArr.length);
        k(this.decryptKeys, nullVector);
        int i12 = 16;
        while (i12 > 0) {
            k(this.state, this.decryptKeys);
            int[] iArr2 = this.state;
            iArr2[0] = iArr2[0] ^ roundConstants[i12];
            g(iArr2);
            e(this.state);
            h(this.state);
            i12--;
        }
        k(this.state, this.decryptKeys);
        int[] iArr3 = this.state;
        int i13 = roundConstants[i12] ^ iArr3[0];
        iArr3[0] = i13;
        f(i13, bArr2, i11);
        f(this.state[1], bArr2, i11 + 4);
        f(this.state[2], bArr2, i11 + 8);
        f(this.state[3], bArr2, i11 + 12);
        return 16;
    }

    private int d(byte[] bArr, int i10, byte[] bArr2, int i11) {
        this.state[0] = b(bArr, i10);
        this.state[1] = b(bArr, i10 + 4);
        this.state[2] = b(bArr, i10 + 8);
        this.state[3] = b(bArr, i10 + 12);
        int i12 = 0;
        while (i12 < 16) {
            int[] iArr = this.state;
            iArr[0] = iArr[0] ^ roundConstants[i12];
            k(iArr, this.subKeys);
            g(this.state);
            e(this.state);
            h(this.state);
            i12++;
        }
        int[] iArr2 = this.state;
        iArr2[0] = roundConstants[i12] ^ iArr2[0];
        k(iArr2, this.subKeys);
        f(this.state[0], bArr2, i11);
        f(this.state[1], bArr2, i11 + 4);
        f(this.state[2], bArr2, i11 + 8);
        f(this.state[3], bArr2, i11 + 12);
        return 16;
    }

    private int i(int i10, int i11) {
        return (i10 >>> (32 - i11)) | (i10 << i11);
    }

    private void j(byte[] bArr) {
        this.subKeys[0] = b(bArr, 0);
        this.subKeys[1] = b(bArr, 4);
        this.subKeys[2] = b(bArr, 8);
        this.subKeys[3] = b(bArr, 12);
    }

    @Override // org.spongycastle.crypto.e
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        if (jVar instanceof org.spongycastle.crypto.params.w) {
            this.f62604b = z10;
            this.f62603a = true;
            j(((org.spongycastle.crypto.params.w) jVar).a());
        } else {
            throw new IllegalArgumentException("invalid parameter passed to Noekeon init - " + jVar.getClass().getName());
        }
    }

    public final int b(byte[] bArr, int i10) {
        int i11 = ((bArr[i10 + 1] & UByte.MAX_VALUE) << 16) | (bArr[i10] << 24);
        return (bArr[i10 + 3] & UByte.MAX_VALUE) | i11 | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 8);
    }

    public final void e(int[] iArr) {
        int i10 = iArr[1];
        int i11 = iArr[3];
        int i12 = ~i11;
        int i13 = iArr[2];
        int i14 = i10 ^ (i12 & (~i13));
        iArr[1] = i14;
        int i15 = iArr[0] ^ (i13 & i14);
        iArr[0] = i15;
        iArr[3] = i15;
        iArr[0] = i11;
        int i16 = ((i11 ^ i14) ^ i15) ^ i13;
        iArr[2] = i16;
        int i17 = i14 ^ ((~i15) & (~i16));
        iArr[1] = i17;
        iArr[0] = (i16 & i17) ^ i11;
    }

    public final void f(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) (i10 >>> 24);
        bArr[i11 + 1] = (byte) (i10 >>> 16);
        bArr[i11 + 2] = (byte) (i10 >>> 8);
        bArr[i11 + 3] = (byte) i10;
    }

    public final void g(int[] iArr) {
        iArr[1] = i(iArr[1], 1);
        iArr[2] = i(iArr[2], 5);
        iArr[3] = i(iArr[3], 2);
    }

    @Override // org.spongycastle.crypto.e
    public String getAlgorithmName() {
        return "Noekeon";
    }

    @Override // org.spongycastle.crypto.e
    public int getBlockSize() {
        return 16;
    }

    public final void h(int[] iArr) {
        iArr[1] = i(iArr[1], 31);
        iArr[2] = i(iArr[2], 27);
        iArr[3] = i(iArr[3], 30);
    }

    public final void k(int[] iArr, int[] iArr2) {
        int i10 = iArr[0] ^ iArr[2];
        int i11 = i10 ^ (i(i10, 8) ^ i(i10, 24));
        iArr[1] = iArr[1] ^ i11;
        iArr[3] = i11 ^ iArr[3];
        for (int i12 = 0; i12 < 4; i12++) {
            iArr[i12] = iArr[i12] ^ iArr2[i12];
        }
        int i13 = iArr[1] ^ iArr[3];
        int i14 = i13 ^ (i(i13, 8) ^ i(i13, 24));
        iArr[0] = iArr[0] ^ i14;
        iArr[2] = i14 ^ iArr[2];
    }

    @Override // org.spongycastle.crypto.e
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (!this.f62603a) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i10 + 16 > bArr.length) {
            throw new org.spongycastle.crypto.l("input buffer too short");
        }
        if (i11 + 16 <= bArr2.length) {
            return this.f62604b ? d(bArr, i10, bArr2, i11) : c(bArr, i10, bArr2, i11);
        }
        throw new org.spongycastle.crypto.x("output buffer too short");
    }

    @Override // org.spongycastle.crypto.e
    public void reset() {
    }
}
