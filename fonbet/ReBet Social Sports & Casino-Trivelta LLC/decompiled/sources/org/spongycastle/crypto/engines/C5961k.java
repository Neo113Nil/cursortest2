package org.spongycastle.crypto.engines;

/* renamed from: org.spongycastle.crypto.engines.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5961k extends C5960j {

    /* renamed from: a, reason: collision with root package name */
    public boolean f62560a;
    private int[] workingKey1 = null;
    private int[] workingKey2 = null;
    private int[] workingKey3 = null;

    @Override // org.spongycastle.crypto.engines.C5960j, org.spongycastle.crypto.e
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        if (!(jVar instanceof org.spongycastle.crypto.params.w)) {
            throw new IllegalArgumentException("invalid parameter passed to DESede init - " + jVar.getClass().getName());
        }
        byte[] a10 = ((org.spongycastle.crypto.params.w) jVar).a();
        if (a10.length != 24 && a10.length != 16) {
            throw new IllegalArgumentException("key size must be 16 or 24 bytes.");
        }
        this.f62560a = z10;
        byte[] bArr = new byte[8];
        System.arraycopy(a10, 0, bArr, 0, 8);
        this.workingKey1 = c(z10, bArr);
        byte[] bArr2 = new byte[8];
        System.arraycopy(a10, 8, bArr2, 0, 8);
        this.workingKey2 = c(!z10, bArr2);
        if (a10.length != 24) {
            this.workingKey3 = this.workingKey1;
            return;
        }
        byte[] bArr3 = new byte[8];
        System.arraycopy(a10, 16, bArr3, 0, 8);
        this.workingKey3 = c(z10, bArr3);
    }

    @Override // org.spongycastle.crypto.engines.C5960j, org.spongycastle.crypto.e
    public String getAlgorithmName() {
        return "DESede";
    }

    @Override // org.spongycastle.crypto.engines.C5960j, org.spongycastle.crypto.e
    public int getBlockSize() {
        return 8;
    }

    @Override // org.spongycastle.crypto.engines.C5960j, org.spongycastle.crypto.e
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int[] iArr = this.workingKey1;
        if (iArr == null) {
            throw new IllegalStateException("DESede engine not initialised");
        }
        if (i10 + 8 > bArr.length) {
            throw new org.spongycastle.crypto.l("input buffer too short");
        }
        if (i11 + 8 > bArr2.length) {
            throw new org.spongycastle.crypto.x("output buffer too short");
        }
        byte[] bArr3 = new byte[8];
        if (this.f62560a) {
            b(iArr, bArr, i10, bArr3, 0);
            b(this.workingKey2, bArr3, 0, bArr3, 0);
            b(this.workingKey3, bArr3, 0, bArr2, i11);
        } else {
            b(this.workingKey3, bArr, i10, bArr3, 0);
            b(this.workingKey2, bArr3, 0, bArr3, 0);
            b(this.workingKey1, bArr3, 0, bArr2, i11);
        }
        return 8;
    }

    @Override // org.spongycastle.crypto.engines.C5960j, org.spongycastle.crypto.e
    public void reset() {
    }
}
