package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vs0 extends tw3 {
    public final String a;
    public final byte[] b;

    public vs0(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tw3)) {
            return false;
        }
        tw3 tw3Var = (tw3) obj;
        vs0 vs0Var = (vs0) tw3Var;
        if (this.a.equals(vs0Var.a)) {
            return Arrays.equals(this.b, tw3Var instanceof vs0 ? ((vs0) tw3Var).b : vs0Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }
}
