package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fu0 extends si6 {
    public final byte[] a;
    public final byte[] b;

    public fu0(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof si6) {
            si6 si6Var = (si6) obj;
            boolean z = si6Var instanceof fu0;
            fu0 fu0Var = (fu0) si6Var;
            if (Arrays.equals(this.a, z ? fu0Var.a : fu0Var.a)) {
                fu0 fu0Var2 = (fu0) si6Var;
                if (Arrays.equals(this.b, z ? fu0Var2.b : fu0Var2.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((Arrays.hashCode(this.a) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.a) + ", encryptedBlob=" + Arrays.toString(this.b) + "}";
    }
}
