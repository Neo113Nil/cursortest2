package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class if9 implements mma {
    public final mbj a;
    public final int b;
    public final gwj c;
    public final Function0 d;

    public if9(mbj mbjVar, int i, gwj gwjVar, Function0 function0) {
        this.a = mbjVar;
        this.b = i;
        this.c = gwjVar;
        this.d = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof if9) {
            if9 if9Var = (if9) obj;
            if (this.a == if9Var.a && this.b == if9Var.b && this.c.equals(if9Var.c) && Intrinsics.c(this.d, if9Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + wv8.a(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    @Override // defpackage.mma
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        long j2;
        if (g1cVar.G(an3.g(j)) < an3.h(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = an3.a(j2, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        qhe J = g1cVar.J(j);
        int min = Math.min(J.a, an3.h(j2));
        return m1c.G0(m1cVar, min, J.b, new yx4(this, m1cVar, J, min, 4));
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ')';
    }
}
