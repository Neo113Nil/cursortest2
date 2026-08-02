package defpackage;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class du8 extends hoi implements Function2 {
    public /* synthetic */ boolean r;
    public final /* synthetic */ obm s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du8(obm obmVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = obmVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        du8 du8Var = new du8(this.s, rq3Var);
        du8Var.r = ((Boolean) obj).booleanValue();
        return du8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.getClass();
        du8 du8Var = new du8(this.s, (rq3) obj2);
        du8Var.r = bool.booleanValue();
        return du8Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        boolean z = this.r;
        int i = obm.D;
        obm obmVar = this.s;
        if (!obmVar.G()) {
            return Unit.a;
        }
        orm ormVar = obmVar.q;
        ormVar.e.setUserInputEnabled(z);
        BottomSheetBehavior bottomSheetBehavior = obmVar.s;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.L = z;
        }
        obmVar.o(new y5m(obmVar, ormVar, z, null));
        return Unit.a;
    }
}
