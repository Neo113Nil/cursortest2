package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class dn5 {
    public final kn5 a;
    public final byte[] b;

    public dn5(kn5 kn5Var, byte[] bArr) {
        if (kn5Var == null) {
            yhk.s("encoding is null");
            throw null;
        }
        if (bArr == null) {
            yhk.s("bytes is null");
            throw null;
        }
        this.a = kn5Var;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn5)) {
            return false;
        }
        dn5 dn5Var = (dn5) obj;
        if (this.a.equals(dn5Var.a)) {
            return Arrays.equals(this.b, dn5Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
