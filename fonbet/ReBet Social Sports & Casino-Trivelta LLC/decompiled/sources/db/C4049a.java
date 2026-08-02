package db;

import cb.k;
import java.util.Arrays;

/* renamed from: db.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4049a {
    private final byte[] data;

    public C4049a(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.data = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }

    public static C4049a a(byte[] bArr) {
        if (bArr != null) {
            return b(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static C4049a b(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            return new C4049a(bArr, i10, i11);
        }
        throw new NullPointerException("data must be non-null");
    }

    public int c() {
        return this.data.length;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4049a) {
            return Arrays.equals(((C4049a) obj).data, this.data);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.data);
    }

    public String toString() {
        return "Bytes(" + k.b(this.data) + ")";
    }
}
