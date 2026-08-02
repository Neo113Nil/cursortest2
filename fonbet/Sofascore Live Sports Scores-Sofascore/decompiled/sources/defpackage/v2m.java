package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class v2m extends hoi implements Function1 {
    public final /* synthetic */ xyl r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2m(xyl xylVar, rq3 rq3Var) {
        super(1, rq3Var);
        this.r = xylVar;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new v2m(this.r, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new v2m(this.r, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        xyl xylVar = this.r;
        xylVar.c = true;
        Function0 function0 = xylVar.d;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.a;
    }
}
