package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class g60 extends xka implements Function2 {
    public final /* synthetic */ axj i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Function1 k;
    public final /* synthetic */ r60 l;
    public final /* synthetic */ SnapshotStateList m;
    public final /* synthetic */ tc3 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g60(axj axjVar, Object obj, Function1 function1, r60 r60Var, SnapshotStateList snapshotStateList, tc3 tc3Var) {
        super(2);
        this.i = axjVar;
        this.j = obj;
        this.k = function1;
        this.l = r60Var;
        this.m = snapshotStateList;
        this.n = tc3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        of3 of3Var = (of3) obj;
        int intValue = ((Number) obj2).intValue();
        int i = 0;
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
            Object O = av8Var.O();
            Function1 function1 = this.k;
            r60 r60Var = this.l;
            Object obj3 = nf3.a;
            if (O == obj3) {
                O = (pp3) function1.invoke(r60Var);
                av8Var.n0(O);
            }
            pp3 pp3Var = (pp3) O;
            axj axjVar = this.i;
            twj f = axjVar.f();
            e1d e1dVar = axjVar.d;
            Object a = f.a();
            Object obj4 = this.j;
            boolean h = av8Var.h(Intrinsics.c(a, obj4));
            Object O2 = av8Var.O();
            if (h || O2 == obj3) {
                O2 = Intrinsics.c(axjVar.f().a(), obj4) ? of6.b : ((pp3) function1.invoke(r60Var)).b;
                av8Var.n0(O2);
            }
            of6 of6Var = (of6) O2;
            Object O3 = av8Var.O();
            if (O3 == obj3) {
                O3 = new l60(Intrinsics.c(obj4, ((eoh) e1dVar).getValue()));
                av8Var.n0(O3);
            }
            l60 l60Var = (l60) O3;
            zo5 zo5Var = pp3Var.a;
            boolean i2 = av8Var.i(pp3Var);
            Object O4 = av8Var.O();
            if (i2 || O4 == obj3) {
                O4 = new e60(pp3Var, i);
                av8Var.n0(O4);
            }
            xtc A = s9a.A(utc.a, (ct8) O4);
            ((eoh) l60Var.a).setValue(Boolean.valueOf(Intrinsics.c(obj4, ((eoh) e1dVar).getValue())));
            xtc z = A.z(l60Var);
            boolean i3 = av8Var.i(obj4);
            Object O5 = av8Var.O();
            if (i3 || O5 == obj3) {
                O5 = new oo(obj4, 6);
                av8Var.n0(O5);
            }
            Function1 function12 = (Function1) O5;
            boolean g = av8Var.g(of6Var);
            Object O6 = av8Var.O();
            if (g || O6 == obj3) {
                O6 = new z2(of6Var, 3);
                av8Var.n0(O6);
            }
            fz8.a(this.i, function12, z, zo5Var, of6Var, (Function2) O6, yqo.H(-143346359, av8Var, new f60(this.m, obj4, r60Var, this.n)), av8Var, 12582912);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
