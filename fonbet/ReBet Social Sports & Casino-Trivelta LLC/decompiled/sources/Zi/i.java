package Zi;

import android.R;
import kotlin.UByte;
import org.bouncycastle.math.ec.Tnaf;
import org.spongycastle.crypto.A;
import org.spongycastle.crypto.params.z;

/* loaded from: classes5.dex */
public class i extends A {
    private byte[] IV;

    /* renamed from: b, reason: collision with root package name */
    public int f14928b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14929c;

    /* renamed from: d, reason: collision with root package name */
    public final org.spongycastle.crypto.e f14930d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14931e;

    /* renamed from: f, reason: collision with root package name */
    public int f14932f;

    /* renamed from: g, reason: collision with root package name */
    public int f14933g;
    private byte[] ofbOutV;
    private byte[] ofbV;

    public i(org.spongycastle.crypto.e eVar) {
        super(eVar);
        this.f14931e = true;
        this.f14930d = eVar;
        int blockSize = eVar.getBlockSize();
        this.f14929c = blockSize;
        if (blockSize != 8) {
            throw new IllegalArgumentException("GCTR only for 64 bit block ciphers");
        }
        this.IV = new byte[eVar.getBlockSize()];
        this.ofbV = new byte[eVar.getBlockSize()];
        this.ofbOutV = new byte[eVar.getBlockSize()];
    }

    @Override // org.spongycastle.crypto.e
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        this.f14931e = true;
        this.f14932f = 0;
        this.f14933g = 0;
        if (!(jVar instanceof z)) {
            reset();
            if (jVar != null) {
                this.f14930d.a(true, jVar);
                return;
            }
            return;
        }
        z zVar = (z) jVar;
        byte[] a10 = zVar.a();
        int length = a10.length;
        byte[] bArr = this.IV;
        if (length < bArr.length) {
            System.arraycopy(a10, 0, bArr, bArr.length - a10.length, a10.length);
            int i10 = 0;
            while (true) {
                byte[] bArr2 = this.IV;
                if (i10 >= bArr2.length - a10.length) {
                    break;
                }
                bArr2[i10] = 0;
                i10++;
            }
        } else {
            System.arraycopy(a10, 0, bArr, 0, bArr.length);
        }
        reset();
        if (zVar.b() != null) {
            this.f14930d.a(true, zVar.b());
        }
    }

    @Override // org.spongycastle.crypto.A
    public byte b(byte b10) {
        if (this.f14928b == 0) {
            if (this.f14931e) {
                this.f14931e = false;
                this.f14930d.processBlock(this.ofbV, 0, this.ofbOutV, 0);
                this.f14932f = d(this.ofbOutV, 0);
                this.f14933g = d(this.ofbOutV, 4);
            }
            int i10 = this.f14932f + R.attr.cacheColorHint;
            this.f14932f = i10;
            this.f14933g += R.attr.hand_minute;
            e(i10, this.ofbV, 0);
            e(this.f14933g, this.ofbV, 4);
            this.f14930d.processBlock(this.ofbV, 0, this.ofbOutV, 0);
        }
        byte[] bArr = this.ofbOutV;
        int i11 = this.f14928b;
        int i12 = i11 + 1;
        this.f14928b = i12;
        byte b11 = (byte) (b10 ^ bArr[i11]);
        int i13 = this.f14929c;
        if (i12 == i13) {
            this.f14928b = 0;
            byte[] bArr2 = this.ofbV;
            System.arraycopy(bArr2, i13, bArr2, 0, bArr2.length - i13);
            byte[] bArr3 = this.ofbOutV;
            byte[] bArr4 = this.ofbV;
            int length = bArr4.length;
            int i14 = this.f14929c;
            System.arraycopy(bArr3, 0, bArr4, length - i14, i14);
        }
        return b11;
    }

    public final int d(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] << 24) & (-16777216)) + ((bArr[i10 + 2] << Tnaf.POW_2_WIDTH) & 16711680) + ((bArr[i10 + 1] << 8) & 65280) + (bArr[i10] & UByte.MAX_VALUE);
    }

    public final void e(int i10, byte[] bArr, int i11) {
        bArr[i11 + 3] = (byte) (i10 >>> 24);
        bArr[i11 + 2] = (byte) (i10 >>> 16);
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11] = (byte) i10;
    }

    @Override // org.spongycastle.crypto.e
    public String getAlgorithmName() {
        return this.f14930d.getAlgorithmName() + "/GCTR";
    }

    @Override // org.spongycastle.crypto.e
    public int getBlockSize() {
        return this.f14929c;
    }

    @Override // org.spongycastle.crypto.e
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        processBytes(bArr, i10, this.f14929c, bArr2, i11);
        return this.f14929c;
    }

    @Override // org.spongycastle.crypto.e
    public void reset() {
        this.f14931e = true;
        this.f14932f = 0;
        this.f14933g = 0;
        byte[] bArr = this.IV;
        System.arraycopy(bArr, 0, this.ofbV, 0, bArr.length);
        this.f14928b = 0;
        this.f14930d.reset();
    }
}
