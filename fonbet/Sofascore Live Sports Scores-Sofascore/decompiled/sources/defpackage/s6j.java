package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class s6j implements Serializable {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final gv9 e;

    public s6j(int i, int i2, int i3, int i4, gv9 gv9Var) {
        gv9Var.getClass();
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6j)) {
            return false;
        }
        s6j s6jVar = (s6j) obj;
        return this.a == s6jVar.a && this.b == s6jVar.b && this.c == s6jVar.c && this.d == s6jVar.d && Intrinsics.c(this.e, s6jVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + wv8.a(this.d, wv8.a(this.c, wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "TennisSetResult(firstResult=", ", secondResult=", ", firstTieBreakResult=");
        me4.q(s, this.c, ", secondTieBreakResult=", this.d, ", games=");
        s.append(this.e);
        s.append(")");
        return s.toString();
    }
}
