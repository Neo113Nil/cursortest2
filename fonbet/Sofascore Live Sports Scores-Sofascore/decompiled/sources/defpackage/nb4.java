package defpackage;

import java.math.BigInteger;

/* loaded from: classes7.dex */
public final class nb4 {
    public final BigInteger a;
    public final BigInteger b;
    public final BigInteger c;

    public nb4(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, ob4 ob4Var) {
        this.a = bigInteger3;
        this.c = bigInteger;
        this.b = bigInteger2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nb4)) {
            return false;
        }
        nb4 nb4Var = (nb4) obj;
        return nb4Var.c.equals(this.c) && nb4Var.b.equals(this.b) && nb4Var.a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (this.c.hashCode() ^ this.b.hashCode());
    }
}
