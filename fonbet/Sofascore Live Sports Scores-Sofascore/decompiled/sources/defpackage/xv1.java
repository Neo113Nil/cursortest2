package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xv1 extends yq9 {
    public final byte[] b;

    public xv1(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xv1.class != obj.getClass()) {
            return false;
        }
        xv1 xv1Var = (xv1) obj;
        return this.a.equals(xv1Var.a) && Arrays.equals(this.b, xv1Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + dmi.c(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.a);
    }
}
