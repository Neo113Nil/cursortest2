package j8;

import O7.o;
import java.util.Arrays;

/* renamed from: j8.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7306a {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f69504a;

    private C7306a(int i11, byte[] bArr) {
        byte[] bArr2 = new byte[i11];
        this.f69504a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i11);
    }

    public static C7306a a(int i11, byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        if (i11 > bArr.length) {
            i11 = bArr.length;
        }
        return new C7306a(i11, bArr);
    }

    public static C7306a b(byte[] bArr) {
        if (bArr != null) {
            return a(bArr.length, bArr);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final int c() {
        return this.f69504a.length;
    }

    public final byte[] d() {
        byte[] bArr = this.f69504a;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7306a) {
            return Arrays.equals(((C7306a) obj).f69504a, this.f69504a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f69504a);
    }

    public final String toString() {
        return "Bytes(" + o.c(this.f69504a) + ")";
    }
}
