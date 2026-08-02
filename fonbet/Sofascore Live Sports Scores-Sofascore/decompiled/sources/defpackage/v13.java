package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class v13 implements i72 {
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public int e;

    public v13(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = bArr;
    }

    public static int a(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v13.class == obj.getClass()) {
            v13 v13Var = (v13) obj;
            if (this.a == v13Var.a && this.b == v13Var.b && this.c == v13Var.c && Arrays.equals(this.d, v13Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.d) + ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.a) * 31) + this.b) * 31) + this.c) * 31);
        this.e = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return wt3.p(sb, this.d != null, ")");
    }
}
