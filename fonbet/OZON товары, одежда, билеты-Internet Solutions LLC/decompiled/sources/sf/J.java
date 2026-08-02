package sf;

import B0.A0;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class J extends C9684j {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final transient byte[][] f98680e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final transient int[] f98681f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(@NotNull byte[][] segments, @NotNull int[] directory) {
        super(C9684j.f98719d.e());
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.f98680e = segments;
        this.f98681f = directory;
    }

    private final C9684j L() {
        return new C9684j(G());
    }

    private final Object writeReplace() {
        return L();
    }

    @Override // sf.C9684j
    @NotNull
    public final String C(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return L().C(charset);
    }

    @Override // sf.C9684j
    @NotNull
    public final C9684j D(int i11, int i12) {
        int e11 = C9676b.e(i12, this);
        if (i11 < 0) {
            throw new IllegalArgumentException(T7.E.a(i11, "beginIndex=", " < 0").toString());
        }
        if (e11 > g()) {
            StringBuilder f7 = P4.f.f(e11, "endIndex=", " > length(");
            f7.append(g());
            f7.append(')');
            throw new IllegalArgumentException(f7.toString().toString());
        }
        int i13 = e11 - i11;
        if (i13 < 0) {
            throw new IllegalArgumentException(A0.a(e11, i11, "endIndex=", " < beginIndex=").toString());
        }
        if (i11 == 0 && e11 == g()) {
            return this;
        }
        if (i11 == e11) {
            return C9684j.f98719d;
        }
        int a11 = tf.d.a(this, i11);
        int a12 = tf.d.a(this, e11 - 1);
        byte[][] bArr = this.f98680e;
        byte[][] bArr2 = (byte[][]) C7705l.w(a11, a12 + 1, bArr);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f98681f;
        if (a11 <= a12) {
            int i14 = a11;
            int i15 = 0;
            while (true) {
                iArr[i15] = Math.min(iArr2[i14] - i11, i13);
                int i16 = i15 + 1;
                iArr[i15 + bArr2.length] = iArr2[bArr.length + i14];
                if (i14 == a12) {
                    break;
                }
                i14++;
                i15 = i16;
            }
        }
        int i17 = a11 != 0 ? iArr2[a11 - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i11 - i17) + iArr[length];
        return new J(bArr2, iArr);
    }

    @Override // sf.C9684j
    @NotNull
    public final C9684j F() {
        return L().F();
    }

    @Override // sf.C9684j
    @NotNull
    public final byte[] G() {
        byte[] bArr = new byte[g()];
        byte[][] bArr2 = this.f98680e;
        int length = bArr2.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < length) {
            int[] iArr = this.f98681f;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            int i16 = i15 - i12;
            C7705l.o(i13, i14, i14 + i16, bArr2[i11], bArr);
            i13 += i16;
            i11++;
            i12 = i15;
        }
        return bArr;
    }

    @Override // sf.C9684j
    public final void I(@NotNull C9681g buffer, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int a11 = tf.d.a(this, 0);
        int i12 = 0;
        while (i12 < i11) {
            int[] iArr = this.f98681f;
            int i13 = a11 == 0 ? 0 : iArr[a11 - 1];
            int i14 = iArr[a11] - i13;
            byte[][] bArr = this.f98680e;
            int i15 = iArr[bArr.length + a11];
            int min = Math.min(i11, i14 + i13) - i12;
            int i16 = (i12 - i13) + i15;
            H h11 = new H(bArr[a11], i16, i16 + min, true, false);
            H h12 = buffer.f98708a;
            if (h12 == null) {
                h11.f98676g = h11;
                h11.f98675f = h11;
                buffer.f98708a = h11;
            } else {
                H h13 = h12.f98676g;
                Intrinsics.f(h13);
                h13.b(h11);
            }
            i12 += min;
            a11++;
        }
        buffer.O(buffer.size() + i11);
    }

    @NotNull
    public final int[] J() {
        return this.f98681f;
    }

    @NotNull
    public final byte[][] K() {
        return this.f98680e;
    }

    @Override // sf.C9684j
    @NotNull
    public final String a() {
        return L().a();
    }

    @Override // sf.C9684j
    @NotNull
    public final C9684j d(@NotNull String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        byte[][] bArr = this.f98680e;
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int[] iArr = this.f98681f;
            int i13 = iArr[length + i11];
            int i14 = iArr[i11];
            messageDigest.update(bArr[i11], i13, i14 - i12);
            i11++;
            i12 = i14;
        }
        byte[] digestBytes = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(digestBytes, "digestBytes");
        return new C9684j(digestBytes);
    }

    @Override // sf.C9684j
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9684j) {
            C9684j c9684j = (C9684j) obj;
            if (c9684j.g() == g() && u(0, c9684j, g())) {
                return true;
            }
        }
        return false;
    }

    @Override // sf.C9684j
    public final int g() {
        return this.f98681f[this.f98680e.length - 1];
    }

    @Override // sf.C9684j
    @NotNull
    public final String h() {
        return L().h();
    }

    @Override // sf.C9684j
    public final int hashCode() {
        int f7 = f();
        if (f7 != 0) {
            return f7;
        }
        byte[][] bArr = this.f98680e;
        int length = bArr.length;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            int[] iArr = this.f98681f;
            int i14 = iArr[length + i12];
            int i15 = iArr[i12];
            byte[] bArr2 = bArr[i12];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i11 = (i11 * 31) + bArr2[i14];
                i14++;
            }
            i12++;
            i13 = i15;
        }
        A(i11);
        return i11;
    }

    @Override // sf.C9684j
    public final int j(int i11, @NotNull byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return L().j(i11, other);
    }

    @Override // sf.C9684j
    @NotNull
    public final byte[] m() {
        return G();
    }

    @Override // sf.C9684j
    public final byte n(int i11) {
        byte[][] bArr = this.f98680e;
        int length = bArr.length - 1;
        int[] iArr = this.f98681f;
        C9676b.b(iArr[length], i11, 1L);
        int a11 = tf.d.a(this, i11);
        return bArr[a11][(i11 - (a11 == 0 ? 0 : iArr[a11 - 1])) + iArr[bArr.length + a11]];
    }

    @Override // sf.C9684j
    public final int p(int i11, @NotNull byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return L().p(i11, other);
    }

    @Override // sf.C9684j
    @NotNull
    public final String toString() {
        return L().toString();
    }

    @Override // sf.C9684j
    public final boolean u(int i11, @NotNull C9684j other, int i12) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i11 >= 0 && i11 <= g() - i12) {
            int i13 = i12 + i11;
            int a11 = tf.d.a(this, i11);
            int i14 = 0;
            while (i11 < i13) {
                int[] iArr = this.f98681f;
                int i15 = a11 == 0 ? 0 : iArr[a11 - 1];
                int i16 = iArr[a11] - i15;
                byte[][] bArr = this.f98680e;
                int i17 = iArr[bArr.length + a11];
                int min = Math.min(i13, i16 + i15) - i11;
                if (other.v(i14, bArr[a11], (i11 - i15) + i17, min)) {
                    i14 += min;
                    i11 += min;
                    a11++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // sf.C9684j
    public final boolean v(int i11, @NotNull byte[] other, int i12, int i13) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i11 < 0 || i11 > g() - i13 || i12 < 0 || i12 > other.length - i13) {
            return false;
        }
        int i14 = i13 + i11;
        int a11 = tf.d.a(this, i11);
        while (i11 < i14) {
            int[] iArr = this.f98681f;
            int i15 = a11 == 0 ? 0 : iArr[a11 - 1];
            int i16 = iArr[a11] - i15;
            byte[][] bArr = this.f98680e;
            int i17 = iArr[bArr.length + a11];
            int min = Math.min(i14, i16 + i15) - i11;
            if (!C9676b.a((i11 - i15) + i17, i12, min, bArr[a11], other)) {
                return false;
            }
            i12 += min;
            i11 += min;
            a11++;
        }
        return true;
    }
}
