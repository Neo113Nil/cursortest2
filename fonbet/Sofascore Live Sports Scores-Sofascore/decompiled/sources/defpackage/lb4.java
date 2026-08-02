package defpackage;

import java.math.BigInteger;

/* loaded from: classes7.dex */
public final class lb4 {
    public BigInteger a;
    public BigInteger b;
    public BigInteger c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof lb4)) {
            return false;
        }
        lb4 lb4Var = (lb4) obj;
        BigInteger bigInteger = this.c;
        BigInteger bigInteger2 = lb4Var.c;
        if (bigInteger != null) {
            if (!bigInteger.equals(bigInteger2)) {
                return false;
            }
        } else if (bigInteger2 != null) {
            return false;
        }
        return lb4Var.b.equals(this.b) && lb4Var.a.equals(this.a);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() ^ this.a.hashCode();
        BigInteger bigInteger = this.c;
        return (bigInteger != null ? bigInteger.hashCode() : 0) ^ hashCode;
    }
}
