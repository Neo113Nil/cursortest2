package Zi;

import org.spongycastle.crypto.params.z;

/* loaded from: classes5.dex */
public class b implements org.spongycastle.crypto.e {
    private byte[] IV;

    /* renamed from: a, reason: collision with root package name */
    public int f14886a;

    /* renamed from: b, reason: collision with root package name */
    public org.spongycastle.crypto.e f14887b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14888c;
    private byte[] cbcNextV;
    private byte[] cbcV;

    public b(org.spongycastle.crypto.e eVar) {
        this.f14887b = eVar;
        int blockSize = eVar.getBlockSize();
        this.f14886a = blockSize;
        this.IV = new byte[blockSize];
        this.cbcV = new byte[blockSize];
        this.cbcNextV = new byte[blockSize];
    }

    private int b(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12 = this.f14886a;
        if (i10 + i12 > bArr.length) {
            throw new org.spongycastle.crypto.l("input buffer too short");
        }
        System.arraycopy(bArr, i10, this.cbcNextV, 0, i12);
        int processBlock = this.f14887b.processBlock(bArr, i10, bArr2, i11);
        for (int i13 = 0; i13 < this.f14886a; i13++) {
            int i14 = i11 + i13;
            bArr2[i14] = (byte) (bArr2[i14] ^ this.cbcV[i13]);
        }
        byte[] bArr3 = this.cbcV;
        this.cbcV = this.cbcNextV;
        this.cbcNextV = bArr3;
        return processBlock;
    }

    private int c(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (this.f14886a + i10 > bArr.length) {
            throw new org.spongycastle.crypto.l("input buffer too short");
        }
        for (int i12 = 0; i12 < this.f14886a; i12++) {
            byte[] bArr3 = this.cbcV;
            bArr3[i12] = (byte) (bArr3[i12] ^ bArr[i10 + i12]);
        }
        int processBlock = this.f14887b.processBlock(this.cbcV, 0, bArr2, i11);
        byte[] bArr4 = this.cbcV;
        System.arraycopy(bArr2, i11, bArr4, 0, bArr4.length);
        return processBlock;
    }

    @Override // org.spongycastle.crypto.e
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        boolean z11 = this.f14888c;
        this.f14888c = z10;
        if (!(jVar instanceof z)) {
            reset();
            if (jVar != null) {
                this.f14887b.a(z10, jVar);
                return;
            } else {
                if (z11 != z10) {
                    throw new IllegalArgumentException("cannot change encrypting state without providing key.");
                }
                return;
            }
        }
        z zVar = (z) jVar;
        byte[] a10 = zVar.a();
        if (a10.length != this.f14886a) {
            throw new IllegalArgumentException("initialisation vector must be the same length as block size");
        }
        System.arraycopy(a10, 0, this.IV, 0, a10.length);
        reset();
        if (zVar.b() != null) {
            this.f14887b.a(z10, zVar.b());
        } else if (z11 != z10) {
            throw new IllegalArgumentException("cannot change encrypting state without providing key.");
        }
    }

    public org.spongycastle.crypto.e d() {
        return this.f14887b;
    }

    @Override // org.spongycastle.crypto.e
    public String getAlgorithmName() {
        return this.f14887b.getAlgorithmName() + "/CBC";
    }

    @Override // org.spongycastle.crypto.e
    public int getBlockSize() {
        return this.f14887b.getBlockSize();
    }

    @Override // org.spongycastle.crypto.e
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        return this.f14888c ? c(bArr, i10, bArr2, i11) : b(bArr, i10, bArr2, i11);
    }

    @Override // org.spongycastle.crypto.e
    public void reset() {
        byte[] bArr = this.IV;
        System.arraycopy(bArr, 0, this.cbcV, 0, bArr.length);
        Aj.a.m(this.cbcNextV, (byte) 0);
        this.f14887b.reset();
    }
}
