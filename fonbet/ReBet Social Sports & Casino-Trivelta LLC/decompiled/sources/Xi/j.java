package Xi;

import kotlin.UByte;
import org.spongycastle.crypto.o;
import org.spongycastle.crypto.params.w;
import org.spongycastle.crypto.params.z;
import org.spongycastle.crypto.q;
import org.spongycastle.crypto.y;

/* loaded from: classes5.dex */
public class j extends y {

    /* renamed from: b, reason: collision with root package name */
    public o f13881b;

    /* renamed from: c, reason: collision with root package name */
    public int f13882c;

    /* renamed from: d, reason: collision with root package name */
    public int f13883d;

    public j(o oVar) {
        this.f13881b = oVar;
        if (oVar instanceof q) {
            this.f13882c = oVar.getDigestSize();
            this.f13883d = ((q) oVar).getByteLength();
        } else {
            throw new IllegalArgumentException("Digest " + oVar.getAlgorithmName() + " unsupported");
        }
    }

    @Override // org.spongycastle.crypto.y
    public org.spongycastle.crypto.j d(int i10) {
        int i11 = i10 / 8;
        return new w(i(3, i11), 0, i11);
    }

    @Override // org.spongycastle.crypto.y
    public org.spongycastle.crypto.j e(int i10) {
        int i11 = i10 / 8;
        return new w(i(1, i11), 0, i11);
    }

    @Override // org.spongycastle.crypto.y
    public org.spongycastle.crypto.j f(int i10, int i11) {
        int i12 = i10 / 8;
        int i13 = i11 / 8;
        byte[] i14 = i(1, i12);
        return new z(new w(i14, 0, i12), i(2, i13), 0, i13);
    }

    public final void h(byte[] bArr, int i10, byte[] bArr2) {
        int i11 = (bArr2[bArr2.length - 1] & UByte.MAX_VALUE) + (bArr[(bArr2.length + i10) - 1] & UByte.MAX_VALUE) + 1;
        bArr[(bArr2.length + i10) - 1] = (byte) i11;
        int i12 = i11 >>> 8;
        for (int length = bArr2.length - 2; length >= 0; length--) {
            int i13 = i10 + length;
            int i14 = i12 + (bArr2[length] & UByte.MAX_VALUE) + (bArr[i13] & UByte.MAX_VALUE);
            bArr[i13] = (byte) i14;
            i12 = i14 >>> 8;
        }
    }

    public final byte[] i(int i10, int i11) {
        byte[] bArr;
        byte[] bArr2;
        int i12;
        int i13 = this.f13883d;
        byte[] bArr3 = new byte[i13];
        byte[] bArr4 = new byte[i11];
        int i14 = 0;
        for (int i15 = 0; i15 != i13; i15++) {
            bArr3[i15] = (byte) i10;
        }
        byte[] bArr5 = this.salt;
        int i16 = 1;
        if (bArr5 == null || bArr5.length == 0) {
            bArr = new byte[0];
        } else {
            int i17 = this.f13883d;
            int length = i17 * (((bArr5.length + i17) - 1) / i17);
            bArr = new byte[length];
            for (int i18 = 0; i18 != length; i18++) {
                byte[] bArr6 = this.salt;
                bArr[i18] = bArr6[i18 % bArr6.length];
            }
        }
        byte[] bArr7 = this.password;
        if (bArr7 == null || bArr7.length == 0) {
            bArr2 = new byte[0];
        } else {
            int i19 = this.f13883d;
            int length2 = i19 * (((bArr7.length + i19) - 1) / i19);
            bArr2 = new byte[length2];
            for (int i20 = 0; i20 != length2; i20++) {
                byte[] bArr8 = this.password;
                bArr2[i20] = bArr8[i20 % bArr8.length];
            }
        }
        int length3 = bArr.length + bArr2.length;
        byte[] bArr9 = new byte[length3];
        System.arraycopy(bArr, 0, bArr9, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr9, bArr.length, bArr2.length);
        int i21 = this.f13883d;
        byte[] bArr10 = new byte[i21];
        int i22 = this.f13882c;
        int i23 = ((i11 + i22) - 1) / i22;
        byte[] bArr11 = new byte[i22];
        int i24 = 1;
        while (i24 <= i23) {
            this.f13881b.update(bArr3, i14, i13);
            this.f13881b.update(bArr9, i14, length3);
            this.f13881b.doFinal(bArr11, i14);
            for (int i25 = i16; i25 < this.f62682a; i25++) {
                this.f13881b.update(bArr11, i14, i22);
                this.f13881b.doFinal(bArr11, i14);
            }
            for (int i26 = i14; i26 != i21; i26++) {
                bArr10[i26] = bArr11[i26 % i22];
            }
            int i27 = i14;
            while (true) {
                int i28 = this.f13883d;
                if (i27 == length3 / i28) {
                    break;
                }
                h(bArr9, i28 * i27, bArr10);
                i27++;
            }
            if (i24 == i23) {
                int i29 = i24 - 1;
                int i30 = this.f13882c;
                int i31 = i29 * i30;
                int i32 = i11 - (i29 * i30);
                i12 = 0;
                System.arraycopy(bArr11, 0, bArr4, i31, i32);
            } else {
                i12 = 0;
                System.arraycopy(bArr11, 0, bArr4, (i24 - 1) * this.f13882c, i22);
            }
            i24++;
            i14 = i12;
            i16 = 1;
        }
        return bArr4;
    }
}
