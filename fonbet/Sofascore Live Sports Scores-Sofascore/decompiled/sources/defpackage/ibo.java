package defpackage;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ibo extends rha implements Serializable {
    public final MessageDigest f;
    public final int g;
    public final boolean h;
    public final String i;

    public ibo() {
        boolean z;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.f = messageDigest;
            this.g = messageDigest.getDigestLength();
            this.i = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z = true;
            } catch (CloneNotSupportedException unused) {
                z = false;
            }
            this.h = z;
        } catch (NoSuchAlgorithmException e) {
            a70.j(e);
            throw null;
        }
    }

    public final String toString() {
        return this.i;
    }
}
