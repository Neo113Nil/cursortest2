package defpackage;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class a2h extends gc2 {
    public final transient byte[][] e;
    public final transient int[] f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2h(byte[][] bArr, int[] iArr) {
        super(gc2.d.a);
        bArr.getClass();
        this.e = bArr;
        this.f = iArr;
    }

    private final Object writeReplace() {
        return y();
    }

    @Override // defpackage.gc2
    public final String d() {
        return y().d();
    }

    @Override // defpackage.gc2
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gc2) {
            gc2 gc2Var = (gc2) obj;
            if (gc2Var.h() == h() && q(gc2Var, 0, h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gc2
    public final void f(int i, int i2, int i3, byte[] bArr) {
        bArr.getClass();
        long j = i3;
        yqo.x(h(), i, j);
        yqo.x(bArr.length, i2, j);
        int i4 = i3 + i;
        int K = rfo.K(this, i);
        while (i < i4) {
            int[] iArr = this.f;
            int i5 = K == 0 ? 0 : iArr[K - 1];
            int i6 = iArr[K] - i5;
            byte[][] bArr2 = this.e;
            int i7 = iArr[bArr2.length + K];
            int min = Math.min(i4, i6 + i5) - i;
            int i8 = (i - i5) + i7;
            mh0.f(bArr2[K], i2, i8, bArr, i8 + min);
            i2 += min;
            i += min;
            K++;
        }
    }

    @Override // defpackage.gc2
    public final gc2 g(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = messageDigest.digest();
        digest.getClass();
        return new gc2(digest);
    }

    @Override // defpackage.gc2
    public final int h() {
        return this.f[this.e.length - 1];
    }

    @Override // defpackage.gc2
    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.b = i3;
        return i3;
    }

    @Override // defpackage.gc2
    public final String i() {
        return y().i();
    }

    @Override // defpackage.gc2
    public final int j(int i, byte[] bArr) {
        bArr.getClass();
        return y().j(i, bArr);
    }

    @Override // defpackage.gc2
    public final byte[] l() {
        return v();
    }

    @Override // defpackage.gc2
    public final byte m(int i) {
        byte[][] bArr = this.e;
        int length = bArr.length - 1;
        int[] iArr = this.f;
        yqo.x(iArr[length], i, 1L);
        int K = rfo.K(this, i);
        return bArr[K][(i - (K == 0 ? 0 : iArr[K - 1])) + iArr[bArr.length + K]];
    }

    @Override // defpackage.gc2
    public final int n(int i, byte[] bArr) {
        bArr.getClass();
        return y().n(i, bArr);
    }

    @Override // defpackage.gc2
    public final boolean p(int i, int i2, int i3, byte[] bArr) {
        bArr.getClass();
        if (i >= 0 && i <= h() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i4 = i3 + i;
            int K = rfo.K(this, i);
            while (i < i4) {
                int[] iArr = this.f;
                int i5 = K == 0 ? 0 : iArr[K - 1];
                int i6 = iArr[K] - i5;
                byte[][] bArr2 = this.e;
                int i7 = iArr[bArr2.length + K];
                int min = Math.min(i4, i6 + i5) - i;
                if (yqo.s(bArr2[K], (i - i5) + i7, i2, bArr, min)) {
                    i2 += min;
                    i += min;
                    K++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.gc2
    public final boolean q(gc2 gc2Var, int i, int i2) {
        gc2Var.getClass();
        if (i >= 0 && i <= h() - i2) {
            int i3 = i2 + i;
            int K = rfo.K(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.f;
                int i5 = K == 0 ? 0 : iArr[K - 1];
                int i6 = iArr[K] - i5;
                byte[][] bArr = this.e;
                int i7 = iArr[bArr.length + K];
                int min = Math.min(i3, i6 + i5) - i;
                if (gc2Var.p(i4, (i - i5) + i7, min, bArr[K])) {
                    i4 += min;
                    i += min;
                    K++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.gc2
    public final String r(Charset charset) {
        charset.getClass();
        return y().r(charset);
    }

    @Override // defpackage.gc2
    public final gc2 s(int i, int i2) {
        if (i < 0) {
            ogj.h(lnb.k(i, "beginIndex=", " < 0"));
            return null;
        }
        if (i2 > h()) {
            StringBuilder t = lnb.t(i2, "endIndex=", " > length(");
            t.append(h());
            t.append(')');
            throw new IllegalArgumentException(t.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            ogj.h(dmi.k(i2, i, "endIndex=", " < beginIndex="));
            return null;
        }
        if (i == 0 && i2 == h()) {
            return this;
        }
        if (i == i2) {
            return gc2.d;
        }
        int K = rfo.K(this, i);
        int K2 = rfo.K(this, i2 - 1);
        byte[][] bArr = this.e;
        byte[][] bArr2 = (byte[][]) mh0.l(K, K2 + 1, bArr);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f;
        if (K <= K2) {
            int i4 = K;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == K2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = K != 0 ? iArr2[K - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new a2h(bArr2, iArr);
    }

    @Override // defpackage.gc2
    public final String toString() {
        return y().toString();
    }

    @Override // defpackage.gc2
    public final gc2 u() {
        return y().u();
    }

    @Override // defpackage.gc2
    public final byte[] v() {
        byte[] bArr = new byte[h()];
        byte[][] bArr2 = this.e;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            mh0.f(bArr2[i], i3, i4, bArr, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // defpackage.gc2
    public final void x(x52 x52Var, int i) {
        int K = rfo.K(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.f;
            int i3 = K == 0 ? 0 : iArr[K - 1];
            int i4 = iArr[K] - i3;
            byte[][] bArr = this.e;
            int i5 = iArr[bArr.length + K];
            int min = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            b1h b1hVar = new b1h(bArr[K], i6, i6 + min, true);
            b1h b1hVar2 = x52Var.a;
            if (b1hVar2 == null) {
                b1hVar.g = b1hVar;
                b1hVar.f = b1hVar;
                x52Var.a = b1hVar;
            } else {
                b1h b1hVar3 = b1hVar2.g;
                b1hVar3.getClass();
                b1hVar3.b(b1hVar);
            }
            i2 += min;
            K++;
        }
        x52Var.b += i;
    }

    public final gc2 y() {
        return new gc2(v());
    }
}
