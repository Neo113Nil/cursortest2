package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tok implements mma {
    public final mbj a;
    public final int b;
    public final gwj c;
    public final Function0 d;

    public tok(mbj mbjVar, int i, gwj gwjVar, Function0 function0) {
        this.a = mbjVar;
        this.b = i;
        this.c = gwjVar;
        this.d = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tok) {
            tok tokVar = (tok) obj;
            if (this.a == tokVar.a && this.b == tokVar.b && this.c.equals(tokVar.c) && Intrinsics.c(this.d, tokVar.d)) {
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
        qhe J = g1cVar.J(an3.a(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int min = Math.min(J.b, an3.g(j));
        return m1c.G0(m1cVar, J.a, min, new y51(this, J, min, 14));
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ')';
    }
}
