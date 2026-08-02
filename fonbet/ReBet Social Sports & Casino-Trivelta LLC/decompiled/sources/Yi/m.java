package Yi;

import kotlin.UByte;
import org.spongycastle.crypto.params.w;
import org.spongycastle.crypto.params.z;
import org.spongycastle.crypto.v;

/* loaded from: classes5.dex */
public class m implements v {

    /* renamed from: T, reason: collision with root package name */
    private byte[] f14345T;

    /* renamed from: a, reason: collision with root package name */
    public byte f14346a;

    /* renamed from: d, reason: collision with root package name */
    public byte f14349d;

    /* renamed from: e, reason: collision with root package name */
    public byte f14350e;

    /* renamed from: f, reason: collision with root package name */
    public byte f14351f;

    /* renamed from: g, reason: collision with root package name */
    public byte f14352g;
    private byte[] workingIV;
    private byte[] workingKey;

    /* renamed from: b, reason: collision with root package name */
    public byte f14347b = 0;

    /* renamed from: P, reason: collision with root package name */
    private byte[] f14344P = null;

    /* renamed from: c, reason: collision with root package name */
    public byte f14348c = 0;

    @Override // org.spongycastle.crypto.v
    public void a(org.spongycastle.crypto.j jVar) {
        if (!(jVar instanceof z)) {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include an IV");
        }
        z zVar = (z) jVar;
        w wVar = (w) zVar.b();
        if (!(zVar.b() instanceof w)) {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include a key");
        }
        byte[] a10 = zVar.a();
        this.workingIV = a10;
        if (a10 == null || a10.length < 1 || a10.length > 768) {
            throw new IllegalArgumentException("VMPC-MAC requires 1 to 768 bytes of IV");
        }
        this.workingKey = wVar.a();
        reset();
    }

    public final void b(byte[] bArr, byte[] bArr2) {
        this.f14348c = (byte) 0;
        this.f14344P = new byte[256];
        for (int i10 = 0; i10 < 256; i10++) {
            this.f14344P[i10] = (byte) i10;
        }
        for (int i11 = 0; i11 < 768; i11++) {
            byte[] bArr3 = this.f14344P;
            byte b10 = this.f14348c;
            int i12 = i11 & 255;
            byte b11 = bArr3[i12];
            byte b12 = bArr3[(b10 + b11 + bArr[i11 % bArr.length]) & 255];
            this.f14348c = b12;
            bArr3[i12] = bArr3[b12 & UByte.MAX_VALUE];
            bArr3[b12 & UByte.MAX_VALUE] = b11;
        }
        for (int i13 = 0; i13 < 768; i13++) {
            byte[] bArr4 = this.f14344P;
            byte b13 = this.f14348c;
            int i14 = i13 & 255;
            byte b14 = bArr4[i14];
            byte b15 = bArr4[(b13 + b14 + bArr2[i13 % bArr2.length]) & 255];
            this.f14348c = b15;
            bArr4[i14] = bArr4[b15 & UByte.MAX_VALUE];
            bArr4[b15 & UByte.MAX_VALUE] = b14;
        }
        this.f14347b = (byte) 0;
    }

