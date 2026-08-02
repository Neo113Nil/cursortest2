package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class oqa extends wtc implements ga5 {
    public rqa o;

    @Override // defpackage.wtc
    public final void c1() {
        this.o.j = this;
    }

    @Override // defpackage.wtc
    public final void d1() {
        rqa rqaVar = this.o;
        rqaVar.e();
        rqaVar.c = null;
        rqaVar.a = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oqa) && Intrinsics.c(this.o, ((oqa) obj).o);
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    @Override // defpackage.ga5
    public final void o(yma ymaVar) {
        wj2 wj2Var = ymaVar.a;
        ArrayList arrayList = (ArrayList) this.o.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            lqa lqaVar = (lqa) arrayList.get(i);
            n29 n29Var = lqaVar.n;
            if (n29Var != null) {
                long j = lqaVar.m;
                long j2 = n29Var.t;
                float f = ((int) (j >> 32)) - ((int) (j2 >> 32));
                float f2 = ((int) (j & 4294967295L)) - ((int) (4294967295L & j2));
                ((hpo) wj2Var.b.a).I(f, f2);
                try {
                    ww9.x(ymaVar, n29Var);
                } finally {
                    ((hpo) wj2Var.b.a).I(-f, -f2);
                }
            }
        }
        ymaVar.a();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.o + ')';
    }
}
