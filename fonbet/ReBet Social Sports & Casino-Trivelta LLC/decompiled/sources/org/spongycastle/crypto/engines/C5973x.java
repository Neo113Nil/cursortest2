package org.spongycastle.crypto.engines;

import kotlin.UByte;

/* renamed from: org.spongycastle.crypto.engines.x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5973x implements org.spongycastle.crypto.B {
    private byte[] engineState = null;

    /* renamed from: a, reason: collision with root package name */
    public int f62612a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f62613b = 0;
    private byte[] workingKey = null;

    private void b(byte[] bArr) {
        this.workingKey = bArr;
        this.f62612a = 0;
        this.f62613b = 0;
        if (this.engineState == null) {
            this.engineState = new byte[256];
        }
        for (int i10 = 0; i10 < 256; i10++) {
            this.engineState[i10] = (byte) i10;
        }
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < 256; i13++) {
            int i14 = bArr[i11] & UByte.MAX_VALUE;
            byte[] bArr2 = this.engineState;
            byte b10 = bArr2[i13];
            i12 = (i14 + b10 + i12) & 255;
            bArr2[i13] = bArr2[i12];
            bArr2[i12] = b10;
            i11 = (i11 + 1) % bArr.length;
        }
    }

    @Override // org.spongycastle.crypto.B
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        if (jVar instanceof org.spongycastle.crypto.params.w) {
            byte[] a10 = ((org.spongycastle.crypto.params.w) jVar).a();
            this.workingKey = a10;
            b(a10);
        } else {
            throw new IllegalArgumentException("invalid parameter passed to RC4 init - " + jVar.getClass().getName());
        }
    }

    @Override // org.spongycastle.crypto.B
    public String getAlgorithmName() {
        return "RC4";
    }

    @Override // org.spongycastle.crypto.B
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (i10 + i11 > bArr.length) {
            throw new org.spongycastle.crypto.l("input buffer too short");
        }
        if (i12 + i11 > bArr2.length) {
            throw new org.spongycastle.crypto.x("output buffer too short");
        }
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = (this.f62612a + 1) & 255;
            this.f62612a = i14;
            byte[] bArr3 = this.engineState;
            byte b10 = bArr3[i14];
            int i15 = (this.f62613b + b10) & 255;
            this.f62613b = i15;
            bArr3[i14] = bArr3[i15];
            bArr3[i15] = b10;
            bArr2[i13 + i12] = (byte) (bArr3[(bArr3[i14] + b10) & 255] ^ bArr[i13 + i10]);
        }
        return i11;
    }

    @Override // org.spongycastle.crypto.B
    public void reset() {
        b(this.workingKey);
    }
}
