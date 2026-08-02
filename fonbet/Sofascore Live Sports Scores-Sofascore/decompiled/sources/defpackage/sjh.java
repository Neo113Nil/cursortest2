package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sjh extends xka implements Function2 {
    public final /* synthetic */ int i = 0;
    public final /* synthetic */ Function2 j;
    public final /* synthetic */ long k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjh(int i, long j, ekh ekhVar, Function2 function2) {
        super(2);
        this.l = ekhVar;
        this.k = j;
        this.j = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.i;
        Function2 function2 = this.j;
        Object obj3 = this.l;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                Function2 function22 = this.j;
                waa.a(1, this.k, (of3) obj, (ekh) obj3, function22);
                return Unit.a;
            case 1:
                of3 of3Var = (of3) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    av8 av8Var = (av8) of3Var;
                    if (av8Var.D()) {
                        av8Var.W();
                        return Unit.a;
                    }
                }
                ujh ujhVar = ujh.b;
                ekh ekhVar = (ekh) obj3;
                av8 av8Var2 = (av8) of3Var;
                av8Var2.e0(578571862);
                av8Var2.e0(-548224868);
                if (!(av8Var2.a instanceof pf0)) {
                    z8e.N();
                    throw null;
                }
                av8Var2.b0();
                if (av8Var2.S) {
                    av8Var2.l(ujhVar);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, new s75(this.k), ned.I);
                waa.K(av8Var2, ekhVar, ned.J);
                function2.invoke(av8Var2, 0);
                av8Var2.s(true);
                av8Var2.s(false);
                av8Var2.s(false);
                return Unit.a;
            default:
                ((Number) obj2).intValue();
                long j = this.k;
                kda.b(j, (ho) obj3, (tc3) function2, (of3) obj, 385);
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjh(long j, ho hoVar, tc3 tc3Var, int i) {
        super(2);
        this.k = j;
        this.l = hoVar;
        this.j = tc3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjh(Function2 function2, long j, ekh ekhVar) {
        super(2);
        this.j = function2;
        this.k = j;
        this.l = ekhVar;
    }
}
