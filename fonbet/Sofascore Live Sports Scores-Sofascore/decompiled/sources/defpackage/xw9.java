package defpackage;

import java.util.Currency;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class xw9 {
    public final String a;
    public final double b;
    public final Currency c;

    public xw9(String str, double d, Currency currency) {
        str.getClass();
        currency.getClass();
        this.a = str;
        this.b = d;
        this.c = currency;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw9)) {
            return false;
        }
        xw9 xw9Var = (xw9) obj;
        return Intrinsics.c(this.a, xw9Var.a) && Double.compare(this.b, xw9Var.b) == 0 && Intrinsics.c(this.c, xw9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dmi.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "InAppPurchase(eventName=" + this.a + ", amount=" + this.b + ", currency=" + this.c + ')';
    }
}