    @Override // org.spongycastle.crypto.v
    public int doFinal(byte[] bArr, int i10) {
        for (int i11 = 1; i11 < 25; i11++) {
            byte[] bArr2 = this.f14344P;
            byte b10 = this.f14348c;
            byte b11 = this.f14347b;
            byte b12 = bArr2[(b10 + bArr2[b11 & UByte.MAX_VALUE]) & 255];
            this.f14348c = b12;
            byte b13 = this.f14352g;
            byte b14 = this.f14351f;
            byte b15 = bArr2[(b13 + b14 + i11) & 255];
            this.f14352g = b15;
            byte b16 = this.f14350e;
            byte b17 = bArr2[(b14 + b16 + i11) & 255];
            this.f14351f = b17;
            byte b18 = this.f14349d;
            byte b19 = bArr2[(b16 + b18 + i11) & 255];
            this.f14350e = b19;
            byte b20 = bArr2[(b18 + b12 + i11) & 255];
            this.f14349d = b20;
            byte[] bArr3 = this.f14345T;
            byte b21 = this.f14346a;
            bArr3[b21 & 31] = (byte) (b20 ^ bArr3[b21 & 31]);
            bArr3[(b21 + 1) & 31] = (byte) (b19 ^ bArr3[(b21 + 1) & 31]);
            bArr3[(b21 + 2) & 31] = (byte) (b17 ^ bArr3[(b21 + 2) & 31]);
            bArr3[(b21 + 3) & 31] = (byte) (b15 ^ bArr3[(b21 + 3) & 31]);
            this.f14346a = (byte) ((b21 + 4) & 31);
            byte b22 = bArr2[b11 & UByte.MAX_VALUE];
            bArr2[b11 & UByte.MAX_VALUE] = bArr2[b12 & UByte.MAX_VALUE];
            bArr2[b12 & UByte.MAX_VALUE] = b22;
            this.f14347b = (byte) ((b11 + 1) & 255);
        }
        for (int i12 = 0; i12 < 768; i12++) {
            byte[] bArr4 = this.f14344P;
            byte b23 = this.f14348c;
            int i13 = i12 & 255;
            byte b24 = bArr4[i13];
            byte b25 = bArr4[(b23 + b24 + this.f14345T[i12 & 31]) & 255];
            this.f14348c = b25;
            bArr4[i13] = bArr4[b25 & UByte.MAX_VALUE];
            bArr4[b25 & UByte.MAX_VALUE] = b24;
        }
        byte[] bArr5 = new byte[20];
        for (int i14 = 0; i14 < 20; i14++) {
            byte[] bArr6 = this.f14344P;
            int i15 = i14 & 255;
            byte b26 = bArr6[(this.f14348c + bArr6[i15]) & 255];
            this.f14348c = b26;
            bArr5[i14] = bArr6[(bArr6[bArr6[b26 & UByte.MAX_VALUE] & UByte.MAX_VALUE] + 1) & 255];
            byte b27 = bArr6[i15];
            bArr6[i15] = bArr6[b26 & UByte.MAX_VALUE];
            bArr6[b26 & UByte.MAX_VALUE] = b27;
        }
        System.arraycopy(bArr5, 0, bArr, i10, 20);
        reset();
        return 20;
    }

    @Override // org.spongycastle.crypto.v
    public String getAlgorithmName() {
        return "VMPC-MAC";
    }

    @Override // org.spongycastle.crypto.v
    public int getMacSize() {
        return 20;
    }

    @Override // org.spongycastle.crypto.v
    public void reset() {
        b(this.workingKey, this.workingIV);
        this.f14347b = (byte) 0;
        this.f14352g = (byte) 0;
        this.f14351f = (byte) 0;
        this.f14350e = (byte) 0;
        this.f14349d = (byte) 0;
        this.f14346a = (byte) 0;
        this.f14345T = new byte[32];
        for (int i10 = 0; i10 < 32; i10++) {
            this.f14345T[i10] = 0;
        }
    }

    @Override // org.spongycastle.crypto.v
    public void update(byte b10) {
        byte[] bArr = this.f14344P;
        byte b11 = this.f14348c;
        byte b12 = this.f14347b;
        byte b13 = bArr[(b11 + bArr[b12 & UByte.MAX_VALUE]) & 255];
        this.f14348c = b13;
        byte b14 = (byte) (b10 ^ bArr[(bArr[bArr[b13 & UByte.MAX_VALUE] & UByte.MAX_VALUE] + 1) & 255]);
        byte b15 = this.f14352g;
        byte b16 = this.f14351f;
        byte b17 = bArr[(b15 + b16) & 255];
        this.f14352g = b17;
        byte b18 = this.f14350e;
        byte b19 = bArr[(b16 + b18) & 255];
        this.f14351f = b19;
        byte b20 = this.f14349d;
        byte b21 = bArr[(b18 + b20) & 255];
        this.f14350e = b21;
        byte b22 = bArr[(b20 + b13 + b14) & 255];
        this.f14349d = b22;
        byte[] bArr2 = this.f14345T;
        byte b23 = this.f14346a;
        bArr2[b23 & 31] = (byte) (b22 ^ bArr2[b23 & 31]);
        bArr2[(b23 + 1) & 31] = (byte) (b21 ^ bArr2[(b23 + 1) & 31]);
        bArr2[(b23 + 2) & 31] = (byte) (b19 ^ bArr2[(b23 + 2) & 31]);
        bArr2[(b23 + 3) & 31] = (byte) (b17 ^ bArr2[(b23 + 3) & 31]);
        this.f14346a = (byte) ((b23 + 4) & 31);
        byte b24 = bArr[b12 & UByte.MAX_VALUE];
        bArr[b12 & UByte.MAX_VALUE] = bArr[b13 & UByte.MAX_VALUE];
        bArr[b13 & UByte.MAX_VALUE] = b24;
        this.f14347b = (byte) ((b12 + 1) & 255);
    }

    @Override // org.spongycastle.crypto.v
    public void update(byte[] bArr, int i10, int i11) {
        if (i10 + i11 > bArr.length) {
            throw new org.spongycastle.crypto.l("input buffer too short");
        }
        for (int i12 = 0; i12 < i11; i12++) {
            update(bArr[i10 + i12]);
        }
    }
}
