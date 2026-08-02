package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class dug extends hoi implements Function2 {
    public /* synthetic */ Object r;
    public final /* synthetic */ csf s;
    public final /* synthetic */ float t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dug(csf csfVar, float f, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = csfVar;
        this.t = f;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        dug dugVar = new dug(this.s, this.t, rq3Var);
        dugVar.r = obj;
        return dugVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((dug) create((oug) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        this.s.a = ((oug) this.r).a(this.t);
        return Unit.a;
    }
}
