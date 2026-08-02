package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q extends hoi implements Function2 {
    public /* synthetic */ Object r;
    public final /* synthetic */ syl s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(syl sylVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = sylVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        q qVar = new q(this.s, rq3Var);
        qVar.r = obj;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        q qVar = new q(this.s, (rq3) obj2);
        qVar.r = (n7k) obj;
        return qVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        n7k n7kVar = (n7k) this.r;
        udm udmVar = this.s.q;
        if (Intrinsics.c(n7kVar, hag.a)) {
            View view = udmVar.d;
            view.getClass();
            view.getClass();
            view.setVisibility(0);
            udmVar.d.setOnClickListener(new m(0));
        } else {
            if (!Intrinsics.c(n7kVar, ori.a)) {
                zzl.b();
                return null;
            }
            View view2 = udmVar.d;
            view2.getClass();
            view2.getClass();
            view2.setVisibility(8);
        }
        return Unit.a;
    }
}
