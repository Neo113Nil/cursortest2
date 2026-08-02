package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class prm extends hoi implements Function2 {
    public final /* synthetic */ Function1 r;
    public final /* synthetic */ gfm s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prm(Function1 function1, gfm gfmVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = function1;
        this.s = gfmVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new prm(this.r, this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new prm(this.r, this.s, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        this.r.invoke(this.s);
        return Unit.a;
    }
}
