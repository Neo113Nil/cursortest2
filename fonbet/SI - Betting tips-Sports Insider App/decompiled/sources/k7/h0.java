package k7;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h0 extends a implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final MessageDigest f18865e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18866f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f18867g;

    /* renamed from: h, reason: collision with root package name */
    public final String f18868h;

    public h0() {
        boolean z5;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.f18865e = messageDigest;
            this.f18866f = messageDigest.getDigestLength();
            this.f18868h = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z5 = true;
            } catch (CloneNotSupportedException unused) {
                z5 = false;
            }
            this.f18867g = z5;
        } catch (NoSuchAlgorithmException e7) {
            throw new AssertionError(e7);
        }
    }

    public final String toString() {
        return this.f18868h;
    }
}
