package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class tdk implements et8 {
    public final /* synthetic */ List a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ wv9 c;
    public final /* synthetic */ boolean d;

    public tdk(List list, boolean z, wv9 wv9Var, boolean z2) {
        this.a = list;
        this.b = z;
        this.c = wv9Var;
        this.d = z2;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        xpa xpaVar = (xpa) obj;
        int intValue = ((Number) obj2).intValue();
        of3 of3Var = (of3) obj3;
        int intValue2 = ((Number) obj4).intValue();
        int i = (intValue2 & 6) == 0 ? (((av8) of3Var).g(xpaVar) ? 4 : 2) | intValue2 : intValue2;
        if ((intValue2 & 48) == 0) {
            i |= ((av8) of3Var).e(intValue) ? 32 : 16;
        }
        boolean z2 = true;
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (i & 147) != 146)) {
            lki lkiVar = (lki) this.a.get(intValue);
            av8Var.d0(1755092598);
            boolean z3 = this.b && lkiVar.a == eli.AI;
            wv9<gli> wv9Var = this.c;
            if (!wv9Var.isEmpty()) {
                Iterator<E> it = wv9Var.iterator();
                while (it.hasNext()) {
                    if (((gli) it.next()).a == lkiVar.a) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            boolean c = Intrinsics.c(Boolean.valueOf(z), Boolean.TRUE);
            if (!wv9Var.isEmpty()) {
                for (gli gliVar : wv9Var) {
                    if (gliVar.a == lkiVar.a && gliVar.b) {
                        break;
                    }
                }
            }
            z2 = false;
            aik.n(lkiVar, c, Intrinsics.c(Boolean.valueOf(z2), Boolean.TRUE), z3, null, this.d, av8Var, 0);
            av8Var.s(false);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
