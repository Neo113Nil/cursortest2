package defpackage;

import android.util.Base64;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class ql {
    public final SecretKey a;
    public final SecretKeySpec b;

    public ql(SecretKey secretKey, SecretKeySpec secretKeySpec) {
        this.a = secretKey;
        this.b = secretKeySpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ql.class != obj.getClass()) {
            return false;
        }
        ql qlVar = (ql) obj;
        return this.b.equals(qlVar.b) && this.a.equals(qlVar.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 31) * 31);
    }

    public final String toString() {
        return Base64.encodeToString(this.a.getEncoded(), 2) + ":" + Base64.encodeToString(this.b.getEncoded(), 2);
    }
}
