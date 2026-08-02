package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bn7 implements en7 {
    public final List a;
    public final List b;

    public bn7(gv9 gv9Var, gv9 gv9Var2) {
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = gv9Var;
        this.b = gv9Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn7)) {
            return false;
        }
        bn7 bn7Var = (bn7) obj;
        return Intrinsics.c(this.a, bn7Var.a) && Intrinsics.c(this.b, bn7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransfersConfirmed(squad=" + this.a + ", transfers=" + this.b + ")";
    }
}
