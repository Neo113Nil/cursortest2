package e5;

import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final b5.c f8651a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f8652b;

    public l(b5.c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f8651a = cVar;
        this.f8652b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f8651a.equals(lVar.f8651a)) {
            return Arrays.equals(this.f8652b, lVar.f8652b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8651a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f8652b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f8651a + ", bytes=[...]}";
    }
}
