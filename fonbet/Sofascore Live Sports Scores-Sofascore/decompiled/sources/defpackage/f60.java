package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f60 extends xka implements ct8 {
    public final /* synthetic */ SnapshotStateList i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ r60 k;
    public final /* synthetic */ tc3 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f60(SnapshotStateList snapshotStateList, Object obj, r60 r60Var, tc3 tc3Var) {
        super(3);
        this.i = snapshotStateList;
        this.j = obj;
        this.k = r60Var;
        this.l = tc3Var;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        r70 r70Var = (r70) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? ((av8) of3Var).g(r70Var) : ((av8) of3Var).i(r70Var) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
            SnapshotStateList snapshotStateList = this.i;
            boolean g = av8Var.g(snapshotStateList);
            Object obj4 = this.j;
            boolean i = g | av8Var.i(obj4);
            r60 r60Var = this.k;
            boolean i2 = i | av8Var.i(r60Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (i2 || O == a99Var) {
                O = new x40(1, snapshotStateList, obj4, r60Var);
                av8Var.n0(O);
            }
            hz8.d(r70Var, (Function1) O, av8Var);
            x0d x0dVar = r60Var.e;
            r70Var.getClass();
            x0dVar.m(obj4, ((s70) r70Var).b);
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = new k60(r70Var);
                av8Var.n0(O2);
            }
            this.l.invoke((k60) O2, obj4, av8Var, 0);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
