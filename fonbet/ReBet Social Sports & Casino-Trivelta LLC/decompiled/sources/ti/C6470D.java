package ti;

import java.security.MessageDigest;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ui.AbstractC6591c;

/* renamed from: ti.D, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6470D extends k {

    @NotNull
    private final transient int[] directory;

    /* renamed from: e, reason: collision with root package name */
    public final transient byte[][] f65845e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6470D(byte[][] segments, int[] directory) {
        super(k.f65868d.g());
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.f65845e = segments;
        this.directory = directory;
    }

    private final Object writeReplace() {
        k C10 = C();
        Intrinsics.checkNotNull(C10, "null cannot be cast to non-null type java.lang.Object");
        return C10;
    }

    public final int[] A() {
        return this.directory;
    }

    public final byte[][] B() {
        return this.f65845e;
    }

    public final k C() {
        return new k(x());
    }

    @Override // ti.k
    public String b() {
        return C().b();
    }

    @Override // ti.k
    public k d(String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = B().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = A()[length + i10];
            int i13 = A()[i10];
            messageDigest.update(B()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] digest = messageDigest.digest();
        Intrinsics.checkNotNull(digest);
        return new k(digest);
    }

    @Override // ti.k
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (kVar.u() == u() && o(0, kVar, 0, u())) {
                return true;
            }
        }
        return false;
    }

    @Override // ti.k
    public int hashCode() {
        int h10 = h();
        if (h10 != 0) {
            return h10;
        }
        int length = B().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = A()[length + i10];
            int i14 = A()[i10];
            byte[] bArr = B()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        q(i11);
        return i11;
    }

    @Override // ti.k
    public int i() {
        return A()[B().length - 1];
    }

    @Override // ti.k
    public String k() {
        return C().k();
    }

    @Override // ti.k
    public byte[] l() {
        return x();
    }

    @Override // ti.k
    public byte m(int i10) {
        AbstractC6475e.b(A()[B().length - 1], i10, 1L);
        int b10 = AbstractC6591c.b(this, i10);
        return B()[b10][(i10 - (b10 == 0 ? 0 : A()[b10 - 1])) + A()[B().length + b10]];
    }

    @Override // ti.k
    public boolean o(int i10, k other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i10 < 0 || i10 > u() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int b10 = AbstractC6591c.b(this, i10);
        while (i10 < i13) {
            int i14 = b10 == 0 ? 0 : A()[b10 - 1];
            int i15 = A()[b10] - i14;
            int i16 = A()[B().length + b10];
            int min = Math.min(i13, i15 + i14) - i10;
            if (!other.p(i11, B()[b10], i16 + (i10 - i14), min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            b10++;
        }
        return true;
    }

    @Override // ti.k
    public boolean p(int i10, byte[] other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i10 < 0 || i10 > u() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int b10 = AbstractC6591c.b(this, i10);
        while (i10 < i13) {
            int i14 = b10 == 0 ? 0 : A()[b10 - 1];
            int i15 = A()[b10] - i14;
            int i16 = A()[B().length + b10];
            int min = Math.min(i13, i15 + i14) - i10;
            if (!AbstractC6475e.a(B()[b10], i16 + (i10 - i14), other, i11, min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            b10++;
        }
        return true;
    }

    @Override // ti.k
    public String toString() {
        return C().toString();
    }

    @Override // ti.k
    public k w() {
        return C().w();
    }

    @Override // ti.k
    public byte[] x() {
        byte[] bArr = new byte[u()];
        int length = B().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = A()[length + i10];
            int i14 = A()[i10];
            int i15 = i14 - i11;
            ArraysKt.copyInto(B()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // ti.k
    public void z(C6478h buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i12 = i10 + i11;
        int b10 = AbstractC6591c.b(this, i10);
        while (i10 < i12) {
            int i13 = b10 == 0 ? 0 : A()[b10 - 1];
            int i14 = A()[b10] - i13;
            int i15 = A()[B().length + b10];
            int min = Math.min(i12, i14 + i13) - i10;
            int i16 = i15 + (i10 - i13);
            C6468B c6468b = new C6468B(B()[b10], i16, i16 + min, true, false);
            C6468B c6468b2 = buffer.f65857a;
            if (c6468b2 == null) {
                c6468b.f65840f = c6468b;
                c6468b.f65839e = c6468b;
                buffer.f65857a = c6468b;
            } else {
                Intrinsics.checkNotNull(c6468b2);
                C6468B c6468b3 = c6468b2.f65840f;
                Intrinsics.checkNotNull(c6468b3);
                c6468b3.c(c6468b);
            }
            i10 += min;
            b10++;
        }
        buffer.e2(buffer.size() + i11);
    }
}
