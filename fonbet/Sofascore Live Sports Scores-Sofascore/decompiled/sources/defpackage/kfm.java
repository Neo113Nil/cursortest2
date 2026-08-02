package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kfm extends hoi implements Function2 {
    public final /* synthetic */ qpm r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfm(qpm qpmVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = qpmVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new kfm(this.r, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new kfm(this.r, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        qpm qpmVar = this.r;
        qpmVar.getClass();
        gum gumVar = gum.b;
        String w = qpmVar.w();
        gumVar.getClass();
        qpmVar.m(gum.q(w));
        return Unit.a;
    }
}
