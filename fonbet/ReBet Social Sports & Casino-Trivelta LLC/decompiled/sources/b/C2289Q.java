package b;

import b3.AbstractC2382a;
import java.util.Arrays;

/* renamed from: b.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2289Q extends w0 {

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f24078b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f24079a;

    public C2289Q(byte[] bArr) {
        this.f24079a = bArr;
    }

    @Override // b.w0
    public final int a(boolean z10) {
        return q0.a(z10, this.f24079a.length);
    }

    @Override // b.w0
    public final void b(q0 q0Var, boolean z10) {
        q0Var.f(z10, 28, this.f24079a);
    }

    @Override // b.w0
    public final boolean c(w0 w0Var) {
        if (w0Var instanceof C2289Q) {
            return Arrays.equals(this.f24079a, ((C2289Q) w0Var).f24079a);
        }
        return false;
    }

    @Override // b.w0
    public final /* bridge */ /* synthetic */ boolean f() {
        return false;
    }

    @Override // b.w0
    public final int hashCode() {
        return AbstractC2382a.c(this.f24079a);
    }

    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        int i10;
        int i11;
        int length = this.f24079a.length;
        if (length >= 128) {
            int i12 = length;
            i10 = 2;
            while (true) {
                i12 >>>= 8;
                if (i12 == 0) {
                    break;
                }
                i10++;
            }
        } else {
            i10 = 1;
        }
        StringBuffer stringBuffer = new StringBuffer(((i10 + length) * 2) + 3);
        stringBuffer.append("#1C");
        if (length < 128) {
            char[] cArr = f24078b;
            stringBuffer.append(cArr[(length >>> 4) & 15]);
            stringBuffer.append(cArr[length & 15]);
        } else {
            byte[] bArr = new byte[5];
            int i13 = length;
            int i14 = 5;
            while (true) {
                i11 = i14 - 1;
                bArr[i11] = (byte) i13;
                i13 >>>= 8;
                if (i13 == 0) {
                    break;
                }
                i14 = i11;
            }
            int i15 = i14 - 2;
            bArr[i15] = (byte) (128 | (5 - i11));
            while (true) {
                int i16 = i15 + 1;
                byte b10 = bArr[i15];
                char[] cArr2 = f24078b;
                stringBuffer.append(cArr2[(b10 >>> 4) & 15]);
                stringBuffer.append(cArr2[b10 & 15]);
                if (i16 >= 5) {
                    break;
                }
                i15 = i16;
            }
        }
        for (int i17 = 0; i17 < length; i17++) {
            byte b11 = this.f24079a[i17];
            char[] cArr3 = f24078b;
            stringBuffer.append(cArr3[(b11 >>> 4) & 15]);
            stringBuffer.append(cArr3[b11 & 15]);
        }
        return stringBuffer.toString();
    }
}
