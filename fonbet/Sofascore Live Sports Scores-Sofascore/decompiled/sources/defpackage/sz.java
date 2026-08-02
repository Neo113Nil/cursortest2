package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sz extends xka implements Function2 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sz(int i, Object obj, Object obj2) {
        super(2);
        this.i = i;
        this.j = obj;
        this.k = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.i;
        int i2 = 0;
        Object obj3 = this.k;
        Object obj4 = this.j;
        switch (i) {
            case 0:
                int intValue = ((Number) obj).intValue();
                s3h s3hVar = (s3h) obj2;
                tz tzVar = (tz) obj3;
                if (!((t3h) obj4).b.c(s3hVar.f)) {
                    tzVar.o(intValue, s3hVar);
                    tzVar.g.d(Unit.a);
                }
                return Unit.a;
            case 1:
                ((Number) obj2).intValue();
                oyn.c((xtc) obj4, (Function2) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 2:
                ((Number) obj2).intValue();
                m6k.d((vy8) obj4, (e23) obj3, (of3) obj, 1);
                return Unit.a;
            case 3:
                of3 of3Var = (of3) obj;
                int intValue2 = ((Number) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Boolean bool = (Boolean) ((eoh) ((cna) obj4).g).getValue();
                    boolean booleanValue = bool.booleanValue();
                    Function2 function2 = (Function2) obj3;
                    av8Var.g0(bool);
                    boolean h = av8Var.h(booleanValue);
                    if (booleanValue) {
                        function2.invoke(av8Var, 0);
                    } else {
                        if (av8Var.l != 0) {
                            sf3.a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!av8Var.S) {
                            if (h) {
                                ilh ilhVar = av8Var.G;
                                int i3 = ilhVar.g;
                                int i4 = ilhVar.h;
                                pf3 pf3Var = av8Var.M;
                                pf3Var.getClass();
                                pf3Var.d(false);
                                pf3Var.b.k.l0(ytd.c);
                                dy0.E(av8Var.s, i3, i4);
                                av8Var.G.t();
                            } else {
                                av8Var.V();
                            }
                        }
                    }
                    if (av8Var.y && av8Var.G.i == av8Var.z) {
                        av8Var.z = -1;
                        av8Var.y = false;
                    }
                    av8Var.s(false);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 4:
                ((Number) obj2).intValue();
                kda.a((vy8) obj4, (Function1) obj3, (of3) obj, 1);
                return Unit.a;
            case 5:
                of3 of3Var2 = (of3) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    av8 av8Var2 = (av8) of3Var2;
                    if (av8Var2.D()) {
                        av8Var2.W();
                        return Unit.a;
                    }
                }
                ho hoVar = (ho) obj3;
                Iterator it = ((ArrayList) obj4).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    int i5 = i2 + 1;
                    if (i2 < 0) {
                        b.q();
                        throw null;
                    }
                    Pair pair = (Pair) next;
                    Long l = (Long) pair.a;
                    ct8 ct8Var = (ct8) pair.b;
                    if (l != null && l.longValue() == Long.MIN_VALUE) {
                        l = null;
                    }
                    long longValue = l != null ? l.longValue() : (-4611686018427387904L) - i2;
                    if (longValue == Long.MIN_VALUE) {
                        a70.r("Implicit list item ids exhausted.");
                        return null;
                    }
                    ho hoVar2 = hoVar;
                    kda.b(longValue, hoVar2, yqo.y(-163738694, of3Var2, new z2(ct8Var, 7)), of3Var2, 384);
                    hoVar = hoVar2;
                    i2 = i5;
                }
                return Unit.a;
            default:
                uj2 uj2Var = (uj2) obj;
                n29 n29Var = (n29) obj2;
                wdd wddVar = (wdd) obj4;
                wma wmaVar = wddVar.o;
                if (wmaVar.I()) {
                    wddVar.H = uj2Var;
                    wddVar.G = n29Var;
                    uyd snapshotObserver = ((xy) zma.a(wmaVar)).getSnapshotObserver();
                    f4g f4gVar = wdd.N;
                    snapshotObserver.a.i(wddVar, s84.z, (tdd) obj3);
                    wddVar.K = false;
                } else {
                    wddVar.K = true;
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sz(Object obj, Object obj2, int i, int i2) {
        super(2);
        this.i = i2;
        this.j = obj;
        this.k = obj2;
    }
}
