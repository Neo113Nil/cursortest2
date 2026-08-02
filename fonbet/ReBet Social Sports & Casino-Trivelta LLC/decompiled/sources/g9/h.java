package g9;

import d9.C4040c;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final C4040c f47203a;
    private final byte[] bytes;

    public h(C4040c c4040c, byte[] bArr) {
        if (c4040c == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f47203a = c4040c;
        this.bytes = bArr;
    }

    public byte[] a() {
        return this.bytes;
    }

    public C4040c b() {
        return this.f47203a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f47203a.equals(hVar.f47203a)) {
            return Arrays.equals(this.bytes, hVar.bytes);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f47203a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.bytes);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f47203a + ", bytes=[...]}";
    }
}
