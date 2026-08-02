package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xa4 extends hoi implements Function2 {
    public /* synthetic */ Object r;
    public final /* synthetic */ obm s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa4(obm obmVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = obmVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        xa4 xa4Var = new xa4(this.s, rq3Var);
        xa4Var.r = obj;
        return xa4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        xa4 xa4Var = new xa4(this.s, (rq3) obj2);
        xa4Var.r = (n7k) obj;
        return xa4Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        n7k n7kVar = (n7k) this.r;
        orm ormVar = this.s.q;
        if (Intrinsics.c(n7kVar, hag.a)) {
            View view = ormVar.c;
            view.getClass();
            view.getClass();
            view.setVisibility(0);
            ormVar.c.setOnClickListener(new m(0));
        } else {
            if (!Intrinsics.c(n7kVar, ori.a)) {
                zzl.b();
                return null;
            }
            View view2 = ormVar.c;
            view2.getClass();
            view2.getClass();
            view2.setVisibility(8);
        }
        return Unit.a;
    }
}
